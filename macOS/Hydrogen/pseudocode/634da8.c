
undefined8 * FUN_00634da8(long param_1)

{
  long lVar1;
  undefined8 *puVar2;
  undefined8 uVar3;
  ulong uVar4;
  long in_x9;
  long unaff_x19;
  long unaff_x29;
  undefined1 auVar5 [16];
  undefined1 auVar6 [12];
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000060;
  long in_stack_00000068;
  ulong in_stack_00000078;
  ulong in_stack_00000080;
  long in_stack_00000088;
  long in_stack_00000098;
  ulong in_stack_000000a8;
  ulong in_stack_000000b0;
  long in_stack_000000b8;
  undefined1 uStack00000000000000d0;
  
  do {
    *(undefined8 *)(in_x9 + param_1 * 8) = 0;
    param_1 = param_1 + -1;
  } while (param_1 != 0);
  func_0x00611644();
  if (in_stack_00000048 <= in_stack_00000040) {
    in_stack_00000040 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (in_stack_00000040 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + in_stack_00000040 * 8) = 0;
        in_stack_00000040 = in_stack_00000040 - 1;
      } while (in_stack_00000040 != 0);
    }
    func_0x00611644();
  }
  lVar1 = unaff_x19 + 0x10;
  uStack0000000000000060 = &UNK_00a09a40;
  uVar4 = in_stack_000000a8;
  if (in_stack_000000b0 <= in_stack_000000a8) {
    uVar4 = in_stack_000000b0;
  }
  in_stack_00000098 = lVar1;
  if (in_stack_000000b8 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b8 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  uVar4 = in_stack_00000078;
  if (in_stack_00000080 <= in_stack_00000078) {
    uVar4 = in_stack_00000080;
  }
  in_stack_00000068 = lVar1;
  if (in_stack_00000088 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_00000088 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  func_0x00653f88(&uStack00000000000000d0);
  puVar2 = (undefined8 *)func_0x00613f64(unaff_x29 + -0x60);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return puVar2;
  }
  auVar6 = ___stack_chk_fail();
  if (auVar6._8_4_ == 0) {
    uVar3 = __Unwind_Resume(auVar6._0_8_);
    func_0x00087574();
  }
  else {
    uVar3 = func_0x0001753c(auVar6._0_8_);
  }
  func_0x00087574(&uStack0000000000000030);
  func_0x0064f6d0(&uStack0000000000000060);
  func_0x00653f88(&uStack00000000000000d0);
  func_0x00613f64(unaff_x29 + -0x60);
  auVar5 = __Unwind_Resume(uVar3);
  puVar2 = auVar5._0_8_;
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
  func_0x00634c1c(puVar2,auVar5._8_8_);
  return puVar2;
}

