/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00914c78
 */

void FUN_00914c78(long param_1)

{
  long *plVar1;
  long *plVar2;
  long lVar3;
  long *plVar4;
  long *plVar5;
  long *plVar6;
  
  if (param_1 != 0) {
    lVar3 = 0;
    do {
      plVar1 = *(long **)(param_1 + lVar3 * 8);
      if (plVar1 != (long *)0x0) {
        plVar2 = plVar1;
        plVar4 = plVar1;
        do {
          plVar6 = (long *)*plVar2;
          plVar5 = plVar4;
          if (plVar2[6] == 0) {
            plVar5 = plVar6;
            if (plVar4 != plVar2) {
              plVar5 = plVar4;
            }
            plVar4 = plVar6;
            if (plVar1 != plVar2) {
              *plVar1 = (long)plVar6;
              plVar4 = plVar1;
            }
            (*(code *)PTR_free_00cc4678)(plVar2[5]);
            (*(code *)PTR_free_00cc4678)(plVar2[3]);
            (*(code *)PTR_free_00cc4678)(plVar2[4]);
            (*(code *)PTR_free_00cc4678)(plVar2[1]);
            (*(code *)PTR_free_00cc4678)(plVar2[2]);
            (*(code *)PTR_free_00cc4678)(plVar2);
            *(int *)(param_1 + 0x200) = *(int *)(param_1 + 0x200) + -1;
            plVar2 = plVar4;
          }
          plVar1 = plVar2;
          plVar2 = plVar6;
          plVar4 = plVar5;
        } while (plVar6 != (long *)0x0);
        *(long **)(param_1 + lVar3 * 8) = plVar5;
      }
      lVar3 = lVar3 + 1;
    } while (lVar3 != 0x3f);
  }
  return;
}

