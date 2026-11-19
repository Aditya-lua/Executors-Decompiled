/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b7e04
 */

undefined8 SSL_set_num_tickets(long param_1,undefined8 param_2)

{
  *(undefined8 *)(param_1 + 0x1d70) = param_2;
  return 1;
}

