/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad12e4
 */

void BN_BLINDING_unlock(long param_1)

{
  CRYPTO_THREAD_unlock(*(undefined8 *)(param_1 + 0x48));
  return;
}

