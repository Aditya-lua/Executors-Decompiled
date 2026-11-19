/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009350e4
 */

void FUN_009350e4(long param_1)

{
  long *plVar1;
  
  plVar1 = *(long **)(param_1 + 0x138);
  while (plVar1 != (long *)0x0) {
    *(long *)(param_1 + 0x138) = plVar1[1];
    (**(code **)(*plVar1 + 0x18))(param_1,plVar1);
    (*(code *)PTR_free_00cc4678)(plVar1);
    plVar1 = *(long **)(param_1 + 0x138);
  }
  plVar1 = *(long **)(param_1 + 0x130);
  while (plVar1 != (long *)0x0) {
    *(long *)(param_1 + 0x130) = plVar1[1];
    (**(code **)(*plVar1 + 0x20))(param_1,plVar1);
    (*(code *)PTR_free_00cc4678)(plVar1);
    plVar1 = *(long **)(param_1 + 0x130);
  }
  *(undefined8 *)(param_1 + 0xe8) = 0;
  *(undefined4 *)(param_1 + 0x114) = 0;
  return;
}

