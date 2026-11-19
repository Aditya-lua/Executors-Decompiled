/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b28fc
 */

ulong SSL_CTX_dane_clear_flags(long param_1,ulong param_2)

{
  ulong uVar1;
  
  uVar1 = *(ulong *)(param_1 + 0x3b0);
  *(ulong *)(param_1 + 0x3b0) = uVar1 & (param_2 ^ 0xffffffffffffffff);
  return uVar1;
}

