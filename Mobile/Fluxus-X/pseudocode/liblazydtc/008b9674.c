/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b9674
 */

char * FUN_008b9674(char *param_1,ulong param_2,char *param_3,ulong param_4)

{
  size_t sVar1;
  char *pcVar2;
  
  if (*param_3 == '@') {
    if (param_2 < param_4) {
      param_1[2] = '.';
      param_1[0] = '.';
      param_1[1] = '.';
      memcpy(param_1 + 3,param_3 + (param_4 - param_2) + 4,param_2 - 4);
      param_1[param_2 - 1] = '\0';
    }
    else {
      param_1 = param_3 + 1;
    }
  }
  else if (*param_3 == '=') {
    if (param_2 < param_4) {
      memcpy(param_1,param_3 + 1,param_2 - 1);
      param_1[param_2 - 1] = '\0';
    }
    else {
      param_1 = param_3 + 1;
    }
  }
  else {
    sVar1 = strcspn(param_3,"\n\r");
    param_1[8] = '\"';
    param_1[9] = '\0';
    if (param_2 - 0xf <= sVar1) {
      sVar1 = param_2 - 0xf;
    }
    builtin_strncpy(param_1,"[string ",8);
    if (param_3[sVar1] != '\0') {
      strncat(param_1,param_3,sVar1);
      param_3 = "...";
    }
    pcVar2 = strcat(param_1,param_3);
    sVar1 = strlen(pcVar2);
    pcVar2 = param_1 + sVar1;
    pcVar2[0] = '\"';
    pcVar2[1] = ']';
    pcVar2[2] = '\0';
  }
  return param_1;
}

