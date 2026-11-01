
undefined8 * FUN_00653e28(long param_1)

{
  undefined8 *puVar1;
  undefined8 *unaff_x19;
  long lStack0000000000000038;
  long *in_stack_00000040;
  
  lStack0000000000000038 = param_1 + 0x820;
  if (in_stack_00000040 != (long *)0x0) {
    (**(code **)(*in_stack_00000040 + 8))();
  }
  func_0x0003f6cc();
  *unaff_x19 = &UNK_00a0c238;
  unaff_x19[1] = &UNK_00a0c3e0;
  if ((long *)unaff_x19[3] != (long *)0x0) {
    (**(code **)(*(long *)unaff_x19[3] + 8))();
  }
  __Unwind_Resume();
  puVar1 = (undefined8 *)func_0x0001753c();
  *puVar1 = &UNK_00a0c0d0;
  puVar1[1] = &UNK_00a0c190;
  puVar1[2] = 0;
  func_0x005fdd18(puVar1 + 3);
  func_0x005fdd18(puVar1 + 9);
  puVar1[0xf] = &UNK_00a09a40;
  func_0x005fdd18(puVar1 + 0x10);
  func_0x005fdd18(puVar1 + 0x16);
  *(undefined1 *)(puVar1 + 0x1c) = 1;
  return puVar1;
}

