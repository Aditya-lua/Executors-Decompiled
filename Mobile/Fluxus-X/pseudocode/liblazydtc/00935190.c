/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935190
 */

void FUN_00935190(long param_1)

{
  uint uVar1;
  long *plVar2;
  
  uVar1 = (uint)*(undefined8 *)(param_1 + 0xa82);
  if ((*(byte *)(param_1 + 0x1b1) >> 6 & 1) == 0) {
    if ((((uVar1 >> 0x1c & 1) != 0) &&
        ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
       (0 < DAT_00cc46a0)) {
      FUN_00904f80(param_1,"client_reset, clear readers");
    }
    plVar2 = *(long **)(param_1 + 0x138);
    while (plVar2 != (long *)0x0) {
      *(long *)(param_1 + 0x138) = plVar2[1];
      (**(code **)(*plVar2 + 0x18))(param_1,plVar2);
      (*(code *)PTR_free_00cc4678)(plVar2);
      plVar2 = *(long **)(param_1 + 0x138);
    }
  }
  else if (((uVar1 >> 0x1c & 1) != 0) &&
          (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
           (0 < DAT_00cc46a0)))) {
    FUN_00904f80(param_1,"client_reset, will rewind reader");
  }
  plVar2 = *(long **)(param_1 + 0x130);
  while (plVar2 != (long *)0x0) {
    *(long *)(param_1 + 0x130) = plVar2[1];
    (**(code **)(*plVar2 + 0x20))(param_1,plVar2);
    (*(code *)PTR_free_00cc4678)(plVar2);
    plVar2 = *(long **)(param_1 + 0x130);
  }
  *(undefined8 *)(param_1 + 0xe8) = 0;
  *(undefined4 *)(param_1 + 0x114) = 0;
  return;
}

