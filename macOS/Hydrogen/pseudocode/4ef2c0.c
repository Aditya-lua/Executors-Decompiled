
undefined8 FUN_004ef2c0(void)

{
  undefined *puVar1;
  undefined8 uVar2;
  long lVar3;
  long *plVar4;
  long lVar5;
  code *pcVar6;
  long lVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  long *plVar11;
  long unaff_x19;
  undefined *puVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  long lVar15;
  long unaff_x29;
  undefined1 auVar16 [16];
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000098;
  long in_stack_000000a0;
  long in_stack_000000a8;
  
  uVar13 = *(undefined8 *)(unaff_x19 + 0x10);
  func_0x00538438(unaff_x29 + -0xa0);
  uVar2 = *(undefined8 *)(unaff_x29 + -0x98);
  lVar5 = *(long *)(unaff_x29 + -0x90);
  if (lVar5 < 0) {
    uVar14 = 0;
LAB_004ef7f4:
    func_0x007a1f00(uVar14,lVar5,&UNK_009e80a0);
  }
  else {
    if (lVar5 == 0) {
      lVar7 = 1;
    }
    else {
      uVar14 = 1;
      lVar7 = func_0x00187bd0(lVar5,1);
      if (lVar7 == 0) goto LAB_004ef7f4;
    }
    _memcpy(lVar7,uVar2,lVar5);
    lVar9 = 0;
    uStack0000000000000020 = 0x8000000000000000;
    lVar15 = *(long *)(unaff_x19 + 0x10);
    lVar10 = *(long *)(lVar15 + 0xf0) << 4;
    uVar8 = 0xffffffffffffffff;
    plVar11 = *(long **)(lVar15 + 0xe8);
    do {
      uStack0000000000000098 = lVar5;
      in_stack_000000a0 = lVar7;
      in_stack_000000a8 = lVar5;
      if (lVar10 == 0) {
        puVar12 = (undefined *)0x0;
        goto LAB_004ef5f0;
      }
      lVar3 = *plVar11;
      plVar4 = plVar11 + 1;
      uVar8 = uVar8 + 1;
      lVar9 = lVar9 + 0x20;
      lVar10 = lVar10 + -0x10;
      plVar11 = plVar11 + 2;
    } while (lVar3 != 0x1414db8803bc16e0 || *plVar4 != 0x4f7557bbe08e4383);
    if (uVar8 < *(ulong *)(lVar15 + 0x108)) {
      lVar9 = *(long *)(lVar15 + 0x100) + lVar9;
      lVar5 = *(long *)(lVar9 + -0x18);
      puVar12 = (undefined *)
                (*(long *)(lVar9 + -0x20) + (*(long *)(lVar5 + 0x10) - 1U & 0xfffffffffffffff0) +
                0x10);
      auVar16 = (**(code **)(lVar5 + 0x18))(puVar12);
      if (auVar16._0_8_ == 0x1414db8803bc16e0 && auVar16._8_8_ == 0x4f7557bbe08e4383) {
LAB_004ef5f0:
        puVar1 = &UNK_008a7b62;
        if (puVar12 != (undefined *)0x0) {
          puVar1 = puVar12;
        }
        *(long *)(unaff_x29 + -0x70) = lVar15;
        *(undefined **)(unaff_x29 + -0x68) = puVar1;
        *(undefined8 *)(unaff_x29 + -0x60) = 0;
        func_0x00525f7c(unaff_x29 + -0x88,unaff_x29 + -0x70,8,0);
        uVar13 = func_0x0051d650(uVar13,&uStack0000000000000098,&uStack0000000000000020);
        if ((*(ulong *)(unaff_x29 + -0xa0) | 0x8000000000000000) != 0x8000000000000000) {
          func_0x00187bd4(uVar2,*(ulong *)(unaff_x29 + -0xa0),1);
        }
        return uVar13;
      }
      func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    }
    else {
      func_0x007a2570(uVar8,*(ulong *)(lVar15 + 0x108),&UNK_009e9b68);
    }
  }
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x4ef8e8);
  (*pcVar6)();
}

