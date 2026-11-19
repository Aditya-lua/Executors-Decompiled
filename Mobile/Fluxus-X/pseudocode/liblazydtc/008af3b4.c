/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008af3b4
 */

void FUN_008af3b4(long param_1,long param_2,undefined8 param_3)

{
  long lVar1;
  
  if (DAT_00d1f5f8 != '\x01') {
    if ((DAT_00d1fb90 == '\0') || (*(long *)(*(long *)(param_1 + 0x60) + 0x4b0) == 0)) {
      lVar1 = 0x10;
      if (7 < *(uint *)(param_2 + 4)) {
        lVar1 = (ulong)*(uint *)(param_2 + 4) + 8;
      }
      FUN_008b7bd4(param_1,param_2,lVar1,*(undefined1 *)(param_2 + 1),param_3);
      return;
    }
    lVar1 = 0x10;
    if (7 < *(uint *)(param_2 + 4)) {
      lVar1 = (ulong)*(uint *)(param_2 + 4) + 8;
    }
    FUN_008b7ed0(param_1,param_2,lVar1,*(undefined1 *)(param_2 + 1));
    return;
  }
  if ((DAT_00d1fb90 == '\0') || (*(long *)(*(long *)(param_1 + 0x60) + 0x4b0) == 0)) {
    lVar1 = 0x10;
    if (7 < *(uint *)(param_2 + 4)) {
      lVar1 = (ulong)*(uint *)(param_2 + 4) + 8;
    }
    FUN_008b816c(param_1,param_2,lVar1,*(undefined1 *)(param_2 + 1));
    return;
  }
  lVar1 = 0x10;
  if (7 < *(uint *)(param_2 + 4)) {
    lVar1 = (ulong)*(uint *)(param_2 + 4) + 8;
  }
  FUN_008b833c(param_1,param_2,lVar1,*(undefined1 *)(param_2 + 1));
  return;
}

