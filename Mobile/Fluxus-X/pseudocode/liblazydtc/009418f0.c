/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009418f0
 */

void * FUN_009418f0(void *param_1,size_t param_2)

{
  void *__dest;
  
  __dest = (void *)(*(code *)PTR_malloc_00cc4670)(param_2);
  if (__dest != (void *)0x0) {
    memcpy(__dest,param_1,param_2);
  }
  return __dest;
}

