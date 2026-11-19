/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0093f7d8
 */

long * FUN_0093f7d8(undefined8 *param_1)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  long *plVar4;
  long *plVar5;
  
  plVar2 = (long *)0x0;
  if (param_1 != (undefined8 *)0x0) {
    plVar5 = (long *)0x0;
    do {
      lVar1 = (*(code *)PTR_strdup_00cc4688)(*param_1);
      if (lVar1 == 0) {
joined_r0x0093f874:
        while (plVar5 != (long *)0x0) {
          plVar2 = (long *)plVar5[1];
          (*(code *)PTR_free_00cc4678)(*plVar5);
          *plVar5 = 0;
          (*(code *)PTR_free_00cc4678)(plVar5);
          plVar5 = plVar2;
        }
        return (long *)0x0;
      }
      plVar2 = (long *)(*(code *)PTR_malloc_00cc4670)(0x10);
      if (plVar2 == (long *)0x0) {
LAB_0093f860:
        (*(code *)PTR_free_00cc4678)(lVar1);
        goto joined_r0x0093f874;
      }
      *plVar2 = lVar1;
      plVar2[1] = 0;
      if (plVar5 != (long *)0x0) {
        plVar4 = plVar5;
        do {
          plVar3 = plVar4;
          plVar4 = (long *)plVar3[1];
        } while (plVar4 != (long *)0x0);
        plVar3[1] = (long)plVar2;
        plVar2 = plVar5;
      }
      if (plVar2 == (long *)0x0) goto LAB_0093f860;
      param_1 = (undefined8 *)param_1[1];
      plVar5 = plVar2;
    } while (param_1 != (undefined8 *)0x0);
  }
  return plVar2;
}

