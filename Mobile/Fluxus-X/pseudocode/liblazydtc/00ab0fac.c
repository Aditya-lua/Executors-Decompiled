/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0fac
 */

int OCSP_SINGLERESP_get_ext_by_NID(OCSP_SINGLERESP *x,int nid,int lastpos)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_by_NID(x->singleExtensions,nid,lastpos);
  return iVar1;
}

