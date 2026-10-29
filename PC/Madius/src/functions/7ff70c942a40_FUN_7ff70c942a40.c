/* 7ff70c942a40 FUN_7ff70c942a40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c942a40(longlong param_1,int param_2)

{
  undefined8 uVar1;
  longlong lVar2;
  
  if (*(int *)(param_1 + 0x1398) != 0) {
    if (0 < *(int *)(param_1 + 0x1398)) {
      lVar2 = 0;
      do {
        FUN_7ff70c8f2cb0(*(undefined8 *)(*(longlong *)(param_1 + 0x13a0) + lVar2 * 8));
        *(undefined8 *)(*(longlong *)(param_1 + 0x13a0) + lVar2 * 8) = 0;
        lVar2 = lVar2 + 1;
      } while (lVar2 < *(int *)(param_1 + 0x1398));
    }
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x13a0));
    *(undefined8 *)(param_1 + 0x13a0) = 0;
    *(undefined4 *)(param_1 + 0x1398) = 0;
  }
  lVar2 = (*_DAT_7ff70cbebaf0)((longlong)param_2,8);
  if (lVar2 == 0) {
    uVar1 = 0x1b;
  }
  else {
    *(int *)(param_1 + 0x1398) = param_2;
    *(longlong *)(param_1 + 0x13a0) = lVar2;
    uVar1 = 0;
  }
  return uVar1;
}


