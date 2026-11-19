/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a027b8
 */

int BN_clear_bit(BIGNUM *a,int n)

{
  bool bVar1;
  uint uVar2;
  ulong *puVar3;
  int iVar4;
  int iVar5;
  
  if (n < 0) {
    return 0;
  }
  iVar5 = a->top;
  uVar2 = (uint)n >> 6;
  iVar4 = 0;
  if ((int)uVar2 < iVar5) {
    puVar3 = a->d;
    puVar3[uVar2] = puVar3[uVar2] & (1L << (n & 0x3fU) ^ 0xffffffffffffffffU);
    if (0 < iVar5) {
      puVar3 = puVar3 + iVar5;
      iVar4 = iVar5;
      do {
        puVar3 = puVar3 + -1;
        iVar5 = iVar4;
        if (*puVar3 != 0) break;
        iVar5 = iVar4 + -1;
        bVar1 = 0 < iVar4;
        iVar4 = iVar5;
      } while (iVar5 != 0 && bVar1);
      a->top = iVar5;
    }
    if (iVar5 == 0) {
      a->neg = 0;
    }
    iVar4 = 1;
  }
  return iVar4;
}

