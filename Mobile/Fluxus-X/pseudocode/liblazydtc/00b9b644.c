/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b9b644
 */

bool mbedtls_ecdsa_can_do(uint param_1)

{
  return (param_1 | 4) != 0xd;
}

