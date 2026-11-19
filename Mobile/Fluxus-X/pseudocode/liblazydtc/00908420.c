/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00908420
 */

void FUN_00908420(undefined8 param_1,undefined8 *param_2)

{
  *(undefined4 *)((long)param_2 + 0x1c) = 0;
  *(undefined8 *)((long)param_2 + 0x14) = 0;
  *(undefined4 *)(param_2 + 2) = 0xffffffff;
  *param_2 = 0xffffffffffffffff;
  param_2[1] = 0xffffffffffffffff;
  return;
}

