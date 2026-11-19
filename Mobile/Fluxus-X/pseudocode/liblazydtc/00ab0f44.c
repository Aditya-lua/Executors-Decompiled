/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0f44
 */

int OCSP_BASICRESP_get_ext_count(OCSP_BASICRESP *x)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_count((stack_st_X509_EXTENSION *)x[1].signatureAlgorithm);
  return iVar1;
}

