/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a75674
 */

void EVP_PKEY_meth_free(EVP_PKEY_METHOD *pmeth)

{
  if ((pmeth == (EVP_PKEY_METHOD *)0x0) || (((byte)pmeth[4] & 1) == 0)) {
    return;
  }
  CRYPTO_free(pmeth);
  return;
}

