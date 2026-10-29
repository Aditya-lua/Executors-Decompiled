/* 7ff70c8c63f0 Unwind@7ff70c8c63f0 */

void Unwind_7ff70c8c63f0(undefined8 param_1,longlong param_2)

{
  longlong lVar1;
  longlong *plVar2;
  
  lVar1 = *(longlong *)(param_2 + 0x38);
  plVar2 = *(longlong **)(lVar1 + 0x80);
  if (plVar2 != (longlong *)0x0) {
    (**(code **)(*plVar2 + 0x20))(plVar2,plVar2 != *(longlong **)(param_2 + 0x30));
    *(undefined8 *)(lVar1 + 0x80) = 0;
  }
  return;
}


