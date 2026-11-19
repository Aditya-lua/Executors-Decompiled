/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 007fcd7c
 */

void FUN_007fcd7c(long param_1)

{
  long lVar1;
  ulong uVar2;
  ulong *puVar3;
  
  std::__ndk1::mutex::lock((mutex *)(param_1 + 0x60));
  lVar1 = *(long *)(param_1 + 0x58);
  if (lVar1 != 0) {
    uVar2 = *(ulong *)(param_1 + 0x50);
    do {
      puVar3 = (ulong *)(*(long *)(*(long *)(param_1 + 0x38) + (uVar2 / 0xaa) * 8) +
                        (uVar2 % 0xaa) * 0x18);
      if ((*puVar3 & 1) != 0) {
        operator_delete((void *)puVar3[2],*puVar3 & 0xfffffffffffffffe);
        uVar2 = *(ulong *)(param_1 + 0x50);
        lVar1 = *(long *)(param_1 + 0x58);
      }
      uVar2 = uVar2 + 1;
      lVar1 = lVar1 + -1;
      *(ulong *)(param_1 + 0x50) = uVar2;
      *(long *)(param_1 + 0x58) = lVar1;
      if (0x153 < uVar2) {
        operator_delete((void *)**(undefined8 **)(param_1 + 0x38),0xff0);
        lVar1 = *(long *)(param_1 + 0x58);
        *(long *)(param_1 + 0x38) = *(long *)(param_1 + 0x38) + 8;
        uVar2 = *(long *)(param_1 + 0x50) - 0xaa;
        *(ulong *)(param_1 + 0x50) = uVar2;
      }
    } while (lVar1 != 0);
  }
  std::__ndk1::mutex::unlock((mutex *)(param_1 + 0x60));
  return;
}

