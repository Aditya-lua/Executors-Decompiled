/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e1430
 */

void blake3_hasher_reset(undefined8 *param_1)

{
  param_1[8] = 0;
  *(undefined2 *)(param_1 + 0x11) = 0;
  param_1[5] = param_1[1];
  param_1[4] = *param_1;
  param_1[7] = param_1[3];
  param_1[6] = param_1[2];
  param_1[10] = 0;
  param_1[9] = 0;
  param_1[0xc] = 0;
  param_1[0xb] = 0;
  param_1[0xe] = 0;
  param_1[0xd] = 0;
  param_1[0x10] = 0;
  param_1[0xf] = 0;
  *(undefined1 *)(param_1 + 0x12) = 0;
  return;
}

