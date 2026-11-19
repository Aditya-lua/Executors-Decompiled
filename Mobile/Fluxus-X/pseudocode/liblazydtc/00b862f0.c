/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b862f0
 */

void * mbedtls_asn1_store_named_data
                 (undefined8 *param_1,void *param_2,size_t param_3,void *param_4,size_t param_5)

{
  void *__ptr;
  void *pvVar1;
  void *pvVar2;
  
  __ptr = (void *)mbedtls_asn1_find_named_data(*param_1);
  if (__ptr == (void *)0x0) {
    __ptr = calloc(1,0x40);
    if (__ptr == (void *)0x0) {
      return (void *)0x0;
    }
    *(size_t *)((long)__ptr + 8) = param_3;
    pvVar1 = calloc(1,param_3);
    *(void **)((long)__ptr + 0x10) = pvVar1;
    if (pvVar1 == (void *)0x0) {
LAB_00b863fc:
      free(__ptr);
      return (void *)0x0;
    }
    memcpy(pvVar1,param_2,param_3);
    *(size_t *)((long)__ptr + 0x20) = param_5;
    if (param_5 != 0) {
      pvVar2 = calloc(1,param_5);
      *(void **)((long)__ptr + 0x28) = pvVar2;
      if (pvVar2 == (void *)0x0) {
        free(pvVar1);
        goto LAB_00b863fc;
      }
    }
    *(undefined8 *)((long)__ptr + 0x30) = *param_1;
    *param_1 = __ptr;
  }
  else {
    if (param_5 == 0) {
      free(*(void **)((long)__ptr + 0x28));
      *(undefined8 *)((long)__ptr + 0x28) = 0;
      return __ptr;
    }
    if (*(size_t *)((long)__ptr + 0x20) != param_5) {
      pvVar1 = calloc(1,param_5);
      if (pvVar1 == (void *)0x0) {
        return (void *)0x0;
      }
      free(*(void **)((long)__ptr + 0x28));
      *(size_t *)((long)__ptr + 0x20) = param_5;
      *(void **)((long)__ptr + 0x28) = pvVar1;
    }
  }
  if ((param_4 != (void *)0x0) && (param_5 != 0)) {
    memcpy(*(void **)((long)__ptr + 0x28),param_4,param_5);
  }
  return __ptr;
}

