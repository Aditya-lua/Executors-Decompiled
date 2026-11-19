/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a68398
 */

void EVP_MAC_CTX_free(long *param_1)

{
  if (param_1 == (long *)0x0) {
    return;
  }
  (**(code **)(*param_1 + 0x40))(param_1[1]);
  param_1[1] = 0;
  EVP_MAC_free(*param_1);
  CRYPTO_free(param_1);
  return;
}

