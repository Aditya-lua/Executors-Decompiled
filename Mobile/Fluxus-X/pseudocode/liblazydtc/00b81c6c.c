/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b81c6c
 */

int FUN_00b81c6c(long param_1,ulong param_2,undefined8 param_3,undefined8 param_4)

{
  ulong *puVar1;
  ushort uVar2;
  long lVar3;
  short sVar4;
  undefined4 uVar5;
  int iVar6;
  void *pvVar7;
  ulong uVar8;
  long lVar9;
  long lVar10;
  ulong uVar11;
  long lVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  uint uVar17;
  ulong local_d8;
  long local_d0;
  undefined4 local_c8;
  void *local_c0;
  undefined4 local_b8;
  long local_b0;
  undefined4 local_a8;
  long local_a0;
  undefined4 local_98;
  long local_90;
  undefined4 local_88;
  undefined8 *local_80;
  undefined4 local_78;
  undefined8 local_70;
  long local_68;
  
  lVar3 = tpidr_el0;
  local_68 = *(long *)(lVar3 + 0x28);
  local_88 = 1;
  local_98 = 1;
  local_a8 = 1;
  local_b8._0_2_ = 1;
  local_b8._2_2_ = 0;
  local_c8 = 1;
  local_70 = 1;
  local_78 = 0x10001;
  local_80 = &local_70;
  local_90 = 0;
  local_a0 = 0;
  local_b0 = 0;
  local_c0 = (void *)0x0;
  local_d0 = 0;
  iVar6 = FUN_00b7f304(&local_90,param_1,&local_80,0xffffffff);
  uVar5 = local_88;
  if (iVar6 == 0) {
    if ((ulong)local_88._2_2_ != 0) {
      lVar9 = 0;
      uVar13 = 0;
      do {
        uVar14 = *(ulong *)(local_90 + uVar13 * 8);
        if (uVar14 != 0) {
          uVar13 = (uVar14 & 0xaaaaaaaaaaaaaaaa) >> 1 | (uVar14 & 0x5555555555555555) << 1;
          uVar13 = (uVar13 & 0xcccccccccccccccc) >> 2 | (uVar13 & 0x3333333333333333) << 2;
          uVar13 = (uVar13 & 0xf0f0f0f0f0f0f0f0) >> 4 | (uVar13 & 0xf0f0f0f0f0f0f0f) << 4;
          uVar13 = (uVar13 & 0xff00ff00ff00ff00) >> 8 | (uVar13 & 0xff00ff00ff00ff) << 8;
          uVar13 = (uVar13 & 0xffff0000ffff0000) >> 0x10 | (uVar13 & 0xffff0000ffff) << 0x10;
          uVar13 = LZCOUNT(uVar13 >> 0x20 | uVar13 << 0x20) + lVar9;
          goto LAB_00b81d44;
        }
        uVar13 = uVar13 + 1;
        lVar9 = lVar9 + 0x40;
      } while (uVar13 < local_88._2_2_);
    }
    uVar13 = 0;
LAB_00b81d44:
    iVar6 = mbedtls_mpi_copy(&local_a0,&local_90);
    uVar5 = local_88;
    if (iVar6 == 0) {
      if (local_98._2_2_ != 0) {
        mbedtls_mpi_core_shift_r(local_a0,local_98._2_2_,uVar13);
      }
      if (param_2 == 0) {
        iVar6 = 0;
        uVar5 = local_88;
      }
      else {
        local_d8 = 0;
        do {
          uVar17 = 0;
LAB_00b81ec8:
          do {
            uVar2 = *(ushort *)(param_1 + 10);
            uVar14 = (ulong)uVar2;
            if (uVar14 == 0) {
              if (local_c0 != (void *)0x0) {
                mbedtls_zeroize_and_free(local_c0,(ulong)local_b8._2_2_ << 3);
              }
              local_b8._0_2_ = 1;
              local_b8._2_2_ = 0;
              local_c0 = (void *)0x0;
            }
            else {
              if (local_b8._2_2_ == uVar2) {
                memset(local_c0,0,uVar14 << 3);
                local_b8._0_2_ = 1;
              }
              else {
                if (local_c0 != (void *)0x0) {
                  mbedtls_zeroize_and_free(local_c0,(ulong)local_b8._2_2_ << 3);
                }
                local_b8._0_2_ = 1;
                local_b8._2_2_ = 0;
                local_c0 = (void *)0x0;
                if ((10000 < uVar2) || (pvVar7 = calloc(uVar14,8), pvVar7 == (void *)0x0)) {
                  iVar6 = -0x10;
                  uVar5 = local_88;
                  goto joined_r0x00b82500;
                }
                local_c0 = pvVar7;
                local_b8._2_2_ = uVar2;
              }
              iVar6 = mbedtls_mpi_core_fill_random
                                (local_c0,local_b8._2_2_,uVar14 << 3,param_3,param_4);
              uVar5 = local_88;
              if (iVar6 != 0) goto joined_r0x00b82500;
            }
            uVar14 = mbedtls_mpi_core_bitlen(local_c0,local_b8._2_2_);
            uVar8 = mbedtls_mpi_core_bitlen(local_90,local_88._2_2_);
            if (uVar8 < uVar14) {
              lVar9 = ((ulong)local_b8._2_2_ - 1) * 8;
              *(ulong *)((long)local_c0 + lVar9) =
                   (1L << (uVar8 - 1 & 0x3f)) - 1U & *(ulong *)((long)local_c0 + lVar9);
            }
            if (0x1e < uVar17) goto LAB_00b824f8;
            uVar17 = uVar17 + 1;
            lVar9 = (ulong)local_b8._2_2_ - 1;
            lVar10 = lVar9;
            do {
              lVar12 = lVar10;
              if (lVar12 == -1) {
                uVar14 = 0;
                goto LAB_00b82004;
              }
              lVar10 = lVar12 + -1;
            } while (*(long *)((long)local_c0 + lVar12 * 8) == 0);
            uVar14 = lVar12 + 1;
LAB_00b82004:
            uVar8 = (ulong)local_88._2_2_;
            do {
              uVar15 = uVar8;
              uVar8 = uVar15 - 1;
              if (uVar8 == 0xffffffffffffffff) {
                uVar15 = 0;
                if (uVar14 != 0) goto LAB_00b82030;
                goto LAB_00b81ec8;
              }
            } while (*(long *)(local_90 + uVar8 * 8) == 0);
          } while (uVar15 == 0 && uVar14 == 0);
LAB_00b82030:
          if (uVar15 < uVar14) {
            if (-1 < (short)local_b8) goto LAB_00b81ec8;
          }
          else {
            if (uVar14 < uVar15) {
              iVar6 = -(int)(short)local_88;
            }
            else {
              iVar6 = (int)(short)local_b8;
              if ((short)local_b8 < 1) {
                if (((short)local_b8 != 0) && (0 < (short)local_88)) goto LAB_00b82068;
              }
              else if ((short)local_88 < 0) goto LAB_00b81ec8;
              do {
                if (uVar14 == 0) goto LAB_00b81ec8;
                uVar15 = *(ulong *)((long)local_c0 + uVar14 * 8 + -8);
                uVar8 = *(ulong *)(local_90 + uVar14 * 8 + -8);
                uVar14 = uVar14 - 1;
                if (uVar8 < uVar15) goto joined_r0x00b81ec4;
              } while (uVar8 <= uVar15);
              iVar6 = -(int)(short)local_b8;
            }
joined_r0x00b81ec4:
            if (-1 < iVar6) goto LAB_00b81ec8;
          }
LAB_00b82068:
          do {
            lVar10 = lVar9;
            if (lVar10 == -1) goto LAB_00b81ec8;
            lVar9 = lVar10 + -1;
          } while (*(long *)((long)local_c0 + lVar10 * 8) == 0);
          if (1 < lVar10 + 1U) {
LAB_00b8208c:
            if (0 < (short)local_b8) goto LAB_00b82094;
            goto LAB_00b81ec8;
          }
          if ((short)local_b8 < 0) goto LAB_00b81ec8;
          lVar9 = 0;
          do {
            if (lVar9 == -8) goto LAB_00b81ec8;
            puVar1 = (ulong *)((long)local_c0 + lVar9);
            if (1 < *puVar1) goto LAB_00b8208c;
            lVar9 = lVar9 + -8;
          } while (*puVar1 != 0);
          if (-(int)(short)local_b8 < 1) goto LAB_00b81ec8;
LAB_00b82094:
          iVar6 = FUN_00b80638(&local_c0,&local_c0,&local_a0,0,param_1,&local_d0);
          uVar5 = local_88;
          if (iVar6 != 0) break;
          uVar14 = (ulong)local_b8._2_2_;
          lVar9 = uVar14 - 1;
          lVar10 = lVar9;
          do {
            lVar12 = lVar10;
            if (lVar12 == -1) {
              uVar8 = 0;
              goto LAB_00b820e8;
            }
            lVar10 = lVar12 + -1;
          } while (*(long *)((long)local_c0 + lVar12 * 8) == 0);
          uVar8 = lVar12 + 1;
LAB_00b820e8:
          uVar15 = (ulong)local_88._2_2_;
          do {
            uVar11 = uVar15;
            uVar15 = uVar11 - 1;
            if (uVar15 == 0xffffffffffffffff) {
              uVar11 = 0;
              if (uVar8 != 0) goto LAB_00b82124;
              goto LAB_00b824cc;
            }
          } while (*(long *)(local_90 + uVar15 * 8) == 0);
          if (uVar11 != 0 || uVar8 != 0) {
LAB_00b82124:
            if (uVar11 < uVar8) {
              if ((short)local_b8 != 0) goto LAB_00b8214c;
            }
            else {
              if (uVar11 <= uVar8) {
                iVar6 = (int)(short)local_b8;
                if (iVar6 < 1) {
                  if ((iVar6 == 0) || ((short)local_88 < 1)) goto LAB_00b8218c;
                }
                else if (-1 < (short)local_88) {
LAB_00b8218c:
                  do {
                    if (uVar8 == 0) goto LAB_00b824cc;
                    uVar11 = *(ulong *)((long)local_c0 + uVar8 * 8 + -8);
                    uVar15 = *(ulong *)(local_90 + uVar8 * 8 + -8);
                    uVar8 = uVar8 - 1;
                    if (uVar15 < uVar11) goto LAB_00b82148;
                  } while (uVar15 <= uVar11);
                  if (iVar6 == 0) goto LAB_00b824cc;
                }
LAB_00b8214c:
                do {
                  lVar10 = lVar9;
                  if (lVar10 == -1) goto LAB_00b821ec;
                  lVar9 = lVar10 + -1;
                } while (*(long *)((long)local_c0 + lVar10 * 8) == 0);
                if (lVar10 + 1U < 2) {
                  if (-1 < (short)local_b8) {
                    lVar9 = 0;
                    do {
                      if (lVar9 == -8) goto LAB_00b824cc;
                      puVar1 = (ulong *)((long)local_c0 + lVar9);
                    } while ((*puVar1 < 2) && (lVar9 = lVar9 + -8, *puVar1 != 0));
                    goto joined_r0x00b821e8;
                  }
                }
                else {
joined_r0x00b821e8:
                  if ((short)local_b8 == 0) goto LAB_00b824cc;
                }
LAB_00b821ec:
                if (1 < uVar13) {
                  uVar8 = 1;
                  uVar15 = uVar14;
LAB_00b82214:
                  do {
                    uVar11 = uVar15;
                    uVar15 = uVar11 - 1;
                    if (uVar15 == 0xffffffffffffffff) {
                      uVar11 = 0;
                    }
                    else if (*(long *)((long)local_c0 + uVar15 * 8) == 0) goto LAB_00b82214;
                    uVar15 = (ulong)local_88._2_2_;
                    do {
                      uVar16 = uVar15;
                      uVar15 = uVar16 - 1;
                      if (uVar15 == 0xffffffffffffffff) {
                        uVar16 = 0;
                        if (uVar11 != 0) goto LAB_00b82270;
                        goto LAB_00b82380;
                      }
                    } while (*(long *)(local_90 + uVar15 * 8) == 0);
                    if (uVar16 == 0 && uVar11 == 0) break;
LAB_00b82270:
                    if (uVar16 < uVar11) {
                      if ((short)local_b8 != 0) goto LAB_00b82298;
                      break;
                    }
                    if (uVar11 < uVar16) {
                      iVar6 = -(int)(short)local_88;
joined_r0x00b82340:
                      if (iVar6 == 0) break;
                    }
                    else {
                      iVar6 = (int)(short)local_b8;
                      if (iVar6 < 1) {
                        if ((iVar6 == 0) || ((short)local_88 < 1)) goto LAB_00b82314;
                      }
                      else if (-1 < (short)local_88) {
LAB_00b82314:
                        do {
                          if (uVar11 == 0) goto LAB_00b82380;
                          uVar16 = *(ulong *)((long)local_c0 + uVar11 * 8 + -8);
                          uVar15 = *(ulong *)(local_90 + uVar11 * 8 + -8);
                          uVar11 = uVar11 - 1;
                        } while ((uVar16 <= uVar15) && (uVar15 <= uVar16));
                        goto joined_r0x00b82340;
                      }
                    }
LAB_00b82298:
                    iVar6 = mbedtls_mpi_mul_mpi(&local_b0,&local_c0,&local_c0);
                    uVar5 = local_88;
                    if (iVar6 != 0) goto joined_r0x00b82500;
                    iVar6 = mbedtls_mpi_mod_mpi(&local_c0,&local_b0,param_1);
                    uVar5 = local_88;
                    if (iVar6 != 0) goto joined_r0x00b82500;
                    uVar14 = (ulong)local_b8._2_2_;
                    uVar15 = uVar14;
                    do {
                      uVar11 = uVar15;
                      uVar15 = uVar11 - 1;
                      if (uVar15 == 0xffffffffffffffff) goto LAB_00b82374;
                    } while (*(long *)((long)local_c0 + uVar15 * 8) == 0);
                    if (uVar11 < 2) {
                      if (-1 < (short)local_b8) {
                        lVar9 = 0;
                        do {
                          if (lVar9 == -8) goto LAB_00b82380;
                          puVar1 = (ulong *)((long)local_c0 + lVar9);
                        } while ((*puVar1 < 2) && (lVar9 = lVar9 + -8, *puVar1 != 0));
                        goto joined_r0x00b82370;
                      }
                    }
                    else {
joined_r0x00b82370:
                      if ((short)local_b8 == 0) break;
                    }
LAB_00b82374:
                    uVar8 = uVar8 + 1;
                    uVar15 = uVar14;
                    if (uVar13 <= uVar8) break;
                  } while( true );
                }
LAB_00b82380:
                lVar9 = uVar14 - 1;
                lVar10 = lVar9;
                do {
                  lVar12 = lVar10;
                  if (lVar12 == -1) {
                    uVar14 = 0;
                    goto LAB_00b823a8;
                  }
                  lVar10 = lVar12 + -1;
                } while (*(long *)((long)local_c0 + lVar12 * 8) == 0);
                uVar14 = lVar12 + 1;
LAB_00b823a8:
                uVar8 = (ulong)local_88._2_2_;
                do {
                  uVar15 = uVar8;
                  uVar8 = uVar15 - 1;
                  if (uVar8 == 0xffffffffffffffff) {
                    uVar15 = 0;
                    if (uVar14 != 0) goto LAB_00b823e4;
                    goto LAB_00b82474;
                  }
                } while (*(long *)(local_90 + uVar8 * 8) == 0);
                if (uVar15 == 0 && uVar14 == 0) {
LAB_00b82474:
                  do {
                    lVar10 = lVar9;
                    if (lVar10 == -1) goto LAB_00b824cc;
                    lVar9 = lVar10 + -1;
                  } while (*(long *)((long)local_c0 + lVar10 * 8) == 0);
                  if (lVar10 + 1U < 2) {
                    if ((short)local_b8 < 0) goto LAB_00b824cc;
                    lVar9 = 0;
                    do {
                      if (lVar9 == -8) goto LAB_00b824f8;
                      puVar1 = (ulong *)((long)local_c0 + lVar9);
                    } while ((*puVar1 < 2) && (lVar9 = lVar9 + -8, *puVar1 != 0));
                  }
                  if ((short)local_b8 != 0) goto LAB_00b824cc;
                }
                else {
LAB_00b823e4:
                  sVar4 = (short)local_b8;
                  if (uVar15 < uVar14) {
joined_r0x00b82408:
                    if (sVar4 == 0) goto LAB_00b82474;
                  }
                  else {
                    sVar4 = (short)local_88;
                    if (uVar14 < uVar15) goto joined_r0x00b82408;
                    iVar6 = (int)(short)local_b8;
                    if ((short)local_b8 < 1) {
                      if (((short)local_b8 == 0) || ((short)local_88 < 1)) goto LAB_00b82444;
                    }
                    else if (-1 < (short)local_88) {
LAB_00b82444:
                      do {
                        if (uVar14 == 0) goto LAB_00b82474;
                        uVar15 = *(ulong *)((long)local_c0 + uVar14 * 8 + -8);
                        uVar8 = *(ulong *)(local_90 + uVar14 * 8 + -8);
                        uVar14 = uVar14 - 1;
                        if (uVar8 < uVar15) goto LAB_00b82470;
                      } while (uVar8 <= uVar15);
                      iVar6 = -(int)(short)local_b8;
LAB_00b82470:
                      if (iVar6 == 0) goto LAB_00b82474;
                    }
                  }
                }
LAB_00b824f8:
                iVar6 = -0xe;
                uVar5 = local_88;
                break;
              }
              iVar6 = -(int)(short)local_88;
LAB_00b82148:
              if (iVar6 != 0) goto LAB_00b8214c;
            }
          }
LAB_00b824cc:
          iVar6 = 0;
          local_d8 = local_d8 + 1;
          uVar5 = local_88;
        } while (local_d8 < param_2);
      }
    }
  }
joined_r0x00b82500:
  if (local_90 != 0) {
    local_88._2_2_ = (ushort)((uint)uVar5 >> 0x10);
    uVar13 = (ulong)local_88._2_2_;
    local_88 = uVar5;
    mbedtls_zeroize_and_free(local_90,uVar13 << 3);
  }
  local_88 = 1;
  local_90 = 0;
  if (local_a0 != 0) {
    mbedtls_zeroize_and_free(local_a0,(ulong)local_98._2_2_ << 3);
  }
  local_98 = 1;
  local_a0 = 0;
  if (local_b0 != 0) {
    mbedtls_zeroize_and_free(local_b0,(ulong)local_a8._2_2_ << 3);
  }
  local_a8 = 1;
  local_b0 = 0;
  if (local_c0 != (void *)0x0) {
    mbedtls_zeroize_and_free(local_c0,(ulong)local_b8._2_2_ << 3);
  }
  local_b8 = 1;
  local_c0 = (void *)0x0;
  if (local_d0 != 0) {
    mbedtls_zeroize_and_free(local_d0,(ulong)local_c8._2_2_ << 3);
  }
  if (*(long *)(lVar3 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar6;
}

