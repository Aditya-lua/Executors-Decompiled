/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00934d0c
 */

void FUN_00934d0c(undefined8 *param_1,undefined8 param_2,undefined4 param_3)

{
  *param_1 = param_2;
  param_1[1] = 0;
  *(undefined4 *)((long)param_1 + 0xc) = param_3;
  return;
}

