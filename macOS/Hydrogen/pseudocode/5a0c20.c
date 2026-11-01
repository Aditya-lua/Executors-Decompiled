
void FUN_005a0c20(long param_1,long param_2)

{
  bool in_ZR;
  long in_x9;
  long lVar1;
  long in_x10;
  long lVar2;
  undefined8 *unaff_x19;
  long unaff_x23;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  
  if (!in_ZR) {
    lVar1 = in_x9 - in_x10;
    lVar2 = unaff_x23 + in_x10 * 0x40;
    do {
      *(long *)(param_2 + param_1 * 8) = lVar2;
      param_1 = param_1 + 1;
      lVar2 = lVar2 + 0x40;
      lVar1 = lVar1 + -1;
    } while (lVar1 != 0);
  }
  unaff_x19[1] = in_stack_00000010;
  *unaff_x19 = in_stack_00000008;
  unaff_x19[2] = param_1;
  return;
}

