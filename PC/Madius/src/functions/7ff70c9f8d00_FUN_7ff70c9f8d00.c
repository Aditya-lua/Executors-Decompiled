/* 7ff70c9f8d00 FUN_7ff70c9f8d00 */

bool FUN_7ff70c9f8d00(char *param_1,longlong param_2,char *param_3,longlong param_4)

{
  char cVar1;
  int iVar2;
  char *pcVar3;
  char *pcVar4;
  char *pcVar5;
  char *pcVar6;
  
  if (((param_1 != (char *)0x0) && (param_3 != (char *)0x0 && *param_1 != '\0')) &&
     (*param_3 != '\0')) {
    pcVar6 = (char *)(param_4 - (ulonglong)(param_3[param_4 + -1] == '.'));
    pcVar5 = (char *)(param_2 - (ulonglong)(param_1[param_2 + -1] == '.'));
    if ((*param_1 == '*') && (param_1[1] == '.')) {
      cVar1 = FUN_7ff70c9842f0(param_3);
      if (cVar1 != '\0') {
        return false;
      }
      pcVar3 = (char *)FUN_7ff70cb12b40(param_1,0x2e,pcVar5);
      if ((pcVar3 != (char *)0x0) &&
         (pcVar4 = (char *)FUN_7ff70c996cf0(param_1,0x2e,pcVar5), pcVar4 != pcVar3)) {
        pcVar4 = (char *)FUN_7ff70cb12b40(param_3,0x2e,pcVar6);
        if (pcVar4 == (char *)0x0) {
          return false;
        }
        param_1 = param_1 + ((longlong)pcVar5 - (longlong)pcVar3);
        if (param_3 + ((longlong)pcVar6 - (longlong)pcVar4) != param_1) {
          return false;
        }
        goto LAB_7ff70c9f8dec;
      }
    }
    pcVar4 = param_3;
    pcVar3 = param_1;
    param_1 = pcVar6;
    if (pcVar6 == pcVar5) {
LAB_7ff70c9f8dec:
      iVar2 = FUN_7ff70c9592a0(pcVar4,pcVar3,param_1);
      return iVar2 != 0;
    }
  }
  return false;
}


