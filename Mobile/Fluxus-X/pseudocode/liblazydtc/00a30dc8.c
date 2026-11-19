/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a30dc8
 */

undefined8 EC_GROUP_get_mont_data(long param_1)

{
  return *(undefined8 *)(param_1 + 0x90);
}

