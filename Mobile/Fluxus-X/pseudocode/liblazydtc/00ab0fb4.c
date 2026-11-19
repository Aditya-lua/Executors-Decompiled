/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0fb4
 */

int OCSP_SINGLERESP_get_ext_by_OBJ(OCSP_SINGLERESP *x,ASN1_OBJECT *obj,int lastpos)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_by_OBJ(x->singleExtensions,obj,lastpos);
  return iVar1;
}

