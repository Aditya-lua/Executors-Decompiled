/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a01998
 */

long BN_secure_new(void)

{
  long lVar1;
  
  lVar1 = CRYPTO_zalloc(0x18,"crypto/bn/bn_lib.c",0xf7);
  if (lVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/bn/bn_lib.c",0xf8,"BN_new");
    ERR_set_error(3,0xc0100,0);
    return 0;
  }
  *(undefined4 *)(lVar1 + 0x14) = 9;
  return lVar1;
}

