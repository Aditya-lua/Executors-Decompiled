/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30eb0
 */

void EC_GROUP_set_asn1_flag(EC_GROUP *group,int flag)

{
  *(int *)(group + 0x24) = flag;
  return;
}

