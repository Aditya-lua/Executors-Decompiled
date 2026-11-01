
undefined8 * FUN_00634164(void)

{
  int iVar1;
  long *plVar2;
  undefined8 *puVar3;
  undefined8 uVar4;
  ulong uVar5;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined8 uVar6;
  long *plVar7;
  long unaff_x23;
  long unaff_x24;
  long unaff_x29;
  undefined1 auVar8 [16];
  undefined1 auVar9 [12];
  undefined8 uStack0000000000000008;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000038;
  undefined8 uStack0000000000000040;
  ulong in_stack_00000050;
  ulong in_stack_00000058;
  long in_stack_00000060;
  undefined8 uStack0000000000000070;
  ulong in_stack_00000080;
  ulong in_stack_00000088;
  long in_stack_00000090;
  undefined1 in_stack_000000a0;
  undefined8 uStack00000000000000b8;
  undefined *in_stack_000000c0;
  long *in_stack_000000d0;
  
  if ((unaff_x24 == unaff_x23 - unaff_x22) && (iVar1 = _memcmp(), iVar1 == 0)) {
    if (unaff_x20 + 0x1e != unaff_x19) {
      func_0x00653920(unaff_x20 + 0x1f);
    }
    plVar2 = (long *)func_0x00636734();
    func_0x00635108(unaff_x20 + 2,plVar2);
    uVar6 = *(undefined8 *)(unaff_x21 + 0x38);
    puVar3 = (undefined8 *)__Znwm(0x68);
    uVar4 = func_0x00680644();
    func_0x0003e7a4(puVar3,uVar4,4,0);
    *puVar3 = &UNK_00a12138;
    puVar3[1] = &UNK_00a122e8;
    func_0x00653cbc(unaff_x29 + -0xb0,uVar6,1,puVar3);
    uStack0000000000000038 = &UNK_00a09a40;
    func_0x005fdd18(&uStack0000000000000040);
    func_0x005fdd18(&uStack0000000000000070);
    in_stack_000000a0 = 1;
    plVar7 = (long *)unaff_x20[4];
    uVar4 = func_0x005f094c(unaff_x29 + -0xb0);
    (**(code **)(*plVar7 + 0x80))(plVar7,&uStack0000000000000038,unaff_x29 + -0xb0,uVar4);
    (**(code **)(*unaff_x20 + 0x70))();
    uVar6 = *(undefined8 *)(unaff_x21 + 0x40);
    puVar3 = (undefined8 *)__Znwm(0x68);
    uVar4 = func_0x00680644();
    func_0x0003e7a4(puVar3,uVar4,4,0);
    *puVar3 = &UNK_00a12138;
    puVar3[1] = &UNK_00a122e8;
    func_0x00653cbc(&uStack00000000000000b8,uVar6,1,puVar3);
    uVar4 = func_0x005f094c(&uStack00000000000000b8);
    func_0x005fe7ec(unaff_x20 + 0x22,&uStack00000000000000b8,uVar4,0);
    func_0x005fe1e8(&uStack0000000000000008,*(undefined4 *)(unaff_x21 + 0x48));
    func_0x005ffccc(unaff_x20 + 0x28,&uStack0000000000000008);
    uStack0000000000000008 = &UNK_009f5d60;
    uVar5 = in_stack_00000018;
    if (in_stack_00000020 <= in_stack_00000018) {
      uVar5 = in_stack_00000020;
    }
    if (in_stack_00000028 != 0) {
      if (uVar5 != 0) {
        do {
          *(undefined8 *)(in_stack_00000028 + -8 + uVar5 * 8) = 0;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      func_0x00611644();
    }
    uStack00000000000000b8 = &UNK_00a0c238;
    in_stack_000000c0 = &UNK_00a0c3e0;
    if (in_stack_000000d0 != (long *)0x0) {
      (**(code **)(*in_stack_000000d0 + 8))();
    }
    uStack0000000000000038 = &UNK_00a09a40;
    uStack0000000000000070 = &UNK_009f5d60;
    uVar5 = in_stack_00000080;
    if (in_stack_00000088 <= in_stack_00000080) {
      uVar5 = in_stack_00000088;
    }
    if (in_stack_00000090 != 0) {
      if (uVar5 != 0) {
        do {
          *(undefined8 *)(in_stack_00000090 + -8 + uVar5 * 8) = 0;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      func_0x00611644();
    }
    uStack0000000000000040 = &UNK_009f5d60;
    uVar5 = in_stack_00000050;
    if (in_stack_00000058 <= in_stack_00000050) {
      uVar5 = in_stack_00000058;
    }
    if (in_stack_00000060 != 0) {
      if (uVar5 != 0) {
        do {
          *(undefined8 *)(in_stack_00000060 + -8 + uVar5 * 8) = 0;
          uVar5 = uVar5 - 1;
        } while (uVar5 != 0);
      }
      func_0x00611644();
    }
    *(undefined **)(unaff_x29 + -0xb0) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0xa8) = &UNK_00a0c3e0;
    if (*(long **)(unaff_x29 + -0x98) != (long *)0x0) {
      (**(code **)(**(long **)(unaff_x29 + -0x98) + 8))();
    }
    puVar3 = (undefined8 *)(**(code **)(*plVar2 + 8))(plVar2);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
      return puVar3;
    }
  }
  else {
    plVar2 = (long *)___cxa_allocate_exception(0x28);
    func_0x00636638();
    ___cxa_throw(plVar2,&UNK_009fb280,&DAT_006366e8);
  }
  auVar9 = ___stack_chk_fail();
  uVar4 = auVar9._0_8_;
  if (auVar9._8_4_ != 0) {
    uVar4 = func_0x0001753c(uVar4);
    *(undefined **)(unaff_x29 + -0xb0) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0xa8) = &UNK_00a0c3e0;
    if (*(long **)(unaff_x29 + -0x98) != (long *)0x0) {
      (**(code **)(**(long **)(unaff_x29 + -0x98) + 8))();
    }
    if (plVar2 != (long *)0x0) goto code_r0x0063457c;
  }
  __Unwind_Resume(uVar4);
code_r0x0063457c:
  (**(code **)(*plVar2 + 8))(plVar2);
  auVar8 = __Unwind_Resume(uVar4);
  puVar3 = auVar8._0_8_;
  *(undefined4 *)(puVar3 + 1) = 0;
  *puVar3 = &UNK_00a010d8;
  puVar3[2] = &UNK_00a09aa0;
  puVar3[3] = 0;
  puVar3[4] = 0;
  func_0x00631da4(puVar3 + 5);
  *puVar3 = &UNK_009fb128;
  puVar3[0x1e] = &UNK_009f6678;
  puVar3[0x1f] = 0;
  puVar3[0x20] = 0;
  puVar3[0x21] = 0;
  func_0x005fdd18(puVar3 + 0x22);
  func_0x005fdd18(puVar3 + 0x28);
  *(undefined2 *)(puVar3 + 0x2e) = 0x100;
  func_0x0063408c(puVar3,auVar8._8_8_);
  return puVar3;
}

