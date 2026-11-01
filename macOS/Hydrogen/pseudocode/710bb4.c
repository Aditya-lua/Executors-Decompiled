
void FUN_00710bb4(undefined4 *param_1)

{
  undefined4 uVar1;
  undefined4 *puVar3;
  undefined4 *puVar2;
  ulong uVar4;
  ulong uVar5;
  undefined8 *puVar6;
  ulong uVar7;
  long unaff_x19;
  undefined4 *unaff_x20;
  long unaff_x21;
  
  uVar1 = *unaff_x20;
  uVar4 = unaff_x21 - 1U & 0x3fffffffffffffff;
  puVar2 = param_1;
  if (0xe < uVar4) {
    uVar4 = uVar4 + 1;
    uVar5 = uVar4 & 0x7ffffffffffffff0;
    puVar6 = (undefined8 *)(param_1 + 8);
    uVar7 = uVar5;
    do {
      puVar6[-3] = CONCAT44(uVar1,uVar1);
      puVar6[-4] = CONCAT44(uVar1,uVar1);
      puVar6[-1] = CONCAT44(uVar1,uVar1);
      puVar6[-2] = CONCAT44(uVar1,uVar1);
      puVar6[1] = CONCAT44(uVar1,uVar1);
      *puVar6 = CONCAT44(uVar1,uVar1);
      puVar6[3] = CONCAT44(uVar1,uVar1);
      puVar6[2] = CONCAT44(uVar1,uVar1);
      uVar7 = uVar7 - 0x10;
      puVar6 = puVar6 + 8;
    } while (uVar7 != 0);
    puVar2 = param_1 + uVar5;
    if (uVar4 == uVar5) goto LAB_00710d2c;
  }
  do {
    puVar3 = puVar2 + 1;
    *puVar2 = uVar1;
    puVar2 = puVar3;
  } while (puVar3 != param_1 + unaff_x21);
LAB_00710d2c:
  *(undefined4 **)(unaff_x19 + 8) = param_1 + unaff_x21;
  return;
}

