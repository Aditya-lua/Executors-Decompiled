/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba8ae8
 */

undefined8 mbedtls_rsa_pkcs1_verify(long param_1,int param_2,int param_3,long param_4)

{
  undefined8 uVar1;
  
  if ((param_3 != 0 || param_2 != 0) && (param_4 == 0)) {
    return 0xffffbf80;
  }
  if (*(int *)(param_1 + 0xe0) == 1) {
    uVar1 = mbedtls_rsa_rsassa_pss_verify_ext();
    return uVar1;
  }
  if (*(int *)(param_1 + 0xe0) == 0) {
    uVar1 = mbedtls_rsa_rsassa_pkcs1_v15_verify();
    return uVar1;
  }
  return 0xffffbf00;
}

