/* 7ff70c876f70 FUN_7ff70c876f70 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c876f70(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  code *pcVar1;
  longlong lVar2;
  undefined8 uStackX_18;
  undefined8 uStackX_20;
  undefined1 auStack_58 [40];
  undefined8 *puStack_30;
  undefined8 uStack_28;
  undefined8 uStack_20;
  ulonglong uStack_18;
  
  uStack_18 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  uStackX_18 = param_3;
  uStackX_20 = param_4;
  puStack_30 = &uStackX_18;
  FUN_7ff70c80a550(0,param_1);
  lVar2 = _DAT_7ff70cc1a3c0;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  if (*(char *)(*(longlong *)(lVar2 + 0x1440) + 0xd1) == '\0') {
    FUN_7ff70c802cf0(&uStack_20,&uStack_28,param_2,&uStackX_18);
    FUN_7ff70c8768b0(uStack_20,uStack_28,1);
  }
  FUN_7ff70c80a7b0(1);
  if (_DAT_7ff70cbebd80 == (uStack_18 ^ (ulonglong)auStack_58)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_18 ^ (ulonglong)auStack_58);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


