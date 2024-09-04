package Single_ton_usage_package;

import Util_packages.utils_class;
import lombok.experimental.UtilityClass;

import java.util.Properties;

public class user_data_calling
{
    public String url;
    public String username;
    public String password;
    public String browser;
    public user_data_calling()
    {
//        utils_class datareader=new utils_class();
//        Properties read_data_from_pro = datareader.property_reader();
        Properties usedata = utils_class.property_reader();
        this.url = usedata.getProperty("db_url");
        this.username=usedata.getProperty("db_username");
        this.password=usedata.getProperty("db_password");
        this.browser=usedata.getProperty("db_browser");
    }

}
