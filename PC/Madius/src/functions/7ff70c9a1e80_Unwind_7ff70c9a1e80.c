/* 7ff70c9a1e80 Unwind@7ff70c9a1e80 */

void Unwind_7ff70c9a1e80(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)(*(longlong *)(param_2 + 0x38) + 0xb8);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != *(longlong **)(param_2 + 0x28));
    *(undefined8 *)(*(longlong *)(param_2 + 0x38) + 0xb8) = 0;
  }
  plVar1 = *(longlong **)(*(longlong *)(param_2 + 0x38) + 0x78);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != *(longlong **)(param_2 + 0x30));
    *(undefined8 *)(*(longlong *)(param_2 + 0x38) + 0x78) = 0;
  }
  return;
}


