/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baaa44
 */

int mbedtls_rsa_deduce_private_exponent
              (undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_68 [16];
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  if ((((param_4 == 0) || (iVar2 = mbedtls_mpi_cmp_int(param_4,0), iVar2 != 0)) ||
      (iVar2 = mbedtls_mpi_cmp_int(param_1,1), iVar2 < 1)) ||
     ((iVar2 = mbedtls_mpi_cmp_int(param_2,1), iVar2 < 1 ||
      (iVar2 = mbedtls_mpi_cmp_int(param_3,0), iVar2 == 0)))) {
    iVar2 = -4;
  }
  else {
    mbedtls_mpi_init(auStack_58);
    mbedtls_mpi_init(auStack_68);
    iVar2 = mbedtls_mpi_sub_int(auStack_58,param_1,1);
    if (iVar2 == 0) {
      iVar2 = mbedtls_mpi_sub_int(auStack_68,param_2,1);
      if (iVar2 == 0) {
        iVar2 = mbedtls_mpi_gcd(param_4,auStack_58,auStack_68);
        if (iVar2 == 0) {
          iVar2 = mbedtls_mpi_mul_mpi(auStack_58,auStack_58,auStack_68);
          if (iVar2 == 0) {
            iVar2 = mbedtls_mpi_div_mpi(auStack_58,0,auStack_58,param_4);
            if (iVar2 == 0) {
              iVar2 = mbedtls_mpi_inv_mod(param_4,param_3,auStack_58);
            }
          }
        }
      }
    }
    mbedtls_mpi_free(auStack_58);
    mbedtls_mpi_free(auStack_68);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

