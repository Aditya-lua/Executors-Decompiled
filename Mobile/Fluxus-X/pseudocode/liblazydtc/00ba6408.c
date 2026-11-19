/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba6408
 */

int mbedtls_rsa_write_pubkey(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  int iVar2;
  int iVar3;
  long lVar4;
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  mbedtls_mpi_init(auStack_58);
  iVar2 = mbedtls_rsa_export(param_1,0,0,0,0,auStack_58);
  if (iVar2 == 0) {
    iVar2 = mbedtls_asn1_write_mpi(param_3,param_2,auStack_58);
    if (iVar2 < 0) {
LAB_00ba6514:
      mbedtls_mpi_free(auStack_58);
      goto LAB_00ba6524;
    }
    lVar4 = (long)iVar2;
    iVar2 = mbedtls_rsa_export(param_1,auStack_58,0,0,0,0);
    if (iVar2 != 0) goto LAB_00ba6468;
    iVar2 = mbedtls_asn1_write_mpi(param_3,param_2,auStack_58);
    if (iVar2 < 0) goto LAB_00ba6514;
    lVar4 = lVar4 + iVar2;
    mbedtls_mpi_free(auStack_58);
  }
  else {
    lVar4 = 0;
LAB_00ba6468:
    mbedtls_mpi_free(auStack_58);
    if (iVar2 < 0) goto LAB_00ba6524;
  }
  iVar3 = mbedtls_asn1_write_len(param_3,param_2,lVar4);
  iVar2 = iVar3;
  if ((-1 < iVar3) && (iVar2 = mbedtls_asn1_write_tag(param_3,param_2,0x30), -1 < iVar2)) {
    iVar2 = iVar3 + (int)lVar4 + iVar2;
  }
LAB_00ba6524:
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

