/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b83774
 */

void mbedtls_mpi_core_cond_swap(ulong *param_1,ulong *param_2,long param_3,ulong param_4)

{
  ulong uVar1;
  
  if (param_1 != param_2) {
    for (; param_3 != 0; param_3 = param_3 + -1) {
      uVar1 = *param_1;
      *param_1 = *param_2 & param_4 | ~param_4 & uVar1;
      *param_2 = uVar1 & param_4 | ~param_4 & *param_2;
      param_2 = param_2 + 1;
      param_1 = param_1 + 1;
    }
  }
  return;
}

