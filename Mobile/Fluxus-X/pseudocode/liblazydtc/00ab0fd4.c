/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0fd4
 */

void * OCSP_SINGLERESP_get1_ext_d2i(OCSP_SINGLERESP *x,int nid,int *crit,int *idx)

{
  void *pvVar1;
  
  pvVar1 = X509V3_get_d2i(x->singleExtensions,nid,crit,idx);
  return pvVar1;
}

