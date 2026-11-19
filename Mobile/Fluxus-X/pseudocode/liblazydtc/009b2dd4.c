/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009b2dd4
 */

ulong SSL_dane_set_flags(long param_1,ulong param_2)

{
  ulong uVar1;
  
  uVar1 = *(ulong *)(param_1 + 0x518);
  *(ulong *)(param_1 + 0x518) = uVar1 | param_2;
  return uVar1;
}

