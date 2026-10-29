/* 7ff70ca20980 Unwind@7ff70ca20980 */

void Unwind_7ff70ca20980(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  func_0x7ff70ca641c0(param_2 + 0x3a0);
  plVar1 = *(longlong **)(param_2 + 0x390);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_2 + 0x358));
    *(undefined8 *)(param_2 + 0x390) = 0;
  }
  func_0x7ff70ca64160(param_2 + 0x160);
  return;
}


