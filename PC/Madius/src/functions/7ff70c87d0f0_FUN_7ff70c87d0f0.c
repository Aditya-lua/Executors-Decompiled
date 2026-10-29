/* 7ff70c87d0f0 FUN_7ff70c87d0f0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c87d0f0(undefined8 param_1,undefined8 param_2,undefined4 param_3,undefined1 param_4)

{
  code *pcVar1;
  undefined1 auStack_38 [32];
  undefined1 uStack_18;
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  uStack_18 = param_4;
  FUN_7ff70c8a4c50(param_1,0,param_2,param_3);
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_38)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_38);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


