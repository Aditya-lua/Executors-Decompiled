/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f064
 */

void OSSL_PARAM_construct_time_t(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  *param_1 = param_2;
  *(undefined4 *)(param_1 + 1) = 1;
  param_1[2] = param_3;
  param_1[4] = 0xffffffffffffffff;
  param_1[3] = 8;
  return;
}

