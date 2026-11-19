/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0189c
 */

void BN_free(BIGNUM *a)

{
  if (a != (BIGNUM *)0x0) {
    if (((uint)a->flags >> 1 & 1) == 0) {
      if (((uint)a->flags >> 3 & 1) != 0) {
        CRYPTO_secure_clear_free(a->d,(long)a->dmax << 3,"crypto/bn/bn_lib.c",0xcd);
        if ((a->flags & 1) == 0) {
          return;
        }
        goto LAB_00a01904;
      }
      CRYPTO_free(a->d);
    }
    if ((a->flags & 1) != 0) {
LAB_00a01904:
      CRYPTO_free(a);
      return;
    }
  }
  return;
}

