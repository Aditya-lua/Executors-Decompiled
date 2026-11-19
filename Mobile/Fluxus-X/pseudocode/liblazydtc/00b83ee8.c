/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b83ee8
 */

ulong mbedtls_mpi_core_sub(long *param_1,ulong *param_2,ulong *param_3,long param_4)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  
  uVar3 = 0;
  for (; param_4 != 0; param_4 = param_4 + -1) {
    uVar4 = *param_2;
    uVar2 = uVar4 - uVar3;
    uVar1 = 2;
    if (uVar4 >= uVar3) {
      uVar1 = 1;
    }
    uVar3 = (ulong)(uVar4 < uVar3);
    if (uVar2 < *param_3) {
      uVar3 = uVar1;
    }
    *param_1 = uVar2 - *param_3;
    param_3 = param_3 + 1;
    param_2 = param_2 + 1;
    param_1 = param_1 + 1;
  }
  return uVar3;
}

