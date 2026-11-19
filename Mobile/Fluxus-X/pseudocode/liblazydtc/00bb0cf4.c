/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0cf4
 */

void ZSTD_decompressDCtx(long param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4,
                        undefined8 param_5)

{
  undefined8 uVar1;
  
  if (*(int *)(param_1 + 0x7600) == -1) {
    uVar1 = *(undefined8 *)(param_1 + 0x75f0);
  }
  else if (*(int *)(param_1 + 0x7600) == 1) {
    uVar1 = *(undefined8 *)(param_1 + 0x75f0);
    *(undefined4 *)(param_1 + 0x7600) = 0;
  }
  else {
    ZSTD_freeDDict(*(undefined8 *)(param_1 + 0x75e8));
    uVar1 = 0;
    *(undefined4 *)(param_1 + 0x7600) = 0;
    *(undefined8 *)(param_1 + 0x75f0) = 0;
    *(undefined8 *)(param_1 + 0x75e8) = 0;
  }
  FUN_00bb0774(param_1,param_2,param_3,param_4,param_5,0,0,uVar1);
  return;
}

