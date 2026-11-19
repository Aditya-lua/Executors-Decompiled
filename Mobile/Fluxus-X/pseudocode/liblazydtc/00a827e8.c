/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a827e8
 */

int FUN_00a827e8(long param_1,int param_2,undefined8 param_3,undefined8 param_4)

{
  int *piVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  long lVar5;
  long *ptr;
  void *ptr_00;
  void *local_50;
  undefined4 local_48;
  
  local_50 = (void *)CRYPTO_strndup(param_3,param_4,"crypto/core_namemap.c",0xb6);
  if (local_50 != (void *)0x0) {
    local_48 = 0;
    lVar5 = OPENSSL_LH_retrieve(*(undefined8 *)(param_1 + 0x10),&local_50);
    CRYPTO_free(local_50);
    if ((lVar5 != 0) && (*(int *)(lVar5 + 8) != 0)) {
      return *(int *)(lVar5 + 8);
    }
  }
  ptr = (long *)CRYPTO_zalloc(0x10,"crypto/core_namemap.c",0x101);
  if (ptr != (long *)0x0) {
    lVar5 = CRYPTO_strndup(param_3,param_4,"crypto/core_namemap.c",0x102);
    *ptr = lVar5;
    ptr_00 = (void *)0x0;
    if (lVar5 != 0) {
      if (param_2 == 0) {
        piVar1 = (int *)(param_1 + 0x18);
        do {
          param_2 = *piVar1 + 1;
          cVar2 = '\x01';
          bVar3 = (bool)ExclusiveMonitorPass(piVar1,0x10);
          if (bVar3) {
            *piVar1 = param_2;
            cVar2 = ExclusiveMonitorsStatus();
          }
        } while (cVar2 != '\0');
      }
      *(int *)(ptr + 1) = param_2;
      OPENSSL_LH_insert(*(undefined8 *)(param_1 + 0x10),ptr);
      iVar4 = OPENSSL_LH_error(*(undefined8 *)(param_1 + 0x10));
      if (iVar4 == 0) {
        return (int)ptr[1];
      }
      ptr_00 = (void *)*ptr;
    }
    CRYPTO_free(ptr_00);
  }
  CRYPTO_free(ptr);
  return 0;
}

