package com.iiq.util;

import java.util.Hashtable;
import javax.naming.Context;
import javax.naming.directory.*;
import javax.naming.NamingException;
public class ADConnect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> env = new Hashtable<>();
		
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://localhost:10389");
		env.put(Context.SECURITY_PRINCIPAL, "uid=admin,ou=system");
		env.put(Context.SECURITY_CREDENTIALS, "secret");
		System.out.println("Trying to connect ldap---");
		DirContext ldapCtx = null;
		try {
			ldapCtx = new InitialDirContext(env);
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			System.out.println("exception--"+e);
		}
		System.out.println("context-"+ldapCtx);
	}

}
