/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0b864
 */

int BN_mul_word(BIGNUM *a,ulong w)

{
  int iVar1;
  ulong uVar2;
  long lVar3;
  
  if (a->top != 0) {
    if (w == 0) {
      BN_zero_ex(a);
    }
    else {
      uVar2 = bn_mul_words(a->d,a->d,a->top,w);
      if (uVar2 != 0) {
        lVar3 = bn_wexpand(a,a->top + 1);
        if (lVar3 == 0) {
          return 0;
        }
        iVar1 = a->top;
        a->top = iVar1 + 1;
        a->d[iVar1] = uVar2;
      }
    }
  }
  return 1;
}

