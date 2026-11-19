/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fdaa0
 */

void FUN_007fdaa0(undefined8 param_1)

{
  (*DAT_00cca978)();
  if ((((*(byte *)(DAT_00cca938 + 0x29) & 1) == 0) && (*(long *)(DAT_00cca938 + 8) == 0)) &&
     ((*(byte *)(DAT_00cca938 + 0x28) & 1) != 0)) {
    *(undefined8 *)(DAT_00cca938 + 8) = param_1;
  }
  return;
}

