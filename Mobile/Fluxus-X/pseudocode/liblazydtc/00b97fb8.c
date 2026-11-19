/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b97fb8
 */

undefined8 mbedtls_psa_aead_abort(int *param_1)

{
  int iVar1;
  
  iVar1 = *param_1;
  if (iVar1 == 0x5100500) {
    mbedtls_chachapoly_free(param_1 + 2);
  }
  else if (iVar1 == 0x5500200) {
    mbedtls_gcm_free(param_1 + 2);
  }
  else if (iVar1 == 0x5500100) {
    mbedtls_ccm_free(param_1 + 2);
  }
  *(byte *)((long)param_1 + 6) = *(byte *)((long)param_1 + 6) & 0xfe;
  return 0;
}

