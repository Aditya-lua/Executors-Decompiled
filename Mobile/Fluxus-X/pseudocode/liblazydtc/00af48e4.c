/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00af48e4
 */

int X509V3_EXT_REQ_add_nconf(CONF *conf,X509V3_CTX *ctx,char *section,X509_REQ *req)

{
  int iVar1;
  stack_st_X509_EXTENSION *local_28;
  
  local_28 = (stack_st_X509_EXTENSION *)0x0;
  iVar1 = X509V3_EXT_add_nconf_sk(conf,ctx,section,&local_28);
  if (((req != (X509_REQ *)0x0) && (iVar1 != 0)) && (local_28 != (stack_st_X509_EXTENSION *)0x0)) {
    iVar1 = X509_REQ_add_extensions(req,local_28);
  }
  OPENSSL_sk_pop_free(local_28,X509_EXTENSION_free);
  return iVar1;
}

