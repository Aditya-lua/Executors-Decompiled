/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00941a94
 */

char * FUN_00941a94(int param_1,char *param_2,size_t param_3)

{
  int iVar1;
  int *piVar2;
  char *pcVar3;
  
  piVar2 = (int *)__errno();
  if (param_3 == 0) {
    param_2 = (char *)0x0;
  }
  else {
    iVar1 = *piVar2;
    *param_2 = '\0';
    pcVar3 = strerror_r(param_1,param_2,param_3);
    if (((int)pcVar3 != 0) && (*param_2 == '\0')) {
      curl_msnprintf(param_2,param_3,"Unknown error %d",param_1);
    }
    pcVar3 = strrchr(param_2,10);
    if ((pcVar3 != (char *)0x0) && (1 < (long)pcVar3 - (long)param_2)) {
      *pcVar3 = '\0';
    }
    pcVar3 = strrchr(param_2,0xd);
    if ((pcVar3 != (char *)0x0) && (0 < (long)pcVar3 - (long)param_2)) {
      *pcVar3 = '\0';
    }
    if (*piVar2 != iVar1) {
      *piVar2 = iVar1;
    }
  }
  return param_2;
}

