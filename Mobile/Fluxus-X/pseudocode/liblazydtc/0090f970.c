/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090f970
 */

pthread_t * FUN_0090f970(undefined8 param_1,undefined8 param_2)

{
  int iVar1;
  pthread_t *__newthread;
  undefined8 *__arg;
  
  __newthread = (pthread_t *)(*(code *)PTR_malloc_00cc4670)(8);
  __arg = (undefined8 *)(*(code *)PTR_malloc_00cc4670)(0x10);
  if ((__newthread != (pthread_t *)0x0) && (__arg != (undefined8 *)0x0)) {
    *__arg = param_1;
    __arg[1] = param_2;
    iVar1 = pthread_create(__newthread,(pthread_attr_t *)0x0,FUN_0090fa10,__arg);
    if (iVar1 == 0) {
      return __newthread;
    }
  }
  (*(code *)PTR_free_00cc4678)(__newthread);
  (*(code *)PTR_free_00cc4678)(__arg);
  return (pthread_t *)0x0;
}

