
void FUN_0070be20(ulong param_1,undefined8 param_2,undefined8 param_3,int param_4)

{
  uint uVar1;
  ulong in_x9;
  long in_x10;
  ulong in_x11;
  int in_w12;
  char in_w13;
  uint uVar2;
  char cVar3;
  undefined4 *unaff_x19;
  undefined8 unaff_x20;
  long unaff_x21;
  undefined8 in_stack_00000008;
  
  uVar2 = 0;
  do {
    cVar3 = *(char *)(in_x10 + in_x9);
    if (cVar3 != '=') goto LAB_0070be4c;
    uVar1 = param_4 + uVar2 + 2;
    in_x9 = (ulong)uVar1;
    *(uint *)(unaff_x21 + 0x10) = uVar1;
    uVar2 = uVar2 + 1;
  } while (in_x9 < in_x11);
  cVar3 = '\0';
LAB_0070be4c:
  param_4 = param_4 + uVar2;
  if (cVar3 != in_w13) {
    uVar2 = ~uVar2;
  }
  if (-1 < (int)uVar2) {
    func_0x0070c848();
    return;
  }
  if (uVar2 == 0xffffffff) {
    *unaff_x19 = 0x5b;
    *(undefined8 *)(unaff_x19 + 1) = unaff_x20;
    unaff_x19[3] = (int)param_1;
    unaff_x19[4] = in_stack_00000008._4_4_ + 1;
  }
  else {
    *unaff_x19 = 0x11e;
    *(undefined8 *)(unaff_x19 + 1) = unaff_x20;
    *(ulong *)(unaff_x19 + 3) = param_1 | (ulong)(uint)((param_4 + 1) - in_w12) << 0x20;
  }
  unaff_x19[5] = 0;
  *(undefined8 *)(unaff_x19 + 6) = 0;
  return;
}

