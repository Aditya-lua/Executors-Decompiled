/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53e4c
 */

RSA_METHOD * ENGINE_get_RSA(ENGINE *e)

{
  return *(RSA_METHOD **)(e + 0x10);
}

