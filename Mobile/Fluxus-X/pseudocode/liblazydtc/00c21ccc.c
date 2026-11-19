/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c21ccc
 */

void FUN_00c21ccc(long *param_1)

{
  char cVar1;
  long lVar2;
  void *__dest;
  size_t __n;
  long *__ptr;
  long *plVar3;
  
  if ((char *)param_1[1] == (char *)*param_1) {
LAB_00c21d54:
    FUN_00c153b4();
    return;
  }
  cVar1 = *(char *)*param_1;
  if (cVar1 == 'D') {
    lVar2 = FUN_00c15284();
    if (lVar2 == 0) {
      return;
    }
    plVar3 = (long *)param_1[0x26];
    if (plVar3 != (long *)param_1[0x27]) goto LAB_00c21e00;
    __ptr = (long *)param_1[0x25];
    __n = (long)plVar3 - (long)__ptr;
    if (__ptr == param_1 + 0x28) {
      __dest = malloc(__n * 2);
      if (__dest == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (plVar3 != __ptr) {
LAB_00c21dd0:
        memmove(__dest,__ptr,__n);
      }
LAB_00c21de4:
      param_1[0x25] = (long)__dest;
    }
    else {
      __dest = realloc(__ptr,__n * 2);
      param_1[0x25] = (long)__dest;
      if (__dest == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
    }
  }
  else {
    if (cVar1 != 'T') goto LAB_00c21d54;
    lVar2 = FUN_00c14ebc();
    if (lVar2 == 0) {
      return;
    }
    plVar3 = (long *)param_1[0x26];
    if (plVar3 != (long *)param_1[0x27]) goto LAB_00c21e00;
    __ptr = (long *)param_1[0x25];
    __n = (long)plVar3 - (long)__ptr;
    if (__ptr == param_1 + 0x28) {
      __dest = malloc(__n * 2);
      if (__dest == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
        abort();
      }
      if (plVar3 != param_1 + 0x28) goto LAB_00c21dd0;
      goto LAB_00c21de4;
    }
    __dest = realloc(__ptr,__n * 2);
    param_1[0x25] = (long)__dest;
    if (__dest == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
  }
  plVar3 = (long *)((long)__dest + __n);
  param_1[0x27] = (long)((long)__dest + ((long)__n >> 2) * 8);
LAB_00c21e00:
  *plVar3 = lVar2;
  param_1[0x26] = (long)(plVar3 + 1);
  return;
}

