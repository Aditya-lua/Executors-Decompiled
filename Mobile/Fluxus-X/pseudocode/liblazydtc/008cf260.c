/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008cf260
 */

void * LZ4_initStream(void *param_1,ulong param_2)

{
  void *pvVar1;
  
  if (((param_1 == (void *)0x0) || (param_2 >> 5 < 0x201)) || (((ulong)param_1 & 7) != 0)) {
    return (void *)0x0;
  }
  pvVar1 = memset(param_1,0,0x4020);
  return pvVar1;
}

