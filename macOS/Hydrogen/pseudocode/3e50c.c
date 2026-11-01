
undefined8 * FUN_0003e50c(long param_1)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  undefined8 in_x9;
  long unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x23;
  long unaff_x29;
  undefined1 auVar3 [12];
  undefined8 uStack0000000000000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000040;
  undefined *in_stack_00000048;
  long *in_stack_00000058;
  
  *unaff_x23 = in_x9;
  unaff_x23[1] = param_1 + 0x1a0;
  unaff_x23[3] = &uStack0000000000000008;
  func_0x0004004c();
  func_0x0003f450(&uStack0000000000000040);
  uStack0000000000000040 = &UNK_00a0c238;
  in_stack_00000048 = &UNK_00a0c3e0;
  if (in_stack_00000058 != (long *)0x0) {
    (**(code **)(*in_stack_00000058 + 8))();
  }
  func_0x006e38d8();
  if (in_stack_00000018._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000008);
  }
  if (unaff_x21 != 0) {
    do {
      *(undefined1 *)(unaff_x21 + unaff_x20 + -1) = 0;
      unaff_x20 = unaff_x20 + -1;
    } while (unaff_x20 != 0);
    func_0x00611644();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return (undefined8 *)((long)&MACH_HEADER.magic + 1);
  }
  auVar3 = ___stack_chk_fail();
  uVar1 = auVar3._0_8_;
  if (auVar3._8_4_ != 0) {
    uVar1 = func_0x0001753c(uVar1);
  }
  puVar2 = (undefined8 *)__Unwind_Resume(uVar1);
  *puVar2 = &UNK_00a0c238;
  puVar2[1] = &UNK_00a0c3e0;
  if ((long *)puVar2[3] != (long *)0x0) {
    (**(code **)(*(long *)puVar2[3] + 8))();
  }
  return puVar2;
}

