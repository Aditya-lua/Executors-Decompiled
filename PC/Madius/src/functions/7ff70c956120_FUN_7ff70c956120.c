/* 7ff70c956120 FUN_7ff70c956120 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c956120(longlong param_1)

{
  longlong *plVar1;
  ulonglong uVar2;
  longlong lVar3;
  
  plVar1 = *(longlong **)(param_1 + 0x170);
  while (plVar1 != (longlong *)0x0) {
    *(longlong *)(param_1 + 0x170) = plVar1[1];
    (**(code **)(*plVar1 + 0x20))(param_1,plVar1);
    (*_DAT_7ff70cbebad8)(plVar1);
    plVar1 = *(longlong **)(param_1 + 0x170);
  }
  if (*(int *)(param_1 + 0xcf8) != 0) {
    lVar3 = param_1 + 0xc80;
    uVar2 = 0;
    do {
      FUN_7ff70c94fd10(lVar3);
      uVar2 = uVar2 + 1;
      lVar3 = lVar3 + 0x28;
    } while (uVar2 < *(uint *)(param_1 + 0xcf8));
  }
  *(undefined4 *)(param_1 + 0xcf8) = 0;
  return;
}


