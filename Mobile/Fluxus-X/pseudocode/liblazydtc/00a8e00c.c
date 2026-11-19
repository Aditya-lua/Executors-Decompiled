/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a8e00c
 */

void BF_cfb64_encrypt(uchar *in,uchar *out,long length,BF_KEY *schedule,uchar *ivec,int *num,int enc
                     )

{
  byte bVar1;
  byte bVar2;
  uint uVar3;
  uint uVar4;
  uint local_48;
  uint local_44;
  
  uVar4 = *num;
  if (enc == 0) {
    for (; length != 0; length = length + -1) {
      if (uVar4 == 0) {
        uVar3 = (*(uint *)ivec & 0xff00ff00) >> 8 | (*(uint *)ivec & 0xff00ff) << 8;
        local_48 = uVar3 >> 0x10 | uVar3 << 0x10;
        uVar3 = (*(uint *)(ivec + 4) & 0xff00ff00) >> 8 | (*(uint *)(ivec + 4) & 0xff00ff) << 8;
        local_44 = uVar3 >> 0x10 | uVar3 << 0x10;
        BF_encrypt(&local_48,schedule);
        *ivec = (uchar)(local_48 >> 0x18);
        ivec[3] = (uchar)local_48;
        ivec[1] = (uchar)(local_48 >> 0x10);
        ivec[2] = (uchar)(local_48 >> 8);
        ivec[4] = (uchar)(local_44 >> 0x18);
        ivec[5] = (uchar)(local_44 >> 0x10);
        ivec[6] = (uchar)(local_44 >> 8);
        ivec[7] = (uchar)local_44;
      }
      bVar1 = *in;
      bVar2 = ivec[(int)uVar4];
      ivec[(int)uVar4] = bVar1;
      *out = bVar2 ^ bVar1;
      uVar4 = uVar4 + 1 & 7;
      in = in + 1;
      out = out + 1;
    }
  }
  else {
    for (; length != 0; length = length + -1) {
      if (uVar4 == 0) {
        uVar3 = (*(uint *)ivec & 0xff00ff00) >> 8 | (*(uint *)ivec & 0xff00ff) << 8;
        local_48 = uVar3 >> 0x10 | uVar3 << 0x10;
        uVar3 = (*(uint *)(ivec + 4) & 0xff00ff00) >> 8 | (*(uint *)(ivec + 4) & 0xff00ff) << 8;
        local_44 = uVar3 >> 0x10 | uVar3 << 0x10;
        BF_encrypt(&local_48,schedule);
        *ivec = (uchar)(local_48 >> 0x18);
        ivec[3] = (uchar)local_48;
        ivec[1] = (uchar)(local_48 >> 0x10);
        ivec[2] = (uchar)(local_48 >> 8);
        ivec[4] = (uchar)(local_44 >> 0x18);
        ivec[5] = (uchar)(local_44 >> 0x10);
        ivec[6] = (uchar)(local_44 >> 8);
        ivec[7] = (uchar)local_44;
      }
      bVar1 = *in;
      bVar2 = ivec[(int)uVar4];
      *out = bVar2 ^ bVar1;
      ivec[(int)uVar4] = bVar2 ^ bVar1;
      uVar4 = uVar4 + 1 & 7;
      in = in + 1;
      out = out + 1;
    }
  }
  *num = uVar4;
  return;
}

