/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b3ef20
 */

undefined8
FUN_00b3ef20(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4,
            undefined4 *param_5)

{
  int iVar1;
  undefined8 uVar2;
  void *data;
  ASN1_STRING *str;
  undefined4 uVar3;
  long local_70;
  undefined1 auStack_68 [56];
  
  uVar2 = ossl_rsa_get0_pss_params_30();
  *param_4 = 0;
  iVar1 = RSA_test_flags(param_1,0xf000);
  if (iVar1 != 0x1000) {
    if (iVar1 != 0) {
      return 0;
    }
    uVar3 = 5;
LAB_00b3ef84:
    *param_5 = uVar3;
    return 1;
  }
  iVar1 = ossl_rsa_pss_params_30_is_unrestricted(uVar2);
  if (iVar1 != 0) {
    uVar3 = 0xffffffff;
    goto LAB_00b3ef84;
  }
  local_70 = 0;
  iVar1 = WPACKET_init_null_der(auStack_68);
  if (iVar1 == 0) {
    data = (void *)0x0;
    goto LAB_00b3f074;
  }
  iVar1 = ossl_DER_w_RSASSA_PSS_params(auStack_68,0xffffffff,uVar2);
  if (((iVar1 == 0) || (iVar1 = WPACKET_finish(auStack_68), iVar1 == 0)) ||
     (iVar1 = WPACKET_get_total_written(auStack_68,&local_70), iVar1 == 0)) {
    data = (void *)0x0;
LAB_00b3f064:
    WPACKET_cleanup(auStack_68);
  }
  else {
    WPACKET_cleanup(auStack_68);
    if (local_70 == 0) {
      data = (void *)0x0;
      str = ASN1_STRING_new();
    }
    else {
      data = CRYPTO_malloc((int)local_70,"providers/implementations/encode_decode/encode_key2any.c",
                           0x363);
      if (((data == (void *)0x0) || (iVar1 = WPACKET_init_der(auStack_68,data,local_70), iVar1 == 0)
          ) || ((iVar1 = ossl_DER_w_RSASSA_PSS_params(auStack_68,0xffffffff,uVar2), iVar1 == 0 ||
                ((iVar1 = WPACKET_finish(auStack_68), iVar1 == 0 ||
                 (iVar1 = WPACKET_get_total_written(auStack_68,&local_70), iVar1 == 0))))))
      goto LAB_00b3f064;
      WPACKET_cleanup(auStack_68);
      str = ASN1_STRING_new();
    }
    if (str != (ASN1_STRING *)0x0) {
      *param_5 = 0x10;
      ASN1_STRING_set0(str,data,(int)local_70);
      *param_4 = str;
      return 1;
    }
  }
LAB_00b3f074:
  CRYPTO_free(data);
  return 0;
}

