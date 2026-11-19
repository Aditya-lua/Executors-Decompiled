/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009efafc
 */

void ASN1_TYPE_set(ASN1_TYPE *a,int type,void *value)

{
  ASN1_BOOLEAN AVar1;
  ASN1_TYPE *local_28;
  
  if (((a->type | 4U) != 5) && ((a->value).ptr != (char *)0x0)) {
    local_28 = a;
    ossl_asn1_primitive_free(&local_28,0,0);
    a = local_28;
  }
  a->type = type;
  if (type == 1) {
    AVar1 = 0;
    if (value != (void *)0x0) {
      AVar1 = 0xff;
    }
    (a->value).boolean = AVar1;
  }
  else {
    (a->value).ptr = value;
  }
  return;
}

