/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9c1cc
 */

void mbedtls_ecdsa_init(void)

{
  mbedtls_ecp_keypair_init();
  return;
}

