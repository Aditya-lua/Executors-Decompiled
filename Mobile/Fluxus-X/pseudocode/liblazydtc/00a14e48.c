/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a14e48
 */

void DES_ecb_encrypt(const_DES_cblock *input,DES_cblock *output,DES_key_schedule *ks,int enc)

{
  uint local_18;
  undefined4 local_14;
  
  local_18 = *(uint *)*input;
  local_14 = *(undefined4 *)(*input + 4);
  DES_encrypt1(&local_18,ks,enc);
  (*output)[0] = (uchar)local_18;
  (*output)[1] = (uchar)(local_18 >> 8);
  (*output)[2] = (uchar)(local_18 >> 0x10);
  (*output)[3] = (uchar)(local_18 >> 0x18);
  (*output)[4] = (uchar)local_14;
  (*output)[5] = (uchar)((uint)local_14 >> 8);
  (*output)[6] = (uchar)((uint)local_14 >> 0x10);
  (*output)[7] = (uchar)((uint)local_14 >> 0x18);
  return;
}

