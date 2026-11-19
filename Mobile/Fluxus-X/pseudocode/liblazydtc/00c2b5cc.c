/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00c2b5cc
 */

void * __emutls_get_address(size_t *param_1)

{
  pthread_key_t __key;
  undefined8 *__ptr;
  void *pvVar1;
  void *__s;
  size_t __n;
  ulong uVar2;
  size_t sVar3;
  long lVar4;
  
  sVar3 = param_1[2];
  if (sVar3 == 0) {
    pthread_once((pthread_once_t *)&DAT_00d280a8,FUN_00c2b7f4);
    pthread_mutex_lock((pthread_mutex_t *)&DAT_00d280b8);
    sVar3 = param_1[2];
    if (sVar3 == 0) {
      sVar3 = DAT_00d280b0 + 1;
      DAT_00d280b0 = sVar3;
      param_1[2] = sVar3;
    }
    pthread_mutex_unlock((pthread_mutex_t *)&DAT_00d280b8);
    __ptr = pthread_getspecific(DAT_00d280a4);
    if (__ptr == (undefined8 *)0x0) goto LAB_00c2b6ac;
LAB_00c2b600:
    uVar2 = __ptr[1];
    if (sVar3 <= uVar2) goto LAB_00c2b6f4;
    lVar4 = (sVar3 + 0x11 & 0xfffffffffffffff0) - 2;
    __ptr = realloc(__ptr,lVar4 * 8 + 0x10);
    if (__ptr == (undefined8 *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    memset(__ptr + uVar2 + 2,0,(lVar4 - uVar2) * 8);
  }
  else {
    __ptr = pthread_getspecific(DAT_00d280a4);
    if (__ptr != (undefined8 *)0x0) goto LAB_00c2b600;
LAB_00c2b6ac:
    lVar4 = (sVar3 + 0x11 & 0xfffffffffffffff0) - 2;
    __ptr = malloc(lVar4 * 8 + 0x10);
    if (__ptr == (undefined8 *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    memset(__ptr + 2,0,lVar4 * 8);
    *__ptr = 1;
  }
  __key = DAT_00d280a4;
  __ptr[1] = lVar4;
  pthread_setspecific(__key,__ptr);
LAB_00c2b6f4:
  if ((void *)__ptr[sVar3 + 1] != (void *)0x0) {
    return (void *)__ptr[sVar3 + 1];
  }
  uVar2 = param_1[1];
  if (uVar2 < 9) {
    uVar2 = 8;
  }
  if ((uVar2 & uVar2 - 1) != 0) {
                    /* WARNING: Subroutine does not return */
    abort();
  }
  __n = *param_1;
  pvVar1 = malloc(uVar2 + 7 + __n);
  if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
    abort();
  }
  __s = (void *)((long)pvVar1 + uVar2 + 7 & -uVar2);
  *(void **)((long)__s + -8) = pvVar1;
  if ((void *)param_1[3] == (void *)0x0) {
    memset(__s,0,__n);
  }
  else {
    memcpy(__s,(void *)param_1[3],__n);
  }
  __ptr[sVar3 + 1] = __s;
  return __s;
}

