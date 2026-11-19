/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01e2c
 */

int BN_set_word(BIGNUM *a,ulong w)

{
  int iVar1;
  BIGNUM *pBVar2;
  
  if ((0 < a->dmax) || (pBVar2 = bn_expand2(a,1), iVar1 = 0, pBVar2 != (BIGNUM *)0x0)) {
    iVar1 = 1;
    a->neg = 0;
    *a->d = w;
    a->top = (uint)(w != 0);
  }
  return iVar1;
}

