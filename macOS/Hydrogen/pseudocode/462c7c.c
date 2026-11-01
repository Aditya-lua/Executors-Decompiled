
uint FUN_00462c7c(void)

{
  uint uVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined8 uVar4;
  uint in_w8;
  code *pcVar5;
  uint in_w9;
  undefined8 *in_stack_00000008;
  
  uVar1 = in_w9 | in_w8;
  if ((in_w9 == 1) && ((in_w8 & 1) == 0)) {
    if (*(char *)((long)in_stack_00000008 + 0x12) < '\0') {
      uVar2 = *in_stack_00000008;
      pcVar5 = *(code **)(in_stack_00000008[1] + 0x18);
      puVar3 = &UNK_00893e25;
      uVar4 = 1;
    }
    else {
      uVar2 = *in_stack_00000008;
      pcVar5 = *(code **)(in_stack_00000008[1] + 0x18);
      puVar3 = &UNK_00893e26;
      uVar4 = 2;
    }
    uVar1 = (*pcVar5)(uVar2,puVar3,uVar4);
  }
  return uVar1 & 1;
}

