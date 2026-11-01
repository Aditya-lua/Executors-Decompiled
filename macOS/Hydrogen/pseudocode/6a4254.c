
undefined8 * FUN_006a4254(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  undefined8 *puVar1;
  uint unaff_w21;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined1 auVar4 [12];
  undefined8 in_stack_00000008;
  long in_stack_00000018;
  undefined8 in_stack_00000020;
  long in_stack_00000030;
  
  if (in_stack_00000030 < 0) {
    __ZdlPv(in_stack_00000020);
  }
  if (in_stack_00000018 < 0) {
    __ZdlPv(in_stack_00000008);
    unaff_w21 = unaff_w21 & 1;
  }
  if (unaff_w21 != 0) {
    ___cxa_free_exception();
  }
  auVar4 = __Unwind_Resume();
  puVar1 = auVar4._0_8_;
  *puVar1 = &UNK_009b2ec8;
  *(int *)(puVar1 + 1) = auVar4._8_4_;
  if (*(char *)((long)param_3 + 0x17) < '\0') {
    func_0x00017634(puVar1 + 2,*param_3,param_3[1]);
    return puVar1;
  }
  uVar3 = param_3[1];
  uVar2 = *param_3;
  puVar1[4] = param_3[2];
  puVar1[3] = uVar3;
  puVar1[2] = uVar2;
  return puVar1;
}

