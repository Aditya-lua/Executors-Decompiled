/* 7ff70c80cf40 FUN_7ff70c80cf40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

float * FUN_7ff70c80cf40(float *param_1,char *param_2,char *param_3,char param_4,undefined4 param_5)

{
  code *pcVar1;
  float *pfVar2;
  char *pcVar3;
  float fVar4;
  undefined1 auStack_58 [32];
  undefined4 uStack_38;
  char *pcStack_30;
  char *pcStack_28;
  undefined8 uStack_20;
  ulonglong uStack_10;
  
  uStack_10 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_58;
  if (param_4 == '\0') {
LAB_7ff70c80cfa2:
    fVar4 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1130);
    pcVar3 = param_3;
joined_r0x7ff70c80cfad:
    if (param_2 != pcVar3) {
      uStack_38 = param_5;
      uStack_20 = 0;
      pcStack_30 = param_2;
      pcStack_28 = pcVar3;
      FUN_7ff70c7f97b0(*(undefined8 *)(_DAT_7ff70cc1a3c0 + 0x1120),param_1,pcVar3,_DAT_7ff70cb1c5d8)
      ;
      *param_1 = (float)(int)(*param_1 + _DAT_7ff70cb1d650);
      goto LAB_7ff70c80d014;
    }
  }
  else {
    pcVar3 = (char *)(-(ulonglong)(param_3 == (char *)0x0) | (ulonglong)param_3);
    param_3 = param_2;
    if (param_2 < pcVar3) {
      do {
        if (*param_3 == '#') {
          if (param_3[1] == '#') goto LAB_7ff70c80cfa2;
        }
        else if (*param_3 == '\0') goto LAB_7ff70c80cfa2;
        param_3 = param_3 + 1;
      } while (param_3 != pcVar3);
      fVar4 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1130);
      goto joined_r0x7ff70c80cfad;
    }
    fVar4 = *(float *)(_DAT_7ff70cc1a3c0 + 0x1130);
  }
  *param_1 = 0.0;
  param_1[1] = fVar4;
LAB_7ff70c80d014:
  if (_DAT_7ff70cbebd80 == (uStack_10 ^ (ulonglong)auStack_58)) {
    return param_1;
  }
  FUN_7ff70caa97e0(uStack_10 ^ (ulonglong)auStack_58);
  pcVar1 = (code *)swi(3);
  pfVar2 = (float *)(*pcVar1)();
  return pfVar2;
}


