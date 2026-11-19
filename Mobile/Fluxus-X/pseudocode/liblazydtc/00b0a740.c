/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b0a740
 */

void X509_OBJECT_free(int *param_1)

{
  if (param_1 != (int *)0x0) {
    if (*param_1 == 2) {
      X509_CRL_free(*(X509_CRL **)(param_1 + 2));
    }
    else if (*param_1 == 1) {
      X509_free(*(X509 **)(param_1 + 2));
    }
  }
  CRYPTO_free(param_1);
  return;
}

