/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53e54
 */

int ENGINE_set_RSA(ENGINE *e,RSA_METHOD *rsa_meth)

{
  *(RSA_METHOD **)(e + 0x10) = rsa_meth;
  return 1;
}

