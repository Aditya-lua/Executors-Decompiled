/* 7ff70c789840 Unwind@7ff70c789840 */

void Unwind_7ff70c789840(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  longlong *plVar2;
  
  func_0x7ff70c7898b0(*(undefined8 *)(param_2 + 0x28));
  plVar1 = *(longlong **)(param_2 + 0x30);
  plVar2 = (longlong *)plVar1[7];
  if (plVar2 != (longlong *)0x0) {
    (**(code **)(*plVar2 + 0x20))(plVar2,plVar2 != plVar1);
    plVar1[7] = 0;
  }
  plVar1 = *(longlong **)(*(longlong *)(param_2 + 0x38) + 0x38);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != *(longlong **)(param_2 + 0x38));
  }
  return;
}


