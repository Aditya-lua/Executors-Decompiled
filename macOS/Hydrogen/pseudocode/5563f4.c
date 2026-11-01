
void FUN_005563f4(undefined8 param_1,undefined8 param_2,undefined *param_3,undefined8 param_4)

{
  code *pcVar1;
  ulong *puVar2;
  ulong uVar3;
  ulong uVar4;
  undefined *puVar5;
  undefined *puVar6;
  long *extraout_x8;
  long *extraout_x8_00;
  undefined *puVar7;
  long lVar8;
  undefined *extraout_x9;
  long unaff_x19;
  undefined8 unaff_x20;
  long lVar9;
  undefined1 auVar10 [16];
  
  func_0x007a2668();
  *(undefined8 *)(unaff_x19 + 0x10) = unaff_x20;
  auVar10 = __Unwind_Resume();
  puVar6 = auVar10._8_8_;
  lVar9 = auVar10._0_8_;
  if (param_3 < puVar6) {
    puVar5 = &UNK_009edf90;
    func_0x007a28bc(puVar6,param_3,&UNK_009edf90);
    puVar7 = extraout_x9;
  }
  else {
    puVar7 = *(undefined **)(lVar9 + 0x10);
    puVar5 = param_3;
    if (param_3 <= puVar7) {
      *(undefined **)(lVar9 + 0x10) = puVar6;
      lVar8 = *(long *)(lVar9 + 8);
      extraout_x8[3] = (long)param_3;
      extraout_x8[4] = (long)puVar7 - (long)param_3;
      *extraout_x8 = lVar8 + (long)puVar6 * 0x108;
      extraout_x8[1] = lVar8 + (long)param_3 * 0x108;
      extraout_x8[2] = lVar9;
      return;
    }
  }
  auVar10 = func_0x007a28b0(puVar5,puVar7,&UNK_009edf90);
  uVar3 = auVar10._8_8_;
  lVar9 = auVar10._0_8_;
  uVar4 = *(ulong *)(lVar9 + 0x10);
  if (uVar3 <= uVar4) {
    *(ulong *)(lVar9 + 0x10) = uVar3;
    lVar8 = *(long *)(lVar9 + 8);
    extraout_x8_00[3] = uVar4;
    extraout_x8_00[4] = 0;
    *extraout_x8_00 = lVar8 + uVar3 * 0x40;
    extraout_x8_00[1] = lVar8 + uVar4 * 0x40;
    extraout_x8_00[2] = lVar9;
    return;
  }
  puVar6 = &UNK_009edf90;
  auVar10 = func_0x007a28bc(uVar3,uVar4,&UNK_009edf90);
  uVar3 = auVar10._8_8_;
  puVar2 = auVar10._0_8_;
  uVar4 = puVar2[2];
  if (uVar4 < uVar3) {
    func_0x007a204c(uVar3,uVar4,param_4);
                    /* WARNING: Does not return */
    pcVar1 = (code *)SoftwareBreakpoint(1,0x556568);
    (*pcVar1)();
  }
  if (uVar4 == *puVar2) {
    func_0x005bd0a4(puVar2,param_4);
  }
  lVar9 = puVar2[1] + uVar3 * 0x108;
  if (uVar3 <= uVar4 && uVar4 - uVar3 != 0) {
    _memmove(lVar9 + 0x108,lVar9,(uVar4 - uVar3) * 0x108);
  }
  _memcpy(lVar9,puVar6,0x108);
  puVar2[2] = uVar4 + 1;
  return;
}

