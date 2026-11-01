
/* WARNING: Heritage AFTER dead removal. Example location: s0x0000000c : 0x00761cd4 */
/* WARNING: Restarted to delay deadcode elimination for space: stack */

long FUN_00761cd8(ulong param_1)

{
  ulong uVar1;
  long lVar2;
  byte bVar3;
  char cVar4;
  undefined4 uVar5;
  bool bVar6;
  ulong in_x9;
  long unaff_x19;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  ulong unaff_x24;
  long unaff_x25;
  long unaff_x26;
  uint unaff_w27;
  long unaff_x28;
  undefined8 uStack0000000000000008;
  
joined_r0x00761cdc:
  do {
    if (unaff_w27 != 10) {
      uVar1 = *(long *)(unaff_x20 + 0x98) + unaff_x24;
      if (uVar1 == 0x4c) {
        uVar1 = in_x9 + unaff_x28;
        if ((uVar1 < param_1) || ((unaff_x21 & 1) == 0)) {
          if (param_1 < uVar1 + 2) {
            if ((int)uStack0000000000000008 == 0) {
LAB_00761de0:
              unaff_x28 = 0;
              uStack0000000000000008._4_4_ = 0xa0d3d;
              unaff_w27 = 10;
              unaff_x24 = 3;
            }
            else if ((int)uStack0000000000000008 == -1) {
              return unaff_x19;
            }
          }
          else if ((*(char *)(unaff_x25 + (ulong)*(byte *)(unaff_x20 + uVar1 + 0xb0)) != '\x03') ||
                  (*(char *)(unaff_x25 + (ulong)*(byte *)(uVar1 + unaff_x20 + 0xb1)) != '\x04'))
          goto LAB_00761de0;
        }
      }
      else if (0x4c < uVar1) goto LAB_00761de0;
    }
    while( true ) {
      bVar6 = unaff_x22 < unaff_x24;
      unaff_x22 = unaff_x22 - unaff_x24;
      if (bVar6) {
        if (unaff_x19 == 0) {
          return -2;
        }
        return unaff_x19;
      }
      _memcpy(unaff_x23,(long)&uStack0000000000000008 + 4,unaff_x24);
      uVar5 = uStack0000000000000008._4_4_;
      unaff_x19 = unaff_x24 + unaff_x19;
      unaff_x23 = unaff_x23 + unaff_x24;
      lVar2 = 0;
      if (unaff_w27 != 10) {
        lVar2 = *(long *)(unaff_x20 + 0x98) + unaff_x24;
      }
      param_1 = *(ulong *)(unaff_x20 + 0xa8);
      in_x9 = *(long *)(unaff_x20 + 0xa0) + unaff_x28;
      *(long *)(unaff_x20 + 0x98) = lVar2;
      *(ulong *)(unaff_x20 + 0xa0) = in_x9;
      if (param_1 <= in_x9) {
        return unaff_x19;
      }
      bVar3 = *(byte *)(unaff_x20 + in_x9 + 0xb0);
      uStack0000000000000008._4_2_ =
           CONCAT11(*(undefined1 *)(unaff_x26 + (ulong)(bVar3 >> 4)),bVar3);
      uStack0000000000000008._7_1_ = SUB41(uVar5,3);
      uStack0000000000000008._4_3_ =
           CONCAT12(*(undefined1 *)(unaff_x26 + ((ulong)bVar3 & 0xf)),uStack0000000000000008._4_2_);
      cVar4 = *(char *)(unaff_x25 + (ulong)bVar3);
      if (cVar4 == '\x01') {
        unaff_w27 = uStack0000000000000008._4_3_ & 0xff;
        unaff_x24 = 1;
        unaff_x28 = 1;
        goto joined_r0x00761cdc;
      }
      if (cVar4 != '\x03') break;
      if ((in_x9 < param_1) || ((unaff_x21 & 1) == 0)) {
        if (param_1 < in_x9 + 2) {
          if ((unaff_x21 & 1) == 0) {
            return unaff_x19;
          }
          goto code_r0x00761d70;
        }
        if (*(char *)(unaff_x25 + (ulong)*(byte *)(in_x9 + unaff_x20 + 0xb1)) != '\x04')
        goto code_r0x00761d70;
      }
      uStack0000000000000008._4_2_ = CONCAT11(10,bVar3);
      unaff_x24 = 2;
      unaff_x28 = 2;
      unaff_w27 = 10;
    }
    if ((cVar4 == '\x02') && ((in_x9 + 1 < param_1 || ((unaff_x21 & 1) == 0)))) {
      if (param_1 < in_x9 + 3) {
        if ((int)uStack0000000000000008 == 0) {
code_r0x00761d54:
          unaff_x24 = 1;
          goto code_r0x00761d7c;
        }
        if ((int)uStack0000000000000008 == -1) {
          return unaff_x19;
        }
      }
      else if ((*(char *)(unaff_x25 + (ulong)*(byte *)(unaff_x20 + in_x9 + 1 + 0xb0)) != '\x03') ||
              (*(char *)(unaff_x25 + (ulong)*(byte *)(in_x9 + unaff_x20 + 0xb2)) != '\x04'))
      goto code_r0x00761d54;
    }
code_r0x00761d70:
    uStack0000000000000008._4_4_ = CONCAT31(uStack0000000000000008._5_3_,0x3d);
    unaff_x24 = 3;
code_r0x00761d7c:
    unaff_x28 = 1;
    unaff_w27 = (uint)*(byte *)((long)&uStack0000000000000008 + unaff_x24 + 3);
  } while( true );
}

