/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009efca0
 */

int ASN1_TYPE_cmp(ASN1_TYPE *a,ASN1_TYPE *b)

{
  int iVar1;
  
  iVar1 = -1;
  if ((a != (ASN1_TYPE *)0x0) && (b != (ASN1_TYPE *)0x0)) {
    iVar1 = a->type;
    if (iVar1 != b->type) {
      return -1;
    }
    if (iVar1 != 1) {
      if (iVar1 == 5) {
        return 0;
      }
      if (iVar1 == 6) {
        iVar1 = OBJ_cmp((a->value).object,(b->value).object);
        return iVar1;
      }
      iVar1 = ASN1_STRING_cmp((a->value).asn1_string,(b->value).asn1_string);
      return iVar1;
    }
    iVar1 = (a->value).boolean - (b->value).boolean;
  }
  return iVar1;
}

