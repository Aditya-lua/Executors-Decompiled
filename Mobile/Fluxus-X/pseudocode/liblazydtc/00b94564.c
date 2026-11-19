/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b94564
 */

/* WARNING: Type propagation algorithm not settling */

int mbedtls_ecp_read_key(int param_1,long param_2,undefined8 param_3,long param_4)

{
  int iVar1;
  undefined8 uVar2;
  long lVar3;
  
  iVar1 = mbedtls_ecp_group_load(param_2,param_1);
  if (iVar1 != 0) {
    return iVar1;
  }
  if (*(long *)(param_2 + 0x38) == 0) {
    iVar1 = -0x4e80;
    goto LAB_00b9471c;
  }
  if (*(long *)(param_2 + 0x48) == 0) {
    if (param_1 == 0xd) {
      if (param_4 != 0x38) {
        return -0x4c80;
      }
      lVar3 = param_2 + 0xc0;
      iVar1 = mbedtls_mpi_read_binary_le(lVar3,param_3,0x38);
      if (((iVar1 != 0) || (iVar1 = mbedtls_mpi_set_bit(lVar3,0,0), iVar1 != 0)) ||
         (iVar1 = mbedtls_mpi_set_bit(lVar3,1,0), iVar1 != 0)) goto LAB_00b9471c;
      uVar2 = 0x1bf;
LAB_00b946dc:
      iVar1 = mbedtls_mpi_set_bit(param_2 + 0xc0,uVar2,1);
      if (iVar1 != 0) goto LAB_00b9471c;
      goto LAB_00b945b0;
    }
    if (param_1 == 9) {
      if (param_4 != 0x20) {
        return -0x4c80;
      }
      lVar3 = param_2 + 0xc0;
      iVar1 = mbedtls_mpi_read_binary_le(lVar3,param_3,0x20);
      if (((iVar1 != 0) || (iVar1 = mbedtls_mpi_set_bit(lVar3,0,0), iVar1 != 0)) ||
         ((iVar1 = mbedtls_mpi_set_bit(lVar3,1,0), iVar1 != 0 ||
          ((iVar1 = mbedtls_mpi_set_bit(lVar3,2,0), iVar1 != 0 ||
           (iVar1 = mbedtls_mpi_set_bit(lVar3,0xff,0), iVar1 != 0)))))) goto LAB_00b9471c;
      uVar2 = 0xfe;
      goto LAB_00b946dc;
    }
    iVar1 = -0x4e80;
    lVar3 = *(long *)(param_2 + 0x38);
  }
  else {
    iVar1 = -0x4e80;
LAB_00b945b0:
    lVar3 = *(long *)(param_2 + 0x38);
  }
  if ((lVar3 != 0) && (*(long *)(param_2 + 0x48) != 0)) {
    iVar1 = mbedtls_mpi_read_binary(param_2 + 0xc0,param_3,param_4);
  }
  if ((iVar1 == 0) && (iVar1 = mbedtls_ecp_check_privkey(param_2,param_2 + 0xc0), iVar1 == 0)) {
    return 0;
  }
LAB_00b9471c:
  mbedtls_mpi_free(param_2 + 0xc0);
  return iVar1;
}

