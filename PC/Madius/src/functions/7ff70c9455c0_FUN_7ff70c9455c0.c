/* 7ff70c9455c0 FUN_7ff70c9455c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9455c0(longlong param_1)

{
  longlong lVar1;
  
  lVar1 = 0;
  do {
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x6f0 + lVar1 * 8));
    *(undefined8 *)(param_1 + 0x6f0 + lVar1 * 8) = 0;
    lVar1 = lVar1 + 1;
  } while (lVar1 != 0x50);
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x970));
  *(undefined8 *)(param_1 + 0x970) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x978));
  *(undefined8 *)(param_1 + 0x978) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x980));
  *(undefined8 *)(param_1 + 0x980) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x988));
  *(undefined8 *)(param_1 + 0x988) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x990));
  *(undefined8 *)(param_1 + 0x990) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x998));
  *(undefined8 *)(param_1 + 0x998) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x9a0));
  *(undefined8 *)(param_1 + 0x9a0) = 0;
  (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x9a8));
  *(undefined8 *)(param_1 + 0x9a8) = 0;
  if (*(char *)(param_1 + 0x12cc) != '\0') {
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x1170));
    *(undefined1 *)(param_1 + 0x12cc) = 0;
  }
  *(undefined8 *)(param_1 + 0x1170) = 0;
  if (*(char *)(param_1 + 0x12cb) == '\x01') {
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x1168));
    *(undefined1 *)(param_1 + 0x12cb) = 0;
  }
  *(undefined8 *)(param_1 + 0x1168) = 0;
  FUN_7ff70c8f9ca0(param_1 + 0x350);
  FUN_7ff70c8f2cb0(*(undefined8 *)(param_1 + 0x2c0));
  *(undefined8 *)(param_1 + 0x2c0) = 0;
  return;
}


