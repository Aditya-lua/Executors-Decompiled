/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b066cc
 */

stack_st_OPENSSL_STRING * X509_get1_email(X509 *x)

{
  void *pvVar1;
  X509_NAME *pXVar2;
  stack_st_OPENSSL_STRING *psVar3;
  
  pvVar1 = X509_get_ext_d2i(x,0x55,(int *)0x0,(int *)0x0);
  pXVar2 = X509_get_subject_name(x);
  psVar3 = (stack_st_OPENSSL_STRING *)FUN_00b06724(pXVar2,pvVar1);
  OPENSSL_sk_pop_free(pvVar1,GENERAL_NAME_free);
  return psVar3;
}

