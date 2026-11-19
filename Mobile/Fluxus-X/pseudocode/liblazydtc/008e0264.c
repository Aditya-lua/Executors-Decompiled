/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e0264
 */

void blake3_hasher_init(undefined8 *param_1)

{
  param_1[8] = 0;
  *(undefined2 *)(param_1 + 0x11) = 0;
  *(undefined1 *)((long)param_1 + 0x8a) = 0;
  param_1[1] = 0xa54ff53a3c6ef372;
  *param_1 = 0xbb67ae856a09e667;
  param_1[3] = 0x5be0cd191f83d9ab;
  param_1[2] = 0x9b05688c510e527f;
  param_1[5] = 0xa54ff53a3c6ef372;
  param_1[4] = 0xbb67ae856a09e667;
  param_1[7] = 0x5be0cd191f83d9ab;
  param_1[6] = 0x9b05688c510e527f;
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

