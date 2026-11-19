/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a17c
 */

void * X509_REVOKED_get_ext_d2i(X509_REVOKED *x,int nid,int *crit,int *idx)

{
  void *pvVar1;
  
  pvVar1 = X509V3_get_d2i(*(stack_st_X509_EXTENSION **)&x->reason,nid,crit,idx);
  return pvVar1;
}

