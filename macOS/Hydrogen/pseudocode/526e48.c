
void FUN_00526e48(void)

{
  undefined *puVar1;
  long lVar2;
  long *plVar3;
  code *pcVar4;
  long lVar5;
  undefined8 *puVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  undefined *puVar10;
  long lVar11;
  undefined8 uVar12;
  ulong uVar13;
  long unaff_x26;
  ulong uVar14;
  long lVar15;
  long unaff_x28;
  undefined8 *puVar16;
  long unaff_x29;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined1 auVar19 [16];
  long in_stack_00000520;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (unaff_x26 == 0) {
    lVar5 = 8;
  }
  else {
    lVar5 = func_0x00187bd0();
    if (lVar5 == 0) {
      func_0x007a1f00(8);
      goto LAB_00527418;
    }
  }
  _memcpy(lVar5);
  uVar12 = 0;
  uVar13 = *(ulong *)(unaff_x28 + 0x108);
  uVar14 = uVar13 * 0x20;
  if ((uVar13 >> 0x3b == 0) && (uVar14 < 0x7ffffffffffffff9)) {
    if (uVar14 == 0) {
LAB_00526f28:
      lVar5 = *(long *)(unaff_x29 + -0xa8);
      func_0x00500404(auStack_7ffffffe + 0x800001fe);
      func_0x005045fc(auStack_7ffffffe + 0x800001fe);
      if (lVar5 != 0) {
        lVar11 = 0;
        lVar5 = in_stack_00000520 + lVar5 * 0x2c8;
        do {
          lVar15 = in_stack_00000520;
          while ((*(char *)(lVar15 + 0x2be) < '\0' || (*(char *)(lVar15 + 0x2c2) < '\0'))) {
            lVar15 = lVar15 + 0x2c8;
            if (lVar15 == lVar5) goto code_r0x005266b8;
          }
          if (lVar11 != 0) {
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
          lVar7 = 0;
          lVar11 = lVar11 + 1;
          in_stack_00000520 = lVar15 + 0x2c8;
          lVar8 = *(long *)(lVar15 + 0xf0) << 4;
          uVar13 = 0xffffffffffffffff;
          plVar9 = *(long **)(lVar15 + 0xe8);
          do {
            if (lVar8 == 0) {
              puVar10 = (undefined *)0x0;
              goto code_r0x005272cc;
            }
            lVar2 = *plVar9;
            plVar3 = plVar9 + 1;
            uVar13 = uVar13 + 1;
            lVar7 = lVar7 + 0x20;
            lVar8 = lVar8 + -0x10;
            plVar9 = plVar9 + 2;
          } while (lVar2 != 0x1414db8803bc16e0 || *plVar3 != 0x4f7557bbe08e4383);
          if (*(ulong *)(lVar15 + 0x108) <= uVar13) {
            func_0x007a2570(uVar13,*(ulong *)(lVar15 + 0x108),&UNK_009e9b68);
            goto LAB_00527418;
          }
          lVar7 = *(long *)(lVar15 + 0x100) + lVar7;
          lVar8 = *(long *)(lVar7 + -0x18);
          puVar10 = (undefined *)
                    (*(long *)(lVar7 + -0x20) + (*(long *)(lVar8 + 0x10) - 1U & 0xfffffffffffffff0)
                    + 0x10);
          auVar19 = (**(code **)(lVar8 + 0x18))(puVar10);
          if (auVar19._0_8_ != 0x1414db8803bc16e0 || auVar19._8_8_ != 0x4f7557bbe08e4383) {
            func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
            goto LAB_00527418;
          }
code_r0x005272cc:
          puVar1 = &UNK_008a7b62;
          if (puVar10 != (undefined *)0x0) {
            puVar1 = puVar10;
          }
          *(long *)(unaff_x29 + -0xf0) = lVar15;
          *(undefined **)(unaff_x29 + -0xe8) = puVar1;
          *(undefined8 *)(unaff_x29 + -0xe0) = 0;
          func_0x00526280(unaff_x29 + -0xf0);
        } while (in_stack_00000520 != lVar5);
      }
code_r0x005266b8:
      func_0x00524d6c(auStack_7ffffffe + 0x800001fe);
      return;
    }
    puVar16 = *(undefined8 **)(unaff_x28 + 0x100);
    uVar12 = 8;
    lVar5 = func_0x00187bd0(uVar14,8);
    if (lVar5 != 0) {
      if (uVar13 != 0) {
        puVar6 = (undefined8 *)(lVar5 + 0x10);
        do {
          if (uVar14 == 0) break;
          plVar9 = (long *)*puVar16;
          lVar5 = *plVar9;
          *plVar9 = lVar5 + 1;
          if (lVar5 < 0) goto LAB_00527418;
          uVar12 = puVar16[1];
          uVar18 = puVar16[3];
          uVar17 = puVar16[2];
          puVar16 = puVar16 + 4;
          puVar6[-2] = plVar9;
          puVar6[-1] = uVar12;
          puVar6[1] = uVar18;
          *puVar6 = uVar17;
          uVar14 = uVar14 - 0x20;
          uVar13 = uVar13 - 1;
          puVar6 = puVar6 + 4;
        } while (uVar13 != 0);
      }
      goto LAB_00526f28;
    }
  }
  func_0x007a1f00(uVar12,uVar14,&UNK_009e7fc8);
LAB_00527418:
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x52741c);
  (*pcVar4)();
}

