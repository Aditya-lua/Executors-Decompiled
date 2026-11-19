/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6ad58
 */

ulong mbedtls_cipher_auth_encrypt_ext
                (long *param_1,undefined8 param_2,ulong param_3,undefined8 param_4,long param_5,
                undefined8 param_6,long param_7,long param_8,ulong param_9,long *param_10,
                long param_11)

{
  ulong uVar1;
  uint uVar2;
  uint uVar3;
  ulong uVar4;
  
  uVar2 = *(uint *)(*param_1 + 8);
  if ((uVar2 & 0xe000) == 0xc000) {
    if ((param_5 == 0 && param_3 == 0) && param_11 == 0) {
      uVar4 = mbedtls_nist_kw_wrap
                        (param_1[10],(uVar2 & 0xf000) != 0xc000,param_6,param_7,param_8,param_10,
                         param_9);
      return uVar4;
    }
    return 0xffff9f00;
  }
  if (param_9 < (ulong)(param_11 + param_7)) {
    return 0xffff9f00;
  }
  uVar3 = uVar2 >> 0xc & 0xf;
  if (uVar3 == 8) {
    *param_10 = param_7;
    uVar4 = mbedtls_ccm_encrypt_and_tag
                      (param_1[10],param_7,param_2,param_3,param_4,param_5,param_6,param_8,
                       param_8 + param_7,param_11);
  }
  else if (uVar3 == 6) {
    *param_10 = param_7;
    uVar4 = mbedtls_gcm_crypt_and_tag(param_1[10],1,param_7);
  }
  else {
    if ((uVar2 & 0xff0000) != 0x4d0000) {
      uVar4 = 0xffff9f80;
      goto LAB_00b6aeb4;
    }
    uVar1 = 0;
    if (*param_1 != 0) {
      uVar1 = (ulong)(uVar2 >> 3 & 0x1c);
    }
    uVar4 = 0xffff9f00;
    if ((param_11 != 0x10) || (uVar1 != param_3)) goto LAB_00b6aeb4;
    *param_10 = param_7;
    uVar4 = mbedtls_chachapoly_encrypt_and_tag
                      (param_1[10],param_7,param_2,param_4,param_5,param_6,param_8,param_8 + param_7
                      );
  }
  uVar4 = uVar4 & 0xffffffff;
LAB_00b6aeb4:
  *param_10 = *param_10 + param_11;
  return uVar4;
}

