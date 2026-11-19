/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b98cf0
 */

undefined8 mbedtls_psa_cipher_set_iv(long param_1,undefined8 param_2,ulong param_3)

{
  undefined8 uVar1;
  
  if (*(byte *)(param_1 + 4) == param_3) {
    mbedtls_cipher_set_iv(param_1 + 8);
    uVar1 = mbedtls_to_psa_error();
    return uVar1;
  }
  return 0xffffff79;
}

