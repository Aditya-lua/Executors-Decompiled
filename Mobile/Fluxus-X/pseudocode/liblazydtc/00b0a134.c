/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a134
 */

int X509_REVOKED_get_ext_by_NID(X509_REVOKED *x,int nid,int lastpos)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_by_NID(*(stack_st_X509_EXTENSION **)&x->reason,nid,lastpos);
  return iVar1;
}

