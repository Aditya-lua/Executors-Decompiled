
void FUN_00185930(void)

{
  long lVar1;
  long lVar2;
  undefined8 *puVar3;
  long *plVar4;
  undefined8 *extraout_x8;
  ulong uVar5;
  long lVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined1 auVar10 [16];
  
  __Unwind_Resume();
  func_0x007a2668();
  auVar10 = func_0x007a2668();
  plVar4 = auVar10._8_8_;
  puVar3 = auVar10._0_8_;
  lVar1 = *plVar4;
  lVar2 = plVar4[1];
  uVar5 = plVar4[2];
  lVar6 = puVar3[5];
  if ((ulong)(puVar3[3] - lVar6) < uVar5) {
    func_0x0079a190(puVar3 + 3,lVar6,uVar5,8,0x18);
    lVar6 = puVar3[5];
  }
  _memcpy(puVar3[4] + lVar6 * 0x18,lVar2,uVar5 * 0x18);
  puVar3[5] = lVar6 + uVar5;
  if (lVar1 != 0) {
    func_0x00187bd4(lVar2,lVar1 * 0x18,8);
  }
  uVar7 = puVar3[4];
  uVar9 = puVar3[7];
  uVar8 = puVar3[6];
  extraout_x8[5] = puVar3[5];
  extraout_x8[4] = uVar7;
  extraout_x8[7] = uVar9;
  extraout_x8[6] = uVar8;
  uVar7 = puVar3[8];
  uVar9 = puVar3[0xb];
  uVar8 = puVar3[10];
  extraout_x8[9] = puVar3[9];
  extraout_x8[8] = uVar7;
  extraout_x8[0xb] = uVar9;
  extraout_x8[10] = uVar8;
  uVar7 = *puVar3;
  uVar9 = puVar3[3];
  uVar8 = puVar3[2];
  extraout_x8[1] = puVar3[1];
  *extraout_x8 = uVar7;
  extraout_x8[3] = uVar9;
  extraout_x8[2] = uVar8;
  return;
}

