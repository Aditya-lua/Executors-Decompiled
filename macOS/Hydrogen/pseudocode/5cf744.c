
void FUN_005cf744(void)

{
  code *pcVar1;
  undefined8 uVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined8 *extraout_x8;
  long unaff_x22;
  long unaff_x23;
  long unaff_x29;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined1 auVar7 [16];
  uint7 uStack_67;
  
  uVar2 = func_0x007a2668();
  while (unaff_x23 = unaff_x23 + -1, unaff_x23 != 0) {
    func_0x0059ce88(unaff_x22);
    unaff_x22 = unaff_x22 + 0x40;
  }
  if (*(long *)(unaff_x29 + -0x48) != 0) {
    func_0x00187bd4();
  }
  __Unwind_Resume(uVar2);
  auVar7 = func_0x007a2668();
  puVar4 = auVar7._8_8_;
  puVar3 = auVar7._0_8_;
  uVar6 = puVar4[1];
  uVar5 = *puVar4;
  uVar2 = puVar4[2];
  puVar4 = (undefined8 *)func_0x00187bd0(0x28,8);
  if (puVar4 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x28);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x5cf844);
    (*pcVar1)();
  }
  puVar4[1] = (ulong)uStack_67 << 8;
  *puVar4 = 1;
  puVar4[3] = uVar6;
  puVar4[2] = uVar5;
  puVar4[4] = uVar2;
  uVar2 = *puVar3;
  uVar6 = puVar3[3];
  uVar5 = puVar3[2];
  extraout_x8[1] = puVar3[1];
  *extraout_x8 = uVar2;
  extraout_x8[3] = uVar6;
  extraout_x8[2] = uVar5;
  uVar2 = puVar3[4];
  uVar6 = puVar3[7];
  uVar5 = puVar3[6];
  extraout_x8[5] = puVar3[5];
  extraout_x8[4] = uVar2;
  extraout_x8[7] = uVar6;
  extraout_x8[6] = uVar5;
  extraout_x8[8] = puVar4;
  return;
}

