/* 7ff70ca20a60 Unwind@7ff70ca20a60 */

void Unwind_7ff70ca20a60(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  func_0x7ff70ca1c2b0(param_2 + 0x298);
  plVar1 = *(longlong **)(param_2 + 0x288);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_2 + 0x250));
    *(undefined8 *)(param_2 + 0x288) = 0;
  }
  func_0x7ff70c788810(param_2 + 0x220);
  func_0x7ff70c788810(param_2 + 0x200);
  func_0x7ff70c788810(param_2 + 0x1e8);
  plVar1 = *(longlong **)(param_2 + 0x350);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_2 + 0x318));
  }
  return;
}


