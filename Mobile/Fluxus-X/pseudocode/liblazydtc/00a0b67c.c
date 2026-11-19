/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0b67c
 */

int BN_add_word(BIGNUM *a,ulong w)

{
  bool bVar1;
  int iVar2;
  uint uVar3;
  long lVar4;
  ulong uVar5;
  
  if (w == 0) {
LAB_00a0b758:
    w = 1;
  }
  else {
    iVar2 = BN_is_zero();
    if (iVar2 != 0) {
      iVar2 = BN_set_word(a,w);
      return iVar2;
    }
    if (a->neg == 0) {
      uVar3 = a->top;
      lVar4 = 0;
      do {
        if ((int)uVar3 <= lVar4) {
          if (uVar3 != (uint)lVar4) goto LAB_00a0b758;
          lVar4 = bn_wexpand(a,uVar3 + 1);
          if (lVar4 != 0) {
            a->top = a->top + 1;
            a->d[uVar3] = w;
            goto LAB_00a0b758;
          }
          w = 0;
          break;
        }
        uVar5 = a->d[lVar4];
        bVar1 = CARRY8(uVar5,w);
        uVar5 = uVar5 + w;
        w = 1;
        a->d[lVar4] = uVar5;
        lVar4 = lVar4 + 1;
      } while (bVar1);
    }
    else {
      a->neg = 0;
      uVar3 = BN_sub_word(a,w);
      w = (ulong)uVar3;
      iVar2 = BN_is_zero(a);
      if (iVar2 == 0) {
        a->neg = (uint)(a->neg == 0);
      }
    }
  }
  return (int)w;
}

