/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77bfc
 */

void EVP_PKEY_meth_set_cleanup(EVP_PKEY_METHOD *pmeth,cleanup *cleanup)

{
  *(cleanup **)(pmeth + 0x18) = cleanup;
  return;
}

