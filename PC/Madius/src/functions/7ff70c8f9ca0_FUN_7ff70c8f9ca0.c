/* 7ff70c8f9ca0 FUN_7ff70c8f9ca0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c8f9ca0(longlong param_1)

{
  if (param_1 != 0) {
    if (*(code **)(param_1 + 0x30) != (code *)0x0) {
      (**(code **)(param_1 + 0x30))(*(undefined8 *)(param_1 + 0x38));
    }
    *(undefined8 *)(param_1 + 0x20) = 0;
    *(undefined8 *)(param_1 + 0x28) = 0;
    *(undefined8 *)(param_1 + 0x30) = 0;
    *(longlong *)(param_1 + 0x38) = param_1;
    *(undefined8 *)(param_1 + 0x18) = 0;
    *(undefined8 *)(param_1 + 0x40) = 0;
    *(undefined8 *)(param_1 + 0x70) = 0;
    *(undefined8 *)(param_1 + 0x98) = 0;
    *(undefined8 *)(param_1 + 0xa0) = 0;
    *(undefined8 *)(param_1 + 0xa8) = 0;
    *(undefined4 *)(param_1 + 0x10) = 0;
    *(byte *)(param_1 + 0x14) = *(byte *)(param_1 + 0x14) & 0xfb;
    *(undefined8 *)(param_1 + 0x1b0) = 1;
    *(undefined4 *)(param_1 + 0x78) = 0;
    FUN_7ff70c8f2cb0(*(undefined8 *)(param_1 + 0x48));
    if ((*(byte *)(param_1 + 0x14) & 1) != 0) {
      FUN_7ff70c8f2cb0(*(undefined8 *)(param_1 + 0x50));
    }
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x58));
    *(undefined8 *)(param_1 + 0x58) = 0;
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x68));
    *(undefined8 *)(param_1 + 0x68) = 0;
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(param_1 + 0x60));
    FUN_7ff70cb12b80(param_1,0,0x1b0);
    *(undefined8 *)(param_1 + 0x1b0) = 1;
    *(undefined8 *)(param_1 + 0x80) = 0;
    *(undefined8 *)(param_1 + 0x88) = 0;
  }
  return;
}


