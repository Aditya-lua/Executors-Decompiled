/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b954dc
 */

void FUN_00b954dc(long param_1,long param_2,long param_3,long param_4)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  int iVar5;
  long lVar6;
  
  DAT_00d26010 = DAT_00d26010 + 1;
  lVar1 = param_4 + 0x10;
  if (*(long *)(param_1 + 0x18) == 0) {
    iVar5 = FUN_00b953d4(param_1,lVar1,param_3 + 0x20,param_3 + 0x20);
    if (iVar5 != 0) {
      return;
    }
    lVar2 = param_4 + 0x20;
    iVar5 = mbedtls_mpi_add_mpi(lVar2,param_3,lVar1);
    if (iVar5 != 0) {
      return;
    }
    lVar6 = param_1 + 8;
    while (iVar5 = mbedtls_mpi_cmp_mpi(lVar2,lVar6), -1 < iVar5) {
      iVar5 = mbedtls_mpi_sub_abs(lVar2,lVar2,lVar6);
      if (iVar5 != 0) {
        return;
      }
    }
    lVar3 = param_4 + 0x30;
    iVar5 = mbedtls_mpi_sub_mpi(lVar3,param_3,lVar1);
    while( true ) {
      if (iVar5 != 0) {
        return;
      }
      if ((-1 < *(short *)(param_4 + 0x38)) || (iVar5 = mbedtls_mpi_cmp_int(lVar3,0), iVar5 == 0))
      break;
      iVar5 = mbedtls_mpi_add_mpi(lVar3,lVar3,lVar6);
    }
    iVar5 = FUN_00b953d4(param_1,lVar1,lVar2,lVar3);
    if (iVar5 != 0) {
      return;
    }
    iVar5 = mbedtls_mpi_mul_int(param_4,lVar1,3);
    while( true ) {
      if (iVar5 != 0) {
        return;
      }
      iVar5 = mbedtls_mpi_cmp_mpi(param_4,lVar6);
      if (iVar5 < 0) break;
      iVar5 = mbedtls_mpi_sub_abs(param_4,param_4,lVar6);
    }
  }
  else {
    iVar5 = FUN_00b953d4(param_1,lVar1,param_3,param_3);
    if (iVar5 != 0) {
      return;
    }
    iVar5 = mbedtls_mpi_mul_int(param_4,lVar1,3);
    if (iVar5 != 0) {
      return;
    }
    lVar2 = param_1 + 8;
    while (iVar5 = mbedtls_mpi_cmp_mpi(param_4,lVar2), -1 < iVar5) {
      iVar5 = mbedtls_mpi_sub_abs(param_4,param_4,lVar2);
      if (iVar5 != 0) {
        return;
      }
    }
    iVar5 = mbedtls_mpi_cmp_int(param_1 + 0x18,0);
    if (iVar5 != 0) {
      iVar5 = FUN_00b953d4(param_1,lVar1,param_3 + 0x20,param_3 + 0x20);
      if (iVar5 != 0) {
        return;
      }
      iVar5 = FUN_00b953d4(param_1,param_4 + 0x20,lVar1,lVar1);
      if (iVar5 != 0) {
        return;
      }
      iVar5 = FUN_00b953d4(param_1,lVar1,param_4 + 0x20,param_1 + 0x18);
      if (iVar5 != 0) {
        return;
      }
      iVar5 = mbedtls_mpi_add_mpi(param_4,param_4,lVar1);
      while( true ) {
        if (iVar5 != 0) {
          return;
        }
        iVar5 = mbedtls_mpi_cmp_mpi(param_4,lVar2);
        if (iVar5 < 0) break;
        iVar5 = mbedtls_mpi_sub_abs(param_4,param_4,lVar2);
      }
    }
  }
  lVar6 = param_4 + 0x20;
  lVar2 = param_3 + 0x10;
  iVar5 = FUN_00b953d4(param_1,lVar6,lVar2,lVar2);
  if ((iVar5 == 0) && (iVar5 = mbedtls_mpi_shift_l(lVar6,1), iVar5 == 0)) {
    lVar3 = param_1 + 8;
    do {
      iVar5 = mbedtls_mpi_cmp_mpi(lVar6,lVar3);
      if (iVar5 < 0) {
        iVar5 = FUN_00b953d4(param_1,lVar1,param_3,lVar6);
        if (iVar5 != 0) {
          return;
        }
        iVar5 = mbedtls_mpi_shift_l(lVar1,1);
        while( true ) {
          if (iVar5 != 0) {
            return;
          }
          iVar5 = mbedtls_mpi_cmp_mpi(lVar1,lVar3);
          if (iVar5 < 0) break;
          iVar5 = mbedtls_mpi_sub_abs(lVar1,lVar1,lVar3);
        }
        lVar4 = param_4 + 0x30;
        iVar5 = FUN_00b953d4(param_1,lVar4,lVar6,lVar6);
        if (iVar5 != 0) {
          return;
        }
        iVar5 = mbedtls_mpi_shift_l(lVar4,1);
        while( true ) {
          if (iVar5 != 0) {
            return;
          }
          iVar5 = mbedtls_mpi_cmp_mpi(lVar4,lVar3);
          if (iVar5 < 0) break;
          iVar5 = mbedtls_mpi_sub_abs(lVar4,lVar4,lVar3);
        }
        iVar5 = FUN_00b953d4(param_1,lVar6,param_4,param_4);
        if (iVar5 != 0) {
          return;
        }
        iVar5 = mbedtls_mpi_sub_mpi(lVar6,lVar6,lVar1);
        while( true ) {
          if (iVar5 != 0) {
            return;
          }
          if ((-1 < *(short *)(param_4 + 0x28)) ||
             (iVar5 = mbedtls_mpi_cmp_int(lVar6,0), iVar5 == 0)) break;
          iVar5 = mbedtls_mpi_add_mpi(lVar6,lVar6,lVar3);
        }
        iVar5 = mbedtls_mpi_sub_mpi(lVar6,lVar6,lVar1);
        while( true ) {
          if (iVar5 != 0) {
            return;
          }
          if ((-1 < *(short *)(param_4 + 0x28)) ||
             (iVar5 = mbedtls_mpi_cmp_int(lVar6,0), iVar5 == 0)) break;
          iVar5 = mbedtls_mpi_add_mpi(lVar6,lVar6,lVar3);
        }
        iVar5 = mbedtls_mpi_sub_mpi(lVar1,lVar1,lVar6);
        while( true ) {
          if (iVar5 != 0) {
            return;
          }
          if ((-1 < *(short *)(param_4 + 0x18)) ||
             (iVar5 = mbedtls_mpi_cmp_int(lVar1,0), iVar5 == 0)) break;
          iVar5 = mbedtls_mpi_add_mpi(lVar1,lVar1,lVar3);
        }
        iVar5 = FUN_00b953d4(param_1,lVar1,lVar1,param_4);
        if (iVar5 != 0) {
          return;
        }
        iVar5 = mbedtls_mpi_sub_mpi(lVar1,lVar1,lVar4);
        while( true ) {
          if (iVar5 != 0) {
            return;
          }
          if ((-1 < *(short *)(param_4 + 0x18)) ||
             (iVar5 = mbedtls_mpi_cmp_int(lVar1,0), iVar5 == 0)) break;
          iVar5 = mbedtls_mpi_add_mpi(lVar1,lVar1,lVar3);
        }
        iVar5 = FUN_00b953d4(param_1,lVar4,lVar2,param_3 + 0x20);
        if (iVar5 != 0) {
          return;
        }
        iVar5 = mbedtls_mpi_shift_l(lVar4,1);
        while( true ) {
          if (iVar5 != 0) {
            return;
          }
          iVar5 = mbedtls_mpi_cmp_mpi(lVar4,lVar3);
          if (iVar5 < 0) break;
          iVar5 = mbedtls_mpi_sub_abs(lVar4,lVar4,lVar3);
        }
        iVar5 = mbedtls_mpi_copy(param_2,lVar6);
        if (iVar5 != 0) {
          return;
        }
        iVar5 = mbedtls_mpi_copy(param_2 + 0x10,lVar1);
        if (iVar5 == 0) {
          mbedtls_mpi_copy(param_2 + 0x20,lVar4);
          return;
        }
        return;
      }
      iVar5 = mbedtls_mpi_sub_abs(lVar6,lVar6,lVar3);
    } while (iVar5 == 0);
  }
  return;
}

