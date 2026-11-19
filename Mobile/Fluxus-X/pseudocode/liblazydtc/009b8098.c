/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8098
 */

undefined8 SSL_CTX_get0_security_ex_data(long param_1)

{
  return *(undefined8 *)(*(long *)(param_1 + 0x158) + 0x1f8);
}

