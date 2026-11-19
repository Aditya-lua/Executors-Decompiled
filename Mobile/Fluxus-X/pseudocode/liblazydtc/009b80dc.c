/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b80dc
 */

ulong SSL_CTX_clear_options(long param_1,ulong param_2)

{
  ulong uVar1;
  
  uVar1 = *(ulong *)(param_1 + 0x138) & (param_2 ^ 0xffffffffffffffff);
  *(ulong *)(param_1 + 0x138) = uVar1;
  return uVar1;
}

