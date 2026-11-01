
int FUN_006b2d0c(undefined8 param_1)

{
  long unaff_x19;
  long lVar1;
  long unaff_x20;
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  
  *(undefined8 *)(unaff_x19 + 0x228) = param_1;
  lVar1 = *(long *)(unaff_x19 + 0x220);
  if (in_stack_00000010 < 0) {
    __ZdlPv(in_stack_00000000);
  }
  return (int)((ulong)(unaff_x20 - lVar1) >> 5) + -1;
}

