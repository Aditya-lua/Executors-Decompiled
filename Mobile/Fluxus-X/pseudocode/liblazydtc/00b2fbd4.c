/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2fbd4
 */

void ossl_blake2s_param_init(undefined4 *param_1)

{
  *(undefined8 *)(param_1 + 5) = 0;
  *(undefined8 *)(param_1 + 3) = 0;
  param_1[7] = 0;
  *param_1 = 0x1010020;
  *(undefined8 *)(param_1 + 1) = 0;
  return;
}

