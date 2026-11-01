
byte FUN_0046ed64(undefined8 param_1,undefined8 param_2,long param_3)

{
  byte bVar1;
  undefined8 uVar2;
  undefined8 extraout_x1;
  undefined8 *puVar3;
  undefined *puVar4;
  undefined8 uVar5;
  code *pcVar6;
  undefined1 auVar7 [16];
  undefined8 *puStack_30;
  byte bStack_28;
  byte bStack_27;
  
  func_0x007a28b0(param_2,0x122,param_3 + 0xa70);
  func_0x007a28b0(extraout_x1,0xd0,&UNK_009e0a70);
  auVar7 = func_0x007a23bc(&UNK_009e0a58);
  puVar3 = auVar7._8_8_;
  bStack_28 = (**(code **)(puVar3[1] + 0x18))(*puVar3,&UNK_00894be1,7);
  bStack_27 = 0;
  puStack_30 = puVar3;
  func_0x004653b0(&puStack_30,&UNK_00894be8,5,auVar7._0_8_,&UNK_009e0ad0);
  bVar1 = bStack_27 | bStack_28;
  if ((bStack_27 == 1) && ((bStack_28 & 1) == 0)) {
    if (*(char *)((long)puStack_30 + 0x12) < '\0') {
      uVar2 = *puStack_30;
      pcVar6 = *(code **)(puStack_30[1] + 0x18);
      puVar4 = &UNK_00893e25;
      uVar5 = 1;
    }
    else {
      uVar2 = *puStack_30;
      pcVar6 = *(code **)(puStack_30[1] + 0x18);
      puVar4 = &UNK_00893e26;
      uVar5 = 2;
    }
    bVar1 = (*pcVar6)(uVar2,puVar4,uVar5);
  }
  return bVar1 & 1;
}

