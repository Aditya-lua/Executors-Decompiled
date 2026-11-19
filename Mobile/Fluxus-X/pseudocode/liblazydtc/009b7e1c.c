/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7e1c
 */

undefined8 SSL_CTX_set_num_tickets(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x410) = param_2;
  return 1;
}

