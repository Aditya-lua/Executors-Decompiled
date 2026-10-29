/* 7ff70c9973a0 FUN_7ff70c9973a0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9973a0(undefined8 *param_1)

{
  (*_DAT_7ff70cbebad8)(*param_1);
  *param_1 = 0;
  param_1[1] = 0;
  if (param_1[2] != 0) {
    (**(code **)(_DAT_7ff70cc1ae50 + 0x48))();
    (*_DAT_7ff70cbebad8)(param_1[2]);
    param_1[2] = 0;
  }
  (*_DAT_7ff70cbebad8)(param_1[3]);
  param_1[3] = 0;
  (*_DAT_7ff70cbebad8)(param_1[4]);
  param_1[4] = 0;
  return;
}


