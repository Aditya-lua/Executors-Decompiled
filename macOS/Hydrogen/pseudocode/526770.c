
void FUN_00526770(void)

{
  undefined *puVar1;
  long lVar2;
  long *plVar3;
  undefined1 uVar4;
  undefined1 auVar5 [16];
  undefined1 auVar6 [16];
  code *pcVar7;
  long lVar8;
  long lVar9;
  undefined1 *puVar10;
  ulong uVar11;
  undefined8 *puVar12;
  long lVar13;
  ulong uVar14;
  long lVar15;
  long *plVar16;
  long *unaff_x19;
  undefined8 *puVar17;
  undefined *puVar18;
  ulong uVar19;
  ulong uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 unaff_x25;
  undefined8 unaff_x26;
  long lVar23;
  long unaff_x28;
  long unaff_x29;
  undefined8 uVar24;
  undefined1 auVar25 [16];
  long in_stack_00000520;
  undefined1 auStack_7ffffffe [2147483646];
  
  auVar25 = func_0x004af770();
  lVar9 = auVar25._8_8_;
  if (lVar9 < 0) {
    uVar21 = 0;
LAB_005273f8:
    auVar25 = func_0x007a1f00(uVar21,lVar9,&UNK_009e95a8);
code_r0x0052740c:
    func_0x007a2570(auVar25._0_8_,auVar25._8_8_,&UNK_009e9b68);
    goto LAB_00527418;
  }
  if (lVar9 == 0) {
    lVar8 = 1;
  }
  else {
    uVar21 = 1;
    lVar8 = func_0x00187bd0(lVar9,1);
    if (lVar8 == 0) goto LAB_005273f8;
  }
  _memcpy(lVar8,auVar25._0_8_,lVar9);
  if (*unaff_x19 != 0) {
    func_0x00187bd4();
  }
  *unaff_x19 = lVar9;
  unaff_x19[1] = lVar8;
  unaff_x19[2] = lVar9;
  *(undefined8 *)(unaff_x29 + -0xf0) = unaff_x25;
  *(undefined **)(unaff_x29 + -0xe8) = &DAT_00519924;
  func_0x0046849c();
  if (*(long *)(unaff_x28 + 0x110) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800004c6,unaff_x28 + 0x110);
  }
  if (*(long *)(unaff_x28 + 0x128) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x128);
  }
  if (*(long *)(unaff_x28 + 0x140) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x140);
  }
  if (*(long *)(unaff_x28 + 0x158) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x800001fe,unaff_x28 + 0x158);
  }
  if (*(long *)(unaff_x28 + 0x170) != -0x8000000000000000) {
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
  uVar21 = 0;
  uVar19 = *(ulong *)(unaff_x28 + 0x48);
  auVar5._8_8_ = 0;
  auVar5._0_8_ = uVar19;
  uVar20 = uVar19 * 0x18;
  if ((SUB168(auVar5 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar20)) {
LAB_00527360:
    func_0x007a1f00(uVar21,uVar20,&UNK_009e7fc8);
    goto LAB_00527418;
  }
  if (uVar20 != 0) {
    puVar17 = *(undefined8 **)(unaff_x28 + 0x40);
    uVar21 = 8;
    lVar9 = func_0x00187bd0(uVar20,8);
    if (lVar9 == 0) goto LAB_00527360;
    if (uVar19 != 0) {
      puVar10 = (undefined1 *)(lVar9 + 0x10);
      do {
        if (uVar20 == 0) break;
        uVar21 = *puVar17;
        uVar22 = puVar17[1];
        uVar4 = *(undefined1 *)(puVar17 + 2);
        puVar17 = puVar17 + 3;
        *(undefined8 *)(puVar10 + -0x10) = uVar21;
        *(undefined8 *)(puVar10 + -8) = uVar22;
        *puVar10 = uVar4;
        uVar20 = uVar20 - 0x18;
        uVar19 = uVar19 - 1;
        puVar10 = puVar10 + 0x18;
      } while (uVar19 != 0);
    }
  }
  uVar20 = *(ulong *)(unaff_x28 + 0x60) * 8;
  if (*(ulong *)(unaff_x28 + 0x60) >> 0x3d != 0 || 0x7ffffffffffffffc < uVar20) {
    uVar21 = 0;
LAB_005273dc:
    func_0x007a1f00(uVar21,uVar20,&UNK_009e7fe0);
    goto LAB_00527418;
  }
  uVar22 = *(undefined8 *)(unaff_x28 + 0x58);
  if (uVar20 == 0) {
    lVar9 = 4;
  }
  else {
    uVar21 = 4;
    lVar9 = func_0x00187bd0(uVar20,4);
    if (lVar9 == 0) goto LAB_005273dc;
  }
  _memcpy(lVar9,uVar22,uVar20);
  uVar21 = 0;
  uVar19 = *(ulong *)(unaff_x28 + 0x78);
  auVar6._8_8_ = 0;
  auVar6._0_8_ = uVar19;
  uVar20 = uVar19 * 0x18;
  if ((SUB168(auVar6 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar20)) {
LAB_00527378:
    func_0x007a1f00(uVar21,uVar20,&UNK_009e7fc8);
    goto LAB_00527418;
  }
  if (uVar20 != 0) {
    puVar17 = *(undefined8 **)(unaff_x28 + 0x70);
    uVar21 = 8;
    lVar9 = func_0x00187bd0(uVar20,8);
    if (lVar9 == 0) goto LAB_00527378;
    if (uVar19 != 0) {
      puVar10 = (undefined1 *)(lVar9 + 0x10);
      do {
        if (uVar20 == 0) break;
        uVar21 = *puVar17;
        uVar22 = puVar17[1];
        uVar4 = *(undefined1 *)(puVar17 + 2);
        puVar17 = puVar17 + 3;
        *(undefined8 *)(puVar10 + -0x10) = uVar21;
        *(undefined8 *)(puVar10 + -8) = uVar22;
        *puVar10 = uVar4;
        uVar20 = uVar20 - 0x18;
        uVar19 = uVar19 - 1;
        puVar10 = puVar10 + 0x18;
      } while (uVar19 != 0);
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
  uVar21 = 0;
  uVar20 = *(ulong *)(unaff_x28 + 0xa8);
  uVar19 = uVar20 * 0x20;
  if ((uVar20 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar19)) {
code_r0x00527390:
    func_0x007a1f00(uVar21,uVar19,&UNK_009e7fc8);
    goto LAB_00527418;
  }
  if (uVar19 == 0) {
    lVar9 = 8;
  }
  else {
    lVar8 = *(long *)(unaff_x28 + 0xa0);
    uVar21 = 8;
    lVar9 = func_0x00187bd0(uVar19,8);
    if (lVar9 == 0) goto code_r0x00527390;
    if (uVar20 != 0) {
      uVar11 = 0;
      uVar14 = uVar20;
      do {
        if (uVar19 == uVar11) break;
        puVar17 = (undefined8 *)(lVar8 + uVar11);
        puVar12 = (undefined8 *)(lVar9 + uVar11);
        uVar21 = *puVar17;
        uVar24 = puVar17[3];
        uVar22 = puVar17[2];
        puVar12[1] = puVar17[1];
        *puVar12 = uVar21;
        puVar12[3] = uVar24;
        puVar12[2] = uVar22;
        uVar11 = uVar11 + 0x20;
        uVar14 = uVar14 - 1;
      } while (uVar14 != 0);
    }
  }
  *(undefined8 *)(unaff_x29 + -0xe8) = 1;
  *(undefined8 *)(unaff_x29 + -0xf0) = unaff_x26;
  *(long *)(unaff_x29 + -0xe0) = unaff_x29 + -0xf0;
  *(ulong *)(unaff_x29 + -0xd8) = uVar20;
  *(long *)(unaff_x29 + -0xd0) = lVar9;
  *(ulong *)(unaff_x29 + -200) = uVar20;
  func_0x004e17b4(unaff_x29 + -0xb8,unaff_x28 + 0xb0,&UNK_009ea9c0);
  auVar25 = func_0x004e4980(unaff_x29 + -0xa0,unaff_x28 + 200,&UNK_009ea9c0);
  uVar20 = *(ulong *)(unaff_x28 + 0x20);
  if (uVar20 == 5) {
    *(undefined8 *)(unaff_x29 + -0x88) = 5;
  }
  else {
    if (3 < uVar20) {
      auVar25 = (**(code **)(*(long *)(unaff_x28 + 0x30) + 0x38))(*(undefined8 *)(unaff_x28 + 0x28))
      ;
    }
    *(ulong *)(unaff_x29 + -0x88) = uVar20;
    *(undefined1 (*) [16])(unaff_x29 + -0x80) = auVar25;
  }
  uVar21 = 0;
  uVar20 = *(ulong *)(unaff_x28 + 0xf0) * 0x10;
  if ((*(ulong *)(unaff_x28 + 0xf0) >> 0x3c == 0) && (uVar20 < 0x7ffffffffffffff9)) {
    uVar22 = *(undefined8 *)(unaff_x28 + 0xe8);
    if (uVar20 == 0) {
      lVar9 = 8;
    }
    else {
      uVar21 = 8;
      lVar9 = func_0x00187bd0(uVar20,8);
      if (lVar9 == 0) goto LAB_005273a8;
    }
    _memcpy(lVar9,uVar22,uVar20);
    uVar21 = 0;
    uVar20 = *(ulong *)(unaff_x28 + 0x108);
    uVar19 = uVar20 * 0x20;
    if ((uVar20 >> 0x3b == 0) && (uVar19 < 0x7ffffffffffffff9)) {
      if (uVar19 == 0) {
LAB_00526f28:
        lVar9 = *(long *)(unaff_x29 + -0xa8);
        func_0x00500404(auStack_7ffffffe + 0x800001fe);
        func_0x005045fc(auStack_7ffffffe + 0x800001fe);
        if (lVar9 != 0) {
          lVar8 = 0;
          lVar9 = in_stack_00000520 + lVar9 * 0x2c8;
          do {
            lVar23 = in_stack_00000520;
            while ((*(char *)(lVar23 + 0x2be) < '\0' || (*(char *)(lVar23 + 0x2c2) < '\0'))) {
              lVar23 = lVar23 + 0x2c8;
              if (lVar23 == lVar9) goto code_r0x005266b8;
            }
            if (lVar8 != 0) {
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
            lVar13 = 0;
            lVar8 = lVar8 + 1;
            in_stack_00000520 = lVar23 + 0x2c8;
            lVar15 = *(long *)(lVar23 + 0xf0) << 4;
            uVar20 = 0xffffffffffffffff;
            plVar16 = *(long **)(lVar23 + 0xe8);
            do {
              if (lVar15 == 0) {
                puVar18 = (undefined *)0x0;
                goto code_r0x005272cc;
              }
              lVar2 = *plVar16;
              plVar3 = plVar16 + 1;
              uVar20 = uVar20 + 1;
              lVar13 = lVar13 + 0x20;
              lVar15 = lVar15 + -0x10;
              plVar16 = plVar16 + 2;
            } while (lVar2 != 0x1414db8803bc16e0 || *plVar3 != 0x4f7557bbe08e4383);
            auVar25._8_8_ = *(ulong *)(lVar23 + 0x108);
            auVar25._0_8_ = uVar20;
            if (*(ulong *)(lVar23 + 0x108) <= uVar20) goto code_r0x0052740c;
            lVar13 = *(long *)(lVar23 + 0x100) + lVar13;
            lVar15 = *(long *)(lVar13 + -0x18);
            puVar18 = (undefined *)
                      (*(long *)(lVar13 + -0x20) +
                       (*(long *)(lVar15 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
            auVar25 = (**(code **)(lVar15 + 0x18))(puVar18);
            if (auVar25._0_8_ != 0x1414db8803bc16e0 || auVar25._8_8_ != 0x4f7557bbe08e4383) {
              func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
              goto LAB_00527418;
            }
code_r0x005272cc:
            puVar1 = &UNK_008a7b62;
            if (puVar18 != (undefined *)0x0) {
              puVar1 = puVar18;
            }
            *(long *)(unaff_x29 + -0xf0) = lVar23;
            *(undefined **)(unaff_x29 + -0xe8) = puVar1;
            *(undefined8 *)(unaff_x29 + -0xe0) = 0;
            func_0x00526280(unaff_x29 + -0xf0);
          } while (in_stack_00000520 != lVar9);
        }
code_r0x005266b8:
        func_0x00524d6c(auStack_7ffffffe + 0x800001fe);
        return;
      }
      puVar17 = *(undefined8 **)(unaff_x28 + 0x100);
      uVar21 = 8;
      lVar9 = func_0x00187bd0(uVar19,8);
      if (lVar9 != 0) {
        if (uVar20 != 0) {
          puVar12 = (undefined8 *)(lVar9 + 0x10);
          do {
            if (uVar19 == 0) break;
            plVar16 = (long *)*puVar17;
            lVar9 = *plVar16;
            *plVar16 = lVar9 + 1;
            if (lVar9 < 0) goto LAB_00527418;
            uVar21 = puVar17[1];
            uVar24 = puVar17[3];
            uVar22 = puVar17[2];
            puVar17 = puVar17 + 4;
            puVar12[-2] = plVar16;
            puVar12[-1] = uVar21;
            puVar12[1] = uVar24;
            *puVar12 = uVar22;
            uVar19 = uVar19 - 0x20;
            uVar20 = uVar20 - 1;
            puVar12 = puVar12 + 4;
          } while (uVar20 != 0);
        }
        goto LAB_00526f28;
      }
    }
    func_0x007a1f00(uVar21,uVar19,&UNK_009e7fc8);
  }
  else {
LAB_005273a8:
    func_0x007a1f00(uVar21,uVar20,&UNK_009e7fe0);
  }
LAB_00527418:
                    /* WARNING: Does not return */
  pcVar7 = (code *)SoftwareBreakpoint(1,0x52741c);
  (*pcVar7)();
}

