/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7ece0
 */

undefined8 mbedtls_mpi_cmp_abs(long *param_1,long *param_2)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  
  uVar1 = (ulong)*(ushort *)((long)param_1 + 10);
  do {
    uVar2 = uVar1;
    uVar1 = uVar2 - 1;
    if (uVar1 == 0xffffffffffffffff) {
      uVar2 = 0;
      break;
    }
  } while (*(long *)(*param_1 + uVar1 * 8) == 0);
  uVar1 = (ulong)*(ushort *)((long)param_2 + 10);
  do {
    uVar3 = uVar1;
    uVar1 = uVar3 - 1;
    if (uVar1 == 0xffffffffffffffff) {
      uVar3 = 0;
      if (uVar2 != 0) {
        return 1;
      }
      goto LAB_00b7ed38;
    }
  } while (*(long *)(*param_2 + uVar1 * 8) == 0);
  if (uVar3 < uVar2) {
    return 1;
  }
LAB_00b7ed38:
  if (uVar3 <= uVar2) {
    do {
      uVar2 = uVar2 - 1;
      if (uVar2 == 0xffffffffffffffff) {
        return 0;
      }
      uVar1 = *(ulong *)(*param_1 + uVar2 * 8);
      uVar3 = *(ulong *)(*param_2 + uVar2 * 8);
      if (uVar3 < uVar1) {
        return 1;
      }
    } while (uVar3 <= uVar1);
  }
  return 0xffffffff;
}

