/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ac9724
 */

undefined4 evp_rand_get_number(long param_1)

{
  return *(undefined4 *)(param_1 + 8);
}

