/* 7ff70c7a54a0 Unwind@7ff70c7a54a0 */

void Unwind_7ff70c7a54a0(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)(param_2 + 0x70);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_2 + 0x38));
    *(undefined8 *)(param_2 + 0x70) = 0;
  }
  func_0x7ff70c7aae80(param_2 + 0x20);
  return;
}


