/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac5230
 */

void ossl_sa_free(int *param_1)

{
  void *ptr;
  int iVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  long local_100 [16];
  int local_80 [16];
  
  if (param_1 == (int *)0x0) {
    return;
  }
  local_80[0] = 0;
  iVar1 = 0;
  lVar4 = 0;
  local_100[0] = *(long *)(param_1 + 6);
LAB_00ac5280:
  do {
    iVar3 = (int)lVar4;
    ptr = (void *)local_100[iVar3];
    lVar4 = (long)iVar3;
    lVar2 = (long)iVar1;
    while (iVar1 < 0x10) {
      local_80[lVar4] = (int)lVar2 + 1;
      if (((ptr != (void *)0x0) && (lVar5 = *(long *)((long)ptr + lVar2 * 8), lVar5 != 0)) &&
         (iVar3 < *param_1 + -1)) {
        lVar4 = lVar4 + 1;
        iVar1 = 0;
        local_80[lVar4] = 0;
        local_100[lVar4] = lVar5;
        goto LAB_00ac5280;
      }
      lVar2 = lVar2 + 1;
      iVar1 = (int)lVar2;
    }
    if (ptr != (void *)0x0) {
      CRYPTO_free(ptr);
    }
    if (iVar3 < 1) {
      CRYPTO_free(param_1);
      return;
    }
    lVar4 = lVar4 + -1;
    iVar1 = local_80[lVar4];
  } while( true );
}

