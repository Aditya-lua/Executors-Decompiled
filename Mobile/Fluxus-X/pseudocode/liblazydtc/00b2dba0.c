/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b2dba0
 */

void ossl_blake2b_param_init(undefined4 *param_1)

{
  *(undefined8 *)(param_1 + 0xd) = 0;
  *(undefined8 *)(param_1 + 0xb) = 0;
  *(undefined8 *)(param_1 + 9) = 0;
  *(undefined8 *)(param_1 + 7) = 0;
  *(undefined8 *)(param_1 + 5) = 0;
  *(undefined8 *)(param_1 + 3) = 0;
  param_1[0xf] = 0;
  *param_1 = 0x1010040;
  *(undefined8 *)(param_1 + 1) = 0;
  return;
}

