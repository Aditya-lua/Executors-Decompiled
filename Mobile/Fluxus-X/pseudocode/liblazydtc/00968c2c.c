/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00968c2c
 */

void FUN_00968c2c(long param_1)

{
  long lVar1;
  ulong uVar2;
  
  lVar1 = *(long *)(param_1 + 0xca8);
  if ((lVar1 != 0) &&
     ((*(long *)(param_1 + 0xd0) == 0 || ((*(byte *)(*(long *)(param_1 + 0xd0) + 4) >> 4 & 1) == 0))
     )) {
    if (*(long *)(param_1 + 0x6d0) != 0) {
      FUN_00968604();
      if (1 < *(ulong *)(param_1 + 0x6d0)) {
        uVar2 = 1;
        lVar1 = 200;
        do {
          FUN_00968604(*(long *)(param_1 + 0xca8) + lVar1);
          uVar2 = uVar2 + 1;
          lVar1 = lVar1 + 200;
        } while (uVar2 < *(ulong *)(param_1 + 0x6d0));
      }
      lVar1 = *(long *)(param_1 + 0xca8);
    }
    (*(code *)PTR_free_00cc4678)(lVar1);
    *(undefined8 *)(param_1 + 0xca8) = 0;
  }
  (**(code **)(PTR_DAT_00cc4d08 + 0x88))(param_1);
  return;
}

