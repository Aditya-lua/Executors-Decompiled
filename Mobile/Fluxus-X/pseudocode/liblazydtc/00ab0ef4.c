/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0ef4
 */

int OCSP_ONEREQ_get_ext_by_OBJ(OCSP_ONEREQ *x,ASN1_OBJECT *obj,int lastpos)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_by_OBJ(x->singleRequestExtensions,obj,lastpos);
  return iVar1;
}

