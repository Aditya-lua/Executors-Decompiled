/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009679d4
 */

void FUN_009679d4(long param_1)

{
  *(byte *)(param_1 + 0x5a9) = *(byte *)(param_1 + 0x5a9) | 0xb;
  memcpy((void *)(param_1 + 0x5f8),(void *)(param_1 + 0x530),200);
  return;
}

