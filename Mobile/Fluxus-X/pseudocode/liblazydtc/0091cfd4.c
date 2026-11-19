/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0091cfd4
 */

undefined8 FUN_0091cfd4(long param_1,ulong param_2,ulong param_3)

{
  uint uVar1;
  uint uVar2;
  int iVar3;
  undefined *puVar4;
  
  if (param_2 >> 0xc < 0x4b) {
    iVar3 = (int)param_2;
    uVar1 = *(int *)(param_1 + 0x1378) + iVar3;
    uVar2 = *(int *)(param_1 + 0x10c) + iVar3;
    *(uint *)(param_1 + 0x1378) = uVar1;
    *(uint *)(param_1 + 0x10c) = uVar2;
    if ((param_3 & 1) == 0) {
      *(int *)(param_1 + 0x108) = *(int *)(param_1 + 0x108) + iVar3;
    }
    puVar4 = (undefined *)0x4b000;
    if (0x4b000 < uVar2) {
      param_2 = (ulong)uVar2;
      goto LAB_0091d034;
    }
    puVar4 = &DAT_005dc000;
    if (uVar1 < 0x5dc001) {
      return 0;
    }
    param_2 = (ulong)uVar1;
  }
  else {
    puVar4 = (undefined *)0x4b000;
    param_2 = *(uint *)(param_1 + 0x10c) + param_2;
  }
  if (param_2 == 0) {
    return 0;
  }
LAB_0091d034:
  FUN_00904b80(param_1,"Too large response headers: %zu > %u",param_2,puVar4);
  return 0x38;
}

