
package co.edu.unicolombo.s3.poo.inventory.library.Service.Interfaces.Queries.Client;

// import co.edu.unicolombo.s3.poo.inventory.library.Domain.Models.Client;
import co.edu.unicolombo.s3.poo.inventory.library.Infraestructure.Persistences.Entities.ClientEntity;

import java.util.List;

/**
 *
 * @author Jean
 */
public interface IGetListClientQueries {
    
    public List<ClientEntity> getListClients() throws Exception;
}
