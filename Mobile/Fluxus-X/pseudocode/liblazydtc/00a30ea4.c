/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30ea4
 */

undefined4 EC_GROUP_get_field_type(long *param_1)

{
  return *(undefined4 *)(*param_1 + 4);
}

