/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9368
 */

undefined8 SSL_set_max_early_data(long param_1,undefined4 param_2)

{
  *(undefined4 *)(param_1 + 0x1d40) = param_2;
  return 1;
}

