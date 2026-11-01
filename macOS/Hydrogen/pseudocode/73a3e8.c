
char * FUN_0073a3e8(code *param_1)

{
  char *pcVar1;
  long lVar2;
  long lVar3;
  
  pcVar1 = (char *)(*param_1)();
  if (pcVar1 != (char *)0x0) {
    lVar2 = _strlen(pcVar1);
    if (*pcVar1 == '\"') {
      _memmove(pcVar1,pcVar1 + 1,lVar2);
      lVar2 = lVar2 + -1;
    }
    if (lVar2 == 0) {
      if (*pcVar1 != '/') goto LAB_0073a48c;
    }
    else {
      lVar3 = lVar2 + -1;
      if (pcVar1[lVar3] == '\"') {
        pcVar1[lVar3] = '\0';
        lVar2 = lVar3;
      }
      if (*pcVar1 != '/') {
LAB_0073a48c:
        (*pcRam0000000000a2b5f0)(pcVar1);
        pcVar1 = (char *)(*pcRam0000000000a2b5e8)(2);
        if (pcVar1 != (char *)0x0) {
          _memcpy(pcVar1,"/",1);
          pcVar1[1] = '\0';
        }
        return pcVar1;
      }
      if ((lVar2 != 0) && (pcVar1[lVar2 + -1] == '/')) {
        pcVar1[lVar2 + -1] = '\0';
        return pcVar1;
      }
    }
  }
  return pcVar1;
}

