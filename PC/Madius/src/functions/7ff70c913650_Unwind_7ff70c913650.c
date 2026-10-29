/* 7ff70c913650 Unwind@7ff70c913650 */

void Unwind_7ff70c913650(undefined8 param_1,longlong param_2)

{
  int *piVar1;
  longlong *plVar2;
  
  func_0x7ff70c7aae80(param_2 + 0x70);
  func_0x7ff70c8e9fd0(*(undefined8 *)(param_2 + 0x80));
  func_0x7ff70c7aae80(*(undefined8 *)(param_2 + 0x90));
  plVar2 = *(longlong **)(*(longlong *)(param_2 + 0x88) + 8);
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


