/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77c44
 */

void EVP_PKEY_meth_set_decrypt(EVP_PKEY_METHOD *pmeth,decrypt_init *decrypt_init,decrypt *decrypt)

{
  *(decrypt_init **)(pmeth + 0xa0) = decrypt_init;
  *(decrypt **)(pmeth + 0xa8) = decrypt;
  return;
}

