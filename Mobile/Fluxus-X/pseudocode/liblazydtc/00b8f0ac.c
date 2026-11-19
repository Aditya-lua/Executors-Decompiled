/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8f0ac
 */

undefined8
psa_generate_key_internal
          (ushort *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,long param_5,
          ulong param_6,undefined8 param_7)

{
  ulong uVar1;
  ushort uVar2;
  int iVar3;
  undefined8 uVar4;
  long lVar5;
  ulong uVar6;
  
  uVar2 = *param_1;
  if (((uVar2 & 0x7000) == 0x2000) || ((uVar2 & 0x7000) == 0x1000)) {
    uVar4 = 0xffffff77;
    if ((DAT_00d25b11 == '\x02') && (DAT_00d25b10 == '\a')) {
      if (param_6 != 0) {
        lVar5 = param_5;
        uVar6 = param_6;
        do {
          uVar1 = uVar6;
          if (0x3ff < uVar6) {
            uVar1 = 0x400;
          }
          iVar3 = mbedtls_ctr_drbg_random(&DAT_00d25e68,lVar5,uVar1);
          if (iVar3 != 0) {
            uVar4 = mbedtls_to_psa_error();
            if ((int)uVar4 != 0) {
              return uVar4;
            }
            break;
          }
          uVar6 = uVar6 - uVar1;
          lVar5 = lVar5 + uVar1;
        } while (uVar6 != 0);
        if (7 < param_6) {
          if (uVar2 != 0x2301) {
            return 0;
          }
          mbedtls_des_key_set_parity(param_5);
          if (param_6 < 0x10) {
            return 0;
          }
          mbedtls_des_key_set_parity(param_5 + 8);
          if (param_6 < 0x18) {
            return 0;
          }
          mbedtls_des_key_set_parity(param_5 + 0x10);
        }
      }
      uVar4 = 0;
    }
  }
  else {
    if (uVar2 == 0x7001) {
      uVar4 = mbedtls_psa_rsa_generate_key(param_1,param_3,param_4,param_5,param_6,param_7);
      return uVar4;
    }
    if ((uVar2 & 0xff00) == 0x7200) {
      uVar4 = mbedtls_psa_ffdh_generate_key(param_1,param_5,param_6,param_7);
      return uVar4;
    }
    if ((uVar2 & 0xff00) == 0x7100) {
      uVar4 = mbedtls_psa_ecp_generate_key(param_1,param_5,param_6,param_7);
      return uVar4;
    }
    uVar4 = 0xffffff7a;
  }
  return uVar4;
}

