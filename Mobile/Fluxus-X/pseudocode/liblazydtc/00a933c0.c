/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a933c0
 */

void DES_cfb64_encrypt(uchar *in,uchar *out,long length,DES_key_schedule *schedule,DES_cblock *ivec,
                      int *num,int enc)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  uint local_48;
  undefined4 local_44;
  
  uVar3 = *num;
  if (enc == 0) {
    for (; length != 0; length = length + -1) {
      if (uVar3 == 0) {
        local_48 = *(uint *)*ivec;
        local_44 = *(undefined4 *)(*ivec + 4);
        DES_encrypt1(&local_48,schedule,1);
        (*ivec)[0] = (uchar)local_48;
        (*ivec)[1] = (uchar)(local_48 >> 8);
        (*ivec)[2] = (uchar)(local_48 >> 0x10);
        (*ivec)[3] = (uchar)(local_48 >> 0x18);
        (*ivec)[4] = (uchar)local_44;
        (*ivec)[5] = (uchar)((uint)local_44 >> 8);
        (*ivec)[6] = (uchar)((uint)local_44 >> 0x10);
        (*ivec)[7] = (uchar)((uint)local_44 >> 0x18);
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
        local_48 = *(uint *)*ivec;
        local_44 = *(undefined4 *)(*ivec + 4);
        DES_encrypt1(&local_48,schedule,1);
        (*ivec)[0] = (uchar)local_48;
        (*ivec)[1] = (uchar)(local_48 >> 8);
        (*ivec)[2] = (uchar)(local_48 >> 0x10);
        (*ivec)[3] = (uchar)(local_48 >> 0x18);
        (*ivec)[4] = (uchar)local_44;
        (*ivec)[5] = (uchar)((uint)local_44 >> 8);
        (*ivec)[6] = (uchar)((uint)local_44 >> 0x10);
        (*ivec)[7] = (uchar)((uint)local_44 >> 0x18);
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

