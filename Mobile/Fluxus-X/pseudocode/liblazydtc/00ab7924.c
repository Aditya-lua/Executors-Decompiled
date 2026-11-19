/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ab7924
 */

int ossl_pem_check_suffix(char *param_1,char *param_2)

{
  int iVar1;
  size_t sVar2;
  size_t sVar3;
  int iVar4;
  char *__s1;
  
  sVar2 = strlen(param_1);
  sVar3 = strlen(param_2);
  iVar4 = 0;
  if ((int)sVar3 + 1 < (int)sVar2) {
    __s1 = param_1 + ((long)(int)sVar2 - (long)(int)sVar3);
    iVar1 = strcmp(__s1,param_2);
    iVar4 = 0;
    if (iVar1 == 0) {
      iVar4 = 0;
      if (__s1[-1] == ' ') {
        iVar4 = (int)(__s1 + -1) - (int)param_1;
      }
    }
  }
  return iVar4;
}

