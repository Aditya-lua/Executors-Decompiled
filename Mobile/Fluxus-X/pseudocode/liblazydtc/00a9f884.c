/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00a9f884
 */

void OSSL_PARAM_construct_utf8_ptr
               (undefined8 *param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  *param_1 = param_2;
  param_1[2] = param_3;
  param_1[3] = param_4;
  *(undefined4 *)(param_1 + 1) = 6;
  param_1[4] = 0xffffffffffffffff;
  return;
}

