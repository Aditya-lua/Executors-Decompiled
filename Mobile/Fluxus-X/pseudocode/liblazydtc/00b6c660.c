/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00b6c660
 */

undefined8 mbedtls_chacha20_setkey(undefined8 *param_1,undefined4 *param_2)

{
  param_1[1] = 0x6b20657479622d32;
  *param_1 = 0x3320646e61707865;
  *(undefined4 *)(param_1 + 2) = *param_2;
  *(undefined4 *)((long)param_1 + 0x14) = param_2[1];
  *(undefined4 *)(param_1 + 3) = param_2[2];
  *(undefined4 *)((long)param_1 + 0x1c) = param_2[3];
  *(undefined4 *)(param_1 + 4) = param_2[4];
  *(undefined4 *)((long)param_1 + 0x24) = param_2[5];
  *(undefined4 *)(param_1 + 5) = param_2[6];
  *(undefined4 *)((long)param_1 + 0x2c) = param_2[7];
  return 0;
}

