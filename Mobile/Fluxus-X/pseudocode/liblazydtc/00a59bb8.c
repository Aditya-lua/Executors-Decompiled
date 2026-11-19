/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a59bb8
 */

ulong FUN_00a59bb8(long param_1,undefined1 *param_2,long param_3,int param_4)

{
  byte *pbVar1;
  char *pcVar2;
  char cVar3;
  char cVar4;
  ulong uVar5;
  char *pcVar6;
  char cVar7;
  byte *pbVar8;
  ulong uVar9;
  
  if ((param_1 == 0) || ((*(byte *)(param_1 + 0x5c) >> 1 & 1) == 0)) {
    pcVar6 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
  }
  else {
    pcVar6 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz./";
  }
  if (param_4 < 1) {
    *param_2 = 0;
    return 0;
  }
  uVar5 = 0;
  pbVar8 = (byte *)(param_3 + 1);
  do {
    pbVar1 = pbVar8 + -1;
    pcVar2 = param_2 + uVar5;
    uVar9 = (ulong)*pbVar1 << 0x10;
    if (param_4 < 3) {
      if (param_4 == 2) {
        uVar9 = uVar9 | (ulong)*pbVar8 << 8;
      }
      cVar3 = pcVar6[uVar9 >> 0xc & 0x3f];
      *pcVar2 = pcVar6[uVar9 >> 0x12];
      cVar7 = '=';
      param_2[uVar5 + 1] = cVar3;
      if (param_4 != 1) {
        cVar7 = pcVar6[uVar9 >> 6 & 0x3f];
      }
      param_2[uVar5 + 2] = cVar7;
      param_2[uVar5 + 3] = 0x3d;
      param_2[uVar5 + 4] = 0;
      return (ulong)((int)uVar5 + 4);
    }
    cVar3 = pcVar6[(ulong)pbVar8[1] & 0x3f];
    cVar7 = pcVar6[(ulong)(((uint)*pbVar8 << 8 | (uint)uVar9) >> 0xc) & 0x3f];
    cVar4 = pcVar6[(ulong)(ushort)(CONCAT11(*pbVar8,pbVar8[1]) >> 6) & 0x3f];
    param_4 = param_4 + -3;
    uVar5 = uVar5 + 4;
    pbVar8 = pbVar8 + 3;
    *pcVar2 = pcVar6[*pbVar1 >> 2];
    pcVar2[3] = cVar3;
    pcVar2[1] = cVar7;
    pcVar2[2] = cVar4;
  } while (param_4 != 0);
  param_2[uVar5] = 0;
  return uVar5;
}

