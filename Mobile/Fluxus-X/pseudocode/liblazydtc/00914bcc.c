/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00914bcc
 */

void FUN_00914bcc(long param_1)

{
  long *plVar1;
  long lVar2;
  long lVar3;
  
  if (param_1 != 0) {
    lVar2 = 0;
    do {
      plVar1 = (long *)*(long *)(param_1 + lVar2 * 8);
      while (plVar1 != (long *)0x0) {
        lVar3 = *plVar1;
        (*(code *)PTR_free_00cc4678)(plVar1[5]);
        (*(code *)PTR_free_00cc4678)(plVar1[3]);
        (*(code *)PTR_free_00cc4678)(plVar1[4]);
        (*(code *)PTR_free_00cc4678)(plVar1[1]);
        (*(code *)PTR_free_00cc4678)(plVar1[2]);
        (*(code *)PTR_free_00cc4678)(plVar1);
        plVar1 = (long *)lVar3;
      }
      *(undefined8 *)(param_1 + lVar2 * 8) = 0;
      lVar2 = lVar2 + 1;
    } while (lVar2 != 0x3f);
    *(undefined4 *)(param_1 + 0x200) = 0;
  }
  return;
}

