/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bafae4
 */

void * ZSTD_createDCtx_advanced(undefined8 *param_1)

{
  code *pcVar1;
  long lVar2;
  void *pvVar3;
  undefined8 uVar4;
  
  pcVar1 = (code *)*param_1;
  lVar2 = param_1[1];
  if ((pcVar1 == (code *)0x0) == (lVar2 == 0)) {
    uVar4 = param_1[2];
    if (pcVar1 == (code *)0x0) {
      pvVar3 = malloc(0x176e8);
    }
    else {
      pvVar3 = (void *)(*pcVar1)(uVar4,0x176e8);
    }
    if (pvVar3 != (void *)0x0) {
      *(code **)((long)pvVar3 + 0x75b0) = pcVar1;
      *(long *)((long)pvVar3 + 0x75b8) = lVar2;
      *(undefined8 *)((long)pvVar3 + 0x75c0) = uVar4;
      *(undefined8 *)((long)pvVar3 + 0x75d8) = 0;
      *(undefined8 *)((long)pvVar3 + 0x74d8) = 0;
      *(undefined8 *)((long)pvVar3 + 0x75fc) = 0;
      *(undefined8 *)((long)pvVar3 + 0x7648) = 0;
      *(undefined8 *)((long)pvVar3 + 0x75f0) = 0;
      *(undefined8 *)((long)pvVar3 + 0x75e8) = 0;
      *(undefined8 *)((long)pvVar3 + 0x7624) = 0;
      *(undefined8 *)((long)pvVar3 + 0x761c) = 0;
      *(undefined8 *)((long)pvVar3 + 0x176d8) = 0;
      *(undefined4 *)((long)pvVar3 + 0x75e0) = 1;
      *(undefined4 *)((long)pvVar3 + 0x762c) = 0;
      *(undefined8 *)((long)pvVar3 + 0x766c) = 0;
      *(undefined8 *)((long)pvVar3 + 0x7598) = 0;
      *(undefined8 *)((long)pvVar3 + 0x7610) = 0;
      *(undefined8 *)((long)pvVar3 + 0x7608) = 0;
      *(undefined4 *)((long)pvVar3 + 0x7618) = 0;
      *(undefined8 *)((long)pvVar3 + 0x7638) = 0x8000001;
    }
  }
  else {
    pvVar3 = (void *)0x0;
  }
  return pvVar3;
}

