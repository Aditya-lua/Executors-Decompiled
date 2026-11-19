/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00946fb0
 */

undefined8 FUN_00946fb0(void *param_1,size_t param_2,long *param_3,long *param_4,long *param_5)

{
  void *pvVar1;
  void *pvVar2;
  void *pvVar3;
  long lVar4;
  long lVar5;
  size_t sVar6;
  long lVar7;
  long lVar8;
  
  pvVar2 = memchr(param_1,0x3a,param_2);
  if (param_5 == (long *)0x0) {
    pvVar3 = (void *)0x0;
    if (pvVar2 != (void *)0x0) goto LAB_0094700c;
LAB_00947058:
    lVar7 = 0;
    if (pvVar3 == (void *)0x0) {
      lVar8 = 0;
    }
    else {
      sVar6 = (long)pvVar3 - (long)param_1;
LAB_00947068:
      pvVar1 = pvVar2;
      if (pvVar2 <= pvVar3 || pvVar2 == (void *)0x0) {
        pvVar1 = (void *)((long)param_1 + param_2);
      }
      lVar8 = ~(ulong)pvVar3 + (long)pvVar1;
      param_2 = sVar6;
    }
  }
  else {
    pvVar3 = memchr(param_1,0x3b,param_2);
    if (pvVar2 == (void *)0x0) goto LAB_00947058;
LAB_0094700c:
    pvVar1 = pvVar3;
    if (pvVar3 == (void *)0x0 || pvVar2 <= pvVar3) {
      pvVar1 = pvVar2;
    }
    sVar6 = (long)pvVar1 - (long)param_1;
    pvVar1 = pvVar3;
    if (pvVar3 == (void *)0x0 || pvVar3 <= pvVar2) {
      pvVar1 = (void *)((long)param_1 + param_2);
    }
    lVar7 = (long)pvVar1 + (-1 - (long)pvVar2);
    if (pvVar3 != (void *)0x0) goto LAB_00947068;
    lVar8 = 0;
    param_2 = sVar6;
  }
  lVar4 = FUN_00941948(param_1,param_2);
  if (lVar4 == 0) {
    lVar5 = 0;
  }
  else {
    lVar5 = 0;
    if ((pvVar2 == (void *)0x0) || (lVar5 = FUN_00941948((long)pvVar2 + 1,lVar7), lVar5 != 0)) {
      if (param_5 != (long *)0x0) {
        if (lVar8 == 0) {
          lVar7 = 0;
        }
        else {
          lVar7 = FUN_00941948((long)pvVar3 + 1,lVar8);
          if (lVar7 == 0) goto LAB_009470c4;
        }
        *param_5 = lVar7;
      }
      *param_3 = lVar4;
      *param_4 = lVar5;
      return 0;
    }
  }
LAB_009470c4:
  (*(code *)PTR_free_00cc4678)(lVar4);
  (*(code *)PTR_free_00cc4678)(lVar5);
  return 0x1b;
}

