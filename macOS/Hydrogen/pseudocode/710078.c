
undefined2 *
FUN_00710078(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
            undefined8 param_5,undefined2 *param_6)

{
  long *plVar1;
  undefined2 *puVar2;
  ulong uVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  undefined2 *puVar6;
  undefined8 *puVar7;
  long lVar8;
  long lVar9;
  long lVar10;
  undefined8 *puVar11;
  long lVar12;
  long lVar13;
  ulong uVar14;
  undefined8 *puVar15;
  ulong uVar16;
  long unaff_x19;
  undefined8 *puVar17;
  undefined8 *puVar18;
  long lVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  undefined1 uStack0000000000000080;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined4 uStack_80;
  undefined8 uStack_7c;
  
  func_0x00057f4c();
  uVar5 = __Unwind_Resume();
  func_0x0070f928(unaff_x19 + 0x10);
  ___cxa_end_catch();
  func_0x007253a4(&uStack0000000000000080);
  func_0x00057f4c();
  __Unwind_Resume(uVar5);
  auVar26 = func_0x0001753c();
  puVar6 = auVar26._0_8_;
  *puVar6 = *param_6;
  *(undefined1 *)(puVar6 + 4) = 0;
  *(undefined1 *)(puVar6 + 0x28) = 0;
  if (*(char *)(param_6 + 0x28) != '\0') {
    func_0x006d0634(puVar6 + 4,param_6 + 4);
    *(undefined1 *)(puVar6 + 0x28) = 1;
  }
  puVar6[0x2c] = param_6[0x2c];
  uVar5 = 0;
  if (*(char *)(param_6 + 0x28) != '\0') {
    uVar5 = *(undefined8 *)(param_6 + 0x24);
  }
  func_0x0070b9f4(puVar6 + 0x30,auVar26._8_8_,param_3,param_4,uVar5);
  *(undefined8 *)(puVar6 + 0x74) = 0;
  *(undefined8 *)(puVar6 + 0x70) = 0;
  *(undefined8 *)(puVar6 + 0x6c) = param_5;
  *(undefined8 *)(puVar6 + 0x7c) = 0;
  *(undefined8 *)(puVar6 + 0x78) = 0;
  *(undefined8 *)(puVar6 + 0x84) = 0;
  *(undefined8 *)(puVar6 + 0x80) = 0;
  *(undefined1 *)(puVar6 + 0x88) = 1;
  *(undefined8 *)(puVar6 + 0x8e) = 0;
  *(undefined8 *)(puVar6 + 0x8a) = 0;
  *(undefined8 *)(puVar6 + 0x96) = 0;
  *(undefined8 *)(puVar6 + 0x92) = 0;
  *(undefined4 *)(puVar6 + 0x9a) = 0;
  uStack_90 = 0;
  uStack_88 = 0;
  func_0x0070aa08(&uStack_80,&uStack_90,0);
  *(undefined4 *)(puVar6 + 0x9c) = uStack_80;
  *(undefined8 *)(puVar6 + 0x9e) = uStack_7c;
  plVar1 = (long *)(puVar6 + 0xb4);
  puVar2 = puVar6 + 200;
  *(undefined8 *)(puVar6 + 0xb8) = 0;
  *(undefined8 *)(puVar6 + 0xb4) = 0;
  *(undefined8 *)(puVar6 + 0xc0) = 0;
  *(undefined8 *)(puVar6 + 0xbc) = 0;
  *(undefined8 *)(puVar6 + 0xa8) = 0;
  *(undefined8 *)(puVar6 + 0xa4) = 0;
  *(undefined8 *)(puVar6 + 0xb0) = 0;
  *(undefined8 *)(puVar6 + 0xac) = 0;
  _bzero(puVar2,0x2a8);
  puVar7 = (undefined8 *)__Znwm(0x40);
  *(undefined8 **)(puVar6 + 0xa4) = puVar7;
  *puVar7 = 1;
  *(undefined8 **)(puVar6 + 0xa8) = puVar7 + 1;
  *(undefined8 **)(puVar6 + 0xac) = puVar7 + 8;
  uVar5 = func_0x0070b8b0(param_4,"self");
  *(undefined8 *)(puVar6 + 0x8c) = uVar5;
  uVar5 = func_0x0070b8b0(param_4,"number");
  *(undefined8 *)(puVar6 + 0x90) = uVar5;
  uVar5 = func_0x0070b8b0(param_4,"%error-id%");
  *(undefined8 *)(puVar6 + 0x94) = uVar5;
  uVar5 = func_0x0070b8b0(param_4,"nil");
  *(undefined8 *)(puVar6 + 0x98) = uVar5;
  uStack_80 = 0;
  func_0x00710b24(puVar6 + 0xe0,0x138,&uStack_80);
  **(undefined4 **)(puVar6 + 0xe0) = 1;
  func_0x0070ba3c(puVar6 + 0x30,1);
  func_0x00710d48(puVar6);
  *(undefined1 *)(puVar6 + 0x88) = 0;
  puVar7 = *(undefined8 **)(puVar6 + 200);
  if ((ulong)(*(long *)(puVar6 + 0xd0) - (long)puVar7) < 0x80) {
    puVar17 = *(undefined8 **)(puVar6 + 0xcc);
    lVar8 = __Znwm(0x80);
    uVar16 = (long)puVar17 - (long)puVar7;
    puVar4 = (undefined8 *)(lVar8 + (uVar16 & 0xfffffffffffffff8));
    puVar11 = puVar4;
    if (uVar16 != 0) {
      puVar18 = puVar17;
      if ((0x57 < uVar16 - 8) && (0x3f < (long)puVar17 + (-(uVar16 & 0xfffffffffffffff8) - lVar8)))
      {
        uVar3 = (uVar16 - 8 >> 3) + 1;
        uVar14 = uVar3 & 0x3ffffffffffffff8;
        puVar18 = puVar17 + -uVar14;
        puVar11 = puVar4 + -uVar14;
        puVar17 = puVar17 + -4;
        puVar15 = (undefined8 *)(lVar8 + ((long)uVar16 >> 3) * 8 + -0x20);
        uVar16 = uVar14;
        do {
          uVar20 = *puVar17;
          uVar21 = puVar17[3];
          uVar5 = puVar17[2];
          uVar25 = puVar17[-3];
          uVar24 = puVar17[-4];
          uVar23 = puVar17[-1];
          uVar22 = puVar17[-2];
          puVar15[1] = puVar17[1];
          *puVar15 = uVar20;
          puVar15[3] = uVar21;
          puVar15[2] = uVar5;
          puVar15[-3] = uVar25;
          puVar15[-4] = uVar24;
          puVar15[-1] = uVar23;
          puVar15[-2] = uVar22;
          puVar17 = puVar17 + -8;
          puVar15 = puVar15 + -8;
          uVar16 = uVar16 - 8;
        } while (uVar16 != 0);
        if (uVar3 == uVar14) goto code_r0x0071033c;
      }
      do {
        puVar18 = puVar18 + -1;
        puVar11 = puVar11 + -1;
        *puVar11 = *puVar18;
      } while (puVar18 != puVar7);
    }
code_r0x0071033c:
    *(undefined8 **)(puVar6 + 200) = puVar11;
    *(undefined8 **)(puVar6 + 0xcc) = puVar4;
    *(long *)(puVar6 + 0xd0) = lVar8 + 0x80;
    if (puVar7 != (undefined8 *)0x0) {
      __ZdlPv(puVar7);
    }
  }
  puVar7 = *(undefined8 **)(puVar6 + 0xf8);
  if ((ulong)(*(long *)(puVar6 + 0x100) - (long)puVar7) < 0x80) {
    puVar17 = *(undefined8 **)(puVar6 + 0xfc);
    lVar8 = __Znwm(0x80);
    uVar16 = (long)puVar17 - (long)puVar7;
    puVar4 = (undefined8 *)(lVar8 + (uVar16 & 0xfffffffffffffff8));
    puVar11 = puVar4;
    if (uVar16 != 0) {
      puVar18 = puVar17;
      if ((0x57 < uVar16 - 8) && (0x3f < (long)puVar17 + (-(uVar16 & 0xfffffffffffffff8) - lVar8)))
      {
        uVar3 = (uVar16 - 8 >> 3) + 1;
        uVar14 = uVar3 & 0x3ffffffffffffff8;
        puVar18 = puVar17 + -uVar14;
        puVar11 = puVar4 + -uVar14;
        puVar17 = puVar17 + -4;
        puVar15 = (undefined8 *)(lVar8 + ((long)uVar16 >> 3) * 8 + -0x20);
        uVar16 = uVar14;
        do {
          uVar20 = *puVar17;
          uVar21 = puVar17[3];
          uVar5 = puVar17[2];
          uVar25 = puVar17[-3];
          uVar24 = puVar17[-4];
          uVar23 = puVar17[-1];
          uVar22 = puVar17[-2];
          puVar15[1] = puVar17[1];
          *puVar15 = uVar20;
          puVar15[3] = uVar21;
          puVar15[2] = uVar5;
          puVar15[-3] = uVar25;
          puVar15[-4] = uVar24;
          puVar15[-1] = uVar23;
          puVar15[-2] = uVar22;
          puVar17 = puVar17 + -8;
          puVar15 = puVar15 + -8;
          uVar16 = uVar16 - 8;
        } while (uVar16 != 0);
        if (uVar3 == uVar14) goto code_r0x0071041c;
      }
      do {
        puVar18 = puVar18 + -1;
        puVar11 = puVar11 + -1;
        *puVar11 = *puVar18;
      } while (puVar18 != puVar7);
    }
code_r0x0071041c:
    *(undefined8 **)(puVar6 + 0xf8) = puVar11;
    *(undefined8 **)(puVar6 + 0xfc) = puVar4;
    *(long *)(puVar6 + 0x100) = lVar8 + 0x80;
    if (puVar7 != (undefined8 *)0x0) {
      __ZdlPv(puVar7);
    }
  }
  puVar7 = *(undefined8 **)(puVar6 + 0x11c);
  if ((ulong)(*(long *)(puVar6 + 0x124) - (long)puVar7) < 0x80) {
    puVar17 = *(undefined8 **)(puVar6 + 0x120);
    lVar8 = __Znwm(0x80);
    uVar16 = (long)puVar17 - (long)puVar7;
    puVar4 = (undefined8 *)(lVar8 + (uVar16 & 0xfffffffffffffff8));
    puVar11 = puVar4;
    if (uVar16 != 0) {
      puVar18 = puVar17;
      if ((0x57 < uVar16 - 8) && (0x3f < (long)puVar17 + (-(uVar16 & 0xfffffffffffffff8) - lVar8)))
      {
        uVar3 = (uVar16 - 8 >> 3) + 1;
        uVar14 = uVar3 & 0x3ffffffffffffff8;
        puVar18 = puVar17 + -uVar14;
        puVar11 = puVar4 + -uVar14;
        puVar17 = puVar17 + -4;
        puVar15 = (undefined8 *)(lVar8 + ((long)uVar16 >> 3) * 8 + -0x20);
        uVar16 = uVar14;
        do {
          uVar20 = *puVar17;
          uVar21 = puVar17[3];
          uVar5 = puVar17[2];
          uVar25 = puVar17[-3];
          uVar24 = puVar17[-4];
          uVar23 = puVar17[-1];
          uVar22 = puVar17[-2];
          puVar15[1] = puVar17[1];
          *puVar15 = uVar20;
          puVar15[3] = uVar21;
          puVar15[2] = uVar5;
          puVar15[-3] = uVar25;
          puVar15[-4] = uVar24;
          puVar15[-1] = uVar23;
          puVar15[-2] = uVar22;
          puVar17 = puVar17 + -8;
          puVar15 = puVar15 + -8;
          uVar16 = uVar16 - 8;
        } while (uVar16 != 0);
        if (uVar3 == uVar14) goto code_r0x007104fc;
      }
      do {
        puVar18 = puVar18 + -1;
        puVar11 = puVar11 + -1;
        *puVar11 = *puVar18;
      } while (puVar18 != puVar7);
    }
code_r0x007104fc:
    *(undefined8 **)(puVar6 + 0x11c) = puVar11;
    *(undefined8 **)(puVar6 + 0x120) = puVar4;
    *(long *)(puVar6 + 0x124) = lVar8 + 0x80;
    if (puVar7 != (undefined8 *)0x0) {
      __ZdlPv(puVar7);
    }
  }
  puVar7 = *(undefined8 **)(puVar6 + 0x158);
  if (0x7f < (ulong)(*(long *)(puVar6 + 0x160) - (long)puVar7)) goto LAB_007105f8;
  puVar17 = *(undefined8 **)(puVar6 + 0x15c);
  lVar8 = __Znwm(0x80);
  uVar16 = (long)puVar17 - (long)puVar7;
  puVar4 = (undefined8 *)(lVar8 + (uVar16 & 0xfffffffffffffff8));
  puVar11 = puVar4;
  if (uVar16 != 0) {
    puVar18 = puVar17;
    if ((0x57 < uVar16 - 8) && (0x3f < (long)puVar17 + (-(uVar16 & 0xfffffffffffffff8) - lVar8))) {
      uVar3 = (uVar16 - 8 >> 3) + 1;
      uVar14 = uVar3 & 0x3ffffffffffffff8;
      puVar18 = puVar17 + -uVar14;
      puVar11 = puVar4 + -uVar14;
      puVar17 = puVar17 + -4;
      puVar15 = (undefined8 *)(lVar8 + ((long)uVar16 >> 3) * 8 + -0x20);
      uVar16 = uVar14;
      do {
        uVar20 = *puVar17;
        uVar21 = puVar17[3];
        uVar5 = puVar17[2];
        uVar25 = puVar17[-3];
        uVar24 = puVar17[-4];
        uVar23 = puVar17[-1];
        uVar22 = puVar17[-2];
        puVar15[1] = puVar17[1];
        *puVar15 = uVar20;
        puVar15[3] = uVar21;
        puVar15[2] = uVar5;
        puVar15[-3] = uVar25;
        puVar15[-4] = uVar24;
        puVar15[-1] = uVar23;
        puVar15[-2] = uVar22;
        puVar17 = puVar17 + -8;
        puVar15 = puVar15 + -8;
        uVar16 = uVar16 - 8;
      } while (uVar16 != 0);
      if (uVar3 == uVar14) goto LAB_007105e0;
    }
    do {
      puVar18 = puVar18 + -1;
      puVar11 = puVar11 + -1;
      *puVar11 = *puVar18;
    } while (puVar18 != puVar7);
  }
LAB_007105e0:
  *(undefined8 **)(puVar6 + 0x158) = puVar11;
  *(undefined8 **)(puVar6 + 0x15c) = puVar4;
  *(long *)(puVar6 + 0x160) = lVar8 + 0x80;
  if (puVar7 != (undefined8 *)0x0) {
    __ZdlPv(puVar7);
  }
LAB_007105f8:
  lVar8 = *(long *)(puVar6 + 0x14c);
  if ((ulong)((*(long *)(puVar6 + 0x154) - lVar8 >> 3) * -0x3333333333333333) < 0x10) {
    lVar19 = *(long *)(puVar6 + 0x150);
    lVar9 = __Znwm(0x280);
    lVar10 = lVar9 + ((lVar19 - lVar8) / 0x28) * 0x28;
    lVar13 = lVar10;
    if (lVar19 - lVar8 != 0) {
      lVar12 = lVar10;
      do {
        uVar21 = *(undefined8 *)(lVar19 + -0x20);
        uVar5 = *(undefined8 *)(lVar19 + -0x28);
        uVar22 = *(undefined8 *)(lVar19 + -0x10);
        uVar20 = *(undefined8 *)(lVar19 + -0x18);
        puVar7 = (undefined8 *)(lVar19 + -8);
        lVar19 = lVar19 + -0x28;
        lVar13 = lVar12 + -0x28;
        *(undefined8 *)(lVar12 + -8) = *puVar7;
        *(undefined8 *)(lVar12 + -0x10) = uVar22;
        *(undefined8 *)(lVar12 + -0x18) = uVar20;
        *(undefined8 *)(lVar12 + -0x20) = uVar21;
        *(undefined8 *)(lVar12 + -0x28) = uVar5;
        lVar12 = lVar13;
      } while (lVar19 != lVar8);
    }
    *(long *)(puVar6 + 0x14c) = lVar13;
    *(long *)(puVar6 + 0x150) = lVar10;
    *(long *)(puVar6 + 0x154) = lVar9 + 0x280;
    if (lVar8 != 0) {
      __ZdlPv(lVar8);
    }
  }
  if (*(char *)(param_6 + 0x28) != '\0') {
    if (plVar1 != (long *)(param_6 + 4)) {
      uVar21 = *(undefined8 *)(param_6 + 0x10);
      uVar5 = *(undefined8 *)(param_6 + 0xc);
      if (*(long *)(param_6 + 8) == 0) {
        lVar8 = 0;
        lVar13 = 0;
        lVar9 = *plVar1;
      }
      else {
        lVar13 = __Znwm(*(long *)(param_6 + 8) << 4);
        lVar8 = *(long *)(param_6 + 8);
        if (lVar8 != 0) {
          lVar9 = 0;
          lVar19 = *(long *)(param_6 + 4);
          lVar10 = lVar8;
          do {
            puVar7 = (undefined8 *)(lVar19 + lVar9);
            uVar20 = *puVar7;
            ((undefined8 *)(lVar13 + lVar9))[1] = puVar7[1];
            *(undefined8 *)(lVar13 + lVar9) = uVar20;
            lVar9 = lVar9 + 0x10;
            lVar10 = lVar10 + -1;
          } while (lVar10 != 0);
        }
        lVar9 = *plVar1;
      }
      if (lVar9 != 0) {
        __ZdlPv();
      }
      *(long *)(puVar6 + 0xb4) = lVar13;
      *(long *)(puVar6 + 0xb8) = lVar8;
      *(undefined8 *)(puVar6 + 0xc0) = uVar21;
      *(undefined8 *)(puVar6 + 0xbc) = uVar5;
    }
    if (puVar2 != param_6 + 0x18) {
      func_0x006d0234(puVar2,*(long *)(param_6 + 0x18),*(long *)(param_6 + 0x1c),
                      *(long *)(param_6 + 0x1c) - *(long *)(param_6 + 0x18) >> 3);
    }
  }
  return puVar6;
}

