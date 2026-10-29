/* 7ff70c958860 FUN_7ff70c958860 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c958860(longlong *param_1)

{
  longlong lVar1;
  longlong lVar2;
  
  if (param_1 == (longlong *)0x0) {
    return;
  }
  lVar1 = *param_1;
  if (lVar1 != 0) {
    if (0 < (int)param_1[4]) {
      lVar2 = 0;
      lVar1 = 0;
      do {
        FUN_7ff70c9910a0(*param_1 + lVar2,param_1);
        lVar1 = lVar1 + 1;
        lVar2 = lVar2 + 0x20;
      } while (lVar1 < (int)param_1[4]);
      lVar1 = *param_1;
    }
    (*_DAT_7ff70cbebad8)(lVar1);
    *param_1 = 0;
  }
  param_1[5] = 0;
  *(undefined4 *)(param_1 + 4) = 0;
  return;
}


