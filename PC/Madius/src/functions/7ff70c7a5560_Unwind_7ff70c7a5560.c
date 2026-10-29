/* 7ff70c7a5560 Unwind@7ff70c7a5560 */

void Unwind_7ff70c7a5560(undefined8 param_1,longlong param_2)

{
  undefined8 uVar1;
  longlong lVar2;
  longlong *plVar3;
  
  uVar1 = *(undefined8 *)(param_2 + 0xe8);
  lVar2 = *(longlong *)(param_2 + 0xf8);
  plVar3 = *(longlong **)(lVar2 + 0x58);
  if (plVar3 != (longlong *)0x0) {
    (**(code **)(*plVar3 + 0x20))(plVar3,plVar3 != *(longlong **)(param_2 + 0xf0));
    *(undefined8 *)(lVar2 + 0x58) = 0;
  }
  func_0x7ff70c7aae80(uVar1);
  thunk_FUN_7ff70ca90250(lVar2,0x68);
  return;
}


