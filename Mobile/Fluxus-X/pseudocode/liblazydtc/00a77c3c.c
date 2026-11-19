/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a77c3c
 */

void EVP_PKEY_meth_set_encrypt
               (EVP_PKEY_METHOD *pmeth,encrypt_init *encrypt_init,encryptfn *encryptfn)

{
  *(encrypt_init **)(pmeth + 0x90) = encrypt_init;
  *(encryptfn **)(pmeth + 0x98) = encryptfn;
  return;
}

