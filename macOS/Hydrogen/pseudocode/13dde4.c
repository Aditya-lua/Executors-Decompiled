
void FUN_0013dde4(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  long unaff_x19;
  undefined8 *unaff_x20;
  uint unaff_w21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  undefined8 uVar4;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined8 in_stack_00000048;
  long in_stack_00000058;
  
  _memmove();
  *unaff_x25 = unaff_x22 + unaff_x23;
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  uVar3 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) * -0x55555555;
  uVar2 = unaff_w21 + 1;
  if ((int)uVar3 <= (int)(unaff_w21 + 1)) {
    uVar2 = uVar3;
  }
  uVar3 = *(uint *)(unaff_x19 + 0x6c);
  if ((int)unaff_w21 <= (int)*(uint *)(unaff_x19 + 0x6c)) {
    uVar3 = unaff_w21;
  }
  uVar1 = *(uint *)(unaff_x19 + 0x70);
  if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar2) {
    uVar1 = uVar2;
  }
  uVar3 = uVar3 & ((int)uVar3 >> 0x1f ^ 0xffffffffU);
  uVar2 = uVar3;
  if ((int)uVar3 <= (int)uVar1) {
    uVar2 = uVar1;
  }
  *(uint *)(unaff_x19 + 0x6c) = uVar3;
  *(uint *)(unaff_x19 + 0x70) = uVar2;
  *(undefined1 *)(unaff_x19 + 0x248) = 1;
  uVar4 = *unaff_x20;
  *(undefined8 *)(unaff_x24 + 0x70) = unaff_x20[1];
  *(undefined8 *)(unaff_x24 + 0x68) = uVar4;
  func_0x00139988();
  if (in_stack_00000058 < 0) {
    __ZdlPv(in_stack_00000048);
  }
  if (in_stack_00000030 < 0) {
    __ZdlPv(in_stack_00000020);
  }
  return;
}

