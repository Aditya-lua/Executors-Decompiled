/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9dc70
 */

undefined8 mbedtls_psa_mac_abort(uint *param_1)

{
  uint uVar1;
  
  uVar1 = *param_1;
  if (uVar1 != 0) {
    if ((uVar1 & 0xffc07fff) == 0x3c00200) {
      mbedtls_cipher_free(param_1 + 2);
    }
    else {
      if ((uVar1 & 0x7fc00000) != 0x3800000) {
        memset(param_1,0,0x188);
        return 0xffffff77;
      }
      mbedtls_platform_zeroize(param_1 + 0x3e,0x90);
      psa_hash_abort(param_1 + 4);
    }
    *param_1 = 0;
  }
  return 0;
}

