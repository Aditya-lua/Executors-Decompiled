/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b02ff4
 */

undefined4 X509_get_extension_flags(long param_1)

{
  ossl_x509v3_cache_extensions();
  return *(undefined4 *)(param_1 + 0xe8);
}

