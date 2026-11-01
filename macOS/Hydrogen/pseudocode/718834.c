
void FUN_00718834(long param_1,long param_2)

{
  bool in_ZR;
  undefined8 *puVar1;
  long lVar2;
  undefined8 *puVar3;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  long unaff_x26;
  long *in_stack_00000000;
  long in_stack_00000008;
  
  if (!in_ZR) {
    lVar2 = unaff_x24 - param_1;
    puVar1 = (undefined8 *)(unaff_x26 + param_1 * 8 + unaff_x25 * 8);
    puVar3 = (undefined8 *)(param_2 + param_1 * 8);
    do {
      *puVar3 = *puVar1;
      lVar2 = lVar2 + -1;
      puVar1 = puVar1 + 1;
      puVar3 = puVar3 + 1;
    } while (lVar2 != 0);
  }
  lVar2 = *(long *)(unaff_x20 + 0xa0);
  *unaff_x19 = param_2;
  unaff_x19[1] = unaff_x24;
  unaff_x19[2] = unaff_x22;
  unaff_x19[3] = unaff_x21;
  unaff_x19[4] = unaff_x23;
  unaff_x19[5] = lVar2;
  lVar2 = *in_stack_00000000 + in_stack_00000008 * 8;
  if (lVar2 != in_stack_00000000[1]) {
    in_stack_00000000[1] = lVar2;
  }
  return;
}

