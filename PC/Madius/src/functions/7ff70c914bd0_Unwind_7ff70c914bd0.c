/* 7ff70c914bd0 Unwind@7ff70c914bd0 */

void Unwind_7ff70c914bd0(undefined8 param_1,longlong param_2)

{
  longlong *plVar1;
  
  plVar1 = *(longlong **)(param_2 + 0xe8);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_2 + 0xb0));
    *(undefined8 *)(param_2 + 0xe8) = 0;
  }
  plVar1 = *(longlong **)(param_2 + 0xa8);
  if (plVar1 != (longlong *)0x0) {
    (**(code **)(*plVar1 + 0x20))(plVar1,plVar1 != (longlong *)(param_2 + 0x70));
    *(undefined8 *)(param_2 + 0xa8) = 0;
  }
  return;
}


