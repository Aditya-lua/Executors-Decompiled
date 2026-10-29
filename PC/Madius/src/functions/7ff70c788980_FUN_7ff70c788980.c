/* 7ff70c788980 FUN_7ff70c788980 */

void FUN_7ff70c788980(longlong *param_1)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)((longlong)param_1 + (longlong)*(int *)(*param_1 + 4) + 0x48);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 8))();
  }
  func_0x7ff70d89acd8(param_1,1);
  return;
}


