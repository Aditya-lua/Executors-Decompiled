/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba09bc
 */

int mbedtls_ecjpake_read_round_two(undefined4 *param_1,long param_2,long param_3)

{
  int *piVar1;
  long lVar2;
  int iVar3;
  undefined1 auStack_160 [48];
  int local_130 [48];
  long local_70;
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  local_70 = param_2;
  mbedtls_ecp_group_init(local_130);
  mbedtls_ecp_point_init(auStack_160);
  piVar1 = param_1 + 2;
  mbedtls_mpi_init(auStack_68);
  iVar3 = mbedtls_mpi_lset(auStack_68,1);
  if ((iVar3 == 0) &&
     (iVar3 = mbedtls_ecp_muladd(piVar1,auStack_160,auStack_68,param_1 + 0x34,auStack_68,
                                 param_1 + 0x40), iVar3 == 0)) {
    iVar3 = mbedtls_ecp_muladd(piVar1,auStack_160,auStack_68,auStack_160,auStack_68,param_1 + 0x4c);
  }
  mbedtls_mpi_free(auStack_68);
  if (iVar3 != 0) goto LAB_00ba0b00;
  iVar3 = param_1[0x32];
  if (iVar3 == 0) {
    iVar3 = mbedtls_ecp_tls_read_group(local_130,&local_70,param_3);
    if (iVar3 != 0) goto LAB_00ba0b00;
    if (local_130[0] != *piVar1) {
      iVar3 = -0x4e80;
      goto LAB_00ba0b00;
    }
    iVar3 = param_1[0x32];
  }
  iVar3 = FUN_00ba0b44(*param_1,piVar1,param_1[0x33],auStack_160,param_1 + 100,
                       (&PTR_s_client_00cab448)[1 - iVar3],&local_70,param_2 + param_3);
  if (local_70 != param_2 + param_3 && iVar3 == 0) {
    iVar3 = -0x4f80;
  }
LAB_00ba0b00:
  mbedtls_ecp_group_free(local_130);
  mbedtls_ecp_point_free(auStack_160);
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

