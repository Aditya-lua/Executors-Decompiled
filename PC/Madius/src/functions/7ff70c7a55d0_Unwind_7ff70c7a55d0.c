/* 7ff70c7a55d0 Unwind@7ff70c7a55d0 */

void Unwind_7ff70c7a55d0(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)(*(longlong *)(param_2 + 0x118) + 0x240);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != *(longlong **)(param_2 + 0xe0));
    *(undefined8 *)(*(longlong *)(param_2 + 0x118) + 0x240) = 0;
  }
  func_0x7ff70c7af460(*(undefined8 *)(param_2 + 0x118));
  return;
}


