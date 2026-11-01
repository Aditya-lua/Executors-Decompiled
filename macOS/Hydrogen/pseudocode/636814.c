
undefined8 FUN_00636814(undefined8 param_1,undefined8 param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  long *plVar3;
  long lVar4;
  ulong uVar5;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x29;
  undefined1 auVar6 [12];
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
  undefined *in_stack_00000098;
  long *in_stack_000000a8;
  undefined8 uStack00000000000000f8;
  undefined *in_stack_00000100;
  long *in_stack_00000110;
  
  func_0x0003e7a4(param_1,param_2,4,0);
  *unaff_x21 = unaff_x22 + 0x10;
  unaff_x21[1] = unaff_x22 + 0x1c0;
  func_0x00653cbc(&uStack0000000000000090);
  uVar1 = __Znwm(0xe8);
  uVar2 = func_0x005f094c(unaff_x29 + -0xa0);
  func_0x005fec54(&uStack0000000000000060,unaff_x29 + -0xa0,uVar2,0,1);
  uVar2 = func_0x005f094c(&uStack00000000000000f8);
  func_0x005fec54(&uStack0000000000000030,&uStack00000000000000f8,uVar2,0,1);
  func_0x005f094c(&uStack0000000000000090);
  func_0x005fec54();
  func_0x00653a64(uVar1,&uStack0000000000000060,&uStack0000000000000030);
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
  uStack0000000000000030 = &UNK_009f5d60;
  uVar5 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar5 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000060 = &UNK_009f5d60;
  uVar5 = in_stack_00000070;
  if (in_stack_00000078 <= in_stack_00000070) {
    uVar5 = in_stack_00000078;
  }
  if (in_stack_00000080 != 0) {
    if (uVar5 != 0) {
      do {
        *(undefined8 *)(in_stack_00000080 + -8 + uVar5 * 8) = 0;
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000090 = &UNK_00a0c238;
  in_stack_00000098 = &UNK_00a0c3e0;
  if (in_stack_000000a8 != (long *)0x0) {
    (**(code **)(*in_stack_000000a8 + 8))();
  }
  uStack00000000000000f8 = &UNK_00a0c238;
  in_stack_00000100 = &UNK_00a0c3e0;
  if (in_stack_00000110 != (long *)0x0) {
    (**(code **)(*in_stack_00000110 + 8))();
  }
  *(undefined **)(unaff_x29 + -0xa0) = &UNK_00a0c238;
  *(undefined **)(unaff_x29 + -0x98) = &UNK_00a0c3e0;
  if (*(long **)(unaff_x29 + -0x88) != (long *)0x0) {
    (**(code **)(**(long **)(unaff_x29 + -0x88) + 8))();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x38)) {
    return uVar1;
  }
  auVar6 = ___stack_chk_fail();
  uVar2 = auVar6._0_8_;
  if (auVar6._8_4_ != 0) {
    uVar2 = func_0x0001753c(uVar2);
    func_0x00087574();
    func_0x00087574(&uStack0000000000000030);
    func_0x00087574(&uStack0000000000000060);
    __ZdlPv(uVar1);
    uStack0000000000000090 = &UNK_00a0c238;
    in_stack_00000098 = &UNK_00a0c3e0;
    if (in_stack_000000a8 != (long *)0x0) {
      (**(code **)(*in_stack_000000a8 + 8))();
    }
    uStack00000000000000f8 = &UNK_00a0c238;
    in_stack_00000100 = &UNK_00a0c3e0;
    if (in_stack_00000110 != (long *)0x0) {
      (**(code **)(*in_stack_00000110 + 8))();
    }
    *(undefined **)(unaff_x29 + -0xa0) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0x98) = &UNK_00a0c3e0;
    plVar3 = *(long **)(unaff_x29 + -0x88);
    if (plVar3 != (long *)0x0) goto code_r0x00636afc;
  }
  plVar3 = (long *)__Unwind_Resume(uVar2);
code_r0x00636afc:
  (**(code **)(*plVar3 + 8))();
  uVar1 = __Unwind_Resume(uVar2);
  __ZdlPv(&UNK_00a0c238);
  lVar4 = __Unwind_Resume(uVar1);
  return *(undefined8 *)(lVar4 + 0x20);
}

