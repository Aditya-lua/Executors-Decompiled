/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a60958
 */

void EVP_PKEY_get0_provider(long param_1)

{
  if (*(long *)(param_1 + 0x60) == 0) {
    return;
  }
  EVP_KEYMGMT_get0_provider();
  return;
}

