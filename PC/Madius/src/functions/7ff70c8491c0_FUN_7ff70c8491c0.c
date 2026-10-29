/* 7ff70c8491c0 FUN_7ff70c8491c0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

bool FUN_7ff70c8491c0(undefined8 param_1,longlong param_2,longlong param_3,longlong param_4,
                     longlong param_5,longlong param_6,longlong param_7)

{
  code *pcVar1;
  undefined1 uVar2;
  int iVar3;
  undefined1 auStack_58 [32];
  ulonglong uStack_38;
  
  uStack_38 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  iVar3 = FUN_7ff70cb12e60(param_1,&UNK_7ff70cb8bd4c);
  if (_DAT_7ff70cbebd80 == (uStack_38 ^ (ulonglong)auStack_58)) {
    return (param_7 == 2 &&
           (param_6 == 0x14 &&
           (param_5 == 0x10 && (param_4 == 8 && (param_3 == 0x4d0 && param_2 == 0xbd8))))) &&
           iVar3 == 0;
  }
  FUN_7ff70caa97e0(uStack_38 ^ (ulonglong)auStack_58);
  pcVar1 = (code *)swi(3);
  uVar2 = (*pcVar1)();
  return (bool)uVar2;
}


