/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aab468
 */

void CRYPTO_gcm128_release(undefined8 param_1)

{
  CRYPTO_clear_free(param_1,0x1b8,"crypto/modes/gcm128.c",0x741);
  return;
}

