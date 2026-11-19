/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aebf60
 */

void FUN_00aebf60(void)

{
  DAT_00d22310 = CRYPTO_THREAD_lock_new();
  DAT_00d2230c = (uint)(DAT_00d22310 != 0);
  return;
}

