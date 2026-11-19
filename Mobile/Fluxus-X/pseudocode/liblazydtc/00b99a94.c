/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b99a94
 */

int mbedtls_psa_rsa_sign_hash
              (undefined2 *param_1,undefined8 param_2,undefined8 param_3,uint param_4,
              undefined8 param_5,ulong param_6,undefined8 param_7,ulong param_8,undefined8 *param_9)

{
  uint uVar1;
  long lVar2;
  void *pvVar3;
  int iVar4;
  ulong uVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  uint uVar8;
  void *local_60;
  long local_58;
  
  lVar2 = tpidr_el0;
  local_58 = *(long *)(lVar2 + 0x28);
  local_60 = (void *)0x0;
  iVar4 = mbedtls_psa_rsa_load_representation(*param_1,param_2,param_3,&local_60);
  if (iVar4 != 0) goto LAB_00b99c84;
  uVar1 = param_4 & 0xffffff00;
  if ((int)uVar1 < 0x6000900) {
    if (uVar1 == 0x6000200) goto LAB_00b99b48;
    uVar8 = 0x300;
LAB_00b99b28:
    if ((uVar1 == (uVar8 | 0x6000000)) || ((param_4 >> 9 | 1) == 0x30003)) goto LAB_00b99b48;
    uVar8 = 0;
  }
  else {
    if (uVar1 != 0x6000900) {
      uVar8 = 0x1300;
      goto LAB_00b99b28;
    }
LAB_00b99b48:
    uVar8 = param_4 & 0xff;
  }
  if (param_6 >> 0x20 == 0) {
    if (param_4 != 0x6000200) {
      if (uVar8 == 0) {
        iVar4 = -0x86;
        goto LAB_00b99c84;
      }
      mbedtls_md_info_from_type(uVar8);
      uVar5 = mbedtls_md_get_size();
      if ((uVar5 & 0xff) != param_6) goto LAB_00b99b54;
    }
    pvVar3 = local_60;
    uVar5 = mbedtls_rsa_get_len(local_60);
    if (param_8 < uVar5) {
      iVar4 = -0x8a;
      goto LAB_00b99c84;
    }
    if ((uVar1 == 0x6001300) || (uVar1 == 0x6000300)) {
      uVar6 = mbedtls_rsa_set_padding(pvVar3,1,uVar8);
      if ((int)uVar6 == 0) {
        uVar6 = mbedtls_rsa_rsassa_pss_sign
                          (pvVar3,mbedtls_psa_get_random,0,0,param_6 & 0xffffffff,param_5,param_7);
        iVar4 = (int)uVar6;
joined_r0x00b99c60:
        if (iVar4 == 0) {
          uVar7 = mbedtls_rsa_get_len(pvVar3);
          uVar6 = 0;
          *param_9 = uVar7;
        }
      }
    }
    else {
      if (uVar1 != 0x6000200) goto LAB_00b99b54;
      uVar6 = mbedtls_rsa_set_padding(pvVar3,0,0);
      if ((int)uVar6 == 0) {
        uVar6 = mbedtls_rsa_pkcs1_sign
                          (pvVar3,mbedtls_psa_get_random,0,uVar8,param_6 & 0xffffffff,param_5,
                           param_7);
        iVar4 = (int)uVar6;
        goto joined_r0x00b99c60;
      }
    }
    iVar4 = mbedtls_to_psa_error(uVar6);
  }
  else {
LAB_00b99b54:
    iVar4 = -0x87;
  }
LAB_00b99c84:
  pvVar3 = local_60;
  mbedtls_rsa_free(local_60);
  free(pvVar3);
  if (*(long *)(lVar2 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar4;
}

