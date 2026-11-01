
void FUN_005a3cf8(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  code *pcVar4;
  long *plVar5;
  ulong *extraout_x8;
  undefined8 *puVar6;
  long in_x9;
  ulong uVar7;
  undefined8 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  undefined8 *puVar11;
  ulong uVar12;
  undefined8 *puVar13;
  long lVar14;
  long lVar15;
  ulong uVar16;
  undefined8 *puVar17;
  undefined8 uVar18;
  ulong uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  ulong uStack_78;
  ulong uStack_70;
  ulong uStack_68;
  
  func_0x00187bd4(param_1,in_x9 << 3,8);
  auVar26 = __Unwind_Resume(param_2);
  plVar5 = auVar26._0_8_;
  lVar15 = *plVar5;
  lVar14 = plVar5[4];
  if (lVar15 != 0) {
    uVar19 = (ulong)(plVar5[3] - plVar5[1]) >> 3;
    if (lVar14 == 0) goto LAB_005a3dbc;
    uVar19 = uVar19 + ((ulong)(plVar5[7] - plVar5[5]) >> 3);
    uVar16 = uVar19 * 8;
    if (uVar19 >> 0x3d == 0 && uVar16 < 0x7ffffffffffffff9) goto LAB_005a3dd4;
LAB_005a3f00:
    uVar18 = 0;
LAB_005a3f08:
    func_0x007a1f00(uVar18,uVar16,auVar26._8_8_);
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x5a3f1c);
    (*pcVar4)();
  }
  if (lVar14 == 0) {
    uVar19 = 0;
    uVar16 = 0;
  }
  else {
    uVar19 = (ulong)(plVar5[7] - plVar5[5]) >> 3;
LAB_005a3dbc:
    uVar16 = uVar19 * 8;
    if (0x7ffffffffffffff7 < uVar16 && uVar19 != 0xfffffffffffffff) goto LAB_005a3f00;
  }
LAB_005a3dd4:
  if (uVar16 == 0) {
    uStack_78 = 0;
    uStack_70 = 8;
    if (lVar15 != 0) goto LAB_005a3e0c;
LAB_005a3e84:
    if (lVar14 != 0) {
      uVar19 = (ulong)(plVar5[7] - plVar5[5]) >> 3;
      if (uStack_78 < uVar19) goto LAB_005a3ea0;
      goto LAB_005a3e38;
    }
    uVar19 = 0;
  }
  else {
    uVar18 = 8;
    uStack_70 = func_0x00187bd0(uVar16,8);
    if (uStack_70 == 0) goto LAB_005a3f08;
    uStack_78 = uVar19;
    if (lVar15 == 0) goto LAB_005a3e84;
LAB_005a3e0c:
    uVar19 = (ulong)(plVar5[3] - plVar5[1]) >> 3;
    if (lVar14 != 0) {
      uVar19 = uVar19 + ((ulong)(plVar5[7] - plVar5[5]) >> 3);
    }
    if (uStack_78 < uVar19) {
LAB_005a3ea0:
      uStack_68 = 0;
      func_0x007af5a0(&uStack_78,0,uVar19,8,8);
      puVar10 = (undefined8 *)plVar5[5];
      lVar3 = plVar5[6];
      puVar17 = (undefined8 *)plVar5[7];
      uVar16 = uStack_70;
    }
    else {
LAB_005a3e38:
      uStack_68 = 0;
      puVar10 = (undefined8 *)plVar5[5];
      lVar3 = plVar5[6];
      puVar17 = (undefined8 *)plVar5[7];
      uVar16 = uStack_70;
    }
    uVar19 = uStack_68;
    uStack_70 = uVar16;
    if (lVar15 != 0) {
      lVar2 = plVar5[2];
      puVar6 = (undefined8 *)plVar5[3];
      puVar11 = (undefined8 *)plVar5[1];
      if (puVar11 != puVar6) {
        uVar7 = (long)puVar6 + (-8 - (long)puVar11);
        if (uVar7 < 0x38) {
          puVar8 = puVar11;
        }
        else {
          lVar1 = uStack_68 * 8 + uVar16;
          if ((ulong)(lVar1 - (long)puVar11) < 0x40) {
            puVar8 = puVar11;
          }
          else {
            uVar7 = (uVar7 >> 3) + 1;
            uVar9 = uVar7 & 0x3ffffffffffffff8;
            uVar19 = uStack_68 + uVar9;
            puVar8 = puVar11 + uVar9;
            puVar11 = puVar11 + 4;
            puVar13 = (undefined8 *)(lVar1 + 0x20);
            uVar12 = uVar9;
            do {
              uVar18 = puVar11[-4];
              uVar21 = puVar11[-1];
              uVar20 = puVar11[-2];
              uVar23 = puVar11[1];
              uVar22 = *puVar11;
              uVar25 = puVar11[3];
              uVar24 = puVar11[2];
              puVar13[-3] = puVar11[-3];
              puVar13[-4] = uVar18;
              puVar13[-1] = uVar21;
              puVar13[-2] = uVar20;
              puVar13[1] = uVar23;
              *puVar13 = uVar22;
              puVar13[3] = uVar25;
              puVar13[2] = uVar24;
              uVar12 = uVar12 - 8;
              puVar11 = puVar11 + 8;
              puVar13 = puVar13 + 8;
            } while (uVar12 != 0);
            if (uVar7 == uVar9) goto LAB_005a3f78;
          }
        }
        do {
          puVar11 = puVar8 + 1;
          *(undefined8 *)(uVar16 + uVar19 * 8) = *puVar8;
          uVar19 = uVar19 + 1;
          puVar8 = puVar11;
        } while (puVar11 != puVar6);
      }
LAB_005a3f78:
      if (lVar2 != 0) {
        func_0x00187bd4(lVar15,lVar2 << 3,8);
      }
    }
    if (lVar14 != 0) {
      if (puVar10 != puVar17) {
        uVar7 = (long)puVar17 + (-8 - (long)puVar10);
        if (uVar7 < 0x38) {
          puVar6 = puVar10;
        }
        else {
          lVar15 = uVar19 * 8 + uVar16;
          if ((ulong)(lVar15 - (long)puVar10) < 0x40) {
            puVar6 = puVar10;
          }
          else {
            uVar7 = (uVar7 >> 3) + 1;
            uVar9 = uVar7 & 0x3ffffffffffffff8;
            uVar19 = uVar19 + uVar9;
            puVar6 = puVar10 + uVar9;
            puVar10 = puVar10 + 4;
            puVar11 = (undefined8 *)(lVar15 + 0x20);
            uVar12 = uVar9;
            do {
              uVar18 = puVar10[-4];
              uVar21 = puVar10[-1];
              uVar20 = puVar10[-2];
              uVar23 = puVar10[1];
              uVar22 = *puVar10;
              uVar25 = puVar10[3];
              uVar24 = puVar10[2];
              puVar11[-3] = puVar10[-3];
              puVar11[-4] = uVar18;
              puVar11[-1] = uVar21;
              puVar11[-2] = uVar20;
              puVar11[1] = uVar23;
              *puVar11 = uVar22;
              puVar11[3] = uVar25;
              puVar11[2] = uVar24;
              uVar12 = uVar12 - 8;
              puVar10 = puVar10 + 8;
              puVar11 = puVar11 + 8;
            } while (uVar12 != 0);
            if (uVar7 == uVar9) goto LAB_005a4028;
          }
        }
        do {
          puVar10 = puVar6 + 1;
          *(undefined8 *)(uVar16 + uVar19 * 8) = *puVar6;
          uVar19 = uVar19 + 1;
          puVar6 = puVar10;
        } while (puVar10 != puVar17);
      }
LAB_005a4028:
      uStack_68 = uVar19;
      if (lVar3 != 0) {
        func_0x00187bd4(lVar14,lVar3 << 3,8);
      }
      goto LAB_005a4040;
    }
  }
  uStack_68 = uVar19;
LAB_005a4040:
  extraout_x8[1] = uStack_70;
  *extraout_x8 = uStack_78;
  extraout_x8[2] = uStack_68;
  return;
}

