/* 7ff70c954a90 FUN_7ff70c954a90 */

void FUN_7ff70c954a90(longlong param_1,int param_2)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)(*(longlong *)(param_1 + 0x20) + 0x1d8 + (longlong)param_2 * 8);
  if (plVar1 != (longlong *)0x0) {
                    /* WARNING: Could not recover jumptable at 0x7ff70c954ab1. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (**(code **)(*plVar1 + 0x20))(plVar1,param_1,*(code **)(*plVar1 + 0x20));
    return;
  }
  return;
}


