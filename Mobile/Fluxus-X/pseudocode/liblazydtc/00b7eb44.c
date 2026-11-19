/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7eb44
 */

void mbedtls_mpi_read_binary(undefined8 *param_1,undefined8 param_2,ulong param_3)

{
  int iVar1;
  ulong uVar2;
  
  uVar2 = param_3 >> 3;
  if ((param_3 & 7) != 0) {
    uVar2 = uVar2 + 1;
  }
  iVar1 = FUN_00b7ea70(param_1,uVar2);
  if (iVar1 == 0) {
    mbedtls_mpi_core_read_be(*param_1,*(undefined2 *)((long)param_1 + 10),param_2,param_3);
    return;
  }
  return;
}

