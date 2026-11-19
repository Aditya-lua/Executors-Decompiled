/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0b778
 */

int BN_sub_word(BIGNUM *a,ulong w)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  ulong uVar5;
  ulong *puVar6;
  
  if (w != 0) {
    iVar1 = BN_is_zero();
    if (iVar1 != 0) {
      iVar1 = BN_set_word(a,w);
      if (iVar1 == 0) {
        return 0;
      }
      BN_set_negative(a,1);
      return iVar1;
    }
    if (a->neg != 0) {
      a->neg = 0;
      iVar1 = BN_add_word(a,w);
      a->neg = 1;
      return iVar1;
    }
    puVar6 = a->d;
    iVar1 = a->top;
    uVar2 = *puVar6;
    if ((iVar1 == 1) && (uVar2 < w)) {
      *puVar6 = w - uVar2;
      a->neg = 1;
      return 1;
    }
    uVar5 = uVar2 - w;
    lVar3 = 0;
    *puVar6 = uVar5;
    lVar4 = lVar3;
    if (uVar2 < w) {
      do {
        uVar2 = puVar6[lVar4 + 1];
        lVar3 = lVar4 + 1;
        uVar5 = uVar2 - 1;
        puVar6[lVar4 + 1] = uVar5;
        lVar4 = lVar3;
      } while (uVar2 == 0);
    }
    if (uVar5 != 0) {
      return 1;
    }
    if (iVar1 + -1 != (int)lVar3) {
      return 1;
    }
    a->top = (int)lVar3;
  }
  return 1;
}

