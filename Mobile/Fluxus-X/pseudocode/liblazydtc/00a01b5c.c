/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01b5c
 */

BIGNUM * BN_dup(BIGNUM *a)

{
  long lVar1;
  uint uVar2;
  BIGNUM *a_00;
  BIGNUM *pBVar3;
  int iVar4;
  int iVar5;
  
  if (a == (BIGNUM *)0x0) {
    return (BIGNUM *)0x0;
  }
  uVar2 = a->flags;
  a_00 = (BIGNUM *)CRYPTO_zalloc(0x18,"crypto/bn/bn_lib.c",0xf7);
  if ((uVar2 >> 3 & 1) == 0) {
    if (a_00 != (BIGNUM *)0x0) {
      iVar4 = 1;
LAB_00a01ba8:
      a_00->flags = iVar4;
      lVar1 = 8;
      if ((a->flags & 4) != 0) {
        lVar1 = 0xc;
      }
      if (a_00 == a) {
        return a;
      }
      iVar4 = *(int *)((long)&a->d + lVar1);
      if ((iVar4 <= a_00->dmax) || (pBVar3 = bn_expand2(a_00,iVar4), pBVar3 != (BIGNUM *)0x0)) {
        iVar5 = a->top;
        if (0 < iVar5) {
          memcpy(a_00->d,a->d,(long)iVar4 << 3);
          iVar5 = a->top;
        }
        iVar4 = a->neg;
        a_00->top = iVar5;
        a_00->neg = iVar4;
        return a_00;
      }
      if (((uint)a_00->flags >> 1 & 1) == 0) {
        if (((uint)a_00->flags >> 3 & 1) == 0) {
          CRYPTO_free(a_00->d);
        }
        else {
          CRYPTO_secure_clear_free(a_00->d,(long)a_00->dmax << 3,"crypto/bn/bn_lib.c",0xcd);
        }
      }
      if ((a_00->flags & 1) == 0) {
        return (BIGNUM *)0x0;
      }
      CRYPTO_free(a_00);
      return (BIGNUM *)0x0;
    }
  }
  else if (a_00 != (BIGNUM *)0x0) {
    iVar4 = 9;
    goto LAB_00a01ba8;
  }
  ERR_new();
  ERR_set_debug("crypto/bn/bn_lib.c",0xf8,"BN_new");
  ERR_set_error(3,0xc0100,0);
  return (BIGNUM *)0x0;
}

