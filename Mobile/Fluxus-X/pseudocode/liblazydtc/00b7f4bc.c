/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7f4bc
 */

int mbedtls_mpi_mul_mpi(long *param_1,long *param_2,long *param_3)

{
  long lVar1;
  bool bVar2;
  undefined4 uVar3;
  int iVar4;
  void *pvVar5;
  undefined8 *puVar6;
  size_t __n;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  void *pvVar10;
  ulong uVar11;
  long local_88;
  undefined4 local_80;
  long local_78;
  undefined4 local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  local_70 = 1;
  local_78 = 0;
  local_80 = 1;
  local_88 = 0;
  if (param_1 == param_2) {
    param_2 = &local_78;
    iVar4 = mbedtls_mpi_copy(&local_78,param_1);
    uVar3 = local_80;
    if (iVar4 != 0) goto joined_r0x00b7f700;
  }
  if (param_1 == param_3) {
    param_3 = &local_88;
    iVar4 = mbedtls_mpi_copy(&local_88,param_1);
    uVar3 = local_80;
    if (iVar4 != 0) goto joined_r0x00b7f700;
  }
  uVar7 = (ulong)*(ushort *)((long)param_2 + 10);
  do {
    uVar8 = uVar7;
    uVar7 = uVar8 - 1;
    if (uVar7 == 0xffffffffffffffff) {
      uVar8 = 0;
      bVar2 = true;
      goto LAB_00b7f568;
    }
  } while (*(long *)(*param_2 + uVar7 * 8) == 0);
  bVar2 = false;
LAB_00b7f568:
  uVar7 = (ulong)*(ushort *)((long)param_3 + 10);
  do {
    uVar9 = uVar7;
    uVar7 = uVar9 - 1;
    if (uVar7 == 0xffffffffffffffff) {
      uVar9 = 0;
      bVar2 = true;
      break;
    }
  } while (*(long *)(*param_3 + uVar7 * 8) == 0);
  uVar7 = uVar9 + uVar8;
  if (uVar7 < 0x2711) {
    uVar11 = (ulong)*(ushort *)((long)param_1 + 10);
    if (uVar7 <= uVar11) {
      if (*(ushort *)((long)param_1 + 10) == 0) {
        pvVar5 = calloc(1,8);
        if (pvVar5 == (void *)0x0) goto LAB_00b7f5a8;
        pvVar10 = (void *)*param_1;
        if (pvVar10 != (void *)0x0) {
          memcpy(pvVar5,pvVar10,0);
          mbedtls_zeroize_and_free(pvVar10,0);
        }
        __n = 8;
        *param_1 = (long)pvVar5;
        *(undefined2 *)((long)param_1 + 10) = 1;
      }
      else {
LAB_00b7f69c:
        pvVar5 = (void *)*param_1;
        __n = uVar11 << 3;
      }
      memset(pvVar5,0,__n);
      puVar6 = (undefined8 *)*param_1;
      *puVar6 = 0;
      *(undefined2 *)(param_1 + 1) = 1;
      mbedtls_mpi_core_mul(puVar6,*param_2,uVar8,*param_3,uVar9);
      iVar4 = 0;
      uVar3 = local_80;
      if (bVar2) {
        *(undefined2 *)(param_1 + 1) = 1;
      }
      else {
        *(short *)(param_1 + 1) = (short)param_3[1] * (short)param_2[1];
      }
      goto joined_r0x00b7f700;
    }
    pvVar5 = calloc(uVar7,8);
    if (pvVar5 != (void *)0x0) {
      pvVar10 = (void *)*param_1;
      if (pvVar10 != (void *)0x0) {
        memcpy(pvVar5,pvVar10,uVar11 << 3);
        mbedtls_zeroize_and_free(pvVar10,uVar11 << 3);
      }
      *(short *)((long)param_1 + 10) = (short)uVar7;
      *param_1 = (long)pvVar5;
      uVar11 = uVar7 & 0xffff;
      goto LAB_00b7f69c;
    }
  }
LAB_00b7f5a8:
  iVar4 = -0x10;
  uVar3 = local_80;
joined_r0x00b7f700:
  if (local_88 != 0) {
    local_80._2_2_ = (ushort)((uint)uVar3 >> 0x10);
    uVar7 = (ulong)local_80._2_2_;
    local_80 = uVar3;
    mbedtls_zeroize_and_free(local_88,uVar7 << 3);
  }
  local_80 = 1;
  local_88 = 0;
  if (local_78 != 0) {
    mbedtls_zeroize_and_free(local_78,(ulong)local_70._2_2_ << 3);
  }
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

