
void FUN_004ff290(void)

{
  long lVar1;
  long *plVar2;
  code *pcVar3;
  long lVar4;
  ulong uVar5;
  undefined8 *extraout_x8;
  long lVar6;
  long lVar7;
  long *plVar8;
  undefined *puVar9;
  undefined1 auVar10 [16];
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  long lStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  
  func_0x00187bd4();
  lVar4 = __Unwind_Resume();
  func_0x00500450(lVar4,0);
  lVar6 = 0;
  uStack_70 = 0;
  uStack_68 = 1;
  uStack_60 = 0;
  lVar7 = *(long *)(lVar4 + 0xf0) << 4;
  uVar5 = 0xffffffffffffffff;
  plVar8 = *(long **)(lVar4 + 0xe8);
  do {
    if (lVar7 == 0) {
      puVar9 = (undefined *)0x0;
      goto code_r0x004ff380;
    }
    lVar1 = *plVar8;
    plVar2 = plVar8 + 1;
    uVar5 = uVar5 + 1;
    lVar6 = lVar6 + 0x20;
    lVar7 = lVar7 + -0x10;
    plVar8 = plVar8 + 2;
  } while (lVar1 != 0x1414db8803bc16e0 || *plVar2 != 0x4f7557bbe08e4383);
  if (uVar5 < *(ulong *)(lVar4 + 0x108)) {
    lVar6 = *(long *)(lVar4 + 0x100) + lVar6;
    lVar7 = *(long *)(lVar6 + -0x18);
    puVar9 = (undefined *)
             (*(long *)(lVar6 + -0x20) + (*(long *)(lVar7 + 0x10) - 1U & 0xfffffffffffffff0) + 0x10)
    ;
    auVar10 = (**(code **)(lVar7 + 0x18))(puVar9);
    if (auVar10._0_8_ == 0x1414db8803bc16e0 && auVar10._8_8_ == 0x4f7557bbe08e4383) {
code_r0x004ff380:
      puStack_50 = &UNK_008a7b62;
      if (puVar9 != (undefined *)0x0) {
        puStack_50 = puVar9;
      }
      uStack_48 = 0;
      lStack_58 = lVar4;
      func_0x00523f08(&uStack_70,lVar4,&lStack_58,1);
      extraout_x8[1] = uStack_68;
      *extraout_x8 = uStack_70;
      extraout_x8[2] = uStack_60;
      return;
    }
    func_0x007a23d8(&UNK_008a6820,0x22,&UNK_009e9990);
  }
  else {
    func_0x007a2570(uVar5,*(ulong *)(lVar4 + 0x108),&UNK_009e9b68);
  }
                    /* WARNING: Does not return */
  pcVar3 = (code *)SoftwareBreakpoint(1,0x4ff3e4);
  (*pcVar3)();
}

