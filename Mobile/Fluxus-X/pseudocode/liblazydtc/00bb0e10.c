/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb0e10
 */

undefined8
ZSTD_decompress(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 param_4)

{
  void *pvVar1;
  undefined8 uVar2;
  
  pvVar1 = malloc(0x176e8);
  if (pvVar1 == (void *)0x0) {
    uVar2 = 0xffffffffffffffc0;
  }
  else {
    *(undefined8 *)((long)pvVar1 + 0x176d8) = 0;
    *(undefined4 *)((long)pvVar1 + 0x762c) = 0;
    *(undefined8 *)((long)pvVar1 + 0x75d8) = 0;
    *(undefined8 *)((long)pvVar1 + 0x74d8) = 0;
    *(undefined8 *)((long)pvVar1 + 0x7648) = 0;
    *(undefined8 *)((long)pvVar1 + 0x75b0) = 0;
    *(undefined4 *)((long)pvVar1 + 0x75fc) = 0;
    *(undefined4 *)((long)pvVar1 + 0x7618) = 0;
    *(undefined8 *)((long)pvVar1 + 0x7624) = 0;
    *(undefined8 *)((long)pvVar1 + 0x761c) = 0;
    *(undefined8 *)((long)pvVar1 + 0x75c0) = 0;
    *(undefined8 *)((long)pvVar1 + 0x75b8) = 0;
    *(undefined4 *)((long)pvVar1 + 0x75e0) = 1;
    *(undefined8 *)((long)pvVar1 + 0x7610) = 0;
    *(undefined8 *)((long)pvVar1 + 0x7608) = 0;
    *(undefined8 *)((long)pvVar1 + 0x7638) = 0x8000001;
    *(undefined8 *)((long)pvVar1 + 0x7598) = 0;
    *(undefined8 *)((long)pvVar1 + 0x766c) = 0;
    ZSTD_freeDDict(0);
    *(undefined4 *)((long)pvVar1 + 0x7600) = 0;
    *(undefined8 *)((long)pvVar1 + 0x75f0) = 0;
    *(undefined8 *)((long)pvVar1 + 0x75e8) = 0;
    uVar2 = FUN_00bb0774(pvVar1,param_1,param_2,param_3,param_4,0,0,0);
    ZSTD_freeDCtx(pvVar1);
  }
  return uVar2;
}

