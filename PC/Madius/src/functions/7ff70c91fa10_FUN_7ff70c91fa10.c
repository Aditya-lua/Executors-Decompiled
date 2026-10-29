/* 7ff70c91fa10 FUN_7ff70c91fa10 */

void FUN_7ff70c91fa10(undefined8 *param_1,char *param_2,char *param_3,undefined8 param_4)

{
  ulonglong uVar1;
  char *pcVar2;
  char cVar3;
  undefined8 *puVar4;
  char *pcStack_b8;
  char *pcStack_b0;
  undefined8 *puStack_a8;
  char **ppcStack_a0;
  char **ppcStack_98;
  undefined8 uStack_90;
  char **ppcStack_88;
  char **ppcStack_80;
  char **ppcStack_78;
  char ***pppcStack_70;
  char **ppcStack_68;
  char ***pppcStack_60;
  undefined8 *puStack_58;
  undefined8 uStack_50;
  undefined8 **ppuStack_48;
  
  uStack_90 = 0;
  if (param_2 != param_3) {
    pcStack_b0 = param_3;
    puStack_a8 = param_1;
    ppcStack_a0 = &pcStack_b0;
    ppcStack_98 = &pcStack_b8;
    ppcStack_88 = &pcStack_b8;
    ppcStack_80 = &pcStack_b0;
    do {
      cVar3 = *param_2;
      if ((cVar3 == '}') || (cVar3 == '{')) {
        if ((longlong)*ppcStack_a0 - (longlong)*ppcStack_98 < 2) {
          if (cVar3 == '\0') goto LAB_7ff70c91fb36;
          goto LAB_7ff70c91fad3;
        }
        if ((*ppcStack_98)[1] != cVar3) goto LAB_7ff70c91fad3;
LAB_7ff70c91fb36:
        pcVar2 = param_2 + 1;
LAB_7ff70c91fb3e:
        pcStack_b8 = pcVar2;
        cVar3 = *pcStack_b8;
        uVar1 = puStack_a8[2];
        if (uVar1 < (ulonglong)puStack_a8[3]) {
          puStack_a8[2] = uVar1 + 1;
          puVar4 = puStack_a8;
          if (0xf < (ulonglong)puStack_a8[3]) {
            puVar4 = (undefined8 *)*puStack_a8;
          }
          *(char *)((longlong)puVar4 + uVar1) = cVar3;
          *(undefined1 *)((longlong)puVar4 + uVar1 + 1) = 0;
        }
        else {
          FUN_7ff70ca31d10(puStack_a8,1);
        }
      }
      else {
LAB_7ff70c91fad3:
        pcVar2 = param_2;
        if (param_2 + 1 == pcStack_b0 || cVar3 != '{') goto LAB_7ff70c91fb3e;
        pppcStack_70 = &ppcStack_88;
        pcStack_b8 = param_2;
        ppcStack_78 = &pcStack_b8;
        ppcStack_68 = &pcStack_b0;
        pppcStack_60 = &ppcStack_a0;
        puStack_58 = &uStack_90;
        uStack_50 = param_4;
        ppuStack_48 = &puStack_a8;
        cVar3 = FUN_7ff70c91fb90(&ppcStack_78);
        pcVar2 = param_2;
        if (cVar3 == '\0') goto LAB_7ff70c91fb3e;
      }
      param_2 = pcStack_b8 + 1;
    } while (param_2 != pcStack_b0);
  }
  return;
}


