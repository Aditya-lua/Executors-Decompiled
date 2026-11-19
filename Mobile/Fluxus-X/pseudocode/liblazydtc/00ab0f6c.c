/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0f6c
 */

X509_EXTENSION * OCSP_BASICRESP_delete_ext(OCSP_BASICRESP *x,int loc)

{
  X509_EXTENSION *pXVar1;
  
  pXVar1 = X509v3_delete_ext((stack_st_X509_EXTENSION *)x[1].signatureAlgorithm,loc);
  return pXVar1;
}

