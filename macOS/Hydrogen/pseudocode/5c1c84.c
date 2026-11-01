
void FUN_005c1c84(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  undefined1 uVar5;
  long *extraout_x8;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined1 auVar9 [16];
  
  func_0x005c0010();
  func_0x00187bd4();
  uVar5 = 8;
  func_0x00187bd4();
  __Unwind_Resume();
  func_0x007a2668();
  auVar9 = func_0x007a2668();
  puVar4 = auVar9._8_8_;
  puVar3 = auVar9._0_8_;
  puVar2 = (undefined8 *)func_0x00187bd0(0x40,8);
  if (puVar2 == (undefined8 *)0x0) {
    func_0x007a1f18(8,0x40);
  }
  else {
    uVar6 = *puVar3;
    uVar8 = puVar3[3];
    uVar7 = puVar3[2];
    puVar2[1] = puVar3[1];
    *puVar2 = uVar6;
    puVar2[3] = uVar8;
    puVar2[2] = uVar7;
    uVar6 = puVar3[4];
    uVar8 = puVar3[7];
    uVar7 = puVar3[6];
    puVar2[5] = puVar3[5];
    puVar2[4] = uVar6;
    puVar2[7] = uVar8;
    puVar2[6] = uVar7;
    puVar3 = (undefined8 *)func_0x00187bd0(0x40,8);
    if (puVar3 != (undefined8 *)0x0) {
      uVar6 = *puVar4;
      uVar8 = puVar4[3];
      uVar7 = puVar4[2];
      puVar3[1] = puVar4[1];
      *puVar3 = uVar6;
      puVar3[3] = uVar8;
      puVar3[2] = uVar7;
      uVar6 = puVar4[4];
      uVar8 = puVar4[7];
      uVar7 = puVar4[6];
      puVar3[5] = puVar4[5];
      puVar3[4] = uVar6;
      puVar3[7] = uVar8;
      puVar3[6] = uVar7;
      *extraout_x8 = (long)puVar2;
      extraout_x8[1] = (long)puVar3;
      *(undefined1 *)(extraout_x8 + 2) = uVar5;
      return;
    }
    func_0x007a1f18(8,0x40);
  }
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x5c1e54);
  (*pcVar1)();
}

