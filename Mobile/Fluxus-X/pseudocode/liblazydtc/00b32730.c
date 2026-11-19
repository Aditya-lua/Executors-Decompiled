/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b32730
 */

undefined8 FUN_00b32730(long param_1,void *param_2,size_t param_3)

{
  void *__dest;
  long lVar1;
  long lVar2;
  size_t sVar3;
  
  if (param_3 != 0) {
    lVar1 = *(long *)(param_1 + 0xd8);
    if (lVar1 != 0) {
      lVar2 = *(long *)(param_1 + 200);
      __dest = (void *)(param_1 + 0xe0 + lVar1);
      sVar3 = lVar2 - lVar1;
      if (param_3 < sVar3) {
        memcpy(__dest,param_2,param_3);
        *(size_t *)(param_1 + 0xd8) = *(long *)(param_1 + 0xd8) + param_3;
        return 1;
      }
      memcpy(__dest,param_2,sVar3);
      param_2 = (void *)((long)param_2 + sVar3);
      param_3 = param_3 - sVar3;
      (**(code **)(param_1 + 400))(param_1,param_1 + 0xe0,lVar2);
      *(undefined8 *)(param_1 + 0xd8) = 0;
    }
    sVar3 = (**(code **)(param_1 + 400))(param_1,param_2,param_3);
    if (sVar3 != 0) {
      memcpy((void *)(param_1 + 0xe0),(void *)((long)param_2 + (param_3 - sVar3)),sVar3);
      *(size_t *)(param_1 + 0xd8) = sVar3;
    }
  }
  return 1;
}

