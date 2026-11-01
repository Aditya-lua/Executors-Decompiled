
uint FUN_00462c94(undefined8 *param_1)

{
  uint uVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined8 uVar4;
  code *pcVar5;
  uint in_w9;
  
  if ((in_w9 >> 7 & 1) == 0) {
    uVar2 = *param_1;
    pcVar5 = *(code **)(param_1[1] + 0x18);
    puVar3 = &UNK_00893e26;
    uVar4 = 2;
  }
  else {
    uVar2 = *param_1;
    pcVar5 = *(code **)(param_1[1] + 0x18);
    puVar3 = &UNK_00893e25;
    uVar4 = 1;
  }
  uVar1 = (*pcVar5)(uVar2,puVar3,uVar4);
  return uVar1 & 1;
}

