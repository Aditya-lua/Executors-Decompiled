/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a7d190
 */

void ossl_ffc_params_enable_flags(long param_1,uint param_2,int param_3)

{
  if (param_3 == 0) {
    *(uint *)(param_1 + 0x40) = *(uint *)(param_1 + 0x40) & (param_2 ^ 0xffffffff);
    return;
  }
  *(uint *)(param_1 + 0x40) = *(uint *)(param_1 + 0x40) | param_2;
  return;
}

