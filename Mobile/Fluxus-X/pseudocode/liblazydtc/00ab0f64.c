/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0f64
 */

X509_EXTENSION * OCSP_BASICRESP_get_ext(OCSP_BASICRESP *x,int loc)

{
  X509_EXTENSION *pXVar1;
  
  pXVar1 = X509v3_get_ext((stack_st_X509_EXTENSION *)x[1].signatureAlgorithm,loc);
  return pXVar1;
}

