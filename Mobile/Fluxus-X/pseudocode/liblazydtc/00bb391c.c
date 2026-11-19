/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00bb391c
 */

void ZSTD_copyDDictParameters(long *param_1,long param_2)

{
  long lVar1;
  long lVar2;
  undefined4 uVar3;
  int iVar4;
  
  lVar1 = *(long *)(param_2 + 8);
  lVar2 = *(long *)(param_2 + 0x10);
  uVar3 = *(undefined4 *)(param_2 + 0x6ab4);
  iVar4 = *(int *)(param_2 + 0x6ab8);
  param_1[0xe99] = lVar1;
  param_1[0xe9a] = lVar1;
  lVar1 = lVar1 + lVar2;
  *(undefined4 *)(param_1 + 0xebf) = uVar3;
  param_1[0xe9b] = lVar1;
  param_1[0xe98] = lVar1;
  if (iVar4 == 0) {
    param_1[0xea6] = 0;
    return;
  }
  param_1[0xea6] = 0x100000001;
  *(undefined4 *)((long)param_1 + 0x683c) = *(undefined4 *)(param_2 + 0x6834);
  uVar3 = *(undefined4 *)(param_2 + 0x6838);
  *param_1 = param_2 + 0x18;
  param_1[1] = param_2 + 0x1828;
  *(undefined4 *)(param_1 + 0xd08) = uVar3;
  uVar3 = *(undefined4 *)(param_2 + 0x683c);
  param_1[2] = param_2 + 0x1020;
  param_1[3] = param_2 + 0x2830;
  *(undefined4 *)((long)param_1 + 0x6844) = uVar3;
  return;
}

