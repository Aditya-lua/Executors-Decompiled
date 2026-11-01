
void FUN_006b8a38(long param_1,undefined8 param_2,undefined8 param_3,undefined4 *param_4,
                 ulong param_5)

{
  undefined4 *puVar1;
  undefined4 uVar2;
  code *pcVar3;
  long lVar4;
  long *plVar5;
  undefined4 *puVar6;
  ulong in_x9;
  long in_x10;
  undefined4 *puVar7;
  undefined4 *puVar8;
  ulong uVar9;
  ulong uVar10;
  ulong uVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  ulong uVar14;
  ulong *unaff_x19;
  undefined4 *unaff_x20;
  undefined4 *unaff_x21;
  long unaff_x22;
  undefined4 *unaff_x23;
  long lVar15;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined1 auVar23 [16];
  
  if (in_x10 != 0) {
    func_0x00017f90();
LAB_006b8c4c:
    auVar23 = func_0x00017514();
    plVar5 = auVar23._0_8_;
    if (param_5 != 0) {
      if (param_5 >> 0x3b != 0) {
        func_0x00017f90(plVar5);
                    /* WARNING: Does not return */
        pcVar3 = (code *)SoftwareBreakpoint(1,0x6b8d2c);
        (*pcVar3)();
      }
      lVar4 = __Znwm(param_5 << 5);
      *plVar5 = lVar4;
      plVar5[1] = lVar4;
      plVar5[2] = lVar4 + param_5 * 0x20;
      if (auVar23._8_8_ != param_4) {
        lVar15 = 0;
        do {
          puVar6 = (undefined4 *)(lVar4 + lVar15);
          puVar1 = (undefined4 *)((long)auVar23._8_8_ + lVar15);
          *puVar6 = *puVar1;
          if (*(char *)((long)puVar1 + 0x1f) < '\0') {
            func_0x00017634(puVar6 + 2,*(undefined8 *)(puVar1 + 2),*(undefined8 *)(puVar1 + 4));
          }
          else {
            uVar16 = *(undefined8 *)(puVar1 + 2);
            *(undefined8 *)(puVar6 + 4) = *(undefined8 *)(puVar1 + 4);
            *(undefined8 *)(puVar6 + 2) = uVar16;
            *(undefined8 *)(puVar6 + 6) = *(undefined8 *)(puVar1 + 6);
          }
          lVar15 = lVar15 + 0x20;
        } while (puVar1 + 8 != param_4);
        lVar4 = lVar4 + lVar15;
      }
      plVar5[1] = lVar4;
    }
    return;
  }
  uVar9 = param_1 - (long)unaff_x20 >> 1;
  if (uVar9 <= in_x9) {
    uVar9 = in_x9;
  }
  if (0x7ffffffffffffffb < (ulong)(param_1 - (long)unaff_x20)) {
    uVar9 = 0x3fffffffffffffff;
  }
  if (uVar9 == 0) {
    lVar4 = 0;
  }
  else {
    if (uVar9 >> 0x3e != 0) goto LAB_006b8c4c;
    lVar4 = __Znwm(uVar9 << 2);
  }
  puVar6 = (undefined4 *)(lVar4 + unaff_x25 * 4);
  puVar1 = puVar6 + unaff_x22;
  uVar10 = unaff_x22 - 1U & 0x3fffffffffffffff;
  puVar7 = puVar6;
  if ((uVar10 < 0x13) ||
     ((puVar6 < unaff_x21 + 1 && (unaff_x21 < (undefined4 *)(lVar4 + unaff_x26 + unaff_x22 * 4)))))
  {
code_r0x006b8b64:
    do {
      puVar8 = puVar7 + 1;
      *puVar7 = *unaff_x21;
      puVar7 = puVar8;
    } while (puVar8 != puVar1);
  }
  else {
    uVar10 = uVar10 + 1;
    uVar11 = uVar10 & 0x7ffffffffffffff0;
    uVar2 = *unaff_x21;
    uVar16 = CONCAT44(uVar2,uVar2);
    uVar17 = CONCAT44(uVar2,uVar2);
    puVar12 = (undefined8 *)(lVar4 + unaff_x25 * 4 + 0x20);
    uVar14 = uVar11;
    do {
      puVar12[-3] = uVar17;
      puVar12[-4] = uVar16;
      puVar12[-1] = uVar17;
      puVar12[-2] = uVar16;
      puVar12[1] = uVar17;
      *puVar12 = uVar16;
      puVar12[3] = uVar17;
      puVar12[2] = uVar16;
      uVar14 = uVar14 - 0x10;
      puVar12 = puVar12 + 8;
    } while (uVar14 != 0);
    puVar7 = puVar6 + uVar11;
    if (uVar10 != uVar11) goto code_r0x006b8b64;
  }
  if (unaff_x24 - (long)unaff_x20 != 0) {
    uVar10 = (unaff_x24 - (long)unaff_x20) - 4;
    if ((0x3b < uVar10) && (0x3f < (ulong)(unaff_x24 - (unaff_x26 + lVar4)))) {
      uVar10 = (uVar10 >> 2) + 1;
      uVar11 = uVar10 & 0x7ffffffffffffff0;
      unaff_x23 = (undefined4 *)(unaff_x24 + uVar11 * -4);
      puVar6 = puVar6 + -uVar11;
      puVar12 = (undefined8 *)(unaff_x24 + -0x20);
      puVar13 = (undefined8 *)(lVar4 + unaff_x25 * 4 + -0x20);
      uVar14 = uVar11;
      do {
        uVar18 = *puVar12;
        uVar17 = puVar12[3];
        uVar16 = puVar12[2];
        uVar22 = puVar12[-3];
        uVar21 = puVar12[-4];
        uVar20 = puVar12[-1];
        uVar19 = puVar12[-2];
        puVar13[1] = puVar12[1];
        *puVar13 = uVar18;
        puVar13[3] = uVar17;
        puVar13[2] = uVar16;
        puVar13[-3] = uVar22;
        puVar13[-4] = uVar21;
        puVar13[-1] = uVar20;
        puVar13[-2] = uVar19;
        puVar12 = puVar12 + -8;
        puVar13 = puVar13 + -8;
        uVar14 = uVar14 - 0x10;
      } while (uVar14 != 0);
      if (uVar10 == uVar11) goto code_r0x006b8bfc;
    }
    do {
      unaff_x23 = unaff_x23 + -1;
      puVar6 = puVar6 + -1;
      *puVar6 = *unaff_x23;
    } while (unaff_x23 != unaff_x20);
  }
code_r0x006b8bfc:
  *unaff_x19 = (ulong)puVar6;
  unaff_x19[1] = (ulong)puVar1;
  unaff_x19[2] = lVar4 + uVar9 * 4;
  if (unaff_x20 == (undefined4 *)0x0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b2f68. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR___ZdlPv_009b01b8)();
  return;
}

