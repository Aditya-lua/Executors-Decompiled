/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b952ac
 */

undefined8 FUN_00b952ac(long param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  uVar2 = FUN_00b953d4();
  if ((int)uVar2 != 0) {
    return uVar2;
  }
  if (*(long *)(param_1 + 0x18) == 0) {
    uVar2 = mbedtls_mpi_sub_int(param_2,param_2,3);
    if ((int)uVar2 != 0) {
      return uVar2;
    }
    while ((*(short *)(param_2 + 8) < 0 && (iVar1 = mbedtls_mpi_cmp_int(param_2,0), iVar1 != 0))) {
      uVar2 = mbedtls_mpi_add_mpi(param_2,param_2,param_1 + 8);
      if ((int)uVar2 != 0) {
        return uVar2;
      }
    }
  }
  else {
    uVar2 = mbedtls_mpi_add_mpi(param_2,param_2,param_1 + 0x18);
    if ((int)uVar2 != 0) {
      return uVar2;
    }
    while (iVar1 = mbedtls_mpi_cmp_mpi(param_2,param_1 + 8), -1 < iVar1) {
      uVar2 = mbedtls_mpi_sub_abs(param_2,param_2,param_1 + 8);
      if ((int)uVar2 != 0) {
        return uVar2;
      }
    }
  }
  uVar2 = FUN_00b953d4(param_1,param_2,param_2,param_3);
  if (((int)uVar2 == 0) &&
     (uVar2 = mbedtls_mpi_add_mpi(param_2,param_2,param_1 + 0x28), (int)uVar2 == 0)) {
    do {
      iVar1 = mbedtls_mpi_cmp_mpi(param_2,param_1 + 8);
      if (iVar1 < 0) {
        return 0;
      }
      uVar2 = mbedtls_mpi_sub_abs(param_2,param_2,param_1 + 8);
    } while ((int)uVar2 == 0);
  }
  return uVar2;
}

