
void FUN_0045b7c4(void)

{
  long *unaff_x20;
  long *unaff_x21;
  long lVar1;
  long in_stack_00000008;
  long in_stack_00000010;
  long in_stack_00000018;
  
  func_0x0045b558();
  if (in_stack_00000008 == -0x8000000000000000) {
    lVar1 = *unaff_x20;
    unaff_x21[1] = unaff_x20[1];
    *unaff_x21 = lVar1;
    unaff_x21[2] = unaff_x20[2];
  }
  else {
    unaff_x21[1] = in_stack_00000010;
    *unaff_x21 = in_stack_00000008;
    unaff_x21[2] = in_stack_00000018;
    if (*unaff_x20 != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__free_00a24e58)();
      return;
    }
  }
  return;
}

