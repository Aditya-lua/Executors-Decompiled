/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b20b0c
 */

void ossl_prov_cache_exported_algorithms(long *param_1,long *param_2)

{
  long *plVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  
  if (*param_2 != 0) {
    return;
  }
  if (*param_1 == 0) {
    iVar3 = 0;
  }
  else {
    iVar3 = 0;
    do {
      if (((code *)param_1[4] == (code *)0x0) || (iVar2 = (*(code *)param_1[4])(), iVar2 != 0)) {
        lVar4 = param_1[2];
        plVar1 = param_2 + (long)iVar3 * 4;
        iVar3 = iVar3 + 1;
        plVar1[3] = param_1[3];
        plVar1[2] = lVar4;
        lVar4 = *param_1;
        plVar1[1] = param_1[1];
        *plVar1 = lVar4;
      }
      param_1 = param_1 + 5;
    } while (*param_1 != 0);
  }
  lVar4 = param_1[2];
  param_2 = param_2 + (long)iVar3 * 4;
  param_2[3] = param_1[3];
  param_2[2] = lVar4;
  lVar4 = *param_1;
  param_2[1] = param_1[1];
  *param_2 = lVar4;
  return;
}

