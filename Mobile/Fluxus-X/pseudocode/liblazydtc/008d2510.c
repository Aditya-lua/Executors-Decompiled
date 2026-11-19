/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d2510
 */

void LZ4_resetStream(void *param_1)

{
  memset(param_1,0,0x4020);
  return;
}

