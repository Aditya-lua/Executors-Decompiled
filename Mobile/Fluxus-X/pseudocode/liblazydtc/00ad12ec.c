/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad12ec
 */

ulong BN_BLINDING_get_flags(BN_BLINDING *param_1)

{
  return *(ulong *)(param_1 + 0x30);
}

