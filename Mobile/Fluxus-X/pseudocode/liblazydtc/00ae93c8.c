/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae93c8
 */

undefined4 OPENSSL_sk_is_sorted(long param_1)

{
  if (param_1 == 0) {
    return 1;
  }
  return *(undefined4 *)(param_1 + 0x10);
}

