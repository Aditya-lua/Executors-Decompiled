/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a99b34
 */

void CRYPTO_free(void *ptr)

{
  if ((code *)PTR_CRYPTO_free_00cc9148 == CRYPTO_free) {
    free(ptr);
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x00a99b4c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_CRYPTO_free_00cc9148)();
  return;
}

