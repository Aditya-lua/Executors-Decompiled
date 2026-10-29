/* 7ff70c8fac30 FUN_7ff70c8fac30 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c8fac30(longlong param_1,longlong param_2)

{
  longlong lVar1;
  
  if (param_1 == 0) {
    return 0x2b;
  }
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x68));
  *(undefined8 *)(param_1 + 0x68) = 0;
  if (param_2 != 0) {
    lVar1 = (*_DAT_7ff70cbebae8)(param_2);
    *(longlong *)(param_1 + 0x68) = lVar1;
    if (lVar1 == 0) {
      return 0x1b;
    }
  }
  return 0;
}


