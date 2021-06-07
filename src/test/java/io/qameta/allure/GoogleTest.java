package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Feature("Auth")
@Story("External Auth")
@Microservice("Auth")
public class GoogleTest {

    @Test
    @Manual
    @AllureId("12523")
    @JiraIssue("AE-1")
    @Owner("eroshenkoam")
    @DisplayName("Auth via Google")
    @Tags({@Tag("critical"), @Tag("smoke")})
    public void testAuth() {
        final String username = "asdasd";
        final String password = "asdasd";

        step("Открываем главную страницу");
        step("Авторизуемся как пользователь random-user", () -> {
            step("Вводим логин " + username);
            step("Вводим пароль " + password);
            step("Нажимаем кнопку Войти");
        });
        step("Проверяем что пользователь Mr Random", () -> {
            step("Ожидаем что имя пользователя Mr Random");
        });
    }
}
