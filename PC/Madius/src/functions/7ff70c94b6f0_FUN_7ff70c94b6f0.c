/* 7ff70c94b6f0 FUN_7ff70c94b6f0 */

void FUN_7ff70c94b6f0(longlong param_1,longlong param_2)

{
  code *pcVar1;
  longlong *plVar2;
  
  *(longlong *)(param_1 + 0x20) = param_2;
  FUN_7ff70c990fc0(param_2 + 0x378,*(undefined8 *)(param_2 + 0x380),param_1,param_1 + 0x40);
  if ((*(longlong *)(param_2 + 0x2e8) != 0) &&
     (pcVar1 = *(code **)(*(longlong *)(param_2 + 0x2e8) + 0x78), pcVar1 != (code *)0x0)) {
    (*pcVar1)(param_1,param_2);
  }
  for (plVar2 = *(longlong **)(param_2 + 0x1d8); plVar2 != (longlong *)0x0;
      plVar2 = (longlong *)plVar2[1]) {
    if (*(code **)(*plVar2 + 0x50) != (code *)&UNK_7ff70c9552f0) {
      (**(code **)(*plVar2 + 0x50))(plVar2,param_1,1,0,0);
    }
  }
  for (plVar2 = *(longlong **)(param_2 + 0x1e0); plVar2 != (longlong *)0x0;
      plVar2 = (longlong *)plVar2[1]) {
    if (*(code **)(*plVar2 + 0x50) != (code *)&UNK_7ff70c9552f0) {
      (**(code **)(*plVar2 + 0x50))(plVar2,param_1,1,0,0);
    }
  }
  return;
}


