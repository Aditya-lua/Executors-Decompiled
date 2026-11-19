/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a817c8
 */

bool ossl_lib_ctx_onfree(long param_1,undefined8 param_2)

{
  undefined8 *puVar1;
  
  puVar1 = CRYPTO_malloc(0x10,"crypto/context.c",0x1e7);
  if (puVar1 != (undefined8 *)0x0) {
    *puVar1 = param_2;
    puVar1[1] = *(undefined8 *)(param_1 + 0x1b8);
    *(undefined8 **)(param_1 + 0x1b8) = puVar1;
  }
  return puVar1 != (undefined8 *)0x0;
}

