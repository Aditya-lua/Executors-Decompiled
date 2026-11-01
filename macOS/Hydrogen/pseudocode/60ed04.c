
void FUN_0060ed04(long param_1,undefined8 *param_2)

{
  ulong uVar1;
  undefined8 in_x9;
  long *unaff_x19;
  undefined1 uStack0000000000000000;
  ulong uStack0000000000000020;
  ulong uStack0000000000000028;
  long lStack0000000000000030;
  undefined8 uStack0000000000000038;
  long *in_stack_00000040;
  
  *param_2 = in_x9;
  param_2[1] = param_1 + 0x1a8;
  uStack0000000000000028 = 0;
  lStack0000000000000030 = 0;
  uStack0000000000000020 = 0xffffffffffffffff;
  uStack0000000000000000 = 0;
  func_0x0003f610(&uStack0000000000000038,"InputBuffer");
  (**(code **)(*unaff_x19 + 0x180))();
  uStack0000000000000038 = &UNK_009f6820;
  if (in_stack_00000040 != (long *)0x0) {
    (**(code **)(*in_stack_00000040 + 8))();
  }
  uVar1 = uStack0000000000000020;
  if (uStack0000000000000028 <= uStack0000000000000020) {
    uVar1 = uStack0000000000000028;
  }
  if (lStack0000000000000030 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined1 *)(lStack0000000000000030 + -1 + uVar1) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  return;
}

