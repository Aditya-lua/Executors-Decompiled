
undefined8 * FUN_00634f34(void)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined1 uStack0000000000000030;
  undefined1 uStack0000000000000060;
  undefined8 uStack00000000000000d0;
  long in_stack_000000d8;
  
  func_0x00613f64(unaff_x29 + -0x60);
  uVar1 = __Unwind_Resume();
  func_0x00613f64(unaff_x29 + -0x60);
  uVar1 = __Unwind_Resume(uVar1);
  func_0x00613f64(unaff_x29 + -0x60);
  uVar1 = __Unwind_Resume(uVar1);
  if (in_stack_000000d8 != 0) {
    __ZdlPv();
    uVar1 = __Unwind_Resume(uVar1);
  }
  uVar1 = __Unwind_Resume(uVar1);
  func_0x00087574();
  func_0x00087574(&uStack0000000000000030);
  func_0x0064f6d0(&uStack0000000000000060);
  func_0x00653f88(&uStack00000000000000d0);
  func_0x00613f64(unaff_x29 + -0x60);
  auVar3 = __Unwind_Resume(uVar1);
  puVar2 = auVar3._0_8_;
  *(undefined4 *)(puVar2 + 1) = 0;
  *puVar2 = &UNK_00a010d8;
  puVar2[2] = &UNK_00a09aa0;
  puVar2[3] = 0;
  puVar2[4] = 0;
  func_0x00631da4(puVar2 + 5);
  *puVar2 = &UNK_009fb128;
  puVar2[0x1e] = &UNK_009f6678;
  puVar2[0x1f] = 0;
  puVar2[0x20] = 0;
  puVar2[0x21] = 0;
  func_0x005fdd18(puVar2 + 0x22);
  func_0x005fdd18(puVar2 + 0x28);
  *(undefined2 *)(puVar2 + 0x2e) = 0x100;
  func_0x00634c1c(puVar2,auVar3._8_8_);
  return puVar2;
}

