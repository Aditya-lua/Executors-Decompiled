/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b96ec
 */

void SSL_CTX_set_allow_early_data_cb(long param_1,undefined8 param_2,undefined8 param_3)

{
  *(undefined8 *)(param_1 + 0x418) = param_2;
  *(undefined8 *)(param_1 + 0x420) = param_3;
  return;
}

