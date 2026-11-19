/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bfefc8
 */

int FUN_00bfefc8(byte *param_1,byte *param_2,ulong param_3,ulong param_4,uint param_5)

{
  long lVar1;
  byte bVar2;
  byte bVar3;
  byte *pbVar4;
  ulong uVar5;
  uint uVar6;
  
  pbVar4 = param_1;
  if ((((2 < (long)param_2 - (long)param_1) && ((param_5 >> 2 & 1) != 0)) && (*param_1 == 0xef)) &&
     (param_1[1] == 0xbb)) {
    lVar1 = 3;
    if (param_1[2] != 0xbf) {
      lVar1 = 0;
    }
    pbVar4 = param_1 + lVar1;
  }
  if ((pbVar4 < param_2) && (param_3 != 0)) {
    uVar5 = 0;
    while( true ) {
      bVar2 = *pbVar4;
      if (param_4 < bVar2) break;
      if ((char)bVar2 < '\0') {
        if (bVar2 < 0xc2) break;
        uVar6 = (uint)bVar2;
        if (bVar2 < 0xe0) {
          if ((((long)param_2 - (long)pbVar4 < 2) || ((pbVar4[1] & 0xc0) != 0x80)) ||
             (param_4 < (pbVar4[1] & 0x3f | (uVar6 & 0x1f) << 6))) break;
          pbVar4 = pbVar4 + 2;
        }
        else if (bVar2 < 0xf0) {
          if ((long)param_2 - (long)pbVar4 < 3) break;
          bVar2 = pbVar4[1];
          if (uVar6 == 0xed) {
            if (-0x61 < (char)bVar2) break;
          }
          else if (uVar6 == 0xe0) {
            if ((bVar2 & 0xe0) != 0xa0) break;
          }
          else if (-0x41 < (char)bVar2) break;
          if (((pbVar4[2] & 0xc0) != 0x80) ||
             (param_4 < ((uVar6 & 0xf) << 0xc | (bVar2 & 0x3f) << 6 | pbVar4[2] & 0x3f))) break;
          pbVar4 = pbVar4 + 3;
        }
        else {
          if (((0xf4 < uVar6) || ((long)param_2 - (long)pbVar4 < 4)) || (param_3 - uVar5 < 2))
          break;
          bVar3 = pbVar4[1];
          if (uVar6 == 0xf4) {
            if (-0x71 < (char)bVar3) break;
          }
          else if (uVar6 == 0xf0) {
            if (0x2f < bVar3 - 0x90) break;
          }
          else if (-0x41 < (char)bVar3) break;
          if (((-0x41 < (char)pbVar4[2]) || ((pbVar4[3] & 0xc0) != 0x80)) ||
             (param_4 < (((ulong)bVar2 & 7) << 0x12 | ((ulong)bVar3 & 0x3f) << 0xc |
                         ((long)(char)pbVar4[2] & 0x3fU) << 6 | (ulong)pbVar4[3] & 0x3f))) break;
          uVar5 = uVar5 + 1;
          pbVar4 = pbVar4 + 4;
        }
      }
      else {
        pbVar4 = pbVar4 + 1;
      }
      if ((param_2 <= pbVar4) || (uVar5 = uVar5 + 1, param_3 <= uVar5)) break;
    }
  }
  return (int)pbVar4 - (int)param_1;
}

