
undefined8 FUN_007763cc(undefined8 param_1,int param_2)

{
  long lVar1;
  long unaff_x19;
  long *in_stack_00000008;
  
  if (param_2 != 0x2735) {
    return param_1;
  }
  lVar1 = *in_stack_00000008;
  *(long *)(unaff_x19 + 0x1c8) = lVar1;
  if (lVar1 == 0) {
    *(undefined8 *)(unaff_x19 + 0x1c8) = *(undefined8 *)PTR____stderrp_009b01f0;
    return 0;
  }
  return 0;
}

