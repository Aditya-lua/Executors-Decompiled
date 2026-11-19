/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bff8e0
 */

int FUN_00bff8e0(byte *param_1,byte *param_2,ulong param_3,ulong param_4,uint param_5)

{
  byte bVar1;
  bool bVar2;
  byte *pbVar3;
  ulong uVar4;
  uint uVar5;
  long lVar6;
  
  pbVar3 = param_1;
  if ((((2 < (long)param_2 - (long)param_1) && ((param_5 >> 2 & 1) != 0)) && (*param_1 == 0xef)) &&
     (param_1[1] == 0xbb)) {
    lVar6 = 3;
    if (param_1[2] != 0xbf) {
      lVar6 = 0;
    }
    pbVar3 = param_1 + lVar6;
  }
  if ((param_2 <= pbVar3) || (param_3 == 0)) {
LAB_00bffacc:
    return (int)pbVar3 - (int)param_1;
  }
  uVar4 = 1;
  do {
    bVar1 = *pbVar3;
    if ((char)bVar1 < '\0') {
      if (bVar1 < 0xc2) goto LAB_00bffacc;
      uVar5 = (uint)bVar1;
      if (bVar1 < 0xe0) {
        if ((((long)param_2 - (long)pbVar3 < 2) || ((pbVar3[1] & 0xc0) != 0x80)) ||
           (param_4 < (pbVar3[1] & 0x3f | (uVar5 & 0x1f) << 6))) goto LAB_00bffacc;
        lVar6 = 2;
      }
      else if (bVar1 < 0xf0) {
        if ((long)param_2 - (long)pbVar3 < 3) goto LAB_00bffacc;
        bVar1 = pbVar3[1];
        if (uVar5 == 0xed) {
          if (-0x61 < (char)bVar1) goto LAB_00bffacc;
        }
        else if (uVar5 == 0xe0) {
          if ((bVar1 & 0xe0) != 0xa0) goto LAB_00bffacc;
        }
        else if (-0x41 < (char)bVar1) goto LAB_00bffacc;
        if (((pbVar3[2] & 0xc0) != 0x80) ||
           (param_4 < ((uVar5 & 0xf) << 0xc | (bVar1 & 0x3f) << 6 | pbVar3[2] & 0x3f)))
        goto LAB_00bffacc;
        lVar6 = 3;
      }
      else {
        if ((0xf4 < bVar1) || ((long)param_2 - (long)pbVar3 < 4)) goto LAB_00bffacc;
        bVar1 = pbVar3[1];
        if (uVar5 == 0xf4) {
          if (-0x71 < (char)bVar1) goto LAB_00bffacc;
        }
        else if (uVar5 == 0xf0) {
          if (0x2f < bVar1 - 0x90) goto LAB_00bffacc;
        }
        else if (-0x41 < (char)bVar1) goto LAB_00bffacc;
        if ((((pbVar3[2] & 0xc0) != 0x80) || ((pbVar3[3] & 0xc0) != 0x80)) ||
           (param_4 < ((uVar5 & 7) << 0x12 | (bVar1 & 0x3f) << 0xc | (pbVar3[2] & 0x3f) << 6 |
                      pbVar3[3] & 0x3f))) goto LAB_00bffacc;
        lVar6 = 4;
      }
    }
    else {
      if (param_4 < bVar1) goto LAB_00bffacc;
      lVar6 = 1;
    }
    pbVar3 = pbVar3 + lVar6;
    if ((param_2 <= pbVar3) || (bVar2 = param_3 <= uVar4, uVar4 = uVar4 + 1, bVar2))
    goto LAB_00bffacc;
  } while( true );
}

