/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b78e1c
 */

void mbedtls_md_error_from_psa(undefined8 param_1)

{
  psa_status_to_mbedtls(param_1,psa_to_md_errors,4,psa_generic_status_to_mbedtls);
  return;
}

