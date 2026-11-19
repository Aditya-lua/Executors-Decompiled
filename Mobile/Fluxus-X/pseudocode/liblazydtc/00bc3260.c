/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc3260
 */

/* std::__ndk1::align(unsigned long, unsigned long, void*&, unsigned long&) */

void * std::__ndk1::align(ulong param_1,ulong param_2,void **param_3,ulong *param_4)

{
  void *pvVar1;
  ulong uVar2;
  ulong uVar3;
  
  uVar2 = *param_4;
  if (uVar2 < param_2) {
    return (void *)0x0;
  }
  pvVar1 = (void *)((long)*param_3 + (param_1 - 1) & -param_1);
  uVar3 = (long)pvVar1 - (long)*param_3;
  if (uVar2 - param_2 < uVar3) {
    return (void *)0x0;
  }
  *param_3 = pvVar1;
  *param_4 = uVar2 - uVar3;
  return pvVar1;
}

