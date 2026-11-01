
void FUN_005e12d8(undefined8 param_1)

{
  undefined8 unaff_x19;
  undefined8 *unaff_x20;
  undefined8 unaff_x22;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  
  *unaff_x20 = unaff_x19;
  unaff_x20[1] = unaff_x22;
  unaff_x20[2] = param_1;
  if (in_stack_00000040 == 0) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(in_stack_00000048,in_stack_00000040 << 4,8);
  return;
}

