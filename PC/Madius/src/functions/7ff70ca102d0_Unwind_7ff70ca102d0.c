/* 7ff70ca102d0 Unwind@7ff70ca102d0 */

void Unwind_7ff70ca102d0(undefined8 param_1,longlong param_2)

{
  int *piVar1;
  longlong *plVar2;
  undefined8 *puVar3;
  
  if (*(longlong *)(param_2 + 0xb68) != 0) {
    LOCK();
    piVar1 = (int *)(*(longlong *)(param_2 + 0xb68) + 8);
    *piVar1 = *piVar1 + -1;
    UNLOCK();
    if (*piVar1 == 0) {
      plVar2 = *(longlong **)(param_2 + 0xb68);
      puVar3 = (undefined8 *)*plVar2;
      (*(code *)*puVar3)(plVar2);
      LOCK();
      piVar1 = (int *)((longlong)plVar2 + 0xc);
      *piVar1 = *piVar1 + -1;
      UNLOCK();
      if (*piVar1 == 0) {
        (*(code *)puVar3[1])(*(undefined8 *)(param_2 + 0xb68));
      }
    }
  }
  return;
}


