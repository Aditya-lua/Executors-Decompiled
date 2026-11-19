/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009ca838
 */

undefined8 RECORD_LAYER_processed_read_pending(long param_1)

{
  ulong uVar1;
  int *piVar2;
  
  if (*(ulong *)(param_1 + 0x10) == 0) {
    return 0;
  }
  uVar1 = 0;
  piVar2 = (int *)(param_1 + 0x688);
  do {
    if (*piVar2 == 0) {
      return 1;
    }
    uVar1 = uVar1 + 1;
    piVar2 = piVar2 + 0x14;
  } while (uVar1 < *(ulong *)(param_1 + 0x10));
  return 0;
}

