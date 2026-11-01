
void thunk_FUN_001c0548(void)

{
  uint uVar1;
  long lVar2;
  long lVar3;
  long *plVar4;
  undefined8 extraout_x1;
  undefined8 *extraout_x8;
  undefined8 *extraout_x8_00;
  ulong uVar5;
  long lVar6;
  ulong uVar7;
  long unaff_x20;
  undefined8 uStack0000000000000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  
  func_0x007a204c();
  func_0x007a23bc(&UNK_009c2900);
  func_0x007a2080();
  func_0x007a2080(-unaff_x20,extraout_x1,&UNK_009c2960);
  func_0x007a28bc();
  func_0x007a28b0();
  uStack0000000000000040 = &UNK_009c9d40;
  in_stack_00000048 = 1;
  in_stack_00000058 = 0;
  in_stack_00000060 = 0;
  in_stack_00000050 = 8;
  func_0x007a2420(&uStack0000000000000040,&UNK_009c2978);
  lVar3 = func_0x00187bd0(0x280,8);
  if (lVar3 != 0) {
    *extraout_x8 = 0x10;
    extraout_x8[1] = lVar3;
    extraout_x8[2] = 0;
    extraout_x8[3] = 0;
    return;
  }
  plVar4 = (long *)func_0x007a1f00(8,0x280,&UNK_009c29a8);
  uVar5 = plVar4[1];
  if (uVar5 == 0) {
    *extraout_x8_00 = 2;
    return;
  }
  lVar3 = *plVar4;
  *plVar4 = 1;
  plVar4[1] = 0;
  if (uVar5 < 4) {
    lVar6 = *(long *)plVar4[2];
    lVar2 = plVar4[3];
    *extraout_x8_00 = 0;
    extraout_x8_00[2] = lVar3 - lVar6;
    extraout_x8_00[3] = (lVar3 - lVar6) + uVar5;
    *(int *)(extraout_x8_00 + 4) = (int)lVar2;
    return;
  }
  uVar1 = ((uint)*(byte *)(lVar3 + 1) << 8 | (uint)*(byte *)(lVar3 + 3) << 0x18) >> 8;
  uVar7 = (ulong)((uVar1 | (uint)*(byte *)(lVar3 + 2) << 0x18) >> 0x10 | uVar1 << 0x10);
  lVar2 = (uVar5 - 4) - uVar7;
  if (uVar7 <= uVar5 - 4 && lVar2 != 0) {
    *plVar4 = lVar3 + uVar7 + 4;
    plVar4[1] = lVar2;
    uVar5 = uVar7 + 4;
  }
  lVar6 = *(long *)plVar4[2];
  lVar2 = plVar4[3];
  *extraout_x8_00 = 1;
  extraout_x8_00[1] = uVar7;
  extraout_x8_00[2] = lVar3 - lVar6;
  extraout_x8_00[3] = (lVar3 - lVar6) + uVar5;
  *(int *)(extraout_x8_00 + 4) = (int)lVar2;
  return;
}

