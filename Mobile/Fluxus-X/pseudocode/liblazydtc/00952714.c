/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00952714
 */

undefined8 FUN_00952714(long param_1,long param_2)

{
  int iVar1;
  undefined8 uVar2;
  undefined *puVar3;
  undefined1 uVar4;
  long lVar5;
  
  iVar1 = *(int *)(*(long *)(param_1 + 0x1a0) + 0x10);
  if (iVar1 == 0) {
LAB_00952804:
    uVar2 = FUN_009528c8(param_1);
    return uVar2;
  }
  if (iVar1 == 1) {
    if (*(long *)(param_2 + 0x4e0) == 0) goto LAB_00952804;
    uVar2 = FUN_009453ec(param_1,param_2 + 0x428,"SIZE %s");
    if ((int)uVar2 != 0) {
      return uVar2;
    }
    lVar5 = *(long *)(param_1 + 0x20);
    if ((((ulong)*(byte *)(lVar5 + 0x536) != 0x17) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0))
       && (((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8))) &&
           (0 < DAT_00cc46c0)))) {
      if (lVar5 == 0) {
        puVar3 = &DAT_002c11b5;
      }
      else {
        puVar3 = (&PTR_DAT_00c508c0)[*(byte *)(lVar5 + 0x536)];
      }
      FUN_00905258(param_1,"[%s] -> [%s]",puVar3,&DAT_0029d8c0);
    }
    uVar4 = 0x17;
  }
  else {
    if (*(long *)(param_2 + 0x4e0) == 0) goto LAB_00952804;
    uVar2 = FUN_009453ec(param_1,param_2 + 0x428,"REST %d",0);
    if ((int)uVar2 != 0) {
      return uVar2;
    }
    lVar5 = *(long *)(param_1 + 0x20);
    if (((((ulong)*(byte *)(lVar5 + 0x536) != 0x1a) && ((*(byte *)(param_1 + 0xa85) >> 4 & 1) != 0))
        && ((*(long *)(param_1 + 0x12a0) == 0 || (0 < *(int *)(*(long *)(param_1 + 0x12a0) + 8)))))
       && (0 < DAT_00cc46c0)) {
      if (lVar5 == 0) {
        puVar3 = &DAT_002c11b5;
      }
      else {
        puVar3 = (&PTR_DAT_00c508c0)[*(byte *)(lVar5 + 0x536)];
      }
      FUN_00905258(param_1,"[%s] -> [%s]",puVar3,&DAT_002b17cb);
    }
    uVar4 = 0x1a;
  }
  *(undefined1 *)(lVar5 + 0x536) = uVar4;
  return 0;
}

