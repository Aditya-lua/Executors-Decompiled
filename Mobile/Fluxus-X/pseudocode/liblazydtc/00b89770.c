/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b89770
 */

undefined8 psa_sign_hash_builtin(ushort *param_1,undefined8 param_2,undefined8 param_3,uint param_4)

{
  undefined8 uVar1;
  
  if (*param_1 == 0x7001) {
    param_4 = param_4 & 0xffffff00;
    if (((param_4 == 0x6000200) || (param_4 == 0x6001300)) || (param_4 == 0x6000300)) {
      uVar1 = mbedtls_psa_rsa_sign_hash();
      return uVar1;
    }
  }
  else {
    if ((*param_1 & 0xcf00) != 0x4100) {
      return 0xffffff7a;
    }
    if (param_4 >> 9 == 0x30003) {
      uVar1 = mbedtls_psa_ecdsa_sign_hash();
      return uVar1;
    }
  }
  return 0xffffff79;
}

