/* 7ff70c8fa550 FUN_7ff70c8fa550 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c8fa550(longlong param_1,longlong param_2,longlong param_3)

{
  longlong lVar1;
  undefined8 uVar2;
  
  if (param_1 == 0) {
    uVar2 = 0x2b;
  }
  else {
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
    uVar2 = 0;
    if (param_2 != 0) {
      if (param_3 == -1) {
        param_3 = FUN_7ff70cb12e80(param_2);
      }
      lVar1 = (*_DAT_7ff70cbebad0)(param_3 + 1);
      *(longlong *)(param_1 + 0x18) = lVar1;
      if (lVar1 == 0) {
        uVar2 = 0x1b;
      }
      else {
        *(longlong *)(param_1 + 0x70) = param_3;
        if (param_3 != 0) {
          FUN_7ff70cb12b60(lVar1,param_2,param_3);
          lVar1 = *(longlong *)(param_1 + 0x18);
        }
        uVar2 = 0;
        *(undefined1 *)(lVar1 + param_3) = 0;
        *(undefined **)(param_1 + 0x20) = &UNK_7ff70c8facf0;
        *(undefined **)(param_1 + 0x28) = &UNK_7ff70c8fad60;
        *(undefined **)(param_1 + 0x30) = &UNK_7ff70c8fada0;
        *(byte *)(param_1 + 0x14) = *(byte *)(param_1 + 0x14) | 4;
        *(undefined4 *)(param_1 + 0x10) = 1;
      }
    }
  }
  return uVar2;
}


