
void FUN_006f0198(long param_1,undefined1 param_2 [16],undefined1 param_3 [16])

{
  long unaff_x23;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  
  *(long *)(&UNK_00001ab8 + unaff_x23) = param_2._8_8_;
  *(long *)(&UNK_00001ab0 + unaff_x23) = param_2._0_8_;
  *(long *)(&UNK_00001ac8 + unaff_x23) = param_3._8_8_;
  *(long *)(&UNK_00001ac0 + unaff_x23) = param_3._0_8_;
  uVar3 = *(undefined8 *)(param_1 + 0x118);
  uVar2 = *(undefined8 *)(param_1 + 0x110);
  uVar1 = *(undefined8 *)(param_1 + 0x120);
  *(undefined8 *)(&UNK_00001a68 + unaff_x23) = *(undefined8 *)(param_1 + 0x128);
  *(undefined8 *)(&UNK_00001a60 + unaff_x23) = uVar1;
  uVar1 = *(undefined8 *)(param_1 + 0x130);
  uVar5 = *(undefined8 *)(param_1 + 0x148);
  uVar4 = *(undefined8 *)(param_1 + 0x140);
  *(undefined8 *)(&UNK_00001a78 + unaff_x23) = *(undefined8 *)(param_1 + 0x138);
  *(undefined8 *)(&UNK_00001a70 + unaff_x23) = uVar1;
  *(undefined8 *)(&UNK_00001a88 + unaff_x23) = uVar5;
  *(undefined8 *)(&UNK_00001a80 + unaff_x23) = uVar4;
  uVar1 = *(undefined8 *)(param_1 + 0xf0);
  uVar5 = *(undefined8 *)(param_1 + 0x108);
  uVar4 = *(undefined8 *)(param_1 + 0x100);
  *(undefined8 *)(&UNK_00001a38 + unaff_x23) = *(undefined8 *)(param_1 + 0xf8);
  *(undefined8 *)(&UNK_00001a30 + unaff_x23) = uVar1;
  *(undefined8 *)(&UNK_00001a48 + unaff_x23) = uVar5;
  *(undefined8 *)(&UNK_00001a40 + unaff_x23) = uVar4;
  *(long *)(&UNK_00001a28 + unaff_x23) = *(long *)(&UNK_00001a28 + unaff_x23) + 1;
  uVar1 = *(undefined8 *)(unaff_x23 + 0x40);
  uVar4 = *(undefined8 *)(unaff_x23 + 0x48);
  *(undefined8 *)(&UNK_00001bd8 + unaff_x23) = uVar4;
  *(undefined8 *)(&UNK_00001b00 + unaff_x23) = uVar4;
  *(undefined8 *)(&UNK_00001a58 + unaff_x23) = uVar3;
  *(undefined8 *)(&UNK_00001a50 + unaff_x23) = uVar2;
  *(undefined8 *)(&UNK_00001bd8 + unaff_x23) = 0;
  *(undefined8 *)(param_1 + 0x1a8) = 0;
  *(undefined8 *)(param_1 + 0x1a0) = 0;
  *(undefined8 *)(param_1 + 0x1b8) = 0;
  *(undefined8 *)(param_1 + 0x1b0) = 0;
  *(undefined8 *)(param_1 + 0x188) = 0;
  *(undefined8 *)(param_1 + 0x180) = 0;
  *(undefined8 *)(param_1 + 0x198) = 0;
  *(undefined8 *)(param_1 + 400) = 0;
  *(undefined8 *)(param_1 + 0x168) = 0;
  *(undefined8 *)(param_1 + 0x160) = 0;
  *(undefined8 *)(param_1 + 0x178) = 0;
  *(undefined8 *)(param_1 + 0x170) = 0;
  *(undefined8 *)(param_1 + 0x148) = 0;
  *(undefined8 *)(param_1 + 0x140) = 0;
  *(undefined8 *)(param_1 + 0x158) = 0;
  *(undefined8 *)(param_1 + 0x150) = 0;
  *(undefined8 *)(param_1 + 0x128) = 0;
  *(undefined8 *)(param_1 + 0x120) = 0;
  *(undefined8 *)(param_1 + 0x138) = 0;
  *(undefined8 *)(param_1 + 0x130) = 0;
  *(undefined8 *)(param_1 + 0x108) = 0;
  *(undefined8 *)(param_1 + 0x100) = 0;
  *(undefined8 *)(param_1 + 0x118) = 0;
  *(undefined8 *)(param_1 + 0x110) = 0;
  *(undefined8 *)(param_1 + 0xf0) = uVar4;
  *(undefined8 *)(&UNK_00001b10 + unaff_x23) = uVar1;
  if (*(code **)(unaff_x23 + 0x4e0) != (code *)0x0) {
    (**(code **)(unaff_x23 + 0x4e0))();
  }
  return;
}

