package org.teleal.cling.android.browser;

import android.net.wifi.WifiManager;
import org.fourthline.cling.android.AndroidUpnpServiceConfiguration;
import org.fourthline.cling.android.AndroidUpnpServiceImpl;

/**
 * @author Christian Bauer
 */
public class BrowserUpnpService extends AndroidUpnpServiceImpl {

    @Override
    protected AndroidUpnpServiceConfiguration createConfiguration(WifiManager wifiManager) {
        return new AndroidUpnpServiceConfiguration(wifiManager) {

            /* The only purpose of this class is to show you how you'd
              configure the AndroidUpnpServiceImpl in your application:*/

           @Override
           public int getRegistryMaintenanceIntervalMillis() {
               return 7000;
           }
/*
           @Override
           public ServiceType[] getExclusiveServiceTypes() {
               return new ServiceType[] {
                       new UDAServiceType("SwitchPower")
               };
           }
*/
            

        };
    }

}
