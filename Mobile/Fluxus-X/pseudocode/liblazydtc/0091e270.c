/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091e270
 */

undefined8
FUN_0091e270(undefined8 *param_1,void *param_2,size_t param_3,long param_4,undefined8 param_5,
            long param_6,undefined8 param_7,long param_8,undefined8 param_9)

{
  void *__dest;
  long lVar1;
  undefined8 uVar2;
  
  if (0x18 < param_3 + 1) {
    return 0x2b;
  }
  __dest = (void *)(*(code *)PTR_calloc_00cc4690)(1,0xa0);
  if (__dest != (void *)0x0) {
    memcpy(__dest,param_2,param_3);
    if (param_4 == 0) {
LAB_0091e308:
      if (param_6 != 0) {
        lVar1 = FUN_00941948(param_6,param_7);
        *(long *)((long)__dest + 0x20) = lVar1;
        if (lVar1 == 0) goto LAB_0091e360;
      }
      if (param_8 != 0) {
        lVar1 = FUN_00941948(param_8,param_9);
        *(long *)((long)__dest + 0x28) = lVar1;
        if (lVar1 == 0) goto LAB_0091e360;
      }
      FUN_0091fdb8((long)__dest + 0x30,0,0x100000);
      FUN_0091fdb8((long)__dest + 0x68,0,0x100000);
      uVar2 = 0;
      goto LAB_0091e3b0;
    }
    lVar1 = FUN_00941948(param_4,param_5);
    *(long *)((long)__dest + 0x18) = lVar1;
    if (lVar1 != 0) goto LAB_0091e308;
LAB_0091e360:
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)((long)__dest + 0x18));
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)((long)__dest + 0x20));
    (*(code *)PTR_free_00cc4678)(*(undefined8 *)((long)__dest + 0x28));
    FUN_0091fdcc((long)__dest + 0x30);
    FUN_0091fdcc((long)__dest + 0x68);
    (*(code *)PTR_free_00cc4678)(__dest);
    __dest = (void *)0x0;
  }
  uVar2 = 0x1b;
LAB_0091e3b0:
  *param_1 = __dest;
  return uVar2;
}

