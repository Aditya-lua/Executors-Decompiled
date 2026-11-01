
undefined1  [16] FUN_005bed54(ulong *param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  ulong uVar1;
  undefined8 *puVar2;
  byte bVar3;
  code *pcVar4;
  undefined8 extraout_x1;
  undefined8 uVar5;
  ulong in_x9;
  long in_x10;
  ulong uVar6;
  uint uVar7;
  ulong in_x11;
  long in_x12;
  long lVar8;
  long in_x13;
  ulong in_x14;
  ulong in_x15;
  ulong in_x16;
  long *unaff_x19;
  ulong unaff_x20;
  ulong *unaff_x21;
  ulong unaff_x22;
  ulong uVar9;
  undefined1 unaff_w24;
  undefined1 auVar10 [16];
  undefined4 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 in_stack_00000030;
  
  do {
    uVar9 = (in_x16 & 0xaaaaaaaaaaaaaaaa) >> 1 | (in_x16 & 0x5555555555555555) << 1;
    uVar9 = (uVar9 & 0xcccccccccccccccc) >> 2 | (uVar9 & 0x3333333333333333) << 2;
    uVar9 = (uVar9 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar9 & 0xf0f0f0f0f0f0f0f) << 4;
    uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
    uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
    uVar9 = *(ulong *)(in_x12 + (in_x14 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) &
                                in_x9) * -8);
    if (unaff_x20 <= uVar9) {
      func_0x007a2570(uVar9);
LAB_005bf030:
                    /* WARNING: Does not return */
      pcVar4 = (code *)SoftwareBreakpoint(1,0x5bf034);
      (*pcVar4)();
    }
    if (unaff_x19 == *(long **)(param_4 + uVar9 * 0x10)) {
      lVar8 = *unaff_x19;
      *unaff_x19 = lVar8 + -1;
      LORelease();
      if (lVar8 == 1) {
        func_0x005d2ac4();
      }
      uVar5 = 1;
LAB_005bef2c:
      auVar10._8_8_ = uVar5;
      auVar10._0_8_ = uVar9;
      return auVar10;
    }
    in_x16 = in_x16 - 1 & in_x16;
    while (in_x16 == 0) {
      if ((in_x15 & in_x15 << 1 & 0x8080808080808080) != 0) {
        uVar6 = in_x9 & unaff_x22;
        uVar9 = *(ulong *)((long)param_1 + uVar6) & 0x8080808080808080;
        if (uVar9 == 0) {
          lVar8 = 8;
          do {
            uVar6 = uVar6 + lVar8 & in_x9;
            lVar8 = lVar8 + 8;
            uVar9 = *(ulong *)((long)param_1 + uVar6) & 0x8080808080808080;
          } while (uVar9 == 0);
        }
        uVar9 = (uVar9 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar9 >> 7 & 0xff00ff00ff00ff) << 8;
        uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
        uVar9 = uVar6 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) & in_x9;
        bVar3 = *(byte *)((long)param_1 + uVar9);
        uVar7 = (uint)(char)bVar3;
        if ((int)uVar7 < 0) {
          uVar6 = unaff_x21[5];
        }
        else {
          uVar9 = (*param_1 & 0x8080808080808080) >> 7;
          uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
          uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
          uVar9 = (ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3;
          bVar3 = *(byte *)((long)param_1 + uVar9);
          uVar6 = unaff_x21[5];
          uVar7 = (uint)bVar3;
        }
        uVar7 = uVar7 & 1;
        if (uVar6 == 0) {
          if ((uVar7 == 0) && ((bVar3 & 1) == 0)) {
            uVar7 = 0;
          }
          else {
            func_0x007af69c(param_2,1);
            param_1 = (ulong *)unaff_x21[3];
            in_x9 = unaff_x21[4];
            uVar6 = in_x9 & unaff_x22;
            uVar9 = *(ulong *)((long)param_1 + uVar6) & 0x8080808080808080;
            if (uVar9 == 0) {
              lVar8 = 8;
              do {
                uVar6 = uVar6 + lVar8 & in_x9;
                lVar8 = lVar8 + 8;
                uVar9 = *(ulong *)((long)param_1 + uVar6) & 0x8080808080808080;
              } while (uVar9 == 0);
            }
            uVar9 = (uVar9 >> 7 & 0xff00ff00ff00ff00) >> 8 | (uVar9 >> 7 & 0xff00ff00ff00ff) << 8;
            uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
            uVar9 = uVar6 + ((ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3) & in_x9;
            param_3 = extraout_x1;
            if (-1 < *(char *)((long)param_1 + uVar9)) {
              uVar9 = (*param_1 & 0x8080808080808080) >> 7;
              uVar9 = (uVar9 & 0xff00ff00ff00ff00) >> 8 | (uVar9 & 0xff00ff00ff00ff) << 8;
              uVar9 = (uVar9 & 0xffff0000ffff0000) >> 0x10 | (uVar9 & 0xffff0000ffff) << 0x10;
              uVar9 = (ulong)LZCOUNT(uVar9 >> 0x20 | uVar9 << 0x20) >> 3;
            }
          }
        }
        unaff_x21[5] = unaff_x21[5] - (ulong)uVar7;
        *(undefined1 *)((long)param_1 + uVar9) = unaff_w24;
        *(undefined1 *)(unaff_x21[3] + (uVar9 - 8 & in_x9) + 8) = unaff_w24;
        unaff_x21[6] = unaff_x21[6] + 1;
        *(ulong *)(unaff_x21[3] + uVar9 * -8 + -8) = unaff_x20;
        uVar6 = unaff_x21[2];
        uVar9 = *unaff_x21;
        if (unaff_x20 == *unaff_x21) {
          uVar1 = unaff_x21[5] + unaff_x21[6];
          uVar9 = unaff_x20;
          if (uVar1 - uVar6 <= unaff_x20 - uVar6) goto LAB_005beef8;
          if (CARRY8(uVar6,uVar1 - uVar6)) {
            uVar9 = 0;
LAB_005bf00c:
            func_0x007a1f00(uVar9,param_3,&UNK_009f22a0);
            goto LAB_005bf030;
          }
          uVar9 = 0;
          if ((uVar1 >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar1 * 0x10)) goto LAB_005bf00c;
          if (unaff_x20 == 0) {
            in_stack_00000030 = 0;
          }
          else {
            uStack0000000000000028 = unaff_x21[1];
            in_stack_00000030 = 8;
          }
          func_0x0079a108(&uStack0000000000000010,8,uVar1 * 0x10,&uStack0000000000000028);
          if (uStack0000000000000010 == 1) {
            uVar9 = in_stack_00000018;
            param_3 = in_stack_00000020;
            goto LAB_005bf00c;
          }
          *unaff_x21 = uVar1;
          unaff_x21[1] = in_stack_00000018;
          uVar6 = unaff_x21[2];
          if (uVar6 == uVar1) goto LAB_005bef04;
        }
        else {
LAB_005beef8:
          if (uVar6 == uVar9) {
LAB_005bef04:
            func_0x005bd168();
          }
        }
        uVar5 = 0;
        puVar2 = (undefined8 *)(unaff_x21[1] + uVar6 * 0x10);
        *puVar2 = unaff_x19;
        puVar2[1] = unaff_x22;
        unaff_x21[2] = uVar6 + 1;
        uVar9 = unaff_x20;
        goto LAB_005bef2c;
      }
      in_x10 = in_x10 + 8;
      in_x14 = in_x10 + in_x14 & in_x9;
      in_x15 = *(ulong *)((long)param_1 + in_x14);
      in_x16 = (in_x15 ^ in_x11) + in_x13 & (in_x15 ^ in_x11 ^ 0xffffffffffffffff) &
               0x8080808080808080;
    }
  } while( true );
}

