package com.library.testreact;

import com.library.testreact.entities.Book;
import com.library.testreact.entities.Genre;
import com.library.testreact.entities.User;
import com.library.testreact.services.IBookService;
import com.library.testreact.services.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class DbFiller {
    private final IBookService bookService;
    private final IUserService userService;

    @Bean
    public CommandLineRunner fillDb(){
        return args -> {
            Book book = new Book();
            book.setGenre(Genre.Fiction);
            book.setTitle("Lord of the mysteries");
            book.setDescription("In the waves of steam and machinery, who could achieve extraordinary? In the fogs of history and darkness, who was whispering? I woke up from the realm of mysteries and opened my eyes to the world.\n" +
                    "\n" +
                    "Firearms, cannons, battleships, airships, and difference machines. Potions, divination, curses, hanged-man, and sealed artifacts… The lights shone brightly, yet the secrets of the world were never far away. This was a legend of the “Fool”.");
            book.setThumbnailImage("https://static.wikia.nocookie.net/lord-of-the-mystery/images/5/5d/LOMEnglishWebNovelCover.jpg");

            bookService.createBook(book);

            book.setTitle("The Beginning After The End");
            book.setDescription("King Grey has unrivaled strength, wealth, and prestige in a world governed by martial ability. However, solitude lingers closely behind those with great power. Beneath the glamorous exterior of a powerful king lurks the shell of man, devoid of purpose and will. \n" +
                    "\n" +
                    "Reincarnated into a new world filled with magic and monsters, the king has a second chance to relive his life. Correcting the mistakes of his past will not be his only challenge, however. Underneath the peace and prosperity of the new world is an undercurrent threatening to destroy everything he has worked for, questioning his role and reason for being born again. ");
            book.setThumbnailImage("https://m.media-amazon.com/images/I/81eqlOf4owL._AC_UF1000,1000_QL80_.jpg");

            bookService.createBook(book);

            User user = new User();
            user.setUsername("Moha-kun");
            user.setProfilePicture("Heyo");

            userService.createUser(user);
        };
    }
}
