/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab0e94
 */

int OCSP_REQUEST_get_ext_by_OBJ(OCSP_REQUEST *x,ASN1_OBJECT *obj,int lastpos)

{
  int iVar1;
  
  iVar1 = X509v3_get_ext_by_OBJ((stack_st_X509_EXTENSION *)x[1].optionalSignature,obj,lastpos);
  return iVar1;
}

