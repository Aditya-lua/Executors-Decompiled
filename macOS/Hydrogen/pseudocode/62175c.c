
undefined8 FUN_0062175c(long param_1)

{
  ulong uVar1;
  undefined8 uVar2;
  long *unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long lVar3;
  long unaff_x25;
  long unaff_x29;
  undefined8 uStack0000000000000008;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  undefined *in_stack_00000038;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  undefined *in_stack_00000068;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  
  while( true ) {
    lVar3 = unaff_x24;
    unaff_x24 = param_1;
    (**(code **)(*unaff_x21 + 0x18))();
    uVar1 = (**(code **)(*unaff_x21 + 0x10))();
    if ((uVar1 & 1) != 0) break;
    uVar2 = (**(code **)(*unaff_x21 + 200))();
    func_0x005ffccc(unaff_x23 + lVar3 * 0x30,uVar2);
    param_1 = unaff_x25;
    unaff_x25 = lVar3;
  }
  uVar2 = func_0x005ffccc(unaff_x21 + 3,unaff_x23 + unaff_x24 * 0x30);
  in_stack_00000068 = &UNK_009f5d60;
  uVar1 = in_stack_00000078;
  if (in_stack_00000080 <= in_stack_00000078) {
    uVar1 = in_stack_00000080;
  }
  if (in_stack_00000088 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(in_stack_00000088 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  in_stack_00000038 = &UNK_009f5d60;
  uVar1 = in_stack_00000048;
  if (in_stack_00000050 <= in_stack_00000048) {
    uVar1 = in_stack_00000050;
  }
  if (in_stack_00000058 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(in_stack_00000058 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000008 = &UNK_009f5d60;
  uVar1 = in_stack_00000018;
  if (in_stack_00000020 <= in_stack_00000018) {
    uVar1 = in_stack_00000020;
  }
  if (in_stack_00000028 != 0) {
    if (uVar1 != 0) {
      do {
        *(undefined8 *)(in_stack_00000028 + -8 + uVar1 * 8) = 0;
        uVar1 = uVar1 - 1;
      } while (uVar1 != 0);
    }
    func_0x00611644();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x58)) {
    return uVar2;
  }
  uVar2 = ___stack_chk_fail();
  func_0x00087574(&UNK_009f5d50);
  func_0x00087574(&UNK_009f5d60);
  func_0x00087574(&uStack0000000000000008);
  uVar2 = __Unwind_Resume(uVar2);
  return uVar2;
}

