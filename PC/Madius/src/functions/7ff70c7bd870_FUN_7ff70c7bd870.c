/* 7ff70c7bd870 FUN_7ff70c7bd870 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7bd870(longlong param_1,undefined8 *param_2,undefined8 *param_3,uint param_4,
                     undefined4 param_5,undefined4 param_6,undefined4 param_7)

{
  code *pcVar1;
  undefined1 auStack_78 [32];
  undefined4 uStack_58;
  undefined4 uStack_50;
  undefined8 uStack_40;
  undefined8 uStack_38;
  ulonglong uStack_30;
  
  uStack_30 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_78;
  if (0xffffff < param_4) {
    if ((*(byte *)(param_1 + 0x30) & 1) == 0) {
      uStack_38 = CONCAT44((float)((ulonglong)*param_3 >> 0x20) + _UNK_7ff70cb1bb04,
                           (float)*param_3 + _DAT_7ff70cb1bb00);
    }
    else {
      uStack_38 = CONCAT44((float)((ulonglong)*param_3 >> 0x20) + _UNK_7ff70cb1baf4,
                           (float)*param_3 + _DAT_7ff70cb1baf0);
    }
    uStack_40 = CONCAT44((float)((ulonglong)*param_2 >> 0x20) + _UNK_7ff70cb1ba84,
                         (float)*param_2 + _DAT_7ff70cb1ba80);
    uStack_58 = param_6;
    FUN_7ff70c7bc820(param_1,&uStack_40,&uStack_38,param_5);
    uStack_50 = param_7;
    uStack_58 = 1;
    FUN_7ff70c7b8f50(param_1,*(undefined8 *)(param_1 + 0x58),*(undefined4 *)(param_1 + 0x50),param_4
                    );
    *(undefined4 *)(param_1 + 0x50) = 0;
  }
  if (_DAT_7ff70cbebd80 == (uStack_30 ^ (ulonglong)auStack_78)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_30 ^ (ulonglong)auStack_78);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


