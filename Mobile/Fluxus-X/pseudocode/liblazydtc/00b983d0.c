/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b983d0
 */

undefined8 mbedtls_psa_aead_update_ad(int *param_1)

{
  int iVar1;
  undefined8 uVar2;
  
  iVar1 = *param_1;
  if (iVar1 == 0x5100500) {
    mbedtls_chachapoly_update_aad(param_1 + 2);
    uVar2 = mbedtls_to_psa_error();
    return uVar2;
  }
  if (iVar1 == 0x5500100) {
    mbedtls_ccm_update_ad(param_1 + 2);
    uVar2 = mbedtls_to_psa_error();
    return uVar2;
  }
  if (iVar1 == 0x5500200) {
    mbedtls_gcm_update_ad(param_1 + 2);
    uVar2 = mbedtls_to_psa_error();
    return uVar2;
  }
  return 0xffffff7a;
}

