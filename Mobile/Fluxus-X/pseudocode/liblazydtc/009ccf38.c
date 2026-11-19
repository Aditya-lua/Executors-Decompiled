/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ccf38
 */

void SSL3_RECORD_release(long param_1,long param_2)

{
  undefined8 *puVar1;
  
  if (param_2 != 0) {
    puVar1 = (undefined8 *)(param_1 + 0x30);
    do {
      CRYPTO_free((void *)*puVar1);
      param_2 = param_2 + -1;
      *puVar1 = 0;
      puVar1 = puVar1 + 10;
    } while (param_2 != 0);
  }
  return;
}

