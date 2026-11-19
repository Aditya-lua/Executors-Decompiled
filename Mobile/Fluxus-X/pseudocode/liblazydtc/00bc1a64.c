/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc1a64
 */

undefined8 ZSTD_XXH32_reset(undefined8 *param_1,int param_2)

{
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  param_1[5] = 0;
  param_1[4] = 0;
  *(int *)(param_1 + 2) = param_2;
  *(int *)((long)param_1 + 0x14) = param_2 + 0x61c8864f;
  param_1[1] = CONCAT44(param_2 + -0x7a143589,param_2 + 0x24234428);
  return 0;
}

