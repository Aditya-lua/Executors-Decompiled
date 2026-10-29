/* 7ff70c80c630 FUN_7ff70c80c630 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

char * FUN_7ff70c80c630(char *param_1,ulonglong param_2)

{
  code *pcVar1;
  char *pcVar2;
  char *pcVar3;
  undefined1 auStack_28 [32];
  ulonglong uStack_8;
  
  uStack_8 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_28;
  pcVar2 = (char *)(-(ulonglong)(param_2 == 0) | param_2);
  pcVar3 = param_1;
  if (param_1 < pcVar2) {
    do {
      param_1 = pcVar3;
      if (*param_1 == '#') {
        if (param_1[1] == '#') break;
      }
      else if (*param_1 == '\0') break;
      pcVar3 = param_1 + 1;
      param_1 = pcVar2;
    } while (pcVar3 != pcVar2);
  }
  if (_DAT_7ff70cbebd80 != (uStack_8 ^ (ulonglong)auStack_28)) {
    FUN_7ff70caa97e0(uStack_8 ^ (ulonglong)auStack_28);
    pcVar1 = (code *)swi(3);
    pcVar3 = (char *)(*pcVar1)();
    return pcVar3;
  }
  return param_1;
}


