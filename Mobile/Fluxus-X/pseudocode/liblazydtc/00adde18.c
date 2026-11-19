/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adde18
 */

void SEED_cbc_encrypt(uchar *in,uchar *out,size_t len,SEED_KEY_SCHEDULE *ks,uchar *ivec,int enc)

{
  if (enc == 0) {
    CRYPTO_cbc128_decrypt();
    return;
  }
  CRYPTO_cbc128_encrypt();
  return;
}

