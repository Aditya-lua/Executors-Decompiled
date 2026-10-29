/* 7ff70c7c2230 FUN_7ff70c7c2230 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7c2230(longlong param_1,undefined8 param_2,uint param_3,char *param_4,char *param_5)

{
  code *pcVar1;
  undefined1 auStack_68 [32];
  uint uStack_48;
  undefined4 *puStack_40;
  char *pcStack_38;
  char *pcStack_30;
  undefined4 uStack_28;
  undefined1 uStack_20;
  undefined4 uStack_18;
  undefined4 uStack_14;
  undefined4 uStack_10;
  undefined4 uStack_c;
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_68;
  if ((param_4 != param_5 && 0xffffff < param_3) && (*param_4 != '\0')) {
    uStack_18 = *(undefined4 *)(param_1 + 0x60);
    uStack_14 = *(undefined4 *)(param_1 + 100);
    uStack_10 = *(undefined4 *)(param_1 + 0x68);
    uStack_c = *(undefined4 *)(param_1 + 0x6c);
    pcStack_30 = param_5;
    puStack_40 = &uStack_18;
    uStack_20 = 0;
    uStack_28 = 0;
    uStack_48 = param_3;
    pcStack_38 = param_4;
    FUN_7ff70c7c12b0(*(undefined8 *)(*(longlong *)(param_1 + 0x38) + 0x18),param_1,
                     *(undefined4 *)(*(longlong *)(param_1 + 0x38) + 0x20),param_2);
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_68)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_68);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


