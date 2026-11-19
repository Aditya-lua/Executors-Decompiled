/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ace88
 */

undefined8 SSL_CTX_get0_CA_list(long param_1)

{
  return *(undefined8 *)(param_1 + 0x128);
}

