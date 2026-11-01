
void FUN_00185780(undefined8 param_1)

{
  undefined8 *puVar1;
  long lVar2;
  undefined8 uVar3;
  long *plVar4;
  long *plVar5;
  long *extraout_x8;
  long *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  ulong uVar6;
  long lVar7;
  long lVar8;
  undefined1 auVar9 [16];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  long lStack0000000000000018;
  
  lVar2 = func_0x00187bd0(param_1,1);
  if (lVar2 != 0) {
    puVar1 = unaff_x20 + unaff_x21 * 2;
    lStack0000000000000018 = 0;
    uStack0000000000000008 = unaff_x22;
    do {
      uVar3 = *unaff_x20;
      uVar6 = unaff_x20[1];
      if ((ulong)(uStack0000000000000008 - lStack0000000000000018) < uVar6) {
        func_0x0079a190(&uStack0000000000000008,lStack0000000000000018,uVar6,1,1);
      }
      _memcpy(lVar2 + lStack0000000000000018,uVar3,uVar6);
      lStack0000000000000018 = lStack0000000000000018 + uVar6;
      unaff_x20 = unaff_x20 + 2;
    } while (unaff_x20 != puVar1);
    unaff_x19[1] = lVar2;
    *unaff_x19 = uStack0000000000000008;
    unaff_x19[2] = lStack0000000000000018;
    return;
  }
  uVar3 = func_0x007a1f00();
  if (uStack0000000000000008 != 0) {
    func_0x00187bd4(in_stack_00000010,uStack0000000000000008,1);
  }
  auVar9 = __Unwind_Resume(uVar3);
  plVar5 = auVar9._8_8_;
  plVar4 = auVar9._0_8_;
  lVar2 = *plVar5;
  lVar8 = plVar5[1];
  uVar6 = plVar5[2];
  lVar7 = plVar4[2];
  if ((ulong)(*plVar4 - lVar7) < uVar6) {
    func_0x0079a190(plVar4,lVar7,uVar6,8,0x18);
    lVar7 = plVar4[2];
  }
  _memcpy(plVar4[1] + lVar7 * 0x18,lVar8,uVar6 * 0x18);
  plVar4[2] = lVar7 + uVar6;
  if (lVar2 != 0) {
    func_0x00187bd4(lVar8,lVar2 * 0x18,8);
  }
  lVar2 = plVar4[4];
  lVar7 = plVar4[7];
  lVar8 = plVar4[6];
  extraout_x8[5] = plVar4[5];
  extraout_x8[4] = lVar2;
  extraout_x8[7] = lVar7;
  extraout_x8[6] = lVar8;
  lVar2 = plVar4[8];
  lVar7 = plVar4[0xb];
  lVar8 = plVar4[10];
  extraout_x8[9] = plVar4[9];
  extraout_x8[8] = lVar2;
  extraout_x8[0xb] = lVar7;
  extraout_x8[10] = lVar8;
  lVar2 = *plVar4;
  lVar7 = plVar4[3];
  lVar8 = plVar4[2];
  extraout_x8[1] = plVar4[1];
  *extraout_x8 = lVar2;
  extraout_x8[3] = lVar7;
  extraout_x8[2] = lVar8;
  return;
}

