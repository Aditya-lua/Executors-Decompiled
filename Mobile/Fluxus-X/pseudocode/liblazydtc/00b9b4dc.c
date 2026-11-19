/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9b4dc
 */

int mbedtls_ecdh_calc_secret
              (long param_1,ulong *param_2,undefined8 param_3,ulong param_4,undefined8 param_5,
              undefined8 param_6)

{
  long lVar1;
  long lVar2;
  int iVar3;
  ulong uVar4;
  undefined1 auStack_98 [48];
  long local_68;
  
  lVar2 = tpidr_el0;
  local_68 = *(long *)(lVar2 + 0x28);
  if ((*(int *)(param_1 + 8) == 1) && (*(long *)(param_1 + 0x88) != 0)) {
    lVar1 = param_1 + 0x140;
    mbedtls_ecp_point_init(auStack_98);
    iVar3 = mbedtls_ecp_mul_restartable
                      (param_1 + 0x10,auStack_98,param_1 + 0xd0,param_1 + 0x110,param_5,param_6,0);
    if (iVar3 == 0) {
      iVar3 = mbedtls_ecp_is_zero(auStack_98);
      if (iVar3 == 0) {
        iVar3 = mbedtls_mpi_copy(lVar1,auStack_98);
      }
      else {
        iVar3 = -0x4f80;
      }
    }
    mbedtls_ecp_point_free(auStack_98);
    if (iVar3 != 0) goto LAB_00b9b5c0;
    uVar4 = mbedtls_mpi_size(lVar1);
    if (uVar4 <= param_4) {
      uVar4 = *(ulong *)(param_1 + 0x88) >> 3;
      if ((*(ulong *)(param_1 + 0x88) & 7) != 0) {
        uVar4 = uVar4 + 1;
      }
      *param_2 = uVar4;
      iVar3 = mbedtls_ecp_get_type(param_1 + 0x10);
      if (iVar3 == 2) {
        iVar3 = mbedtls_mpi_write_binary_le(lVar1,param_3);
      }
      else {
        iVar3 = mbedtls_mpi_write_binary(lVar1,param_3,*param_2);
      }
      goto LAB_00b9b5c0;
    }
  }
  iVar3 = -0x4f80;
LAB_00b9b5c0:
  if (*(long *)(lVar2 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

