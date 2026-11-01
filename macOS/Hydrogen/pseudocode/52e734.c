
void FUN_0052e734(void)

{
  long lVar1;
  long *plVar2;
  code *pcVar3;
  long lVar4;
  ulong uVar5;
  undefined8 uVar6;
  long lVar7;
  long *plVar8;
  undefined8 *unaff_x19;
  long unaff_x20;
  undefined8 unaff_x24;
  undefined1 auVar9 [16];
  undefined8 uStack0000000000000020;
  undefined1 uStack0000000000000050;
  undefined8 uStack0000000000000068;
  
  lVar4 = func_0x00187bd0();
  if (lVar4 == 0) {
    func_0x007a1f00(1);
  }
  else {
    _memcpy(lVar4);
    lVar4 = 0;
    lVar7 = *(long *)(unaff_x20 + 0xf0) << 4;
    uVar5 = 0xffffffffffffffff;
    plVar8 = *(long **)(unaff_x20 + 0xe8);
    do {
      uStack0000000000000020 = unaff_x24;
      if (lVar7 == 0) goto code_r0x0052e8b0;
      lVar1 = *plVar8;
      plVar2 = plVar8 + 1;
      uVar5 = uVar5 + 1;
      lVar4 = lVar4 + 0x20;
      lVar7 = lVar7 + -0x10;
      plVar8 = plVar8 + 2;
    } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
    if (uVar5 < *(ulong *)(unaff_x20 + 0x108)) {
      lVar4 = *(long *)(unaff_x20 + 0x100) + lVar4;
      lVar7 = *(long *)(lVar4 + -0x18);
      auVar9 = (**(code **)(lVar7 + 0x18))
                         (*(long *)(lVar4 + -0x20) +
                          (*(long *)(lVar7 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10);
      if (auVar9._0_8_ == 0x1414db8803bc16e0 && auVar9._8_8_ == 0x4f7557bbe08e4383) {
code_r0x0052e8b0:
        func_0x00525f7c(&uStack0000000000000050,&uStack0000000000000068,8,0);
        uVar6 = func_0x0051d650();
        func_0x004e4220(&uStack0000000000000068);
        uStack0000000000000020 = CONCAT71(uStack0000000000000020._1_7_,5);
        uVar6 = func_0x0051b078(uVar6,0xe,&uStack0000000000000020);
        *unaff_x19 = 0x8000000000000000;
        unaff_x19[1] = uVar6;
        return;
      }
      func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
    }
    else {
      func_0x007a2570(uVar5,*(ulong *)(unaff_x20 + 0x108),&UNK_009e9b68);
    }
  }
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x52e9f8);
  (*pcVar3)();
}

