/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02bac
 */

void FUN_00b02bac(void *param_1)

{
  if ((param_1 == (void *)0x0) || ((*(uint *)((long)param_1 + 8) & 1) == 0)) {
    return;
  }
  if ((*(uint *)((long)param_1 + 8) >> 1 & 1) != 0) {
    CRYPTO_free(*(void **)((long)param_1 + 0x18));
    CRYPTO_free(*(void **)((long)param_1 + 0x20));
  }
  CRYPTO_free(param_1);
  return;
}

