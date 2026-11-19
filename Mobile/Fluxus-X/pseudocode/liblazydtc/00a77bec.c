/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77bec
 */

void EVP_PKEY_meth_set_init(EVP_PKEY_METHOD *pmeth,init *init)

{
  *(init **)(pmeth + 8) = init;
  return;
}

