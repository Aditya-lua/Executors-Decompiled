/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba5f50
 */

int mbedtls_rsa_write_key(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  int iVar2;
  int iVar3;
  int iVar4;
  long lVar5;
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  mbedtls_mpi_init(auStack_58);
  iVar2 = mbedtls_rsa_export_crt(param_1,0,0,auStack_58);
  if (iVar2 == 0) {
    iVar2 = mbedtls_asn1_write_mpi(param_3,param_2,auStack_58);
    if (iVar2 < 0) {
LAB_00ba61e0:
      mbedtls_mpi_free(auStack_58);
      goto LAB_00ba61f0;
    }
    lVar5 = (long)iVar2;
    iVar2 = mbedtls_rsa_export_crt(param_1,0,auStack_58,0);
    if (iVar2 != 0) goto LAB_00ba5fa8;
    iVar2 = mbedtls_asn1_write_mpi(param_3,param_2,auStack_58);
    if (iVar2 < 0) goto LAB_00ba61e0;
    lVar5 = lVar5 + iVar2;
    iVar2 = mbedtls_rsa_export_crt(param_1,auStack_58,0,0);
    if (iVar2 != 0) goto LAB_00ba5fa8;
    iVar2 = mbedtls_asn1_write_mpi(param_3,param_2,auStack_58);
    if (iVar2 < 0) goto LAB_00ba61e0;
    lVar5 = lVar5 + iVar2;
    iVar2 = mbedtls_rsa_export(param_1,0,0,auStack_58,0,0);
    if (iVar2 != 0) goto LAB_00ba5fa8;
    iVar2 = mbedtls_asn1_write_mpi(param_3,param_2,auStack_58);
    if (iVar2 < 0) goto LAB_00ba61e0;
    lVar5 = lVar5 + iVar2;
    iVar2 = mbedtls_rsa_export(param_1,0,auStack_58,0,0,0);
    if (iVar2 != 0) goto LAB_00ba5fa8;
    iVar2 = mbedtls_asn1_write_mpi(param_3,param_2,auStack_58);
    if (iVar2 < 0) goto LAB_00ba61e0;
    lVar5 = lVar5 + iVar2;
    iVar2 = mbedtls_rsa_export(param_1,0,0,0,auStack_58,0);
    if (iVar2 != 0) goto LAB_00ba5fa8;
    iVar2 = mbedtls_asn1_write_mpi(param_3,param_2,auStack_58);
    if (iVar2 < 0) goto LAB_00ba61e0;
    lVar5 = lVar5 + iVar2;
    iVar2 = mbedtls_rsa_export(param_1,0,0,0,0,auStack_58);
    if (iVar2 != 0) goto LAB_00ba5fa8;
    iVar2 = mbedtls_asn1_write_mpi(param_3,param_2,auStack_58);
    if (iVar2 < 0) goto LAB_00ba61e0;
    lVar5 = lVar5 + iVar2;
    iVar2 = mbedtls_rsa_export(param_1,auStack_58,0,0,0,0);
    if (iVar2 != 0) goto LAB_00ba5fa8;
    iVar2 = mbedtls_asn1_write_mpi(param_3,param_2,auStack_58);
    if (iVar2 < 0) goto LAB_00ba61e0;
    lVar5 = lVar5 + iVar2;
    mbedtls_mpi_free(auStack_58);
  }
  else {
    lVar5 = 0;
LAB_00ba5fa8:
    mbedtls_mpi_free(auStack_58);
    if (iVar2 < 0) goto LAB_00ba61f0;
  }
  iVar3 = mbedtls_asn1_write_int(param_3,param_2,0);
  iVar2 = iVar3;
  if (-1 < iVar3) {
    iVar4 = mbedtls_asn1_write_len(param_3,param_2,lVar5 + iVar3);
    iVar2 = iVar4;
    if ((-1 < iVar4) && (iVar2 = mbedtls_asn1_write_tag(param_3,param_2,0x30), -1 < iVar2)) {
      iVar2 = iVar4 + (int)(lVar5 + iVar3) + iVar2;
    }
  }
LAB_00ba61f0:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

