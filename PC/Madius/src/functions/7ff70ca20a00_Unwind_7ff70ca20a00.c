/* 7ff70ca20a00 Unwind@7ff70ca20a00 */

void Unwind_7ff70ca20a00(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)(param_2 + 0x350);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_2 + 0x318));
  }
  return;
}


