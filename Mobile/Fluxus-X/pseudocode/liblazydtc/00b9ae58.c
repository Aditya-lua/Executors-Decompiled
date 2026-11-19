/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9ae58
 */

int mbedtls_ecdh_compute_shared
              (undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
              undefined8 param_5,undefined8 param_6)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_88 [48];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  mbedtls_ecp_point_init(auStack_88);
  iVar2 = mbedtls_ecp_mul_restartable(param_1,auStack_88,param_4,param_3,param_5,param_6,0);
  if (iVar2 == 0) {
    iVar2 = mbedtls_ecp_is_zero(auStack_88);
    if (iVar2 == 0) {
      iVar2 = mbedtls_mpi_copy(param_2,auStack_88);
    }
    else {
      iVar2 = -0x4f80;
    }
  }
  mbedtls_ecp_point_free(auStack_88);
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

