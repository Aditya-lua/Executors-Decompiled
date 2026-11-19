/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ad12f4
 */

void BN_BLINDING_set_flags(BN_BLINDING *param_1,ulong param_2)

{
  *(ulong *)(param_1 + 0x30) = param_2;
  return;
}

