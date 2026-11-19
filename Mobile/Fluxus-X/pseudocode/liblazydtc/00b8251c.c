/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8251c
 */

int mbedtls_mpi_gen_prime
              (long *param_1,ulong param_2,uint param_3,undefined8 param_4,undefined8 param_5)

{
  byte *pbVar1;
  ulong *puVar2;
  int iVar3;
  long lVar4;
  short sVar5;
  bool bVar6;
  int iVar7;
  ulong *puVar8;
  undefined4 uVar9;
  ulong uVar10;
  undefined4 uVar11;
  ulong uVar12;
  uint uVar13;
  ulong uVar14;
  long lVar15;
  ulong uVar16;
  long lVar17;
  ulong uVar18;
  ulong uVar19;
  ulong *local_90;
  undefined4 local_88;
  undefined8 *local_80;
  undefined4 local_78;
  undefined8 local_70;
  long local_68;
  
  lVar4 = tpidr_el0;
  local_68 = *(long *)(lVar4 + 0x28);
  if (0xffe < param_2 - 3 >> 1) {
    iVar7 = -4;
    goto LAB_00b82694;
  }
  uVar12 = param_2 >> 6;
  if ((param_2 & 0x3f) != 0) {
    uVar12 = uVar12 + 1;
  }
  local_88 = 1;
  local_90 = (ulong *)0x0;
  if ((param_3 >> 1 & 1) == 0) {
    if (param_2 < 0x514) {
      if (param_2 < 0x352) {
        if (0x289 < param_2) goto LAB_00b825a4;
        if (param_2 < 0x15e) {
          if (param_2 < 0xfa) {
            uVar9 = 0x1b;
            uVar11 = 0x12;
LAB_00b82658:
            if (param_2 < 0x96) {
              uVar11 = uVar9;
            }
          }
          else {
            uVar11 = 0xc;
          }
        }
        else {
LAB_00b82614:
          uVar11 = 8;
        }
      }
      else {
        uVar11 = 3;
      }
    }
    else {
      uVar11 = 2;
    }
  }
  else if (param_2 < 0x5aa) {
    if (param_2 < 0x47e) {
      if (param_2 < 1000) {
        if (param_2 < 0x352) {
          if (0x2ed < param_2) goto LAB_00b82614;
          if (param_2 < 500) {
            if (param_2 < 0xfa) {
              uVar9 = 0x33;
              uVar11 = 0x28;
              goto LAB_00b82658;
            }
            uVar11 = 0x1c;
          }
          else {
            uVar11 = 0xd;
          }
        }
        else {
          uVar11 = 7;
        }
      }
      else {
        uVar11 = 6;
      }
    }
    else {
      uVar11 = 5;
    }
  }
  else {
LAB_00b825a4:
    uVar11 = 4;
  }
  iVar7 = FUN_00b7ea70(param_1,uVar12);
  uVar9 = local_88;
  if (iVar7 == 0) {
LAB_00b826ec:
    if (uVar12 != 0) {
      iVar7 = mbedtls_mpi_core_fill_random
                        (*param_1,*(undefined2 *)((long)param_1 + 10),uVar12 << 3,param_4,param_5);
      uVar9 = local_88;
      if (iVar7 != 0) goto joined_r0x00b82b38;
    }
    puVar8 = (ulong *)*param_1;
    if (puVar8[uVar12 - 1] < 0xb504f333f9de6485) goto LAB_00b82764;
    if ((param_2 < uVar12 * 0x40) && (*(short *)((long)param_1 + 10) != 0)) {
      mbedtls_mpi_core_shift_r(puVar8,*(short *)((long)param_1 + 10),uVar12 * 0x40 - param_2);
      puVar8 = (ulong *)*param_1;
    }
    uVar10 = *puVar8;
    *puVar8 = uVar10 | 1;
    if ((param_3 & 1) == 0) {
      iVar7 = mbedtls_mpi_is_prime_ext(param_1,uVar11,param_4,param_5);
      uVar9 = local_88;
      if (iVar7 == -0xe) goto LAB_00b82764;
      goto joined_r0x00b82b38;
    }
    *puVar8 = uVar10 | 3;
    uVar12 = (ulong)*(ushort *)((long)param_1 + 10);
    if (uVar12 == 0) goto LAB_00b82808;
    uVar10 = 0;
    do {
      uVar12 = uVar12 - 1;
      uVar14 = puVar8[uVar12];
      uVar10 = (uVar14 & 0xffffffff |
               (ulong)(uint)((int)(uVar14 >> 0x20) +
                            (int)((uVar14 >> 0x20 | uVar10 << 0x20) / 3) * -3) << 0x20) % 3;
    } while (uVar12 != 0);
    uVar13 = (uint)uVar10;
    if ((short)param_1[1] < 0 && uVar10 != 0) {
      uVar13 = ~uVar13;
    }
    if ((uVar13 & 3) == 1) {
      local_70 = 4;
LAB_00b82814:
      local_80 = &local_70;
      local_78 = 0x10001;
      iVar7 = FUN_00b7f304(param_1,param_1,&local_80,1);
      uVar9 = local_88;
      if (iVar7 == 0) goto LAB_00b82844;
      goto joined_r0x00b82b38;
    }
    if ((uVar13 & 3) == 0) {
LAB_00b82808:
      local_70 = 8;
      goto LAB_00b82814;
    }
LAB_00b82844:
    iVar7 = mbedtls_mpi_copy(&local_90,param_1);
    uVar9 = local_88;
    if (iVar7 != 0) goto joined_r0x00b82b38;
    if (local_88._2_2_ != 0) {
      mbedtls_mpi_core_shift_r(local_90,local_88._2_2_,1);
    }
LAB_00b82884:
    puVar8 = (ulong *)*param_1;
    if ((*puVar8 & 1) != 0) {
      uVar10 = (ulong)*(ushort *)((long)param_1 + 10);
      uVar12 = 0;
      uVar13 = 3;
      do {
        uVar9 = local_88;
        if (uVar13 == 0) goto LAB_00b82b40;
        if (uVar13 == 1) {
          uVar10 = (ulong)*(ushort *)((long)param_1 + 10);
LAB_00b82a24:
          goto LAB_00b82a2c;
        }
        if (*(ushort *)((long)param_1 + 10) == 0) goto LAB_00b82a24;
        uVar14 = *puVar8 & 1;
        if (uVar13 != 2) {
          uVar18 = 0;
          uVar16 = (ulong)uVar13;
          uVar14 = uVar10;
          do {
            uVar14 = uVar14 - 1;
            uVar19 = puVar8[uVar14];
            iVar7 = 0;
            if (uVar16 != 0) {
              iVar7 = (int)((uVar19 >> 0x20 | uVar18 << 0x20) / uVar16);
            }
            uVar18 = uVar19 & 0xffffffff | (ulong)((int)(uVar19 >> 0x20) - iVar7 * uVar13) << 0x20;
            uVar19 = 0;
            if (uVar16 != 0) {
              uVar19 = uVar18 / uVar16;
            }
            uVar18 = uVar18 - uVar19 * uVar16;
          } while (uVar14 != 0);
          uVar14 = uVar16 - uVar18;
          if (-1 < (short)param_1[1] || uVar18 == 0) {
            uVar14 = uVar18;
          }
        }
        if (uVar14 == 0) goto LAB_00b82a24;
        pbVar1 = &DAT_002d499f + uVar12;
        uVar12 = uVar12 + 1;
        uVar13 = uVar13 + *pbVar1;
      } while (uVar12 < 0xa7);
      if ((*local_90 & 1) != 0) {
        iVar7 = (int)(short)local_88;
        uVar12 = 0;
        lVar15 = (ulong)local_88._2_2_ - 1;
        uVar13 = 3;
        do {
          if (uVar13 == 0) goto LAB_00b82b40;
          uVar10 = (ulong)uVar13;
          if ((uVar13 == 1) || (local_88._2_2_ == 0)) goto LAB_00b829fc;
          uVar14 = *local_90 & 1;
          if (uVar13 != 2) {
            uVar18 = 0;
            lVar17 = lVar15;
            do {
              uVar14 = local_90[lVar17];
              bVar6 = lVar17 != 0;
              iVar3 = 0;
              if (uVar10 != 0) {
                iVar3 = (int)((uVar14 >> 0x20 | uVar18 << 0x20) / uVar10);
              }
              uVar18 = uVar14 & 0xffffffff | (ulong)((int)(uVar14 >> 0x20) - iVar3 * uVar13) << 0x20
              ;
              uVar14 = 0;
              if (uVar10 != 0) {
                uVar14 = uVar18 / uVar10;
              }
              uVar18 = uVar18 - uVar14 * uVar10;
              lVar17 = lVar17 + -1;
            } while (bVar6);
            uVar14 = uVar10 - uVar18;
            if (-1 < iVar7 || uVar18 == 0) {
              uVar14 = uVar18;
            }
          }
          if (uVar14 == 0) goto LAB_00b829fc;
          pbVar1 = &DAT_002d499f + uVar12;
          uVar12 = uVar12 + 1;
          uVar13 = uVar13 + *pbVar1;
        } while (uVar12 < 0xa7);
        iVar7 = FUN_00b81c6c(param_1,uVar11,param_4,param_5);
        if (iVar7 != -0xe) {
          uVar9 = local_88;
          if (iVar7 == 0) {
            iVar7 = FUN_00b81c6c(&local_90,uVar11,param_4,param_5);
            uVar9 = local_88;
            if (iVar7 == -0xe) goto LAB_00b82a9c;
          }
          goto joined_r0x00b82b38;
        }
      }
    }
    goto LAB_00b82a9c;
  }
joined_r0x00b82b38:
  if (local_90 != (ulong *)0x0) {
    local_88._2_2_ = (ushort)((uint)uVar9 >> 0x10);
    uVar12 = (ulong)local_88._2_2_;
    local_88 = uVar9;
    mbedtls_zeroize_and_free(local_90,uVar12 << 3);
  }
  local_88 = 1;
  local_90 = (ulong *)0x0;
LAB_00b82694:
  if (*(long *)(lVar4 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar7;
LAB_00b82764:
  iVar7 = FUN_00b7ea70(param_1,uVar12);
  uVar9 = local_88;
  if (iVar7 != 0) goto joined_r0x00b82b38;
  goto LAB_00b826ec;
  while (puVar8[uVar10] == 0) {
LAB_00b82a2c:
    uVar12 = uVar10;
    uVar10 = uVar12 - 1;
    if (uVar10 == 0xffffffffffffffff) {
      uVar12 = 0;
      goto LAB_00b82a4c;
    }
  }
  if (uVar12 < 2) {
LAB_00b82a4c:
    if ((uVar12 == 0) || (sVar5 = (short)param_1[1], sVar5 < 0)) goto LAB_00b82a9c;
    lVar15 = 0;
    do {
      if (lVar15 == -8) goto LAB_00b82b30;
      puVar2 = (ulong *)((long)puVar8 + lVar15);
    } while ((*puVar2 <= (ulong)uVar13) && (lVar15 = lVar15 + -8, (ulong)uVar13 <= *puVar2));
  }
  else {
    sVar5 = (short)param_1[1];
  }
  if (sVar5 == 0) goto LAB_00b82b30;
  goto LAB_00b82a9c;
LAB_00b82b40:
  iVar7 = -0xc;
  goto joined_r0x00b82b38;
  while (lVar15 = lVar17 + -1, local_90[lVar17] == 0) {
LAB_00b829fc:
    lVar17 = lVar15;
    if (lVar17 == -1) {
      uVar12 = 0;
      goto LAB_00b82afc;
    }
  }
  uVar12 = lVar17 + 1;
  if (uVar12 < 2) {
LAB_00b82afc:
    if ((uVar12 == 0) || (iVar7 < 0)) goto LAB_00b82a9c;
    lVar15 = 0;
    do {
      if (lVar15 == -8) goto LAB_00b82b30;
      puVar8 = (ulong *)((long)local_90 + lVar15);
      if (uVar10 < *puVar8) goto LAB_00b82b2c;
      lVar15 = lVar15 + -8;
    } while (uVar10 <= *puVar8);
    iVar7 = -iVar7;
  }
LAB_00b82b2c:
  if (iVar7 == 0) {
LAB_00b82b30:
    iVar7 = 1;
    goto joined_r0x00b82b38;
  }
LAB_00b82a9c:
  local_70 = 0xc;
  local_78 = 0x10001;
  local_80 = &local_70;
  iVar7 = FUN_00b7f304(param_1,param_1,&local_80,1);
  uVar9 = local_88;
  if (iVar7 != 0) goto joined_r0x00b82b38;
  local_70 = 6;
  local_78 = 0x10001;
  local_80 = &local_70;
  iVar7 = FUN_00b7f304(&local_90,&local_90,&local_80,1);
  uVar9 = local_88;
  if (iVar7 != 0) goto joined_r0x00b82b38;
  goto LAB_00b82884;
}

