/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b98398
 */

undefined8 mbedtls_psa_aead_set_lengths(int *param_1,undefined8 param_2,undefined8 param_3)

{
  undefined8 uVar1;
  
  if (*param_1 == 0x5500100) {
    mbedtls_ccm_set_lengths(param_1 + 2,param_2,param_3,*(undefined1 *)((long)param_1 + 7));
    uVar1 = mbedtls_to_psa_error();
    return uVar1;
  }
  return 0;
}

