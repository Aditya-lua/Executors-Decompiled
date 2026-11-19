/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac6ed4
 */

void FUN_00ac6ed4(char *param_1,long *param_2,ulong *param_3,ulong *param_4)

{
  char cVar1;
  ulong __n;
  int iVar2;
  size_t sVar3;
  char cVar4;
  ulong uVar5;
  long lVar6;
  char cVar7;
  size_t sVar8;
  char *pcVar9;
  
  sVar3 = strlen(param_1);
  cVar7 = '\0';
  *param_4 = *param_4 + sVar3;
  if (sVar3 != 0) {
    sVar8 = sVar3;
    pcVar9 = param_1;
    do {
      iVar2 = ossl_ctype_check(*pcVar9,7);
      if (((iVar2 == 0) && (cVar4 = *pcVar9, cVar4 != '.')) && (cVar4 != '_')) {
        cVar1 = '\'';
        if (cVar7 != '\0') {
          cVar1 = cVar7;
        }
        cVar7 = '\"';
        if (cVar4 != '\'') {
          cVar7 = cVar1;
        }
      }
      sVar8 = sVar8 - 1;
      pcVar9 = pcVar9 + 1;
    } while (sVar8 != 0);
  }
  uVar5 = *param_3;
  if (uVar5 == 0) {
    *param_4 = *param_4 + (ulong)(cVar7 != '\0') * 2;
  }
  else {
    if (cVar7 != '\0') {
      cVar4 = '\0';
      if (uVar5 != 1) {
        cVar4 = cVar7;
      }
      *(char *)*param_2 = cVar4;
      *param_2 = *param_2 + 1;
      *param_4 = *param_4 + 1;
      uVar5 = *param_3 - 1;
      *param_3 = uVar5;
    }
    sVar8 = sVar3;
    if (cVar7 != '\0') {
      sVar8 = sVar3 + 1;
    }
    __n = uVar5 - 1;
    if (sVar8 + 1 <= uVar5) {
      __n = sVar3;
    }
    if (__n != 0) {
      memcpy((void *)*param_2,param_1,__n);
      *param_2 = *param_2 + __n;
      uVar5 = *param_3 - __n;
      *param_3 = uVar5;
    }
    if (cVar7 != '\0') {
      if (uVar5 == 0) {
        lVar6 = 1;
      }
      else {
        cVar4 = '\0';
        if (uVar5 != 1) {
          cVar4 = cVar7;
        }
        *(char *)*param_2 = cVar4;
        *param_2 = *param_2 + 1;
        *param_4 = *param_4 + 1;
        lVar6 = -1;
        param_4 = param_3;
      }
      *param_4 = *param_4 + lVar6;
    }
    if ((__n < sVar3) && (*param_3 == 1)) {
      *(undefined1 *)*param_2 = 0;
      *param_2 = *param_2 + 1;
      *param_3 = *param_3 - 1;
    }
  }
  return;
}

