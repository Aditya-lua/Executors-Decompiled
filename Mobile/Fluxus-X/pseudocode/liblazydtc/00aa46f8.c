/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aa46f8
 */

undefined8 * FUN_00aa46f8(undefined8 param_1)

{
  undefined8 *puVar1;
  long lVar2;
  
  puVar1 = (undefined8 *)CRYPTO_zalloc(0x50,"crypto/provider_core.c",0x136);
  if (puVar1 != (undefined8 *)0x0) {
    lVar2 = OPENSSL_sk_new(&LAB_00aa4894);
    puVar1[1] = lVar2;
    if (lVar2 != 0) {
      lVar2 = CRYPTO_THREAD_lock_new();
      puVar1[3] = lVar2;
      if (lVar2 != 0) {
        lVar2 = OPENSSL_sk_new_null();
        puVar1[2] = lVar2;
        if (lVar2 != 0) {
          lVar2 = CRYPTO_THREAD_lock_new();
          puVar1[4] = lVar2;
          if (lVar2 != 0) {
            *puVar1 = param_1;
            *(byte *)(puVar1 + 9) = *(byte *)(puVar1 + 9) | 1;
            return puVar1;
          }
        }
      }
    }
  }
  FUN_00aa478c(puVar1);
  return (undefined8 *)0x0;
}

