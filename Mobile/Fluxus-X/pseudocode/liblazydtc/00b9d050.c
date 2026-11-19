/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9d050
 */

int mbedtls_psa_ffdh_export_public_key
              (ushort *param_1,void *param_2,ulong param_3,void *param_4,ulong param_5,
              ulong *param_6)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  undefined1 auStack_98 [16];
  undefined1 auStack_88 [16];
  undefined1 auStack_78 [16];
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  if ((*param_1 & 0x7000) == 0x4000) {
    if (param_5 < param_3) {
      iVar3 = -0x8a;
    }
    else {
      memcpy(param_4,param_2,param_3);
      memset((void *)((long)param_4 + param_3),0,param_5 - param_3);
      iVar3 = 0;
      *param_6 = param_3;
    }
  }
  else {
    mbedtls_mpi_init(auStack_68);
    mbedtls_mpi_init(auStack_78);
    mbedtls_mpi_init(auStack_88);
    mbedtls_mpi_init(auStack_98);
    uVar6 = (ulong)param_1[1] + 7 >> 3;
    uVar5 = uVar6 - 0x100 >> 7 | uVar6 << 0x39;
    if ((uVar5 < 7) && ((0x57U >> (ulong)((uint)(uVar6 - 0x100 >> 7) & 0x1f) & 1) != 0)) {
      iVar3 = mbedtls_mpi_read_binary
                        (auStack_98,(&PTR_DAT_00cab3d0)[uVar5],
                         *(undefined8 *)(&DAT_007874f0 + uVar5 * 8));
      if (((iVar3 == 0) &&
          (iVar3 = mbedtls_mpi_read_binary(auStack_78,(&PTR_DAT_00cab410)[uVar5],1), iVar3 == 0)) ||
         (iVar3 = mbedtls_to_psa_error(), iVar3 == 0)) {
        iVar4 = mbedtls_mpi_read_binary(auStack_88,param_2,param_3);
        if (((iVar4 == 0) &&
            (iVar4 = mbedtls_mpi_exp_mod(auStack_68,auStack_78,auStack_88,auStack_98,0), iVar4 == 0)
            ) && (iVar4 = mbedtls_mpi_write_binary(auStack_68,param_4,uVar6), iVar4 == 0)) {
          *param_6 = uVar6;
        }
        iVar3 = 0;
        bVar2 = true;
      }
      else {
        bVar2 = false;
        iVar4 = -0x6e;
      }
    }
    else {
      bVar2 = false;
      iVar4 = -0x6e;
      iVar3 = -0x87;
    }
    mbedtls_mpi_free(auStack_98);
    mbedtls_mpi_free(auStack_78);
    mbedtls_mpi_free(auStack_88);
    mbedtls_mpi_free(auStack_68);
    if ((bVar2) && (iVar4 != 0)) {
      iVar3 = mbedtls_to_psa_error(iVar4);
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

