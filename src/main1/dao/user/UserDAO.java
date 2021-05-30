package main1.dao.user;

//import com.google.gson.Gson;

import com.google.gson.Gson;
import javafx.beans.property.SimpleBooleanProperty;
import main1.entity.db.User;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author
 */
public class UserDAO {

    private static UserDAO instance;

    public SimpleBooleanProperty isUpdate = new SimpleBooleanProperty(false);

    private UserDAO() {
        super();
    }

    public static UserDAO getInstance() {
        if (instance == null) instance = new UserDAO();
        return instance;
    }

    public void saveUser(User user) {
        List<User> users = getUsers();
        if (users == null) users = new ArrayList<>();
        user.setStt(users.size() + 1);
        users.add(user);
        String json = new Gson().toJson(users);
        JSONParser jsonParser = new JSONParser();
        Object obj = null;
        try {
            obj = jsonParser.parse(json);
            JSONArray jsonArray = (JSONArray) obj;
            FileOutputStream fos = new FileOutputStream("users.json");
            fos.write(jsonArray.toJSONString().getBytes(StandardCharsets.UTF_8));
            fos.close();
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        } finally {
            isUpdate.set(!isUpdate.get());
        }
    }

    public void editUser(User user) {
        List<User> users = getUsers();
        if (users == null) users = new ArrayList<>();
        users.removeIf(element -> {
            return  element.getStt().equals(user.getStt());
        });
        users.add(user.getStt() - 1,user);
        for(int i =0;i<users.size();i++){
            users.get(i).setStt(i+1);
        }
        String json = new Gson().toJson(users);
        JSONParser jsonParser = new JSONParser();
        Object obj = null;
        try {
            obj = jsonParser.parse(json);
            JSONArray jsonArray = (JSONArray) obj;
            FileOutputStream fos = new FileOutputStream("users.json");
            fos.write(jsonArray.toJSONString().getBytes(StandardCharsets.UTF_8));
            fos.close();
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        } finally {
            isUpdate.set(!isUpdate.get());
        }
    }

    public void deleteUser(Integer stt) {
        List<User> users = getUsers();
        if (users == null) users = new ArrayList<>();
        users.removeIf(element -> {
            return  element.getStt().equals(stt);
        });
        for(int i =0;i<users.size();i++){
            users.get(i).setStt(i+1);
        }
        String json = new Gson().toJson(users);
        JSONParser jsonParser = new JSONParser();
        Object obj = null;
        try {
            obj = jsonParser.parse(json);
            JSONArray jsonArray = (JSONArray) obj;
            FileOutputStream fos = new FileOutputStream("users.json");
            fos.write(jsonArray.toJSONString().getBytes(StandardCharsets.UTF_8));
            fos.close();
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        } finally {
            isUpdate.set(!isUpdate.get());
        }
    }

    public List<User> getUsers() {
        try {
            byte[] bytes = Files.readAllBytes(new File("users.json").toPath());
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(new String(bytes, StandardCharsets.UTF_8));
            JSONArray users = (JSONArray) obj;
            return User.toJsonArray(users.toJSONString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public List<User> searchUsers(String query) {
        List<User> userList = getUsers();
        userList = userList.stream().filter(element -> {
            return element.toString().contains(query);
        }).collect(Collectors.toList());
        return userList;
    }

//    public void delete(String stt) throws SQLException {
//        String sql = "DELETE FROM User WHERE 1";
//        AIMSDB.getConnection().createStatement().executeUpdate(sql);
//    }

    public static void main(String[] args) {
        User user = new User();
        user.setHoTen("Nguyen Bac Nam");
        UserDAO userDAO = UserDAO.getInstance();
        List<User> userList = userDAO.getUsers();
        System.out.println(userList);
        List<User> userList1 = userDAO.searchUsers("Nguyen Bac Nam");
        System.out.println(userList1);
    }
}
