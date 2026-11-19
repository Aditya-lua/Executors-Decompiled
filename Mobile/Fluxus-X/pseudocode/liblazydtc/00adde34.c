/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adde34
 */

void SEED_cfb128_encrypt(uchar *in,uchar *out,size_t len,SEED_KEY_SCHEDULE *ks,uchar *ivec,int *num,
                        int enc)

{
  CRYPTO_cfb128_encrypt();
  return;
}

