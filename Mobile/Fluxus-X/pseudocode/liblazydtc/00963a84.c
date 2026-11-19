/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00963a84
 */

undefined8 FUN_00963a84(char *param_1,char *param_2,char *param_3,undefined8 param_4)

{
  long lVar1;
  undefined1 *puVar2;
  size_t __n;
  size_t __n_00;
  size_t __n_01;
  undefined8 uVar3;
  void *__dest;
  
  if (param_1 == (char *)0x0) {
    __n = 0;
  }
  else {
    __n = strlen(param_1);
  }
  __n_00 = strlen(param_2);
  __n_01 = strlen(param_3);
  uVar3 = 0x1b;
  if (((__n_00 | __n) >> 0x3e == 0) && (__n_01 < 0x7ffffffffffffffe)) {
    lVar1 = __n_00 + __n + __n_01;
    __dest = (void *)(*(code *)PTR_malloc_00cc4670)(lVar1 + 3);
    if (__dest == (void *)0x0) {
      uVar3 = 0x1b;
    }
    else {
      lVar1 = lVar1 + 2;
      if (__n != 0) {
        memcpy(__dest,param_1,__n);
      }
      puVar2 = (undefined1 *)((long)__dest + __n);
      *puVar2 = 0;
      memcpy(puVar2 + 1,param_2,__n_00);
      *(undefined1 *)((long)__dest + __n_00 + __n + 1) = 0;
      memcpy(puVar2 + __n_00 + 2,param_3,__n_01);
      *(undefined1 *)((long)__dest + lVar1) = 0;
      FUN_0092525c(param_4,__dest,lVar1,curl_free);
      uVar3 = 0;
    }
  }
  return uVar3;
}

