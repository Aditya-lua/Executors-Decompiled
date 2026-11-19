/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b94180
 */

int mbedtls_ecp_check_privkey(long param_1,undefined8 param_2)

{
  int iVar1;
  int iVar2;
  long lVar3;
  
  if (*(long *)(param_1 + 0x38) == 0) {
    iVar2 = -0x4f80;
  }
  else if (*(long *)(param_1 + 0x48) == 0) {
    iVar2 = mbedtls_mpi_get_bit(param_2,0);
    if ((iVar2 == 0) && (iVar2 = mbedtls_mpi_get_bit(param_2,1), iVar2 == 0)) {
      lVar3 = mbedtls_mpi_bitlen(param_2);
      if ((lVar3 + -1 == *(long *)(param_1 + 0x80)) &&
         ((lVar3 + -1 != 0xfe || (iVar2 = mbedtls_mpi_get_bit(param_2,2), iVar2 == 0)))) {
        return 0;
      }
    }
    iVar2 = -0x4c80;
  }
  else {
    iVar1 = mbedtls_mpi_cmp_int(param_2,1);
    iVar2 = -0x4c80;
    if (-1 < iVar1) {
      iVar2 = mbedtls_mpi_cmp_mpi(param_2,param_1 + 0x68);
      return (iVar2 >> 0x1f & 0x4c80U) - 0x4c80;
    }
  }
  return iVar2;
}

