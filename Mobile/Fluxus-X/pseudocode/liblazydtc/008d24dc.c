/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d24dc
 */

void LZ4_createStream(void)

{
  void *__s;
  
  __s = malloc(0x4020);
  if ((__s == (void *)0x0) || (((ulong)__s & 7) != 0)) {
    return;
  }
  memset(__s,0,0x4020);
  return;
}

