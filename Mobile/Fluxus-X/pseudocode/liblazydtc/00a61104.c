/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a61104
 */

long OSSL_ENCODER_CTX_new(void)

{
  long lVar1;
  
  lVar1 = CRYPTO_zalloc(0x68,"crypto/encode_decode/encoder_meth.c",0x28f);
  if (lVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/encoder_meth.c",0x290,"OSSL_ENCODER_CTX_new");
    ERR_set_error(0x3b,0xc0100,0);
  }
  return lVar1;
}

