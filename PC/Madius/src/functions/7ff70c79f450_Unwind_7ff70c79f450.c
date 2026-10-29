/* 7ff70c79f450 Unwind@7ff70c79f450 */

void Unwind_7ff70c79f450(undefined8 param_1,longlong param_2)

{
  int *piVar1;
  longlong *plVar2;
  
  func_0x7ff70ca3df20(*(undefined8 *)(param_2 + 0x38));
  plVar2 = *(longlong **)(*(longlong *)(param_2 + 0xe0) + 8);
  if (plVar2 != (longlong *)0x0) {
    LOCK();
    piVar1 = (int *)((longlong)plVar2 + 0xc);
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    if (*piVar1 == 0) {
      (**(code **)(*plVar2 + 8))();
    }
  }
  return;
}


