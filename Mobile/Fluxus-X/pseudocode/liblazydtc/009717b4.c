/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009717b4
 */

bool FUN_009717b4(char *param_1,char *param_2,char *param_3,char *param_4)

{
  char *__n;
  int iVar1;
  ulong uVar2;
  char *pcVar3;
  char *pcVar4;
  char *__n_00;
  
  if (param_1 == (char *)0x0) {
    return false;
  }
  if (param_3 == (char *)0x0) {
    return false;
  }
  if (*param_1 == '\0') {
    return false;
  }
  if (*param_3 == '\0') {
    return false;
  }
  __n_00 = param_4 + -1;
  if (param_3[(long)(param_4 + -1)] != '.') {
    __n_00 = param_4;
  }
  __n = param_2 + -1;
  if (param_1[(long)(param_2 + -1)] != '.') {
    __n = param_2;
  }
  iVar1 = strncmp(param_1,"*.",2);
  if (iVar1 == 0) {
    uVar2 = FUN_009172dc(param_3);
    if ((uVar2 & 1) != 0) {
      return false;
    }
    pcVar3 = memchr(param_1,0x2e,(size_t)__n);
    if ((pcVar3 != (char *)0x0) && (pcVar4 = memrchr(param_1,0x2e,(size_t)__n), pcVar4 != pcVar3)) {
      pcVar4 = memchr(param_3,0x2e,(size_t)__n_00);
      if (pcVar4 == (char *)0x0) {
        return false;
      }
      __n_00 = param_3 + ((long)__n_00 - (long)pcVar4);
      if (__n_00 != param_1 + ((long)__n - (long)pcVar3)) {
        return false;
      }
      goto LAB_0097183c;
    }
  }
  if (__n_00 != __n) {
    return false;
  }
  pcVar4 = param_3;
  pcVar3 = param_1;
LAB_0097183c:
  iVar1 = curl_strnequal(pcVar4,pcVar3,__n_00);
  return iVar1 != 0;
}

