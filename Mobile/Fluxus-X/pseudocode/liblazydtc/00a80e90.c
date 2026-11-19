/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a80e90
 */

undefined8 FUN_00a80e90(long *param_1)

{
  int iVar1;
  long lVar2;
  ulong uVar3;
  
  lVar2 = CRYPTO_THREAD_lock_new();
  *param_1 = lVar2;
  if (lVar2 != 0) {
    lVar2 = CRYPTO_THREAD_lock_new();
    param_1[0x33] = lVar2;
    if (lVar2 != 0) {
      uVar3 = 0;
      do {
        lVar2 = CRYPTO_THREAD_lock_new();
        param_1[uVar3 + 0x20] = lVar2;
        *(undefined4 *)((long)param_1 + uVar3 * 4 + 0xb0) = 0xffffffff;
        if (lVar2 == 0) goto LAB_00a80f28;
        uVar3 = uVar3 + 1;
      } while (uVar3 < 0x13);
      iVar1 = ossl_do_ex_data_init(param_1);
      if (iVar1 != 0) {
        iVar1 = ossl_crypto_new_ex_data_ex(param_1,0x10,0,param_1 + 1);
        if ((iVar1 != 0) && (iVar1 = ossl_property_parse_init(param_1), iVar1 != 0)) {
          return 1;
        }
        ossl_crypto_cleanup_all_ex_data_int(param_1);
      }
    }
LAB_00a80f28:
    CRYPTO_THREAD_lock_free(param_1[0x20]);
    CRYPTO_THREAD_lock_free(param_1[0x21]);
    CRYPTO_THREAD_lock_free(param_1[0x22]);
    CRYPTO_THREAD_lock_free(param_1[0x23]);
    CRYPTO_THREAD_lock_free(param_1[0x24]);
    CRYPTO_THREAD_lock_free(param_1[0x25]);
    CRYPTO_THREAD_lock_free(param_1[0x26]);
    CRYPTO_THREAD_lock_free(param_1[0x27]);
    CRYPTO_THREAD_lock_free(param_1[0x28]);
    CRYPTO_THREAD_lock_free(param_1[0x29]);
    CRYPTO_THREAD_lock_free(param_1[0x2a]);
    CRYPTO_THREAD_lock_free(param_1[0x2b]);
    CRYPTO_THREAD_lock_free(param_1[0x2c]);
    CRYPTO_THREAD_lock_free(param_1[0x2d]);
    CRYPTO_THREAD_lock_free(param_1[0x2e]);
    CRYPTO_THREAD_lock_free(param_1[0x2f]);
    CRYPTO_THREAD_lock_free(param_1[0x30]);
    CRYPTO_THREAD_lock_free(param_1[0x31]);
    CRYPTO_THREAD_lock_free(param_1[0x32]);
    CRYPTO_THREAD_lock_free(param_1[0x33]);
    CRYPTO_THREAD_lock_free(*param_1);
    memset(param_1,0,0x1c8);
  }
  return 0;
}

