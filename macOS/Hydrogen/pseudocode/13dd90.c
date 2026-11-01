
void FUN_0013dd90(void)

{
  long lVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  long unaff_x19;
  undefined8 *unaff_x20;
  uint unaff_w21;
  long *unaff_x22;
  long lVar5;
  long unaff_x23;
  long unaff_x24;
  long *unaff_x25;
  long unaff_x26;
  int unaff_w27;
  uint unaff_w28;
  undefined8 uVar6;
  int in_stack_00000000;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  undefined8 in_stack_00000048;
  long in_stack_00000058;
  
  _memmove();
  lVar1 = unaff_x23 + unaff_x26;
  *unaff_x25 = lVar1;
  if ((4 < unaff_w28) && (unaff_w27 < (int)((ulong)(lVar1 - *unaff_x22) >> 2) * -0x55555555)) {
    lVar5 = *unaff_x22 + (long)in_stack_00000000 * 0xc;
    lVar1 = lVar1 - (lVar5 + 0xc);
    if (lVar1 != 0) {
      _memmove(lVar5,lVar5 + 0xc,lVar1 + -3);
    }
    *unaff_x25 = lVar5 + lVar1;
  }
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  uVar4 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) * -0x55555555;
  uVar3 = unaff_w21 + 1;
  if ((int)uVar4 <= (int)(unaff_w21 + 1)) {
    uVar3 = uVar4;
  }
  uVar4 = *(uint *)(unaff_x19 + 0x6c);
  if ((int)unaff_w21 <= (int)*(uint *)(unaff_x19 + 0x6c)) {
    uVar4 = unaff_w21;
  }
  uVar2 = *(uint *)(unaff_x19 + 0x70);
  if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar3) {
    uVar2 = uVar3;
  }
  uVar4 = uVar4 & ((int)uVar4 >> 0x1f ^ 0xffffffffU);
  uVar3 = uVar4;
  if ((int)uVar4 <= (int)uVar2) {
    uVar3 = uVar2;
  }
  *(uint *)(unaff_x19 + 0x6c) = uVar4;
  *(uint *)(unaff_x19 + 0x70) = uVar3;
  *(undefined1 *)(unaff_x19 + 0x248) = 1;
  uVar6 = *unaff_x20;
  *(undefined8 *)(unaff_x24 + 0x70) = unaff_x20[1];
  *(undefined8 *)(unaff_x24 + 0x68) = uVar6;
  func_0x00139988();
  if (in_stack_00000058 < 0) {
    __ZdlPv(in_stack_00000048);
  }
  if (in_stack_00000030 < 0) {
    __ZdlPv(in_stack_00000020);
  }
  return;
}

