/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7eda0
 */

int mbedtls_mpi_cmp_mpi(long *param_1,long *param_2)

{
  int iVar1;
  ulong uVar2;
  ulong uVar3;
  ulong uVar4;
  
  uVar2 = (ulong)*(ushort *)((long)param_1 + 10);
  do {
    uVar3 = uVar2;
    uVar2 = uVar3 - 1;
    if (uVar2 == 0xffffffffffffffff) {
      uVar3 = 0;
      break;
    }
  } while (*(long *)(*param_1 + uVar2 * 8) == 0);
  uVar2 = (ulong)*(ushort *)((long)param_2 + 10);
  do {
    uVar4 = uVar2;
    uVar2 = uVar4 - 1;
    if (uVar2 == 0xffffffffffffffff) {
      uVar4 = 0;
      if (uVar3 == 0) {
        return 0;
      }
      goto LAB_00b7ee0c;
    }
  } while (*(long *)(*param_2 + uVar2 * 8) == 0);
  if (uVar4 == 0 && uVar3 == 0) {
    return 0;
  }
LAB_00b7ee0c:
  if (uVar4 < uVar3) {
    return (int)(short)param_1[1];
  }
  if (uVar3 < uVar4) {
    iVar1 = (int)(short)param_2[1];
  }
  else {
    iVar1 = (int)(short)param_1[1];
    if (iVar1 < 1) {
      if ((iVar1 != 0) && (0 < (short)param_2[1])) {
        return -1;
      }
    }
    else if ((short)param_2[1] < 0) {
      return 1;
    }
    do {
      uVar3 = uVar3 - 1;
      if (uVar3 == 0xffffffffffffffff) {
        return 0;
      }
      uVar2 = *(ulong *)(*param_1 + uVar3 * 8);
      uVar4 = *(ulong *)(*param_2 + uVar3 * 8);
      if (uVar4 < uVar2) {
        return iVar1;
      }
    } while (uVar4 <= uVar2);
  }
  return -iVar1;
}

