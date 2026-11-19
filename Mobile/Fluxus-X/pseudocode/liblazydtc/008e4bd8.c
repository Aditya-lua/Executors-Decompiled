/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e4bd8
 */

undefined8 CodePatch(ulong param_1,void *param_2,uint param_3)

{
  void *__dest;
  int iVar1;
  long lVar2;
  void *__addr;
  
  lVar2 = sysconf(0x27);
  iVar1 = (int)lVar2;
  __addr = (void *)(-(long)iVar1 & param_1);
  mprotect(__addr,(long)iVar1,7);
  __dest = (void *)((long)__addr + (long)((int)param_1 - (int)__addr));
  memcpy(__dest,param_2,(ulong)param_3);
  mprotect(__addr,(long)iVar1,5);
  thunk_FUN_008e4c60(__dest,(long)__dest + (ulong)param_3);
  return 0;
}

