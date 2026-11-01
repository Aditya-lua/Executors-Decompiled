
void FUN_001adc9c(void)

{
  bool bVar1;
  ulong uVar2;
  undefined8 extraout_x1;
  ulong *extraout_x8;
  undefined8 extraout_x10;
  undefined1 auVar3 [16];
  ulong uStack_40;
  ulong uStack_38;
  ulong uStack_30;
  ulong uStack_28;
  
  func_0x007a28bc();
  auVar3 = func_0x007a28b0(extraout_x10,extraout_x1,&UNK_009c9a78);
  uStack_38 = 0;
  uStack_40 = 0;
  uStack_28 = 0;
  uStack_30 = 0;
  uVar2 = (**(code **)(auVar3._8_8_ + 0x20))(auVar3._0_8_,&uStack_40,0x20);
  bVar1 = (uVar2 & 1) == 0;
  if (bVar1) {
    extraout_x8[2] = uStack_38;
    extraout_x8[1] = uStack_40;
    extraout_x8[4] = uStack_28;
    extraout_x8[3] = uStack_30;
    extraout_x8[5] = 0x20;
  }
  *extraout_x8 = (ulong)!bVar1;
  return;
}

