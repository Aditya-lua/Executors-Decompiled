/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba555c
 */

int mbedtls_rsa_parse_key(long param_1,long param_2,long param_3)

{
  long lVar1;
  int iVar2;
  undefined8 uVar3;
  undefined1 auStack_60 [16];
  long local_50;
  long lStack_48;
  int local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  mbedtls_mpi_init(auStack_60);
  param_3 = param_2 + param_3;
  local_50 = param_2;
  iVar2 = mbedtls_asn1_get_tag(&local_50,param_3,&lStack_48,0x30);
  if (iVar2 != 0) goto LAB_00ba55e4;
  if (param_3 != local_50 + lStack_48) {
LAB_00ba55c4:
    iVar2 = -0x4080;
    goto LAB_00ba55e4;
  }
  iVar2 = mbedtls_asn1_get_int(&local_50,param_3,&local_3c);
  if (iVar2 != 0) goto LAB_00ba55e4;
  if (local_3c != 0) goto LAB_00ba55c4;
  iVar2 = mbedtls_asn1_get_mpi(&local_50,param_3,auStack_60);
  if (iVar2 == 0) {
    iVar2 = mbedtls_mpi_cmp_int(auStack_60,0);
    if (iVar2 == 0) {
LAB_00ba5870:
      iVar2 = -0x4080;
      goto LAB_00ba5874;
    }
    iVar2 = mbedtls_mpi_copy(param_1 + 0x10,auStack_60);
    if (iVar2 == 0) {
      uVar3 = mbedtls_mpi_size(param_1 + 0x10);
      *(undefined8 *)(param_1 + 8) = uVar3;
LAB_00ba5678:
      iVar2 = mbedtls_asn1_get_mpi(&local_50,param_3,auStack_60);
      if (iVar2 == 0) {
        iVar2 = mbedtls_mpi_cmp_int(auStack_60,0);
        if (iVar2 == 0) goto LAB_00ba5870;
        iVar2 = mbedtls_mpi_copy(param_1 + 0x20,auStack_60);
        if ((iVar2 != 0) && (iVar2 = iVar2 + -0x4080, iVar2 != 0)) goto LAB_00ba565c;
        iVar2 = mbedtls_asn1_get_mpi(&local_50,param_3,auStack_60);
        if (iVar2 == 0) {
          iVar2 = mbedtls_mpi_cmp_int(auStack_60,0);
          if (iVar2 == 0) goto LAB_00ba5870;
          iVar2 = mbedtls_mpi_copy(param_1 + 0x30,auStack_60);
          if ((iVar2 != 0) && (iVar2 = iVar2 + -0x4080, iVar2 != 0)) goto LAB_00ba565c;
          iVar2 = mbedtls_asn1_get_mpi(&local_50,param_3,auStack_60);
          if (iVar2 == 0) {
            iVar2 = mbedtls_mpi_cmp_int(auStack_60,0);
            if (iVar2 == 0) goto LAB_00ba5870;
            iVar2 = mbedtls_mpi_copy(param_1 + 0x40,auStack_60);
            if ((iVar2 != 0) && (iVar2 = iVar2 + -0x4080, iVar2 != 0)) goto LAB_00ba565c;
            iVar2 = mbedtls_asn1_get_mpi(&local_50,param_3,auStack_60);
            if (iVar2 == 0) {
              iVar2 = mbedtls_mpi_cmp_int(auStack_60,0);
              if (iVar2 == 0) goto LAB_00ba5870;
              iVar2 = mbedtls_mpi_copy(param_1 + 0x50,auStack_60);
              if ((iVar2 != 0) && (iVar2 = iVar2 + -0x4080, iVar2 != 0)) goto LAB_00ba565c;
              iVar2 = mbedtls_asn1_get_mpi(&local_50,param_3,auStack_60);
              if (iVar2 == 0) {
                iVar2 = mbedtls_mpi_cmp_int(auStack_60,0);
                if (iVar2 == 0) goto LAB_00ba5870;
                iVar2 = mbedtls_mpi_copy(param_1 + 0x60,auStack_60);
                if (iVar2 == 0) {
                  iVar2 = mbedtls_asn1_get_mpi(&local_50,param_3,auStack_60);
                  if (iVar2 == 0) {
                    iVar2 = mbedtls_mpi_cmp_int(auStack_60,0);
                    if (iVar2 == 0) goto LAB_00ba5870;
                    iVar2 = mbedtls_mpi_copy(param_1 + 0x70,auStack_60);
                    if (iVar2 == 0) {
                      iVar2 = mbedtls_asn1_get_mpi(&local_50,param_3,auStack_60);
                      if (iVar2 == 0) {
                        iVar2 = mbedtls_mpi_cmp_int(auStack_60,0);
                        if (iVar2 == 0) goto LAB_00ba5870;
                        iVar2 = mbedtls_mpi_copy(param_1 + 0x80,auStack_60);
                        if (iVar2 == 0) {
                          iVar2 = mbedtls_rsa_complete(param_1);
                          if (iVar2 == 0) {
                            iVar2 = mbedtls_rsa_check_pubkey(param_1);
                            if ((iVar2 != 0) || (local_50 == param_3)) goto LAB_00ba565c;
                            iVar2 = -0x66;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      goto LAB_00ba5874;
    }
    iVar2 = iVar2 + -0x4080;
    if (iVar2 == 0) goto LAB_00ba5678;
LAB_00ba565c:
    mbedtls_mpi_free(auStack_60);
    if (iVar2 == 0) goto LAB_00ba55e4;
  }
  else {
LAB_00ba5874:
    mbedtls_mpi_free(auStack_60);
  }
  mbedtls_rsa_free(param_1);
LAB_00ba55e4:
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

