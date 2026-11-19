/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b8780
 */

void FUN_008b8780(long param_1,long *param_2,long *param_3,undefined4 *param_4,undefined4 *param_5)

{
  int iVar1;
  int iVar2;
  ulong uVar3;
  undefined4 uVar4;
  int iVar5;
  long lVar6;
  
  iVar2 = *(int *)(param_1 + 0x24);
  uVar3 = (ulong)iVar2;
  if ((DAT_00d1f618 == '\x01') && (*(int *)(param_1 + 0x38) == 1)) {
    lVar6 = *(long *)(param_1 + 0x40);
  }
  else {
    lVar6 = param_1 + 0x40;
  }
  iVar5 = 0;
  if (uVar3 != 0) {
    iVar5 = (int)(((long)*(int *)(param_1 + 0x20) - 0x40U) / uVar3);
  }
  iVar1 = *(int *)(param_1 + 0x30);
  *param_4 = *(undefined4 *)(param_1 + 0x34);
  *param_2 = lVar6 + iVar1 + uVar3;
  uVar4 = *(undefined4 *)(param_1 + 0x24);
  *param_3 = lVar6 + iVar2 * iVar5;
  *param_5 = uVar4;
  return;
}

