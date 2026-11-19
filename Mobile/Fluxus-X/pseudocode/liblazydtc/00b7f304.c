/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7f304
 */

void FUN_00b7f304(long param_1,long *param_2,long *param_3,int param_4)

{
  bool bVar1;
  int iVar2;
  short sVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  
  sVar3 = (short)param_2[1];
  if (sVar3 * param_4 * (int)(short)param_3[1] < 0) {
    uVar4 = (ulong)*(ushort *)((long)param_2 + 10);
    do {
      uVar5 = uVar4;
      uVar4 = uVar5 - 1;
      if (uVar4 == 0xffffffffffffffff) {
        uVar5 = 0;
        break;
      }
    } while (*(long *)(*param_2 + uVar4 * 8) == 0);
    uVar4 = (ulong)*(ushort *)((long)param_3 + 10);
    do {
      uVar6 = uVar4;
      uVar4 = uVar6 - 1;
      if (uVar4 == 0xffffffffffffffff) {
        uVar6 = 0;
        if (uVar5 == 0) goto LAB_00b7f3a4;
        goto LAB_00b7f408;
      }
    } while (*(long *)(*param_3 + uVar4 * 8) == 0);
    if (uVar6 < uVar5) {
LAB_00b7f408:
      bVar1 = true;
LAB_00b7f40c:
      iVar2 = mbedtls_mpi_sub_abs(param_1,param_2);
      if (iVar2 != 0) {
        return;
      }
      if (!bVar1) {
        sVar3 = 1;
      }
    }
    else {
LAB_00b7f3a4:
      if (uVar6 <= uVar5) {
        do {
          uVar5 = uVar5 - 1;
          if (uVar5 == 0xffffffffffffffff) {
            bVar1 = false;
            goto LAB_00b7f40c;
          }
          uVar4 = *(ulong *)(*param_2 + uVar5 * 8);
          uVar6 = *(ulong *)(*param_3 + uVar5 * 8);
          if (uVar6 < uVar4) goto LAB_00b7f408;
        } while (uVar6 <= uVar4);
      }
      iVar2 = mbedtls_mpi_sub_abs(param_1,param_3,param_2);
      if (iVar2 != 0) {
        return;
      }
      sVar3 = -sVar3;
    }
    *(short *)(param_1 + 8) = sVar3;
  }
  else {
    iVar2 = mbedtls_mpi_add_abs(param_1,param_2);
    if (iVar2 == 0) {
      *(short *)(param_1 + 8) = sVar3;
    }
  }
  return;
}

