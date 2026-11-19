/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ba89b4
 */

undefined8 mbedtls_rsa_rsassa_pss_verify(undefined8 param_1,int param_2,int param_3,long param_4)

{
  undefined8 uVar1;
  
  if ((param_3 == 0 && param_2 == 0) || (param_4 != 0)) {
    uVar1 = mbedtls_rsa_rsassa_pss_verify_ext();
    return uVar1;
  }
  return 0xffffbf80;
}

