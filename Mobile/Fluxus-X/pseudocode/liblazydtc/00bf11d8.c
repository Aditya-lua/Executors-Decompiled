/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bf11d8
 */

void FUN_00bf11d8(long *param_1,long *param_2,long *param_3)

{
  ulong __size;
  void *__ptr;
  ulong uVar1;
  void *pvVar2;
  long lVar3;
  
  __ptr = (void *)*param_1;
  lVar3 = *param_2;
  uVar1 = *param_3 - (long)__ptr;
  __size = 4;
  if (uVar1 != 0) {
    __size = uVar1 * 2;
  }
  if (0x7ffffffffffffffe < uVar1) {
    __size = 0xffffffffffffffff;
  }
  if ((code *)param_1[1] == std::__ndk1::__do_nothing) {
    pvVar2 = malloc(__size);
    if (pvVar2 == (void *)0x0) goto LAB_00bf12b4;
    *param_1 = (long)pvVar2;
    if (__ptr != (void *)0x0) {
                    /* try { // try from 00bf1264 to 00bf126b has its CatchHandler @ 00bf12b8 */
      std::__ndk1::__do_nothing(__ptr);
      pvVar2 = (void *)*param_1;
    }
  }
  else {
    pvVar2 = realloc(__ptr,__size);
    if (pvVar2 == (void *)0x0) {
LAB_00bf12b4:
      std::__throw_bad_alloc();
                    /* WARNING: Subroutine does not return */
                    /* catch(type#1 @ 00000000) { ... } // from try @ 00bf1264 with catch @ 00bf12b8
                        */
      FUN_007fe114();
    }
    *param_1 = (long)pvVar2;
  }
  *param_2 = (long)pvVar2 + (lVar3 - (long)__ptr);
  param_1[1] = (long)free;
  *param_3 = *param_1 + (__size & 0xfffffffffffffffc);
  return;
}

