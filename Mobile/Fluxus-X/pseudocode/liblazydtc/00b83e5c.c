/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b83e5c
 */

ulong mbedtls_mpi_core_add(long *param_1,ulong *param_2,ulong *param_3,long param_4)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  
  uVar3 = 0;
  for (; param_4 != 0; param_4 = param_4 + -1) {
    uVar4 = *param_2;
    uVar1 = uVar4 + uVar3;
    uVar2 = 2;
    if (!CARRY8(uVar4,uVar3)) {
      uVar2 = 1;
    }
    uVar3 = (ulong)CARRY8(uVar4,uVar3);
    if (CARRY8(uVar1,*param_3)) {
      uVar3 = uVar2;
    }
    *param_1 = uVar1 + *param_3;
    param_3 = param_3 + 1;
    param_2 = param_2 + 1;
    param_1 = param_1 + 1;
  }
  return uVar3;
}

