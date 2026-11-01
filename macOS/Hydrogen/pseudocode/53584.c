
void FUN_00053584(undefined1 *param_1)

{
  undefined1 *puVar1;
  undefined1 *in_x9;
  undefined1 *puVar2;
  long in_x10;
  long in_x11;
  undefined8 *in_x12;
  undefined8 *in_x13;
  long in_x14;
  undefined1 *unaff_x21;
  undefined8 uVar3;
  undefined8 uVar4;
  undefined8 uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined8 uVar8;
  undefined8 uVar9;
  undefined8 in_stack_00000010;
  long in_stack_00000020;
  
  while (in_x14 = in_x14 + -0x40, in_x14 != 0) {
    uVar3 = in_x13[-4];
    uVar5 = in_x13[-1];
    uVar4 = in_x13[-2];
    uVar7 = in_x13[1];
    uVar6 = *in_x13;
    uVar9 = in_x13[3];
    uVar8 = in_x13[2];
    in_x12[-3] = in_x13[-3];
    in_x12[-4] = uVar3;
    in_x12[-1] = uVar5;
    in_x12[-2] = uVar4;
    in_x12[1] = uVar7;
    *in_x12 = uVar6;
    in_x12[3] = uVar9;
    in_x12[2] = uVar8;
    in_x12 = in_x12 + 8;
    in_x13 = in_x13 + 8;
  }
  puVar1 = param_1;
  if (in_x10 != in_x11) {
    do {
      puVar2 = in_x9 + 1;
      param_1 = puVar1 + 1;
      *puVar1 = *in_x9;
      puVar1 = param_1;
      in_x9 = puVar2;
    } while (puVar2 != unaff_x21);
  }
  *param_1 = 0;
  if (in_stack_00000020 < 0) {
    __ZdlPv(in_stack_00000010);
  }
  return;
}

