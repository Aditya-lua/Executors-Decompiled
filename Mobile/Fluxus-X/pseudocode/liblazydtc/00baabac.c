/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00baabac
 */

int mbedtls_rsa_deduce_crt
              (undefined8 param_1,undefined8 param_2,undefined8 param_3,long param_4,long param_5,
              long param_6)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  mbedtls_mpi_init(auStack_68);
  if (param_4 != 0) {
    iVar2 = mbedtls_mpi_sub_int(auStack_68,param_1,1);
    if (iVar2 != 0) goto LAB_00baac84;
    iVar2 = mbedtls_mpi_mod_mpi(param_4,param_3,auStack_68);
    if (iVar2 != 0) goto LAB_00baac84;
  }
  if (param_5 == 0) {
    if (param_6 == 0) {
      iVar2 = 0;
      goto LAB_00baac84;
    }
  }
  else {
    iVar2 = mbedtls_mpi_sub_int(auStack_68,param_2,1);
    if (iVar2 != 0) goto LAB_00baac84;
    iVar2 = mbedtls_mpi_mod_mpi(param_5,param_3,auStack_68);
    if ((param_6 == 0) || (iVar2 != 0)) goto LAB_00baac84;
  }
  iVar2 = mbedtls_mpi_inv_mod(param_6,param_2,param_1);
LAB_00baac84:
  mbedtls_mpi_free(auStack_68);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

