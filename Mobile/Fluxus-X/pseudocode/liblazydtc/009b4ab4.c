/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b4ab4
 */

undefined4 SSL_get_early_data_status(long param_1)

{
  return *(undefined4 *)(param_1 + 0xb30);
}

