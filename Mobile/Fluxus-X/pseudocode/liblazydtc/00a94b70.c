/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a94b70
 */

void DES_ecb3_encrypt(const_DES_cblock *input,DES_cblock *output,DES_key_schedule *ks1,
                     DES_key_schedule *ks2,DES_key_schedule *ks3,int enc)

{
  uint local_18;
  undefined4 uStack_14;
  
  local_18 = *(uint *)*input;
  uStack_14 = *(undefined4 *)(*input + 4);
  if (enc == 0) {
    DES_decrypt3(&local_18,ks1,ks2,ks3);
  }
  else {
    DES_encrypt3(&local_18,ks1,ks2,ks3);
  }
  (*output)[0] = (uchar)local_18;
  (*output)[1] = (uchar)(local_18 >> 8);
  (*output)[4] = (uchar)uStack_14;
  (*output)[2] = (uchar)(local_18 >> 0x10);
  (*output)[3] = (uchar)(local_18 >> 0x18);
  (*output)[5] = (uchar)((uint)uStack_14 >> 8);
  (*output)[6] = (uchar)((uint)uStack_14 >> 0x10);
  (*output)[7] = (uchar)((uint)uStack_14 >> 0x18);
  return;
}

