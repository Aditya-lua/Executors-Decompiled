/* 7ff70c9e7890 FUN_7ff70c9e7890 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_7ff70c9e7890(undefined8 *param_1)

{
  code *pcVar1;
  int iVar2;
  undefined8 *puVar3;
  
  if (*(int *)(*(longlong *)((longlong)ThreadLocalStoragePointer + (ulonglong)_DAT_7ff70cc1a960 * 8)
              + 4) < _DAT_7ff70cc1b1a0) {
    FUN_7ff70caa4e60(&DAT_7ff70cc1b1a0);
    if (_DAT_7ff70cc1b1a0 == -1) {
      _DAT_7ff70cc1b188 = 0;
      uRam00007ff70cc1b190 = 0;
      _DAT_7ff70cc1b178 = 0;
      uRam00007ff70cc1b180 = 0;
      _DAT_7ff70cc1b168 = 0;
      uRam00007ff70cc1b170 = 0;
      _DAT_7ff70cc1b158 = 0;
      uRam00007ff70cc1b160 = 0;
      _DAT_7ff70cc1b198 = 0xffffffff;
      _DAT_7ff70cc1b150 = 0x102;
      FUN_7ff70caa4f40(&DAT_7ff70cc1b1a0);
    }
  }
  *param_1 = &DAT_7ff70cc1b150;
  iVar2 = FUN_7ff70cb12570();
  if (iVar2 == 0) {
    if (_DAT_7ff70cc1b19c != 0x7fffffff) {
      *(undefined1 *)(param_1 + 1) = 1;
      return param_1;
    }
  }
  else {
    FUN_7ff70cb124d0(5);
  }
  _DAT_7ff70cc1b198 = CONCAT44(0x7ffffffe,_DAT_7ff70cc1b198);
  FUN_7ff70cb124d0(6);
  pcVar1 = (code *)swi(3);
  puVar3 = (undefined8 *)(*pcVar1)();
  return puVar3;
}


