/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b80638
 */

int FUN_00b80638(long *param_1,long param_2,long *param_3,int param_4,long *param_5,long *param_6)

{
  ushort uVar1;
  long lVar2;
  ushort uVar3;
  int iVar4;
  size_t sVar5;
  void *pvVar6;
  void *pvVar7;
  undefined8 uVar8;
  size_t sVar9;
  size_t __n;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  void *pvVar14;
  long local_80;
  ulong uStack_78;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  uVar10 = (ulong)*(ushort *)((long)param_5 + 10);
  do {
    uVar10 = uVar10 - 1;
    if (uVar10 == 0xffffffffffffffff) goto LAB_00b80700;
  } while (*(long *)(*param_5 + uVar10 * 8) == 0);
  if ((0 < (short)param_5[1]) && ((*(byte *)*param_5 & 1) != 0)) {
    uVar10 = (ulong)*(ushort *)((long)param_3 + 10);
    do {
      uVar10 = uVar10 - 1;
      if (uVar10 == 0xffffffffffffffff) goto LAB_00b806dc;
    } while (*(long *)(*param_3 + uVar10 * 8) == 0);
    if (-1 < (short)param_3[1]) {
LAB_00b806dc:
      uVar10 = mbedtls_mpi_core_bitlen(*param_3);
      if ((uVar10 < 0x2001) &&
         (uVar10 = mbedtls_mpi_core_bitlen(*param_5,*(undefined2 *)((long)param_5 + 10)),
         uVar10 < 0x2001)) {
        if (*(short *)((long)param_3 + 10) == 0) {
          if ((ulong)*(ushort *)((long)param_1 + 10) == 0) {
            pvVar6 = calloc(1,8);
            if (pvVar6 == (void *)0x0) goto LAB_00b80844;
            pvVar14 = (void *)*param_1;
            if (pvVar14 != (void *)0x0) {
              memcpy(pvVar6,pvVar14,0);
              mbedtls_zeroize_and_free(pvVar14,0);
            }
            sVar5 = 8;
            *param_1 = (long)pvVar6;
            *(undefined2 *)((long)param_1 + 10) = 1;
          }
          else {
            pvVar6 = (void *)*param_1;
            sVar5 = (ulong)*(ushort *)((long)param_1 + 10) << 3;
          }
          memset(pvVar6,0,sVar5);
          iVar4 = 0;
          *(undefined8 *)*param_1 = 1;
          *(undefined2 *)(param_1 + 1) = 1;
          goto LAB_00b80704;
        }
        sVar5 = mbedtls_mpi_core_exp_mod_working_limbs(*(undefined2 *)((long)param_5 + 10));
        pvVar6 = calloc(sVar5,8);
        if (pvVar6 == (void *)0x0) {
LAB_00b80844:
          iVar4 = -0x10;
          goto LAB_00b80704;
        }
        uStack_78 = CONCAT44(uStack_78._4_4_,1);
        local_80 = 0;
        if ((param_6 == (long *)0x0) || (pvVar14 = (void *)*param_6, pvVar14 == (void *)0x0)) {
          iVar4 = mbedtls_mpi_core_get_mont_r2_unsafe(&local_80,param_5);
          if (iVar4 == 0) {
            if (param_6 != (long *)0x0) {
              param_6[1] = uStack_78;
              *param_6 = local_80;
            }
            goto LAB_00b808b0;
          }
LAB_00b80af8:
          mbedtls_zeroize_and_free(pvVar6,sVar5 << 3);
          if (param_6 != (long *)0x0) {
            lVar11 = *param_6;
            goto joined_r0x00b80b0c;
          }
        }
        else {
          uVar3 = *(ushort *)((long)param_5 + 10);
          if ((ulong)uVar3 < 0x2711) {
            uVar1 = *(ushort *)((long)param_6 + 10);
            if (uVar1 < uVar3) {
              pvVar7 = calloc((ulong)uVar3,8);
              if (pvVar7 == (void *)0x0) goto LAB_00b80780;
              sVar9 = (ulong)uVar1 << 3;
              memcpy(pvVar7,pvVar14,sVar9);
              mbedtls_zeroize_and_free(pvVar14,sVar9);
              *(ushort *)((long)param_6 + 10) = uVar3;
              *param_6 = (long)pvVar7;
            }
            uStack_78 = param_6[1];
            local_80 = *param_6;
LAB_00b808b0:
            iVar4 = mbedtls_mpi_copy(param_1,param_2);
            if (iVar4 != 0) goto LAB_00b80af8;
            *(undefined2 *)(param_1 + 1) = 1;
            uVar10 = (ulong)*(ushort *)((long)param_1 + 10);
            do {
              uVar12 = uVar10;
              uVar10 = uVar12 - 1;
              if (uVar10 == 0xffffffffffffffff) {
                uVar12 = 0;
                break;
              }
            } while (*(long *)(*param_1 + uVar10 * 8) == 0);
            sVar9 = (size_t)*(ushort *)((long)param_5 + 10);
            uVar10 = sVar9;
            do {
              uVar13 = uVar10;
              uVar10 = uVar13 - 1;
              if (uVar10 == 0xffffffffffffffff) {
                uVar13 = 0;
                if (uVar12 != 0) goto LAB_00b80990;
                goto LAB_00b80934;
              }
            } while (*(long *)(*param_5 + uVar10 * 8) == 0);
            if (uVar13 < uVar12) {
LAB_00b80990:
              iVar4 = mbedtls_mpi_mod_mpi(param_1,param_1,param_5);
              if (iVar4 != 0) goto LAB_00b80af8;
              sVar9 = (size_t)*(ushort *)((long)param_5 + 10);
            }
            else {
LAB_00b80934:
              if (uVar13 == 0 && uVar12 == 0) goto LAB_00b80990;
              if (uVar12 < uVar13) {
                if ((short)param_5[1] < 1) goto LAB_00b80990;
              }
              else {
                if ((short)param_5[1] < 0) goto LAB_00b80990;
                do {
                  uVar12 = uVar12 - 1;
                  if (uVar12 == 0xffffffffffffffff) goto LAB_00b80990;
                  uVar10 = *(ulong *)(*param_1 + uVar12 * 8);
                  uVar13 = *(ulong *)(*param_5 + uVar12 * 8);
                  if (uVar13 < uVar10) goto LAB_00b80990;
                } while (uVar13 <= uVar10);
              }
            }
            if ((uint)sVar9 < 0x2711) {
              uVar3 = *(ushort *)((long)param_1 + 10);
              if ((uint)uVar3 < (uint)sVar9) {
                pvVar14 = calloc(sVar9,8);
                if (pvVar14 == (void *)0x0) goto LAB_00b809b8;
                pvVar7 = (void *)*param_1;
                if (pvVar7 != (void *)0x0) {
                  __n = (ulong)uVar3 << 3;
                  memcpy(pvVar14,pvVar7,__n);
                  mbedtls_zeroize_and_free(pvVar7,__n);
                }
                *(short *)((long)param_1 + 10) = (short)sVar9;
                *param_1 = (long)pvVar14;
              }
              uVar8 = mbedtls_mpi_core_montmul_init(*param_5);
              mbedtls_mpi_core_to_mont_rep
                        (*param_1,*param_1,*param_5,*(undefined2 *)((long)param_5 + 10),uVar8,
                         local_80,pvVar6);
              if (param_4 == 0x2a2a2a2a) {
                mbedtls_mpi_core_exp_mod_unsafe();
              }
              else {
                mbedtls_mpi_core_exp_mod
                          (*param_1,*param_1,*param_5,*(undefined2 *)((long)param_5 + 10),*param_3,
                           *(undefined2 *)((long)param_3 + 10),local_80,pvVar6);
              }
              mbedtls_mpi_core_from_mont_rep
                        (*param_1,*param_1,*param_5,*(undefined2 *)((long)param_5 + 10),uVar8,pvVar6
                        );
              iVar4 = 0;
              if ((*(short *)(param_2 + 8) == -1) && (iVar4 = 0, (*(byte *)*param_3 & 1) != 0)) {
                uVar3 = mbedtls_mpi_core_check_zero_ct(*param_1,*(undefined2 *)((long)param_1 + 10))
                ;
                *(ushort *)(param_1 + 1) = (~uVar3 & 2) - 1;
                iVar4 = FUN_00b7f304(param_1,param_5,param_1,1);
              }
            }
            else {
LAB_00b809b8:
              iVar4 = -0x10;
            }
            goto LAB_00b80af8;
          }
LAB_00b80780:
          mbedtls_zeroize_and_free(pvVar6,sVar5 << 3);
          iVar4 = -0x10;
          lVar11 = *param_6;
joined_r0x00b80b0c:
          if (lVar11 != 0) goto LAB_00b80704;
        }
        if (local_80 != 0) {
          mbedtls_zeroize_and_free(local_80,(uStack_78 >> 0x10 & 0xffff) << 3);
        }
        uStack_78 = CONCAT44(uStack_78._4_4_,1);
        local_80 = 0;
        goto LAB_00b80704;
      }
    }
  }
LAB_00b80700:
  iVar4 = -4;
LAB_00b80704:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

