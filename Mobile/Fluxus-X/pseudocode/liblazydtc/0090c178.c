/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090c178
 */

undefined4 FUN_0090c178(char *param_1,long param_2,long *param_3,long *param_4,long *param_5)

{
  int iVar1;
  long lVar2;
  void *pvVar3;
  undefined4 uVar4;
  char *pcVar5;
  
  iVar1 = strncmp("if!",param_1,3);
  if (iVar1 == 0) {
    if (param_1[3] != '\0') {
      lVar2 = FUN_00941948(param_1 + 3,param_2 + -3);
      *param_4 = lVar2;
LAB_0090c238:
      uVar4 = 0x1b;
      if (lVar2 != 0) {
        uVar4 = 0;
      }
      return uVar4;
    }
  }
  else {
    iVar1 = strncmp("host!",param_1,5);
    if (iVar1 == 0) {
      if (param_1[5] != '\0') {
        lVar2 = FUN_00941948(param_1 + 5,param_2 + -5);
        *param_5 = lVar2;
        goto LAB_0090c238;
      }
    }
    else {
      iVar1 = strncmp("ifhost!",param_1,7);
      if (iVar1 == 0) {
        param_1 = param_1 + 7;
        pvVar3 = memchr(param_1,0x21,param_2 - 7U);
        if ((pvVar3 != (void *)0x0) && (pcVar5 = (char *)((long)pvVar3 + 1), *pcVar5 != '\0')) {
          lVar2 = FUN_00941948(param_1,(long)pvVar3 - (long)param_1);
          *param_4 = lVar2;
          if (lVar2 != 0) {
            lVar2 = FUN_00941948(pcVar5,param_1 + ((param_2 - 7U) - (long)pcVar5));
            *param_5 = lVar2;
            if (lVar2 != 0) {
              return 0;
            }
            (*(code *)PTR_free_00cc4678)(*param_4);
            *param_4 = 0;
          }
          return 0x1b;
        }
      }
      else if (*param_1 != '\0') {
        lVar2 = FUN_00941948(param_1,param_2);
        *param_3 = lVar2;
        goto LAB_0090c238;
      }
    }
  }
  return 0x2b;
}

