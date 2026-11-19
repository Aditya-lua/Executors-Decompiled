/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a02f48
 */

void BN_GENCB_set_old(undefined4 *param_1,undefined8 param_2,undefined8 param_3)

{
  *param_1 = 1;
  *(undefined8 *)(param_1 + 2) = param_3;
  *(undefined8 *)(param_1 + 4) = param_2;
  return;
}

