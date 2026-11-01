
long FUN_0067ad6c(ulong param_1)

{
  uint uVar1;
  long lVar2;
  uint uVar3;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  ulong in_stack_00000000;
  
  uVar1 = *(uint *)(unaff_x19 + 0x94);
  uVar3 = uVar1 & 0x3f;
  if (uVar3 == 0) {
    uVar1 = (uVar1 >> 6) - 1;
  }
  else {
    uVar1 = uVar1 >> 6;
    lVar2 = (ulong)(uVar1 - 1) * 8;
    *(ulong *)(unaff_x22 + lVar2) = *(ulong *)(unaff_x22 + lVar2) ^ param_1 << uVar3;
    param_1 = param_1 >> ((ulong)-uVar3 & 0x3f);
  }
  *(ulong *)(unaff_x22 + (ulong)uVar1 * 8) = *(ulong *)(unaff_x22 + (ulong)uVar1 * 8) ^ param_1;
  if (*(long *)(unaff_x19 + 0xb8) != unaff_x22) {
    _memcpy();
  }
  if (0x1ffffffffffffffe < in_stack_00000000) {
    in_stack_00000000 = 0x1fffffffffffffff;
  }
  if (in_stack_00000000 != 0) {
    do {
      *(undefined8 *)(unaff_x20 + -8 + in_stack_00000000 * 8) = 0;
      in_stack_00000000 = in_stack_00000000 - 1;
    } while (in_stack_00000000 != 0);
  }
  func_0x00611644();
  return unaff_x19 + 0xa0;
}

