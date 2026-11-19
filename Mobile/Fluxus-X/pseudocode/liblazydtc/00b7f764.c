/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7f764
 */

int mbedtls_mpi_div_mpi(undefined8 *param_1,long *param_2,long *param_3,long *param_4)

{
  ushort uVar1;
  long lVar2;
  undefined4 uVar3;
  bool bVar4;
  int iVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  void *pvVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  undefined8 uVar14;
  void *pvVar15;
  ulong uVar16;
  ulong uVar17;
  long lVar18;
  ulong uVar19;
  size_t sVar20;
  ulong uVar21;
  undefined1 auVar22 [16];
  undefined8 *local_c8;
  undefined4 local_c0;
  undefined8 *local_b8;
  undefined4 local_b0;
  void *local_a8;
  undefined4 local_a0;
  void *local_98;
  undefined4 local_90;
  ulong local_88 [5];
  
  lVar2 = tpidr_el0;
  local_88[3] = *(long *)(lVar2 + 0x28);
  lVar9 = (ulong)*(ushort *)((long)param_4 + 10) - 1;
  lVar10 = lVar9;
  do {
    if (lVar10 == -1) goto LAB_00b7f820;
    lVar18 = lVar10 * 8;
    lVar10 = lVar10 + -1;
  } while (*(long *)(*param_4 + lVar18) == 0);
  if ((short)param_4[1] == 0) {
LAB_00b7f820:
    iVar5 = -0xc;
    goto LAB_00b7fdd0;
  }
  local_90 = 1;
  local_98 = (void *)0x0;
  local_a0 = 1;
  local_a8 = (void *)0x0;
  local_b0 = 1;
  local_b8 = (undefined8 *)0x0;
  local_c0 = 1;
  local_c8 = (undefined8 *)0x0;
  uVar11 = (ulong)*(ushort *)((long)param_3 + 10);
  do {
    uVar19 = uVar11;
    uVar11 = uVar19 - 1;
    if (uVar11 == 0xffffffffffffffff) {
      uVar19 = 0;
      goto LAB_00b7f82c;
    }
  } while (*(long *)(*param_3 + uVar11 * 8) == 0);
  lVar10 = lVar9;
  if ((ulong)*(ushort *)((long)param_4 + 10) != 0) {
    do {
      lVar9 = lVar10 + -1;
      if (*(long *)(*param_4 + lVar10 * 8) != 0) {
        uVar11 = lVar10 + 1;
        if (uVar11 < uVar19) goto LAB_00b7f8b0;
        goto LAB_00b7f850;
      }
LAB_00b7f82c:
      lVar10 = lVar9;
    } while (lVar9 != -1);
  }
  uVar11 = 0;
  bVar4 = uVar19 == 0;
  uVar19 = 0;
  if (bVar4) {
LAB_00b7f850:
    if (uVar11 <= uVar19) {
      do {
        uVar19 = uVar19 - 1;
        if (uVar19 == 0xffffffffffffffff) goto LAB_00b7f8b0;
        uVar11 = *(ulong *)(*param_3 + uVar19 * 8);
        uVar16 = *(ulong *)(*param_4 + uVar19 * 8);
        if (uVar16 < uVar11) goto LAB_00b7f8b0;
      } while (uVar16 <= uVar11);
    }
    if (param_1 != (undefined8 *)0x0) {
      if ((ulong)*(ushort *)((long)param_1 + 10) == 0) {
        pvVar15 = calloc(1,8);
        if (pvVar15 == (void *)0x0) goto LAB_00b80304;
        pvVar8 = (void *)*param_1;
        if (pvVar8 != (void *)0x0) {
          memcpy(pvVar15,pvVar8,0);
          mbedtls_zeroize_and_free(pvVar8,0);
        }
        sVar20 = 8;
        *param_1 = pvVar15;
        *(undefined2 *)((long)param_1 + 10) = 1;
      }
      else {
        pvVar15 = (void *)*param_1;
        sVar20 = (ulong)*(ushort *)((long)param_1 + 10) << 3;
      }
      memset(pvVar15,0,sVar20);
      *(undefined8 *)*param_1 = 0;
      *(undefined2 *)(param_1 + 1) = 1;
    }
    if (param_2 == (long *)0x0) {
      iVar5 = 0;
      goto LAB_00b7fdd0;
    }
    iVar5 = mbedtls_mpi_copy(param_2,param_3);
    uVar3 = local_90;
    if (iVar5 == 0) goto LAB_00b7fdd0;
  }
  else {
LAB_00b7f8b0:
    iVar5 = mbedtls_mpi_copy(&local_98,param_3);
    uVar3 = local_90;
    if (iVar5 == 0) {
      iVar5 = mbedtls_mpi_copy(&local_a8,param_4);
      uVar3 = local_90;
      if (iVar5 == 0) {
        local_a0 = CONCAT22(local_a0._2_2_,1);
        local_90 = CONCAT22(local_90._2_2_,1);
        uVar1 = *(ushort *)((long)param_3 + 10);
        uVar11 = (ulong)uVar1 + 2;
        if ((uVar11 < 0x2711) && (puVar6 = calloc(uVar11,8), puVar6 != (undefined8 *)0x0)) {
          local_b8 = puVar6;
          local_b0._2_2_ = (short)uVar11;
          memset(puVar6,0,((ulong)(uVar1 + 2) & 0xffff) << 3);
          *puVar6 = 0;
          local_b0 = CONCAT22(local_b0._2_2_,1);
          uVar11 = (ulong)*(ushort *)((long)param_3 + 10) + 2;
          if (uVar11 < 0x2711) {
            uVar19 = (ulong)local_c0._2_2_;
            if (uVar19 < uVar11) {
              puVar7 = calloc(uVar11,8);
              puVar6 = local_c8;
              if (puVar7 == (undefined8 *)0x0) goto LAB_00b80304;
              if (local_c8 != (undefined8 *)0x0) {
                sVar20 = uVar19 << 3;
                memcpy(puVar7,local_c8,sVar20);
                mbedtls_zeroize_and_free(puVar6,sVar20);
              }
              local_c0 = CONCAT22((short)uVar11,(short)local_c0);
              local_c8 = puVar7;
            }
            uVar11 = mbedtls_mpi_core_bitlen(local_a8,local_a0._2_2_);
            uVar19 = 0;
            if ((uVar11 & 0x3f) != 0x3f) {
              uVar19 = uVar11 & 0x3f ^ 0x3f;
              lVar10 = mbedtls_mpi_core_bitlen(local_98,local_90._2_2_);
              uVar16 = (ulong)local_90._2_2_;
              uVar11 = lVar10 + uVar19;
              if (uVar16 << 6 < uVar11) {
                uVar12 = uVar11 >> 6;
                if ((uVar11 & 0x3f) != 0) {
                  uVar12 = uVar12 + 1;
                }
                if (10000 < uVar12) goto LAB_00b80304;
                if (uVar16 < uVar12) {
                  pvVar8 = calloc(uVar12,8);
                  pvVar15 = local_98;
                  if (pvVar8 == (void *)0x0) goto LAB_00b80304;
                  if (local_98 != (void *)0x0) {
                    memcpy(pvVar8,local_98,uVar16 << 3);
                    mbedtls_zeroize_and_free(pvVar15,uVar16 << 3);
                  }
                  uVar16 = uVar12 & 0xffff;
                  local_90 = CONCAT22((short)uVar12,(short)local_90);
                  local_98 = pvVar8;
                }
              }
              mbedtls_mpi_core_shift_l(local_98,uVar16,uVar19);
              lVar10 = mbedtls_mpi_core_bitlen(local_a8,local_a0._2_2_);
              uVar16 = (ulong)local_a0._2_2_;
              uVar11 = lVar10 + uVar19;
              if (uVar16 << 6 < uVar11) {
                uVar12 = uVar11 >> 6;
                if ((uVar11 & 0x3f) != 0) {
                  uVar12 = uVar12 + 1;
                }
                if (10000 < uVar12) goto LAB_00b80304;
                if (uVar16 < uVar12) {
                  pvVar8 = calloc(uVar12,8);
                  pvVar15 = local_a8;
                  if (pvVar8 == (void *)0x0) goto LAB_00b80304;
                  if (local_a8 != (void *)0x0) {
                    memcpy(pvVar8,local_a8,uVar16 << 3);
                    mbedtls_zeroize_and_free(pvVar15,uVar16 << 3);
                  }
                  uVar16 = uVar12 & 0xffff;
                  local_a0 = CONCAT22((short)uVar12,(short)local_a0);
                  local_a8 = pvVar8;
                }
              }
              mbedtls_mpi_core_shift_l(local_a8,uVar16,uVar19);
            }
            uVar17 = (ulong)local_a0._2_2_;
            uVar16 = (ulong)local_90._2_2_ - 1;
            uVar12 = uVar17 - 1;
            lVar9 = uVar16 - uVar12;
            lVar18 = lVar9 * 0x40;
            lVar10 = mbedtls_mpi_core_bitlen(local_a8,uVar17);
            uVar21 = (ulong)local_a0._2_2_;
            uVar11 = lVar18 + lVar10;
            if (uVar21 << 6 < uVar11) {
              uVar13 = uVar11 >> 6;
              if ((uVar11 & 0x3f) != 0) {
                uVar13 = uVar13 + 1;
              }
              if (10000 < uVar13) goto LAB_00b80304;
              if (uVar21 < uVar13) {
                pvVar8 = calloc(uVar13,8);
                pvVar15 = local_a8;
                if (pvVar8 == (void *)0x0) goto LAB_00b80304;
                if (local_a8 != (void *)0x0) {
                  memcpy(pvVar8,local_a8,uVar21 << 3);
                  mbedtls_zeroize_and_free(pvVar15,uVar21 << 3);
                }
                uVar21 = uVar13 & 0xffff;
                local_a0 = CONCAT22((short)uVar13,(short)local_a0);
                local_a8 = pvVar8;
              }
            }
            mbedtls_mpi_core_shift_l(local_a8,uVar21,lVar18);
            do {
              uVar11 = (ulong)local_90._2_2_;
              do {
                uVar21 = uVar11;
                uVar11 = uVar21 - 1;
                if (uVar11 == 0xffffffffffffffff) {
                  uVar21 = 0;
                  break;
                }
              } while (*(long *)((long)local_98 + uVar11 * 8) == 0);
              uVar11 = (ulong)local_a0._2_2_;
              do {
                uVar13 = uVar11;
                uVar11 = uVar13 - 1;
                if (uVar11 == 0xffffffffffffffff) {
                  uVar13 = 0;
                  if (uVar21 == 0) goto LAB_00b7fc9c;
                  goto LAB_00b7fc1c;
                }
              } while (*(long *)((long)local_a8 + uVar11 * 8) == 0);
              if (uVar13 != 0 || uVar21 != 0) {
LAB_00b7fc1c:
                if (uVar13 < uVar21) {
                  if ((short)local_90 < 0) goto LAB_00b7fe0c;
                }
                else {
                  if (uVar21 < uVar13) {
                    iVar5 = -(int)(short)local_a0;
                  }
                  else {
                    iVar5 = (int)(short)local_90;
                    if ((short)local_90 < 1) {
                      if (((short)local_90 != 0) && (0 < (short)local_a0)) goto LAB_00b7fe0c;
                    }
                    else if ((short)local_a0 < 0) goto LAB_00b7fc9c;
                    do {
                      if (uVar21 == 0) goto LAB_00b7fc9c;
                      uVar13 = *(ulong *)((long)local_98 + uVar21 * 8 + -8);
                      uVar11 = *(ulong *)((long)local_a8 + uVar21 * 8 + -8);
                      uVar21 = uVar21 - 1;
                      if (uVar11 < uVar13) goto joined_r0x00b7fc98;
                    } while (uVar11 <= uVar13);
                    iVar5 = -(int)(short)local_90;
                  }
joined_r0x00b7fc98:
                  if (iVar5 < 0) {
LAB_00b7fe0c:
                    if (local_a0._2_2_ != 0) {
                      mbedtls_mpi_core_shift_r(local_a8,(ulong)local_a0._2_2_,lVar18);
                    }
                    if (uVar16 <= uVar12) goto LAB_00b80278;
                    goto LAB_00b7fe30;
                  }
                }
              }
LAB_00b7fc9c:
              local_b8[lVar9] = local_b8[lVar9] + 1;
              iVar5 = FUN_00b7f304(&local_98,&local_98,&local_a8,0xffffffff);
              uVar3 = local_90;
            } while (iVar5 == 0);
            goto joined_r0x00b8031c;
          }
        }
LAB_00b80304:
        iVar5 = -0x10;
        uVar3 = local_90;
      }
    }
  }
joined_r0x00b8031c:
  if (local_98 != (void *)0x0) {
    local_90._2_2_ = (ushort)((uint)uVar3 >> 0x10);
    uVar11 = (ulong)local_90._2_2_;
    local_90 = uVar3;
    mbedtls_zeroize_and_free(local_98,uVar11 << 3);
  }
  local_90 = 1;
  local_98 = (void *)0x0;
  if (local_a8 != (void *)0x0) {
    mbedtls_zeroize_and_free(local_a8,(ulong)local_a0._2_2_ << 3);
  }
  local_a0 = 1;
  local_a8 = (void *)0x0;
  if (local_b8 != (undefined8 *)0x0) {
    mbedtls_zeroize_and_free(local_b8,(ulong)local_b0._2_2_ << 3);
  }
  local_b0 = 1;
  local_b8 = (undefined8 *)0x0;
  if (local_c8 != (undefined8 *)0x0) {
    mbedtls_zeroize_and_free(local_c8,(ulong)local_c0._2_2_ << 3);
  }
  local_c0 = 1;
  local_c8 = (undefined8 *)0x0;
  mbedtls_platform_zeroize(local_88,0x18);
LAB_00b7fdd0:
  if (*(long *)(lVar2 + 0x28) != local_88[3]) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
LAB_00b7fe30:
  pvVar15 = local_98;
  uVar11 = *(ulong *)((long)local_98 + uVar16 * 8);
  uVar21 = *(ulong *)((long)local_a8 + uVar12 * 8);
  if (uVar11 < uVar21) {
    auVar22 = FUN_00c2b374(*(undefined8 *)((long)local_98 + (uVar16 - 1) * 8),uVar11,uVar21,0);
    lVar10 = auVar22._0_8_;
    if (auVar22._8_8_ != 0 || lVar10 == -1) {
      lVar10 = -1;
    }
  }
  else {
    lVar10 = -1;
  }
  local_88[0] = 0;
  local_b8[uVar16 - uVar17] = lVar10;
  if (1 < uVar16) {
    local_88[0] = *(ulong *)((long)pvVar15 + uVar16 * 8 + -0x10);
  }
  uVar11 = uVar16 - 1;
  local_88[1] = *(undefined8 *)((long)pvVar15 + uVar11 * 8);
  local_88[2] = *(undefined8 *)((long)pvVar15 + uVar16 * 8);
  lVar9 = (uVar16 - uVar12) + -1;
  lVar10 = local_b8[lVar9] + 1;
  local_b8[lVar9] = lVar10;
  uVar16 = (ulong)local_c0._2_2_;
  do {
    local_b8[lVar9] = lVar10 + -1;
    if ((int)uVar16 == 0) {
      puVar7 = calloc(1,8);
      puVar6 = local_c8;
      if (puVar7 == (undefined8 *)0x0) goto LAB_00b80304;
      if (local_c8 != (undefined8 *)0x0) {
        memcpy(puVar7,local_c8,uVar16 << 3);
        mbedtls_zeroize_and_free(puVar6,uVar16 << 3);
      }
      sVar20 = 8;
      local_c0 = CONCAT22(1,(short)local_c0);
      local_c8 = puVar7;
    }
    else {
      sVar20 = uVar16 << 3;
    }
    memset(local_c8,0,sVar20);
    *local_c8 = 0;
    local_c0 = CONCAT22(local_c0._2_2_,1);
    if (uVar12 == 0) {
      uVar14 = 0;
    }
    else {
      uVar14 = *(undefined8 *)((long)local_a8 + (uVar17 - 2) * 8);
    }
    *local_c8 = uVar14;
    local_c8[1] = *(undefined8 *)((long)local_a8 + uVar12 * 8);
    iVar5 = mbedtls_mpi_mul_int(&local_c8,&local_c8,local_b8[lVar9]);
    uVar3 = local_90;
    if (iVar5 != 0) goto joined_r0x00b8031c;
    uVar16 = (ulong)local_c0._2_2_;
    uVar21 = uVar16;
    do {
      uVar13 = uVar21;
      uVar21 = uVar13 - 1;
      if (uVar21 == 0xffffffffffffffff) {
        uVar13 = 0;
        break;
      }
    } while (local_c8[uVar21] == 0);
    lVar10 = 2;
    do {
      lVar18 = lVar10;
      if (lVar18 == -1) {
        uVar21 = 0;
        if (uVar13 == 0) goto LAB_00b80084;
        goto LAB_00b80028;
      }
      lVar10 = lVar18 + -1;
    } while (local_88[lVar18] == 0);
    uVar21 = lVar18 + 1;
    if (uVar21 == 0 && uVar13 == 0) break;
LAB_00b80028:
    if (uVar21 < uVar13) {
      if ((short)local_c0 < 1) break;
    }
    else {
      if (uVar13 < uVar21) break;
      iVar5 = (int)(short)local_c0;
      if ((short)local_c0 < 0) break;
      do {
        if (uVar13 == 0) goto LAB_00b80084;
        lVar10 = uVar13 - 1;
        lVar18 = uVar13 - 1;
        uVar13 = uVar13 - 1;
        if (local_88[lVar18] < (ulong)local_c8[lVar10]) goto LAB_00b8007c;
      } while (local_88[lVar18] <= (ulong)local_c8[lVar10]);
      iVar5 = -(int)(short)local_c0;
LAB_00b8007c:
      if (iVar5 < 1) break;
    }
    lVar10 = local_b8[lVar9];
  } while( true );
LAB_00b80084:
  iVar5 = mbedtls_mpi_mul_int(&local_c8,&local_a8,local_b8[lVar9]);
  uVar3 = local_90;
  if (iVar5 != 0) goto joined_r0x00b8031c;
  lVar18 = lVar9 * 0x40;
  lVar10 = mbedtls_mpi_core_bitlen(local_c8,local_c0._2_2_);
  uVar21 = (ulong)local_c0._2_2_;
  uVar16 = lVar10 + lVar18;
  if (uVar21 << 6 < uVar16) {
    uVar13 = uVar16 >> 6;
    if ((uVar16 & 0x3f) != 0) {
      uVar13 = uVar13 + 1;
    }
    if (10000 < uVar13) goto LAB_00b80304;
    if (uVar21 < uVar13) {
      puVar7 = calloc(uVar13,8);
      puVar6 = local_c8;
      if (puVar7 == (undefined8 *)0x0) goto LAB_00b80304;
      if (local_c8 != (undefined8 *)0x0) {
        memcpy(puVar7,local_c8,uVar21 << 3);
        mbedtls_zeroize_and_free(puVar6,uVar21 << 3);
      }
      uVar21 = uVar13 & 0xffff;
      local_c0 = CONCAT22((short)uVar13,(short)local_c0);
      local_c8 = puVar7;
    }
  }
  mbedtls_mpi_core_shift_l(local_c8,uVar21,lVar18);
  iVar5 = FUN_00b7f304(&local_98,&local_98,&local_c8,0xffffffff);
  uVar3 = local_90;
  if (iVar5 != 0) goto joined_r0x00b8031c;
  uVar16 = (ulong)local_90._2_2_;
  do {
    if (uVar16 == 0) goto LAB_00b8026c;
    lVar10 = uVar16 * 8;
    uVar16 = uVar16 - 1;
  } while (*(long *)((long)local_98 + lVar10 + -8) == 0);
  if ((short)local_90 < 0) {
    iVar5 = mbedtls_mpi_copy(&local_c8,&local_a8);
    uVar3 = local_90;
    if (iVar5 != 0) goto joined_r0x00b8031c;
    lVar10 = mbedtls_mpi_core_bitlen(local_c8,local_c0._2_2_);
    uVar21 = (ulong)local_c0._2_2_;
    uVar16 = lVar10 + lVar18;
    if (uVar21 << 6 < uVar16) {
      uVar13 = uVar16 >> 6;
      if ((uVar16 & 0x3f) != 0) {
        uVar13 = uVar13 + 1;
      }
      if (10000 < uVar13) goto LAB_00b80304;
      if (uVar21 < uVar13) {
        puVar7 = calloc(uVar13,8);
        puVar6 = local_c8;
        if (puVar7 == (undefined8 *)0x0) goto LAB_00b80304;
        if (local_c8 != (undefined8 *)0x0) {
          memcpy(puVar7,local_c8,uVar21 << 3);
          mbedtls_zeroize_and_free(puVar6,uVar21 << 3);
        }
        uVar21 = uVar13 & 0xffff;
        local_c0 = CONCAT22((short)uVar13,(short)local_c0);
        local_c8 = puVar7;
      }
    }
    mbedtls_mpi_core_shift_l(local_c8,uVar21,lVar18);
    iVar5 = FUN_00b7f304(&local_98,&local_98,&local_c8,1);
    uVar3 = local_90;
    if (iVar5 != 0) goto joined_r0x00b8031c;
    local_b8[lVar9] = local_b8[lVar9] + -1;
  }
LAB_00b8026c:
  uVar16 = uVar11;
  if (uVar11 <= uVar12) goto LAB_00b80278;
  goto LAB_00b7fe30;
LAB_00b80278:
  if (param_1 != (undefined8 *)0x0) {
    iVar5 = mbedtls_mpi_copy(param_1,&local_b8);
    uVar3 = local_90;
    if (iVar5 != 0) goto joined_r0x00b8031c;
    *(short *)(param_1 + 1) = (short)param_4[1] * (short)param_3[1];
  }
  if (param_2 == (long *)0x0) {
    iVar5 = 0;
    uVar3 = local_90;
  }
  else {
    if (local_90._2_2_ != 0) {
      mbedtls_mpi_core_shift_r(local_98,local_90._2_2_,uVar19);
    }
    local_90 = CONCAT22(local_90._2_2_,(short)param_3[1]);
    iVar5 = mbedtls_mpi_copy(param_2,&local_98);
    uVar3 = local_90;
    if (iVar5 == 0) {
      uVar11 = (ulong)*(ushort *)((long)param_2 + 10);
      do {
        uVar11 = uVar11 - 1;
        if (uVar11 == 0xffffffffffffffff) goto LAB_00b80328;
      } while (*(long *)(*param_2 + uVar11 * 8) == 0);
      iVar5 = 0;
      if ((short)param_2[1] == 0) {
LAB_00b80328:
        iVar5 = 0;
        *(undefined2 *)(param_2 + 1) = 1;
      }
    }
  }
  goto joined_r0x00b8031c;
}

