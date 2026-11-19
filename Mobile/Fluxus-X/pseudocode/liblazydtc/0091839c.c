/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091839c
 */

void FUN_0091839c(undefined8 *param_1)

{
  long *plVar1;
  long lVar2;
  long *plVar3;
  
  plVar1 = (long *)*param_1;
  if (plVar1 != (long *)0x0) {
    plVar3 = (long *)*plVar1;
    while (plVar3 != (long *)0x0) {
      lVar2 = *plVar3;
      plVar3 = (long *)plVar3[2];
      (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar2 + 0x18));
      (*(code *)PTR_free_00cc4678)(lVar2);
    }
    (*(code *)PTR_free_00cc4678)(plVar1[4]);
    (*(code *)PTR_free_00cc4678)(plVar1);
    *param_1 = 0;
  }
  return;
}

