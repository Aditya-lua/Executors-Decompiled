/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009c0e54
 */

long tls1_group_id_lookup(long param_1,short param_2)

{
  long lVar1;
  ulong uVar2;
  
  if (*(ulong *)(param_1 + 0x630) != 0) {
    lVar1 = *(long *)(param_1 + 0x628);
    uVar2 = 0;
    do {
      if (*(short *)(lVar1 + 0x1c) == param_2) {
        return lVar1;
      }
      uVar2 = uVar2 + 1;
      lVar1 = lVar1 + 0x38;
    } while (uVar2 < *(ulong *)(param_1 + 0x630));
  }
  return 0;
}

