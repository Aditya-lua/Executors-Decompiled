/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b982dc
 */

undefined8 mbedtls_psa_aead_set_nonce(int *param_1,undefined8 param_2,long param_3)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = *param_1;
  if (iVar1 == 0x5100500) {
    if (param_3 == 0xc) {
      mbedtls_chachapoly_starts(param_1 + 2,param_2,~*(byte *)((long)param_1 + 6) & 1);
      uVar2 = mbedtls_to_psa_error();
      return uVar2;
    }
    return 0xffffff79;
  }
  if (iVar1 == 0x5500100) {
    mbedtls_ccm_starts(param_1 + 2,*(byte *)((long)param_1 + 6) & 1,param_2);
    uVar2 = mbedtls_to_psa_error();
    return uVar2;
  }
  if (iVar1 == 0x5500200) {
    mbedtls_gcm_starts(param_1 + 2,*(byte *)((long)param_1 + 6) & 1,param_2);
    uVar2 = mbedtls_to_psa_error();
    return uVar2;
  }
  return 0xffffff7a;
}

