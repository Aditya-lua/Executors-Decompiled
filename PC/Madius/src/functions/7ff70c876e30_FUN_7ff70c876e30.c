/* 7ff70c876e30 FUN_7ff70c876e30 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c876e30(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  code *pcVar1;
  longlong lVar2;
  undefined8 uStackX_10;
  undefined8 uStackX_18;
  undefined8 uStackX_20;
  undefined1 auStack_48 [40];
  undefined8 *puStack_20;
  undefined8 uStack_18;
  undefined8 uStack_10;
  ulonglong uStack_8;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_48;
  puStack_20 = &uStackX_10;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  uStackX_10 = param_2;
  uStackX_18 = param_3;
  uStackX_20 = param_4;
  if (*(char *)(*(longlong *)(lVar2 + 0x1440) + 0xd1) == '\0') {
    FUN_7ff70c802cf0(&uStack_10,&uStack_18,param_1);
    FUN_7ff70c8768b0(uStack_10,uStack_18,1);
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_48)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_48);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


