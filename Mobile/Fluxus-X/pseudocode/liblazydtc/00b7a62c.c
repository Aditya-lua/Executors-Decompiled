/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b7a62c
 */

undefined8
mbedtls_nist_kw_setkey
          (undefined8 param_1,int param_2,undefined8 param_3,undefined4 param_4,int param_5)

{
  long lVar1;
  undefined8 uVar2;
  
  lVar1 = mbedtls_cipher_info_from_values(param_2,param_4,1);
  if ((lVar1 == 0) || ((*(uint *)(lVar1 + 8) & 0x1f) != 0x10)) {
    uVar2 = 0xffff9f00;
  }
  else if (param_2 == 2) {
    mbedtls_cipher_free(param_1);
    uVar2 = mbedtls_cipher_setup(param_1,lVar1);
    if ((int)uVar2 == 0) {
      uVar2 = mbedtls_cipher_setkey(param_1,param_3,param_4,param_5 != 0);
      return uVar2;
    }
  }
  else {
    uVar2 = 0xffff9f80;
  }
  return uVar2;
}

