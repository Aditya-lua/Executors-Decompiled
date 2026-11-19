/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9bfe0
 */

int mbedtls_ecdsa_read_signature_restartable
              (long param_1,undefined8 param_2,undefined8 param_3,long param_4,long param_5)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_78 [16];
  undefined1 auStack_68 [16];
  long local_58;
  long local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  param_5 = param_4 + param_5;
  local_50 = param_4;
  mbedtls_mpi_init(auStack_68);
  mbedtls_mpi_init(auStack_78);
  iVar2 = mbedtls_asn1_get_tag(&local_50,param_5,&local_58,0x30);
  if (iVar2 == 0) {
    if (local_50 + local_58 != param_5) {
      iVar2 = -0x4fe6;
      goto LAB_00b9c060;
    }
    iVar2 = mbedtls_asn1_get_mpi(&local_50,param_5,auStack_68);
    if ((iVar2 == 0) && (iVar2 = mbedtls_asn1_get_mpi(&local_50,param_5,auStack_78), iVar2 == 0)) {
      iVar2 = mbedtls_ecdsa_verify_restartable
                        (param_1,param_2,param_3,param_1 + 0xd0,auStack_68,auStack_78);
      if (local_50 != param_5 && iVar2 == 0) {
        iVar2 = -0x4c00;
      }
      goto LAB_00b9c060;
    }
  }
  iVar2 = iVar2 + -0x4f80;
LAB_00b9c060:
  mbedtls_mpi_free(auStack_68);
  mbedtls_mpi_free(auStack_78);
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

