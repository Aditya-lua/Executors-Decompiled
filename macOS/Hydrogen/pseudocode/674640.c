
void FUN_00674640(undefined8 *param_1)

{
  undefined8 *in_x9;
  undefined8 *unaff_x19;
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  long in_stack_00000018;
  
  uVar1 = *in_x9;
  uVar3 = in_x9[3];
  uVar2 = in_x9[2];
  param_1[1] = in_x9[1];
  *param_1 = uVar1;
  param_1[3] = uVar3;
  param_1[2] = uVar2;
  uVar1 = in_x9[4];
  param_1[5] = in_x9[5];
  param_1[4] = uVar1;
  *(undefined8 *)((long)param_1 + 0x2e) = *(undefined8 *)((long)in_x9 + 0x2e);
  *(undefined1 *)((long)param_1 + 0x36) = 0;
  *unaff_x19 = &UNK_009b2ec8;
  *(undefined4 *)(unaff_x19 + 1) = 0;
  if (in_stack_00000018 < 0) {
    func_0x00017634(unaff_x19 + 2,in_stack_00000008,in_stack_00000010);
    *unaff_x19 = &UNK_009b2ea0;
    __ZdlPv(in_stack_00000008);
  }
  else {
    unaff_x19[3] = in_stack_00000010;
    unaff_x19[2] = in_stack_00000008;
    unaff_x19[4] = in_stack_00000018;
    *unaff_x19 = &UNK_009b2ea0;
  }
  *unaff_x19 = &UNK_00a0ed40;
  return;
}

