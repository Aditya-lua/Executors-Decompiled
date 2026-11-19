/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f13c4
 */

int ASN1_STRING_cmp(ASN1_STRING *a,ASN1_STRING *b)

{
  int iVar1;
  int iVar2;
  
  iVar1 = a->length;
  iVar2 = iVar1 - b->length;
  if ((iVar2 == 0) && ((iVar1 == 0 || (iVar2 = memcmp(a->data,b->data,(long)iVar1), iVar2 == 0)))) {
    iVar2 = a->type - b->type;
  }
  return iVar2;
}

