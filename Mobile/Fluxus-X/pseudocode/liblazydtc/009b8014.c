/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b8014
 */

void SSL_set_security_level(long param_1,undefined4 param_2)

{
  *(undefined4 *)(*(long *)(param_1 + 0x898) + 0x1f0) = param_2;
  return;
}

