/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009efd14
 */

ASN1_TYPE * ASN1_TYPE_pack_sequence(ASN1_ITEM *param_1,void *param_2,undefined8 *param_3)

{
  ASN1_STRING *a;
  ASN1_TYPE *pAVar1;
  ASN1_TYPE *local_28;
  
  a = ASN1_item_pack(param_2,param_1,(ASN1_OCTET_STRING **)0x0);
  if (a == (ASN1_STRING *)0x0) {
    pAVar1 = (ASN1_TYPE *)0x0;
  }
  else {
    if ((param_3 == (undefined8 *)0x0) ||
       (pAVar1 = (ASN1_TYPE *)*param_3, pAVar1 == (ASN1_TYPE *)0x0)) {
      pAVar1 = ASN1_TYPE_new();
      if (pAVar1 == (ASN1_TYPE *)0x0) {
        ASN1_OCTET_STRING_free(a);
        return (ASN1_TYPE *)0x0;
      }
      if (param_3 != (undefined8 *)0x0) {
        *param_3 = pAVar1;
      }
    }
    local_28 = pAVar1;
    if (((pAVar1->type | 4U) != 5) && ((pAVar1->value).ptr != (char *)0x0)) {
      ossl_asn1_primitive_free(&local_28,0,0);
    }
    local_28->type = 0x10;
    (local_28->value).asn1_string = a;
  }
  return pAVar1;
}

