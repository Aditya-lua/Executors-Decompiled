
byte FUN_0046eda8(undefined8 param_1,undefined8 *param_2)

{
  byte bVar1;
  byte bVar2;
  undefined8 uVar3;
  undefined *puVar4;
  undefined8 uVar5;
  code *pcVar6;
  undefined8 *unaff_x19;
  byte bStack0000000000000009;
  
  bVar1 = (**(code **)(param_2[1] + 0x18))(*param_2,&UNK_00894be1,7);
  bStack0000000000000009 = 0;
  func_0x004653b0();
  bVar2 = bStack0000000000000009 | bVar1;
  if ((bStack0000000000000009 == 1) && ((bVar1 & 1) == 0)) {
    if (*(char *)((long)unaff_x19 + 0x12) < '\0') {
      uVar3 = *unaff_x19;
      pcVar6 = *(code **)(unaff_x19[1] + 0x18);
      puVar4 = &UNK_00893e25;
      uVar5 = 1;
    }
    else {
      uVar3 = *unaff_x19;
      pcVar6 = *(code **)(unaff_x19[1] + 0x18);
      puVar4 = &UNK_00893e26;
      uVar5 = 2;
    }
    bVar2 = (*pcVar6)(uVar3,puVar4,uVar5);
  }
  return bVar2 & 1;
}

