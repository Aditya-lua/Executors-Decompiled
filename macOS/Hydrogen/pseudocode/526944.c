
void FUN_00526944(void)

{
  undefined *puVar1;
  long lVar2;
  long *plVar3;
  undefined1 uVar4;
  undefined1 auVar5 [16];
  code *pcVar6;
  long lVar7;
  undefined1 *puVar8;
  ulong uVar9;
  undefined8 *puVar10;
  long lVar11;
  ulong uVar12;
  long lVar13;
  long *plVar14;
  undefined8 *puVar15;
  undefined8 uVar16;
  undefined *puVar17;
  ulong uVar18;
  ulong uVar19;
  long lVar20;
  undefined8 uVar21;
  long unaff_x26;
  long lVar22;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar23;
  undefined1 auVar24 [16];
  undefined8 in_stack_00000200;
  undefined8 in_stack_00000208;
  undefined8 in_stack_00000210;
  long in_stack_00000520;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (*(long *)(unaff_x28 + 0x170) != unaff_x26) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x170);
  }
  if (*(long *)(unaff_x28 + 0x188) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x188);
  }
  if (*(long *)(unaff_x28 + 0x1a0) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x1a0);
  }
  if (*(long *)(unaff_x28 + 0x1b8) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x1b8);
  }
  uVar16 = 0;
  uVar18 = *(ulong *)(unaff_x28 + 0x48);
  auVar24._8_8_ = 0;
  auVar24._0_8_ = uVar18;
  uVar19 = uVar18 * 0x18;
  if ((SUB168(auVar24 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar19)) {
LAB_00527360:
    func_0x007a1f00(uVar16,uVar19,&UNK_009e7fc8);
    goto LAB_00527418;
  }
  if (uVar19 != 0) {
    puVar15 = *(undefined8 **)(unaff_x28 + 0x40);
    uVar16 = 8;
    lVar7 = func_0x00187bd0(uVar19,8);
    if (lVar7 == 0) goto LAB_00527360;
    if (uVar18 != 0) {
      puVar8 = (undefined1 *)(lVar7 + 0x10);
      do {
        if (uVar19 == 0) break;
        uVar16 = *puVar15;
        uVar21 = puVar15[1];
        uVar4 = *(undefined1 *)(puVar15 + 2);
        puVar15 = puVar15 + 3;
        *(undefined8 *)(puVar8 + -0x10) = uVar16;
        *(undefined8 *)(puVar8 + -8) = uVar21;
        *puVar8 = uVar4;
        uVar19 = uVar19 - 0x18;
        uVar18 = uVar18 - 1;
        puVar8 = puVar8 + 0x18;
      } while (uVar18 != 0);
    }
  }
  uVar19 = *(ulong *)(unaff_x28 + 0x60) * 8;
  if (*(ulong *)(unaff_x28 + 0x60) >> 0x3d != 0 || 0x7ffffffffffffffc < uVar19) {
    uVar16 = 0;
LAB_005273dc:
    func_0x007a1f00(uVar16,uVar19,&UNK_009e7fe0);
    goto LAB_00527418;
  }
  uVar21 = *(undefined8 *)(unaff_x28 + 0x58);
  if (uVar19 == 0) {
    lVar7 = 4;
  }
  else {
    uVar16 = 4;
    lVar7 = func_0x00187bd0(uVar19,4);
    if (lVar7 == 0) goto LAB_005273dc;
  }
  _memcpy(lVar7,uVar21,uVar19);
  uVar16 = 0;
  uVar18 = *(ulong *)(unaff_x28 + 0x78);
  auVar5._8_8_ = 0;
  auVar5._0_8_ = uVar18;
  uVar19 = uVar18 * 0x18;
  if ((SUB168(auVar5 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar19)) {
LAB_00527378:
    func_0x007a1f00(uVar16,uVar19,&UNK_009e7fc8);
    goto LAB_00527418;
  }
  if (uVar19 != 0) {
    puVar15 = *(undefined8 **)(unaff_x28 + 0x70);
    uVar16 = 8;
    lVar7 = func_0x00187bd0(uVar19,8);
    if (lVar7 == 0) goto LAB_00527378;
    if (uVar18 != 0) {
      puVar8 = (undefined1 *)(lVar7 + 0x10);
      do {
        if (uVar19 == 0) break;
        uVar16 = *puVar15;
        uVar21 = puVar15[1];
        uVar4 = *(undefined1 *)(puVar15 + 2);
        puVar15 = puVar15 + 3;
        *(undefined8 *)(puVar8 + -0x10) = uVar16;
        *(undefined8 *)(puVar8 + -8) = uVar21;
        *puVar8 = uVar4;
        uVar19 = uVar19 - 0x18;
        uVar18 = uVar18 - 1;
        puVar8 = puVar8 + 0x18;
      } while (uVar18 != 0);
    }
  }
  if (*(long *)(unaff_x28 + 0x1d0) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x1d0);
  }
  if (*(long *)(unaff_x28 + 0x1e8) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x1e8);
  }
  if (*(long *)(unaff_x28 + 0x200) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x200);
  }
  if (*(long *)(unaff_x28 + 0x218) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x218);
  }
  func_0x004e2918(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x80,&UNK_009ea9d8);
  uVar16 = 0;
  uVar19 = *(ulong *)(unaff_x28 + 0xa8);
  uVar18 = uVar19 * 0x20;
  if ((uVar19 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar18)) {
code_r0x00527390:
    func_0x007a1f00(uVar16,uVar18,&UNK_009e7fc8);
    goto LAB_00527418;
  }
  if (uVar18 == 0) {
    lVar7 = 8;
  }
  else {
    lVar20 = *(long *)(unaff_x28 + 0xa0);
    uVar16 = 8;
    lVar7 = func_0x00187bd0(uVar18,8);
    if (lVar7 == 0) goto code_r0x00527390;
    if (uVar19 != 0) {
      uVar9 = 0;
      uVar12 = uVar19;
      do {
        if (uVar18 == uVar9) break;
        puVar15 = (undefined8 *)(lVar20 + uVar9);
        puVar10 = (undefined8 *)(lVar7 + uVar9);
        uVar16 = *puVar15;
        uVar23 = puVar15[3];
        uVar21 = puVar15[2];
        puVar10[1] = puVar15[1];
        *puVar10 = uVar16;
        puVar10[3] = uVar23;
        puVar10[2] = uVar21;
        uVar9 = uVar9 + 0x20;
        uVar12 = uVar12 - 1;
      } while (uVar12 != 0);
    }
  }
  *(undefined8 *)(unaff_x29 + -0xe8) = in_stack_00000208;
  *(undefined8 *)(unaff_x29 + -0xf0) = in_stack_00000200;
  *(undefined8 *)(unaff_x29 + -0xe0) = in_stack_00000210;
  *(ulong *)(unaff_x29 + -0xd8) = uVar19;
  *(long *)(unaff_x29 + -0xd0) = lVar7;
  *(ulong *)(unaff_x29 + -200) = uVar19;
  func_0x004e17b4(unaff_x29 + -0xb8,unaff_x28 + 0xb0,&UNK_009ea9c0);
  auVar24 = func_0x004e4980(unaff_x29 + -0xa0,unaff_x28 + 200,&UNK_009ea9c0);
  uVar19 = *(ulong *)(unaff_x28 + 0x20);
  if (uVar19 == 5) {
    *(undefined8 *)(unaff_x29 + -0x88) = 5;
  }
  else {
    if (3 < uVar19) {
      auVar24 = (**(code **)(*(long *)(unaff_x28 + 0x30) + 0x38))(*(undefined8 *)(unaff_x28 + 0x28))
      ;
    }
    *(ulong *)(unaff_x29 + -0x88) = uVar19;
    *(undefined1 (*) [16])(unaff_x29 + -0x80) = auVar24;
  }
  uVar16 = 0;
  uVar19 = *(ulong *)(unaff_x28 + 0xf0) * 0x10;
  if ((*(ulong *)(unaff_x28 + 0xf0) >> 0x3c == 0) && (uVar19 < 0x7ffffffffffffff9)) {
    uVar21 = *(undefined8 *)(unaff_x28 + 0xe8);
    if (uVar19 == 0) {
      lVar7 = 8;
    }
    else {
      uVar16 = 8;
      lVar7 = func_0x00187bd0(uVar19,8);
      if (lVar7 == 0) goto LAB_005273a8;
    }
    _memcpy(lVar7,uVar21,uVar19);
    uVar16 = 0;
    uVar19 = *(ulong *)(unaff_x28 + 0x108);
    uVar18 = uVar19 * 0x20;
    if ((uVar19 >> 0x3b == 0) && (uVar18 < 0x7ffffffffffffff9)) {
      if (uVar18 == 0) {
LAB_00526f28:
        lVar7 = *(long *)(unaff_x29 + -0xa8);
        func_0x00500404(auStack_7ffffffe + 0x800001fe);
        func_0x005045fc(auStack_7ffffffe + 0x800001fe);
        if (lVar7 != 0) {
          lVar20 = 0;
          lVar7 = in_stack_00000520 + lVar7 * 0x2c8;
          do {
            lVar22 = in_stack_00000520;
            while ((*(char *)(lVar22 + 0x2be) < '\0' || (*(char *)(lVar22 + 0x2c2) < '\0'))) {
              lVar22 = lVar22 + 0x2c8;
              if (lVar22 == lVar7) goto code_r0x005266b8;
            }
            if (lVar20 != 0) {
              func_0x005115a8();
              *(undefined **)(unaff_x29 + -0x88) = &UNK_009ea698;
              *(undefined **)(unaff_x29 + -0x80) = &DAT_00519924;
              *(undefined **)(unaff_x29 + -0xf0) = &UNK_007fc120;
              *(undefined8 *)(unaff_x29 + -0xe8) = 1;
              *(undefined8 *)(unaff_x29 + -0xd8) = 1;
              *(undefined8 *)(unaff_x29 + -0xd0) = 0;
              *(long *)(unaff_x29 + -0xe0) = unaff_x29 + -0x88;
              func_0x0046849c();
            }
            lVar11 = 0;
            lVar20 = lVar20 + 1;
            in_stack_00000520 = lVar22 + 0x2c8;
            lVar13 = *(long *)(lVar22 + 0xf0) << 4;
            uVar19 = 0xffffffffffffffff;
            plVar14 = *(long **)(lVar22 + 0xe8);
            do {
              if (lVar13 == 0) {
                puVar17 = (undefined *)0x0;
                goto code_r0x005272cc;
              }
              lVar2 = *plVar14;
              plVar3 = plVar14 + 1;
              uVar19 = uVar19 + 1;
              lVar11 = lVar11 + 0x20;
              lVar13 = lVar13 + -0x10;
              plVar14 = plVar14 + 2;
            } while (lVar2 != 0x1414db8803bc16e0 || *plVar3 != 0x4f7557bbe08e4383);
            if (*(ulong *)(lVar22 + 0x108) <= uVar19) {
              func_0x007a2570(uVar19,*(ulong *)(lVar22 + 0x108),&UNK_009e9b68);
              goto LAB_00527418;
            }
            lVar11 = *(long *)(lVar22 + 0x100) + lVar11;
            lVar13 = *(long *)(lVar11 + -0x18);
            puVar17 = (undefined *)
                      (*(long *)(lVar11 + -0x20) +
                       (*(long *)(lVar13 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
            auVar24 = (**(code **)(lVar13 + 0x18))(puVar17);
            if (auVar24._0_8_ != 0x1414db8803bc16e0 || auVar24._8_8_ != 0x4f7557bbe08e4383) {
              func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
              goto LAB_00527418;
            }
code_r0x005272cc:
            puVar1 = &UNK_008a7b62;
            if (puVar17 != (undefined *)0x0) {
              puVar1 = puVar17;
            }
            *(long *)(unaff_x29 + -0xf0) = lVar22;
            *(undefined **)(unaff_x29 + -0xe8) = puVar1;
            *(undefined8 *)(unaff_x29 + -0xe0) = 0;
            func_0x00526280(unaff_x29 + -0xf0);
          } while (in_stack_00000520 != lVar7);
        }
code_r0x005266b8:
        func_0x00524d6c(auStack_7ffffffe + 0x800001fe);
        return;
      }
      puVar15 = *(undefined8 **)(unaff_x28 + 0x100);
      uVar16 = 8;
      lVar7 = func_0x00187bd0(uVar18,8);
      if (lVar7 != 0) {
        if (uVar19 != 0) {
          puVar10 = (undefined8 *)(lVar7 + 0x10);
          do {
            if (uVar18 == 0) break;
            plVar14 = (long *)*puVar15;
            lVar7 = *plVar14;
            *plVar14 = lVar7 + 1;
            if (lVar7 < 0) goto LAB_00527418;
            uVar16 = puVar15[1];
            uVar23 = puVar15[3];
            uVar21 = puVar15[2];
            puVar15 = puVar15 + 4;
            puVar10[-2] = plVar14;
            puVar10[-1] = uVar16;
            puVar10[1] = uVar23;
            *puVar10 = uVar21;
            uVar18 = uVar18 - 0x20;
            uVar19 = uVar19 - 1;
            puVar10 = puVar10 + 4;
          } while (uVar19 != 0);
        }
        goto LAB_00526f28;
      }
    }
    func_0x007a1f00(uVar16,uVar18,&UNK_009e7fc8);
  }
  else {
LAB_005273a8:
    func_0x007a1f00(uVar16,uVar19,&UNK_009e7fe0);
  }
LAB_00527418:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x52741c);
  (*pcVar6)();
}

