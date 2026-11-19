/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a0192c
 */

/* WARNING: Unknown calling convention -- yet parameter storage is locked */

BIGNUM * BN_new(void)

{
  BIGNUM *pBVar1;
  
  pBVar1 = (BIGNUM *)CRYPTO_zalloc(0x18,"crypto/bn/bn_lib.c",0xf7);
  if (pBVar1 == (BIGNUM *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_lib.c",0xf8,"BN_new");
    ERR_set_error(3,0xc0100,0);
    return (BIGNUM *)0x0;
  }
  pBVar1->flags = 1;
  return pBVar1;
}

