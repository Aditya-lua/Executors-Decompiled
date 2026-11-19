/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8b54
 */

void SSL_CTX_set_keylog_callback(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x3d0) = param_2;
  return;
}

