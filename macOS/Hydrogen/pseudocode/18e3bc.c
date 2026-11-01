
void FUN_0018e3bc(void)

{
  code *pcVar1;
  undefined8 *puVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  ulong *extraout_x8;
  ulong uVar6;
  long unaff_x22;
  undefined8 uVar7;
  undefined8 uVar8;
  
  do {
    __Unwind_Resume();
    func_0x00187bd4();
  } while (unaff_x22 == 0);
  func_0x00187bd4();
  puVar2 = (undefined8 *)__Unwind_Resume();
  uVar7 = *puVar2;
  uVar3 = _CFDictionaryGetCount(uVar7);
  uVar6 = uVar3 * 8;
  if (uVar3 >> 0x3d == 0 && uVar6 < 0x7ffffffffffffff9) {
    if (uVar6 == 0) {
      uVar4 = 8;
      uVar5 = 8;
LAB_0018e47c:
      _CFDictionaryGetKeysAndValues(uVar7,uVar4,uVar5);
      *extraout_x8 = uVar3;
      extraout_x8[1] = uVar4;
      extraout_x8[2] = uVar3;
      extraout_x8[3] = uVar3;
      extraout_x8[4] = uVar5;
      extraout_x8[5] = uVar3;
      return;
    }
    uVar8 = 8;
    uVar4 = func_0x00187bd0(uVar6,8);
    if (uVar4 != 0) {
      uVar5 = func_0x00187bd0(uVar6,8);
      if (uVar5 != 0) goto LAB_0018e47c;
      goto LAB_0018e4c8;
    }
  }
  else {
    uVar8 = 0;
  }
  func_0x007a1f00(uVar8,uVar6,&UNK_009c0790);
LAB_0018e4c8:
  func_0x007a1f00(8,uVar6,&UNK_009c07a8);
                    /* WARNING: Does not return */
  pcVar1 = (code *)SoftwareBreakpoint(1,0x18e4e0);
  (*pcVar1)();
}

