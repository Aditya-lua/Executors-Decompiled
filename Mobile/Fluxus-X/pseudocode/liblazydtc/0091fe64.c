/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091fe64
 */

undefined8
FUN_0091fe64(undefined8 *param_1,void *param_2,size_t param_3,void *param_4,size_t param_5)

{
  undefined8 *__dest;
  long lVar1;
  uint uVar2;
  undefined8 *puVar3;
  long lVar4;
  ulong uVar5;
  void *pvVar6;
  
  if (((param_1[3] == 0) || ((ulong)param_1[1] < (ulong)param_1[3])) &&
     (lVar1 = param_5 + param_3, (ulong)(lVar1 + param_1[4]) <= (ulong)param_1[5])) {
    uVar2 = *(uint *)(param_1 + 6);
    puVar3 = (undefined8 *)(*(code *)PTR_calloc_00cc4690)(1,lVar1 + 0x22);
    if (puVar3 != (undefined8 *)0x0) {
      __dest = puVar3 + 4;
      *puVar3 = __dest;
      memcpy(__dest,param_2,param_3);
      pvVar6 = (void *)((long)__dest + param_3 + 1);
      puVar3[1] = pvVar6;
      puVar3[2] = param_3;
      memcpy(pvVar6,param_4,param_5);
      puVar3[3] = param_5;
      if ((uVar2 & 1) != 0) {
        FUN_00941848(*puVar3,*puVar3,puVar3[2]);
      }
      lVar4 = param_1[1];
      uVar5 = lVar4 + 1;
      if (uVar5 < (ulong)param_1[2]) {
        pvVar6 = (void *)*param_1;
      }
      else {
        uVar5 = param_1[3];
        if (lVar4 + 0x10U <= uVar5 || uVar5 == 0) {
          uVar5 = lVar4 + 0x10U;
        }
        pvVar6 = (void *)(*(code *)PTR_calloc_00cc4690)(uVar5,8);
        if (pvVar6 == (void *)0x0) {
          (*(code *)PTR_free_00cc4678)(puVar3);
          return 0x1b;
        }
        if ((void *)*param_1 != (void *)0x0) {
          memcpy(pvVar6,(void *)*param_1,param_1[1] << 3);
          (*(code *)PTR_free_00cc4678)(*param_1);
          *param_1 = 0;
        }
        lVar4 = param_1[1];
        *param_1 = pvVar6;
        param_1[2] = uVar5;
        uVar5 = lVar4 + 1;
      }
      param_1[1] = uVar5;
      *(undefined8 **)((long)pvVar6 + lVar4 * 8) = puVar3;
      param_1[4] = lVar1 + param_1[4];
      return 0;
    }
  }
  return 0x1b;
}

