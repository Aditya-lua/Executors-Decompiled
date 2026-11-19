/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b06660
 */

int ossl_v3_name_cmp(char *param_1,char *param_2)

{
  int iVar1;
  size_t sVar2;
  
  sVar2 = strlen(param_2);
  iVar1 = strncmp(param_1,param_2,(long)(int)sVar2);
  if (iVar1 == 0) {
    if (param_1[(int)sVar2] == '\0') {
      iVar1 = 0;
    }
    else {
      iVar1 = 0;
      if (param_1[(int)sVar2] != '.') {
        iVar1 = 1;
      }
    }
  }
  return iVar1;
}

