
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004f8a80(void)

{
  uint uVar1;
  undefined1 uVar2;
  undefined1 auVar3 [16];
  bool bVar4;
  code *pcVar5;
  undefined *puVar6;
  long lVar7;
  undefined8 uVar8;
  undefined1 *puVar9;
  ulong uVar10;
  undefined8 *puVar11;
  uint *puVar12;
  undefined *puVar13;
  ulong uVar14;
  long lVar15;
  uint uVar16;
  long unaff_x19;
  undefined8 *puVar17;
  long unaff_x21;
  long *plVar18;
  long lVar19;
  uint uVar20;
  ulong uVar21;
  long unaff_x24;
  undefined8 uVar22;
  ulong uVar23;
  long unaff_x29;
  undefined8 uVar24;
  undefined1 auVar25 [16];
  long in_stack_00000220;
  undefined8 in_stack_00000228;
  long in_stack_00000230;
  long in_stack_00000238;
  undefined8 in_stack_00000240;
  long in_stack_00000248;
  long in_stack_00000250;
  undefined8 *in_stack_00000258;
  long in_stack_00000260;
  undefined1 auStack_7ffffffe [2147483646];
  
  func_0x004e8f34();
  puVar13 = *(undefined **)(*(long *)(unaff_x24 + 0x10) + 0x88);
  puVar6 = puVar13 + *(long *)(*(long *)(unaff_x24 + 0x10) + 0x90) * unaff_x19;
  func_0x004e6e64(auStack_7ffffffe + 0x80000236,auStack_7ffffffe + 0x8000026e);
  lVar7 = *(long *)(unaff_x24 + 0x10);
  if (*(long *)(lVar7 + 0xc0) != 0) {
    puVar12 = (uint *)(*(long *)(lVar7 + 0xb8) + 0x2c0);
    lVar15 = *(long *)(lVar7 + 0xc0) * 0x2c8;
    do {
      if (((*(long *)(puVar12 + -0x22) != 4) || (**(int **)(puVar12 + -0x24) != _UNK_008a4611)) &&
         (((puVar12[-1] | *puVar12) >> 0x17 & 1) == 0)) {
        uVar16 = 1;
        goto LAB_004f8b24;
      }
      puVar12 = puVar12 + 0xb2;
      lVar15 = lVar15 + -0x2c8;
    } while (lVar15 != 0);
  }
  uVar16 = 0;
LAB_004f8b24:
  func_0x0050b6fc(auStack_7ffffffe + 0x8000024e,*(long *)(lVar7 + 0x88),
                  *(long *)(lVar7 + 0x88) + *(long *)(lVar7 + 0x90) * 600);
  lVar7 = *(long *)(unaff_x24 + 0x10);
  if (*(char *)(lVar7 + 0x2bd) < '\0') {
    bVar4 = true;
    uVar20 = 1;
  }
  else {
    bVar4 = true;
    uVar20 = *(uint *)(lVar7 + 0x2c0) & 0x8000;
    uVar1 = 0;
    if (uVar20 == 0) {
      uVar1 = uVar16;
    }
    if (uVar1 == 0) {
      uVar20 = uVar20 >> 0xf;
    }
    else {
      puVar13 = *(undefined **)(lVar7 + 0x2a0);
      if (puVar13 == (undefined *)0x0) {
        puVar13 = &UNK_008a4310;
        uVar8 = 8;
      }
      else {
        uVar8 = *(undefined8 *)(lVar7 + 0x2a8);
      }
      *(undefined **)(unaff_x29 + -0x78) = puVar13;
      *(undefined8 *)(unaff_x29 + -0x70) = uVar8;
      uVar8 = *(undefined8 *)(unaff_x24 + 8);
      *(undefined1 **)(unaff_x29 + -0xe0) = auStack_7ffffffe + 0x8000020e;
      *(undefined **)(unaff_x29 + -0xd8) = &DAT_00524310;
      *(long *)(unaff_x29 + -0xd0) = unaff_x29 + -0x78;
      *(undefined **)(unaff_x29 + -200) = &DAT_00519924;
      puVar13 = &UNK_009e8568;
      puVar6 = (undefined *)0x4;
      unaff_x21 = unaff_x29 + -0xe0;
      func_0x0046849c(uVar8,&UNK_009e84b0,auStack_7ffffffe + 0x8000026e);
      func_0x004fc324();
      bVar4 = false;
      uVar20 = 0;
    }
  }
  if (in_stack_00000230 != 0) {
    if (!bVar4) {
      plVar18 = *(long **)(unaff_x24 + 8);
      lVar7 = plVar18[2];
      if ((ulong)(*plVar18 - lVar7) < 2) {
        func_0x007a5594(plVar18,lVar7,2,1,1);
        lVar7 = plVar18[2];
      }
      *(undefined2 *)(plVar18[1] + lVar7) = 0xa0a;
      plVar18[2] = lVar7 + 2;
    }
    *(undefined **)(unaff_x29 + -0x78) = &UNK_008a40e0;
    *(undefined8 *)(unaff_x29 + -0x70) = 9;
    uVar8 = *(undefined8 *)(unaff_x24 + 8);
    *(undefined1 **)(unaff_x29 + -0xe0) = auStack_7ffffffe + 0x8000020e;
    *(undefined **)(unaff_x29 + -0xd8) = &DAT_00524310;
    *(long *)(unaff_x29 + -0xd0) = unaff_x29 + -0x78;
    *(undefined **)(unaff_x29 + -200) = &DAT_00519924;
    puVar13 = &UNK_009e8568;
    puVar6 = (undefined *)0x4;
    unaff_x21 = unaff_x29 + -0xe0;
    func_0x0046849c(uVar8,&UNK_009e84b0,auStack_7ffffffe + 0x8000026e);
    func_0x004f9f0c();
    bVar4 = false;
  }
  if (in_stack_00000248 != 0) {
    if (!bVar4) {
      plVar18 = *(long **)(unaff_x24 + 8);
      lVar7 = plVar18[2];
      if ((ulong)(*plVar18 - lVar7) < 2) {
        func_0x007a5594(plVar18,lVar7,2,1,1);
        lVar7 = plVar18[2];
      }
      *(undefined2 *)(plVar18[1] + lVar7) = 0xa0a;
      plVar18[2] = lVar7 + 2;
    }
    *(undefined **)(unaff_x29 + -0x78) = &UNK_008a40e9;
    *(undefined8 *)(unaff_x29 + -0x70) = 7;
    uVar8 = *(undefined8 *)(unaff_x24 + 8);
    *(undefined1 **)(unaff_x29 + -0xe0) = auStack_7ffffffe + 0x8000020e;
    *(undefined **)(unaff_x29 + -0xd8) = &DAT_00524310;
    *(long *)(unaff_x29 + -0xd0) = unaff_x29 + -0x78;
    *(undefined **)(unaff_x29 + -200) = &DAT_00519924;
    puVar13 = &UNK_009e8568;
    puVar6 = (undefined *)0x4;
    unaff_x21 = unaff_x29 + -0xe0;
    func_0x0046849c(uVar8,&UNK_009e84b0,auStack_7ffffffe + 0x8000026e);
    func_0x004f9f0c();
    bVar4 = false;
  }
  if (in_stack_00000260 != 0) {
    puVar17 = in_stack_00000258;
    do {
      uVar8 = puVar17[1];
      *(undefined8 *)(unaff_x29 + -0x90) = *puVar17;
      *(undefined8 *)(unaff_x29 + -0x88) = uVar8;
      puVar13 = *(undefined **)(*(long *)(unaff_x24 + 0x10) + 0x88);
      puVar6 = puVar13 + *(long *)(*(long *)(unaff_x24 + 0x10) + 0x90) * 600;
      func_0x004e7da8(unaff_x29 + -0x78,auStack_7ffffffe + 0x8000026e,&UNK_009e8478);
      lVar7 = *(long *)(unaff_x29 + -0x68);
      unaff_x21 = unaff_x29 + -0x90;
      if (lVar7 != 0) {
        if (!bVar4) {
          plVar18 = *(long **)(unaff_x24 + 8);
          lVar15 = plVar18[2];
          if ((ulong)(*plVar18 - lVar15) < 2) {
            func_0x007a5594(plVar18,lVar15,2,1,1);
            lVar15 = plVar18[2];
          }
          *(undefined2 *)(plVar18[1] + lVar15) = 0xa0a;
          plVar18[2] = lVar15 + 2;
        }
        uVar8 = *(undefined8 *)(unaff_x24 + 8);
        *(undefined1 **)(unaff_x29 + -0xe0) = auStack_7ffffffe + 0x8000020e;
        *(undefined **)(unaff_x29 + -0xd8) = &DAT_00524310;
        *(long *)(unaff_x29 + -0xd0) = unaff_x29 + -0x90;
        *(undefined **)(unaff_x29 + -200) = &DAT_00519924;
        puVar13 = &UNK_009e8568;
        puVar6 = (undefined *)0x4;
        unaff_x21 = unaff_x29 + -0xe0;
        func_0x0046849c(uVar8,&UNK_009e84b0,auStack_7ffffffe + 0x8000026e);
        func_0x004f9f0c(unaff_x24,*(undefined8 *)(unaff_x29 + -0x70),lVar7,&DAT_004fcdec);
        bVar4 = false;
      }
      if (*(long *)(unaff_x29 + -0x78) != 0) {
        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x70),*(long *)(unaff_x29 + -0x78) << 3,8);
      }
      puVar17 = puVar17 + 2;
    } while (puVar17 != in_stack_00000258 + in_stack_00000260 * 2);
    if (in_stack_00000250 != 0) {
      func_0x00187bd4(in_stack_00000258,in_stack_00000250 << 4,8);
    }
  }
  if ((uVar16 & uVar20) == 0) goto LAB_004f999c;
  lVar7 = *(long *)(unaff_x24 + 0x10);
  if (*(long *)(lVar7 + 0x110) == -0x8000000000000000) {
    *(undefined8 *)(unaff_x29 + -0xf8) = 0x8000000000000000;
  }
  else {
    func_0x0045cd08(unaff_x29 + -0xf8,lVar7 + 0x110);
  }
  if (*(long *)(lVar7 + 0x128) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x8000026e,lVar7 + 0x128);
  }
  if (*(long *)(lVar7 + 0x140) == -0x8000000000000000) {
    if (*(long *)(lVar7 + 0x158) != -0x8000000000000000) goto LAB_004f90d8;
LAB_004f9060:
    if (*(long *)(lVar7 + 0x170) != -0x8000000000000000) goto LAB_004f910c;
LAB_004f9078:
    if (*(long *)(lVar7 + 0x188) != -0x8000000000000000) goto LAB_004f9140;
LAB_004f908c:
    lVar15 = *(long *)(lVar7 + 0x1a0);
  }
  else {
    func_0x0045cd08(auStack_7ffffffe + 0x8000026e,lVar7 + 0x140);
    if (*(long *)(lVar7 + 0x158) == -0x8000000000000000) goto LAB_004f9060;
LAB_004f90d8:
    func_0x0045cd08(auStack_7ffffffe + 0x8000026e,lVar7 + 0x158);
    if (*(long *)(lVar7 + 0x170) == -0x8000000000000000) goto LAB_004f9078;
LAB_004f910c:
    func_0x0045cd08(auStack_7ffffffe + 0x8000026e,lVar7 + 0x170);
    if (*(long *)(lVar7 + 0x188) == -0x8000000000000000) goto LAB_004f908c;
LAB_004f9140:
    func_0x0045cd08(auStack_7ffffffe + 0x8000026e,lVar7 + 0x188);
    lVar15 = *(long *)(lVar7 + 0x1a0);
  }
  if (lVar15 != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x8000026e,lVar7 + 0x1a0);
  }
  if (*(long *)(lVar7 + 0x1b8) != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x8000026e,lVar7 + 0x1b8);
  }
  uVar8 = 0;
  uVar21 = *(ulong *)(lVar7 + 0x48);
  auVar25._8_8_ = 0;
  auVar25._0_8_ = uVar21;
  uVar23 = uVar21 * 0x18;
  if ((SUB168(auVar25 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar23)) {
LAB_004f9a40:
    func_0x007a1f00(uVar8,uVar23,&UNK_009e7fc8);
    goto LAB_004f9ad0;
  }
  if (uVar23 != 0) {
    puVar17 = *(undefined8 **)(lVar7 + 0x40);
    uVar8 = 8;
    lVar15 = func_0x00187bd0(uVar23,8);
    if (lVar15 == 0) goto LAB_004f9a40;
    if (uVar21 != 0) {
      puVar9 = (undefined1 *)(lVar15 + 0x10);
      do {
        if (uVar23 == 0) break;
        uVar8 = *puVar17;
        uVar22 = puVar17[1];
        uVar2 = *(undefined1 *)(puVar17 + 2);
        puVar17 = puVar17 + 3;
        *(undefined8 *)(puVar9 + -0x10) = uVar8;
        *(undefined8 *)(puVar9 + -8) = uVar22;
        *puVar9 = uVar2;
        uVar23 = uVar23 - 0x18;
        uVar21 = uVar21 - 1;
        puVar9 = puVar9 + 0x18;
      } while (uVar21 != 0);
    }
  }
  uVar23 = *(ulong *)(lVar7 + 0x60) * 8;
  if (*(ulong *)(lVar7 + 0x60) >> 0x3d != 0 || 0x7ffffffffffffffc < uVar23) {
    uVar8 = 0;
LAB_004f9abc:
    func_0x007a1f00(uVar8,uVar23,&UNK_009e7fe0);
    goto LAB_004f9ad0;
  }
  uVar22 = *(undefined8 *)(lVar7 + 0x58);
  if (uVar23 == 0) {
    lVar15 = 4;
  }
  else {
    uVar8 = 4;
    lVar15 = func_0x00187bd0(uVar23,4);
    if (lVar15 == 0) goto LAB_004f9abc;
  }
  _memcpy(lVar15,uVar22,uVar23);
  uVar8 = 0;
  uVar21 = *(ulong *)(lVar7 + 0x78);
  auVar3._8_8_ = 0;
  auVar3._0_8_ = uVar21;
  uVar23 = uVar21 * 0x18;
  if ((SUB168(auVar3 * ZEXT816(0x18),8) != 0) || (0x7ffffffffffffff8 < uVar23)) {
LAB_004f9a58:
    func_0x007a1f00(uVar8,uVar23,&UNK_009e7fc8);
    goto LAB_004f9ad0;
  }
  if (uVar23 == 0) {
    if (*(long *)(lVar7 + 0x1d0) == -0x8000000000000000) goto LAB_004f9394;
LAB_004f93fc:
    func_0x0045cd08(auStack_7ffffffe + 0x8000026e,lVar7 + 0x1d0);
    if (*(long *)(lVar7 + 0x1e8) == -0x8000000000000000) goto LAB_004f93a8;
LAB_004f942c:
    func_0x0045cd08(auStack_7ffffffe + 0x8000026e,lVar7 + 0x1e8);
    if (*(long *)(lVar7 + 0x200) == -0x8000000000000000) goto LAB_004f93bc;
LAB_004f9460:
    func_0x0045cd08(auStack_7ffffffe + 0x8000026e,lVar7 + 0x200);
    lVar15 = *(long *)(lVar7 + 0x218);
  }
  else {
    puVar17 = *(undefined8 **)(lVar7 + 0x70);
    uVar8 = 8;
    lVar15 = func_0x00187bd0(uVar23,8);
    if (lVar15 == 0) goto LAB_004f9a58;
    if (uVar21 != 0) {
      puVar9 = (undefined1 *)(lVar15 + 0x10);
      do {
        if (uVar23 == 0) break;
        uVar8 = *puVar17;
        uVar22 = puVar17[1];
        uVar2 = *(undefined1 *)(puVar17 + 2);
        puVar17 = puVar17 + 3;
        *(undefined8 *)(puVar9 + -0x10) = uVar8;
        *(undefined8 *)(puVar9 + -8) = uVar22;
        *puVar9 = uVar2;
        uVar23 = uVar23 - 0x18;
        uVar21 = uVar21 - 1;
        puVar9 = puVar9 + 0x18;
      } while (uVar21 != 0);
    }
    if (*(long *)(lVar7 + 0x1d0) != -0x8000000000000000) goto LAB_004f93fc;
LAB_004f9394:
    if (*(long *)(lVar7 + 0x1e8) != -0x8000000000000000) goto LAB_004f942c;
LAB_004f93a8:
    if (*(long *)(lVar7 + 0x200) != -0x8000000000000000) goto LAB_004f9460;
LAB_004f93bc:
    lVar15 = *(long *)(lVar7 + 0x218);
  }
  if (lVar15 != -0x8000000000000000) {
    func_0x0045cd08(auStack_7ffffffe + 0x8000026e,lVar7 + 0x218);
  }
  func_0x004e2918(auStack_7ffffffe + 0x8000026e,lVar7 + 0x80,&UNK_009e8898);
  uVar8 = 0;
  uVar23 = *(ulong *)(lVar7 + 0xa8);
  uVar21 = uVar23 * 0x20;
  if ((uVar23 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar21)) {
LAB_004f9a70:
    func_0x007a1f00(uVar8,uVar21,&UNK_009e7fc8);
    goto LAB_004f9ad0;
  }
  if (uVar21 == 0) {
    lVar15 = 8;
  }
  else {
    lVar19 = *(long *)(lVar7 + 0xa0);
    uVar8 = 8;
    lVar15 = func_0x00187bd0(uVar21,8);
    if (lVar15 == 0) goto LAB_004f9a70;
    if (uVar23 != 0) {
      uVar10 = 0;
      uVar14 = uVar23;
      do {
        if (uVar21 == uVar10) break;
        puVar17 = (undefined8 *)(lVar19 + uVar10);
        puVar11 = (undefined8 *)(lVar15 + uVar10);
        uVar8 = *puVar17;
        uVar24 = puVar17[3];
        uVar22 = puVar17[2];
        puVar11[1] = puVar17[1];
        *puVar11 = uVar8;
        puVar11[3] = uVar24;
        puVar11[2] = uVar22;
        uVar10 = uVar10 + 0x20;
        uVar14 = uVar14 - 1;
      } while (uVar14 != 0);
    }
  }
  *(undefined **)(unaff_x29 + -0xd8) = puVar6;
  *(undefined **)(unaff_x29 + -0xe0) = puVar13;
  *(long *)(unaff_x29 + -0xd0) = unaff_x21;
  *(ulong *)(unaff_x29 + -200) = uVar23;
  *(long *)(unaff_x29 + -0xc0) = lVar15;
  *(ulong *)(unaff_x29 + -0xb8) = uVar23;
  func_0x004e17b4(unaff_x29 + -0xa8,lVar7 + 0xb0,&UNK_009e8880);
  auVar25 = func_0x004e4980(unaff_x29 + -0x90,lVar7 + 200,&UNK_009e8880);
  uVar23 = *(ulong *)(lVar7 + 0x20);
  if (uVar23 == 5) {
    *(undefined8 *)(unaff_x29 + -0x78) = 5;
  }
  else {
    if (3 < uVar23) {
      auVar25 = (**(code **)(*(long *)(lVar7 + 0x30) + 0x38))(*(undefined8 *)(lVar7 + 0x28));
    }
    *(ulong *)(unaff_x29 + -0x78) = uVar23;
    *(undefined1 (*) [16])(unaff_x29 + -0x70) = auVar25;
  }
  uVar8 = 0;
  uVar23 = *(ulong *)(lVar7 + 0xf0) * 0x10;
  if ((*(ulong *)(lVar7 + 0xf0) >> 0x3c != 0) || (0x7ffffffffffffff8 < uVar23)) {
LAB_004f9a88:
    func_0x007a1f00(uVar8,uVar23,&UNK_009e7fe0);
    goto LAB_004f9ad0;
  }
  uVar22 = *(undefined8 *)(lVar7 + 0xe8);
  if (uVar23 == 0) {
    lVar15 = 8;
  }
  else {
    uVar8 = 8;
    lVar15 = func_0x00187bd0(uVar23,8);
    if (lVar15 == 0) goto LAB_004f9a88;
  }
  _memcpy(lVar15,uVar22,uVar23);
  uVar8 = 0;
  uVar23 = *(ulong *)(lVar7 + 0x108);
  uVar21 = uVar23 * 0x20;
  if ((uVar23 >> 0x3b != 0) || (0x7ffffffffffffff8 < uVar21)) {
LAB_004f9aa0:
    func_0x007a1f00(uVar8,uVar21,&UNK_009e7fc8);
LAB_004f9ad0:
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x4f9ad4);
    (*pcVar5)();
  }
  if (uVar21 != 0) {
    puVar17 = *(undefined8 **)(lVar7 + 0x100);
    uVar8 = 8;
    lVar7 = func_0x00187bd0(uVar21,8);
    if (lVar7 == 0) goto LAB_004f9aa0;
    if (uVar23 != 0) {
      puVar11 = (undefined8 *)(lVar7 + 0x10);
      do {
        if (uVar21 == 0) break;
        plVar18 = (long *)*puVar17;
        lVar7 = *plVar18;
        *plVar18 = lVar7 + 1;
        if (lVar7 < 0) goto LAB_004f9ad0;
        uVar8 = puVar17[1];
        uVar24 = puVar17[3];
        uVar22 = puVar17[2];
        puVar17 = puVar17 + 4;
        puVar11[-2] = plVar18;
        puVar11[-1] = uVar8;
        puVar11[1] = uVar24;
        *puVar11 = uVar22;
        uVar21 = uVar21 - 0x20;
        uVar23 = uVar23 - 1;
        puVar11 = puVar11 + 4;
      } while (uVar23 != 0);
    }
  }
  func_0x00500404(auStack_7ffffffe + 0x8000026e);
  func_0x005045fc(auStack_7ffffffe + 0x8000026e);
  func_0x004fbef8(unaff_x24,auStack_7ffffffe + 0x8000026e,auStack_7ffffffe + 0x8000026d);
  func_0x004f5ae4(auStack_7ffffffe + 0x8000026e);
LAB_004f999c:
  if ((in_stack_00000260 == 0) && (in_stack_00000250 != 0)) {
    func_0x00187bd4(in_stack_00000258,in_stack_00000250 << 4,8);
  }
  if (in_stack_00000238 != 0) {
    func_0x00187bd4(in_stack_00000240,in_stack_00000238 << 3,8);
  }
  if (in_stack_00000220 != 0) {
    func_0x00187bd4(in_stack_00000228,in_stack_00000220 << 3,8);
  }
  return;
}

