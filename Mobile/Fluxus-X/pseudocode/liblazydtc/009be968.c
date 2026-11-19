/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009be968
 */

undefined8 SSL_SESSION_set_max_early_data(long param_1,undefined4 param_2)

{
  *(undefined4 *)(param_1 + 0x354) = param_2;
  return 1;
}

