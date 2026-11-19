/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa4464
 */

undefined8 ossl_provider_set_operation_bit(long param_1,ulong param_2)

{
  long lVar1;
  undefined8 uVar2;
  void *pvVar3;
  ulong uVar4;
  
  uVar2 = CRYPTO_THREAD_write_lock(*(undefined8 *)(param_1 + 0xb8));
  if ((int)uVar2 != 0) {
    uVar4 = param_2 >> 3;
    if (*(ulong *)(param_1 + 0xb0) <= uVar4) {
      lVar1 = uVar4 + 1;
      pvVar3 = CRYPTO_realloc(*(void **)(param_1 + 0xa8),(int)lVar1,"crypto/provider_core.c",0x665);
      if (pvVar3 == (void *)0x0) {
        CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0xb8));
        ERR_new();
        ERR_set_debug("crypto/provider_core.c",0x669,"ossl_provider_set_operation_bit");
        ERR_set_error(0xf,0xc0100,0);
        return 0;
      }
      *(void **)(param_1 + 0xa8) = pvVar3;
      memset((void *)((long)pvVar3 + *(long *)(param_1 + 0xb0)),0,lVar1 - *(long *)(param_1 + 0xb0))
      ;
      *(long *)(param_1 + 0xb0) = lVar1;
    }
    *(byte *)(*(long *)(param_1 + 0xa8) + uVar4) =
         *(byte *)(*(long *)(param_1 + 0xa8) + uVar4) | (byte)(1 << (ulong)((uint)param_2 & 7));
    CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0xb8));
    uVar2 = 1;
  }
  return uVar2;
}

