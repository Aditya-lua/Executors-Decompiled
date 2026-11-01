
void FUN_0069266c(void)

{
  long lVar1;
  ulong uVar2;
  long unaff_x24;
  long unaff_x29;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  long in_stack_00000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  
  func_0x00611644();
  func_0x0060aaf0(&uStack0000000000000030);
  func_0x0069233c();
  lVar1 = unaff_x24 + 0x10;
  uVar2 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar2 = in_stack_00000048;
  }
  uStack0000000000000030 = lVar1;
  if (in_stack_00000050 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  uVar2 = in_stack_00000070;
  if (in_stack_00000078 <= in_stack_00000070) {
    uVar2 = in_stack_00000078;
  }
  in_stack_00000060 = lVar1;
  if (in_stack_00000080 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0x70) = unaff_x24 + 0x10;
  lVar1 = *(long *)(unaff_x29 + -0x50);
  uVar2 = *(ulong *)(unaff_x29 + -0x60);
  if (*(ulong *)(unaff_x29 + -0x58) <= *(ulong *)(unaff_x29 + -0x60)) {
    uVar2 = *(ulong *)(unaff_x29 + -0x58);
  }
  if (lVar1 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  return;
}

