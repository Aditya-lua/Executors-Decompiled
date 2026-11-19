/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30f94
 */

size_t EC_GROUP_get_seed_len(EC_GROUP *param_1)

{
  return *(size_t *)(param_1 + 0x38);
}

