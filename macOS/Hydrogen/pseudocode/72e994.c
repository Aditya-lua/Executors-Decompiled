
undefined8 FUN_0072e994(long param_1)

{
  long in_x9;
  long unaff_x19;
  long unaff_x20;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  
  uVar2 = *(undefined8 *)(param_1 + 0xd4);
  uVar1 = *(undefined8 *)(param_1 + 0xcc);
  uVar4 = *(undefined8 *)(param_1 + 0xe4);
  uVar3 = *(undefined8 *)(param_1 + 0xdc);
  uVar6 = *(undefined8 *)(param_1 + 0xf4);
  uVar5 = *(undefined8 *)(param_1 + 0xec);
  *(undefined4 *)(&UNK_00001414 + unaff_x19) = *(undefined4 *)(param_1 + 0xfc);
  *(undefined8 *)(in_x9 + 0xbc) = uVar6;
  *(undefined8 *)(in_x9 + 0xb4) = uVar5;
  *(undefined8 *)(in_x9 + 0xac) = uVar4;
  *(undefined8 *)(in_x9 + 0xa4) = uVar3;
  *(undefined8 *)(in_x9 + 0x9c) = uVar2;
  *(undefined8 *)(in_x9 + 0x94) = uVar1;
  *(undefined4 *)(&UNK_00001418 + unaff_x19) = *(undefined4 *)(*(long *)(unaff_x20 + 0x18) + 0x518);
  return 0;
}

