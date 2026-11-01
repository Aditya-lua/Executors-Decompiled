
void FUN_0067e9ac(void)

{
  undefined8 uVar1;
  long lVar2;
  ulong uVar3;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x29;
  undefined1 auVar4 [12];
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  undefined8 uStack0000000000000060;
  ulong in_stack_00000070;
  ulong in_stack_00000078;
  long in_stack_00000080;
  undefined8 uStack0000000000000090;
  ulong in_stack_000000a0;
  ulong in_stack_000000a8;
  long in_stack_000000b0;
  
  func_0x00609b98();
  func_0x005ffccc(&uStack0000000000000090,&uStack0000000000000030);
  uStack0000000000000030 = unaff_x20 + 0x10;
  uVar3 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar3 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  if (in_stack_00000018 <= in_stack_00000010) {
    in_stack_00000010 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (in_stack_00000010 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
        in_stack_00000010 = in_stack_00000010 - 1;
      } while (in_stack_00000010 != 0);
    }
    func_0x00611644();
  }
  func_0x00612a40(unaff_x29 + -0x60);
  (**(code **)(*unaff_x19 + 0xa8))();
  func_0x005ffccc(unaff_x19 + 3,&uStack0000000000000090);
  *(undefined4 *)(unaff_x19 + 2) = 0;
  lVar2 = unaff_x20 + 0x10;
  uVar3 = in_stack_00000070;
  if (in_stack_00000078 <= in_stack_00000070) {
    uVar3 = in_stack_00000078;
  }
  uStack0000000000000060 = lVar2;
  if (in_stack_00000080 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  uVar3 = in_stack_000000a0;
  if (in_stack_000000a8 <= in_stack_000000a0) {
    uVar3 = in_stack_000000a8;
  }
  uStack0000000000000090 = lVar2;
  if (in_stack_000000b0 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_000000b0 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *(long *)(unaff_x29 + -0x90) = unaff_x20 + 0x10;
  lVar2 = *(long *)(unaff_x29 + -0x70);
  uVar3 = *(ulong *)(unaff_x29 + -0x80);
  if (*(ulong *)(unaff_x29 + -0x78) <= *(ulong *)(unaff_x29 + -0x80)) {
    uVar3 = *(ulong *)(unaff_x29 + -0x78);
  }
  if (lVar2 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(lVar2 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  func_0x00613f64(unaff_x29 + -0x60);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x28)) {
    return;
  }
  auVar4 = ___stack_chk_fail();
  if (auVar4._8_4_ == 0) {
    uVar1 = __Unwind_Resume(auVar4._0_8_);
    func_0x00087574(&uStack0000000000000060);
  }
  else {
    uVar1 = func_0x0001753c(auVar4._0_8_);
  }
  func_0x00087574(&uStack0000000000000090);
  func_0x00087574(unaff_x29 + -0x90);
  func_0x00613f64(unaff_x29 + -0x60);
  lVar2 = __Unwind_Resume(uVar1);
  func_0x005ffccc(lVar2 + 0x18);
  *(undefined4 *)(lVar2 + 0x10) = 0;
  return;
}

