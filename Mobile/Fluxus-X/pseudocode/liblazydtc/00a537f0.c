/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a537f0
 */

DSA_METHOD * ENGINE_get_DSA(ENGINE *e)

{
  return *(DSA_METHOD **)(e + 0x18);
}

