package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FakeApi {
  private ApiClient apiClient;

  public FakeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FakeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
   * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
   * @param testCodeInjectStarSlashQuoteDoubleQuoteEqualEndBackSlashRBackSlashNBackSlashNBackSlashR To test code injection *_/ &#39; \\\&quot; &#x3D;end -- \\\\r\\\\n \\\\n \\\\r (optional)
   * @throws ApiException if fails to make API call
   */
  public void testCodeInjectEndRnNR(String testCodeInjectStarSlashQuoteDoubleQuoteEqualEndBackSlashRBackSlashNBackSlashNBackSlashR) throws ApiException {
    Object localVarPostBody = new Object();
    
    // create path and map variables
    String localVarPath = "/fake".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (testCodeInjectStarSlashQuoteDoubleQuoteEqualEndBackSlashRBackSlashNBackSlashNBackSlashR != null)
      localVarFormParams.put("test code inject */ &#39; &quot; &#x3D;end -- \r\n \n \r", testCodeInjectStarSlashQuoteDoubleQuoteEqualEndBackSlashRBackSlashNBackSlashNBackSlashR);

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded", "*_/ '  =end --       "
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
