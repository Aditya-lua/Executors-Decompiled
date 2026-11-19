/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9a0bc
 */

int mbedtls_psa_asymmetric_decrypt
              (short *param_1,undefined8 param_2,undefined8 param_3,uint param_4,undefined8 param_5,
              long param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9,
              undefined8 param_10,undefined8 *param_11)

{
  long lVar1;
  void *__ptr;
  int iVar2;
  long lVar3;
  undefined8 uVar4;
  void *local_70;
  long local_68;
  
  lVar1 = tpidr_el0;
  local_68 = *(long *)(lVar1 + 0x28);
  *param_11 = 0;
  if (*param_1 != 0x7001) {
    iVar2 = -0x86;
    goto LAB_00b9a1d4;
  }
  local_70 = (void *)0x0;
  iVar2 = mbedtls_psa_rsa_load_representation(0x7001,param_2,param_3,&local_70);
  __ptr = local_70;
  if (iVar2 == 0) {
    lVar3 = mbedtls_rsa_get_len(local_70);
    if (lVar3 == param_6) {
      if (param_4 == 0x7000200) {
        mbedtls_rsa_pkcs1_decrypt(__ptr,mbedtls_psa_get_random,0,param_11,param_5,param_9,param_10);
      }
      else {
        if ((param_4 & 0xffffff00) != 0x7000300) goto LAB_00b9a1c0;
        lVar3 = mbedtls_md_info_from_type(param_4 & 0xff);
        if (lVar3 == 0) {
          uVar4 = 0xffffff7a;
        }
        else {
          uVar4 = mbedtls_rsa_set_padding(__ptr,1,param_4 & 0xff);
        }
        iVar2 = mbedtls_to_psa_error(uVar4);
        if (iVar2 != 0) goto LAB_00b9a1c4;
        mbedtls_rsa_rsaes_oaep_decrypt
                  (__ptr,mbedtls_psa_get_random,0,param_7,param_8,param_11,param_5,param_9,param_10)
        ;
      }
      iVar2 = mbedtls_to_psa_error();
    }
    else {
LAB_00b9a1c0:
      iVar2 = -0x87;
    }
  }
LAB_00b9a1c4:
  mbedtls_rsa_free(__ptr);
  free(__ptr);
LAB_00b9a1d4:
  if (*(long *)(lVar1 + 0x28) != local_68) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

