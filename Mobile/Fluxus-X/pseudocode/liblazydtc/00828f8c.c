/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00828f8c
 */

void FUN_00828f8c(undefined8 param_1,undefined8 *param_2)

{
  if (param_2 == (undefined8 *)0x0) {
    return;
  }
  FUN_00828f8c(param_1,*param_2);
  FUN_00828f8c(param_1,param_2[1]);
  if ((*(byte *)(param_2 + 5) & 1) != 0) {
    operator_delete((void *)param_2[7],param_2[5] & 0xfffffffffffffffe);
  }
  operator_delete(param_2,0x40);
  return;
}

