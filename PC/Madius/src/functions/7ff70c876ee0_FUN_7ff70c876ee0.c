/* 7ff70c876ee0 FUN_7ff70c876ee0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c876ee0(undefined8 param_1,undefined8 param_2)

{
  code *pcVar1;
  longlong lVar2;
  undefined1 auStack_38 [32];
  undefined8 uStack_18;
  undefined8 uStack_10;
  ulonglong uStack_8;
  
  lVar2 = _DAT_7ff70cc1a3c0;
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_38;
  *(undefined1 *)(*(longlong *)(_DAT_7ff70cc1a3c0 + 0x1440) + 0xce) = 1;
  if (*(char *)(*(longlong *)(lVar2 + 0x1440) + 0xd1) == '\0') {
    FUN_7ff70c802cf0(&uStack_10,&uStack_18,param_1,param_2);
    FUN_7ff70c8768b0(uStack_10,uStack_18,1);
  }
  if (_DAT_7ff70cbebd80 == (uStack_8 ^ (ulonglong)auStack_38)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_38);
  pcVar1 = (code *)swi(3);
  (*pcVar1)();
  return;
}


