/* 7ff70c9429c0 FUN_7ff70c9429c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9429c0(longlong param_1)

{
  longlong lVar1;
  
  if (*(int *)(param_1 + 0x1398) != 0) {
    if (0 < *(int *)(param_1 + 0x1398)) {
      lVar1 = 0;
      do {
        FUN_7ff70c8f2cb0(*(undefined8 *)(*(longlong *)(param_1 + 0x13a0) + lVar1 * 8));
        *(undefined8 *)(*(longlong *)(param_1 + 0x13a0) + lVar1 * 8) = 0;
        lVar1 = lVar1 + 1;
      } while (lVar1 < *(int *)(param_1 + 0x1398));
    }
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x13a0));
    *(undefined8 *)(param_1 + 0x13a0) = 0;
    *(undefined4 *)(param_1 + 0x1398) = 0;
  }
  return;
}


