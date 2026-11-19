/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b881c
 */

void SSL_CTX_set_client_hello_cb(long param_1,undefined8 param_2,undefined8 param_3)

{
  *(undefined8 *)(param_1 + 0x208) = param_2;
  *(undefined8 *)(param_1 + 0x210) = param_3;
  return;
}

