
void FUN_0071896c(long param_1,long param_2)

{
  long lVar1;
  undefined8 *puVar2;
  long in_x9;
  long in_x10;
  undefined8 *puVar3;
  long unaff_x22;
  long *in_stack_00000008;
  long in_stack_00000010;
  
  puVar2 = (undefined8 *)(unaff_x22 + param_1);
  puVar3 = (undefined8 *)(param_2 + in_x10);
  do {
    *puVar3 = *puVar2;
    in_x9 = in_x9 + -1;
    puVar2 = puVar2 + 1;
    puVar3 = puVar3 + 1;
  } while (in_x9 != 0);
  lVar1 = *in_stack_00000008 + in_stack_00000010 * 8;
  if (lVar1 != in_stack_00000008[1]) {
    in_stack_00000008[1] = lVar1;
  }
  return;
}

