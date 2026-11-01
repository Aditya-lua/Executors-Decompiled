
void FUN_0055ccb0(long param_1)

{
  undefined4 *puVar1;
  undefined4 uVar2;
  undefined8 uVar3;
  long unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined8 uVar4;
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  puVar1 = (undefined4 *)(unaff_x23 + unaff_x24 * 0x10);
  uVar2 = *puVar1;
  uVar4 = *(undefined8 *)(puVar1 + 2);
  _memcpy(unaff_x19 + 0xb8,param_1 + unaff_x25 * 0x18,unaff_x22 * 0x18);
  _memcpy();
  *(short *)(unaff_x23 + 0x1c2) = (short)unaff_x24;
  unaff_x20[1] = in_stack_00000008;
  *unaff_x20 = in_stack_00000000;
  unaff_x20[2] = in_stack_00000010;
  uVar3 = *(undefined8 *)(unaff_x21 + 8);
  *(undefined4 *)(unaff_x20 + 3) = uVar2;
  unaff_x20[4] = uVar4;
  unaff_x20[5] = unaff_x23;
  unaff_x20[6] = uVar3;
  unaff_x20[7] = unaff_x19;
  unaff_x20[8] = 0;
  return;
}

