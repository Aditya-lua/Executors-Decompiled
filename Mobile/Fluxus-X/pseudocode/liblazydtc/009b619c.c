/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b619c
 */

void SSL_CTX_set_alpn_select_cb(long param_1,undefined8 param_2,undefined8 param_3)

{
  *(undefined8 *)(param_1 + 0x298) = param_2;
  *(undefined8 *)(param_1 + 0x2a0) = param_3;
  return;
}

