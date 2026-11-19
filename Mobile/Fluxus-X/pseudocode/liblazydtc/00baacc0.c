/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baacc0
 */

int mbedtls_rsa_validate_params
              (long param_1,long param_2,long param_3,long param_4,long param_5,long param_6,
              undefined8 param_7)

{
  long lVar1;
  int iVar2;
  int iVar3;
  undefined1 auStack_78 [16];
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  mbedtls_mpi_init(auStack_68);
  mbedtls_mpi_init(auStack_78);
  if ((((param_2 == 0) || (param_6 == 0)) ||
      (iVar2 = mbedtls_mpi_is_prime_ext(param_2,0x32,param_6,param_7), iVar2 == 0)) &&
     (((param_3 == 0 || (param_6 == 0)) ||
      (iVar2 = mbedtls_mpi_is_prime_ext(param_3,0x32,param_6,param_7), iVar2 == 0)))) {
    if ((param_1 != 0) && (param_2 != 0 && param_3 != 0)) {
      iVar2 = mbedtls_mpi_mul_mpi(auStack_68,param_2,param_3);
      if (iVar2 == 0) {
        iVar2 = mbedtls_mpi_cmp_int(param_1,1);
        if ((iVar2 < 1) || (iVar2 = mbedtls_mpi_cmp_mpi(auStack_68,param_1), iVar2 != 0))
        goto LAB_00baad54;
        goto LAB_00baae1c;
      }
      goto LAB_00baadcc;
    }
LAB_00baae1c:
    if (((param_1 != 0) && ((param_4 != 0 && (param_5 != 0)))) &&
       ((iVar2 = mbedtls_mpi_cmp_int(param_4,1), iVar2 < 1 ||
        (((iVar2 = mbedtls_mpi_cmp_int(param_5,1), iVar2 < 1 ||
          (iVar2 = mbedtls_mpi_cmp_mpi(param_4,param_1), -1 < iVar2)) ||
         (iVar2 = mbedtls_mpi_cmp_mpi(param_5,param_1), -1 < iVar2)))))) goto LAB_00baad54;
    if ((param_2 != 0 && param_3 != 0) && param_4 != 0) {
      iVar2 = 0;
      if (param_5 != 0) {
        iVar2 = mbedtls_mpi_cmp_int(param_2,1);
        if ((0 < iVar2) && (iVar2 = mbedtls_mpi_cmp_int(param_3,1), 0 < iVar2)) {
          iVar2 = mbedtls_mpi_mul_mpi(auStack_68,param_4,param_5);
          if (((iVar2 == 0) &&
              ((iVar2 = mbedtls_mpi_sub_int(auStack_68,auStack_68,1), iVar2 == 0 &&
               (iVar2 = mbedtls_mpi_sub_int(auStack_78,param_2,1), iVar2 == 0)))) &&
             (iVar2 = mbedtls_mpi_mod_mpi(auStack_68,auStack_68,auStack_78), iVar2 == 0)) {
            iVar2 = mbedtls_mpi_cmp_int(auStack_68,0);
            if (iVar2 != 0) goto LAB_00baad54;
            iVar2 = mbedtls_mpi_mul_mpi(auStack_68,param_4,param_5);
            if ((((iVar2 == 0) && (iVar2 = mbedtls_mpi_sub_int(auStack_68,auStack_68,1), iVar2 == 0)
                 ) && (iVar2 = mbedtls_mpi_sub_int(auStack_78,param_3,1), iVar2 == 0)) &&
               (iVar2 = mbedtls_mpi_mod_mpi(auStack_68,auStack_68,auStack_78), iVar2 == 0)) {
              iVar3 = mbedtls_mpi_cmp_int(auStack_68,0);
              iVar2 = 0;
              if (iVar3 != 0) {
                iVar2 = -0x4200;
              }
            }
          }
LAB_00baadcc:
          mbedtls_mpi_free(auStack_68);
          mbedtls_mpi_free(auStack_78);
          if ((iVar2 != -0x4200) && (iVar2 != 0)) {
            iVar2 = iVar2 + -0x4200;
          }
          goto LAB_00baad68;
        }
        goto LAB_00baad54;
      }
    }
    else {
      iVar2 = 0;
    }
  }
  else {
LAB_00baad54:
    iVar2 = -0x4200;
  }
  mbedtls_mpi_free(auStack_68);
  mbedtls_mpi_free(auStack_78);
LAB_00baad68:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

