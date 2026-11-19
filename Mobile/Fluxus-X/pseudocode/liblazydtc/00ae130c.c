/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00ae130c
 */

undefined8 sha512_224_init(undefined8 *param_1)

{
  param_1[1] = 0x73e1996689dcd4d6;
  *param_1 = 0x8c3d37c819544da2;
  param_1[3] = 0x679dd514582f9fcf;
  param_1[2] = 0x1dfab7ae32ff9c82;
  param_1[0x1a] = 0x1c00000000;
  param_1[5] = 0x77e36f7304c48942;
  param_1[4] = 0xf6d2b697bd44da8;
  param_1[7] = 0x1112e6ad91d692a1;
  param_1[6] = 0x3f9d85a86a1d36c8;
  param_1[8] = 0;
  param_1[9] = 0;
  return 1;
}

