/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b96f8
 */

void SSL_set_allow_early_data_cb(long param_1,undefined8 param_2,undefined8 param_3)

{
  *(undefined8 *)(param_1 + 0x1d88) = param_2;
  *(undefined8 *)(param_1 + 0x1d90) = param_3;
  return;
}

