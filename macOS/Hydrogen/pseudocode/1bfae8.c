
/* WARNING: Possible PIC construction at 0x001bfb14: Changing call to branch */

void FUN_001bfae8(long param_1)

{
  undefined1 in_ZR;
  long *unaff_x19;
  long unaff_x22;
  undefined8 unaff_x29;
  undefined8 uVar1;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  while (!(bool)in_ZR) {
    func_0x0016abd8(param_1);
    unaff_x22 = unaff_x22 + -1;
    param_1 = param_1 + 0x28;
    in_ZR = unaff_x22 == 0;
  }
  if (*unaff_x19 == 0) {
    if (unaff_x19[3] == -0x7fffffffffffffff) {
      if (unaff_x19[4] != 0) {
        func_0x00187bd4(unaff_x19[5],unaff_x19[4],1);
      }
    }
    else {
      func_0x001be5e4();
    }
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    uVar1 = in_stack_00000038;
  }
  else {
    uVar1 = 0x1bfb18;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar1;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)();
  return;
}

