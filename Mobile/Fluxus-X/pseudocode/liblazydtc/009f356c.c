/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f356c
 */

int ASN1_INTEGER_set(ASN1_INTEGER *a,long v)

{
  long lVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  undefined1 auStack_18 [8];
  
  a->type = 2;
  if (v < 0) {
    uVar4 = -v;
    lVar1 = 7;
    do {
      lVar3 = lVar1;
      auStack_18[lVar3] = (char)uVar4;
      uVar4 = uVar4 >> 8;
      lVar1 = lVar3 + -1;
    } while (uVar4 != 0);
    iVar2 = 0x102;
  }
  else {
    lVar1 = 7;
    do {
      lVar3 = lVar1;
      auStack_18[lVar3] = (char)v;
      v = (ulong)v >> 8;
      lVar1 = lVar3 + -1;
    } while (v != 0);
    iVar2 = 2;
  }
  a->type = iVar2;
  iVar2 = ASN1_STRING_set(a,auStack_18 + lVar3,8 - (int)lVar3);
  return iVar2;
}

