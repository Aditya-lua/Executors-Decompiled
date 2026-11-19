/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77c0c
 */

void EVP_PKEY_meth_set_keygen(EVP_PKEY_METHOD *pmeth,keygen_init *keygen_init,keygen *keygen)

{
  *(keygen_init **)(pmeth + 0x30) = keygen_init;
  *(keygen **)(pmeth + 0x38) = keygen;
  return;
}

