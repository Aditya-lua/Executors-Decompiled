/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008da334
 */

undefined8 LZ4_freeStreamDecode(void *param_1)

{
  if (param_1 != (void *)0x0) {
    free(param_1);
  }
  return 0;
}

