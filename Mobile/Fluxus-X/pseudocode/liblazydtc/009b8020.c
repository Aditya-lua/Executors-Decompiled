/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8020
 */

undefined4 SSL_get_security_level(long param_1)

{
  return *(undefined4 *)(*(long *)(param_1 + 0x898) + 0x1f0);
}

