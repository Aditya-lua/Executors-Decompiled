/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b851d4
 */

ulong mbedtls_mpi_core_sub_int(ulong *param_1,ulong *param_2,ulong param_3,long param_4)

{
  ulong uVar1;
  ulong uVar2;
  
  if (param_4 != 0) {
    do {
      uVar1 = *param_2;
      uVar2 = uVar1 - param_3;
      param_3 = (ulong)(uVar1 < uVar2);
      param_4 = param_4 + -1;
      *param_1 = uVar2;
      param_1 = param_1 + 1;
      param_2 = param_2 + 1;
    } while (param_4 != 0);
    param_3 = (ulong)(uVar1 < uVar2);
  }
  return param_3;
}

