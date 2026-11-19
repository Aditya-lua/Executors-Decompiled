/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7d08
 */

void SSL_set_psk_use_session_callback(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x9a0) = param_2;
  return;
}

