/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00951e08
 */

int FUN_00951e08(long param_1,long param_2)

{
  uint uVar1;
  int iVar2;
  undefined *puVar3;
  ulong uVar4;
  long lVar5;
  
  uVar4 = *(ulong *)(param_2 + 0x3a0);
  if ((uVar4 & 0x11000) == 0x1000) {
    uVar4 = uVar4 | 0x10000;
    *(ulong *)(param_2 + 0x3a0) = uVar4;
  }
  uVar1 = ((uint)uVar4 >> 0x10 ^ 0xffffffff) & 1;
  iVar2 = FUN_009453ec(param_1,param_2 + 0x428,&DAT_002b6c62,
                       &UNK_00748b02 + ((ulong)uVar1 | (ulong)uVar1 << 2));
  if (iVar2 == 0) {
    *(uint *)(param_2 + 0x528) = uVar1;
    lVar5 = *(long *)(param_1 + 0x20);
    if (((((param_1 != 0) && (*(byte *)(lVar5 + 0x536) != 0x1e)) &&
         ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0)) &&
        ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) &&
       (0 < DAT_00cc46c0)) {
      if (lVar5 == 0) {
        puVar3 = &DAT_002c11b5;
      }
      else {
        puVar3 = (&PTR_DAT_00c508c0)[*(byte *)(lVar5 + 0x536)];
      }
      FUN_00905258(param_1,"[%s] -> [%s]",puVar3,&DAT_002ab71b);
    }
    *(undefined1 *)(lVar5 + 0x536) = 0x1e;
    if (((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0) &&
       ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))))) {
      FUN_00904c98(param_1,"Connect data stream passively");
    }
  }
  return iVar2;
}

