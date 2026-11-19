/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2608
 */

undefined8 ZSTD_initDStream(long param_1)

{
  undefined8 uVar1;
  
  *(undefined4 *)(param_1 + 0x761c) = 0;
  *(undefined4 *)(param_1 + 0x766c) = 0;
  *(undefined4 *)(param_1 + 0x75e0) = 1;
  ZSTD_freeDDict(*(undefined8 *)(param_1 + 0x75e8));
  *(undefined4 *)(param_1 + 0x7600) = 0;
  uVar1 = 5;
  if (*(int *)(param_1 + 0x7598) != 0) {
    uVar1 = 1;
  }
  *(undefined8 *)(param_1 + 0x75f0) = 0;
  *(undefined8 *)(param_1 + 0x75e8) = 0;
  return uVar1;
}

