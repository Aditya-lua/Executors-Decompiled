/* 7ff70c914b70 Unwind@7ff70c914b70 */

void Unwind_7ff70c914b70(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)(param_2 + 0xa8);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_2 + 0x70));
    *(undefined8 *)(param_2 + 0xa8) = 0;
  }
  return;
}


