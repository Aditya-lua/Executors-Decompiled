/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba7ff4
 */

undefined8 mbedtls_rsa_pkcs1_decrypt(long param_1)

{
  undefined8 uVar1;
  
  if (*(int *)(param_1 + 0xe0) == 1) {
    uVar1 = mbedtls_rsa_rsaes_oaep_decrypt();
    return uVar1;
  }
  if (*(int *)(param_1 + 0xe0) == 0) {
    uVar1 = mbedtls_rsa_rsaes_pkcs1_v15_decrypt();
    return uVar1;
  }
  return 0xffffbf00;
}

