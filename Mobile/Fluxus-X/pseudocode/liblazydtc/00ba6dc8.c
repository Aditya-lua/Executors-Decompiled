/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6dc8
 */

void mbedtls_rsa_public(long param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  int iVar3;
  long lVar4;
  long lVar5;
  undefined8 uVar6;
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  lVar1 = param_1 + 0x10;
  lVar5 = *(long *)(param_1 + 8);
  lVar4 = mbedtls_mpi_size(lVar1);
  if ((((lVar5 == lVar4) && (*(ulong *)(param_1 + 8) < 0x401)) &&
      (iVar3 = mbedtls_mpi_cmp_int(lVar1,0), 0 < iVar3)) &&
     (iVar3 = mbedtls_mpi_get_bit(lVar1,0), iVar3 != 0)) {
    iVar3 = mbedtls_mpi_cmp_int(param_1 + 0x20,0);
    if (0 < iVar3) {
      mbedtls_mpi_init(auStack_68);
      iVar3 = mbedtls_mpi_read_binary(auStack_68,param_2,*(undefined8 *)(param_1 + 8));
      if (iVar3 == 0) {
        iVar3 = mbedtls_mpi_cmp_mpi(auStack_68,lVar1);
        if (-1 < iVar3) {
          iVar3 = -4;
          goto LAB_00ba6ee8;
        }
        uVar6 = *(undefined8 *)(param_1 + 8);
        iVar3 = mbedtls_mpi_exp_mod_unsafe
                          (auStack_68,auStack_68,param_1 + 0x20,lVar1,param_1 + 0x90);
        if (iVar3 != 0) goto LAB_00ba6ee8;
        iVar3 = mbedtls_mpi_write_binary(auStack_68,param_3,uVar6);
        mbedtls_mpi_free(auStack_68);
        if (iVar3 == 0) {
          iVar3 = 0;
          goto LAB_00ba6e98;
        }
      }
      else {
LAB_00ba6ee8:
        mbedtls_mpi_free(auStack_68);
      }
      iVar3 = iVar3 + -0x4280;
      goto LAB_00ba6e98;
    }
  }
  iVar3 = -0x4080;
LAB_00ba6e98:
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(iVar3);
  }
  return;
}

