/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adde4c
 */

void SEED_ofb128_encrypt(uchar *in,uchar *out,size_t len,SEED_KEY_SCHEDULE *ks,uchar *ivec,int *num)

{
  CRYPTO_ofb128_encrypt();
  return;
}

