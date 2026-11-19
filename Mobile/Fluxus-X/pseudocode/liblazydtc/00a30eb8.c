/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30eb8
 */

int EC_GROUP_get_asn1_flag(EC_GROUP *group)

{
  return *(int *)(group + 0x24);
}

