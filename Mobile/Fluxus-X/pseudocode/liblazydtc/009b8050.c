/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8050
 */

undefined8 SSL_get0_security_ex_data(long param_1)

{
  return *(undefined8 *)(*(long *)(param_1 + 0x898) + 0x1f8);
}

