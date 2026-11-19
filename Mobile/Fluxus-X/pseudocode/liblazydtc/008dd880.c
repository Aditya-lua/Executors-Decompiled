/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008dd880
 */

undefined8 LZ4_resetStreamState(void *param_1)

{
  memset(param_1,0,0x4020);
  return 0;
}

