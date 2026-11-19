/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a028dc
 */

int BN_mask_bits(BIGNUM *a,int n)

{
  long lVar1;
  uint uVar2;
  
  if (n < 0) {
    return 0;
  }
  uVar2 = (uint)n >> 6;
  if (a->top <= (int)uVar2) {
    return 0;
  }
  if ((n & 0x3fU) == 0) {
    a->top = uVar2;
    if (uVar2 == 0) goto LAB_00a02964;
  }
  else {
    a->top = uVar2 + 1;
    a->d[uVar2] = a->d[uVar2] & (-1L << (n & 0x3fU) ^ 0xffffffffffffffffU);
    uVar2 = uVar2 + 1;
  }
  lVar1 = (long)(int)uVar2;
  do {
    if (a->d[lVar1 + -1] != 0) break;
    lVar1 = lVar1 + -1;
  } while (1 < (int)lVar1 + 1);
  a->top = (int)lVar1;
  if ((int)lVar1 != 0) {
    return 1;
  }
LAB_00a02964:
  a->neg = 0;
  return 1;
}

