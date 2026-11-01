
void FUN_005e21e8(void)

{
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  bool bVar4;
  byte *pbVar5;
  long lVar6;
  long *plVar7;
  undefined *puVar8;
  long extraout_x8;
  long lVar9;
  byte *pbVar10;
  long unaff_x19;
  long unaff_x20;
  ulong uVar11;
  ulong unaff_x21;
  ulong unaff_x22;
  long unaff_x23;
  long unaff_x25;
  long *unaff_x26;
  undefined1 auVar12 [16];
  undefined8 in_stack_00000008;
  long *in_stack_00000010;
  
  do {
    unaff_x26[2] = unaff_x19 + 1;
    do {
      do {
        unaff_x22 = unaff_x22 + unaff_x23 + 1;
LAB_005e2050:
        uVar11 = unaff_x22 + unaff_x25;
        uVar1 = unaff_x21;
        if (uVar11 <= unaff_x21) {
          uVar1 = uVar11;
        }
        unaff_x23 = uVar1 - unaff_x22;
        if (uVar1 < unaff_x22) {
code_r0x005e2368:
          func_0x007a297c();
code_r0x005e2384:
          func_0x007a297c();
          goto code_r0x005e23a0;
        }
        if ((unaff_x22 != 0 && unaff_x22 < unaff_x21) && (*(char *)(unaff_x20 + unaff_x22) < -0x40))
        goto code_r0x005e2368;
        if ((uVar11 < unaff_x21 && uVar1 != 0) && (*(char *)(unaff_x20 + uVar1) < -0x40))
        goto code_r0x005e2368;
        auVar12 = func_0x005e0a10(unaff_x20 + unaff_x22,unaff_x23,&UNK_008b9193);
        if ((auVar12._0_8_ & 1) != 0) {
          unaff_x22 = unaff_x22 + auVar12._8_8_ + 1;
          goto LAB_005e2050;
        }
        if (((unaff_x22 != 0 && unaff_x22 < unaff_x21) && (*(char *)(unaff_x20 + unaff_x22) < -0x40)
            ) || ((uVar11 < unaff_x21 && uVar1 != 0 && (*(char *)(unaff_x20 + uVar1) < -0x40))))
        goto code_r0x005e2384;
        auVar12 = func_0x005e0a10(unaff_x20 + unaff_x22,unaff_x23,&UNK_008b916e);
        unaff_x23 = auVar12._8_8_;
        if ((auVar12._0_8_ & 1) == 0) {
          if (unaff_x21 <= uVar11) {
            unaff_x23 = 0;
            unaff_x21 = in_stack_00000010[2] * 8;
            if (((ulong)in_stack_00000010[2] >> 0x3d != 0) || (0x7ffffffffffffff8 < unaff_x21))
            goto code_r0x005e23e4;
            lVar9 = in_stack_00000010[1];
            if (unaff_x21 == 0) {
              lVar6 = 8;
            }
            else {
              unaff_x23 = 8;
              lVar6 = func_0x00187bd0(unaff_x21,8);
              if (lVar6 == 0) goto code_r0x005e23e4;
            }
            _memcpy(lVar6,lVar9,unaff_x21);
            func_0x005e1a34(in_stack_00000008);
            return;
          }
          unaff_x22 = unaff_x22 + 1;
          goto LAB_005e2050;
        }
      } while (unaff_x21 <= uVar11);
      uVar11 = unaff_x23 + unaff_x22;
      lVar9 = extraout_x8;
      if (unaff_x21 < uVar11) {
code_r0x005e212c:
        bVar4 = true;
      }
      else {
        if (((uVar11 != 0) && (uVar11 < unaff_x21)) &&
           (lVar9 = (long)*(char *)(unaff_x20 + uVar11), *(char *)(unaff_x20 + uVar11) < -0x40))
        goto code_r0x005e23c0;
        if (uVar11 == unaff_x21) goto code_r0x005e212c;
        lVar9 = 0;
        pbVar10 = (byte *)(unaff_x20 + uVar11);
        do {
          uVar2 = (uint)*pbVar10;
          pbVar5 = pbVar10 + 1;
          if ((char)*pbVar10 < '\0') {
            if (uVar2 < 0xe0) {
              uVar2 = pbVar10[1] & 0x3f | (uVar2 & 0x1f) << 6;
              pbVar5 = pbVar10 + 2;
            }
            else {
              uVar3 = pbVar10[2] & 0x3f | (pbVar10[1] & 0x3f) << 6;
              if (uVar2 < 0xf0) {
                uVar2 = uVar3 | (uVar2 & 0x1f) << 0xc;
                pbVar5 = pbVar10 + 3;
              }
              else {
                uVar2 = pbVar10[3] & 0x3f | uVar3 << 6 | (uVar2 & 7) << 0x12;
                pbVar5 = pbVar10 + 4;
              }
            }
          }
          pbVar10 = pbVar5;
          bVar4 = uVar2 == 0x20;
        } while ((bVar4) && (lVar9 = lVar9 + 1, pbVar10 != (byte *)(unaff_x20 + unaff_x21)));
      }
      if (lVar9 == 0) {
        bVar4 = true;
      }
      if (!bVar4) {
        unaff_x23 = unaff_x23 + lVar9 + -1;
      }
      lVar9 = unaff_x23 + unaff_x22;
      uVar11 = lVar9 + 1;
      uVar1 = lVar9 + 2;
      if (uVar1 < uVar11) goto code_r0x005e23a0;
      if (uVar11 != 0) {
        if (uVar11 < unaff_x21) {
          if (-0x41 < *(char *)(unaff_x20 + uVar11)) goto code_r0x005e218c;
        }
        else if (uVar11 == unaff_x21) goto code_r0x005e218c;
code_r0x005e23a0:
        func_0x007a297c();
code_r0x005e23c0:
        func_0x007a297c();
code_r0x005e23e4:
        puVar8 = &UNK_009f33d8;
        auVar12 = func_0x007a1f00(unaff_x23,unaff_x21);
        plVar7 = auVar12._0_8_;
        uVar11 = (long)puVar8 - auVar12._8_8_;
        lVar9 = plVar7[2];
        if ((ulong)(*plVar7 - lVar9) < uVar11) {
          func_0x007afcf8(plVar7,lVar9,uVar11,1,1);
          lVar9 = plVar7[2];
        }
        _memcpy(plVar7[1] + lVar9,auVar12._8_8_,uVar11);
        plVar7[2] = lVar9 + uVar11;
        return;
      }
code_r0x005e218c:
      if (uVar1 < unaff_x21) {
        if (*(char *)(unaff_x20 + uVar1) < -0x40) goto code_r0x005e23a0;
      }
      else if (uVar1 != unaff_x21) goto code_r0x005e23a0;
    } while ((*(char *)(unaff_x20 + uVar11) == '\n') || (*(char *)(unaff_x20 + uVar11) == ' '));
    unaff_x19 = in_stack_00000010[2];
    if (unaff_x19 == *in_stack_00000010) {
      func_0x005e25c0(in_stack_00000010,&UNK_009f3510);
    }
    *(long *)(in_stack_00000010[1] + unaff_x19 * 8) = lVar9;
    unaff_x26 = in_stack_00000010;
  } while( true );
}

