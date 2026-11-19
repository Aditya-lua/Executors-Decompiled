/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00923458
 */

void FUN_00923458(undefined8 param_1,long param_2,byte param_3)

{
  *(undefined1 *)(param_2 + 0x30) = 0;
  *(undefined8 *)(param_2 + 8) = 0;
  FUN_0090456c(param_2 + 0x10);
  *(byte *)(param_2 + 0x42) = *(byte *)(param_2 + 0x42) & 0xfe | param_3 & 1;
  return;
}

