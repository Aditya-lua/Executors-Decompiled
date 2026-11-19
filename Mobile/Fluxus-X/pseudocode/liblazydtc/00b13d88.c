/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b13d88
 */

void X509_VERIFY_PARAM_free(X509_VERIFY_PARAM *param)

{
  if (param == (X509_VERIFY_PARAM *)0x0) {
    return;
  }
  OPENSSL_sk_pop_free(param->policies,ASN1_OBJECT_free);
  OPENSSL_sk_pop_free(param[1].name,&LAB_00b13e10);
  CRYPTO_free((void *)param[1].inh_flags);
  CRYPTO_free((void *)param[1].flags);
  CRYPTO_free(*(void **)&param[1].depth);
  CRYPTO_free(param);
  return;
}

