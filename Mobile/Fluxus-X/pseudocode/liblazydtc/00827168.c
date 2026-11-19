/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00827168
 */

void FUN_00827168(undefined8 param_1,undefined8 *param_2)

{
  if (param_2 == (undefined8 *)0x0) {
    return;
  }
  FUN_00827168(param_1,*param_2);
  FUN_00827168(param_1,param_2[1]);
  if ((*(byte *)(param_2 + 7) & 1) != 0) {
    operator_delete((void *)param_2[9],param_2[7] & 0xfffffffffffffffe);
  }
  if ((*(byte *)(param_2 + 4) & 1) != 0) {
    operator_delete((void *)param_2[6],param_2[4] & 0xfffffffffffffffe);
  }
  operator_delete(param_2,0x50);
  return;
}

