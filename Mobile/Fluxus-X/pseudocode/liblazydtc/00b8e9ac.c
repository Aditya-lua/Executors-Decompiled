/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8e9ac
 */

undefined8
psa_key_agreement_raw_builtin
          (undefined8 param_1,undefined8 param_2,undefined8 param_3,int param_4,undefined8 param_5,
          undefined8 param_6,undefined8 param_7,undefined8 param_8,undefined8 param_9)

{
  undefined8 uVar1;
  
  if (param_4 == 0x9010000) {
    uVar1 = mbedtls_psa_ffdh_key_agreement
                      (param_1,param_5,param_6,param_2,param_3,param_7,param_8,param_9);
    return uVar1;
  }
  if (param_4 == 0x9020000) {
    uVar1 = mbedtls_psa_key_agreement_ecdh(param_1,param_2,param_3,0x9020000);
    return uVar1;
  }
  return 0xffffff7a;
}

