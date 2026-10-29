/* 7ff70c94ef70 FUN_7ff70c94ef70 */

void FUN_7ff70c94ef70(longlong param_1,undefined4 param_2)

{
  int iVar1;
  longlong lVar2;
  longlong *plVar3;
  longlong lVar4;
  longlong lVar5;
  
  **(undefined4 **)(*(longlong *)(param_1 + 0x20) + 0x5d8) = param_2;
  lVar2 = *(longlong *)(param_1 + 0xd8);
  plVar3 = *(longlong **)(lVar2 + 0x40);
  if (plVar3 != (longlong *)0x0) {
    lVar4 = *plVar3;
    *(undefined8 *)(lVar4 + 0x10) = 0;
    if (*(longlong *)(lVar2 + 8) == 0) {
      *(undefined8 *)(lVar4 + 0x18) = 0;
      *(longlong *)(lVar2 + 8) = lVar4;
      *(longlong *)(lVar2 + 0x10) = lVar4;
      iVar1 = *(int *)(lVar4 + 0x58);
    }
    else {
      lVar5 = *(longlong *)(lVar2 + 0x10);
      *(longlong *)(lVar5 + 0x10) = lVar4;
      *(longlong *)(lVar4 + 0x18) = lVar5;
      *(longlong *)(lVar2 + 0x10) = lVar4;
      iVar1 = *(int *)(lVar4 + 0x58);
    }
    if (iVar1 != 2) {
      *(undefined4 *)(lVar4 + 0x58) = 2;
      FUN_7ff70c994d50(lVar4);
    }
    FUN_7ff70c991030(lVar2 + 0x40,plVar3,0);
    FUN_7ff70c94a660(lVar4,0,8);
    *(undefined1 *)(lVar4 + 0x12c8) = 1;
  }
  return;
}


