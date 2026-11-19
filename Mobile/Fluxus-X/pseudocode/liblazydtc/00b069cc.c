/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b069cc
 */

stack_st_OPENSSL_STRING * X509_REQ_get1_email(X509_REQ *x)

{
  stack_st_X509_EXTENSION *x_00;
  void *pvVar1;
  undefined8 uVar2;
  stack_st_OPENSSL_STRING *psVar3;
  
  x_00 = X509_REQ_get_extensions(x);
  pvVar1 = X509V3_get_d2i(x_00,0x55,(int *)0x0,(int *)0x0);
  uVar2 = X509_REQ_get_subject_name(x);
  psVar3 = (stack_st_OPENSSL_STRING *)FUN_00b06724(uVar2,pvVar1);
  OPENSSL_sk_pop_free(pvVar1,GENERAL_NAME_free);
  OPENSSL_sk_pop_free(x_00,X509_EXTENSION_free);
  return psVar3;
}

