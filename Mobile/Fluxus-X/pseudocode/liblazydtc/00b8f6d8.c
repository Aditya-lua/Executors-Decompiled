/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b8f6d8
 */

undefined8 mbedtls_psa_crypto_configure_entropy_sources(undefined8 param_1,undefined8 param_2)

{
  if (DAT_00d25b11 == '\0') {
    DAT_00d25b18 = param_1;
    DAT_00d25b20 = param_2;
    return 0;
  }
  return 0xffffff77;
}

