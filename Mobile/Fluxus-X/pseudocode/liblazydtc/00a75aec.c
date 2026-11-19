/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75aec
 */

void evp_app_cleanup_int(void)

{
  if (DAT_00d21b48 == 0) {
    return;
  }
  OPENSSL_sk_pop_free(DAT_00d21b48,EVP_PKEY_meth_free);
  return;
}

