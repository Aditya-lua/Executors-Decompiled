
undefined8 * FUN_006343f0(long param_1,undefined8 *param_2)

{
  undefined8 uVar1;
  undefined8 *puVar2;
  long *in_x9;
  long *unaff_x19;
  long unaff_x29;
  undefined1 auVar3 [16];
  undefined1 auVar4 [12];
  
  if (*in_x9 == param_1) {
    return param_2;
  }
  auVar4 = ___stack_chk_fail();
  uVar1 = auVar4._0_8_;
  if (auVar4._8_4_ != 0) {
    uVar1 = func_0x0001753c(uVar1);
    *(undefined **)(unaff_x29 + -0xb0) = &UNK_00a0c238;
    *(undefined **)(unaff_x29 + -0xa8) = &UNK_00a0c3e0;
    if (*(long **)(unaff_x29 + -0x98) != (long *)0x0) {
      (**(code **)(**(long **)(unaff_x29 + -0x98) + 8))();
    }
    if (unaff_x19 != (long *)0x0) goto code_r0x0063457c;
  }
  __Unwind_Resume(uVar1);
code_r0x0063457c:
  (**(code **)(*unaff_x19 + 8))();
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
  func_0x0063408c(puVar2,auVar3._8_8_);
  return puVar2;
}

