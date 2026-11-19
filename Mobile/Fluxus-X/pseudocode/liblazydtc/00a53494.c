/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53494
 */

DH_METHOD * ENGINE_get_DH(ENGINE *e)

{
  return *(DH_METHOD **)(e + 0x20);
}

