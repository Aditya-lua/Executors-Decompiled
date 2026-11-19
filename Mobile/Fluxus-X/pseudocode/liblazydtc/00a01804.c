/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01804
 */

void BN_clear_free(BIGNUM *a)

{
  if (a != (BIGNUM *)0x0) {
    if ((a->d != (ulong *)0x0) && (((uint)a->flags >> 1 & 1) == 0)) {
      if (((uint)a->flags >> 3 & 1) != 0) {
        CRYPTO_secure_clear_free(a->d,(long)a->dmax << 3,"crypto/bn/bn_lib.c",0xcd);
        if ((a->flags & 1) == 0) {
          return;
        }
        goto LAB_00a01868;
      }
      CRYPTO_clear_free();
    }
    if ((a->flags & 1) != 0) {
LAB_00a01868:
      OPENSSL_cleanse(a,0x18);
      CRYPTO_free(a);
      return;
    }
  }
  return;
}

