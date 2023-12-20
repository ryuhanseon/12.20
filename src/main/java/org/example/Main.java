package org.example;
import java.lang.reflect.Member;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Member> memberList = new ArrayList<>();
        List<Cooking> cookerList = new ArrayList<>();
        int memberId = 1;

        int chefId = 1;
        Member userInfo = null;
        System.out.println("요리 게시판");
        while (true) {
            System.out.println("게시판 입력: ");
            String command = sc.nextLine();
            if (command.equals("종료")) {
                break;
            } else if (command.equals("회원가입")) {
                System.out.println("회원가입을 입력하셨습니다, 회원가입 단계로 이동합니다.");
                String userId;
                String password;
                String passwordConfirm;
                LocalDate now = LocalDate.now();
                while (true) {
                    System.out.println("아이디를 입력해주세요: ");
                    userId = sc.nextLine();
                    boolean isDuplecated = false;

                        for (Member cookRecipe : memberList) {
                            if (userId.equals(cookRecipe.getUserId())) {
                                System.out.println("중복아이디가 존재합니다.");
                                isDuplecated = true;
                            }
                        }
                        if (!isDuplecated) {
                            break;
                        }
                    }
                    while (true) {
                        System.out.println("비밀번호를 입력해주세요: ");
                        password = sc.nextLine();
                        System.out.println("비밀번호를 확인합니다: ");
                        passwordConfirm = sc.nextLine();
                        if (password.equals(passwordConfirm)) {
                            break;
                        }
                        System.out.println("일치하는 비밀번호가 없습니다.");
                    }

                    Member cookRecipe = new Member(memberId, userId, password, now.toString());
                    memberList.add(cookRecipe);
                    System.out.println(userId + "님 회원가입을 환영합니다.");
                    memberId++;
                } else if (command.equals("로그인")) {


                        Member rogin = null;
                        if (userInfo == null) {
                            System.out.println("로그인 상태가 안닙니다.");
                            continue;
                        }
                        System.out.printf("아이디를 입력해주세요: ");
                        String username = sc.nextLine();
                        System.out.printf("비밀번호를 입력해주세요: ");
                        String password = sc.nextLine();

                            for (Member cookRecipe : memberList) {
                                if (username.equals(cookRecipe.getUserId())) {
                                    rogin = cookRecipe;
                                    break;
                                }
                            }
                            if (rogin == null) {
                                System.out.println("로그인이 되지 않습니다.");
                                continue;
                            }

                                if (rogin.getPassword().equals(password) == false) {
                                    System.out.println("일치하는 비밀번호가 없습니다.");
                                    continue;
                                }
                                userInfo = rogin;
                                System.out.println(username + "님 로그인이 완료되었습니다.");


                            } else if (command.equals("로그아웃")) {

                                    if (userInfo == null) {
                                        System.out.println("로그아웃 상태입니다.");
                                        continue;
                                    }

                                } else if (command.equals("레시피 등록")) {

                                    System.out.println("재료: ");
                                    String ingredient = sc.nextLine();
                                    System.out.println("소요시간: ");

                                    int time = Integer.parseInt(sc.nextLine());
                                    System.out.println("난이도: ");
                                    String difficulty = sc.nextLine();
                                    System.out.println("음식종류: ");
                                    String foodtype = sc.nextLine();
                                    System.out.println("조리방법: ");
                                    String instruction = sc.nextLine();
                                    System.out.println("칼로리: ");
                                    String calories = sc.nextLine();
                                    System.out.println("팁: ");
                                    String tips = sc.nextLine();
                                    System.out.println("주의사항: ");
                                    String caution = sc.nextLine();


                                    Cooking cooker = new Cooking(chefId, ingredient, time, difficulty, foodtype, instruction, calories, tips, caution);
                                    cookerList.add(cooker);

                                    chefId++;
                                } else if (command.equals("목록")) {
                                    System.out.println("재료 / 소요시간 / 난이도 / 음식종류 / 조리방법 / 칼로리 / 팁 / 주의사항");
                                    System.out.println("--------------------");

                                        for (Cooking cooking : cookerList) {
                                            System.out.printf("%s, %d, %s, %s, %s, %s, %s, %s\n", cooking.getIngredient(), cooking.getTime(), cooking.getDifficulty(),
                                                    cooking.getFoodtype(), cooking.getInstruction(), cooking.getCalories(), cooking.getTips(), cooking.getCaution());
                                        }


                                            } else if (command.equals("삭제")) {
                                                System.out.println("삭제할 Id를 입력해 주세요: ");
                                                int deleteId = Integer.parseInt(sc.nextLine());
                                                for (int i = 0; i < cookerList.size(); i++) {
                                                    if (deleteId == cookerList.get(i).getTime()) {
                                                        cookerList.remove(i);
                                                        System.out.println(deleteId + "값이 지워집니다.");
                                                    }

                                                }



                                            }



                                    }
                                    sc.close();

                                }
                            }
