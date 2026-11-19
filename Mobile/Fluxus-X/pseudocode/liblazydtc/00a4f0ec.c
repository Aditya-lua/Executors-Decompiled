/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a4f0ec
 */

long OSSL_DECODER_CTX_new(void)

{
  long lVar1;
  
  lVar1 = CRYPTO_zalloc(0x68,"crypto/encode_decode/decoder_meth.c",0x28d);
  if (lVar1 == 0) {
    ERR_new();
    ERR_set_debug("crypto/encode_decode/decoder_meth.c",0x28e,"OSSL_DECODER_CTX_new");
    ERR_set_error(0x3c,0xc0100,0);
  }
  return lVar1;
}

