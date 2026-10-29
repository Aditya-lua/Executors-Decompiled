/* 7ff70c7a5500 Unwind@7ff70c7a5500 */

void Unwind_7ff70c7a5500(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)(param_2 + 0xd0);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_2 + 0x98));
    *(undefined8 *)(param_2 + 0xd0) = 0;
  }
  func_0x7ff70c7aae80(param_2 + 0x80);
  return;
}


