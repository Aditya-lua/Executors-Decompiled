
void FUN_001b8c18(long *param_1,undefined8 param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  undefined4 uStack0000000000000020;
  long in_stack_00000028;
  long in_stack_00000030;
  long in_stack_00000038;
  
  func_0x00224240(&uStack0000000000000020);
  lVar3 = in_stack_00000038;
  lVar2 = in_stack_00000030;
  lVar1 = in_stack_00000028;
  if (uStack0000000000000020 == 1) {
    param_1[2] = in_stack_00000030;
    param_1[3] = in_stack_00000038;
    *param_1 = -0x8000000000000000;
    param_1[1] = in_stack_00000028;
  }
  else {
    func_0x001a846c(&uStack0000000000000020,param_2);
    if (uStack0000000000000020 == 1) {
      param_1[2] = in_stack_00000030;
      param_1[1] = in_stack_00000028;
      param_1[3] = in_stack_00000038;
      *param_1 = -0x8000000000000000;
      if (lVar1 != 0) {
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)PTR__free_00a24e58)(lVar2,lVar1,1);
        return;
      }
    }
    else {
      param_1[4] = in_stack_00000030;
      param_1[3] = in_stack_00000028;
      param_1[5] = in_stack_00000038;
      *param_1 = lVar1;
      param_1[1] = lVar2;
      param_1[2] = lVar3;
    }
  }
  return;
}

