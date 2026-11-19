/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b99410
 */

int mbedtls_psa_rsa_load_representation
              (uint param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  long lVar1;
  int iVar2;
  void *pvVar3;
  long lVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined1 auStack_58 [16];
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  pvVar3 = calloc(1,0xe8);
  *param_4 = pvVar3;
  if (pvVar3 == (void *)0x0) {
    iVar2 = -0x8d;
  }
  else {
    mbedtls_rsa_init();
    if ((~param_1 & 0x7000) == 0) {
      mbedtls_rsa_parse_key();
    }
    else {
      mbedtls_rsa_parse_pubkey(*param_4,param_2,param_3);
    }
    iVar2 = mbedtls_to_psa_error();
    if (iVar2 == 0) {
      lVar4 = mbedtls_rsa_get_len(*param_4);
      if ((ulong)(lVar4 * 8) < 0x1001) {
        uVar6 = *param_4;
        mbedtls_mpi_init(auStack_58);
        mbedtls_rsa_export(uVar6,auStack_58,0,0,0,0);
        iVar2 = mbedtls_to_psa_error();
        if (iVar2 == 0) {
          uVar5 = mbedtls_mpi_bitlen(auStack_58);
          iVar2 = 0;
          if ((uVar5 & 7) != 0) {
            iVar2 = -0x86;
          }
        }
        mbedtls_mpi_free(auStack_58);
      }
      else {
        iVar2 = -0x86;
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

