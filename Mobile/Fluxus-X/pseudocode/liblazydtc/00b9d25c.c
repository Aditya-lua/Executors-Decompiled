/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9d25c
 */

int mbedtls_psa_ffdh_generate_key(undefined8 param_1,undefined8 param_2,long param_3,long *param_4)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  undefined1 auStack_78 [16];
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  mbedtls_mpi_init(auStack_78);
  mbedtls_mpi_init(auStack_68);
  uVar5 = param_3 - 0x100U >> 7 | param_3 << 0x39;
  if ((uVar5 < 7) && ((0x57U >> (ulong)((uint)(param_3 - 0x100U >> 7) & 0x1f) & 1) != 0)) {
    iVar3 = mbedtls_mpi_read_binary
                      (auStack_78,(&PTR_DAT_00cab3d0)[uVar5],
                       *(undefined8 *)(&DAT_007874f0 + uVar5 * 8));
    if ((iVar3 == 0) || (iVar3 = mbedtls_to_psa_error(), iVar3 == 0)) {
      iVar4 = mbedtls_mpi_random(auStack_68,3,auStack_78,mbedtls_psa_get_random,0);
      if (iVar4 == 0) {
        bVar2 = true;
        iVar4 = mbedtls_mpi_sub_int(auStack_68,auStack_68,1);
        if (iVar4 != 0) {
          iVar3 = 0;
          goto LAB_00b9d2cc;
        }
        iVar4 = mbedtls_mpi_write_binary(auStack_68,param_2,param_3);
        if (iVar4 == 0) {
          *param_4 = param_3;
        }
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
LAB_00b9d2cc:
  mbedtls_mpi_free(auStack_78);
  mbedtls_mpi_free(auStack_68);
  if ((bVar2) && (iVar4 != 0)) {
    iVar3 = mbedtls_to_psa_error(iVar4);
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

