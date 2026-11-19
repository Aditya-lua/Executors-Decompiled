/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7e000
 */

undefined8 mbedtls_mpi_mul_int(undefined8 *param_1,long *param_2,long param_3)

{
  ushort uVar1;
  ulong uVar2;
  void *pvVar3;
  undefined8 uVar4;
  void *pvVar5;
  size_t sVar6;
  ulong uVar7;
  
  uVar7 = (ulong)*(ushort *)((long)param_2 + 10);
  do {
    uVar2 = uVar7;
    uVar7 = uVar2 - 1;
    if (uVar7 == 0xffffffffffffffff) goto LAB_00b7e0d8;
  } while (*(long *)(*param_2 + uVar7 * 8) == 0);
  if (param_3 != 0) {
    uVar7 = uVar2 + 1;
    if (10000 < uVar7) {
      return 0xfffffff0;
    }
    uVar1 = *(ushort *)((long)param_1 + 10);
    if (uVar1 < uVar7) {
      pvVar3 = calloc(uVar7,8);
      if (pvVar3 == (void *)0x0) {
        return 0xfffffff0;
      }
      pvVar5 = (void *)*param_1;
      if (pvVar5 != (void *)0x0) {
        sVar6 = (ulong)uVar1 << 3;
        memcpy(pvVar3,pvVar5,sVar6);
        mbedtls_zeroize_and_free(pvVar5,sVar6);
      }
      *(short *)((long)param_1 + 10) = (short)uVar7;
      *param_1 = pvVar3;
    }
    uVar4 = mbedtls_mpi_copy(param_1,param_2);
    if ((int)uVar4 == 0) {
      mbedtls_mpi_core_mla(*param_1,*(undefined2 *)((long)param_1 + 10),*param_2,uVar2,param_3 + -1)
      ;
      return 0;
    }
    return uVar4;
  }
LAB_00b7e0d8:
  if ((ulong)*(ushort *)((long)param_1 + 10) == 0) {
    pvVar3 = calloc(1,8);
    if (pvVar3 == (void *)0x0) {
      return 0xfffffff0;
    }
    pvVar5 = (void *)*param_1;
    if (pvVar5 != (void *)0x0) {
      memcpy(pvVar3,pvVar5,0);
      mbedtls_zeroize_and_free(pvVar5,0);
    }
    sVar6 = 8;
    *param_1 = pvVar3;
    *(undefined2 *)((long)param_1 + 10) = 1;
  }
  else {
    pvVar3 = (void *)*param_1;
    sVar6 = (ulong)*(ushort *)((long)param_1 + 10) << 3;
  }
  memset(pvVar3,0,sVar6);
  *(undefined8 *)*param_1 = 0;
  *(undefined2 *)(param_1 + 1) = 1;
  return 0;
}

