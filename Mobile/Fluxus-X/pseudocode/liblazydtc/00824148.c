/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00824148
 */

void FUN_00824148(byte *param_1)

{
  if (param_1[3] == 1) {
    param_1[3] = 0;
    *param_1 = *param_1 ^ 0x49;
    param_1[1] = param_1[1] ^ 0xf1;
    param_1[2] = param_1[2] ^ 0x5f;
  }
  return;
}

