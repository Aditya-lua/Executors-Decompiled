/* 7ff70c94b640 FUN_7ff70c94b640 */

void FUN_7ff70c94b640(longlong param_1)

{
  int iVar1;
  longlong *plVar2;
  longlong lVar3;
  longlong lVar4;
  
  plVar2 = *(longlong **)(param_1 + 0x40);
  if (plVar2 != (longlong *)0x0) {
    lVar3 = *plVar2;
    *(undefined8 *)(lVar3 + 0x10) = 0;
    if (*(longlong *)(param_1 + 8) == 0) {
      *(undefined8 *)(lVar3 + 0x18) = 0;
      *(longlong *)(param_1 + 8) = lVar3;
      *(longlong *)(param_1 + 0x10) = lVar3;
      iVar1 = *(int *)(lVar3 + 0x58);
    }
    else {
      lVar4 = *(longlong *)(param_1 + 0x10);
      *(longlong *)(lVar4 + 0x10) = lVar3;
      *(longlong *)(lVar3 + 0x18) = lVar4;
      *(longlong *)(param_1 + 0x10) = lVar3;
      iVar1 = *(int *)(lVar3 + 0x58);
    }
    if (iVar1 != 2) {
      *(undefined4 *)(lVar3 + 0x58) = 2;
      FUN_7ff70c994d50(lVar3);
    }
    FUN_7ff70c991030(param_1 + 0x40,plVar2,0);
    FUN_7ff70c94a660(lVar3,0,8);
    *(undefined1 *)(lVar3 + 0x12c8) = 1;
  }
  return;
}


