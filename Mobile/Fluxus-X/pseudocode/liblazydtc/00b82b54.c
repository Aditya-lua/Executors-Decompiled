/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b82b54
 */

uint mbedtls_mpi_self_test(int param_1)

{
  long lVar1;
  long lVar2;
  undefined4 uVar3;
  long *plVar4;
  bool bVar5;
  uint uVar6;
  uint uVar7;
  long *plVar8;
  size_t sVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  int iVar14;
  long lVar15;
  long local_d8;
  undefined4 local_d0;
  long local_c8;
  undefined4 local_c0;
  long *local_b8;
  undefined4 local_b0;
  long *local_a8;
  undefined4 local_a0;
  long local_98;
  undefined4 local_90;
  long local_88;
  undefined4 local_80;
  long local_78;
  undefined4 local_70;
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  local_70 = 1;
  local_78 = 0;
  local_80 = 1;
  local_88 = 0;
  local_90 = 1;
  local_98 = 0;
  local_a0._0_2_ = 1;
  local_a0._2_2_ = 0;
  local_a8 = (long *)0x0;
  local_b0._0_2_ = 1;
  local_b0._2_2_ = 0;
  local_b8 = (long *)0x0;
  local_c0 = 1;
  local_c8 = 0;
  local_d0 = 1;
  local_d8 = 0;
  uVar6 = mbedtls_mpi_read_string
                    (&local_78,0x10,
                     "EFE021C2645FD1DC586E69184AF4A31ED5F53E93B5F123FA41680867BA110131944FE7952E2517337780CB0DB80E61AAE7C8DDC6C5C6AADEB34EB38A2F40D5E6"
                    );
  if ((((uVar6 == 0) &&
       (uVar6 = mbedtls_mpi_read_string
                          (&local_88,0x10,
                           "B2E7EFD37075B9F03FF989C7C5051C2034D2A323810251127E7BF8625A4F49A5F3E27F4DA8BD59C47D6DAABA4C8127BD5B5C25763222FEFCCFC38B832366C29E"
                          ), uVar6 == 0)) &&
      (uVar6 = mbedtls_mpi_read_string
                         (&local_98,0x10,
                          "0066A198186C18C10B2F5ED9B522752A9830B69916E535C8F047518A889A43A594B6BED27A168D31D4A52F88925AA8F5"
                         ), uVar6 == 0)) &&
     ((uVar6 = mbedtls_mpi_mul_mpi(&local_a8,&local_78,&local_98), uVar6 == 0 &&
      (uVar6 = mbedtls_mpi_read_string
                         (&local_c8,0x10,
                          "602AB7ECA597A3D6B56FF9829A5E8B859E857EA95A03512E2BAE7391688D264AA5663B0341DB9CCFD2C4C5F421FEC8148001B72E848A38CAE1C65F78E56ABDEFE12D3C039B8A02D6BE593F0BBBDA56F1ECF677152EF804370C1A305CAF3B5BF130879B56C61DE584A0F53A2447A51E"
                         ), uVar6 == 0)))) {
    if (param_1 != 0) {
      printf("  MPI test #1 (mul_mpi): ");
    }
    uVar10 = (ulong)local_a0._2_2_;
    do {
      uVar12 = uVar10;
      uVar10 = uVar12 - 1;
      if (uVar10 == 0xffffffffffffffff) {
        uVar12 = 0;
        break;
      }
    } while (local_a8[uVar10] == 0);
    uVar10 = (ulong)local_c0._2_2_;
    do {
      uVar11 = uVar10;
      uVar10 = uVar11 - 1;
      if (uVar10 == 0xffffffffffffffff) {
        uVar11 = 0;
        if (uVar12 != 0) goto LAB_00b82df8;
        goto LAB_00b82e7c;
      }
    } while (*(long *)(local_c8 + uVar10 * 8) == 0);
    if (uVar11 != 0 || uVar12 != 0) {
LAB_00b82df8:
      if (uVar11 < uVar12) {
        if ((ushort)local_a0 != 0) goto LAB_00b82e20;
        goto LAB_00b82e7c;
      }
      if (uVar12 < uVar11) {
        iVar14 = -(int)(short)local_c0;
joined_r0x00b82e78:
        if (iVar14 == 0) goto LAB_00b82e7c;
      }
      else {
        iVar14 = (int)(short)(ushort)local_a0;
        if (iVar14 < 1) {
          if ((iVar14 == 0) || ((short)local_c0 < 1)) goto LAB_00b82e4c;
        }
        else if (-1 < (short)local_c0) {
LAB_00b82e4c:
          do {
            if (uVar12 == 0) goto LAB_00b82e7c;
            lVar1 = uVar12 - 1;
            uVar10 = *(ulong *)(local_c8 + uVar12 * 8 + -8);
            uVar12 = uVar12 - 1;
          } while (((ulong)local_a8[lVar1] <= uVar10) && (uVar10 <= (ulong)local_a8[lVar1]));
          goto joined_r0x00b82e78;
        }
      }
      goto LAB_00b82e20;
    }
LAB_00b82e7c:
    if (param_1 != 0) {
      puts("passed");
    }
    uVar6 = mbedtls_mpi_div_mpi(&local_a8,&local_b8,&local_78,&local_98);
    if (((uVar6 != 0) ||
        (uVar6 = mbedtls_mpi_read_string(&local_c8,0x10,"256567336059E52CAE22925474705F39A94"),
        uVar6 != 0)) ||
       (uVar6 = mbedtls_mpi_read_string
                          (&local_d8,0x10,
                           "6613F26162223DF488E9CD48CC132C7A0AC93C701B001B092E4E5B9F73BCD27B9EE50D0657C77F374E903CDFA4C642"
                          ), uVar6 != 0)) goto LAB_00b82c48;
    if (param_1 != 0) {
      printf("  MPI test #2 (div_mpi): ");
    }
    uVar10 = (ulong)local_a0._2_2_;
    do {
      uVar12 = uVar10;
      uVar10 = uVar12 - 1;
      if (uVar10 == 0xffffffffffffffff) {
        uVar12 = 0;
        break;
      }
    } while (local_a8[uVar10] == 0);
    uVar10 = (ulong)local_c0._2_2_;
    do {
      uVar11 = uVar10;
      uVar10 = uVar11 - 1;
      if (uVar10 == 0xffffffffffffffff) {
        uVar11 = 0;
        if (uVar12 != 0) goto LAB_00b82f68;
        goto LAB_00b82f90;
      }
    } while (*(long *)(local_c8 + uVar10 * 8) == 0);
    if (uVar11 != 0 || uVar12 != 0) {
LAB_00b82f68:
      if (uVar11 < uVar12) {
        if ((ushort)local_a0 != 0) goto LAB_00b82e20;
        goto LAB_00b82f90;
      }
      if (uVar12 < uVar11) {
        iVar14 = -(int)(short)local_c0;
joined_r0x00b830e8:
        if (iVar14 == 0) goto LAB_00b82f90;
      }
      else {
        iVar14 = (int)(short)(ushort)local_a0;
        if (iVar14 < 1) {
          if ((iVar14 == 0) || ((short)local_c0 < 1)) goto LAB_00b830bc;
        }
        else if (-1 < (short)local_c0) {
LAB_00b830bc:
          do {
            if (uVar12 == 0) goto LAB_00b82f90;
            lVar1 = uVar12 - 1;
            uVar10 = *(ulong *)(local_c8 + uVar12 * 8 + -8);
            uVar12 = uVar12 - 1;
          } while (((ulong)local_a8[lVar1] <= uVar10) && (uVar10 <= (ulong)local_a8[lVar1]));
          goto joined_r0x00b830e8;
        }
      }
      goto LAB_00b82e20;
    }
LAB_00b82f90:
    uVar10 = (ulong)local_b0._2_2_;
    do {
      uVar12 = uVar10;
      uVar10 = uVar12 - 1;
      if (uVar10 == 0xffffffffffffffff) {
        uVar12 = 0;
        break;
      }
    } while (local_b8[uVar10] == 0);
    uVar10 = (ulong)local_d0._2_2_;
    do {
      uVar11 = uVar10;
      uVar10 = uVar11 - 1;
      if (uVar10 == 0xffffffffffffffff) {
        uVar11 = 0;
        if (uVar12 != 0) goto LAB_00b82ff8;
        goto LAB_00b83020;
      }
    } while (*(long *)(local_d8 + uVar10 * 8) == 0);
    if (uVar11 != 0 || uVar12 != 0) {
LAB_00b82ff8:
      if (uVar11 < uVar12) {
        if ((ushort)local_b0 != 0) goto LAB_00b82e20;
        goto LAB_00b83020;
      }
      if (uVar12 < uVar11) {
        iVar14 = -(int)(short)local_d0;
joined_r0x00b83130:
        if (iVar14 == 0) goto LAB_00b83020;
      }
      else {
        iVar14 = (int)(short)(ushort)local_b0;
        if (iVar14 < 1) {
          if ((iVar14 == 0) || ((short)local_d0 < 1)) goto LAB_00b83104;
        }
        else if (-1 < (short)local_d0) {
LAB_00b83104:
          do {
            if (uVar12 == 0) goto LAB_00b83020;
            lVar1 = uVar12 - 1;
            uVar10 = *(ulong *)(local_d8 + uVar12 * 8 + -8);
            uVar12 = uVar12 - 1;
          } while (((ulong)local_b8[lVar1] <= uVar10) && (uVar10 <= (ulong)local_b8[lVar1]));
          goto joined_r0x00b83130;
        }
      }
      goto LAB_00b82e20;
    }
LAB_00b83020:
    if (param_1 != 0) {
      puts("passed");
    }
    uVar6 = FUN_00b80638(&local_a8,&local_78,&local_88,0,&local_98,0);
    if ((uVar6 != 0) ||
       (uVar6 = mbedtls_mpi_read_string
                          (&local_c8,0x10,
                           "36E139AEA55215609D2816998ED020BBBD96C37890F65171D948E9BC7CBAA4D9325D24D6A3C12710F10A09FA08AB87"
                          ), uVar6 != 0)) goto LAB_00b82c48;
    if (param_1 != 0) {
      printf("  MPI test #3 (exp_mod): ");
    }
    uVar10 = (ulong)local_a0._2_2_;
    do {
      uVar12 = uVar10;
      uVar10 = uVar12 - 1;
      if (uVar10 == 0xffffffffffffffff) {
        uVar12 = 0;
        break;
      }
    } while (local_a8[uVar10] == 0);
    uVar10 = (ulong)local_c0._2_2_;
    do {
      uVar11 = uVar10;
      uVar10 = uVar11 - 1;
      if (uVar10 == 0xffffffffffffffff) {
        uVar11 = 0;
        if (uVar12 != 0) goto LAB_00b83198;
        goto LAB_00b831c0;
      }
    } while (*(long *)(local_c8 + uVar10 * 8) == 0);
    if (uVar11 != 0 || uVar12 != 0) {
LAB_00b83198:
      if (uVar11 < uVar12) {
        if ((ushort)local_a0 != 0) goto LAB_00b82e20;
        goto LAB_00b831c0;
      }
      if (uVar12 < uVar11) {
        iVar14 = -(int)(short)local_c0;
joined_r0x00b8327c:
        if (iVar14 == 0) goto LAB_00b831c0;
      }
      else {
        iVar14 = (int)(short)(ushort)local_a0;
        if (iVar14 < 1) {
          if ((iVar14 == 0) || ((short)local_c0 < 1)) goto LAB_00b83250;
        }
        else if (-1 < (short)local_c0) {
LAB_00b83250:
          do {
            if (uVar12 == 0) goto LAB_00b831c0;
            lVar1 = uVar12 - 1;
            uVar10 = *(ulong *)(local_c8 + uVar12 * 8 + -8);
            uVar12 = uVar12 - 1;
          } while (((ulong)local_a8[lVar1] <= uVar10) && (uVar10 <= (ulong)local_a8[lVar1]));
          goto joined_r0x00b8327c;
        }
      }
      goto LAB_00b82e20;
    }
LAB_00b831c0:
    if (param_1 != 0) {
      puts("passed");
    }
    uVar6 = mbedtls_mpi_inv_mod(&local_a8,&local_78,&local_98);
    if ((uVar6 != 0) ||
       (uVar6 = mbedtls_mpi_read_string
                          (&local_c8,0x10,
                           "003A0AAEDD7E784FC07D8F9EC6E3BFD5C3DBA76456363A10869622EAC2DD84ECC5B8A74DAC4D09E03B5E0BE779F2DF61"
                          ), uVar6 != 0)) goto LAB_00b82c48;
    if (param_1 != 0) {
      printf("  MPI test #4 (inv_mod): ");
    }
    uVar10 = (ulong)local_a0._2_2_;
    do {
      uVar12 = uVar10;
      uVar10 = uVar12 - 1;
      if (uVar10 == 0xffffffffffffffff) {
        uVar12 = 0;
        break;
      }
    } while (local_a8[uVar10] == 0);
    uVar10 = (ulong)local_c0._2_2_;
    do {
      uVar11 = uVar10;
      uVar10 = uVar11 - 1;
      if (uVar10 == 0xffffffffffffffff) {
        uVar11 = 0;
        if (uVar12 != 0) goto LAB_00b832d4;
        goto LAB_00b832fc;
      }
    } while (*(long *)(local_c8 + uVar10 * 8) == 0);
    if (uVar11 != 0 || uVar12 != 0) {
LAB_00b832d4:
      if (uVar12 <= uVar11) {
        if (uVar12 < uVar11) {
          iVar14 = -(int)(short)local_c0;
joined_r0x00b835ac:
          if (iVar14 == 0) goto LAB_00b832fc;
        }
        else {
          iVar14 = (int)(short)(ushort)local_a0;
          if (iVar14 < 1) {
            if ((iVar14 == 0) || ((short)local_c0 < 1)) goto LAB_00b83580;
          }
          else if (-1 < (short)local_c0) {
LAB_00b83580:
            do {
              if (uVar12 == 0) goto LAB_00b832fc;
              lVar1 = uVar12 - 1;
              uVar10 = *(ulong *)(local_c8 + uVar12 * 8 + -8);
              uVar12 = uVar12 - 1;
            } while (((ulong)local_a8[lVar1] <= uVar10) && (uVar10 <= (ulong)local_a8[lVar1]));
            goto joined_r0x00b835ac;
          }
        }
LAB_00b82e20:
        if (param_1 == 0) {
LAB_00b83558:
          bVar5 = false;
          uVar6 = 1;
          uVar3 = local_70;
          goto joined_r0x00b835d8;
        }
        puts("failed");
LAB_00b82e30:
        uVar6 = 1;
        goto LAB_00b82c48;
      }
      if ((ushort)local_a0 != 0) goto LAB_00b82e20;
    }
LAB_00b832fc:
    if (param_1 != 0) {
      puts("passed");
      printf("  MPI test #5 (simple gcd): ");
    }
    uVar10 = 0;
    do {
      if ((ulong)local_a0._2_2_ == 0) {
        plVar8 = calloc(1,8);
        plVar4 = local_a8;
        if (plVar8 != (long *)0x0) {
          if (local_a8 != (long *)0x0) {
            memcpy(plVar8,local_a8,0);
            mbedtls_zeroize_and_free(plVar4,0);
          }
          sVar9 = 8;
          local_a0._2_2_ = 1;
          local_a8 = plVar8;
          goto LAB_00b83388;
        }
LAB_00b835b4:
        uVar6 = 0xfffffff0;
        goto LAB_00b82c48;
      }
      sVar9 = (ulong)local_a0._2_2_ << 3;
LAB_00b83388:
      iVar14 = (&DAT_00780530)[uVar10 * 3];
      lVar15 = (long)iVar14;
      memset(local_a8,0,sVar9);
      lVar1 = -lVar15;
      if (-1 < lVar15) {
        lVar1 = lVar15;
      }
      *local_a8 = lVar1;
      local_a0._0_2_ = (ushort)(iVar14 >> 0x1f) | 1;
      if ((ulong)local_b0._2_2_ == 0) {
        plVar8 = calloc(1,8);
        plVar4 = local_b8;
        if (plVar8 == (long *)0x0) goto LAB_00b835b4;
        if (local_b8 != (long *)0x0) {
          memcpy(plVar8,local_b8,0);
          mbedtls_zeroize_and_free(plVar4,0);
        }
        sVar9 = 8;
        local_b0._2_2_ = 1;
        local_b8 = plVar8;
      }
      else {
        sVar9 = (ulong)local_b0._2_2_ << 3;
      }
      iVar14 = (&DAT_00780534)[uVar10 * 3];
      lVar15 = (long)iVar14;
      memset(local_b8,0,sVar9);
      lVar1 = -lVar15;
      if (-1 < lVar15) {
        lVar1 = lVar15;
      }
      local_b0._0_2_ = (ushort)(iVar14 >> 0x1f) | 1;
      *local_b8 = lVar1;
      uVar6 = mbedtls_mpi_gcd(&local_78,&local_a8,&local_b8);
      if (uVar6 != 0) goto LAB_00b82c48;
      uVar11 = (ulong)(int)(&DAT_00780538)[uVar10 * 3];
      uVar12 = -uVar11;
      if (-1 < (long)uVar11) {
        uVar12 = uVar11;
      }
      uVar6 = (int)(&DAT_00780538)[uVar10 * 3] >> 0x1f | 1;
      uVar11 = (ulong)local_70._2_2_;
      do {
        uVar13 = uVar11;
        uVar11 = uVar13 - 1;
        if (uVar11 == 0xffffffffffffffff) {
          uVar13 = 0;
          break;
        }
      } while (*(long *)(local_78 + uVar11 * 8) == 0);
      uVar11 = 2;
      do {
        uVar11 = uVar11 - 1;
        if (uVar11 == 0) break;
      } while (uVar12 == 0);
      if (uVar11 != 0 || uVar13 != 0) {
        if (uVar11 < uVar13) {
          if ((short)local_70 == 0) goto LAB_00b8351c;
        }
        else if (uVar11 <= uVar13) {
          iVar14 = (int)(short)local_70;
          if ((short)local_70 < 1) {
            if (((int)uVar6 < 1) || ((short)local_70 == 0)) goto LAB_00b834f8;
          }
          else if (-1 < (int)uVar6) {
LAB_00b834f8:
            do {
              if (uVar13 == 0) goto LAB_00b8351c;
              uVar11 = *(ulong *)(local_78 + uVar13 * 8 + -8);
              uVar13 = uVar13 - 1;
              if (uVar12 < uVar11) goto LAB_00b83518;
            } while (uVar12 <= uVar11);
            iVar14 = -(int)(short)local_70;
LAB_00b83518:
            if (iVar14 == 0) goto LAB_00b8351c;
          }
        }
        if (param_1 == 0) goto LAB_00b83558;
        printf("failed at %d\n",(int)uVar10);
        goto LAB_00b82e30;
      }
LAB_00b8351c:
      uVar10 = uVar10 + 1;
    } while (uVar10 < 3);
    if (param_1 == 0) {
      bVar5 = false;
      uVar6 = 0;
      uVar3 = local_70;
      goto joined_r0x00b835d8;
    }
    puts("passed");
    uVar6 = 0;
  }
  else {
LAB_00b82c48:
    bVar5 = param_1 != 0;
    uVar3 = local_70;
    if ((param_1 == 0) || (uVar6 == 0)) goto joined_r0x00b835d8;
    printf("Unexpected error, return code = %08X\n",uVar6);
  }
  bVar5 = true;
  uVar3 = local_70;
joined_r0x00b835d8:
  if (local_78 != 0) {
    local_70._2_2_ = (ushort)((uint)uVar3 >> 0x10);
    uVar10 = (ulong)local_70._2_2_;
    local_70 = uVar3;
    mbedtls_zeroize_and_free(local_78,uVar10 << 3);
  }
  local_70 = 1;
  local_78 = 0;
  if (local_88 != 0) {
    mbedtls_zeroize_and_free(local_88,(ulong)local_80._2_2_ << 3);
  }
  local_80 = 1;
  local_88 = 0;
  if (local_98 != 0) {
    mbedtls_zeroize_and_free(local_98,(ulong)local_90._2_2_ << 3);
  }
  local_90 = 1;
  local_98 = 0;
  if (local_a8 != (long *)0x0) {
    mbedtls_zeroize_and_free(local_a8,(ulong)local_a0._2_2_ << 3);
  }
  local_a0 = 1;
  local_a8 = (long *)0x0;
  if (local_b8 != (long *)0x0) {
    mbedtls_zeroize_and_free(local_b8,(ulong)local_b0._2_2_ << 3);
  }
  local_b0 = 1;
  local_b8 = (long *)0x0;
  if (local_c8 != 0) {
    mbedtls_zeroize_and_free(local_c8,(ulong)local_c0._2_2_ << 3);
  }
  local_c0 = 1;
  local_c8 = 0;
  uVar10 = 0;
  if (local_d8 != 0) {
    uVar10 = mbedtls_zeroize_and_free(local_d8,(ulong)local_d0._2_2_ << 3);
  }
  local_d0 = 1;
  local_d8 = 0;
  if (bVar5) {
    uVar7 = putchar(10);
    uVar10 = (ulong)uVar7;
  }
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar10);
  }
  return uVar6;
}

