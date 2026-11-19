/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a53d10
 */

RAND_METHOD * ENGINE_get_RAND(ENGINE *e)

{
  return *(RAND_METHOD **)(e + 0x30);
}

