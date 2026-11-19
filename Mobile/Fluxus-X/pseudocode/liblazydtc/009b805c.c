/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b805c
 */

void SSL_CTX_set_security_level(long param_1,undefined4 param_2)

{
  *(undefined4 *)(*(long *)(param_1 + 0x158) + 0x1f0) = param_2;
  return;
}

