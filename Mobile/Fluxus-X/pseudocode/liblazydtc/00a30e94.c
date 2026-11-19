/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30e94
 */

int EC_GROUP_get_curve_name(EC_GROUP *group)

{
  return *(int *)(group + 0x20);
}

