/* 7ff70c9e0a20 FUN_7ff70c9e0a20 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9e0a20(longlong param_1)

{
  if (*(longlong *)(param_1 + 0x10) != 0) {
    (**(code **)(_DAT_7ff70cc1ae50 + 0x48))();
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x10));
    *(undefined8 *)(param_1 + 0x10) = 0;
  }
  if (*(longlong *)(param_1 + 8) != 0) {
    (**(code **)(_DAT_7ff70cc1ae50 + 0x20))();
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 8));
    *(undefined8 *)(param_1 + 8) = 0;
  }
  FUN_7ff70c9831d0(*(undefined8 *)(param_1 + 0x48));
  *(undefined8 *)(param_1 + 0x48) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x60));
  *(undefined8 *)(param_1 + 0x60) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x58));
  *(undefined8 *)(param_1 + 0x50) = 0;
  *(undefined8 *)(param_1 + 0x58) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x70));
  *(undefined8 *)(param_1 + 0x70) = 0;
  return;
}


