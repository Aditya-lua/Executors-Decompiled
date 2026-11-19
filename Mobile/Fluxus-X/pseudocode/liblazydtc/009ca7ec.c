/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca7ec
 */

undefined8 RECORD_LAYER_data_present(long param_1)

{
  ulong uVar1;
  int *piVar2;
  
  if (*(int *)(param_1 + 0xc) != 0xf1) {
    if (*(ulong *)(param_1 + 0x10) == 0) {
      return 0;
    }
    uVar1 = 0;
    piVar2 = (int *)(param_1 + 0x688);
    while (*piVar2 != 0) {
      uVar1 = uVar1 + 1;
      piVar2 = piVar2 + 0x14;
      if (*(ulong *)(param_1 + 0x10) <= uVar1) {
        return 0;
      }
    }
  }
  return 1;
}

