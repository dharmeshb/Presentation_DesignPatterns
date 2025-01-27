package com.demo.mvp.web.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("quote.rpc")
public interface GreetingService extends RemoteService {
	String getQuote() throws IllegalArgumentException;
}
