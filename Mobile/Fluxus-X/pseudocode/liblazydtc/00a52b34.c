/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a52b34
 */

void FUN_00a52b34(undefined4 param_1,undefined8 param_2,undefined8 param_3,long *param_4)

{
  int iVar1;
  int iVar2;
  long lVar3;
  size_t sVar4;
  char *__s;
  long local_48;
  
  if ((param_4[1] == 0) && (iVar1 = OPENSSL_sk_num(param_2), 0 < iVar1)) {
    iVar1 = 0;
    do {
      lVar3 = OPENSSL_sk_value(param_2,iVar1);
      (**(code **)(lVar3 + 0x50))(lVar3,&local_48,0,param_1);
      if (local_48 != 0) {
        __s = *(char **)(local_48 + 0x10);
        sVar4 = strlen(__s);
        if (((int)param_4[3] == (int)sVar4) &&
           (iVar2 = OPENSSL_strncasecmp(__s,param_4[2],(long)(int)sVar4), iVar2 == 0)) {
          *param_4 = lVar3;
          param_4[1] = local_48;
          return;
        }
      }
      iVar1 = iVar1 + 1;
      iVar2 = OPENSSL_sk_num(param_2);
    } while (iVar1 < iVar2);
  }
  return;
}

