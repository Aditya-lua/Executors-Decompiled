/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac4550
 */

undefined8 ossl_method_store_remove(long param_1,int param_2,long param_3)

{
  int iVar1;
  int iVar2;
  undefined8 uVar3;
  long lVar4;
  long lVar5;
  void *ptr;
  
  uVar3 = 0;
  if ((((param_1 != 0) && (0 < param_2)) && (param_3 != 0)) &&
     (uVar3 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0x10)), (int)uVar3 != 0)) {
    lVar4 = ossl_sa_get(*(undefined8 *)(param_1 + 8),(long)param_2);
    if (lVar4 != 0) {
      lVar5 = OPENSSL_LH_num_items(*(undefined8 *)(lVar4 + 0x10));
      *(long *)(param_1 + 0x20) = *(long *)(param_1 + 0x20) - lVar5;
      OPENSSL_LH_doall(*(undefined8 *)(lVar4 + 0x10),&LAB_00ac4ea4);
      OPENSSL_LH_flush(*(undefined8 *)(lVar4 + 0x10));
    }
    lVar4 = ossl_sa_get(*(undefined8 *)(param_1 + 8),(long)param_2);
    if ((lVar4 != 0) && (iVar1 = OPENSSL_sk_num(*(undefined8 *)(lVar4 + 8)), 0 < iVar1)) {
      iVar1 = 0;
      do {
        ptr = (void *)OPENSSL_sk_value(*(undefined8 *)(lVar4 + 8),iVar1);
        if (*(long *)((long)ptr + 0x10) == param_3) {
          if (ptr != (void *)0x0) {
            (**(code **)((long)ptr + 0x20))(param_3);
            CRYPTO_free(ptr);
          }
          OPENSSL_sk_delete(*(undefined8 *)(lVar4 + 8),iVar1);
          CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x10));
          return 1;
        }
        iVar1 = iVar1 + 1;
        iVar2 = OPENSSL_sk_num(*(undefined8 *)(lVar4 + 8));
      } while (iVar1 < iVar2);
    }
    CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x10));
    uVar3 = 0;
  }
  return uVar3;
}

