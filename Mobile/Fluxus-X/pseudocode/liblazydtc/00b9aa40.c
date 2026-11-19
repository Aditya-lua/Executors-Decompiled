/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9aa40
 */

void mbedtls_psa_ecp_load_public_part(long param_1)

{
  int iVar1;
  
  iVar1 = mbedtls_ecp_is_zero(param_1 + 0xd0);
  if (iVar1 != 0) {
    mbedtls_ecp_mul(param_1,param_1 + 0xd0,param_1 + 0xc0,param_1 + 0x38,mbedtls_psa_get_random,0);
  }
  mbedtls_to_psa_error();
  return;
}

