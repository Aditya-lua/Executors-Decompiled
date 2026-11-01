
undefined8 FUN_004eef38(void)

{
  long lVar1;
  long *plVar2;
  code *pcVar3;
  ulong uVar4;
  undefined8 uVar5;
  long lVar6;
  long lVar7;
  long *plVar8;
  long unaff_x19;
  undefined *puVar9;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  long lVar10;
  long unaff_x25;
  long unaff_x29;
  undefined1 auVar11 [16];
  undefined8 uStack0000000000000020;
  undefined *in_stack_00000028;
  undefined8 in_stack_00000030;
  
  _memcpy();
  lVar6 = 0;
  *(undefined8 *)(unaff_x29 + -0xa0) = unaff_x21;
  *(undefined8 *)(unaff_x29 + -0x98) = unaff_x22;
  *(undefined8 *)(unaff_x29 + -0x90) = unaff_x21;
  lVar10 = *(long *)(unaff_x19 + 0x10);
  lVar7 = *(long *)(lVar10 + 0xf0) << 4;
  uVar4 = 0xffffffffffffffff;
  plVar8 = *(long **)(lVar10 + 0xe8);
  do {
    if (lVar7 == 0) {
      puVar9 = (undefined *)0x0;
      goto code_r0x004eeff4;
    }
    lVar1 = *plVar8;
    plVar2 = plVar8 + 1;
    uVar4 = uVar4 + 1;
    lVar6 = lVar6 + 0x20;
    lVar7 = lVar7 + -0x10;
    plVar8 = plVar8 + 2;
  } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != unaff_x25);
  if (uVar4 < *(ulong *)(lVar10 + 0x108)) {
    lVar6 = *(long *)(lVar10 + 0x100) + lVar6;
    lVar7 = *(long *)(lVar6 + -0x18);
    puVar9 = (undefined *)
             (*(long *)(lVar6 + -0x20) + (*(long *)(lVar7 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10)
    ;
    auVar11 = (**(code **)(lVar7 + 0x18))(puVar9);
    if (auVar11._0_8_ == 0x1414db8803bc16e0 && auVar11._8_8_ == unaff_x25) {
code_r0x004eeff4:
      in_stack_00000028 = &UNK_008a7b62;
      if (puVar9 != (undefined *)0x0) {
        in_stack_00000028 = puVar9;
      }
      in_stack_00000030 = 0;
      uStack0000000000000020 = lVar10;
      func_0x00525f7c(unaff_x29 + -0x70,&uStack0000000000000020,8,0);
      uVar5 = func_0x0051dd78();
      if ((*(ulong *)(unaff_x29 + -0x88) | 0x8000000000000000) != 0x8000000000000000) {
        func_0x00187bd4();
      }
      return uVar5;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar4,*(ulong *)(lVar10 + 0x108),&UNK_009e9b68);
  }
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4ef8e8);
  (*pcVar3)();
}

