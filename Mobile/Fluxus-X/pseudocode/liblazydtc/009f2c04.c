/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2c04
 */

int ASN1_INTEGER_cmp(ASN1_INTEGER *x,ASN1_INTEGER *y)

{
  uint uVar1;
  int iVar2;
  int iVar3;
  
  uVar1 = x->type & 0x100;
  if (uVar1 == (y->type & 0x100U)) {
    iVar2 = ASN1_STRING_cmp(x,y);
    iVar3 = -iVar2;
    if (uVar1 == 0) {
      iVar3 = iVar2;
    }
  }
  else {
    iVar3 = (uVar1 >> 7 ^ 2) - 1;
  }
  return iVar3;
}

