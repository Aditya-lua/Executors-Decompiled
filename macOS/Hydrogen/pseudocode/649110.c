
void FUN_00649110(long param_1,long param_2)

{
  ulong uVar1;
  long *unaff_x20;
  long unaff_x21;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  if (param_2 != 0) {
    if (param_1 != 0) {
      do {
        *(undefined8 *)(param_2 + -8 + param_1 * 8) = 0;
        param_1 = param_1 + -1;
      } while (param_1 != 0);
    }
    func_0x00611644();
  }
  (**(code **)(*unaff_x20 + 0x50))();
  func_0x00602560(&uStack0000000000000030);
  uStack0000000000000030 = unaff_x21 + 0x10;
  uVar1 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar1 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  return;
}

