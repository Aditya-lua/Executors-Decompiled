/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6aedc
 */

ulong mbedtls_cipher_auth_decrypt_ext
                (long *param_1,undefined8 param_2,ulong param_3,undefined8 param_4,long param_5,
                long param_6,ulong param_7,undefined8 param_8,ulong param_9,ulong *param_10,
                ulong param_11)

{
  ulong uVar1;
  uint uVar2;
  bool bVar3;
  uint uVar4;
  ulong uVar5;
  long lVar6;
  
  uVar4 = *(uint *)(*param_1 + 8);
  if ((uVar4 & 0xe000) == 0xc000) {
    if ((param_5 == 0 && param_3 == 0) && param_11 == 0) {
      uVar5 = mbedtls_nist_kw_unwrap
                        (param_1[10],(uVar4 & 0xf000) != 0xc000,param_6,param_7,param_8,param_10,
                         param_9);
      return uVar5;
    }
  }
  else {
    uVar5 = param_7 - param_11;
    if ((param_11 <= param_7) && (uVar5 <= param_9)) {
      uVar2 = uVar4 >> 0xc & 0xf;
      lVar6 = (param_6 + param_7) - param_11;
      if (uVar2 == 8) {
        *param_10 = uVar5;
        uVar4 = mbedtls_ccm_auth_decrypt
                          (param_1[10],uVar5,param_2,param_3,param_4,param_5,param_6,param_8,lVar6,
                           param_11);
        bVar3 = uVar4 == 0xfffffff1;
      }
      else if (uVar2 == 6) {
        *param_10 = uVar5;
        uVar4 = mbedtls_gcm_auth_decrypt(param_1[10]);
        bVar3 = uVar4 == 0xffffffee;
      }
      else {
        if ((uVar4 & 0xff0000) != 0x4d0000) {
          return 0xffff9f80;
        }
        uVar1 = 0;
        if (*param_1 != 0) {
          uVar1 = (ulong)(uVar4 >> 3 & 0x1c);
        }
        if (param_11 != 0x10) {
          return 0xffff9f00;
        }
        if (uVar1 != param_3) {
          return 0xffff9f00;
        }
        *param_10 = uVar5;
        uVar4 = mbedtls_chachapoly_auth_decrypt
                          (param_1[10],uVar5,param_2,param_4,param_5,lVar6,param_6);
        bVar3 = uVar4 == 0xffffffaa;
      }
      uVar2 = 0xffff9d00;
      if (!bVar3) {
        uVar2 = uVar4;
      }
      return (ulong)uVar2;
    }
  }
  return 0xffff9f00;
}

