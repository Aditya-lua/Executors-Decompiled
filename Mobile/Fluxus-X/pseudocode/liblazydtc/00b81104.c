/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b81104
 */

int mbedtls_mpi_inv_mod(undefined8 param_1,undefined8 param_2,long *param_3)

{
  ulong *puVar1;
  bool bVar2;
  byte bVar3;
  short sVar4;
  long lVar5;
  undefined4 uVar6;
  undefined4 uVar7;
  byte *pbVar8;
  ushort uVar9;
  int iVar10;
  byte *pbVar11;
  byte **ppbVar12;
  byte **ppbVar13;
  size_t sVar14;
  byte **ppbVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  long lVar19;
  byte *local_d8;
  undefined4 local_d0;
  byte *local_c8;
  undefined4 local_c0;
  byte *local_b8;
  undefined4 local_b0;
  long local_a8;
  undefined4 local_a0;
  byte *local_98;
  undefined4 local_90;
  byte *local_88;
  undefined4 local_80;
  byte *local_78;
  undefined4 local_70;
  long local_68;
  undefined4 local_60;
  long local_58;
  undefined4 local_50;
  long local_48;
  
  lVar5 = tpidr_el0;
  local_48 = *(long *)(lVar5 + 0x28);
  uVar17 = (ulong)*(ushort *)((long)param_3 + 10);
  do {
    uVar16 = uVar17;
    uVar17 = uVar16 - 1;
    if (uVar17 == 0xffffffffffffffff) goto LAB_00b8123c;
  } while (*(long *)(*param_3 + uVar17 * 8) == 0);
  sVar4 = (short)param_3[1];
  if (uVar16 < 2) {
    if (-1 < sVar4) {
      lVar19 = 0;
      do {
        if (lVar19 == -8) goto LAB_00b8123c;
        uVar17 = *(ulong *)(*param_3 + lVar19);
        if (1 < uVar17) goto LAB_00b81164;
        lVar19 = lVar19 + -8;
      } while (uVar17 != 0);
      if (0 < -(int)sVar4) goto LAB_00b8116c;
    }
  }
  else {
LAB_00b81164:
    if (0 < sVar4) {
LAB_00b8116c:
      local_60 = 1;
      local_68 = 0;
      local_70 = 1;
      local_78 = (byte *)0x0;
      local_80._0_2_ = 1;
      local_80._2_2_ = 0;
      local_88 = (byte *)0x0;
      local_90._0_2_ = 1;
      local_90._2_2_ = 0;
      local_98 = (byte *)0x0;
      local_50 = 1;
      local_58 = 0;
      local_a0 = 1;
      local_a8 = 0;
      local_b0 = 1;
      local_b8 = (byte *)0x0;
      local_c0._0_2_ = 1;
      local_c0._2_2_ = 0;
      local_c8 = (byte *)0x0;
      local_d0._0_2_ = 1;
      local_d0._2_2_ = 0;
      local_d8 = (byte *)0x0;
      iVar10 = mbedtls_mpi_gcd(&local_58,param_2,param_3);
      uVar6 = local_60;
      if (iVar10 != 0) goto joined_r0x00b81a70;
      uVar17 = (ulong)local_50._2_2_;
      do {
        uVar16 = uVar17;
        uVar17 = uVar16 - 1;
        if (uVar17 == 0xffffffffffffffff) {
          iVar10 = -0xe;
          goto joined_r0x00b81a70;
        }
      } while (*(long *)(local_58 + uVar17 * 8) == 0);
      if (uVar16 < 2) {
        if (-1 < (short)local_50) {
          lVar19 = 0;
          do {
            if (lVar19 == -8) goto LAB_00b813c0;
            puVar1 = (ulong *)(local_58 + lVar19);
          } while ((*puVar1 < 2) && (lVar19 = lVar19 + -8, *puVar1 != 0));
          goto joined_r0x00b813ac;
        }
LAB_00b813b0:
        iVar10 = -0xe;
      }
      else {
joined_r0x00b813ac:
        if ((short)local_50 != 0) goto LAB_00b813b0;
LAB_00b813c0:
        iVar10 = mbedtls_mpi_mod_mpi(&local_68,param_2,param_3);
        uVar6 = local_60;
        if (iVar10 == 0) {
          iVar10 = mbedtls_mpi_copy(&local_78,&local_68);
          uVar6 = local_60;
          if (iVar10 == 0) {
            iVar10 = mbedtls_mpi_copy(&local_a8,param_3);
            uVar6 = local_60;
            if (iVar10 == 0) {
              iVar10 = mbedtls_mpi_copy(&local_b8,param_3);
              uVar6 = local_60;
              if (iVar10 == 0) {
                if ((ulong)local_80._2_2_ == 0) {
                  pbVar11 = calloc(1,8);
                  pbVar8 = local_88;
                  if (pbVar11 != (byte *)0x0) {
                    if (local_88 != (byte *)0x0) {
                      memcpy(pbVar11,local_88,0);
                      mbedtls_zeroize_and_free(pbVar8,0);
                    }
                    sVar14 = 8;
                    local_80._2_2_ = 1;
                    local_88 = pbVar11;
                    goto LAB_00b81474;
                  }
                }
                else {
                  sVar14 = (ulong)local_80._2_2_ << 3;
LAB_00b81474:
                  memset(local_88,0,sVar14);
                  local_88[0] = 1;
                  local_88[1] = 0;
                  local_88[2] = 0;
                  local_88[3] = 0;
                  local_88[4] = 0;
                  local_88[5] = 0;
                  local_88[6] = 0;
                  local_88[7] = 0;
                  local_80._0_2_ = 1;
                  if ((ulong)local_90._2_2_ == 0) {
                    pbVar11 = calloc(1,8);
                    pbVar8 = local_98;
                    if (pbVar11 == (byte *)0x0) goto LAB_00b81a4c;
                    if (local_98 != (byte *)0x0) {
                      memcpy(pbVar11,local_98,0);
                      mbedtls_zeroize_and_free(pbVar8,0);
                    }
                    sVar14 = 8;
                    local_90._2_2_ = 1;
                    local_98 = pbVar11;
                  }
                  else {
                    sVar14 = (ulong)local_90._2_2_ << 3;
                  }
                  memset(local_98,0,sVar14);
                  local_98[0] = 0;
                  local_98[1] = 0;
                  local_98[2] = 0;
                  local_98[3] = 0;
                  local_98[4] = 0;
                  local_98[5] = 0;
                  local_98[6] = 0;
                  local_98[7] = 0;
                  local_90._0_2_ = 1;
                  if ((ulong)local_c0._2_2_ == 0) {
                    pbVar11 = calloc(1,8);
                    pbVar8 = local_c8;
                    if (pbVar11 == (byte *)0x0) goto LAB_00b81a4c;
                    if (local_c8 != (byte *)0x0) {
                      memcpy(pbVar11,local_c8,0);
                      mbedtls_zeroize_and_free(pbVar8,0);
                    }
                    sVar14 = 8;
                    local_c0._2_2_ = 1;
                    local_c8 = pbVar11;
                  }
                  else {
                    sVar14 = (ulong)local_c0._2_2_ << 3;
                  }
                  memset(local_c8,0,sVar14);
                  local_c8[0] = 0;
                  local_c8[1] = 0;
                  local_c8[2] = 0;
                  local_c8[3] = 0;
                  local_c8[4] = 0;
                  local_c8[5] = 0;
                  local_c8[6] = 0;
                  local_c8[7] = 0;
                  local_c0._0_2_ = 1;
                  if ((ulong)local_d0._2_2_ != 0) {
                    sVar14 = (ulong)local_d0._2_2_ << 3;
LAB_00b815e8:
                    memset(local_d8,0,sVar14);
                    local_d8[0] = 1;
                    local_d8[1] = 0;
                    local_d8[2] = 0;
                    local_d8[3] = 0;
                    local_d8[4] = 0;
                    local_d8[5] = 0;
                    local_d8[6] = 0;
                    local_d8[7] = 0;
                    local_d0._0_2_ = 1;
                    bVar3 = *local_78;
                    uVar6 = local_70;
                    do {
                      if ((bVar3 & 1) == 0) {
                        local_70._2_2_ = (ushort)((uint)uVar6 >> 0x10);
                        sVar4 = local_70._2_2_;
                        bVar2 = local_70._2_2_ != 0;
                        local_70 = uVar6;
                        if (bVar2) {
                          mbedtls_mpi_core_shift_r(local_78,sVar4,1);
                        }
                        if (((*local_88 & 1) != 0) || ((*local_98 & 1) != 0)) {
                          iVar10 = FUN_00b7f304(&local_88,&local_88,&local_a8,1);
                          uVar6 = local_60;
                          if (iVar10 != 0) goto joined_r0x00b81a70;
                          iVar10 = FUN_00b7f304(&local_98,&local_98,&local_68,0xffffffff);
                          uVar6 = local_60;
                          if (iVar10 != 0) goto joined_r0x00b81a70;
                        }
                        if (local_80._2_2_ != 0) {
                          mbedtls_mpi_core_shift_r(local_88,local_80._2_2_,1);
                        }
                        if (local_90._2_2_ != 0) {
                          mbedtls_mpi_core_shift_r(local_98,local_90._2_2_,1);
                        }
                      }
                      else {
                        bVar3 = *local_b8;
                        uVar7 = local_b0;
                        while( true ) {
                          local_b0._2_2_ = (ushort)((uint)uVar7 >> 0x10);
                          uVar9 = local_b0._2_2_;
                          local_b0 = uVar7;
                          local_70 = uVar6;
                          if ((bVar3 & 1) != 0) break;
                          bVar2 = local_b0._2_2_ != 0;
                          if (bVar2) {
                            mbedtls_mpi_core_shift_r(local_b8,uVar9,1);
                          }
                          if (((*local_c8 & 1) != 0) || ((*local_d8 & 1) != 0)) {
                            iVar10 = FUN_00b7f304(&local_c8,&local_c8,&local_a8,1);
                            uVar6 = local_60;
                            if (iVar10 != 0) goto joined_r0x00b81a70;
                            iVar10 = FUN_00b7f304(&local_d8,&local_d8,&local_68,0xffffffff);
                            uVar6 = local_60;
                            if (iVar10 != 0) goto joined_r0x00b81a70;
                          }
                          if (local_c0._2_2_ != 0) {
                            mbedtls_mpi_core_shift_r(local_c8,local_c0._2_2_,1);
                          }
                          if (local_d0._2_2_ != 0) {
                            mbedtls_mpi_core_shift_r(local_d8,local_d0._2_2_,1);
                          }
                          bVar3 = *local_b8;
                          uVar7 = local_b0;
                          uVar6 = local_70;
                        }
                        local_70._2_2_ = (ushort)((uint)uVar6 >> 0x10);
                        uVar17 = (ulong)local_70._2_2_;
                        do {
                          uVar16 = uVar17;
                          uVar17 = uVar16 - 1;
                          if (uVar17 == 0xffffffffffffffff) {
                            uVar16 = 0;
                            break;
                          }
                        } while (*(long *)(local_78 + uVar17 * 8) == 0);
                        uVar17 = (ulong)local_b0._2_2_;
                        do {
                          uVar18 = uVar17;
                          uVar17 = uVar18 - 1;
                          if (uVar17 == 0xffffffffffffffff) {
                            uVar18 = 0;
                            if (uVar16 == 0) goto LAB_00b817dc;
                            goto LAB_00b817b4;
                          }
                        } while (*(long *)(local_b8 + uVar17 * 8) == 0);
                        if (uVar18 == 0 && uVar16 == 0) {
LAB_00b817dc:
                          iVar10 = FUN_00b7f304(&local_78,&local_78,&local_b8,0xffffffff);
                          uVar6 = local_60;
                          if (iVar10 != 0) goto joined_r0x00b81a70;
                          iVar10 = FUN_00b7f304(&local_88,&local_88,&local_c8,0xffffffff);
                          uVar6 = local_60;
                          if (iVar10 != 0) goto joined_r0x00b81a70;
                          ppbVar12 = &local_98;
                          ppbVar13 = &local_98;
                          ppbVar15 = &local_d8;
                        }
                        else {
LAB_00b817b4:
                          local_70._0_2_ = (short)uVar6;
                          if (uVar18 < uVar16) {
                            if ((short)local_70 < 0) goto LAB_00b81878;
                            goto LAB_00b817dc;
                          }
                          local_b0._0_2_ = (short)uVar7;
                          if (uVar16 < uVar18) {
                            iVar10 = -(int)(short)local_b0;
LAB_00b817d8:
                            if (-1 < iVar10) goto LAB_00b817dc;
                          }
                          else {
                            iVar10 = (int)(short)local_70;
                            if (iVar10 < 1) {
                              if ((iVar10 != 0) && (0 < (short)local_b0)) goto LAB_00b81878;
                            }
                            else if ((short)local_b0 < 0) goto LAB_00b817dc;
                            do {
                              if (uVar16 == 0) goto LAB_00b817dc;
                              lVar19 = uVar16 * 8;
                              uVar16 = uVar16 - 1;
                              if (*(ulong *)(local_b8 + lVar19 + -8) <
                                  *(ulong *)(local_78 + lVar19 + -8)) goto LAB_00b817d8;
                            } while (*(ulong *)(local_b8 + lVar19 + -8) <=
                                     *(ulong *)(local_78 + lVar19 + -8));
                            if (-1 < -iVar10) goto LAB_00b817dc;
                          }
LAB_00b81878:
                          iVar10 = FUN_00b7f304(&local_b8,&local_b8,&local_78,0xffffffff);
                          uVar6 = local_60;
                          if (iVar10 != 0) goto joined_r0x00b81a70;
                          iVar10 = FUN_00b7f304(&local_c8,&local_c8,&local_88,0xffffffff);
                          uVar6 = local_60;
                          if (iVar10 != 0) goto joined_r0x00b81a70;
                          ppbVar12 = &local_d8;
                          ppbVar13 = &local_d8;
                          ppbVar15 = &local_98;
                        }
                        iVar10 = FUN_00b7f304(ppbVar12,ppbVar13,ppbVar15,0xffffffff);
                        uVar6 = local_60;
                        if (iVar10 != 0) goto joined_r0x00b81a70;
                        uVar17 = (ulong)local_70._2_2_;
                        do {
                          if (uVar17 == 0) goto LAB_00b818f0;
                          lVar19 = uVar17 * 8;
                          uVar17 = uVar17 - 1;
                        } while (*(long *)(local_78 + lVar19 + -8) == 0);
                        if ((short)local_70 == 0) goto LAB_00b818f0;
                      }
                      bVar3 = *local_78;
                      uVar6 = local_70;
                    } while( true );
                  }
                  pbVar11 = calloc(1,8);
                  pbVar8 = local_d8;
                  if (pbVar11 != (byte *)0x0) {
                    if (local_d8 != (byte *)0x0) {
                      memcpy(pbVar11,local_d8,0);
                      mbedtls_zeroize_and_free(pbVar8,0);
                    }
                    sVar14 = 8;
                    local_d0._2_2_ = 1;
                    local_d8 = pbVar11;
                    goto LAB_00b815e8;
                  }
                }
LAB_00b81a4c:
                iVar10 = -0x10;
                uVar6 = local_60;
              }
            }
          }
        }
      }
joined_r0x00b81a70:
      if (local_68 != 0) {
        local_60._2_2_ = (ushort)((uint)uVar6 >> 0x10);
        uVar17 = (ulong)local_60._2_2_;
        local_60 = uVar6;
        mbedtls_zeroize_and_free(local_68,uVar17 << 3);
      }
      local_60 = 1;
      local_68 = 0;
      if (local_78 != (byte *)0x0) {
        mbedtls_zeroize_and_free(local_78,(ulong)local_70._2_2_ << 3);
      }
      local_70 = 1;
      local_78 = (byte *)0x0;
      if (local_88 != (byte *)0x0) {
        mbedtls_zeroize_and_free(local_88,(ulong)local_80._2_2_ << 3);
      }
      local_80 = 1;
      local_88 = (byte *)0x0;
      if (local_98 != (byte *)0x0) {
        mbedtls_zeroize_and_free(local_98,(ulong)local_90._2_2_ << 3);
      }
      local_90 = 1;
      local_98 = (byte *)0x0;
      if (local_58 != 0) {
        mbedtls_zeroize_and_free(local_58,(ulong)local_50._2_2_ << 3);
      }
      local_50 = 1;
      local_58 = 0;
      if (local_a8 != 0) {
        mbedtls_zeroize_and_free(local_a8,(ulong)local_a0._2_2_ << 3);
      }
      local_a0 = 1;
      local_a8 = 0;
      if (local_b8 != (byte *)0x0) {
        mbedtls_zeroize_and_free(local_b8,(ulong)local_b0._2_2_ << 3);
      }
      local_b0 = 1;
      local_b8 = (byte *)0x0;
      if (local_c8 != (byte *)0x0) {
        mbedtls_zeroize_and_free(local_c8,(ulong)local_c0._2_2_ << 3);
      }
      local_c0 = 1;
      local_c8 = (byte *)0x0;
      if (local_d8 != (byte *)0x0) {
        mbedtls_zeroize_and_free(local_d8,(ulong)local_d0._2_2_ << 3);
      }
      local_d0 = 1;
      local_d8 = (byte *)0x0;
      goto LAB_00b81358;
    }
  }
LAB_00b8123c:
  iVar10 = -4;
LAB_00b81358:
  if (*(long *)(lVar5 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar10;
  while( true ) {
    iVar10 = FUN_00b7f304(&local_c8,&local_c8,param_3,1);
    uVar6 = local_60;
    if (iVar10 != 0) break;
LAB_00b818f0:
    uVar16 = (ulong)local_c0._2_2_;
    uVar17 = uVar16;
    do {
      if (uVar17 == 0) goto LAB_00b81948;
      lVar19 = uVar17 * 8;
      uVar17 = uVar17 - 1;
    } while (*(long *)(local_c8 + lVar19 + -8) == 0);
    if (-1 < (short)local_c0) goto LAB_00b81948;
  }
  goto joined_r0x00b81a70;
LAB_00b81948:
  uVar17 = uVar16;
  uVar16 = uVar17 - 1;
  if (uVar16 != 0xffffffffffffffff) goto code_r0x00b81950;
  uVar17 = 0;
  goto LAB_00b81968;
code_r0x00b81950:
  if (*(long *)(local_c8 + uVar16 * 8) == 0) goto LAB_00b81948;
LAB_00b81968:
  uVar16 = (ulong)*(ushort *)((long)param_3 + 10);
  do {
    uVar18 = uVar16;
    uVar16 = uVar18 - 1;
    if (uVar16 == 0xffffffffffffffff) {
      uVar18 = 0;
      if (uVar17 == 0) goto LAB_00b81a2c;
      goto LAB_00b819a4;
    }
  } while (*(long *)(*param_3 + uVar16 * 8) == 0);
  if (uVar18 != 0 || uVar17 != 0) {
LAB_00b819a4:
    if (uVar18 < uVar17) {
      if ((short)local_c0 < 0) goto LAB_00b81a5c;
    }
    else {
      if (uVar17 < uVar18) {
        iVar10 = -(int)(short)param_3[1];
      }
      else {
        iVar10 = (int)(short)local_c0;
        if ((short)local_c0 < 1) {
          if (((short)local_c0 != 0) && (0 < (short)param_3[1])) goto LAB_00b81a5c;
        }
        else if ((short)param_3[1] < 0) goto LAB_00b81a2c;
        do {
          uVar17 = uVar17 - 1;
          if (uVar17 == 0xffffffffffffffff) goto LAB_00b81a2c;
          uVar16 = *(ulong *)(*param_3 + uVar17 * 8);
          if (uVar16 < *(ulong *)(local_c8 + uVar17 * 8)) goto joined_r0x00b81a28;
        } while (uVar16 <= *(ulong *)(local_c8 + uVar17 * 8));
        iVar10 = -(int)(short)local_c0;
      }
joined_r0x00b81a28:
      if (iVar10 < 0) {
LAB_00b81a5c:
        iVar10 = mbedtls_mpi_copy(param_1,&local_c8);
        uVar6 = local_60;
        goto joined_r0x00b81a70;
      }
    }
  }
LAB_00b81a2c:
  iVar10 = FUN_00b7f304(&local_c8,&local_c8,param_3,0xffffffff);
  uVar6 = local_60;
  if (iVar10 != 0) goto joined_r0x00b81a70;
  uVar16 = (ulong)local_c0._2_2_;
  goto LAB_00b81948;
}

