
package co.edu.unicolombo.s3.poo.inventory.library.Service.Interfaces.Queries.Client;

import co.edu.unicolombo.s3.poo.inventory.library.Domain.Models.Client;
import java.util.List;

/**
 *
 * @author Jean
 */
public interface IGetListClientsWithLoan {
    
    public List<Client> getclientsWithloan() throws Exception;
}
