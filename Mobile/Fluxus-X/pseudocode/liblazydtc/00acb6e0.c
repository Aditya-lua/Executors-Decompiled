/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00acb6e0
 */

void RC2_ofb64_encrypt(uchar *in,uchar *out,long length,RC2_KEY *schedule,uchar *ivec,int *num)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  ulong local_70;
  ulong uStack_68;
  byte local_58;
  uchar local_57;
  uchar local_56;
  uchar local_55;
  undefined1 local_54;
  uchar local_53;
  uchar local_52;
  uchar local_51;
  
  uVar2 = *num;
  local_58 = *ivec;
  local_54 = (char)*(uint *)(ivec + 4);
  local_70 = (ulong)*(uint *)ivec;
  uStack_68 = (ulong)*(uint *)(ivec + 4);
  local_57 = ivec[1];
  local_56 = ivec[2];
  local_55 = ivec[3];
  local_53 = ivec[5];
  local_52 = ivec[6];
  local_51 = ivec[7];
  if (length != 0) {
    iVar3 = 0;
    do {
      length = length + -1;
      if (uVar2 == 0) {
        RC2_encrypt(&local_70,schedule);
        iVar3 = iVar3 + 1;
        local_58 = (byte)local_70;
        local_57 = (uchar)(local_70 >> 8);
        local_55 = (uchar)(local_70 >> 0x18);
        local_54 = (char)uStack_68;
        local_53 = (uchar)(uStack_68 >> 8);
        local_56 = (uchar)(local_70 >> 0x10);
        local_52 = (uchar)(uStack_68 >> 0x10);
        local_51 = (uchar)(uStack_68 >> 0x18);
      }
      lVar1 = (long)(int)uVar2;
      uVar2 = uVar2 + 1 & 7;
      *out = (&local_58)[lVar1] ^ *in;
      out = out + 1;
      in = in + 1;
    } while (length != 0);
    if (iVar3 != 0) {
      *ivec = (uchar)local_70;
      ivec[1] = (uchar)(local_70 >> 8);
      ivec[4] = (uchar)uStack_68;
      ivec[2] = (uchar)(local_70 >> 0x10);
      ivec[3] = (uchar)(local_70 >> 0x18);
      ivec[5] = (uchar)(uStack_68 >> 8);
      ivec[6] = (uchar)(uStack_68 >> 0x10);
      ivec[7] = (uchar)(uStack_68 >> 0x18);
    }
  }
  *num = uVar2;
  return;
}

