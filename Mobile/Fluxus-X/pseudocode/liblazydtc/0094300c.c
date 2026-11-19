/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0094300c
 */

undefined8 FUN_0094300c(long param_1,long *param_2)

{
  int iVar1;
  long lVar2;
  uint uVar3;
  long lVar4;
  
  lVar4 = *(long *)(param_1 + 0x20);
  *param_2 = 0;
  uVar3 = *(uint *)(param_1 + 0x131c);
  if (((uVar3 >> 0x11 & 1) == 0) || ((*(uint *)(*(long *)(lVar4 + 0x3a8) + 0x8c) & 0x40003) != 0)) {
    if (*(long *)(param_1 + 0xe8) + (ulong)*(uint *)(param_1 + 0x108) != 0) {
      return 0;
    }
    if ((-1 < *(char *)(lVar4 + 0x3a0)) ||
       (((*(char *)(param_1 + 0x1b2) < '\0' &&
         ((*(byte *)(*(long *)(lVar4 + 0x3a8) + 0x8c) & 3) == 0)) ||
        (*(int *)(param_1 + 0x9e0) == 0xb)))) {
      if ((uVar3 >> 2 & 1) == 0) {
        return 0;
      }
      if (*(long *)(param_1 + 0xe8) != -(ulong)*(uint *)(param_1 + 0x108)) {
        return 0;
      }
      if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
         ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
        FUN_00904c98(param_1,"REFUSED_STREAM, retrying a fresh connect");
        uVar3 = *(uint *)(param_1 + 0x131c);
      }
      *(uint *)(param_1 + 0x131c) = uVar3 & 0xfffffffb;
    }
    iVar1 = *(int *)(param_1 + 0xca0);
    *(int *)(param_1 + 0xca0) = iVar1 + 1;
    if (4 < iVar1) {
      FUN_00904b80(param_1,"Connection died, tried %d times before giving up",5);
      *(undefined4 *)(param_1 + 0xca0) = 0;
      return 0x37;
    }
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Connection died, retrying a fresh connect (retry count: %d)");
    }
    lVar2 = (*(code *)PTR_strdup_00cc4688)(*(undefined8 *)(param_1 + 0x11b8));
    *param_2 = lVar2;
    if (lVar2 == 0) {
      return 0x1b;
    }
    FUN_00908c4c(lVar4,1);
    *(ulong *)(lVar4 + 0x3a0) = *(ulong *)(lVar4 + 0x3a0) | 0x8000;
    FUN_00935430(param_1,1);
  }
  return 0;
}

