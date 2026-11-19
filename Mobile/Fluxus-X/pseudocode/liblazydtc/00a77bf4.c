/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77bf4
 */

void EVP_PKEY_meth_set_copy(EVP_PKEY_METHOD *pmeth,copy *copy)

{
  *(copy **)(pmeth + 0x10) = copy;
  return;
}

