/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b99f18
 */

int mbedtls_psa_asymmetric_encrypt
              (ushort *param_1,undefined8 param_2,undefined8 param_3,uint param_4,undefined8 param_5
              ,undefined8 param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9,
              ulong param_10,undefined8 *param_11)

{
  long lVar1;
  int iVar2;
  ulong uVar3;
  undefined8 uVar4;
  long lVar5;
  long lVar6;
  
  lVar1 = tpidr_el0;
  lVar6 = *(long *)(lVar1 + 0x28);
  if ((*param_1 & 0xcfff) != 0x4001) {
    iVar2 = -0x86;
    goto LAB_00b9a058;
  }
  iVar2 = mbedtls_psa_rsa_load_representation();
  if (iVar2 == 0) {
    uVar3 = mbedtls_rsa_get_len(0);
    if (param_10 < uVar3) {
      iVar2 = -0x8a;
    }
    else if (param_4 == 0x7000200) {
      mbedtls_rsa_pkcs1_encrypt(0,mbedtls_psa_get_random,0,param_6,param_5,param_9);
LAB_00b99fdc:
      iVar2 = mbedtls_to_psa_error();
      if (iVar2 == 0) {
        uVar4 = mbedtls_rsa_get_len(0);
        *param_11 = uVar4;
      }
    }
    else if ((param_4 & 0xffffff00) == 0x7000300) {
      lVar5 = mbedtls_md_info_from_type(param_4 & 0xff);
      if (lVar5 == 0) {
        uVar4 = 0xffffff7a;
      }
      else {
        uVar4 = mbedtls_rsa_set_padding(0,1,param_4 & 0xff);
      }
      iVar2 = mbedtls_to_psa_error(uVar4);
      if (iVar2 == 0) {
        mbedtls_rsa_rsaes_oaep_encrypt
                  (0,mbedtls_psa_get_random,0,param_7,param_8,param_6,param_5,param_9);
        goto LAB_00b99fdc;
      }
    }
    else {
      iVar2 = -0x87;
    }
  }
  mbedtls_rsa_free(0);
  free((void *)0x0);
LAB_00b9a058:
  if (*(long *)(lVar1 + 0x28) != lVar6) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

