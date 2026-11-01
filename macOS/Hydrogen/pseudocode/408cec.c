
void FUN_00408cec(void)

{
  long lVar1;
  ulong in_x10;
  ulong unaff_x20;
  undefined8 unaff_x22;
  long unaff_x23;
  long unaff_x24;
  undefined8 *unaff_x25;
  ulong unaff_x28;
  long in_stack_00000350;
  long in_stack_000003a8;
  undefined8 in_stack_000003b0;
  long in_stack_000003c0;
  undefined8 in_stack_000003c8;
  long in_stack_000003d8;
  undefined8 in_stack_000003e0;
  long in_stack_000003f0;
  undefined8 in_stack_000003f8;
  long *in_stack_00000460;
  
  unaff_x25[2] = unaff_x22;
  *unaff_x25 = 2;
  unaff_x25[1] = unaff_x28 & 0xffffffff |
                 (unaff_x24 << 0x18 | (unaff_x20 & 0xffff) << 8 | in_x10 & 0xff) << 8;
  lVar1 = *in_stack_00000460;
  *in_stack_00000460 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x00403c44(unaff_x23 + 0x170);
  }
  if (in_stack_00000350 != 0x2f) {
    if (in_stack_000003a8 != 0) {
      func_0x00187bd4(in_stack_000003b0,in_stack_000003a8 << 2,2);
    }
    if (in_stack_000003c0 != 0) {
      func_0x00187bd4(in_stack_000003c8,in_stack_000003c0 * 0x18,8);
    }
    if (in_stack_000003d8 != 0) {
      func_0x00187bd4(in_stack_000003e0,in_stack_000003d8 << 2,2);
    }
    if (in_stack_000003f0 != 0) {
      func_0x00187bd4(in_stack_000003f8,in_stack_000003f0 * 0x58,8);
    }
  }
  return;
}

