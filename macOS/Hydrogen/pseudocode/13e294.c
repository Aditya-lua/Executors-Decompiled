
void FUN_0013e294(void)

{
  uint uVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  long lVar5;
  long in_x9;
  long in_x10;
  long unaff_x19;
  int unaff_w20;
  long lVar6;
  int unaff_w23;
  long *unaff_x24;
  long *unaff_x25;
  ulong unaff_x26;
  int unaff_w28;
  undefined8 in_stack_00000040;
  long in_stack_00000050;
  undefined8 in_stack_00000068;
  long in_stack_00000078;
  
  while ((unaff_x26 < (ulong)(in_x9 * in_x10) &&
         (unaff_w23 = unaff_w23 + -1, unaff_w28 <= unaff_w23))) {
    __ZNSt3__112basic_stringIcNS_11char_traitsIcEENS_9allocatorIcEEE9push_backEc();
    lVar5 = *unaff_x24;
    lVar6 = lVar5 + (long)(int)unaff_x26 * (long)unaff_w20;
    lVar4 = *unaff_x25 - (lVar6 + 0xc);
    if (lVar4 != 0) {
      _memmove(lVar6,lVar6 + 0xc,lVar4 + -3);
      lVar5 = *unaff_x24;
    }
    *unaff_x25 = lVar6 + lVar4;
    in_x9 = (lVar6 + lVar4) - lVar5 >> 2;
    in_x10 = -0x5555555555555555;
  }
  *(undefined1 *)(unaff_x19 + 0x5d) = 1;
  func_0x001420d0();
  uVar2 = *(uint *)(unaff_x19 + 0x30);
  uVar3 = (int)((ulong)(*(long *)(unaff_x19 + 0x10) - *(long *)(unaff_x19 + 8)) >> 3) * -0x55555555;
  if ((int)(uVar2 + 1) < (int)uVar3) {
    uVar3 = uVar2 + 1;
  }
  uVar1 = *(uint *)(unaff_x19 + 0x6c);
  if ((int)uVar2 <= (int)*(uint *)(unaff_x19 + 0x6c)) {
    uVar1 = uVar2;
  }
  uVar2 = *(uint *)(unaff_x19 + 0x70);
  if ((int)*(uint *)(unaff_x19 + 0x70) <= (int)uVar3) {
    uVar2 = uVar3;
  }
  uVar1 = uVar1 & ((int)uVar1 >> 0x1f ^ 0xffffffffU);
  uVar3 = uVar1;
  if ((int)uVar1 <= (int)uVar2) {
    uVar3 = uVar2;
  }
  *(uint *)(unaff_x19 + 0x6c) = uVar1;
  *(uint *)(unaff_x19 + 0x70) = uVar3;
  *(undefined1 *)(unaff_x19 + 0x248) = 1;
  func_0x00139988();
  if (in_stack_00000078 < 0) {
    __ZdlPv(in_stack_00000068);
  }
  if (in_stack_00000050 < 0) {
    __ZdlPv(in_stack_00000040);
  }
  return;
}

