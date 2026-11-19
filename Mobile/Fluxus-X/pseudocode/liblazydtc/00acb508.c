/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acb508
 */

void RC2_cfb64_encrypt(uchar *in,uchar *out,long length,RC2_KEY *schedule,uchar *ivec,int *num,
                      int enc)

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  ulong local_60;
  ulong local_58;
  
  uVar3 = *num;
  if (enc == 0) {
    for (; length != 0; length = length + -1) {
      if (uVar3 == 0) {
        local_60 = (ulong)*(uint *)ivec;
        local_58 = (ulong)*(uint *)(ivec + 4);
        RC2_encrypt(&local_60,schedule);
        *ivec = (uchar)local_60;
        ivec[1] = (uchar)(local_60 >> 8);
        ivec[2] = (uchar)(local_60 >> 0x10);
        ivec[3] = (uchar)(local_60 >> 0x18);
        ivec[4] = (uchar)local_58;
        ivec[5] = (uchar)(local_58 >> 8);
        ivec[6] = (uchar)(local_58 >> 0x10);
        ivec[7] = (uchar)(local_58 >> 0x18);
      }
      bVar1 = *in;
      bVar2 = ivec[(int)uVar3];
      ivec[(int)uVar3] = bVar1;
      *out = bVar2 ^ bVar1;
      uVar3 = uVar3 + 1 & 7;
      in = in + 1;
      out = out + 1;
    }
  }
  else {
    for (; length != 0; length = length + -1) {
      if (uVar3 == 0) {
        local_60 = (ulong)*(uint *)ivec;
        local_58 = (ulong)*(uint *)(ivec + 4);
        RC2_encrypt(&local_60,schedule);
        *ivec = (uchar)local_60;
        ivec[1] = (uchar)(local_60 >> 8);
        ivec[2] = (uchar)(local_60 >> 0x10);
        ivec[3] = (uchar)(local_60 >> 0x18);
        ivec[4] = (uchar)local_58;
        ivec[5] = (uchar)(local_58 >> 8);
        ivec[6] = (uchar)(local_58 >> 0x10);
        ivec[7] = (uchar)(local_58 >> 0x18);
      }
      bVar1 = *in;
      bVar2 = ivec[(int)uVar3];
      *out = bVar2 ^ bVar1;
      ivec[(int)uVar3] = bVar2 ^ bVar1;
      uVar3 = uVar3 + 1 & 7;
      in = in + 1;
      out = out + 1;
    }
  }
  *num = uVar3;
  return;
}

