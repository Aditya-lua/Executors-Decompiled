/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009aca98
 */

void ssl_cert_set_cert_cb(long param_1,undefined8 param_2,undefined8 param_3)

{
  *(undefined8 *)(param_1 + 0x1b8) = param_2;
  *(undefined8 *)(param_1 + 0x1c0) = param_3;
  return;
}

