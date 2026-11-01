
byte FUN_0046edd8(void)

{
  byte bVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined8 uVar4;
  code *pcVar5;
  undefined8 *in_stack_00000000;
  byte bStack0000000000000008;
  byte bStack0000000000000009;
  
  func_0x004653b0();
  bVar1 = bStack0000000000000009 | bStack0000000000000008;
  if ((bStack0000000000000009 == 1) && ((_bStack0000000000000008 & 1) == 0)) {
    if (*(char *)((long)in_stack_00000000 + 0x12) < '\0') {
      uVar2 = *in_stack_00000000;
      pcVar5 = *(code **)(in_stack_00000000[1] + 0x18);
      puVar3 = &UNK_00893e25;
      uVar4 = 1;
    }
    else {
      uVar2 = *in_stack_00000000;
      pcVar5 = *(code **)(in_stack_00000000[1] + 0x18);
      puVar3 = &UNK_00893e26;
      uVar4 = 2;
    }
    bVar1 = (*pcVar5)(uVar2,puVar3,uVar4);
  }
  return bVar1 & 1;
}

