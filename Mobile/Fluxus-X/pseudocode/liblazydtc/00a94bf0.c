/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a94bf0
 */

void DES_ede3_cfb64_encrypt
               (uchar *in,uchar *out,long length,DES_key_schedule *ks1,DES_key_schedule *ks2,
               DES_key_schedule *ks3,DES_cblock *ivec,int *num,int enc)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  uint local_58;
  undefined4 uStack_54;
  
  uVar3 = *num;
  if (enc == 0) {
    for (; length != 0; length = length + -1) {
      if (uVar3 == 0) {
        local_58 = *(uint *)*ivec;
        uStack_54 = *(undefined4 *)(*ivec + 4);
        DES_encrypt3(&local_58,ks1,ks2,ks3);
        (*ivec)[0] = (uchar)local_58;
        (*ivec)[1] = (uchar)(local_58 >> 8);
        (*ivec)[4] = (uchar)uStack_54;
        (*ivec)[2] = (uchar)(local_58 >> 0x10);
        (*ivec)[3] = (uchar)(local_58 >> 0x18);
        (*ivec)[5] = (uchar)((uint)uStack_54 >> 8);
        (*ivec)[6] = (uchar)((uint)uStack_54 >> 0x10);
        (*ivec)[7] = (uchar)((uint)uStack_54 >> 0x18);
      }
      bVar1 = *in;
      bVar2 = (*ivec)[(int)uVar3];
      (*ivec)[(int)uVar3] = bVar1;
      *out = bVar2 ^ bVar1;
      uVar3 = uVar3 + 1 & 7;
      in = in + 1;
      out = out + 1;
    }
  }
  else {
    for (; length != 0; length = length + -1) {
      if (uVar3 == 0) {
        local_58 = *(uint *)*ivec;
        uStack_54 = *(undefined4 *)(*ivec + 4);
        DES_encrypt3(&local_58,ks1,ks2,ks3);
        (*ivec)[0] = (uchar)local_58;
        (*ivec)[1] = (uchar)(local_58 >> 8);
        (*ivec)[4] = (uchar)uStack_54;
        (*ivec)[2] = (uchar)(local_58 >> 0x10);
        (*ivec)[3] = (uchar)(local_58 >> 0x18);
        (*ivec)[5] = (uchar)((uint)uStack_54 >> 8);
        (*ivec)[6] = (uchar)((uint)uStack_54 >> 0x10);
        (*ivec)[7] = (uchar)((uint)uStack_54 >> 0x18);
      }
      bVar1 = (*ivec)[(int)uVar3] ^ *in;
      *out = bVar1;
      (*ivec)[(int)uVar3] = bVar1;
      uVar3 = uVar3 + 1 & 7;
      in = in + 1;
      out = out + 1;
    }
  }
  *num = uVar3;
  return;
}

