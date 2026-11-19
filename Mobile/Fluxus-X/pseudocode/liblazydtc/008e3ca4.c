/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008e3ca4
 */

void FUN_008e3ca4(long param_1)

{
  long *plVar1;
  ulong uVar2;
  long lVar3;
  ulong uVar4;
  
  plVar1 = *(long **)(param_1 + 0x18);
  if (plVar1 != (long *)0x0) {
    for (uVar4 = 0; uVar2 = (**(code **)(*plVar1 + 0x10))(), uVar4 < (uVar2 & 0xffffffff);
        uVar4 = uVar4 + 1) {
      lVar3 = (**(code **)(**(long **)(param_1 + 0x18) + 0x38))
                        (*(long **)(param_1 + 0x18),uVar4 & 0xffffffff);
      FUN_008e4084(param_1,lVar3);
      FUN_008e487c(param_1,*(undefined8 *)(lVar3 + 0x28));
      plVar1 = *(long **)(param_1 + 0x18);
    }
  }
  return;
}

