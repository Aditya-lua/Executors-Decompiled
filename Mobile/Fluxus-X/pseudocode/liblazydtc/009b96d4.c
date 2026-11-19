/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b96d4
 */

undefined8
SSL_CTX_set_session_ticket_cb(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  *(undefined8 *)(param_1 + 0x3f8) = param_2;
  *(undefined8 *)(param_1 + 0x400) = param_3;
  *(undefined8 *)(param_1 + 0x408) = param_4;
  return 1;
}

