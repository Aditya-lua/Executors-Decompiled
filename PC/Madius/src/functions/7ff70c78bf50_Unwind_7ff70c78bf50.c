/* 7ff70c78bf50 Unwind@7ff70c78bf50 */

void Unwind_7ff70c78bf50(undefined8 param_1,longlong param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  longlong *plVar3;
  
  uVar1 = *(undefined8 *)(param_2 + 0x38);
  uVar2 = *(undefined8 *)(param_2 + 0x30);
  func_0x7ff70ca1c2b0(*(undefined8 *)(param_2 + 0x40));
  plVar3 = *(longlong **)(*(longlong *)(param_2 + 0x60) + 0xa8);
  if (plVar3 != (longlong *)0x0) {
    (**(code **)(*plVar3 + 0x20))(plVar3,plVar3 != *(longlong **)(param_2 + 0x48));
    *(undefined8 *)(*(longlong *)(param_2 + 0x60) + 0xa8) = 0;
  }
  func_0x7ff70c788810(uVar1);
  func_0x7ff70c788810(*(undefined8 *)(param_2 + 0x50));
  func_0x7ff70c788810(uVar2);
  plVar3 = *(longlong **)(*(longlong *)(param_2 + 0x58) + 0x38);
  if (plVar3 != (longlong *)0x0) {
    (**(code **)(*plVar3 + 0x20))(plVar3,plVar3 != *(longlong **)(param_2 + 0x58));
  }
  return;
}


