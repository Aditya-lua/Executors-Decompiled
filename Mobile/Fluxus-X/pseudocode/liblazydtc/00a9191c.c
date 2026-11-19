/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9191c
 */

void CAST_ofb64_encrypt(uchar *in,uchar *out,long length,CAST_KEY *schedule,uchar *ivec,int *num)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  uint local_68;
  uint uStack_64;
  byte local_58 [4];
  byte local_54;
  byte local_53;
  byte local_52;
  byte local_51;
  
  uVar2 = *num;
  local_58[0] = *ivec;
  local_58[1] = ivec[1];
  local_68 = (uint)*ivec << 0x18 | (uint)ivec[1] << 0x10 | (uint)ivec[2] << 8 | (uint)ivec[3];
  uStack_64 = (uint)ivec[4] << 0x18 | (uint)ivec[5] << 0x10 | (uint)ivec[6] << 8 | (uint)ivec[7];
  local_58[2] = ivec[2];
  local_58[3] = ivec[3];
  local_54 = ivec[4];
  local_53 = ivec[5];
  local_52 = ivec[6];
  local_51 = ivec[7];
  if (length != 0) {
    iVar3 = 0;
    do {
      length = length + -1;
      if (uVar2 == 0) {
        CAST_encrypt(&local_68,schedule);
        iVar3 = iVar3 + 1;
        local_58[0] = (byte)(local_68 >> 0x18);
        local_58[1] = (byte)(local_68 >> 0x10);
        local_58[3] = (byte)local_68;
        local_54 = (byte)(uStack_64 >> 0x18);
        local_53 = (byte)(uStack_64 >> 0x10);
        local_58[2] = (byte)(local_68 >> 8);
        local_52 = (byte)(uStack_64 >> 8);
        local_51 = (byte)uStack_64;
      }
      lVar1 = (long)(int)uVar2;
      uVar2 = uVar2 + 1 & 7;
      *out = local_58[lVar1] ^ *in;
      out = out + 1;
      in = in + 1;
    } while (length != 0);
    if (iVar3 != 0) {
      *ivec = (uchar)(local_68 >> 0x18);
      ivec[3] = (uchar)local_68;
      ivec[1] = (uchar)(local_68 >> 0x10);
      ivec[2] = (uchar)(local_68 >> 8);
      ivec[4] = (uchar)(uStack_64 >> 0x18);
      ivec[5] = (uchar)(uStack_64 >> 0x10);
      ivec[6] = (uchar)(uStack_64 >> 8);
      ivec[7] = (uchar)uStack_64;
    }
  }
  *num = uVar2;
  return;
}

