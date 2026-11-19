/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77c04
 */

void EVP_PKEY_meth_set_paramgen
               (EVP_PKEY_METHOD *pmeth,paramgen_init *paramgen_init,paramgen *paramgen)

{
  *(paramgen_init **)(pmeth + 0x20) = paramgen_init;
  *(paramgen **)(pmeth + 0x28) = paramgen;
  return;
}

