/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a13c
 */

int X509_REVOKED_get_ext_by_OBJ(X509_REVOKED *x,ASN1_OBJECT *obj,int lastpos)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_by_OBJ(*(stack_st_X509_EXTENSION **)&x->reason,obj,lastpos);
  return iVar1;
}

