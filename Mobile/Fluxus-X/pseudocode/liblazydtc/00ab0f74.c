/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0f74
 */

void * OCSP_BASICRESP_get1_ext_d2i(OCSP_BASICRESP *x,int nid,int *crit,int *idx)

{
  void *pvVar1;
  
  pvVar1 = X509V3_get_d2i((stack_st_X509_EXTENSION *)x[1].signatureAlgorithm,nid,crit,idx);
  return pvVar1;
}

