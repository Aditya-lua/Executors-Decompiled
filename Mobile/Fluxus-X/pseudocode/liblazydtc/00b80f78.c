/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b80f78
 */

undefined8
mbedtls_mpi_fill_random(undefined8 *param_1,ulong param_2,undefined8 param_3,undefined8 param_4)

{
  undefined8 uVar1;
  ulong uVar2;
  
  uVar2 = param_2 >> 3;
  if ((param_2 & 7) != 0) {
    uVar2 = uVar2 + 1;
  }
  uVar1 = FUN_00b7ea70(param_1,uVar2);
  if ((int)uVar1 == 0) {
    if (param_2 != 0) {
      uVar1 = mbedtls_mpi_core_fill_random
                        (*param_1,*(undefined2 *)((long)param_1 + 10),param_2,param_3,param_4);
      return uVar1;
    }
    uVar1 = 0;
  }
  return uVar1;
}

