
void FUN_00717358(ulong param_1,undefined8 param_2,undefined8 param_3,ulong param_4,long *param_5,
                 long param_6,undefined8 *param_7)

{
  undefined8 *puVar1;
  ulong uVar2;
  long lVar3;
  long lVar4;
  undefined8 uVar5;
  undefined1 *extraout_x8;
  ulong uVar6;
  undefined8 *puVar7;
  ulong in_x9;
  undefined8 *puVar8;
  long lVar9;
  ulong in_x10;
  ulong uVar10;
  long unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long lVar11;
  int *piVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined1 auVar20 [16];
  undefined8 uStack_90;
  undefined8 uStack_88;
  long *plStack_68;
  long lStack_60;
  ulong uStack_58;
  
  uVar2 = in_x9 * 2;
  if (in_x9 * 2 <= in_x10) {
    uVar2 = in_x10;
  }
  if (0x333333333333332 < in_x9) {
    uVar2 = param_1;
  }
  if (uVar2 == 0) {
    lVar4 = 0;
LAB_00717394:
    puVar8 = (undefined8 *)(lVar4 + unaff_x24 * 0x28);
    uVar5 = *unaff_x22;
    uVar14 = unaff_x22[3];
    uVar13 = unaff_x22[2];
    puVar8[1] = unaff_x22[1];
    *puVar8 = uVar5;
    puVar8[3] = uVar14;
    puVar8[2] = uVar13;
    puVar8[4] = unaff_x22[4];
    puVar7 = puVar8 + 5;
    if (unaff_x21 != unaff_x23) {
      do {
        uVar13 = *(undefined8 *)(unaff_x21 + -0x20);
        uVar5 = *(undefined8 *)(unaff_x21 + -0x28);
        uVar15 = *(undefined8 *)(unaff_x21 + -0x10);
        uVar14 = *(undefined8 *)(unaff_x21 + -0x18);
        puVar1 = (undefined8 *)(unaff_x21 + -8);
        unaff_x21 = unaff_x21 + -0x28;
        puVar8[-1] = *puVar1;
        puVar8[-2] = uVar15;
        puVar8[-3] = uVar14;
        puVar8[-4] = uVar13;
        puVar8[-5] = uVar5;
        puVar8 = puVar8 + -5;
      } while (unaff_x21 != unaff_x23);
      unaff_x21 = *unaff_x20;
    }
    *unaff_x20 = (long)puVar8;
    unaff_x20[1] = (long)puVar7;
    unaff_x20[2] = lVar4 + uVar2 * 0x28;
    if (unaff_x21 != 0) {
      __ZdlPv(unaff_x21);
    }
    unaff_x20[1] = (long)puVar7;
    *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 1;
    return;
  }
  if (uVar2 <= param_1) {
    lVar4 = __Znwm(uVar2 * 0x28);
    goto LAB_00717394;
  }
  auVar20 = func_0x00017514();
  uVar5 = auVar20._8_8_;
  lVar4 = auVar20._0_8_;
  plStack_68 = (long *)(lVar4 + 0x3d0);
  lStack_60 = *(long *)(lVar4 + 0x3d8) - *(long *)(lVar4 + 0x3d0) >> 3;
  uStack_58 = 0;
  if ((param_5 == (long *)0x0) || (param_6 == 0)) {
    piVar12 = (int *)(lVar4 + 0x80);
    if (param_5 != (long *)0x0) goto LAB_007174b0;
    if ((param_4 & 1) == 0) {
      while( true ) {
        func_0x00716f98(&uStack_90,lVar4);
        func_0x007172d8(uVar5,&uStack_90);
        if (*piVar12 != 0x2c) break;
        func_0x00710d48(lVar4);
      }
      goto LAB_007175a8;
    }
    while (*piVar12 != 0x106) {
      func_0x00716f98(&uStack_90,lVar4);
      func_0x007172d8(uVar5,&uStack_90);
      if (*piVar12 != 0x2c) goto LAB_007175a8;
      func_0x00710d48(lVar4);
    }
  }
  else {
    func_0x00711dac(&plStack_68,param_6);
LAB_007174b0:
    piVar12 = (int *)(lVar4 + 0x80);
    if ((param_4 & 1) == 0) {
      while( true ) {
        func_0x00716f98(&uStack_90,lVar4);
        func_0x007172d8(uVar5,&uStack_90);
        if (*piVar12 != 0x2c) break;
        func_0x00711dac(&plStack_68,lVar4 + 0x84);
        func_0x00710d48(lVar4);
      }
LAB_007175a8:
      uVar2 = uStack_58;
      lVar3 = lStack_60;
      if (param_5 != (long *)0x0) {
        if (uStack_58 == 0) {
          lVar4 = 0;
        }
        else {
          lVar11 = *plStack_68;
          lVar4 = func_0x00704c24(*(undefined8 *)(lVar4 + 0xd8),uStack_58 << 3);
          if ((uVar2 < 8) || ((ulong)((lVar4 + lVar3 * -8) - lVar11) < 0x40)) {
            uVar6 = 0;
          }
          else {
            uVar6 = uVar2 & 0xfffffffffffffff8;
            puVar7 = (undefined8 *)(lVar4 + 0x20);
            puVar8 = (undefined8 *)(lVar3 * 8 + lVar11 + 0x20);
            uVar10 = uVar6;
            do {
              uVar5 = puVar8[-4];
              uVar14 = puVar8[-1];
              uVar13 = puVar8[-2];
              uVar16 = puVar8[1];
              uVar15 = *puVar8;
              uVar18 = puVar8[3];
              uVar17 = puVar8[2];
              puVar7[-3] = puVar8[-3];
              puVar7[-4] = uVar5;
              puVar7[-1] = uVar14;
              puVar7[-2] = uVar13;
              puVar7[1] = uVar16;
              *puVar7 = uVar15;
              puVar7[3] = uVar18;
              puVar7[2] = uVar17;
              uVar10 = uVar10 - 8;
              puVar7 = puVar7 + 8;
              puVar8 = puVar8 + 8;
            } while (uVar10 != 0);
            if (uVar2 == uVar6) goto LAB_00717658;
          }
          lVar9 = uVar2 - uVar6;
          puVar7 = (undefined8 *)(lVar11 + uVar6 * 8 + lVar3 * 8);
          puVar8 = (undefined8 *)(lVar4 + uVar6 * 8);
          do {
            *puVar8 = *puVar7;
            lVar9 = lVar9 + -1;
            puVar7 = puVar7 + 1;
            puVar8 = puVar8 + 1;
          } while (lVar9 != 0);
        }
LAB_00717658:
        *param_5 = lVar4;
        param_5[1] = uVar2;
      }
      *(undefined8 *)(extraout_x8 + 0xc) = 0;
      *(undefined8 *)(extraout_x8 + 4) = 0;
      *extraout_x8 = 0;
      *(undefined8 *)(extraout_x8 + 0x18) = 0;
      lVar4 = *plStack_68 + lStack_60 * 8;
      if (lVar4 == plStack_68[1]) {
        return;
      }
      goto LAB_00717680;
    }
    while (*piVar12 != 0x106) {
      func_0x00716f98(&uStack_90,lVar4);
      func_0x007172d8(uVar5,&uStack_90);
      if (*piVar12 != 0x2c) goto LAB_007175a8;
      func_0x00711dac(&plStack_68,lVar4 + 0x84);
      func_0x00710d48(lVar4);
    }
  }
  uStack_88 = *(undefined8 *)(lVar4 + 0x8c);
  uStack_90 = *(undefined8 *)(lVar4 + 0x84);
  func_0x00710d48(lVar4);
  if (*(int *)(lVar4 + 0x80) == 0x3a) {
    if (param_7 != (undefined8 *)0x0) {
      *param_7 = *(undefined8 *)(lVar4 + 0x84);
    }
    func_0x00710d48(lVar4);
    uVar5 = func_0x0071b6ec(lVar4);
    lVar3 = lStack_60;
    uVar2 = uStack_58;
  }
  else {
    uVar5 = 0;
    lVar3 = lStack_60;
    uVar2 = uStack_58;
  }
  lStack_60 = lVar3;
  if (param_5 != (long *)0x0) {
    if (uVar2 == 0) {
      lVar4 = 0;
    }
    else {
      lVar11 = *plStack_68;
      uStack_58 = uVar2;
      lVar4 = func_0x00704c24(*(undefined8 *)(lVar4 + 0xd8),uVar2 << 3);
      if ((uVar2 < 8) || ((ulong)((lVar4 + lVar3 * -8) - lVar11) < 0x40)) {
        uVar6 = 0;
      }
      else {
        uVar6 = uVar2 & 0xfffffffffffffff8;
        puVar7 = (undefined8 *)(lVar4 + 0x20);
        puVar8 = (undefined8 *)(lVar3 * 8 + lVar11 + 0x20);
        uVar10 = uVar6;
        do {
          uVar13 = puVar8[-4];
          uVar15 = puVar8[-1];
          uVar14 = puVar8[-2];
          uVar17 = puVar8[1];
          uVar16 = *puVar8;
          uVar19 = puVar8[3];
          uVar18 = puVar8[2];
          puVar7[-3] = puVar8[-3];
          puVar7[-4] = uVar13;
          puVar7[-1] = uVar15;
          puVar7[-2] = uVar14;
          puVar7[1] = uVar17;
          *puVar7 = uVar16;
          puVar7[3] = uVar19;
          puVar7[2] = uVar18;
          uVar10 = uVar10 - 8;
          puVar7 = puVar7 + 8;
          puVar8 = puVar8 + 8;
        } while (uVar10 != 0);
        if (uVar2 == uVar6) goto LAB_0071774c;
      }
      lVar9 = uVar2 - uVar6;
      puVar7 = (undefined8 *)(lVar11 + uVar6 * 8 + lVar3 * 8);
      puVar8 = (undefined8 *)(lVar4 + uVar6 * 8);
      do {
        *puVar8 = *puVar7;
        lVar9 = lVar9 + -1;
        puVar7 = puVar7 + 1;
        puVar8 = puVar8 + 1;
      } while (lVar9 != 0);
    }
LAB_0071774c:
    *param_5 = lVar4;
    param_5[1] = uVar2;
  }
  *extraout_x8 = 1;
  *(undefined8 *)(extraout_x8 + 0xc) = uStack_88;
  *(undefined8 *)(extraout_x8 + 4) = uStack_90;
  *(undefined8 *)(extraout_x8 + 0x18) = uVar5;
  lVar4 = *plStack_68 + lStack_60 * 8;
  if (lVar4 == plStack_68[1]) {
    return;
  }
LAB_00717680:
  plStack_68[1] = lVar4;
  return;
}

