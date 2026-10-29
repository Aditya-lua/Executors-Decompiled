/* 7ff70c9e1320 FUN_7ff70c9e1320 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9e1320(longlong param_1)

{
  if (*(longlong *)(param_1 + 0x18) != 0) {
    (**(code **)(_DAT_7ff70cc1ae50 + 0x48))();
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x18));
    *(undefined8 *)(param_1 + 0x18) = 0;
  }
  if (*(longlong *)(param_1 + 0x10) != 0) {
    (**(code **)(_DAT_7ff70cc1ae50 + 0x20))();
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x10));
    *(undefined8 *)(param_1 + 0x10) = 0;
  }
  FUN_7ff70c9831d0(*(undefined8 *)(param_1 + 0x50));
  *(undefined8 *)(param_1 + 0x50) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x58));
  *(undefined8 *)(param_1 + 0x58) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x68));
  *(undefined4 *)(param_1 + 8) = 0;
  *(undefined8 *)(param_1 + 0x60) = 0;
  *(undefined8 *)(param_1 + 0x68) = 0;
  *(undefined4 *)(param_1 + 0x78) = 0;
  return;
}


