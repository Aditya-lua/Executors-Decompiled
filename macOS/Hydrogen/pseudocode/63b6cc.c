
long FUN_0063b6cc(void)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  ulong uVar4;
  long unaff_x19;
  long unaff_x29;
  undefined1 auVar5 [12];
  undefined1 uStack0000000000000008;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined1 uStack0000000000000028;
  ulong in_stack_00000030;
  ulong in_stack_00000038;
  long in_stack_00000040;
  undefined8 uStack0000000000000048;
  ulong in_stack_000000f0;
  ulong in_stack_000000f8;
  long in_stack_00000100;
  undefined8 uStack0000000000000108;
  undefined *in_stack_00000110;
  long *in_stack_00000120;
  
  func_0x0067a5b8();
  uVar1 = func_0x005f094c(unaff_x29 + -0xa0);
  in_stack_00000038 = 0;
  in_stack_00000040 = 0;
  in_stack_00000030 = 0x1fffffffffffffff;
  func_0x00676a24(&uStack0000000000000028,unaff_x29 + -0xa0,uVar1);
  uVar1 = func_0x005f094c(&uStack0000000000000108);
  in_stack_00000018 = 0;
  in_stack_00000020 = 0;
  in_stack_00000010 = 0x1fffffffffffffff;
  func_0x00676a24(&uStack0000000000000008,&uStack0000000000000108,uVar1);
  func_0x00655290();
  uVar4 = in_stack_00000010;
  if (in_stack_00000018 <= in_stack_00000010) {
    uVar4 = in_stack_00000018;
  }
  if (in_stack_00000020 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_00000020 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  uVar4 = in_stack_00000030;
  if (in_stack_00000038 <= in_stack_00000030) {
    uVar4 = in_stack_00000038;
  }
  if (in_stack_00000040 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_00000040 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000048 = &UNK_00a0f1c0;
  uVar4 = in_stack_000000f0;
  if (in_stack_000000f8 <= in_stack_000000f0) {
    uVar4 = in_stack_000000f8;
  }
  if (in_stack_00000100 != 0) {
    if (uVar4 != 0) {
      do {
        *(undefined8 *)(in_stack_00000100 + -8 + uVar4 * 8) = 0;
        uVar4 = uVar4 - 1;
      } while (uVar4 != 0);
    }
    func_0x00611644();
  }
  func_0x006553a4(&uStack0000000000000048);
  uStack0000000000000108 = &UNK_00a0c238;
  in_stack_00000110 = &UNK_00a0c3e0;
  if (in_stack_00000120 != (long *)0x0) {
    (**(code **)(*in_stack_00000120 + 8))();
  }
  *(undefined **)(unaff_x29 + -0xa0) = &UNK_00a0c238;
  *(undefined **)(unaff_x29 + -0x98) = &UNK_00a0c3e0;
  if (*(long **)(unaff_x29 + -0x88) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0x88) + 8))();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return unaff_x19;
  }
  auVar5 = ___stack_chk_fail();
  uVar1 = auVar5._0_8_;
  if (auVar5._8_4_ != 0) {
    uVar1 = func_0x0001753c(uVar1);
    func_0x006553a4(&uStack0000000000000048);
    __ZdlPv();
    uStack0000000000000108 = &UNK_00a0c238;
    in_stack_00000110 = &UNK_00a0c3e0;
    if (in_stack_00000120 != (long *)0x0) {
      (**(code **)(*in_stack_00000120 + 8))();
    }
    *(undefined **)(unaff_x29 + -0xa0) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0x98) = &UNK_00a0c3e0;
    plVar2 = *(long **)(unaff_x29 + -0x88);
    if (plVar2 != (long *)0x0) goto code_r0x0063bbec;
  }
  plVar2 = (long *)__Unwind_Resume(uVar1);
code_r0x0063bbec:
  (**(code **)(*plVar2 + 8))();
  uVar1 = __Unwind_Resume(uVar1);
  __ZdlPv();
  lVar3 = __Unwind_Resume(uVar1);
  return lVar3 + 0x18;
}

