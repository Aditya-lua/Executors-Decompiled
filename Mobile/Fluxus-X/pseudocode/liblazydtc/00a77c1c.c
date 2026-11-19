/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77c1c
 */

void EVP_PKEY_meth_set_verify(EVP_PKEY_METHOD *pmeth,verify_init *verify_init,verify *verify)

{
  *(verify_init **)(pmeth + 0x50) = verify_init;
  *(verify **)(pmeth + 0x58) = verify;
  return;
}

