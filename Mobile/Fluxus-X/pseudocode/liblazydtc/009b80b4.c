/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b80b4
 */

ulong SSL_CTX_set_options(long param_1,ulong param_2)

{
  param_2 = *(ulong *)(param_1 + 0x138) | param_2;
  *(ulong *)(param_1 + 0x138) = param_2;
  return param_2;
}

