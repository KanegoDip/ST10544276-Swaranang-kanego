/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class MAIN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        login user = new login();

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Enter cellphone number: ");
        String phone = input.nextLine();

        String registration = user.registerUser(
                username, password, phone);

        System.out.println(registration);

        if (registration.equals("User is successfully registered.")) {

            System.out.println();
            System.out.println("LOGIN");

            System.out.print("Enter username: ");
            String loginUsername = input.nextLine();

            System.out.print("Enter password: ");
            String loginPassword = input.nextLine();

            boolean status = user.loginUser(
                    loginUsername,
                    loginPassword,
                    username,
                    password);

            System.out.println(
             user.returnLoginStatus(
              status,
              firstName,
              lastName));
        }
    }
}
    

