/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a084
 */

int X509_CRL_get_ext_by_critical(X509_CRL *x,int crit,int lastpos)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_by_critical((stack_st_X509_EXTENSION *)x->crl_number,crit,lastpos);
  return iVar1;
}

