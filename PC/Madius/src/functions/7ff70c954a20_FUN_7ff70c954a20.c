/* 7ff70c954a20 FUN_7ff70c954a20 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c954a20(undefined8 param_1,longlong param_2,int param_3)

{
  longlong *plVar1;
  longlong *plVar2;
  
  plVar2 = *(longlong **)(param_2 + 0x1d8 + (longlong)param_3 * 8);
  if (plVar2 != (longlong *)0x0) {
    *(undefined8 *)(param_2 + 0x1d8 + (longlong)param_3 * 8) = 0;
    do {
      plVar1 = (longlong *)plVar2[1];
      plVar2[1] = 0;
      (**(code **)(*plVar2 + 0x10))(plVar2,param_1);
      (*_DAT_7ff70cbebad8)(plVar2);
      plVar2 = plVar1;
    } while (plVar1 != (longlong *)0x0);
  }
  return;
}


