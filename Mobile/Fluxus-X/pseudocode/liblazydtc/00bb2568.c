/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb2568
 */

undefined8 ZSTD_DCtx_reset(long param_1,uint param_2)

{
  undefined8 uVar1;
  
  if ((param_2 & 0xfffffffd) == 1) {
    *(undefined4 *)(param_1 + 0x761c) = 0;
    *(undefined4 *)(param_1 + 0x766c) = 0;
    *(undefined4 *)(param_1 + 0x75e0) = 1;
  }
  if ((param_2 & 0xfffffffe) == 2) {
    if (*(int *)(param_1 + 0x761c) == 0) {
      ZSTD_freeDDict(*(undefined8 *)(param_1 + 0x75e8));
      uVar1 = 0;
      *(undefined4 *)(param_1 + 0x7600) = 0;
      *(undefined4 *)(param_1 + 0x7670) = 0;
      *(undefined8 *)(param_1 + 0x7638) = 0x8000001;
      *(undefined8 *)(param_1 + 0x7598) = 0;
      *(undefined8 *)(param_1 + 0x75f0) = 0;
      *(undefined8 *)(param_1 + 0x75e8) = 0;
      *(undefined8 *)(param_1 + 0x7610) = 0;
      *(undefined4 *)(param_1 + 0x7618) = 0;
    }
    else {
      uVar1 = 0xffffffffffffffc4;
    }
  }
  else {
    uVar1 = 0;
  }
  return uVar1;
}

