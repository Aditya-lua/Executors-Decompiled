/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b93970
 */

undefined8 FUN_00b93970(long param_1,long param_2,long param_3,long param_4,long param_5)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long lVar5;
  long lVar6;
  int iVar7;
  undefined8 uVar8;
  long *plVar9;
  
  DAT_00d26018 = DAT_00d26018 + 1;
  plVar9 = (long *)(param_4 + 0x20);
  if (*plVar9 == 0) {
    return 0xffffb080;
  }
  plVar1 = (long *)(param_3 + 0x20);
  lVar2 = param_2 + 0x10;
  lVar3 = param_2 + 0x20;
  iVar7 = mbedtls_mpi_cmp_int(plVar1,0);
  if (iVar7 == 0) {
    uVar8 = mbedtls_mpi_copy(param_2,param_4);
    if ((int)uVar8 != 0) {
      return uVar8;
    }
    uVar8 = mbedtls_mpi_copy(lVar2,param_4 + 0x10);
    if ((int)uVar8 != 0) {
      return uVar8;
    }
  }
  else {
    iVar7 = mbedtls_mpi_cmp_int(plVar9,0);
    if (iVar7 != 0) {
      iVar7 = mbedtls_mpi_cmp_int(plVar9,1);
      if (iVar7 != 0) {
        return 0xffffb080;
      }
      uVar8 = FUN_00b953d4(param_1,param_5,plVar1,plVar1);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      lVar4 = param_5 + 0x10;
      uVar8 = FUN_00b953d4(param_1,lVar4,param_5,plVar1);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      uVar8 = FUN_00b953d4(param_1,param_5,param_5,param_4);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      uVar8 = FUN_00b953d4(param_1,lVar4,lVar4,param_4 + 0x10);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      uVar8 = mbedtls_mpi_sub_mpi(param_5,param_5,param_3);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      lVar5 = param_1 + 8;
      while ((*(short *)(param_5 + 8) < 0 && (iVar7 = mbedtls_mpi_cmp_int(param_5,0), iVar7 != 0)))
      {
        uVar8 = mbedtls_mpi_add_mpi(param_5,param_5,lVar5);
        if ((int)uVar8 != 0) {
          return uVar8;
        }
      }
      uVar8 = mbedtls_mpi_sub_mpi(lVar4,lVar4,param_3 + 0x10);
      iVar7 = (int)uVar8;
      while( true ) {
        if (iVar7 != 0) {
          return uVar8;
        }
        if ((-1 < *(short *)(param_5 + 0x18)) || (iVar7 = mbedtls_mpi_cmp_int(lVar4,0), iVar7 == 0))
        break;
        uVar8 = mbedtls_mpi_add_mpi(lVar4,lVar4,lVar5);
        iVar7 = (int)uVar8;
      }
      iVar7 = mbedtls_mpi_cmp_int(param_5,0);
      if (iVar7 == 0) {
        iVar7 = mbedtls_mpi_cmp_int(lVar4,0);
        if (iVar7 == 0) {
          uVar8 = FUN_00b954dc(param_1,param_2,param_3,param_5);
          return uVar8;
        }
        uVar8 = mbedtls_mpi_lset(param_2,1);
        if ((int)uVar8 != 0) {
          return uVar8;
        }
        uVar8 = mbedtls_mpi_lset(lVar2,1);
        if ((int)uVar8 == 0) {
          uVar8 = mbedtls_mpi_lset(lVar3,0);
          return uVar8;
        }
        return uVar8;
      }
      uVar8 = FUN_00b953d4(param_1,lVar3,plVar1,param_5);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      lVar3 = param_5 + 0x20;
      uVar8 = FUN_00b953d4(param_1,lVar3,param_5,param_5);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      lVar6 = param_5 + 0x30;
      uVar8 = FUN_00b953d4(param_1,lVar6,lVar3,param_5);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      uVar8 = FUN_00b953d4(param_1,lVar3,lVar3,param_3);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      uVar8 = mbedtls_mpi_copy(param_5,lVar3);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      uVar8 = mbedtls_mpi_shift_l(param_5,1);
      iVar7 = (int)uVar8;
      while( true ) {
        if (iVar7 != 0) {
          return uVar8;
        }
        iVar7 = mbedtls_mpi_cmp_mpi(param_5,lVar5);
        if (iVar7 < 0) break;
        uVar8 = mbedtls_mpi_sub_abs(param_5,param_5,lVar5);
        iVar7 = (int)uVar8;
      }
      uVar8 = FUN_00b953d4(param_1,param_2,lVar4,lVar4);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      uVar8 = mbedtls_mpi_sub_mpi(param_2,param_2,param_5);
      iVar7 = (int)uVar8;
      while( true ) {
        if (iVar7 != 0) {
          return uVar8;
        }
        if ((-1 < *(short *)(param_2 + 8)) || (iVar7 = mbedtls_mpi_cmp_int(param_2,0), iVar7 == 0))
        break;
        uVar8 = mbedtls_mpi_add_mpi(param_2,param_2,lVar5);
        iVar7 = (int)uVar8;
      }
      uVar8 = mbedtls_mpi_sub_mpi(param_2,param_2,lVar6);
      iVar7 = (int)uVar8;
      while( true ) {
        if (iVar7 != 0) {
          return uVar8;
        }
        if ((-1 < *(short *)(param_2 + 8)) || (iVar7 = mbedtls_mpi_cmp_int(param_2,0), iVar7 == 0))
        break;
        uVar8 = mbedtls_mpi_add_mpi(param_2,param_2,lVar5);
        iVar7 = (int)uVar8;
      }
      uVar8 = mbedtls_mpi_sub_mpi(lVar3,lVar3,param_2);
      iVar7 = (int)uVar8;
      while( true ) {
        if (iVar7 != 0) {
          return uVar8;
        }
        if ((-1 < *(short *)(param_5 + 0x28)) || (iVar7 = mbedtls_mpi_cmp_int(lVar3,0), iVar7 == 0))
        break;
        uVar8 = mbedtls_mpi_add_mpi(lVar3,lVar3,lVar5);
        iVar7 = (int)uVar8;
      }
      uVar8 = FUN_00b953d4(param_1,lVar3,lVar3,lVar4);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      uVar8 = FUN_00b953d4(param_1,lVar6,lVar6,param_3 + 0x10);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      uVar8 = mbedtls_mpi_sub_mpi(lVar2,lVar3,lVar6);
      if ((int)uVar8 != 0) {
        return uVar8;
      }
      while( true ) {
        if (-1 < *(short *)(param_2 + 0x18)) {
          return 0;
        }
        uVar8 = mbedtls_mpi_cmp_int(lVar2,0);
        if ((int)uVar8 == 0) break;
        uVar8 = mbedtls_mpi_add_mpi(lVar2,lVar2,lVar5);
        if ((int)uVar8 != 0) {
          return uVar8;
        }
      }
      return uVar8;
    }
    uVar8 = mbedtls_mpi_copy(param_2,param_3);
    if ((int)uVar8 != 0) {
      return uVar8;
    }
    uVar8 = mbedtls_mpi_copy(lVar2,param_3 + 0x10);
    if ((int)uVar8 != 0) {
      return uVar8;
    }
    plVar9 = plVar1;
  }
  uVar8 = mbedtls_mpi_copy(lVar3,plVar9);
  return uVar8;
}

