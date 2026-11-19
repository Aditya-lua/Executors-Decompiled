/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bafa34
 */

ulong ZSTD_initStaticDCtx(ulong param_1,ulong param_2)

{
  ulong uVar1;
  
  uVar1 = 0;
  if ((0x176e7 < param_2) && ((param_1 & 7) == 0)) {
    *(undefined8 *)(param_1 + 0x176d8) = 0;
    *(undefined4 *)(param_1 + 0x762c) = 0;
    *(undefined8 *)(param_1 + 0x74d8) = 0;
    *(undefined8 *)(param_1 + 0x7624) = 0;
    *(undefined8 *)(param_1 + 0x761c) = 0;
    *(undefined4 *)(param_1 + 0x75e0) = 1;
    *(undefined8 *)(param_1 + 0x7648) = 0;
    *(undefined8 *)(param_1 + 0x75fc) = 0;
    *(undefined8 *)(param_1 + 0x7610) = 0;
    *(undefined8 *)(param_1 + 0x7608) = 0;
    *(undefined8 *)(param_1 + 0x75f0) = 0;
    *(undefined8 *)(param_1 + 0x75e8) = 0;
    *(undefined8 *)(param_1 + 0x7638) = 0x8000001;
    *(undefined8 *)(param_1 + 0x766c) = 0;
    *(undefined8 *)(param_1 + 0x7598) = 0;
    *(undefined4 *)(param_1 + 0x7618) = 0;
    *(ulong *)(param_1 + 0x75d8) = param_2;
    *(ulong *)(param_1 + 0x7620) = param_1 + 0x176e8;
    uVar1 = param_1;
  }
  return uVar1;
}

