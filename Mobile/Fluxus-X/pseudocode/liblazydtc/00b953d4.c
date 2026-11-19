/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b953d4
 */

undefined8 FUN_00b953d4(long param_1,long param_2,undefined8 param_3,undefined8 param_4)

{
  int iVar1;
  undefined8 uVar2;
  ulong uVar3;
  
  uVar2 = mbedtls_mpi_mul_mpi(param_2,param_3,param_4);
  if ((int)uVar2 != 0) {
    return uVar2;
  }
  if (*(long *)(param_1 + 0x90) == 0) {
    uVar2 = mbedtls_mpi_mod_mpi(param_2,param_2,param_1 + 8);
    if ((int)uVar2 != 0) {
      return uVar2;
    }
  }
  else {
    if (((*(short *)(param_2 + 8) < 0) && (iVar1 = mbedtls_mpi_cmp_int(param_2,0), iVar1 != 0)) ||
       (uVar3 = mbedtls_mpi_bitlen(param_2), (ulong)(*(long *)(param_1 + 0x78) * 2) < uVar3)) {
      return 0xffffb080;
    }
    uVar2 = (**(code **)(param_1 + 0x90))(param_2);
    if ((int)uVar2 != 0) {
      return uVar2;
    }
    param_1 = param_1 + 8;
    while ((*(short *)(param_2 + 8) < 0 && (iVar1 = mbedtls_mpi_cmp_int(param_2,0), iVar1 != 0))) {
      uVar2 = mbedtls_mpi_add_mpi(param_2,param_2,param_1);
      if ((int)uVar2 != 0) {
        return uVar2;
      }
    }
    while (iVar1 = mbedtls_mpi_cmp_mpi(param_2,param_1), -1 < iVar1) {
      uVar2 = mbedtls_mpi_sub_abs(param_2,param_2,param_1);
      if ((int)uVar2 != 0) {
        return uVar2;
      }
    }
  }
  DAT_00d26008 = DAT_00d26008 + 1;
  return 0;
}

