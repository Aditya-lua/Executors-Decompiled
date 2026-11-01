
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_0066e3d8(undefined8 *param_1)

{
  undefined8 uVar1;
  long *plVar2;
  undefined4 unaff_w20;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  long in_stack_00000008;
  undefined1 in_stack_00000010;
  undefined1 uStack000000000000001c;
  
  param_1[3] = unaff_x21;
  param_1[4] = 0;
  *(undefined4 *)(param_1 + 5) = 0;
  uVar1 = _UNK_0080d560;
  param_1[7] = _UNK_0080d568;
  param_1[6] = uVar1;
  param_1[8] = 0xffffffffffffffff;
  *(undefined1 *)(param_1 + 9) = 0;
  param_1[0xc] = 0;
  param_1[0xd] = 0;
  param_1[0xb] = 0xffffffffffffffff;
  *param_1 = &UNK_00a0cd00;
  param_1[1] = &UNK_00a0cf10;
  param_1[0x12] = unaff_x22;
  param_1[0x13] = 0;
  *(undefined1 *)(param_1 + 0x14) = 0;
  param_1[0x17] = 0;
  param_1[0x18] = 0;
  param_1[0x16] = 0xffffffffffffffff;
  func_0x0066e520("HashVerificationFilterFlags",&uStack000000000000001c,1);
  plVar2 = (long *)__Znwm(0x28);
  *(undefined1 *)(plVar2 + 2) = in_stack_00000010;
  *(undefined1 *)((long)plVar2 + 0x11) = 0;
  *plVar2 = (long)&UNK_009f8b20;
  plVar2[1] = (long)"TruncatedDigestSize";
  *(undefined4 *)(plVar2 + 4) = unaff_w20;
  plVar2[3] = in_stack_00000008;
  func_0x0066b7cc();
  if (plVar2 != (long *)0x0) {
    (**(code **)(*plVar2 + 8))();
  }
  return;
}

