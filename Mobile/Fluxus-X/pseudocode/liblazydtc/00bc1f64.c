/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bc1f64
 */

undefined8 ZSTD_XXH64_reset(undefined8 *param_1,long param_2)

{
  param_1[10] = 0;
  param_1[1] = 0;
  *param_1 = 0;
  param_1[3] = 0;
  param_1[2] = 0;
  param_1[7] = 0;
  param_1[6] = 0;
  param_1[9] = 0;
  param_1[8] = 0;
  param_1[5] = 0;
  param_1[4] = 0;
  param_1[2] = param_2 + -0x3d4d51c2d82b14b1;
  param_1[1] = param_2 + 0x60ea27eeadc0b5d6;
  param_1[3] = param_2;
  param_1[4] = param_2 + 0x61c8864e7a143579;
  return 0;
}

