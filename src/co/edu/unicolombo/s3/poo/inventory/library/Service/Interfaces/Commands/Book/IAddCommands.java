package co.edu.unicolombo.s3.poo.inventory.library.Service.Interfaces.Commands.Book;

import co.edu.unicolombo.s3.poo.inventory.library.Infraestructure.Persistences.Entities.BookEntity;

/**
 *
 * @author Jean
 */
public interface IAddCommands {
    
    public void createBook(BookEntity book) throws Exception;

}
