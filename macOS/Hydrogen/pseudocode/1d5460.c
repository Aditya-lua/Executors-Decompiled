
/* WARNING: Possible PIC construction at 0x001d5474: Changing call to branch */

void FUN_001d5460(long param_1,undefined8 param_2,long param_3)

{
  undefined8 uVar1;
  long unaff_x19;
  undefined8 unaff_x29;
  undefined8 uVar2;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined1 uStack0000000000000040;
  
  if (param_3 == param_1) {
    return;
  }
  if (param_3 == 0) {
    param_3 = *(long *)(unaff_x19 + 0x18);
    if (param_3 == 0) {
      return;
    }
    uVar1 = *(undefined8 *)(unaff_x19 + 0x20);
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000040;
    unaff_x29 = in_stack_00000030;
    uVar2 = in_stack_00000038;
  }
  else {
    uVar1 = *(undefined8 *)(unaff_x19 + 8);
    uVar2 = 0x1d5478;
  }
  *(undefined8 *)((long)register0x00000008 + -0x10) = unaff_x29;
  *(undefined8 *)((long)register0x00000008 + -8) = uVar2;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(uVar1,param_3,1);
  return;
}

