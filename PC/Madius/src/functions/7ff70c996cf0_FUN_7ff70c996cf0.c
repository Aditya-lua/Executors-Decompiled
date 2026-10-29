/* 7ff70c996cf0 FUN_7ff70c996cf0 */

char * FUN_7ff70c996cf0(char *param_1,char param_2,longlong param_3)

{
  char *pcVar1;
  
  if (param_3 == 0) {
    return (char *)0x0;
  }
  pcVar1 = param_1 + param_3;
  do {
    pcVar1 = pcVar1 + -1;
    if (pcVar1 < param_1) {
      return (char *)0x0;
    }
  } while (*pcVar1 != param_2);
  return pcVar1;
}


