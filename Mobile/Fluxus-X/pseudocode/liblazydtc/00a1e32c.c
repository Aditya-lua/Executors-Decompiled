/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a1e32c
 */

bool ossl_dh_is_named_safe_prime_group(long param_1)

{
  bool bVar1;
  
  bVar1 = false;
  if (param_1 != 0) {
    bVar1 = 3 < *(int *)(param_1 + 0x3c);
  }
  return bVar1;
}

