/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa454c
 */

undefined8 ossl_provider_test_operation_bit(long param_1,ulong param_2,uint *param_3)

{
  undefined8 uVar1;
  
  if (param_3 == (uint *)0x0) {
    ERR_new();
    ERR_set_debug("crypto/provider_core.c",0x67d,"ossl_provider_test_operation_bit");
    ERR_set_error(0xf,0xc0102,0);
    uVar1 = 0;
  }
  else {
    *param_3 = 0;
    uVar1 = CRYPTO_THREAD_read_lock(*(undefined8 *)(param_1 + 0xb8));
    if ((int)uVar1 != 0) {
      if (param_2 >> 3 < *(ulong *)(param_1 + 0xb0)) {
        *param_3 = (uint)((1 << (ulong)((uint)param_2 & 7) &
                          (uint)*(byte *)(*(long *)(param_1 + 0xa8) + (param_2 >> 3))) != 0);
      }
      CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0xb8));
      uVar1 = 1;
    }
  }
  return uVar1;
}

