/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b1b49c
 */

void X509_CRL_METHOD_free(byte *param_1)

{
  if ((param_1 == (byte *)0x0) || ((*param_1 & 1) == 0)) {
    return;
  }
  CRYPTO_free(param_1);
  return;
}

