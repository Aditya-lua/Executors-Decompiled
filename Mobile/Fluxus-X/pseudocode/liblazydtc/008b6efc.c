/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b6efc
 */

void FUN_008b6efc(undefined8 param_1,long param_2)

{
  long lVar1;
  long *plVar2;
  long *plVar3;
  
  if ((*(byte *)(*(long *)(param_2 + 0x78) + 2) & 3) != 0) {
    FUN_008b61bc(param_1);
  }
  lVar1 = *(long *)(param_2 + 8);
  if (lVar1 != 0) {
    *(byte *)(lVar1 + 2) = *(byte *)(lVar1 + 2) & 0xf8 | 4;
  }
  if (((DAT_00d1f1b8 == '\x01') && (*(long *)(param_2 + 0x80) != 0)) &&
     ((*(byte *)(*(long *)(param_2 + 0x80) + 2) & 3) != 0)) {
    FUN_008b61bc(param_1);
  }
  plVar2 = *(long **)(param_2 + 0x68);
  for (plVar3 = *(long **)(param_2 + 0x58); plVar3 < plVar2; plVar3 = plVar3 + 2) {
    if ((4 < *(int *)((long)plVar3 + 0xc)) && ((*(byte *)(*plVar3 + 2) & 3) != 0)) {
      FUN_008b61bc(param_1);
      plVar2 = *(long **)(param_2 + 0x68);
    }
  }
  for (lVar1 = *(long *)(param_2 + 0x30); lVar1 != 0; lVar1 = *(long *)(lVar1 + 0x20)) {
    *(undefined1 *)(lVar1 + 3) = 1;
    if ((*(byte *)(lVar1 + 2) & 3) != 0) {
      FUN_008b61bc(param_1,lVar1);
    }
  }
  return;
}

