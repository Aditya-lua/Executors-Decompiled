
void FUN_00585824(long *param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  long *plVar1;
  code *pcVar2;
  long lVar3;
  long lVar4;
  long *plVar5;
  long lVar6;
  ulong uVar7;
  undefined8 *puVar8;
  undefined1 auVar9 [16];
  undefined8 uStack0000000000000008;
  undefined8 uStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  undefined8 uStack_60;
  undefined8 uStack_58;
  
  lVar3 = *param_1;
  *param_1 = lVar3 + -1;
  LORelease();
  if (lVar3 == 1) {
    func_0x005d2ac4(&uStack0000000000000008);
  }
  __Unwind_Resume();
  auVar9 = func_0x007a2668();
  lVar3 = auVar9._0_8_;
  plVar1 = (long *)*param_4;
  lVar6 = param_4[1];
  if (lVar3 != auVar9._8_8_) {
    uVar7 = (ulong)(auVar9._8_8_ - lVar3) / 0x48;
    puVar8 = (undefined8 *)(param_4[2] + lVar6 * 0x48);
    lVar3 = lVar3 + 8;
    do {
      plVar5 = *(long **)(lVar3 + -8);
      lVar4 = *plVar5;
      *plVar5 = lVar4 + 1;
      if (lVar4 < 0) {
        func_0x007a05dc();
                    /* WARNING: Does not return */
        pcVar2 = (code *)SoftwareBreakpoint(1,0x585928);
        (*pcVar2)();
      }
      func_0x005882f4(&uStack_90,lVar3);
      puVar8[1] = uStack_90;
      *puVar8 = plVar5;
      puVar8[8] = uStack_58;
      puVar8[5] = uStack_70;
      puVar8[4] = uStack_78;
      puVar8[7] = uStack_60;
      puVar8[6] = uStack_68;
      puVar8[3] = uStack_80;
      puVar8[2] = uStack_88;
      lVar6 = lVar6 + 1;
      puVar8 = puVar8 + 9;
      lVar3 = lVar3 + 0x48;
      uVar7 = uVar7 - 1;
    } while (uVar7 != 0);
  }
  *plVar1 = lVar6;
  return;
}

