
void FUN_005e1fe4(undefined8 param_1,undefined8 param_2,ulong param_3,long param_4,ulong param_5,
                 long *param_6)

{
  uint uVar1;
  uint uVar2;
  bool bVar3;
  byte *pbVar4;
  long *plVar5;
  undefined *puVar6;
  long extraout_x8;
  long lVar7;
  ulong extraout_x8_00;
  byte *pbVar8;
  ulong extraout_x10;
  long lVar9;
  ulong uVar10;
  long lVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  undefined1 auVar15 [16];
  undefined1 auVar16 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  ulong uStack_78;
  long lStack_70;
  ulong uStack_68;
  
  if (in_stack_00000008 != 0) {
    param_3 = 8;
    func_0x00187bd4(in_stack_00000010,in_stack_00000008 << 3);
  }
  auVar15 = __Unwind_Resume(param_1);
  lVar11 = auVar15._8_8_;
LAB_005e2050:
  uVar14 = param_5 + param_4;
  uVar10 = param_3;
  if (uVar14 <= param_3) {
    uVar10 = uVar14;
  }
  lVar12 = uVar10 - param_5;
  if (uVar10 < param_5) {
LAB_005e2368:
    func_0x007a297c(lVar11,param_3,param_5,uVar10,&UNK_009f34c8);
LAB_005e2384:
    func_0x007a297c(lVar11,param_3,param_5,uVar10,&UNK_009f34e0);
    uVar14 = extraout_x8_00;
code_r0x005e23a0:
    func_0x007a297c(lVar11,param_3,uVar14,uVar10,&UNK_009f34f8);
    uVar10 = extraout_x10;
code_r0x005e23c0:
    func_0x007a297c(lVar11,param_3,uVar10,param_3,&UNK_009f34b0);
    uVar10 = param_3;
    goto code_r0x005e23e4;
  }
  if ((param_5 != 0 && param_5 < param_3) && (*(char *)(lVar11 + param_5) < -0x40))
  goto LAB_005e2368;
  if ((uVar14 < param_3 && uVar10 != 0) && (*(char *)(lVar11 + uVar10) < -0x40)) goto LAB_005e2368;
  auVar16 = func_0x005e0a10(lVar11 + param_5,lVar12,&UNK_008b9193);
  if ((auVar16._0_8_ & 1) != 0) {
    param_5 = param_5 + auVar16._8_8_ + 1;
    goto LAB_005e2050;
  }
  if (((param_5 != 0 && param_5 < param_3) && (*(char *)(lVar11 + param_5) < -0x40)) ||
     ((uVar14 < param_3 && uVar10 != 0 && (*(char *)(lVar11 + uVar10) < -0x40)))) goto LAB_005e2384;
  auVar16 = func_0x005e0a10(lVar11 + param_5,lVar12,&UNK_008b916e);
  lVar12 = auVar16._8_8_;
  if ((auVar16._0_8_ & 1) != 0) {
    if (uVar14 < param_3) {
      uVar10 = lVar12 + param_5;
      lVar7 = extraout_x8;
      if (param_3 < uVar10) {
code_r0x005e212c:
        bVar3 = true;
code_r0x005e2130:
        if (lVar7 == 0) {
          bVar3 = true;
        }
        if (!bVar3) {
          lVar12 = lVar12 + lVar7 + -1;
        }
        lVar7 = lVar12 + param_5;
        uVar14 = lVar7 + 1;
        uVar10 = lVar7 + 2;
        if (uVar10 < uVar14) goto code_r0x005e23a0;
        if (uVar14 == 0) {
code_r0x005e218c:
          if (uVar10 < param_3) {
            if (-0x41 < *(char *)(lVar11 + uVar10)) {
code_r0x005e21a8:
              if ((*(char *)(lVar11 + uVar14) != '\n') && (*(char *)(lVar11 + uVar14) != ' ')) {
                lVar9 = param_6[2];
                if (lVar9 == *param_6) {
                  func_0x005e25c0(param_6,&UNK_009f3510);
                }
                *(long *)(param_6[1] + lVar9 * 8) = lVar7;
                param_6[2] = lVar9 + 1;
              }
              goto LAB_005e21f0;
            }
          }
          else if (uVar10 == param_3) goto code_r0x005e21a8;
        }
        else if (uVar14 < param_3) {
          if (-0x41 < *(char *)(lVar11 + uVar14)) goto code_r0x005e218c;
        }
        else if (uVar14 == param_3) goto code_r0x005e218c;
        goto code_r0x005e23a0;
      }
      if (((uVar10 == 0) || (param_3 <= uVar10)) ||
         (lVar7 = (long)*(char *)(lVar11 + uVar10), -0x41 < *(char *)(lVar11 + uVar10))) {
        if (uVar10 == param_3) goto code_r0x005e212c;
        lVar7 = 0;
        pbVar8 = (byte *)(lVar11 + uVar10);
        do {
          uVar1 = (uint)*pbVar8;
          pbVar4 = pbVar8 + 1;
          if ((char)*pbVar8 < '\0') {
            if (uVar1 < 0xe0) {
              uVar1 = pbVar8[1] & 0x3f | (uVar1 & 0x1f) << 6;
              pbVar4 = pbVar8 + 2;
            }
            else {
              uVar2 = pbVar8[2] & 0x3f | (pbVar8[1] & 0x3f) << 6;
              if (uVar1 < 0xf0) {
                uVar1 = uVar2 | (uVar1 & 0x1f) << 0xc;
                pbVar4 = pbVar8 + 3;
              }
              else {
                uVar1 = pbVar8[3] & 0x3f | uVar2 << 6 | (uVar1 & 7) << 0x12;
                pbVar4 = pbVar8 + 4;
              }
            }
          }
          pbVar8 = pbVar4;
          bVar3 = uVar1 == 0x20;
        } while ((bVar3) && (lVar7 = lVar7 + 1, pbVar8 != (byte *)(lVar11 + param_3)));
        goto code_r0x005e2130;
      }
      goto code_r0x005e23c0;
    }
LAB_005e21f0:
    param_5 = param_5 + lVar12 + 1;
    goto LAB_005e2050;
  }
  if (uVar14 < param_3) {
    param_5 = param_5 + 1;
    goto LAB_005e2050;
  }
  lVar12 = 0;
  uVar14 = param_6[2];
  uVar10 = uVar14 * 8;
  if ((uVar14 >> 0x3d != 0) || (0x7ffffffffffffff8 < uVar10)) {
code_r0x005e23e4:
    puVar6 = &UNK_009f33d8;
    auVar15 = func_0x007a1f00(lVar12,uVar10);
    plVar5 = auVar15._0_8_;
    uVar10 = (long)puVar6 - auVar15._8_8_;
    lVar11 = plVar5[2];
    if ((ulong)(*plVar5 - lVar11) < uVar10) {
      func_0x007afcf8(plVar5,lVar11,uVar10,1,1);
      lVar11 = plVar5[2];
    }
    _memcpy(plVar5[1] + lVar11,auVar15._8_8_,uVar10);
    plVar5[2] = lVar11 + uVar10;
    return;
  }
  lVar7 = param_6[1];
  if (uVar10 == 0) {
    uVar13 = 0;
    lStack_70 = 8;
  }
  else {
    lVar12 = 8;
    lStack_70 = func_0x00187bd0(uVar10,8);
    if (lStack_70 == 0) goto code_r0x005e23e4;
    uVar13 = uVar14;
  }
  _memcpy(lStack_70,lVar7,uVar10);
  uStack_78 = uVar13;
  uStack_68 = uVar14;
  func_0x005e1a34(auVar15._0_8_,lVar11,param_3,&uStack_78,&UNK_008b9193,1);
  return;
}

