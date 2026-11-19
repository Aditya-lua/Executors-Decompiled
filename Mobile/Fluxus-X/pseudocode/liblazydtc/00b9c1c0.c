/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9c1c0
 */

void mbedtls_ecdsa_free(long param_1)

{
  if (param_1 == 0) {
    return;
  }
  mbedtls_ecp_keypair_free();
  return;
}

