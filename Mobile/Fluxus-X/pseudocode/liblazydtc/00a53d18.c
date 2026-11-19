/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53d18
 */

int ENGINE_set_RAND(ENGINE *e,RAND_METHOD *rand_meth)

{
  *(RAND_METHOD **)(e + 0x30) = rand_meth;
  return 1;
}

