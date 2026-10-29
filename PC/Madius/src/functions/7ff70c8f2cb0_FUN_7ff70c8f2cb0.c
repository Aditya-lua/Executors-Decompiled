/* 7ff70c8f2cb0 FUN_7ff70c8f2cb0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8f2cb0(undefined8 *param_1)

{
  undefined8 *puVar1;
  
  while (param_1 != (undefined8 *)0x0) {
    puVar1 = (undefined8 *)param_1[1];
    (*_DAT_7ff70cbebad8)(*param_1);
    *param_1 = 0;
    (*_DAT_7ff70cbebad8)(param_1);
    param_1 = puVar1;
  }
  return;
}


