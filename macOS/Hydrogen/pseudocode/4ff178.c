
void FUN_004ff178(void)

{
  long lVar1;
  long *plVar2;
  undefined1 auVar3 [16];
  code *pcVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  long *plVar8;
  undefined8 *unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  undefined1 auVar9 [16];
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  
  auVar3._8_8_ = unaff_x22;
  auVar3._0_8_ = unaff_x23;
  lVar6 = 0;
  uStack0000000000000000 = 0;
  uStack0000000000000008 = 1;
  uStack0000000000000010 = 0;
  lVar7 = *(long *)(unaff_x20 + 0xf0) << 4;
  uVar5 = 0xffffffffffffffff;
  plVar8 = *(long **)(unaff_x20 + 0xe8);
  do {
    if (lVar7 == 0) goto LAB_004ff214;
    lVar1 = *plVar8;
    plVar2 = plVar8 + 1;
    uVar5 = uVar5 + 1;
    lVar6 = lVar6 + 0x20;
    lVar7 = lVar7 + -0x10;
    plVar8 = plVar8 + 2;
  } while (lVar1 != unaff_x23 || *plVar2 != unaff_x22);
  if (uVar5 < *(ulong *)(unaff_x20 + 0x108)) {
    lVar6 = *(long *)(unaff_x20 + 0x100) + lVar6;
    lVar7 = *(long *)(lVar6 + -0x18);
    auVar9 = (**(code **)(lVar7 + 0x18))
                       (*(long *)(lVar6 + -0x20) +
                        (*(long *)(lVar7 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
    if (auVar9 == auVar3) {
LAB_004ff214:
      func_0x00523f08();
      unaff_x19[1] = uStack0000000000000008;
      *unaff_x19 = uStack0000000000000000;
      unaff_x19[2] = uStack0000000000000010;
      return;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar5,*(ulong *)(unaff_x20 + 0x108),&UNK_009e9b68);
  }
                    /* WARNING: Does not return */
  pcVar4 = (code *)SoftwareBreakpoint(1,0x4ff278);
  (*pcVar4)();
}

