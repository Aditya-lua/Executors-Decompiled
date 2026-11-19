/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a537f8
 */

int ENGINE_set_DSA(ENGINE *e,DSA_METHOD *dsa_meth)

{
  *(DSA_METHOD **)(e + 0x18) = dsa_meth;
  return 1;
}

