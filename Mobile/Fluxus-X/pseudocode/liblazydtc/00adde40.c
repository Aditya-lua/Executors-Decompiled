/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00adde40
 */

void SEED_ecb_encrypt(uchar *in,uchar *out,SEED_KEY_SCHEDULE *ks,int enc)

{
  if (enc == 0) {
    SEED_decrypt(in,out,ks);
    return;
  }
  SEED_encrypt(in,out,ks);
  return;
}

