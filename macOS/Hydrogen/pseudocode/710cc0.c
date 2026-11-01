
void FUN_00710cc0(undefined4 *param_1)

{
  ulong uVar1;
  undefined4 uVar2;
  undefined8 *puVar3;
  undefined4 *puVar4;
  undefined4 *in_x9;
  ulong in_x10;
  long in_x11;
  ulong uVar5;
  ulong uVar6;
  long unaff_x19;
  undefined4 *unaff_x20;
  
  if ((undefined4 *)(in_x11 + 4U) <= unaff_x20) {
    uVar1 = (in_x10 >> 2) + 1;
    uVar5 = uVar1 & 0x7ffffffffffffff0;
    uVar2 = *unaff_x20;
    puVar3 = (undefined8 *)(param_1 + 8);
    uVar6 = uVar5;
    do {
      puVar3[-3] = CONCAT44(uVar2,uVar2);
      puVar3[-4] = CONCAT44(uVar2,uVar2);
      puVar3[-1] = CONCAT44(uVar2,uVar2);
      puVar3[-2] = CONCAT44(uVar2,uVar2);
      puVar3[1] = CONCAT44(uVar2,uVar2);
      *puVar3 = CONCAT44(uVar2,uVar2);
      puVar3[3] = CONCAT44(uVar2,uVar2);
      puVar3[2] = CONCAT44(uVar2,uVar2);
      uVar6 = uVar6 - 0x10;
      puVar3 = puVar3 + 8;
    } while (uVar6 != 0);
    param_1 = param_1 + uVar5;
    if (uVar1 == uVar5) goto LAB_00710d14;
  }
  do {
    puVar4 = param_1 + 1;
    *param_1 = *unaff_x20;
    param_1 = puVar4;
  } while (puVar4 != in_x9);
LAB_00710d14:
  *(undefined4 **)(unaff_x19 + 8) = in_x9;
  return;
}

