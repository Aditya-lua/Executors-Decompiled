/* 7ff70c9a4980 FUN_7ff70c9a4980 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c9a4980(undefined8 param_1)

{
  code *pcVar1;
  undefined4 uStack_14;
  undefined8 uStack_10;
  
  if (_DAT_7ff70cbecf30 < 4) {
    if (*(int *)(*(longlong *)
                  ((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8) + 4) <
        _DAT_7ff70cc1b0d8) {
      FUN_7ff70caa4e60(&DAT_7ff70cc1b0d8);
      if (_DAT_7ff70cc1b0d8 == -1) {
        _DAT_7ff70cc1b098 = &UNK_7ff70cb6d9b8;
        _DAT_7ff70cc1b0a0 = &UNK_7ff70c9a4700;
        _DAT_7ff70cc1b0d0 = (longlong *)&DAT_7ff70cc1b098;
        FUN_7ff70caa4fb0(&UNK_7ff70c9a4860);
        FUN_7ff70caa4f40(&DAT_7ff70cc1b0d8);
      }
    }
    uStack_14 = 3;
    uStack_10 = param_1;
    if (_DAT_7ff70cc1b0d0 == (longlong *)0x0) {
      FUN_7ff70cb12500();
      pcVar1 = (code *)swi(3);
      (*pcVar1)();
      return;
    }
    (**(code **)(*_DAT_7ff70cc1b0d0 + 0x10))(_DAT_7ff70cc1b0d0,&uStack_14,&uStack_10);
  }
  return;
}


