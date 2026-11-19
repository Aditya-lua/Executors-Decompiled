/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090f894
 */

long FUN_0090f894(char *param_1,undefined1 *param_2,ulong param_3)

{
  long lVar1;
  size_t sVar2;
  void *__dest;
  ulong __n;
  
  *param_2 = 0;
  lVar1 = (*(code *)PTR_calloc_00cc4690)(1,0x9e);
  if (lVar1 != 0) {
    *(undefined2 *)(lVar1 + 0x30) = 1;
    *(undefined2 **)(lVar1 + 0x20) = (undefined2 *)(lVar1 + 0x30);
    sVar2 = strlen(param_1);
    __n = sVar2 + 1;
    if (__n < 0x6d) {
      *(undefined8 *)(lVar1 + 4) = 0x100000001;
      *(uint *)(lVar1 + 0x10) = (int)sVar2 + 3U & 0x7fffffff;
      if ((param_3 & 1) == 0) {
        __dest = (void *)(lVar1 + 0x32);
      }
      else {
        __dest = (void *)(lVar1 + 0x33);
        __n = sVar2;
      }
      memcpy(__dest,param_1,__n);
    }
    else {
      (*(code *)PTR_free_00cc4678)(lVar1);
      lVar1 = 0;
      *param_2 = 1;
    }
  }
  return lVar1;
}

