/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7dba4
 */

int mbedtls_mpi_read_string(long *param_1,int param_2,char *param_3)

{
  uint uVar1;
  byte bVar2;
  long lVar3;
  undefined4 uVar4;
  int iVar5;
  size_t sVar6;
  void *pvVar7;
  long lVar8;
  size_t sVar9;
  ulong uVar10;
  undefined8 *puVar11;
  ulong uVar12;
  int iVar13;
  void *pvVar14;
  ulong uVar15;
  long local_90;
  undefined4 local_88;
  ulong *local_80;
  ushort local_78;
  undefined2 local_76;
  ulong local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  if (0xe < param_2 - 2U) {
LAB_00b7dbe8:
    iVar5 = -4;
    goto LAB_00b7df1c;
  }
  iVar13 = 1;
  local_88 = 1;
  local_90 = 0;
  if (*param_3 == '-') {
    param_3 = param_3 + 1;
    iVar13 = -1;
  }
  else if (*param_3 == '\0') {
    if (param_1 == (long *)0x0) {
      iVar5 = 0;
    }
    else {
      if (*param_1 != 0) {
        mbedtls_zeroize_and_free(*param_1,(ulong)*(ushort *)((long)param_1 + 10) << 3);
      }
      iVar5 = 0;
      *(undefined4 *)(param_1 + 1) = 1;
      *param_1 = 0;
    }
    goto LAB_00b7df1c;
  }
  sVar6 = strlen(param_3);
  if (param_2 == 0x10) {
    if (sVar6 >> 0x3e != 0) goto LAB_00b7dbe8;
    uVar10 = sVar6 >> 4 & 0x3ffffffffffffff;
    if ((sVar6 & 0xf) != 0) {
      uVar10 = uVar10 + 1;
    }
    if (10000 < uVar10) {
LAB_00b7dfdc:
      iVar5 = -0x10;
      uVar4 = local_88;
      goto joined_r0x00b7dff4;
    }
    uVar15 = (ulong)*(ushort *)((long)param_1 + 10);
    if (uVar15 < uVar10) {
      pvVar7 = calloc(uVar10,8);
      if (pvVar7 == (void *)0x0) goto LAB_00b7dfdc;
      pvVar14 = (void *)*param_1;
      if (pvVar14 != (void *)0x0) {
        memcpy(pvVar7,pvVar14,uVar15 << 3);
        mbedtls_zeroize_and_free(pvVar14,uVar15 << 3);
      }
      *(short *)((long)param_1 + 10) = (short)uVar10;
      *param_1 = (long)pvVar7;
      uVar15 = uVar10 & 0xffff;
LAB_00b7de40:
      pvVar7 = (void *)*param_1;
      sVar9 = uVar15 << 3;
    }
    else {
      if (*(ushort *)((long)param_1 + 10) != 0) goto LAB_00b7de40;
      pvVar7 = calloc(1,8);
      if (pvVar7 == (void *)0x0) goto LAB_00b7dfdc;
      pvVar14 = (void *)*param_1;
      if (pvVar14 != (void *)0x0) {
        memcpy(pvVar7,pvVar14,0);
        mbedtls_zeroize_and_free(pvVar14,0);
      }
      sVar9 = 8;
      *param_1 = (long)pvVar7;
      *(undefined2 *)((long)param_1 + 10) = 1;
    }
    memset(pvVar7,0,sVar9);
    puVar11 = (undefined8 *)*param_1;
    *puVar11 = 0;
    *(undefined2 *)(param_1 + 1) = 1;
    if (sVar6 != 0) {
      uVar10 = 0;
      sVar9 = 0;
      do {
        param_3 = param_3 + -1;
        bVar2 = param_3[sVar6];
        if (bVar2 - 0x30 < 10) {
          iVar5 = -0x30;
        }
        else if (bVar2 - 0x41 < 6) {
          iVar5 = -0x37;
        }
        else {
          if (5 < bVar2 - 0x61) {
            iVar5 = -6;
            uVar4 = local_88;
            goto joined_r0x00b7dff4;
          }
          iVar5 = -0x57;
        }
        uVar1 = iVar5 + (uint)bVar2;
        if (0xf < uVar1) goto LAB_00b7df78;
        uVar12 = sVar9 >> 1 & 0x7ffffffffffffff8;
        uVar15 = uVar10 & 0x3c;
        sVar9 = sVar9 + 1;
        uVar10 = uVar10 + 4;
        *(ulong *)((long)puVar11 + uVar12) =
             *(ulong *)((long)puVar11 + uVar12) | (long)(int)uVar1 << uVar15;
      } while (sVar6 != sVar9);
    }
  }
  else {
    if ((ulong)*(ushort *)((long)param_1 + 10) == 0) {
      pvVar7 = calloc(1,8);
      if (pvVar7 == (void *)0x0) goto LAB_00b7dfdc;
      pvVar14 = (void *)*param_1;
      if (pvVar14 != (void *)0x0) {
        memcpy(pvVar7,pvVar14,0);
        mbedtls_zeroize_and_free(pvVar14,0);
      }
      sVar9 = 8;
      *param_1 = (long)pvVar7;
      *(undefined2 *)((long)param_1 + 10) = 1;
    }
    else {
      pvVar7 = (void *)*param_1;
      sVar9 = (ulong)*(ushort *)((long)param_1 + 10) << 3;
    }
    memset(pvVar7,0,sVar9);
    *(undefined8 *)*param_1 = 0;
    *(undefined2 *)(param_1 + 1) = 1;
    if (sVar6 != 0) {
      uVar10 = 0;
      uVar15 = (ulong)param_2;
      do {
        bVar2 = param_3[uVar10];
        uVar12 = (ulong)bVar2;
        if (bVar2 - 0x30 < 10) {
          uVar12 = uVar12 - 0x30;
joined_r0x00b7dda4:
          if (uVar15 <= uVar12) goto LAB_00b7df78;
        }
        else {
          if ((bVar2 - 0x41 & 0xff) < 6) {
            uVar12 = uVar12 - 0x37;
            goto joined_r0x00b7dda4;
          }
          if (bVar2 - 0x61 < 6) {
            uVar12 = uVar12 - 0x57;
            goto joined_r0x00b7dda4;
          }
          uVar12 = 0xff;
          if (uVar15 < 0x100) goto LAB_00b7df78;
        }
        iVar5 = mbedtls_mpi_mul_int(&local_90,param_1,uVar15);
        uVar4 = local_88;
        if (iVar5 != 0) goto joined_r0x00b7dff4;
        local_70 = -uVar12;
        if (-1 < (long)uVar12) {
          local_70 = uVar12;
        }
        local_78 = (ushort)((long)uVar12 >> 0x3f) | 1;
        local_76 = 1;
        local_80 = &local_70;
        iVar5 = FUN_00b7f304(param_1,&local_90,&local_80,1);
        uVar4 = local_88;
        if (iVar5 != 0) goto joined_r0x00b7dff4;
        uVar10 = uVar10 + 1;
      } while (uVar10 < sVar6);
    }
  }
  iVar5 = 0;
  uVar4 = local_88;
  if (iVar13 < 0) {
    lVar8 = mbedtls_mpi_core_bitlen(*param_1,*(undefined2 *)((long)param_1 + 10));
    iVar5 = 0;
    uVar4 = local_88;
    if (lVar8 != 0) {
      *(undefined2 *)(param_1 + 1) = 0xffff;
    }
  }
  goto joined_r0x00b7dff4;
LAB_00b7df78:
  iVar5 = -6;
  uVar4 = local_88;
joined_r0x00b7dff4:
  if (local_90 != 0) {
    local_88._2_2_ = (ushort)((uint)uVar4 >> 0x10);
    uVar10 = (ulong)local_88._2_2_;
    local_88 = uVar4;
    mbedtls_zeroize_and_free(local_90,uVar10 << 3);
  }
  local_88 = 1;
  local_90 = 0;
LAB_00b7df1c:
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

