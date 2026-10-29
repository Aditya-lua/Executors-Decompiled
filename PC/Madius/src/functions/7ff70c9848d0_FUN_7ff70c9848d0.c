/* 7ff70c9848d0 FUN_7ff70c9848d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9848d0(longlong param_1,undefined8 *param_2)

{
  int *piVar1;
  longlong lVar2;
  
  if (param_1 == 0) {
    piVar1 = (int *)(param_2 + 2);
    *piVar1 = *piVar1 + -1;
    if (*piVar1 == 0) {
      FUN_7ff70c9834a0(*param_2);
                    /* WARNING: Could not recover jumptable at 0x7ff70c984925. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*_DAT_7ff70cbebad8)(param_2);
      return;
    }
  }
  else {
    if (*(longlong *)(param_1 + 0xe8) != 0) {
      FUN_7ff70c959850(param_1,3,2);
    }
    piVar1 = (int *)(param_2 + 2);
    *piVar1 = *piVar1 + -1;
    if (*piVar1 == 0) {
      FUN_7ff70c9834a0(*param_2);
      (*_DAT_7ff70cbebad8)(param_2);
      lVar2 = *(longlong *)(param_1 + 0xe8);
    }
    else {
      lVar2 = *(longlong *)(param_1 + 0xe8);
    }
    if (lVar2 != 0) {
      FUN_7ff70c959890(param_1,3);
      return;
    }
  }
  return;
}


