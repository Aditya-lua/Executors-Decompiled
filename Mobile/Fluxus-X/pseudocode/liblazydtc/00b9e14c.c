/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9e14c
 */

undefined8 mbedtls_psa_mac_update(uint *param_1)

{
  uint uVar1;
  undefined8 uVar2;
  
  uVar1 = *param_1;
  if (uVar1 != 0) {
    if ((uVar1 & 0xffc07fff) == 0x3c00200) {
      mbedtls_cipher_cmac_update(param_1 + 2);
      uVar2 = mbedtls_to_psa_error();
      return uVar2;
    }
    if ((uVar1 & 0x7fc00000) == 0x3800000) {
      uVar2 = psa_hash_update(param_1 + 4);
      return uVar2;
    }
  }
  return 0xffffff77;
}

