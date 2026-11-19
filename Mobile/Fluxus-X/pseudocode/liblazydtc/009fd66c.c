/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fd66c
 */

void FUN_009fd66c(void)

{
  bio_type_lock = CRYPTO_THREAD_lock_new();
  DAT_00d218fc = (uint)(bio_type_lock != 0);
  return;
}

