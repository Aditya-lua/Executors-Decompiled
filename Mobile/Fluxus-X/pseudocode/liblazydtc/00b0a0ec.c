/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a0ec
 */

X509_EXTENSION * X509_get_ext(X509 *x,int loc)

{
  X509_EXTENSION *pXVar1;
  
  pXVar1 = X509v3_get_ext((stack_st_X509_EXTENSION *)x->skid,loc);
  return pXVar1;
}

