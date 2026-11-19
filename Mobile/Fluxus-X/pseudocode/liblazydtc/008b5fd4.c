/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b5fd4
 */

void FUN_008b5fd4(long param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  
  lVar3 = *(long *)(param_1 + 0x60);
  lVar1 = *(long *)(lVar3 + 0x1e0);
  *(undefined8 *)(lVar3 + 0x58) = 0;
  *(undefined8 *)(lVar3 + 0x60) = 0;
  *(undefined8 *)(lVar3 + 0x68) = 0;
  if ((*(byte *)(lVar1 + 2) & 3) != 0) {
    FUN_008b61bc(lVar3);
    lVar1 = *(long *)(lVar3 + 0x1e0);
  }
  if ((*(byte *)(*(long *)(lVar1 + 0x78) + 2) & 3) != 0) {
    FUN_008b61bc(lVar3);
  }
  if (4 < *(int *)(*(long *)(param_1 + 0x60) + 0x62c)) {
    if ((*(byte *)(*(long *)(*(long *)(param_1 + 0x60) + 0x620) + 2) & 3) != 0) {
      FUN_008b61bc(lVar3);
    }
  }
  if (DAT_00d1f4b8 == '\x01') {
    if (4 < *(int *)(lVar3 + 0x4c54)) {
      if ((*(byte *)(*(long *)(lVar3 + 0x4c48) + 2) & 3) != 0) {
        FUN_008b61bc(lVar3);
      }
    }
    if (*(code **)(lVar3 + 0x4c60) != (code *)0x0) {
      (**(code **)(lVar3 + 0x4c60))(*(undefined8 *)(lVar3 + 0x1e0),0);
    }
  }
  FUN_008b70e0(lVar3);
  lVar1 = 0xa0d;
  do {
    lVar2 = *(long *)(lVar3 + lVar1 * 8);
    if ((lVar2 != 0) && ((*(byte *)(lVar2 + 2) & 3) != 0)) {
      FUN_008b61bc(lVar3);
    }
    lVar1 = lVar1 + 1;
  } while (lVar1 != 0xa8f);
  if ((*(long *)(lVar3 + 0x5478) != 0) && ((*(byte *)(*(long *)(lVar3 + 0x5478) + 2) & 3) != 0)) {
    FUN_008b61bc(lVar3);
  }
  if ((*(long *)(lVar3 + 0x5480) != 0) && ((*(byte *)(*(long *)(lVar3 + 0x5480) + 2) & 3) != 0)) {
    FUN_008b61bc(lVar3);
  }
  lVar1 = 0x448;
  do {
    if ((*(long *)(lVar3 + lVar1) != 0) && ((*(byte *)(*(long *)(lVar3 + lVar1) + 2) & 3) != 0)) {
      FUN_008b61bc(lVar3);
    }
    lVar1 = lVar1 + 8;
  } while (lVar1 != 0x4b0);
  lVar1 = 0x909;
  do {
    lVar2 = *(long *)(lVar3 + lVar1 * 8);
    if ((lVar2 != 0) && ((*(byte *)(lVar2 + 2) & 3) != 0)) {
      FUN_008b61bc(lVar3);
    }
    lVar1 = lVar1 + 1;
  } while (lVar1 != 0x989);
  *(undefined1 *)(lVar3 + 1) = 1;
  return;
}

