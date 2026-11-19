/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7eeb0
 */

int mbedtls_mpi_cmp_int(long *param_1,ulong param_2)

{
  ulong uVar1;
  short sVar2;
  uint uVar3;
  ulong uVar4;
  ulong uVar5;
  
  uVar1 = -param_2;
  if (-1 < (long)param_2) {
    uVar1 = param_2;
  }
  uVar3 = (uint)((long)param_2 >> 0x3f) | 1;
  uVar4 = (ulong)*(ushort *)((long)param_1 + 10);
  do {
    uVar5 = uVar4;
    uVar4 = uVar5 - 1;
    if (uVar4 == 0xffffffffffffffff) {
      uVar5 = 0;
      break;
    }
  } while (*(long *)(*param_1 + uVar4 * 8) == 0);
  uVar4 = 2;
  do {
    uVar4 = uVar4 - 1;
    if (uVar4 == 0) break;
  } while (uVar1 == 0);
  if (uVar4 == 0 && uVar5 == 0) {
    return 0;
  }
  if (uVar4 < uVar5) {
    return (int)(short)param_1[1];
  }
  if (uVar5 < uVar4) {
    return -uVar3;
  }
  sVar2 = (short)param_1[1];
  if (sVar2 < 1) {
    if ((0 < (int)uVar3) && (sVar2 != 0)) {
      return -1;
    }
  }
  else if ((int)uVar3 < 0) {
    return 1;
  }
  while( true ) {
    uVar5 = uVar5 - 1;
    if (uVar5 == 0xffffffffffffffff) {
      return 0;
    }
    uVar4 = *(ulong *)(*param_1 + uVar5 * 8);
    if (uVar1 < uVar4) break;
    if (uVar4 < uVar1) {
      return -(int)sVar2;
    }
  }
  return (int)sVar2;
}

