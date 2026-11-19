/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00848088
 */

byte * FUN_00848088(undefined8 param_1,byte *param_2,byte *param_3,byte *param_4,long param_5)

{
  byte bVar1;
  byte *pbVar2;
  ushort uVar3;
  
  if (param_2 == param_3) {
                    /* WARNING: Subroutine does not return */
    FUN_008450a0();
  }
  bVar1 = *param_2;
  if (bVar1 < 0x62) {
    if (bVar1 < 0x53) {
      if (bVar1 == 0) {
        if ((*param_4 & 1) == 0) {
          pbVar2 = param_4 + 1;
          *param_4 = 2;
        }
        else {
          pbVar2 = *(byte **)(param_4 + 0x10);
          param_4[8] = 1;
          param_4[9] = 0;
          param_4[10] = 0;
          param_4[0xb] = 0;
          param_4[0xc] = 0;
          param_4[0xd] = 0;
          param_4[0xe] = 0;
          param_4[0xf] = 0;
        }
        pbVar2[0] = 0;
        pbVar2[1] = 0;
        goto LAB_008481e4;
      }
      if (bVar1 != 0x44) {
LAB_008481a8:
        pbVar2 = (byte *)FUN_008453c8();
        return pbVar2;
      }
      uVar3 = *(ushort *)(param_5 + 0xa2) | 0x40;
    }
    else {
      if (bVar1 != 0x53) {
        if (bVar1 != 0x57) goto LAB_008481a8;
        *(ushort *)(param_5 + 0xa2) = *(ushort *)(param_5 + 0xa2) | 0x60;
        FUN_0084935c(param_5,0x5f);
        goto LAB_008481e4;
      }
      uVar3 = *(ushort *)(param_5 + 0xa2) | 1;
    }
    *(ushort *)(param_5 + 0xa2) = uVar3;
  }
  else {
    if (bVar1 < 0x73) {
      if (bVar1 == 0x62) {
        if ((*param_4 & 1) == 0) {
          pbVar2 = param_4 + 1;
          *param_4 = 2;
        }
        else {
          pbVar2 = *(byte **)(param_4 + 0x10);
          param_4[8] = 1;
          param_4[9] = 0;
          param_4[10] = 0;
          param_4[0xb] = 0;
          param_4[0xc] = 0;
          param_4[0xd] = 0;
          param_4[0xe] = 0;
          param_4[0xf] = 0;
        }
        pbVar2[0] = 8;
        pbVar2[1] = 0;
        goto LAB_008481e4;
      }
      if (bVar1 != 100) goto LAB_008481a8;
      uVar3 = *(ushort *)(param_5 + 0xa0) | 0x40;
    }
    else {
      if (bVar1 != 0x73) {
        if (bVar1 != 0x77) goto LAB_008481a8;
        *(ushort *)(param_5 + 0xa0) = *(ushort *)(param_5 + 0xa0) | 0x60;
        FUN_0084612c(param_5,0x5f);
        goto LAB_008481e4;
      }
      uVar3 = *(ushort *)(param_5 + 0xa0) | 1;
    }
    *(ushort *)(param_5 + 0xa0) = uVar3;
  }
LAB_008481e4:
  return param_2 + 1;
}

