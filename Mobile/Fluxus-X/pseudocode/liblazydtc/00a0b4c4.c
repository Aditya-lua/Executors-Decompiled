/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0b4c4
 */

ulong BN_mod_word(BIGNUM *a,ulong w)

{
  bool bVar1;
  int iVar2;
  BIGNUM *a_00;
  ulong uVar3;
  long lVar4;
  ulong uVar5;
  
  if (w != 0) {
    if (w < 0x100000001) {
      if (a->top < 1) {
        return 0;
      }
      uVar3 = 0;
      lVar4 = (long)a->top;
      do {
        uVar5 = a->d[lVar4 + -1];
        iVar2 = 0;
        if (w != 0) {
          iVar2 = (int)((uVar5 >> 0x20 | uVar3 << 0x20) / w);
        }
        uVar3 = uVar5 & 0xffffffff | (ulong)(uint)((int)(uVar5 >> 0x20) - iVar2 * (int)w) << 0x20;
        uVar5 = 0;
        if (w != 0) {
          uVar5 = uVar3 / w;
        }
        uVar3 = uVar3 - uVar5 * w;
        bVar1 = 1 < lVar4;
        lVar4 = lVar4 + -1;
      } while (bVar1);
      return uVar3;
    }
    a_00 = BN_dup(a);
    if (a_00 != (BIGNUM *)0x0) {
      uVar3 = BN_div_word(a_00,w);
      BN_free(a_00);
      return uVar3;
    }
  }
  return 0xffffffffffffffff;
}

