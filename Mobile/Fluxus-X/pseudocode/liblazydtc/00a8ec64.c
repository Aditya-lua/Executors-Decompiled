/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8ec64
 */

void Camellia_cbc_encrypt(uchar *in,uchar *out,size_t length,CAMELLIA_KEY *key,uchar *ivec,int enc)

{
  if (enc == 0) {
    CRYPTO_cbc128_decrypt();
    return;
  }
  CRYPTO_cbc128_encrypt();
  return;
}

