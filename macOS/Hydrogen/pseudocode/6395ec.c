
undefined8 * FUN_006395ec(void)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  ulong uVar3;
  long *unaff_x19;
  long *unaff_x20;
  long unaff_x21;
  undefined8 uVar4;
  long unaff_x29;
  undefined1 auVar5 [12];
  undefined1 auVar6 [16];
  undefined8 uStack0000000000000008;
  ulong in_stack_00000018;
  ulong in_stack_00000020;
  long in_stack_00000028;
  undefined8 uStack0000000000000038;
  undefined1 uStack0000000000000040;
  ulong in_stack_00000048;
  ulong in_stack_00000050;
  long in_stack_00000058;
  undefined1 uStack0000000000000060;
  ulong in_stack_00000068;
  ulong in_stack_00000070;
  long in_stack_00000078;
  undefined1 in_stack_00000080;
  undefined8 uStack0000000000000098;
  undefined *in_stack_000000a0;
  long *in_stack_000000b0;
  
  uVar4 = *(undefined8 *)(unaff_x21 + 0x30);
  puVar1 = (undefined8 *)__Znwm(0x68);
  uVar2 = func_0x00680644();
  func_0x0003e7a4(puVar1,uVar2,4,0);
  *puVar1 = &UNK_00a12138;
  puVar1[1] = &UNK_00a122e8;
  func_0x00653cbc(unaff_x29 + -0xb0,uVar4,1,puVar1);
  uStack0000000000000038 = &UNK_00a09a70;
  func_0x00675af8(&uStack0000000000000040);
  func_0x00675af8(&uStack0000000000000060);
  in_stack_00000080 = 1;
  uVar2 = func_0x005f094c(unaff_x29 + -0xb0);
  (**(code **)(unaff_x20[3] + 0x80))(unaff_x20 + 3,&uStack0000000000000038,unaff_x29 + -0xb0,uVar2);
  (**(code **)(*unaff_x20 + 0x70))();
  uVar4 = *(undefined8 *)(unaff_x21 + 0x38);
  puVar1 = (undefined8 *)__Znwm(0x68);
  uVar2 = func_0x00680644();
  func_0x0003e7a4(puVar1,uVar2,4,0);
  *puVar1 = &UNK_00a12138;
  puVar1[1] = &UNK_00a122e8;
  func_0x00653cbc(&uStack0000000000000098,uVar4,1,puVar1);
  uVar2 = func_0x005f094c(&uStack0000000000000098);
  func_0x005fe7ec(unaff_x20 + 0x31,&uStack0000000000000098,uVar2,0);
  func_0x005fe1e8(&uStack0000000000000008,*(undefined4 *)(unaff_x21 + 0x40));
  func_0x005ffccc(unaff_x20 + 0x37,&uStack0000000000000008);
  uStack0000000000000008 = &UNK_009f5d60;
  uVar3 = in_stack_00000018;
  if (in_stack_00000020 <= in_stack_00000018) {
    uVar3 = in_stack_00000020;
  }
  if (in_stack_00000028 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000028 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  uStack0000000000000098 = &UNK_00a0c238;
  in_stack_000000a0 = &UNK_00a0c3e0;
  if (in_stack_000000b0 != (long *)0x0) {
    (**(code **)(*in_stack_000000b0 + 8))();
  }
  uStack0000000000000038 = &UNK_00a09a70;
  uVar3 = in_stack_00000068;
  if (in_stack_00000070 <= in_stack_00000068) {
    uVar3 = in_stack_00000070;
  }
  if (in_stack_00000078 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000078 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  uVar3 = in_stack_00000048;
  if (in_stack_00000050 <= in_stack_00000048) {
    uVar3 = in_stack_00000050;
  }
  if (in_stack_00000058 != 0) {
    if (uVar3 != 0) {
      do {
        *(undefined8 *)(in_stack_00000058 + -8 + uVar3 * 8) = 0;
        uVar3 = uVar3 - 1;
      } while (uVar3 != 0);
    }
    func_0x00611644();
  }
  *(undefined **)(unaff_x29 + -0xb0) = &UNK_00a0c238;
  *(undefined **)(unaff_x29 + -0xa8) = &UNK_00a0c3e0;
  puVar1 = (undefined8 *)0x0;
  if (*(long **)(unaff_x29 + -0x98) != (long *)0x0) {
    puVar1 = (undefined8 *)(**(code **)(**(long **)(unaff_x29 + -0x98) + 8))();
  }
  if (unaff_x19 != (long *)0x0) {
    puVar1 = (undefined8 *)(**(code **)(*unaff_x19 + 8))();
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return puVar1;
  }
  auVar5 = ___stack_chk_fail();
  uVar2 = auVar5._0_8_;
  if (auVar5._8_4_ != 0) {
    uVar2 = func_0x0001753c(uVar2);
    *(undefined **)(unaff_x29 + -0xb0) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0xa8) = &UNK_00a0c3e0;
    if (*(long **)(unaff_x29 + -0x98) != (long *)0x0) {
      (**(code **)(**(long **)(unaff_x29 + -0x98) + 8))();
    }
    if (unaff_x19 != (long *)0x0) goto LAB_006399b8;
  }
  uVar2 = __Unwind_Resume(uVar2);
LAB_006399b8:
  (**(code **)(*unaff_x19 + 8))();
  auVar6 = __Unwind_Resume(uVar2);
  puVar1 = auVar6._0_8_;
  *(undefined4 *)(puVar1 + 1) = 0;
  *puVar1 = &UNK_00a015c0;
  puVar1[2] = &UNK_00a09b58;
  func_0x00655478(puVar1 + 3);
  func_0x00630464(puVar1 + 0x18);
  *puVar1 = &UNK_009fb320;
  puVar1[0x2d] = &UNK_009f6678;
  puVar1[0x2e] = 0;
  puVar1[0x2f] = 0;
  puVar1[0x30] = 0;
  func_0x005fdd18(puVar1 + 0x31);
  func_0x005fdd18(puVar1 + 0x37);
  *(undefined2 *)(puVar1 + 0x3d) = 0x100;
  func_0x0063945c(puVar1,auVar6._8_8_);
  return puVar1;
}

