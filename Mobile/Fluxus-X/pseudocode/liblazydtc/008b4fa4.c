/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b4fa4
 */

void FUN_008b4fa4(long param_1,ulong param_2)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  
  lVar1 = *(long *)(param_1 + 0x30);
  if (lVar1 != 0) {
    do {
      if (*(ulong *)(lVar1 + 8) < param_2) {
        return;
      }
      *(undefined8 *)(param_1 + 0x30) = *(undefined8 *)(lVar1 + 0x20);
      plVar3 = (long *)(lVar1 + 0x10);
      lVar2 = *plVar3;
      *(long *)(*(long *)(lVar1 + 0x18) + 0x10) = lVar2;
      *(undefined8 *)(lVar2 + 0x18) = *(undefined8 *)(lVar1 + 0x18);
      lVar4 = (*(long **)(lVar1 + 8))[1];
      lVar2 = **(long **)(lVar1 + 8);
      *(long **)(lVar1 + 8) = plVar3;
      *(long *)(lVar1 + 0x18) = lVar4;
      *plVar3 = lVar2;
      FUN_008b63c4(param_1);
      lVar1 = *(long *)(param_1 + 0x30);
    } while (lVar1 != 0);
  }
  return;
}

