
undefined8 FUN_004f0010(void)

{
  undefined *puVar1;
  long *plVar2;
  undefined1 uVar3;
  code *pcVar4;
  int iVar5;
  long lVar6;
  undefined1 *puVar7;
  ulong uVar8;
  undefined8 *puVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  long *plVar13;
  ulong uVar14;
  long unaff_x20;
  undefined *puVar15;
  undefined8 *unaff_x21;
  undefined8 uVar16;
  undefined8 *puVar17;
  undefined8 uVar18;
  long lVar19;
  long unaff_x23;
  undefined8 uVar20;
  long lVar21;
  long unaff_x26;
  ulong *puVar22;
  long unaff_x29;
  undefined1 auVar23 [16];
  long in_stack_00000138;
  long in_stack_00000208;
  undefined8 in_stack_00000210;
  undefined8 in_stack_00000218;
  undefined8 in_stack_00000220;
  undefined1 auStack_7ffffffe [2147483646];
  
  lVar6 = func_0x00187bd0();
  if (lVar6 == 0) {
    func_0x007a1f00(8);
    goto LAB_004f0b4c;
  }
  if (unaff_x26 != 0) {
    puVar7 = (undefined1 *)(lVar6 + 0x10);
    do {
      if (unaff_x23 == 0) break;
      uVar18 = *unaff_x21;
      uVar16 = unaff_x21[1];
      uVar3 = *(undefined1 *)(unaff_x21 + 2);
      unaff_x21 = unaff_x21 + 3;
      *(undefined8 *)(puVar7 + -0x10) = uVar18;
      *(undefined8 *)(puVar7 + -8) = uVar16;
      *puVar7 = uVar3;
      unaff_x23 = unaff_x23 + -0x18;
      unaff_x26 = unaff_x26 + -1;
      puVar7 = puVar7 + 0x18;
    } while (unaff_x26 != 0);
  }
  uVar14 = *(ulong *)(unaff_x20 + 0x60) * 8;
  if (*(ulong *)(unaff_x20 + 0x60) >> 0x3d != 0 || 0x7ffffffffffffffc < uVar14) {
    uVar18 = 0;
LAB_004f0af0:
    func_0x007a1f00(uVar18,uVar14,&UNK_009e7fe0);
    goto LAB_004f0b4c;
  }
  uVar16 = *(undefined8 *)(unaff_x20 + 0x58);
  if (uVar14 == 0) {
    lVar6 = 4;
  }
  else {
    uVar18 = 4;
    lVar6 = func_0x00187bd0(uVar14,4);
    if (lVar6 == 0) goto LAB_004f0af0;
  }
  _memcpy(lVar6,uVar16,uVar14);
  uVar18 = 0;
  uVar14 = *(ulong *)(unaff_x20 + 0x78);
  auVar23._8_8_ = 0;
  auVar23._0_8_ = uVar14;
  uVar10 = uVar14 * 0x18;
  if ((SUB168(auVar23 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar10)) {
LAB_004f0b0c:
    func_0x007a1f00(uVar18,uVar10,&UNK_009e7fc8);
    goto LAB_004f0b4c;
  }
  if (uVar10 == 0) {
    if (*(long *)(unaff_x20 + 0x1d0) == -0x8000000000000000) goto LAB_004f0180;
LAB_004f01e0:
    func_0x0045cd08(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x1d0);
    if (*(long *)(unaff_x20 + 0x1e8) != -0x8000000000000000) goto LAB_004f0210;
LAB_004f0194:
    lVar6 = *(long *)(unaff_x20 + 0x200);
  }
  else {
    puVar17 = *(undefined8 **)(unaff_x20 + 0x70);
    uVar18 = 8;
    lVar6 = func_0x00187bd0(uVar10,8);
    if (lVar6 == 0) goto LAB_004f0b0c;
    if (uVar14 != 0) {
      puVar7 = (undefined1 *)(lVar6 + 0x10);
      uVar12 = uVar14;
      do {
        if (uVar10 == 0) break;
        uVar18 = *puVar17;
        uVar16 = puVar17[1];
        uVar3 = *(undefined1 *)(puVar17 + 2);
        puVar17 = puVar17 + 3;
        *(undefined8 *)(puVar7 + -0x10) = uVar18;
        *(undefined8 *)(puVar7 + -8) = uVar16;
        *puVar7 = uVar3;
        uVar10 = uVar10 - 0x18;
        uVar12 = uVar12 - 1;
        puVar7 = puVar7 + 0x18;
      } while (uVar12 != 0);
    }
    if (*(long *)(unaff_x20 + 0x1d0) != -0x8000000000000000) goto LAB_004f01e0;
LAB_004f0180:
    if (*(long *)(unaff_x20 + 0x1e8) == -0x8000000000000000) goto LAB_004f0194;
LAB_004f0210:
    func_0x0045cd08(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x1e8);
    lVar6 = *(long *)(unaff_x20 + 0x200);
  }
  if (lVar6 == -0x8000000000000000) {
    lVar6 = *(long *)(unaff_x20 + 0x218);
  }
  else {
    func_0x0045cd08(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x200);
    lVar6 = *(long *)(unaff_x20 + 0x218);
  }
  if (lVar6 != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x218);
  }
  func_0x004e2918(auStack_7ffffffe + 0x8000020e,unaff_x20 + 0x80,&UNK_009e8328);
  uVar18 = 0;
  uVar12 = *(ulong *)(unaff_x20 + 0xa8);
  uVar10 = uVar12 * 0x20;
  if ((uVar12 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar10)) {
code_r0x004f0aa4:
    func_0x007a1f00(uVar18,uVar10,&UNK_009e7fc8);
    goto LAB_004f0b4c;
  }
  if (uVar10 == 0) {
    lVar6 = 8;
  }
  else {
    lVar19 = *(long *)(unaff_x20 + 0xa0);
    uVar18 = 8;
    lVar6 = func_0x00187bd0(uVar10,8);
    if (lVar6 == 0) goto code_r0x004f0aa4;
    if (uVar12 != 0) {
      uVar8 = 0;
      uVar11 = uVar12;
      do {
        if (uVar10 == uVar8) break;
        puVar17 = (undefined8 *)(lVar19 + uVar8);
        puVar9 = (undefined8 *)(lVar6 + uVar8);
        uVar18 = *puVar17;
        uVar20 = puVar17[3];
        uVar16 = puVar17[2];
        puVar9[1] = puVar17[1];
        *puVar9 = uVar18;
        puVar9[3] = uVar20;
        puVar9[2] = uVar16;
        uVar8 = uVar8 + 0x20;
        uVar11 = uVar11 - 1;
      } while (uVar11 != 0);
    }
  }
  *(undefined8 *)(unaff_x29 + -0xd8) = in_stack_00000218;
  *(undefined8 *)(unaff_x29 + -0xe0) = in_stack_00000210;
  *(undefined8 *)(unaff_x29 + -0xd0) = in_stack_00000220;
  *(ulong *)(unaff_x29 + -200) = uVar12;
  *(long *)(unaff_x29 + -0xc0) = lVar6;
  *(ulong *)(unaff_x29 + -0xb8) = uVar12;
  func_0x004e17b4(unaff_x29 + -0xa8,unaff_x20 + 0xb0,&UNK_009e8310);
  auVar23 = func_0x004e4980(unaff_x29 + -0x90,unaff_x20 + 200,&UNK_009e8310);
  uVar10 = *(ulong *)(unaff_x20 + 0x20);
  if (uVar10 == 5) {
    *(undefined8 *)(unaff_x29 + -0x78) = 5;
  }
  else {
    if (3 < uVar10) {
      auVar23 = (**(code **)(*(long *)(unaff_x20 + 0x30) + 0x38))(*(undefined8 *)(unaff_x20 + 0x28))
      ;
    }
    *(ulong *)(unaff_x29 + -0x78) = uVar10;
    *(undefined1 (*) [16])(unaff_x29 + -0x70) = auVar23;
  }
  uVar18 = 0;
  uVar10 = *(ulong *)(unaff_x20 + 0xf0) * 0x10;
  if ((*(ulong *)(unaff_x20 + 0xf0) >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar10)) {
LAB_004f0abc:
    func_0x007a1f00(uVar18,uVar10,&UNK_009e7fe0);
    goto LAB_004f0b4c;
  }
  uVar16 = *(undefined8 *)(unaff_x20 + 0xe8);
  if (uVar10 == 0) {
    lVar6 = 8;
  }
  else {
    uVar18 = 8;
    lVar6 = func_0x00187bd0(uVar10,8);
    if (lVar6 == 0) goto LAB_004f0abc;
  }
  _memcpy(lVar6,uVar16,uVar10);
  uVar18 = 0;
  uVar10 = *(ulong *)(unaff_x20 + 0x108);
  uVar12 = uVar10 * 0x20;
  if ((uVar10 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar12)) {
LAB_004f0ad4:
    func_0x007a1f00(uVar18,uVar12,&UNK_009e7fc8);
LAB_004f0b4c:
                    /* WARNING: Does not return */
    pcVar4 = (code *)SoftwareBreakpoint(1,0x4f0b50);
    (*pcVar4)();
  }
  if (uVar12 != 0) {
    puVar17 = *(undefined8 **)(unaff_x20 + 0x100);
    uVar18 = 8;
    lVar6 = func_0x00187bd0(uVar12,8);
    if (lVar6 == 0) goto LAB_004f0ad4;
    if (uVar10 != 0) {
      puVar9 = (undefined8 *)(lVar6 + 0x10);
      do {
        if (uVar12 == 0) break;
        plVar13 = (long *)*puVar17;
        lVar6 = *plVar13;
        *plVar13 = lVar6 + 1;
        if (lVar6 < 0) goto LAB_004f0b4c;
        uVar18 = puVar17[1];
        uVar20 = puVar17[3];
        uVar16 = puVar17[2];
        puVar17 = puVar17 + 4;
        puVar9[-2] = plVar13;
        puVar9[-1] = uVar18;
        puVar9[1] = uVar20;
        *puVar9 = uVar16;
        uVar12 = uVar12 - 0x20;
        uVar10 = uVar10 - 1;
        puVar9 = puVar9 + 4;
      } while (uVar10 != 0);
    }
  }
  puVar7 = auStack_7ffffffe + 0x8000020e;
  if (in_stack_00000138 != in_stack_00000208) {
    uVar18 = 1;
LAB_004f077c:
    uVar16 = *(undefined8 *)(in_stack_00000138 + 8);
    uVar10 = *(ulong *)(in_stack_00000138 + 0x10);
    if (*(long *)(puVar7 + 0xc0) != 0) {
      in_stack_00000138 = in_stack_00000138 + 0x18;
      lVar6 = *(long *)(puVar7 + 0xb8);
      lVar19 = lVar6 + *(long *)(puVar7 + 0xc0) * 0x2c8;
      do {
        uVar20 = *(undefined8 *)(lVar6 + 0x230);
        uVar12 = *(ulong *)(lVar6 + 0x238);
        if (uVar10 == uVar12) {
          iVar5 = _memcmp(uVar16,uVar20,uVar10);
          if (iVar5 == 0) goto LAB_004f081c;
        }
        if (*(long *)(lVar6 + 0x48) != 0) {
          lVar21 = *(long *)(lVar6 + 0x48) * 0x18;
          puVar22 = (ulong *)(*(long *)(lVar6 + 0x40) + 8);
          do {
            if ((uVar10 == *puVar22) && (iVar5 = _memcmp(uVar16,puVar22[-1],uVar10), iVar5 == 0)) {
              uVar10 = uVar12;
              goto LAB_004f081c;
            }
            lVar21 = lVar21 + -0x18;
            puVar22 = puVar22 + 3;
          } while (lVar21 != 0);
        }
        lVar6 = lVar6 + 0x2c8;
        if (lVar6 == lVar19) break;
      } while( true );
    }
    func_0x0045b558(unaff_x29 + -0xe0,uVar16,uVar10);
    if (*(long *)(unaff_x29 + -0xe0) == -0x8000000000000000) {
      lVar6 = *(long *)(unaff_x29 + -0xd0);
      if (lVar6 < 0) {
        uVar18 = 0;
code_r0x004f0b28:
        func_0x007a1f00(uVar18,lVar6,&UNK_009e80a0);
        goto LAB_004f0b4c;
      }
      uVar16 = *(undefined8 *)(unaff_x29 + -0xd8);
      if (lVar6 == 0) {
        lVar19 = 1;
      }
      else {
        uVar18 = 1;
        lVar19 = func_0x00187bd0(lVar6,1);
        if (lVar19 == 0) goto code_r0x004f0b28;
      }
      _memcpy(lVar19,uVar16,lVar6);
      *(long *)(unaff_x29 + -0x90) = lVar6;
      *(long *)(unaff_x29 + -0x88) = lVar19;
      *(long *)(unaff_x29 + -0x80) = lVar6;
    }
    else {
      *(undefined8 *)(unaff_x29 + -0x88) = *(undefined8 *)(unaff_x29 + -0xd8);
      *(undefined8 *)(unaff_x29 + -0x90) = *(undefined8 *)(unaff_x29 + -0xe0);
      *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xd0);
    }
    lVar6 = 0;
    lVar19 = *(long *)(puVar7 + 0xf0) << 4;
    uVar14 = 0xffffffffffffffff;
    plVar13 = *(long **)(puVar7 + 0xe8);
    goto LAB_004f0970;
  }
LAB_004f08ec:
  func_0x00506880(unaff_x29 + -0xe0,puVar7,1);
  uVar18 = func_0x0051aec0(0xc,puVar7,unaff_x29 + -0xe0);
code_r0x004f0a2c:
  func_0x004ea2e4(auStack_7ffffffe + 0x8000020e);
  return uVar18;
LAB_004f081c:
  if ((long)uVar10 < 0) {
    uVar18 = 0;
code_r0x004f0a78:
    func_0x007a1f00(uVar18,uVar14,&UNK_009e80a0);
    goto LAB_004f0b4c;
  }
  if (uVar10 == 0) {
    uVar14 = 1;
  }
  else {
    uVar14 = func_0x00187bd0(uVar10,1);
    if (uVar14 == 0) {
      uVar14 = uVar10;
      goto code_r0x004f0a78;
    }
    _memcpy(uVar14,uVar20,uVar10);
  }
  puVar7 = (undefined1 *)func_0x00503d08(puVar7,uVar14,uVar10);
  if (puVar7 == (undefined1 *)0x0) {
    func_0x007a23bc(&UNK_009e8188);
    goto LAB_004f0b4c;
  }
  if (uVar10 != 0) {
    func_0x00187bd4(uVar14,uVar10,1);
  }
  if (in_stack_00000138 == in_stack_00000208) goto LAB_004f08ec;
  goto LAB_004f077c;
  while( true ) {
    lVar21 = *plVar13;
    plVar2 = plVar13 + 1;
    uVar14 = uVar14 + 1;
    lVar6 = lVar6 + 0x20;
    lVar19 = lVar19 + -0x10;
    plVar13 = plVar13 + 2;
    if (lVar21 == 0x1414db8803bc16e0 && *plVar2 == 0x4f7557bbe08e4383) break;
LAB_004f0970:
    if (lVar19 == 0) {
      puVar15 = (undefined *)0x0;
      goto LAB_004f09f0;
    }
  }
  if (*(ulong *)(puVar7 + 0x108) <= uVar14) {
    func_0x007a2570(uVar14,*(ulong *)(puVar7 + 0x108),&UNK_009e9b68);
    goto LAB_004f0b4c;
  }
  lVar19 = *(long *)(*(long *)(puVar7 + 0x100) + lVar6 + -0x18);
  puVar15 = (undefined *)
            (*(long *)(*(long *)(puVar7 + 0x100) + lVar6 + -0x20) +
             (*(long *)(lVar19 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
  auVar23 = (**(code **)(lVar19 + 0x18))(puVar15);
  if (auVar23._0_8_ != 0x1414db8803bc16e0 || auVar23._8_8_ != 0x4f7557bbe08e4383) {
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    goto LAB_004f0b4c;
  }
LAB_004f09f0:
  puVar1 = &UNK_008a7b62;
  if (puVar15 != (undefined *)0x0) {
    puVar1 = puVar15;
  }
  *(undefined1 **)(unaff_x29 + -0xe0) = puVar7;
  *(undefined **)(unaff_x29 + -0xd8) = puVar1;
  *(undefined8 *)(unaff_x29 + -0xd0) = 0;
  func_0x00525f7c(unaff_x29 + -0x78,unaff_x29 + -0xe0,8,0);
  uVar18 = func_0x0051c36c(puVar7,unaff_x29 + -0x90,unaff_x29 + -0x78);
  goto code_r0x004f0a2c;
}

