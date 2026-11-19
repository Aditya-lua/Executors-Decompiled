/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aab410
 */

void * CRYPTO_gcm128_new(undefined8 param_1,undefined8 param_2)

{
  void *pvVar1;
  
  pvVar1 = CRYPTO_malloc(0x1b8,"crypto/modes/gcm128.c",0x739);
  if (pvVar1 != (void *)0x0) {
    CRYPTO_gcm128_init(pvVar1,param_1,param_2);
  }
  return pvVar1;
}

