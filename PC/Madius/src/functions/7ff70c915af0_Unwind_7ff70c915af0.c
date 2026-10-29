/* 7ff70c915af0 Unwind@7ff70c915af0 */

void Unwind_7ff70c915af0(undefined8 param_1,longlong param_2)

{
  int *piVar1;
  undefined8 uVar2;
  longlong lVar3;
  longlong *plVar4;
  
  uVar2 = *(undefined8 *)(param_2 + 0x50);
  lVar3 = *(longlong *)(param_2 + 0xc0);
  plVar4 = *(longlong **)(*(longlong *)(param_2 + 0x48) + 0x120);
  if (plVar4 != (longlong *)0x0) {
    LOCK();
    piVar1 = (int *)((longlong)plVar4 + 0xc);
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    if (*piVar1 == 0) {
      (**(code **)(*plVar4 + 8))();
    }
  }
  func_0x7ff70c8e9fd0(uVar2);
  plVar4 = *(longlong **)(lVar3 + 8);
  if (plVar4 != (longlong *)0x0) {
    LOCK();
    piVar1 = (int *)((longlong)plVar4 + 0xc);
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    if (*piVar1 == 0) {
      (**(code **)(*plVar4 + 8))();
    }
  }
  return;
}


