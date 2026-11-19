/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0fbc
 */

int OCSP_SINGLERESP_get_ext_by_critical(OCSP_SINGLERESP *x,int crit,int lastpos)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_by_critical(x->singleExtensions,crit,lastpos);
  return iVar1;
}

