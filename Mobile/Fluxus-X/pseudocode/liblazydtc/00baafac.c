/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baafac
 */

int mbedtls_rsa_validate_crt
              (long param_1,long param_2,undefined8 param_3,long param_4,long param_5,long param_6)

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
  if (param_4 == 0) {
LAB_00bab05c:
    if (param_5 != 0) {
      if (param_2 == 0) goto LAB_00bab0c4;
      iVar2 = mbedtls_mpi_sub_int(auStack_68,param_2,1);
      if (((iVar2 != 0) || (iVar2 = mbedtls_mpi_sub_mpi(auStack_78,param_5,param_3), iVar2 != 0)) ||
         (iVar2 = mbedtls_mpi_mod_mpi(auStack_78,auStack_78,auStack_68), iVar2 != 0))
      goto LAB_00bab13c;
      iVar2 = mbedtls_mpi_cmp_int(auStack_78,0);
      if (iVar2 != 0) goto LAB_00bab0bc;
    }
    if (param_6 == 0) {
      iVar2 = 0;
      goto LAB_00bab168;
    }
    iVar2 = -0x4080;
    if ((param_1 == 0) || (param_2 == 0)) goto LAB_00bab168;
    iVar2 = mbedtls_mpi_mul_mpi(auStack_68,param_6,param_2);
    if ((iVar2 == 0) &&
       ((iVar2 = mbedtls_mpi_sub_int(auStack_68,auStack_68,1), iVar2 == 0 &&
        (iVar2 = mbedtls_mpi_mod_mpi(auStack_68,auStack_68,param_1), iVar2 == 0)))) {
      iVar3 = mbedtls_mpi_cmp_int(auStack_68,0);
      iVar2 = 0;
      if (iVar3 != 0) {
        iVar2 = -0x4200;
      }
    }
  }
  else {
    if (param_1 == 0) {
LAB_00bab0c4:
      iVar2 = -0x4080;
      goto LAB_00bab168;
    }
    iVar2 = mbedtls_mpi_sub_int(auStack_68,param_1,1);
    if (((iVar2 == 0) && (iVar2 = mbedtls_mpi_sub_mpi(auStack_78,param_4,param_3), iVar2 == 0)) &&
       (iVar2 = mbedtls_mpi_mod_mpi(auStack_78,auStack_78,auStack_68), iVar2 == 0)) {
      iVar2 = mbedtls_mpi_cmp_int(auStack_78,0);
      if (iVar2 == 0) goto LAB_00bab05c;
LAB_00bab0bc:
      iVar2 = -0x4200;
      goto LAB_00bab168;
    }
  }
LAB_00bab13c:
  if (((iVar2 != -0x4200) && (iVar2 != -0x4080)) && (iVar2 != 0)) {
    iVar2 = iVar2 + -0x4200;
  }
LAB_00bab168:
  mbedtls_mpi_free(auStack_68);
  mbedtls_mpi_free(auStack_78);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

