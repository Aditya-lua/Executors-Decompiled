/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b923c4
 */

/* WARNING: Removing unreachable block (ram,0x00b92a0c) */

int FUN_00b923c4(long param_1,long param_2,undefined8 param_3,long param_4,long param_5,
                undefined8 param_6)

{
  uint uVar1;
  long *plVar2;
  uint uVar3;
  byte bVar4;
  uint uVar5;
  byte bVar6;
  byte bVar7;
  long lVar8;
  bool bVar9;
  bool bVar10;
  int iVar11;
  int iVar12;
  int iVar13;
  undefined4 uVar14;
  long lVar15;
  byte bVar16;
  ulong uVar17;
  long lVar18;
  byte bVar19;
  ulong uVar20;
  ulong uVar21;
  uint uVar22;
  long *plVar23;
  ulong uVar24;
  ulong uVar25;
  ulong uVar26;
  ulong uVar27;
  ulong uVar28;
  void *__ptr;
  void *pvVar29;
  long lVar30;
  long lVar31;
  long local_240;
  undefined1 auStack_1f8 [16];
  undefined1 auStack_1e8 [16];
  undefined1 auStack_1d8 [16];
  undefined1 auStack_1c8 [16];
  undefined1 auStack_1b8 [8];
  short local_1b0;
  undefined1 auStack_1a8 [8];
  short local_1a0;
  undefined1 auStack_198 [16];
  undefined1 auStack_188 [8];
  short local_180;
  byte bStack_179;
  undefined8 local_178;
  long alStack_170 [4];
  undefined8 uStack_150;
  undefined8 local_148;
  long local_70;
  
  lVar8 = tpidr_el0;
  local_70 = *(long *)(lVar8 + 0x28);
  iVar11 = mbedtls_ecp_check_privkey(param_1,param_3);
  if ((iVar11 != 0) || (iVar11 = mbedtls_ecp_check_pubkey(param_1,param_4), iVar11 != 0))
  goto LAB_00b9242c;
  if (*(long *)(param_1 + 0x38) == 0) {
    iVar11 = -0x4f80;
    goto LAB_00b9242c;
  }
  if (*(long *)(param_1 + 0x48) == 0) {
    mbedtls_mpi_init(&local_178);
    plVar23 = alStack_170 + 1;
    mbedtls_mpi_init(plVar23);
    plVar2 = alStack_170 + 3;
    mbedtls_mpi_init(plVar2);
    mbedtls_mpi_init(auStack_1c8);
    mbedtls_mpi_init(auStack_1b8);
    mbedtls_mpi_init(auStack_1a8);
    mbedtls_mpi_init(auStack_198);
    mbedtls_mpi_init(auStack_188);
    if (param_5 == 0) {
      iVar11 = -0x4f80;
      goto LAB_00b9242c;
    }
    iVar11 = mbedtls_mpi_copy(auStack_1c8,param_4);
    if ((((iVar11 == 0) && (iVar11 = mbedtls_mpi_copy(&local_178,param_4), iVar11 == 0)) &&
        (iVar11 = mbedtls_mpi_copy(plVar23,param_4 + 0x10), iVar11 == 0)) &&
       ((iVar11 = mbedtls_mpi_copy(plVar2,param_4 + 0x20), iVar11 == 0 &&
        (iVar11 = mbedtls_mpi_lset(param_2,1), iVar11 == 0)))) {
      lVar15 = param_2 + 0x20;
      iVar11 = mbedtls_mpi_lset(lVar15,0);
      if (iVar11 == 0) {
        mbedtls_mpi_free(param_2 + 0x10);
        lVar30 = param_1 + 8;
        do {
          iVar11 = mbedtls_mpi_cmp_mpi(&local_178,lVar30);
          if (iVar11 < 0) {
            mbedtls_mpi_init(auStack_1f8);
            iVar12 = mbedtls_mpi_random(auStack_1f8,2,lVar30,param_5,param_6);
            if ((iVar12 == 0) &&
               (iVar12 = FUN_00b953d4(param_1,&local_178,&local_178,auStack_1f8), iVar12 == 0)) {
              iVar12 = FUN_00b953d4(param_1,plVar2,plVar2,auStack_1f8);
            }
            mbedtls_mpi_free(auStack_1f8);
            iVar11 = -0x4d00;
            if (iVar12 != -0xe) {
              iVar11 = iVar12;
            }
            if (iVar11 == 0) {
              local_240 = *(long *)(param_1 + 0x80) + 1;
              goto LAB_00b92fc0;
            }
            break;
          }
          iVar11 = mbedtls_mpi_sub_abs(&local_178,&local_178,lVar30);
        } while (iVar11 == 0);
      }
    }
LAB_00b934bc:
    mbedtls_mpi_free(&local_178);
    mbedtls_mpi_free(plVar23);
    mbedtls_mpi_free(plVar2);
    mbedtls_mpi_free(auStack_1c8);
    mbedtls_mpi_free(auStack_1b8);
    mbedtls_mpi_free(auStack_1a8);
    mbedtls_mpi_free(auStack_198);
    mbedtls_mpi_free(auStack_188);
    if (iVar11 != 0) goto LAB_00b9242c;
    if ((*(long *)(param_1 + 0x38) == 0) || (*(long *)(param_1 + 0x48) == 0)) {
      iVar11 = 0;
      goto LAB_00b9242c;
    }
  }
  iVar11 = mbedtls_mpi_cmp_mpi(param_4 + 0x10,param_1 + 0x48);
  bVar9 = false;
  if (iVar11 == 0) {
    iVar11 = mbedtls_mpi_cmp_mpi(param_4,param_1 + 0x38);
    bVar9 = iVar11 == 0;
  }
  uVar17 = *(ulong *)(param_1 + 0x80);
  iVar11 = 4;
  if (0x17f < uVar17) {
    iVar11 = 5;
  }
  if (bVar9) {
    uVar22 = iVar11 + 1;
    if (*(long *)(param_1 + 0xb0) == 0) {
      bVar10 = true;
    }
    else {
      bVar10 = *(long *)(param_1 + 0xb8) != 0;
    }
    if ((iVar11 != 3) && (bVar10)) goto LAB_00b92630;
  }
  else {
LAB_00b92630:
    uVar22 = 4;
  }
  if (uVar17 <= (byte)uVar22) {
    uVar22 = 2;
  }
  uVar20 = (ulong)uVar22;
  uVar22 = uVar22 - 1;
  uVar24 = (uVar17 + uVar20) - 1;
  uVar5 = 1 << (ulong)(uVar22 & 0x1f);
  uVar17 = 0;
  if (uVar20 != 0) {
    uVar17 = uVar24 / uVar20;
  }
  if ((bVar9) && (__ptr = *(void **)(param_1 + 0xb0), __ptr != (void *)0x0)) {
LAB_00b927a0:
    mbedtls_mpi_init(auStack_1b8);
    mbedtls_mpi_init(auStack_1f8);
    iVar11 = mbedtls_mpi_get_bit(param_1 + 0x68,0);
    if (iVar11 == 1) {
      iVar12 = mbedtls_mpi_get_bit(param_3,0);
      iVar11 = mbedtls_mpi_copy(auStack_1b8,param_3);
      if (((iVar11 == 0) &&
          (iVar11 = mbedtls_mpi_sub_mpi(auStack_1f8,param_1 + 0x68,param_3), iVar11 == 0)) &&
         ((iVar11 = mbedtls_mpi_safe_cond_assign(auStack_1b8,auStack_1f8,iVar12 == 0), iVar11 == 0
          && (memset(&local_178,0,uVar17 + 1), uVar20 <= uVar24)))) {
        uVar28 = 0;
        do {
          uVar25 = 0;
          do {
            iVar11 = mbedtls_mpi_get_bit(auStack_1b8,uVar28 + uVar25 * uVar17);
            uVar3 = (uint)uVar25;
            uVar25 = uVar25 + 1;
            *(byte *)((long)alStack_170 + (uVar28 - 8)) =
                 *(byte *)((long)alStack_170 + (uVar28 - 8)) |
                 (byte)(iVar11 << (ulong)(uVar3 & 0x1f));
          } while (uVar20 != uVar25);
          uVar28 = uVar28 + 1;
        } while (uVar28 != uVar17);
        bVar16 = 0;
        lVar15 = 0;
        bVar19 = (byte)local_178;
        do {
          bVar4 = *(byte *)((long)alStack_170 + lVar15 + -7);
          uVar28 = lVar15 + 2;
          iVar11 = 0;
          bVar7 = bVar4 ^ bVar16 ^ 0xff;
          bVar6 = (bVar7 & 1) * bVar19;
          bVar7 = bVar19 | bVar7 << 7;
          bVar19 = bVar6 ^ bVar4 ^ bVar16;
          bVar16 = bVar6 & (bVar4 ^ bVar16) | bVar4 & bVar16;
          *(byte *)((long)alStack_170 + lVar15 + -8) = bVar7;
          *(byte *)((long)alStack_170 + lVar15 + -7) = bVar19;
          lVar15 = lVar15 + 1;
        } while (uVar28 <= uVar17);
      }
      mbedtls_mpi_free(auStack_1f8);
      mbedtls_mpi_free(auStack_1b8);
      if (iVar11 == 0) {
        mbedtls_mpi_init(auStack_1f8);
        mbedtls_mpi_init();
        mbedtls_mpi_init();
        mbedtls_mpi_init(auStack_1b8);
        mbedtls_mpi_init(auStack_1a8);
        mbedtls_mpi_init(auStack_198);
        mbedtls_mpi_init(auStack_188);
        bVar19 = *(byte *)((long)alStack_170 + (uVar17 - 8));
        if ((uVar5 & 0xff) != 0) {
          uVar28 = 0;
          pvVar29 = __ptr;
          do {
            bVar9 = (bVar19 >> 1 & 0x3f) == uVar28;
            iVar11 = mbedtls_mpi_safe_cond_assign(param_2,pvVar29,bVar9);
            if ((iVar11 != 0) ||
               (iVar11 = mbedtls_mpi_safe_cond_assign(param_2 + 0x10,(long)pvVar29 + 0x10,bVar9),
               iVar11 != 0)) goto LAB_00b92dc8;
            uVar28 = uVar28 + 1;
            pvVar29 = (void *)((long)pvVar29 + 0x30);
          } while (uVar28 < (uVar5 & 0xff));
        }
        lVar15 = param_2 + 0x10;
        mbedtls_mpi_init(auStack_1c8);
        iVar13 = mbedtls_mpi_cmp_int(lVar15,0);
        iVar11 = mbedtls_mpi_sub_mpi(auStack_1c8,param_1 + 8,lVar15);
        if (iVar11 == 0) {
          iVar11 = mbedtls_mpi_safe_cond_assign(lVar15,auStack_1c8,iVar13 != 0 & bVar19 >> 7);
        }
        mbedtls_mpi_free(auStack_1c8);
        if ((iVar11 == 0) && (iVar11 = mbedtls_mpi_lset(param_2 + 0x20,1), iVar11 == 0)) {
          if (param_5 == 0) {
            iVar11 = 0;
            if (uVar20 <= uVar24) goto LAB_00b92c8c;
          }
          else {
            iVar11 = FUN_00b95cc4(param_1,param_2,param_5,param_6);
            if ((uVar20 <= uVar24) && (iVar11 == 0)) {
LAB_00b92c8c:
              while (iVar11 = FUN_00b954dc(param_1,param_2,param_2,auStack_1b8), iVar11 == 0) {
                bVar19 = auStack_188[uVar17 + 0xf];
                if ((uVar5 & 0xff) != 0) {
                  uVar20 = 0;
                  pvVar29 = __ptr;
                  do {
                    bVar9 = (bVar19 >> 1 & 0x3f) == uVar20;
                    iVar11 = mbedtls_mpi_safe_cond_assign(auStack_1f8,pvVar29,bVar9);
                    if ((iVar11 != 0) ||
                       (iVar11 = mbedtls_mpi_safe_cond_assign
                                           (auStack_1e8,(long)pvVar29 + 0x10,bVar9), iVar11 != 0))
                    goto LAB_00b92dc8;
                    uVar20 = uVar20 + 1;
                    pvVar29 = (void *)((long)pvVar29 + 0x30);
                  } while (uVar20 < (uVar5 & 0xff));
                }
                mbedtls_mpi_init(auStack_1c8);
                iVar13 = mbedtls_mpi_cmp_int(auStack_1e8,0);
                iVar11 = mbedtls_mpi_sub_mpi(auStack_1c8,param_1 + 8,auStack_1e8);
                if (iVar11 == 0) {
                  iVar11 = mbedtls_mpi_safe_cond_assign
                                     (auStack_1e8,auStack_1c8,iVar13 != 0 & bVar19 >> 7);
                }
                mbedtls_mpi_free(auStack_1c8);
                if ((((iVar11 != 0) || (iVar11 = mbedtls_mpi_lset(auStack_1d8,1), iVar11 != 0)) ||
                    (iVar11 = FUN_00b93970(param_1,param_2,param_2,auStack_1f8,auStack_1b8),
                    uVar17 - 1 == 0)) || (uVar17 = uVar17 - 1, iVar11 != 0)) break;
              }
            }
          }
        }
LAB_00b92dc8:
        mbedtls_mpi_free(auStack_1f8);
        mbedtls_mpi_free(auStack_1e8);
        mbedtls_mpi_free(auStack_1d8);
        mbedtls_mpi_free(auStack_1b8);
        mbedtls_mpi_free(auStack_1a8);
        mbedtls_mpi_free(auStack_198);
        mbedtls_mpi_free(auStack_188);
        if (iVar11 == 0) {
          mbedtls_mpi_init(auStack_1b8);
          lVar15 = param_2 + 0x10;
          iVar13 = mbedtls_mpi_cmp_int(lVar15,0);
          iVar11 = mbedtls_mpi_sub_mpi(auStack_1b8,param_1 + 8,lVar15);
          if (iVar11 == 0) {
            iVar11 = mbedtls_mpi_safe_cond_assign(lVar15,auStack_1b8,iVar12 == 0 && iVar13 != 0);
          }
          mbedtls_mpi_free(auStack_1b8);
          if ((iVar11 == 0) &&
             ((param_5 == 0 || (iVar11 = FUN_00b95cc4(param_1,param_2,param_5,param_6), iVar11 == 0)
              ))) {
            iVar11 = FUN_00b93e20(param_1,param_2);
          }
        }
      }
    }
    else {
      iVar11 = -0x4f80;
    }
joined_r0x00b929ec:
    if ((__ptr != (void *)0x0) && (__ptr != *(void **)(param_1 + 0xb0))) {
      if (uVar22 < 8) {
        uVar17 = 0;
        do {
          pvVar29 = (void *)((long)__ptr + (uVar17 & 0xff) * 0x30);
          mbedtls_mpi_free(pvVar29);
          mbedtls_mpi_free((long)pvVar29 + 0x10);
          mbedtls_mpi_free((long)pvVar29 + 0x20);
          uVar22 = (int)uVar17 + 1;
          uVar17 = (ulong)uVar22;
        } while ((uVar22 & 0xff) < (uVar5 & 0xff));
      }
      free(__ptr);
    }
  }
  else {
    uVar3 = uVar5 & 0xff;
    uVar28 = (ulong)uVar3;
    __ptr = calloc(uVar28,0x30);
    if (__ptr != (void *)0x0) {
      uVar25 = 0;
      do {
        pvVar29 = (void *)((long)__ptr + (uVar25 & 0xff) * 0x30);
        mbedtls_mpi_init(pvVar29);
        mbedtls_mpi_init((long)pvVar29 + 0x10);
        mbedtls_mpi_init((long)pvVar29 + 0x20);
        uVar1 = (int)uVar25 + 1;
        uVar25 = (ulong)uVar1;
      } while ((uVar1 & 0xff) < uVar3);
      uStack_150 = 0;
      alStack_170[3] = 0;
      local_148 = 0;
      alStack_170[2] = 0;
      alStack_170[1] = 0;
      alStack_170[0] = 0;
      local_178 = 0;
      mbedtls_mpi_init(auStack_1b8);
      mbedtls_mpi_init(auStack_1a8);
      mbedtls_mpi_init(auStack_198);
      mbedtls_mpi_init(auStack_188);
      iVar11 = mbedtls_mpi_copy(__ptr,param_4);
      if (((iVar11 == 0) &&
          (iVar11 = mbedtls_mpi_copy((long)__ptr + 0x10,param_4 + 0x10), iVar11 == 0)) &&
         (iVar11 = mbedtls_mpi_copy((long)__ptr + 0x20,param_4 + 0x20), iVar11 == 0)) {
        if (uVar17 * (long)(int)uVar22 != 0) {
          uVar25 = 0;
          do {
            uVar27 = 0;
            if (uVar17 != 0) {
              uVar27 = uVar25 / uVar17;
            }
            uVar1 = 1 << (ulong)((uint)uVar27 & 0x1f) & 0xff;
            uVar26 = (ulong)uVar1;
            pvVar29 = (void *)((long)__ptr + uVar26 * 0x30);
            if (uVar25 == uVar27 * uVar17) {
              uVar27 = (ulong)(uVar1 >> 1);
              iVar11 = mbedtls_mpi_copy(pvVar29,(void *)((long)__ptr + uVar27 * 0x30));
              if (((iVar11 != 0) ||
                  (iVar11 = mbedtls_mpi_copy((long)__ptr + uVar26 * 0x30 + 0x10,
                                             (long)__ptr + uVar27 * 0x30 + 0x10), iVar11 != 0)) ||
                 (iVar11 = mbedtls_mpi_copy((long)__ptr + uVar26 * 0x30 + 0x20,
                                            (long)__ptr + uVar27 * 0x30 + 0x20), iVar11 != 0))
              goto LAB_00b92768;
            }
            iVar11 = FUN_00b954dc(param_1,pvVar29,pvVar29,auStack_1b8);
            if (iVar11 != 0) goto LAB_00b92768;
            uVar25 = uVar25 + 1;
          } while (uVar25 < uVar17 * (long)(int)uVar22);
        }
        lVar15 = 0;
        if (1 < uVar3) {
          uVar25 = 1;
          lVar30 = 0;
          do {
            lVar18 = uVar25 * 0x30;
            lVar15 = lVar30 + 1;
            uVar1 = ((uint)uVar25 & 0x7f) << 1;
            uVar25 = (ulong)uVar1;
            alStack_170[lVar30 + -1] = (long)((long)__ptr + lVar18);
            lVar30 = lVar15;
          } while (uVar1 < uVar3);
        }
        iVar11 = FUN_00b95a00(param_1,&local_178,lVar15);
        if (iVar11 == 0) {
          uVar25 = 0;
          if (1 < uVar3) {
            uVar25 = 1;
            do {
              uVar26 = uVar25 & 0xff;
              uVar27 = ~uVar26;
              lVar18 = (uVar26 + (uVar25 & 0xff) * 2) * 0x10;
              lVar15 = (long)__ptr + uVar26 * 0x60 + -0x30;
              lVar30 = (long)__ptr + lVar18 + -0x30;
              while (uVar27 = uVar27 + 1, uVar27 != 0) {
                iVar11 = FUN_00b93970(param_1,lVar15,lVar30,(void *)((long)__ptr + lVar18),
                                      auStack_1b8);
                lVar15 = lVar15 + -0x30;
                lVar30 = lVar30 + -0x30;
                if (iVar11 != 0) goto LAB_00b92768;
              }
              uVar1 = (int)uVar25 << 1;
              uVar25 = (ulong)uVar1;
            } while ((uVar1 & 0xfe) < uVar3);
            uVar25 = uVar28 - 1;
            if (uVar25 < 4) {
              uVar21 = 0;
              uVar27 = 1;
            }
            else {
              lVar30 = 1;
              lVar15 = 0;
              uVar1 = uVar5 - 1 & 3;
              uVar21 = uVar25 - uVar1;
              plVar23 = alStack_170 + 1;
              uVar27 = uVar21 + 1;
              uVar26 = uVar21;
              do {
                lVar18 = (long)__ptr + lVar15 * 0x30 + 0x30;
                lVar31 = (long)__ptr + lVar30 * 0x30 + 0x30;
                lVar15 = lVar15 + 4;
                lVar30 = lVar30 + 4;
                uVar26 = uVar26 - 4;
                plVar23[-1] = lVar31;
                plVar23[-2] = lVar18;
                plVar23[1] = lVar31 + 0x60;
                *plVar23 = lVar18 + 0x60;
                plVar23 = plVar23 + 4;
              } while (uVar26 != 0);
              if (uVar1 == 0) goto LAB_00b93478;
            }
            do {
              uVar26 = uVar27 + 1;
              alStack_170[uVar21 - 1] = (long)__ptr + uVar21 * 0x30 + 0x30;
              uVar21 = uVar27;
              uVar27 = uVar26;
            } while (uVar28 != uVar26);
          }
LAB_00b93478:
          iVar11 = FUN_00b95a00(param_1,&local_178,uVar25);
          if (iVar11 == 0) {
            uVar25 = 0;
            do {
              mbedtls_mpi_free((long)__ptr + (uVar25 & 0xff) * 0x30 + 0x20);
              uVar1 = (int)uVar25 + 1;
              uVar25 = (ulong)uVar1;
              iVar11 = 0;
            } while ((uVar1 & 0xff) < uVar3);
          }
        }
      }
LAB_00b92768:
      mbedtls_mpi_free(auStack_1b8);
      mbedtls_mpi_free(auStack_1a8);
      mbedtls_mpi_free(auStack_198);
      mbedtls_mpi_free(auStack_188);
      if (iVar11 == 0) {
        if (bVar9) {
          *(void **)(param_1 + 0xb0) = __ptr;
          *(ulong *)(param_1 + 0xb8) = uVar28;
        }
        goto LAB_00b927a0;
      }
      goto joined_r0x00b929ec;
    }
    iVar11 = -0x4d80;
  }
  if ((param_2 != 0) && (iVar11 != 0)) {
    mbedtls_mpi_free(param_2);
    mbedtls_mpi_free(param_2 + 0x10);
    mbedtls_mpi_free(param_2 + 0x20);
  }
LAB_00b9242c:
  if (*(long *)(lVar8 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar11;
LAB_00b92fc0:
  if (local_240 == 0) {
    mbedtls_mpi_init(auStack_1f8);
    iVar12 = mbedtls_mpi_random(auStack_1f8,2,lVar30,param_5,param_6);
    if ((iVar12 == 0) && (iVar12 = FUN_00b953d4(param_1,param_2,param_2,auStack_1f8), iVar12 == 0))
    {
      iVar12 = FUN_00b953d4(param_1,lVar15,lVar15,auStack_1f8);
    }
    mbedtls_mpi_free(auStack_1f8);
    iVar11 = -0x4d00;
    if (iVar12 != -0xe) {
      iVar11 = iVar12;
    }
    if (((iVar11 == 0) && (iVar11 = mbedtls_mpi_inv_mod(lVar15,lVar15,lVar30), iVar11 == 0)) &&
       (iVar11 = FUN_00b953d4(param_1,param_2,param_2,lVar15), iVar11 == 0)) {
      iVar11 = mbedtls_mpi_lset(lVar15,1);
    }
    goto LAB_00b934bc;
  }
  local_240 = local_240 + -1;
  uVar14 = mbedtls_mpi_get_bit(param_3);
  iVar11 = mbedtls_mpi_safe_cond_swap(param_2,&local_178);
  if ((iVar11 != 0) || (iVar11 = mbedtls_mpi_safe_cond_swap(lVar15,plVar2,uVar14), iVar11 != 0))
  goto LAB_00b934bc;
  iVar11 = mbedtls_mpi_add_mpi(auStack_1b8,param_2,lVar15);
  while( true ) {
    if (iVar11 != 0) goto LAB_00b934bc;
    iVar11 = mbedtls_mpi_cmp_mpi(auStack_1b8,lVar30);
    if (iVar11 < 0) break;
    iVar11 = mbedtls_mpi_sub_abs(auStack_1b8,auStack_1b8,lVar30);
  }
  iVar11 = mbedtls_mpi_sub_mpi(auStack_1a8,param_2,lVar15);
  while( true ) {
    if (iVar11 != 0) goto LAB_00b934bc;
    if ((-1 < local_1a0) || (iVar11 = mbedtls_mpi_cmp_int(auStack_1a8,0), iVar11 == 0)) break;
    iVar11 = mbedtls_mpi_add_mpi(auStack_1a8,auStack_1a8,lVar30);
  }
  iVar11 = mbedtls_mpi_add_mpi(auStack_198,&local_178,plVar2);
  while( true ) {
    if (iVar11 != 0) goto LAB_00b934bc;
    iVar11 = mbedtls_mpi_cmp_mpi(auStack_198,lVar30);
    if (iVar11 < 0) break;
    iVar11 = mbedtls_mpi_sub_abs(auStack_198,auStack_198,lVar30);
  }
  iVar11 = mbedtls_mpi_sub_mpi(auStack_188,&local_178,plVar2);
  while( true ) {
    if (iVar11 != 0) goto LAB_00b934bc;
    if ((-1 < local_180) || (iVar11 = mbedtls_mpi_cmp_int(auStack_188,0), iVar11 == 0)) break;
    iVar11 = mbedtls_mpi_add_mpi(auStack_188,auStack_188,lVar30);
  }
  iVar11 = FUN_00b953d4(param_1,auStack_188,auStack_188,auStack_1b8);
  if (((iVar11 != 0) ||
      (((iVar11 = FUN_00b953d4(param_1,auStack_198,auStack_198,auStack_1a8), iVar11 != 0 ||
        (iVar11 = FUN_00b953d4(param_1,auStack_1b8,auStack_1b8,auStack_1b8), iVar11 != 0)) ||
       (iVar11 = FUN_00b953d4(param_1,auStack_1a8,auStack_1a8,auStack_1a8), iVar11 != 0)))) ||
     (iVar11 = FUN_00b953d4(param_1,param_2,auStack_1b8,auStack_1a8), iVar11 != 0))
  goto LAB_00b934bc;
  iVar11 = mbedtls_mpi_sub_mpi(auStack_1b8,auStack_1b8,auStack_1a8);
  while( true ) {
    if (iVar11 != 0) goto LAB_00b934bc;
    if ((-1 < local_1b0) || (iVar11 = mbedtls_mpi_cmp_int(auStack_1b8,0), iVar11 == 0)) break;
    iVar11 = mbedtls_mpi_add_mpi(auStack_1b8,auStack_1b8,lVar30);
  }
  iVar11 = FUN_00b953d4(param_1,lVar15,param_1 + 0x18,auStack_1b8);
  if (iVar11 != 0) goto LAB_00b934bc;
  iVar11 = mbedtls_mpi_add_mpi(lVar15,auStack_1a8,lVar15);
  while( true ) {
    if (iVar11 != 0) goto LAB_00b934bc;
    iVar11 = mbedtls_mpi_cmp_mpi(lVar15,lVar30);
    if (iVar11 < 0) break;
    iVar11 = mbedtls_mpi_sub_abs(lVar15,lVar15,lVar30);
  }
  iVar11 = mbedtls_mpi_add_mpi(&local_178,auStack_188,auStack_198);
  while( true ) {
    if (iVar11 != 0) goto LAB_00b934bc;
    iVar11 = mbedtls_mpi_cmp_mpi(&local_178,lVar30);
    if (iVar11 < 0) break;
    iVar11 = mbedtls_mpi_sub_abs(&local_178,&local_178,lVar30);
  }
  iVar11 = FUN_00b953d4(param_1,&local_178,&local_178,&local_178);
  if (iVar11 != 0) goto LAB_00b934bc;
  iVar11 = mbedtls_mpi_sub_mpi(plVar2,auStack_188,auStack_198);
  while( true ) {
    if (iVar11 != 0) goto LAB_00b934bc;
    if ((-1 < (short)uStack_150) || (iVar11 = mbedtls_mpi_cmp_int(plVar2,0), iVar11 == 0)) break;
    iVar11 = mbedtls_mpi_add_mpi(plVar2,plVar2,lVar30);
  }
  iVar11 = FUN_00b953d4(param_1,plVar2,plVar2,plVar2);
  if ((iVar11 != 0) ||
     ((((iVar11 = FUN_00b953d4(param_1,plVar2,auStack_1c8,plVar2), iVar11 != 0 ||
        (iVar11 = FUN_00b953d4(param_1,lVar15,auStack_1b8,lVar15), iVar11 != 0)) ||
       (iVar11 = mbedtls_mpi_safe_cond_swap(param_2,&local_178,uVar14), iVar11 != 0)) ||
      (iVar11 = mbedtls_mpi_safe_cond_swap(lVar15,plVar2,uVar14), iVar11 != 0)))) goto LAB_00b934bc;
  goto LAB_00b92fc0;
}

