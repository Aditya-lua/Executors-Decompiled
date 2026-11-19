/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9d434
 */

int mbedtls_psa_ffdh_key_agreement
              (long param_1,undefined8 param_2,ulong param_3,undefined8 param_4,ulong param_5,
              undefined8 param_6,ulong param_7,ulong *param_8)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  ulong uVar6;
  undefined1 auStack_a8 [16];
  undefined1 auStack_98 [16];
  undefined1 auStack_88 [16];
  undefined1 auStack_78 [16];
  undefined1 auStack_68 [16];
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  iVar3 = -0x87;
  if ((param_3 == param_5) && (param_3 <= param_7)) {
    if (*(char *)(param_1 + 1) == 'r') {
      mbedtls_mpi_init(auStack_68);
      mbedtls_mpi_init(auStack_78);
      mbedtls_mpi_init(auStack_88);
      mbedtls_mpi_init(auStack_98);
      mbedtls_mpi_init(auStack_a8);
      uVar5 = (ulong)*(ushort *)(param_1 + 2) + 7 >> 3;
      uVar6 = uVar5 - 0x100;
      uVar5 = uVar6 >> 7 | uVar5 << 0x39;
      if ((uVar5 < 7) && ((0x57U >> (ulong)((uint)(uVar6 >> 7) & 0x1f) & 1) != 0)) {
        iVar3 = mbedtls_mpi_read_binary
                          (auStack_68,(&PTR_DAT_00cab3d0)[uVar5],
                           *(undefined8 *)(&DAT_007874f0 + uVar5 * 8));
        if (((iVar3 == 0) &&
            (iVar3 = mbedtls_mpi_read_binary(auStack_78,(&PTR_DAT_00cab410)[uVar5],1), iVar3 == 0))
           || (iVar3 = mbedtls_to_psa_error(), iVar3 == 0)) {
          iVar4 = mbedtls_mpi_read_binary(auStack_88,param_4,param_3);
          if ((((iVar4 == 0) &&
               (iVar4 = mbedtls_mpi_read_binary(auStack_98,param_2,param_3), iVar4 == 0)) &&
              (iVar4 = mbedtls_mpi_exp_mod(auStack_a8,auStack_98,auStack_88,auStack_68,0),
              iVar4 == 0)) &&
             (iVar4 = mbedtls_mpi_write_binary(auStack_a8,param_6,param_3), iVar4 == 0)) {
            *param_8 = param_3;
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
      mbedtls_mpi_free(auStack_68);
      mbedtls_mpi_free(auStack_78);
      mbedtls_mpi_free(auStack_88);
      mbedtls_mpi_free(auStack_98);
      mbedtls_mpi_free(auStack_a8);
      if ((bVar2) && (iVar4 != 0)) {
        iVar3 = mbedtls_to_psa_error(iVar4);
      }
    }
    else {
      iVar3 = -0x87;
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

