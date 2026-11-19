/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b4c3b0
 */

void FUN_00b4c3b0(void *param_1)

{
  if (param_1 == (void *)0x0) {
    return;
  }
  CRYPTO_free(*(void **)((long)param_1 + 0x50));
  CRYPTO_free(*(void **)((long)param_1 + 0x58));
  CRYPTO_clear_free(*(undefined8 *)((long)param_1 + 0x28),*(undefined8 *)((long)param_1 + 0x30),
                    "providers/implementations/keymgmt/dh_kmgmt.c",0x321);
  CRYPTO_free(param_1);
  return;
}

