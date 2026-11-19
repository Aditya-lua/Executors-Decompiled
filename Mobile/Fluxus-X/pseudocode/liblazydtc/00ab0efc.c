/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0efc
 */

int OCSP_ONEREQ_get_ext_by_critical(OCSP_ONEREQ *x,int crit,int lastpos)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_by_critical(x->singleRequestExtensions,crit,lastpos);
  return iVar1;
}

