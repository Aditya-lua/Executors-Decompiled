/* 7ff70c9831d0 FUN_7ff70c9831d0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9831d0(undefined8 *param_1)

{
  if (param_1 != (undefined8 *)0x0) {
    (*_DAT_7ff70cbebad8)(*param_1);
    *param_1 = 0;
    (*_DAT_7ff70cbebad8)(param_1[4]);
    param_1[4] = 0;
    (*_DAT_7ff70cbebad8)(param_1[2]);
    param_1[2] = 0;
  }
  return;
}


