/* 7ff70c7a9410 Unwind@7ff70c7a9410 */

void Unwind_7ff70c7a9410(undefined8 param_1,longlong param_2)

{
  undefined8 uVar1;
  longlong *plVar2;
  
  uVar1 = *(undefined8 *)(param_2 + 0x28);
  plVar2 = *(longlong **)(*(longlong *)(param_2 + 0x38) + 0x58);
  if (plVar2 != (longlong *)0x0) {
    (**(code **)(*plVar2 + 0x20))
              (plVar2,CONCAT71((int7)((ulonglong)*(longlong **)(param_2 + 0x30) >> 8),
                               plVar2 != *(longlong **)(param_2 + 0x30)));
    *(undefined8 *)(*(longlong *)(param_2 + 0x38) + 0x58) = 0;
  }
  func_0x7ff70c7aae80(uVar1);
  thunk_FUN_7ff70ca90250(*(undefined8 *)(param_2 + 0x38),0x68);
  return;
}


