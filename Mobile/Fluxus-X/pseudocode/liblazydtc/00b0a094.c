/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a094
 */

X509_EXTENSION * X509_CRL_delete_ext(X509_CRL *x,int loc)

{
  X509_EXTENSION *pXVar1;
  
  pXVar1 = X509v3_delete_ext((stack_st_X509_EXTENSION *)x->crl_number,loc);
  return pXVar1;
}

