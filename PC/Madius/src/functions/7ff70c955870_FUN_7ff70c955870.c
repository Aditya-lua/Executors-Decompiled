/* 7ff70c955870 FUN_7ff70c955870 */

void FUN_7ff70c955870(longlong param_1,undefined1 param_2)

{
  longlong lVar1;
  longlong *plVar2;
  
  lVar1 = *(longlong *)(param_1 + 0x20);
  for (plVar2 = *(longlong **)(lVar1 + 0x1d8); plVar2 != (longlong *)0x0;
      plVar2 = (longlong *)plVar2[1]) {
    if (*(code **)(*plVar2 + 0x50) != (code *)&UNK_7ff70c9552f0) {
      (**(code **)(*plVar2 + 0x50))(plVar2,param_1,7,param_2,0);
    }
  }
  for (plVar2 = *(longlong **)(lVar1 + 0x1e0); plVar2 != (longlong *)0x0;
      plVar2 = (longlong *)plVar2[1]) {
    if (*(code **)(*plVar2 + 0x50) != (code *)&UNK_7ff70c9552f0) {
      (**(code **)(*plVar2 + 0x50))(plVar2,param_1,7,param_2,0);
    }
  }
  return;
}


