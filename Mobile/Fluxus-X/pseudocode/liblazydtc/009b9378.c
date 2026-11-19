/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9378
 */

undefined4 SSL_get_max_early_data(long param_1)

{
  return *(undefined4 *)(param_1 + 0x1d40);
}

