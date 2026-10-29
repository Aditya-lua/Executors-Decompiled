/* 7ff70c94e3e0 FUN_7ff70c94e3e0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c94e3e0(int *param_1)

{
  int iVar1;
  longlong *plVar2;
  longlong lVar3;
  undefined8 uVar4;
  longlong lVar5;
  undefined1 auStack_38 [24];
  
  uVar4 = 1;
  if (((param_1 != (int *)0x0) && (*param_1 == 0xbab1e)) &&
     (uVar4 = 8, *(char *)((longlong)param_1 + 0x1b3) == '\0')) {
    *param_1 = 0;
    if (*(longlong **)(param_1 + 0x18) != (longlong *)0x0) {
      *(undefined8 *)(**(longlong **)(param_1 + 0x18) + 0xd8) = 0;
    }
    plVar2 = *(longlong **)(param_1 + 0x10);
    if (plVar2 != (longlong *)0x0) {
      lVar5 = *plVar2;
      *(undefined8 *)(lVar5 + 0x10) = 0;
      if (*(longlong *)(param_1 + 2) == 0) {
        *(undefined8 *)(lVar5 + 0x18) = 0;
        *(longlong *)(param_1 + 2) = lVar5;
        *(longlong *)(param_1 + 4) = lVar5;
        iVar1 = *(int *)(lVar5 + 0x58);
      }
      else {
        lVar3 = *(longlong *)(param_1 + 4);
        *(longlong *)(lVar3 + 0x10) = lVar5;
        *(longlong *)(lVar5 + 0x18) = lVar3;
        *(longlong *)(param_1 + 4) = lVar5;
        iVar1 = *(int *)(lVar5 + 0x58);
      }
      if (iVar1 != 2) {
        *(undefined4 *)(lVar5 + 0x58) = 2;
        FUN_7ff70c994d50(lVar5);
      }
      FUN_7ff70c991030(param_1 + 0x10,plVar2,0);
      FUN_7ff70c94a660(lVar5,0,8);
      *(undefined1 *)(lVar5 + 0x12c8) = 1;
    }
    lVar5 = *(longlong *)(param_1 + 2);
    while (lVar5 != 0) {
      lVar3 = *(longlong *)(lVar5 + 0x10);
      if ((*(char *)(lVar5 + 0x12c7) == '\0') && (*(longlong *)(lVar5 + 0x20) != 0)) {
        FUN_7ff70c94acb0(lVar5,0,1);
      }
      if (*(int *)(lVar5 + 0xd0) == 1) {
        FUN_7ff70c9849d0(lVar5);
        *(undefined8 *)(lVar5 + 200) = 0;
        *(undefined4 *)(lVar5 + 0xd0) = 0;
      }
      *(undefined8 *)(lVar5 + 0xbf8) = 0;
      *(undefined8 *)(lVar5 + 0xd8) = 0;
      lVar5 = lVar3;
    }
    FUN_7ff70c9590e0(param_1 + 0x44);
    FUN_7ff70c992f20(param_1 + 0x38,auStack_38);
    lVar5 = FUN_7ff70c992f40(auStack_38);
    if (lVar5 != 0) {
      do {
        FUN_7ff70c992c80(*(undefined8 *)(lVar5 + 0x18));
        lVar5 = FUN_7ff70c992f40(auStack_38);
      } while (lVar5 != 0);
    }
    FUN_7ff70c992c80(param_1 + 0x38);
    FUN_7ff70c958860(param_1 + 0x44);
    FUN_7ff70c992c80(param_1 + 0x28);
    func_0x7ff70cc42d5d(*(undefined8 *)(param_1 + 0x6a));
    FUN_7ff70c9427f0(*(undefined8 *)(param_1 + 0x36));
    (*_DAT_7ff70cbebad8)(param_1);
    uVar4 = 0;
  }
  return uVar4;
}


