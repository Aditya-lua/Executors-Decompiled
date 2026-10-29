/* 7ff70c955550 FUN_7ff70c955550 */

void FUN_7ff70c955550(longlong param_1,undefined8 param_2)

{
  longlong *plVar1;
  
  for (plVar1 = *(longlong **)(param_1 + 0x1d8); plVar1 != (longlong *)0x0;
      plVar1 = (longlong *)plVar1[1]) {
    if (*(code **)(*plVar1 + 0x50) != (code *)&UNK_7ff70c9552f0) {
      (**(code **)(*plVar1 + 0x50))(plVar1,param_2,2,0,0);
    }
  }
  for (plVar1 = *(longlong **)(param_1 + 0x1e0); plVar1 != (longlong *)0x0;
      plVar1 = (longlong *)plVar1[1]) {
    if (*(code **)(*plVar1 + 0x50) != (code *)&UNK_7ff70c9552f0) {
      (**(code **)(*plVar1 + 0x50))(plVar1,param_2,2,0,0);
    }
  }
  return;
}


