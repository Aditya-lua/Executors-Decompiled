
void FUN_00623cb4(code *param_1)

{
  long *unaff_x21;
  
  (*param_1)();
                    /* WARNING: Could not recover jumptable at 0x00623cd8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)(*unaff_x21 + 0x38))();
  return;
}

