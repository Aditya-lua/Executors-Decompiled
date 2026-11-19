/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a13820
 */

long d2i_SCT_LIST(undefined8 param_1,long *param_2,long param_3)

{
  ASN1_OCTET_STRING *pAVar1;
  long lVar2;
  uchar *local_38;
  ASN1_OCTET_STRING *local_28;
  
  local_28 = (ASN1_STRING *)0x0;
  local_38 = (uchar *)*param_2;
  pAVar1 = d2i_ASN1_OCTET_STRING(&local_28,&local_38,param_3);
  if (pAVar1 == (ASN1_OCTET_STRING *)0x0) {
    lVar2 = 0;
  }
  else {
    local_38 = local_28->data;
    lVar2 = o2i_SCT_LIST(param_1,&local_38,(long)local_28->length);
    if (lVar2 != 0) {
      *param_2 = *param_2 + param_3;
    }
    ASN1_OCTET_STRING_free(local_28);
  }
  return lVar2;
}

