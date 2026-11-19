/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0f5c
 */

int OCSP_BASICRESP_get_ext_by_critical(OCSP_BASICRESP *x,int crit,int lastpos)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_by_critical
                    ((stack_st_X509_EXTENSION *)x[1].signatureAlgorithm,crit,lastpos);
  return iVar1;
}

