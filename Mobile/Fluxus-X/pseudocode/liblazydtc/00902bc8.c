/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00902bc8
 */

void curl_easy_reset(long param_1)

{
  FUN_00932998(param_1 + 0xd8,param_1);
  FUN_00946444(param_1);
  memset((void *)(param_1 + 0x1b8),0,0x8d8);
  FUN_0094690c(param_1);
  memset((void *)(param_1 + 0xaa8),0,400);
  FUN_00915c9c(param_1);
  *(undefined4 *)(param_1 + 0xca0) = 0;
  *(undefined8 *)(param_1 + 0xd88) = 0;
  *(undefined8 *)(param_1 + 0xd80) = 0;
  *(undefined8 *)(param_1 + 0xd78) = 0;
  *(undefined8 *)(param_1 + 0xd70) = 0;
  *(undefined8 *)(param_1 + 0xd68) = 0;
  *(undefined8 *)(param_1 + 0xd60) = 0;
  *(undefined8 *)(param_1 + 0xd58) = 0;
  *(undefined8 *)(param_1 + 0xc88) = 0xffffffffffffffff;
  *(uint *)(param_1 + 0xadc) = *(uint *)(param_1 + 0xadc) | 0x10;
  *(undefined8 *)(param_1 + 0xd50) = 0;
  FUN_00924ca4(param_1);
  return;
}

