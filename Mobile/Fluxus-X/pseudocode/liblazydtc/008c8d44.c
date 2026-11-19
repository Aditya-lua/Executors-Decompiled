/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008c8d44
 */

void FUN_008c8d44(long param_1)

{
  int iVar1;
  long lVar2;
  undefined4 *puVar3;
  undefined8 *puVar4;
  undefined8 uVar5;
  int iVar6;
  undefined8 *puVar8;
  undefined8 *puVar7;
  undefined8 *puVar9;
  undefined8 *puVar10;
  
  lVar2 = *(long *)(param_1 + 0x50);
  puVar3 = *(undefined4 **)(lVar2 + 8);
  iVar1 = *(int *)(lVar2 + 0x28);
  *puVar3 = 1;
  puVar3[3] = 1;
  puVar10 = (undefined8 *)(puVar3 + 4);
  iVar1 = iVar1 - (uint)(0 < iVar1);
  if (*(int *)(lVar2 + 0x20) == 0) {
    iVar6 = iVar1;
    if (iVar1 == -1) {
      iVar6 = (int)((ulong)(*(long *)(param_1 + 0x68) - *(long *)(param_1 + 0x70)) >> 4);
    }
    puVar10 = puVar10 + (long)iVar6 * 2;
  }
  else {
    puVar7 = (undefined8 *)(*(long *)(param_1 + 0x70) + (long)*(int *)(lVar2 + 0x20) * 0x10);
    if (iVar1 == -1) {
      puVar9 = *(undefined8 **)(param_1 + 0x68);
    }
    else {
      puVar9 = puVar7 + (long)iVar1 * 2;
    }
    puVar4 = puVar10;
    if (puVar7 < puVar9) {
      do {
        puVar8 = puVar7 + 2;
        uVar5 = *puVar7;
        puVar10 = puVar4 + 2;
        puVar4[1] = puVar7[1];
        *puVar4 = uVar5;
        puVar4 = puVar10;
        puVar7 = puVar8;
      } while (puVar8 < puVar9);
    }
  }
  uVar5 = *(undefined8 *)(lVar2 + -0x20);
  *(long *)(param_1 + 0x50) = lVar2 + -0x30;
  *(undefined8 *)(param_1 + 0x70) = uVar5;
  if (iVar1 != -1) {
    puVar10 = *(undefined8 **)(lVar2 + -0x18);
  }
  *(undefined8 **)(param_1 + 0x68) = puVar10;
  return;
}

