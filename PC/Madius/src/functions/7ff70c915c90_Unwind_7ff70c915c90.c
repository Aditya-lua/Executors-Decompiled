/* 7ff70c915c90 Unwind@7ff70c915c90 */

void Unwind_7ff70c915c90(undefined8 param_1,longlong param_2)

{
  int *piVar1;
  longlong lVar2;
  longlong *plVar3;
  
  lVar2 = *(longlong *)(param_2 + 0x20);
  plVar3 = *(longlong **)(lVar2 + 0x130);
  if (plVar3 != (longlong *)0x0) {
    LOCK();
    piVar1 = (int *)((longlong)plVar3 + 0xc);
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    if (*piVar1 == 0) {
      (**(code **)(*plVar3 + 8))();
    }
  }
  thunk_FUN_7ff70ca90250(lVar2,0x150);
  return;
}


