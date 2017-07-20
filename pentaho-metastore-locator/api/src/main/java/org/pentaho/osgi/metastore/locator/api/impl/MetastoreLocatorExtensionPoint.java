package org.pentaho.osgi.metastore.locator.api.impl;

import org.pentaho.di.core.exception.KettleException;
import org.pentaho.di.core.extension.ExtensionPoint;
import org.pentaho.di.core.extension.ExtensionPointInterface;
import org.pentaho.di.core.logging.LogChannelInterface;
import org.pentaho.di.core.osgi.api.MetastoreLocatorOsgi;
import org.pentaho.di.core.osgi.api.NamedClusterServiceOsgi;
import org.pentaho.di.trans.TransMeta;

/**
 * Created by tkafalas on 7/10/2017.
 */

@ExtensionPoint( id = "MetastoreLocatorMetaLoadExtensionPoint", extensionPointId = "TransformationMetaLoaded",
  description = "" )
public class MetastoreLocatorExtensionPoint implements ExtensionPointInterface {
  MetastoreLocatorOsgi metastoreLocatorOsgi;

    public MetastoreLocatorExtensionPoint( MetastoreLocatorOsgi metastoreLocatorOsgi ) {
      this.metastoreLocatorOsgi = metastoreLocatorOsgi;
    }

    @Override public void callExtensionPoint( LogChannelInterface log, Object object ) throws KettleException {
      TransMeta transMeta = (TransMeta) object;
      transMeta.setMetastoreLocatorOsgi( metastoreLocatorOsgi );
    }
}
