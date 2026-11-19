/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b803b4
 */

undefined8 mbedtls_mpi_mod_mpi(long *param_1,undefined8 param_2,long *param_3)

{
  short sVar1;
  undefined8 uVar2;
  ulong uVar3;
  ulong uVar4;
  int iVar5;
  ulong uVar6;
  
  uVar3 = (ulong)*(ushort *)((long)param_3 + 10);
  do {
    uVar3 = uVar3 - 1;
    if (uVar3 == 0xffffffffffffffff) goto LAB_00b803f4;
  } while (*(long *)(*param_3 + uVar3 * 8) == 0);
  if ((short)param_3[1] < 0) {
    uVar2 = 0xfffffff6;
  }
  else {
LAB_00b803f4:
    uVar2 = mbedtls_mpi_div_mpi(0,param_1,param_2,param_3);
    iVar5 = (int)uVar2;
    while (iVar5 == 0) {
      uVar4 = (ulong)*(ushort *)((long)param_1 + 10);
      uVar3 = uVar4;
      do {
        uVar3 = uVar3 - 1;
        if (uVar3 == 0xffffffffffffffff) goto LAB_00b80458;
      } while (*(long *)(*param_1 + uVar3 * 8) == 0);
      if (-1 < (short)param_1[1]) goto LAB_00b80458;
      uVar2 = FUN_00b7f304(param_1,param_1,param_3,1);
      iVar5 = (int)uVar2;
    }
  }
  return uVar2;
LAB_00b80458:
  uVar3 = uVar4;
  uVar4 = uVar3 - 1;
  if (uVar4 != 0xffffffffffffffff) goto code_r0x00b80460;
  uVar3 = 0;
  goto LAB_00b8047c;
code_r0x00b80460:
  if (*(long *)(*param_1 + uVar4 * 8) == 0) goto LAB_00b80458;
LAB_00b8047c:
  uVar4 = (ulong)*(ushort *)((long)param_3 + 10);
  do {
    uVar6 = uVar4;
    uVar4 = uVar6 - 1;
    if (uVar4 == 0xffffffffffffffff) {
      uVar6 = 0;
      if (uVar3 == 0) goto LAB_00b80544;
      goto LAB_00b804a8;
    }
  } while (*(long *)(*param_3 + uVar4 * 8) == 0);
  if (uVar6 != 0 || uVar3 != 0) {
LAB_00b804a8:
    if (uVar6 < uVar3) {
      if ((short)param_1[1] < 0) {
        return 0;
      }
    }
    else {
      if (uVar3 < uVar6) {
        iVar5 = -(int)(short)param_3[1];
      }
      else {
        sVar1 = (short)param_1[1];
        iVar5 = (int)sVar1;
        if (sVar1 < 1) {
          if ((sVar1 != 0) && (0 < (short)param_3[1])) {
            return 0;
          }
        }
        else if ((short)param_3[1] < 0) goto LAB_00b80544;
        do {
          uVar3 = uVar3 - 1;
          if (uVar3 == 0xffffffffffffffff) goto LAB_00b80544;
          uVar4 = *(ulong *)(*param_1 + uVar3 * 8);
          uVar6 = *(ulong *)(*param_3 + uVar3 * 8);
          if (uVar6 < uVar4) goto joined_r0x00b80540;
        } while (uVar6 <= uVar4);
        iVar5 = -(int)sVar1;
      }
joined_r0x00b80540:
      if (iVar5 < 0) {
        return 0;
      }
    }
  }
LAB_00b80544:
  uVar2 = FUN_00b7f304(param_1,param_1,param_3,0xffffffff);
  if ((int)uVar2 != 0) {
    return uVar2;
  }
  uVar4 = (ulong)*(ushort *)((long)param_1 + 10);
  goto LAB_00b80458;
}

