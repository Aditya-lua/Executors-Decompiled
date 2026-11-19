/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9398
 */

undefined8 SSL_set_recv_max_early_data(long param_1,undefined4 param_2)

{
  *(undefined4 *)(param_1 + 0x1d44) = param_2;
  return 1;
}

