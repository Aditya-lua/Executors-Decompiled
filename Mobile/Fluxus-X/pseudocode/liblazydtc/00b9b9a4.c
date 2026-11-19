/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9b9a4
 */

int mbedtls_ecdsa_sign_det_restartable
              (long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
              undefined8 param_5,ulong param_6,undefined4 param_7,undefined8 param_8,
              undefined8 param_9)

{
  long lVar1;
  int iVar2;
  long lVar3;
  ulong uVar4;
  long lVar5;
  ulong uVar6;
  undefined1 auStack_188 [20];
  undefined1 auStack_174 [132];
  undefined1 auStack_f0 [128];
  long local_70;
  
  lVar1 = tpidr_el0;
  local_70 = *(long *)(lVar1 + 0x28);
  lVar5 = *(long *)(param_1 + 0x80);
  lVar3 = mbedtls_md_info_from_type(param_7);
  if (lVar3 == 0) {
    iVar2 = -0x4f80;
    goto LAB_00b9ba78;
  }
  uVar6 = lVar5 + 7U >> 3;
  mbedtls_mpi_init(auStack_188);
  mbedtls_hmac_drbg_init(auStack_f0);
  iVar2 = mbedtls_mpi_write_binary(param_4,auStack_174,uVar6);
  if (iVar2 == 0) {
    uVar4 = *(long *)(param_1 + 0x80) + 7U >> 3;
    if (param_6 <= uVar4) {
      uVar4 = param_6;
    }
    iVar2 = mbedtls_mpi_read_binary(auStack_188,param_5,uVar4);
    if (iVar2 == 0) {
      lVar5 = uVar4 * 8 - *(ulong *)(param_1 + 0x80);
      if (*(ulong *)(param_1 + 0x80) <= uVar4 * 8 && lVar5 != 0) {
        iVar2 = mbedtls_mpi_shift_r(auStack_188,lVar5);
        if (iVar2 != 0) goto LAB_00b9ba60;
      }
      iVar2 = mbedtls_mpi_cmp_mpi(auStack_188,param_1 + 0x68);
      if (-1 < iVar2) {
        iVar2 = mbedtls_mpi_sub_mpi(auStack_188,auStack_188,param_1 + 0x68);
        if (iVar2 != 0) goto LAB_00b9ba60;
      }
      iVar2 = mbedtls_mpi_write_binary(auStack_188,auStack_174 + uVar6,uVar6);
      if (iVar2 == 0) {
        iVar2 = mbedtls_hmac_drbg_seed_buf(auStack_f0,lVar3,auStack_174,uVar6 << 1);
        if (iVar2 == 0) {
          iVar2 = mbedtls_ecdsa_sign_restartable
                            (param_1,param_2,param_3,param_4,param_5,param_6,
                             mbedtls_hmac_drbg_random,auStack_f0,param_8,param_9);
        }
      }
    }
  }
LAB_00b9ba60:
  mbedtls_hmac_drbg_free(auStack_f0);
  mbedtls_mpi_free(auStack_188);
LAB_00b9ba78:
  if (*(long *)(lVar1 + 0x28) != local_70) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

