/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00944f28
 */

long * FUN_00944f28(undefined8 *param_1)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  
  plVar2 = (long *)(*(code *)PTR_malloc_00cc4670)(0x10);
  if (plVar2 != (long *)0x0) {
    lVar3 = (*(code *)PTR_malloc_00cc4670)(*(undefined4 *)(param_1 + 3));
    plVar2[1] = lVar3;
    if (lVar3 != 0) {
      *plVar2 = (long)param_1;
      iVar1 = (*(code *)*param_1)();
      if (iVar1 == 0) {
        return plVar2;
      }
      (*(code *)PTR_free_00cc4678)(plVar2[1]);
    }
    (*(code *)PTR_free_00cc4678)(plVar2);
  }
  return (long *)0x0;
}

