/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a93c8c
 */

void DES_ofb64_encrypt(uchar *in,uchar *out,long length,DES_key_schedule *schedule,DES_cblock *ivec,
                      int *num)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  uint local_68;
  undefined4 uStack_64;
  byte local_58;
  uchar local_57;
  uchar local_56;
  uchar local_55;
  uchar local_54;
  uchar local_53;
  uchar local_52;
  uchar local_51;
  
  local_68 = *(uint *)*ivec;
  uStack_64 = *(undefined4 *)(*ivec + 4);
  uVar2 = *num;
  local_58 = (*ivec)[0];
  local_54 = (*ivec)[4];
  local_57 = (*ivec)[1];
  local_56 = (*ivec)[2];
  local_55 = (*ivec)[3];
  local_53 = (*ivec)[5];
  local_52 = (*ivec)[6];
  local_51 = (*ivec)[7];
  if (length != 0) {
    iVar3 = 0;
    do {
      length = length + -1;
      if (uVar2 == 0) {
        DES_encrypt1(&local_68,schedule,1);
        iVar3 = iVar3 + 1;
        local_58 = (byte)local_68;
        local_57 = (uchar)(local_68 >> 8);
        local_55 = (uchar)(local_68 >> 0x18);
        local_54 = (uchar)uStack_64;
        local_53 = (uchar)((uint)uStack_64 >> 8);
        local_56 = (uchar)(local_68 >> 0x10);
        local_52 = (uchar)((uint)uStack_64 >> 0x10);
        local_51 = (uchar)((uint)uStack_64 >> 0x18);
      }
      lVar1 = (long)(int)uVar2;
      uVar2 = uVar2 + 1 & 7;
      *out = (&local_58)[lVar1] ^ *in;
      out = out + 1;
      in = in + 1;
    } while (length != 0);
    if (iVar3 != 0) {
      (*ivec)[0] = (uchar)local_68;
      (*ivec)[1] = (uchar)(local_68 >> 8);
      (*ivec)[4] = (uchar)uStack_64;
      (*ivec)[2] = (uchar)(local_68 >> 0x10);
      (*ivec)[3] = (uchar)(local_68 >> 0x18);
      (*ivec)[5] = (uchar)((uint)uStack_64 >> 8);
      (*ivec)[6] = (uchar)((uint)uStack_64 >> 0x10);
      (*ivec)[7] = (uchar)((uint)uStack_64 >> 0x18);
    }
  }
  *num = uVar2;
  return;
}

