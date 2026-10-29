/* 7ff70c802f50 FUN_7ff70c802f50 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

ulonglong FUN_7ff70c802f50(longlong param_1,ulonglong param_2,uint param_3)

{
  char cVar1;
  code *pcVar2;
  uint uVar3;
  ulonglong uVar4;
  char *pcVar5;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  param_3 = ~param_3;
  uVar3 = param_3;
  if (param_2 == 0) {
    pcVar5 = (char *)(param_1 + 2);
    do {
      cVar1 = pcVar5[-2];
      if (cVar1 == '#') {
        if ((pcVar5[-1] == '#') && (*pcVar5 == '#')) {
          uVar3 = param_3;
        }
      }
      else if (cVar1 == '\0') goto LAB_7ff70c802ff4;
      uVar3 = crc32(uVar3,cVar1);
      pcVar5 = pcVar5 + 1;
    } while( true );
  }
  pcVar5 = (char *)(param_1 + 2);
  do {
    param_2 = param_2 - 1;
    if (((1 < param_2 && pcVar5[-2] == '#') && (pcVar5[-1] == '#')) && (*pcVar5 == '#')) {
      uVar3 = param_3;
    }
    uVar3 = crc32(uVar3,pcVar5[-2]);
    pcVar5 = pcVar5 + 1;
  } while (param_2 != 0);
LAB_7ff70c802ff4:
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar2 = (code *)swi(3);
    uVar4 = (*pcVar2)();
    return uVar4;
  }
  return (ulonglong)~uVar3;
}


