
undefined8 * FUN_006343d0(code *param_1)

{
  undefined8 *puVar1;
  undefined8 uVar2;
  long *unaff_x19;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined1 auVar4 [12];
  
  (*param_1)();
  puVar1 = (undefined8 *)(**(code **)(*unaff_x19 + 8))();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return puVar1;
  }
  auVar4 = ___stack_chk_fail();
  uVar2 = auVar4._0_8_;
  if (auVar4._8_4_ != 0) {
    uVar2 = func_0x0001753c(uVar2);
    *(undefined **)(unaff_x29 + -0xb0) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0xa8) = &UNK_00a0c3e0;
    if (*(long **)(unaff_x29 + -0x98) != (long *)0x0) {
      (**(code **)(**(long **)(unaff_x29 + -0x98) + 8))();
    }
    if (unaff_x19 != (long *)0x0) goto code_r0x0063457c;
  }
  __Unwind_Resume(uVar2);
code_r0x0063457c:
  (**(code **)(*unaff_x19 + 8))();
  auVar3 = __Unwind_Resume(uVar2);
  puVar1 = auVar3._0_8_;
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
  func_0x0063408c(puVar1,auVar3._8_8_);
  return puVar1;
}

