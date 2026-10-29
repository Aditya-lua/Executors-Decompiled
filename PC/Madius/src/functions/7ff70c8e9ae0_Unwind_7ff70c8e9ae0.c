/* 7ff70c8e9ae0 Unwind@7ff70c8e9ae0 */

void Unwind_7ff70c8e9ae0(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)(*(longlong *)(param_2 + 0x38) + 0xf8);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != *(longlong **)(param_2 + 0x20));
    *(undefined8 *)(*(longlong *)(param_2 + 0x38) + 0xf8) = 0;
  }
  plVar1 = *(longlong **)(*(longlong *)(param_2 + 0x38) + 0xb8);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != *(longlong **)(param_2 + 0x30));
    *(undefined8 *)(*(longlong *)(param_2 + 0x38) + 0xb8) = 0;
  }
  return;
}


