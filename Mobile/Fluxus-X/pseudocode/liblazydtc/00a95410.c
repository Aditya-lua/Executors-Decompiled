/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a95410
 */

void DES_ede3_ofb64_encrypt
               (uchar *in,uchar *out,long length,DES_key_schedule *ks1,DES_key_schedule *ks2,
               DES_key_schedule *ks3,DES_cblock *ivec,int *num)

{
  long lVar1;
  undefined4 uVar2;
  uint uVar3;
  uint uVar4;
  int iVar5;
  uint local_70;
  undefined4 uStack_6c;
  byte local_68;
  uchar local_67;
  uchar local_66;
  uchar local_65;
  uchar local_64;
  uchar local_63;
  uchar local_62;
  uchar local_61;
  
  uVar3 = *(uint *)*ivec;
  uVar2 = *(undefined4 *)(*ivec + 4);
  uVar4 = *num;
  local_68 = (*ivec)[0];
  local_64 = (*ivec)[4];
  local_67 = (*ivec)[1];
  local_66 = (*ivec)[2];
  local_65 = (*ivec)[3];
  local_63 = (*ivec)[5];
  local_62 = (*ivec)[6];
  local_61 = (*ivec)[7];
  if (length != 0) {
    iVar5 = 0;
    local_70 = uVar3;
    uStack_6c = uVar2;
    do {
      length = length + -1;
      if (uVar4 == 0) {
        DES_encrypt3(&local_70,ks1,ks2,ks3);
        iVar5 = iVar5 + 1;
        local_67 = (uchar)(local_70 >> 8);
        local_66 = (uchar)(local_70 >> 0x10);
        local_65 = (uchar)(local_70 >> 0x18);
        local_63 = (uchar)((uint)uStack_6c >> 8);
        local_62 = (uchar)((uint)uStack_6c >> 0x10);
        local_68 = (byte)local_70;
        local_64 = (uchar)uStack_6c;
        local_61 = (uchar)((uint)uStack_6c >> 0x18);
        uVar3 = local_70;
        uVar2 = uStack_6c;
      }
      lVar1 = (long)(int)uVar4;
      uVar4 = uVar4 + 1 & 7;
      *out = (&local_68)[lVar1] ^ *in;
      out = out + 1;
      in = in + 1;
    } while (length != 0);
    if (iVar5 != 0) {
      (*ivec)[0] = (uchar)uVar3;
      (*ivec)[4] = (uchar)uVar2;
      (*ivec)[1] = (uchar)(uVar3 >> 8);
      (*ivec)[2] = (uchar)(uVar3 >> 0x10);
      (*ivec)[3] = (uchar)(uVar3 >> 0x18);
      (*ivec)[5] = (uchar)((uint)uVar2 >> 8);
      (*ivec)[6] = (uchar)((uint)uVar2 >> 0x10);
      (*ivec)[7] = (uchar)((uint)uVar2 >> 0x18);
    }
  }
  *num = uVar4;
  return;
}

