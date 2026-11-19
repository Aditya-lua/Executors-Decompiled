/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a5349c
 */

int ENGINE_set_DH(ENGINE *e,DH_METHOD *dh_meth)

{
  *(DH_METHOD **)(e + 0x20) = dh_meth;
  return 1;
}

