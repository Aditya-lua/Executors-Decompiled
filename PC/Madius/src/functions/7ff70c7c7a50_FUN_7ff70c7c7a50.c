/* 7ff70c7c7a50 FUN_7ff70c7c7a50 */

void FUN_7ff70c7c7a50(longlong param_1)

{
  longlong *plVar1;
  longlong lVar2;
  int iVar3;
  longlong lVar4;
  longlong *plVar5;
  
  *(undefined1 *)(param_1 + 0x51) = 0;
  FUN_7ff70c7c7c80();
  if ((longlong)*(int *)(param_1 + 0x40) != 0) {
    plVar5 = *(longlong **)(param_1 + 0x48);
    plVar1 = plVar5 + *(int *)(param_1 + 0x40);
    do {
      lVar4 = *plVar5;
      if (*(longlong *)(lVar4 + 0x28) != 0) {
        FUN_7ff70c802510();
      }
      *(undefined8 *)(lVar4 + 0x28) = 0;
      *(undefined1 *)(lVar4 + 0x56) = 0;
      plVar5 = plVar5 + 1;
    } while (plVar5 != plVar1);
    iVar3 = *(int *)(param_1 + 0x40);
    if (0 < iVar3) {
      lVar4 = 0;
      do {
        lVar2 = *(longlong *)(*(longlong *)(param_1 + 0x48) + lVar4 * 8);
        if (lVar2 != 0) {
          if (*(longlong *)(lVar2 + 0x28) != 0) {
            FUN_7ff70c802510();
          }
          *(undefined8 *)(lVar2 + 0x28) = 0;
          *(undefined1 *)(lVar2 + 0x56) = 0;
          if (*(longlong *)(lVar2 + 0x48) != 0) {
            FUN_7ff70c802510();
          }
          FUN_7ff70c802510(lVar2);
          iVar3 = *(int *)(param_1 + 0x40);
        }
        lVar4 = lVar4 + 1;
      } while (lVar4 < iVar3);
    }
  }
  if (*(longlong *)(param_1 + 0x48) != 0) {
    *(undefined8 *)(param_1 + 0x40) = 0;
    FUN_7ff70c802510();
    *(undefined8 *)(param_1 + 0x48) = 0;
  }
  *(undefined8 *)(param_1 + 0x38) = 0;
  if (*(longlong *)(param_1 + 0x2a8) != 0) {
    FUN_7ff70c802510();
  }
  if (*(longlong *)(param_1 + 0x80) != 0) {
    FUN_7ff70c802510();
  }
  if (*(longlong *)(param_1 + 0x70) != 0) {
    FUN_7ff70c802510();
  }
  if (*(longlong *)(param_1 + 0x48) != 0) {
    FUN_7ff70c802510();
  }
  return;
}


