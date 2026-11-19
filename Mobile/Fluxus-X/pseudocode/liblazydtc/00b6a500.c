/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6a500
 */

undefined8 mbedtls_cipher_set_padding_mode(long *param_1,undefined4 param_2)

{
  if (*param_1 == 0) {
    return 0xffff9f00;
  }
  if ((*(uint *)(*param_1 + 8) & 0xf000) != 0x2000) {
    return 0xffff9f00;
  }
  switch(param_2) {
  case 0:
    param_1[2] = (long)&LAB_00b6a5d8;
    param_1[3] = (long)&LAB_00b6a664;
    return 0;
  case 1:
    param_1[2] = (long)&LAB_00b6a740;
    param_1[3] = (long)&LAB_00b6a7f8;
    return 0;
  case 2:
    param_1[2] = (long)&LAB_00b6a8a8;
    param_1[3] = (long)&LAB_00b6a964;
    return 0;
  case 3:
    param_1[2] = (long)&LAB_00b6aa0c;
    param_1[3] = (long)&LAB_00b6aa1c;
    return 0;
  case 4:
    param_1[2] = 0;
    param_1[3] = (long)&LAB_00b6aa8c;
    return 0;
  default:
    return 0xffff9f80;
  }
}

