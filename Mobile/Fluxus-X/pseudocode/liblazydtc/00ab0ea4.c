/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0ea4
 */

X509_EXTENSION * OCSP_REQUEST_get_ext(OCSP_REQUEST *x,int loc)

{
  X509_EXTENSION *pXVar1;
  
  pXVar1 = X509v3_get_ext((stack_st_X509_EXTENSION *)x[1].optionalSignature,loc);
  return pXVar1;
}

