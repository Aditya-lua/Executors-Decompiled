
void FUN_00649628(code *param_1)

{
  long *unaff_x20;
  long *unaff_x21;
  
  (*param_1)();
  (**(code **)(*unaff_x20 + 0xa0))();
  func_0x00602288();
                    /* WARNING: Could not recover jumptable at 0x0064966c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x21 + 0x28))();
  return;
}

