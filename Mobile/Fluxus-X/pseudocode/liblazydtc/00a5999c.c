/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5999c
 */

void EVP_ENCODE_CTX_new(void)

{
  CRYPTO_zalloc(0x60,"crypto/evp/encode.c",0x81);
  return;
}

