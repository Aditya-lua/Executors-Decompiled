
/* WARNING: Heritage AFTER dead removal. Example location: s0x0000000c : 0x00761cd4 */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

long FUN_00761c2c(ulong param_1,long param_2,ulong param_3,uint param_4,long param_5)

{
  ulong uVar1;
  long lVar2;
  char cVar3;
  undefined4 uVar4;
  bool bVar5;
  ulong in_x9;
  long lVar6;
  ulong uVar7;
  byte bVar8;
  ulong uVar9;
  undefined8 uStack0000000000000008;
  
  lVar6 = 0;
  uStack0000000000000008._0_4_ = param_4 - 1;
  do {
    uVar4 = uStack0000000000000008._4_4_;
    bVar8 = *(byte *)(param_5 + in_x9 + 0xb0);
    uStack0000000000000008._4_2_ = CONCAT11("0123456789ABCDEF"[bVar8 >> 4],bVar8);
    uStack0000000000000008._7_1_ = SUB41(uVar4,3);
    uStack0000000000000008._4_3_ =
         CONCAT12("0123456789ABCDEF"[(ulong)bVar8 & 0xf],uStack0000000000000008._4_2_);
    cVar3 = (&UNK_008cd677)[bVar8];
    if (cVar3 == '\x01') {
      uVar7 = 1;
      if (bVar8 != 10) goto code_r0x00761d94;
      bVar8 = 10;
      uVar9 = uVar7;
    }
    else {
      if (cVar3 == '\x03') {
        if ((param_1 <= in_x9) && ((param_4 & 1) != 0)) {
code_r0x00761cf0:
          uStack0000000000000008._4_2_ = CONCAT11(10,bVar8);
          uVar7 = 2;
          bVar8 = 10;
          uVar9 = 2;
          goto code_r0x00761df8;
        }
        if (param_1 < in_x9 + 2) {
          if ((param_4 & 1) == 0) {
            return lVar6;
          }
        }
        else if ((&UNK_008cd677)[*(byte *)(in_x9 + param_5 + 0xb1)] == '\x04')
        goto code_r0x00761cf0;
LAB_00761d70:
        uStack0000000000000008._4_4_ = CONCAT31(uStack0000000000000008._5_3_,0x3d);
        uVar7 = 3;
      }
      else {
        if ((cVar3 != '\x02') || ((param_1 <= in_x9 + 1 && ((param_4 & 1) != 0))))
        goto LAB_00761d70;
        if (param_1 < in_x9 + 3) {
          if ((int)uStack0000000000000008 != 0) {
            if ((int)uStack0000000000000008 == -1) {
              return lVar6;
            }
            goto LAB_00761d70;
          }
        }
        else if (((&UNK_008cd677)[*(byte *)(param_5 + in_x9 + 1 + 0xb0)] == '\x03') &&
                ((&UNK_008cd677)[*(byte *)(in_x9 + param_5 + 0xb2)] == '\x04')) goto LAB_00761d70;
        uVar7 = 1;
      }
      bVar8 = *(byte *)((long)&uStack0000000000000008 + uVar7 + 3);
      uVar9 = 1;
      if (bVar8 != 10) {
code_r0x00761d94:
        uVar9 = 1;
        uVar1 = *(long *)(param_5 + 0x98) + uVar7;
        if (uVar1 == 0x4c) {
          uVar1 = in_x9 + 1;
          if ((uVar1 < param_1) || ((param_4 & 1) == 0)) {
            if (param_1 < in_x9 + 3) {
              if ((int)uStack0000000000000008 == 0) {
code_r0x00761de0:
                uStack0000000000000008._4_4_ = 0xa0d3d;
                bVar8 = 10;
                uVar7 = 3;
                uVar9 = 0;
              }
              else if ((int)uStack0000000000000008 == -1) {
                return lVar6;
              }
            }
            else if (((&UNK_008cd677)[*(byte *)(param_5 + uVar1 + 0xb0)] != '\x03') ||
                    ((&UNK_008cd677)[*(byte *)(uVar1 + param_5 + 0xb1)] != '\x04'))
            goto code_r0x00761de0;
          }
        }
        else if (0x4c < uVar1) goto code_r0x00761de0;
      }
    }
code_r0x00761df8:
    bVar5 = param_3 < uVar7;
    param_3 = param_3 - uVar7;
    if (bVar5) {
      if (lVar6 == 0) {
        return -2;
      }
      return lVar6;
    }
    _memcpy(param_2,(long)&uStack0000000000000008 + 4,uVar7);
    lVar6 = uVar7 + lVar6;
    param_2 = param_2 + uVar7;
    lVar2 = 0;
    if (bVar8 != 10) {
      lVar2 = *(long *)(param_5 + 0x98) + uVar7;
    }
    param_1 = *(ulong *)(param_5 + 0xa8);
    in_x9 = *(long *)(param_5 + 0xa0) + uVar9;
    *(long *)(param_5 + 0x98) = lVar2;
    *(ulong *)(param_5 + 0xa0) = in_x9;
    if (param_1 <= in_x9) {
      return lVar6;
    }
  } while( true );
}

