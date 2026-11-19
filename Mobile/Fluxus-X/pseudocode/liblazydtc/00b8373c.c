/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8373c
 */

void mbedtls_mpi_core_cond_assign(ulong *param_1,ulong *param_2,long param_3,ulong param_4)

{
  if (param_1 != param_2) {
    for (; param_3 != 0; param_3 = param_3 + -1) {
      *param_1 = *param_2 & param_4 | ~param_4 & *param_1;
      param_2 = param_2 + 1;
      param_1 = param_1 + 1;
    }
  }
  return;
}

