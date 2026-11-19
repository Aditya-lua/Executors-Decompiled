/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085218c
 */

void FUN_0085218c(undefined4 *param_1)

{
  undefined4 uVar1;
  
  *(undefined8 *)(param_1 + 6) = 0;
  *(undefined8 *)(param_1 + 8) = 0;
  uVar1 = DAT_00d1eb80;
  *(undefined8 *)(param_1 + 1) = 0xffffffffffffffff;
  *(undefined8 *)(param_1 + 3) = 0xffffffffffffffff;
  *param_1 = uVar1;
  return;
}

