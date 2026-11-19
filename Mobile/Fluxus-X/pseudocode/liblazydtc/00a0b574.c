/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0b574
 */

ulong BN_div_word(BIGNUM *a,ulong w)

{
  bool bVar1;
  int iVar2;
  long lVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong d;
  ulong l;
  long lVar9;
  
  if (w == 0) {
    return 0xffffffffffffffff;
  }
  if (a->top == 0) {
    return 0;
  }
  iVar4 = BN_num_bits_word(w);
  uVar8 = (ulong)(0x40U - iVar4);
  iVar4 = BN_lshift(a,a,0x40U - iVar4);
  if (iVar4 == 0) {
    return 0xffffffffffffffff;
  }
  iVar4 = a->top;
  if (iVar4 < 1) {
    uVar5 = 0;
  }
  else {
    puVar7 = a->d;
    uVar5 = 0;
    d = w << (uVar8 & 0x3f);
    lVar3 = (long)iVar4;
    do {
      lVar9 = lVar3 + -1;
      l = puVar7[lVar9];
      uVar6 = bn_div_words(uVar5,l,d);
      puVar7 = a->d;
      uVar5 = l - uVar6 * d;
      puVar7[lVar9] = uVar6;
      bVar1 = 1 < lVar3;
      lVar3 = lVar9;
    } while (bVar1);
    iVar4 = a->top;
    iVar2 = iVar4 + -1;
    if (0 < iVar4) {
      if (a->d[iVar2] != 0) {
        return uVar5 >> (uVar8 & 0x3f);
      }
      a->top = iVar2;
      uVar5 = uVar5 >> (uVar8 & 0x3f);
      goto joined_r0x00a0b64c;
    }
  }
  uVar5 = uVar5 >> (uVar8 & 0x3f);
  iVar2 = iVar4;
joined_r0x00a0b64c:
  if (iVar2 == 0) {
    a->neg = 0;
  }
  return uVar5;
}

