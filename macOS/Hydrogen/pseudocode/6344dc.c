
undefined8 * FUN_006344dc(long param_1)

{
  undefined8 *puVar1;
  long *unaff_x19;
  long unaff_x29;
  undefined1 auVar2 [16];
  undefined1 uStack0000000000000038;
  long lStack00000000000000c0;
  long *in_stack_000000d0;
  
  lStack00000000000000c0 = param_1 + 0x1b8;
  if (in_stack_000000d0 != (long *)0x0) {
    (**(code **)(*in_stack_000000d0 + 8))();
  }
  func_0x0064f6d0(&uStack0000000000000038);
  *(undefined **)(unaff_x29 + -0xb0) = &UNK_00a0c238;
  *(undefined **)(unaff_x29 + -0xa8) = &UNK_00a0c3e0;
  if (*(long **)(unaff_x29 + -0x98) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0x98) + 8))();
  }
  if (unaff_x19 == (long *)0x0) {
    __Unwind_Resume();
  }
  (**(code **)(*unaff_x19 + 8))();
  auVar2 = __Unwind_Resume();
  puVar1 = auVar2._0_8_;
  *(undefined4 *)(puVar1 + 1) = 0;
  *puVar1 = &UNK_00a010d8;
  puVar1[2] = &UNK_00a09aa0;
  puVar1[3] = 0;
  puVar1[4] = 0;
  func_0x00631da4(puVar1 + 5);
  *puVar1 = &UNK_009fb128;
  puVar1[0x1e] = &UNK_009f6678;
  puVar1[0x1f] = 0;
  puVar1[0x20] = 0;
  puVar1[0x21] = 0;
  func_0x005fdd18(puVar1 + 0x22);
  func_0x005fdd18(puVar1 + 0x28);
  *(undefined2 *)(puVar1 + 0x2e) = 0x100;
  func_0x0063408c(puVar1,auVar2._8_8_);
  return puVar1;
}

