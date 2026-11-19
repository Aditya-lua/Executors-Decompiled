/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b9390
 */

undefined4 SSL_CTX_get_recv_max_early_data(long param_1)

{
  return *(undefined4 *)(param_1 + 0x3dc);
}

