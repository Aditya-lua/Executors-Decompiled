/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00935c98
 */

undefined8 FUN_00935c98(long param_1)

{
  ulong uVar1;
  long *plVar2;
  
  plVar2 = *(long **)(param_1 + 0x138);
  while( true ) {
    if (plVar2 == (long *)0x0) {
      return 0;
    }
    uVar1 = (**(code **)(*plVar2 + 0x20))(param_1,plVar2);
    if ((uVar1 & 1) != 0) break;
    plVar2 = (long *)plVar2[1];
  }
  if ((param_1 != 0) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) {
    if (*(long *)(param_1 + 0x12a0) == 0) {
      if (DAT_00cc46a0 < 1) {
        return 1;
      }
    }
    else {
      if (*(int *)(*(long *)(param_1 + 0x12a0) + 8) < 1) {
        return 1;
      }
      if (DAT_00cc46a0 < 1) {
        return 1;
      }
    }
    FUN_00904f80(param_1,"client reader needs rewind before next request");
  }
  return 1;
}

