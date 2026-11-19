/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0ef0
 */

int ASN1_STRING_copy(ASN1_STRING *dst,ASN1_STRING *str)

{
  int iVar1;
  int iVar2;
  ulong uVar3;
  
  if (str == (ASN1_STRING *)0x0) {
    iVar2 = 0;
  }
  else {
    dst->type = str->type;
    iVar1 = ASN1_STRING_set(dst,str->data,str->length);
    iVar2 = 0;
    if (iVar1 != 0) {
      iVar2 = 1;
      uVar3 = dst->flags & 0x80;
      dst->flags = uVar3;
      dst->flags = str->flags & 0xffffffffffffff7fU | uVar3;
    }
  }
  return iVar2;
}

