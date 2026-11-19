/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bef074
 */

void FUN_00bef074(long *param_1,long *param_2,long *param_3)

{
  void *__ptr;
  void *pvVar1;
  size_t __size;
  long lVar2;
  
  __ptr = (void *)*param_1;
  lVar2 = *param_2;
  __size = (*param_3 - (long)__ptr) * 2;
  if (__size < 2) {
    __size = 1;
  }
  if (0x7ffffffffffffffe < (ulong)(*param_3 - (long)__ptr)) {
    __size = 0xffffffffffffffff;
  }
  if ((code *)param_1[1] == std::__ndk1::__do_nothing) {
    pvVar1 = malloc(__size);
    if (pvVar1 == (void *)0x0) goto LAB_00bef14c;
    *param_1 = (long)pvVar1;
    if (__ptr != (void *)0x0) {
                    /* try { // try from 00bef100 to 00bef107 has its CatchHandler @ 00bef150 */
      std::__ndk1::__do_nothing(__ptr);
      pvVar1 = (void *)*param_1;
    }
  }
  else {
    pvVar1 = realloc(__ptr,__size);
    if (pvVar1 == (void *)0x0) {
LAB_00bef14c:
      std::__throw_bad_alloc();
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00bef100 with catch @ 00bef150
                        */
      FUN_007fe114();
    }
    *param_1 = (long)pvVar1;
  }
  *param_2 = (long)pvVar1 + (lVar2 - (long)__ptr);
  param_1[1] = (long)free;
  *param_3 = *param_1 + __size;
  return;
}

