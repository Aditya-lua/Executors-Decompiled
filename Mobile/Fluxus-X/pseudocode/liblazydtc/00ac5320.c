/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac5320
 */

void ossl_sa_free_leaves(int *param_1)

{
  void *ptr;
  int iVar1;
  long lVar2;
  void *ptr_00;
  int iVar3;
  long lVar4;
  undefined8 local_110 [16];
  int local_90 [16];
  
  local_90[0] = 0;
  iVar3 = 0;
  lVar2 = 0;
  local_110[0] = *(undefined8 *)(param_1 + 6);
LAB_00ac5370:
  do {
    iVar1 = (int)lVar2;
    ptr_00 = (void *)local_110[iVar1];
    lVar2 = (long)iVar1;
    lVar4 = (long)iVar3;
    while (iVar3 < 0x10) {
      local_90[lVar2] = (int)lVar4 + 1;
      if ((ptr_00 != (void *)0x0) &&
         (ptr = *(void **)((long)ptr_00 + lVar4 * 8), ptr != (void *)0x0)) {
        if (iVar1 < *param_1 + -1) {
          lVar2 = lVar2 + 1;
          iVar3 = 0;
          local_90[lVar2] = 0;
          local_110[lVar2] = ptr;
          goto LAB_00ac5370;
        }
        CRYPTO_free(ptr);
      }
      lVar4 = lVar4 + 1;
      iVar3 = (int)lVar4;
    }
    if (ptr_00 != (void *)0x0) {
      CRYPTO_free(ptr_00);
    }
    if (iVar1 < 1) {
      CRYPTO_free(param_1);
      return;
    }
    lVar2 = lVar2 + -1;
    iVar3 = local_90[lVar2];
  } while( true );
}

