/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009352f8
 */

int FUN_009352f8(long param_1)

{
  int iVar1;
  long *plVar2;
  
  if ((*(byte *)(param_1 + 0x1b1) >> 6 & 1) != 0) {
    plVar2 = *(long **)(param_1 + 0x138);
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
        (0 < DAT_00cc46a0)))) {
      FUN_00904f80(param_1,"client start, rewind readers");
    }
    for (; plVar2 != (long *)0x0; plVar2 = (long *)plVar2[1]) {
      iVar1 = (**(code **)(*plVar2 + 0x38))(param_1,plVar2);
      if (iVar1 != 0) {
        FUN_00904b80(param_1,"rewind of client reader \'%s\' failed: %d",*(undefined8 *)*plVar2,
                     iVar1);
        return iVar1;
      }
    }
    *(uint *)(param_1 + 0x1b1) = *(uint *)(param_1 + 0x1b1) & 0xffffffbf;
    plVar2 = *(long **)(param_1 + 0x138);
    while (plVar2 != (long *)0x0) {
      *(long *)(param_1 + 0x138) = plVar2[1];
      (**(code **)(*plVar2 + 0x18))(param_1,plVar2);
      (*(code *)PTR_free_00cc4678)(plVar2);
      plVar2 = *(long **)(param_1 + 0x138);
    }
  }
  return 0;
}

