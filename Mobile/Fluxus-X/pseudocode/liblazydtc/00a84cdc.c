/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a84cdc
 */

char * ossl_cmp_log_parse_metadata
                 (char *param_1,int *param_2,undefined8 *param_3,undefined8 *param_4,
                 undefined4 *param_5)

{
  char *__s;
  int iVar1;
  char *pcVar2;
  char *pcVar3;
  long lVar4;
  undefined8 uVar5;
  char *__s_00;
  char *local_68;
  
  if (param_1 == (char *)0x0) {
    *param_2 = -1;
    *param_3 = 0;
    *param_4 = 0;
    *param_5 = 0;
  }
  else {
    pcVar2 = strchr(param_1,0x3a);
    *param_2 = -1;
    *param_3 = 0;
    *param_4 = 0;
    *param_5 = 0;
    if (pcVar2 != (char *)0x0) {
      __s = pcVar2 + 1;
      pcVar3 = strchr(__s,0x3a);
      iVar1 = FUN_00a84e44(param_1);
      *param_2 = iVar1;
      if ((pcVar3 != (char *)0x0) && (iVar1 < 0)) {
        local_68 = param_1;
        lVar4 = strtol(pcVar3 + 1,&local_68,10);
        if ((pcVar3 + 1 < local_68) && (__s_00 = local_68 + 1, *local_68 == ':')) {
          iVar1 = FUN_00a84e44(__s_00);
          *param_2 = iVar1;
          if (-1 < iVar1) {
            uVar5 = CRYPTO_strndup(param_1,(long)pcVar2 - (long)param_1,"crypto/cmp/cmp_util.c",100)
            ;
            *param_3 = uVar5;
            uVar5 = CRYPTO_strndup(__s,(long)pcVar3 - (long)__s,"crypto/cmp/cmp_util.c",0x65);
            *param_4 = uVar5;
            *param_5 = (int)lVar4;
            pcVar2 = strchr(__s_00,0x3a);
            if (pcVar2 == (char *)0x0) {
              param_1 = (char *)0x0;
            }
            else {
              param_1 = pcVar2 + 1;
              if (*param_1 == ' ') {
                param_1 = pcVar2 + 2;
              }
            }
          }
        }
      }
    }
  }
  return param_1;
}

