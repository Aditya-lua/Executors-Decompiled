/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008c8c74
 */

void FUN_008c8c74(long param_1,undefined8 *param_2)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 *puVar6;
  undefined8 *puVar7;
  undefined4 *puVar8;
  undefined8 uVar9;
  ulong uVar10;
  ulong uVar11;
  
  lVar1 = *(long *)(param_1 + 0x50);
  puVar4 = *(undefined8 **)(param_1 + 0x68);
  uVar2 = *(uint *)(lVar1 + 0x28);
  puVar7 = *(undefined8 **)(lVar1 + 8);
  puVar6 = puVar7;
  if (uVar2 != 0 && param_2 < puVar4) {
    do {
      puVar5 = param_2 + 2;
      uVar9 = *param_2;
      uVar2 = uVar2 - 1;
      puVar7 = puVar6 + 2;
      puVar6[1] = param_2[1];
      *puVar6 = uVar9;
      if (uVar2 == 0) break;
      puVar6 = puVar7;
      param_2 = puVar5;
    } while (puVar5 < puVar4);
  }
  if (0 < (int)uVar2) {
    if (uVar2 == 1) {
      iVar3 = 1;
      puVar6 = puVar7;
    }
    else {
      uVar10 = (ulong)uVar2 & 0x7ffffffe;
      puVar6 = puVar7 + uVar10 * 2;
      iVar3 = uVar2 - (int)uVar10;
      puVar8 = (undefined4 *)((long)puVar7 + 0x1c);
      uVar11 = uVar10;
      do {
        uVar11 = uVar11 - 2;
        puVar8[-4] = 0;
        *puVar8 = 0;
        puVar8 = puVar8 + 8;
      } while (uVar11 != 0);
      puVar7 = puVar6;
      if (uVar10 == uVar2) goto LAB_008c8d20;
    }
    uVar2 = iVar3 + 1;
    do {
      uVar2 = uVar2 - 1;
      *(undefined4 *)((long)puVar6 + 0xc) = 0;
      puVar7 = puVar6 + 2;
      puVar6 = puVar6 + 2;
    } while (1 < uVar2);
  }
LAB_008c8d20:
  iVar3 = *(int *)(lVar1 + 0x28);
  uVar9 = *(undefined8 *)(lVar1 + -0x20);
  *(long *)(param_1 + 0x50) = lVar1 + -0x30;
  *(undefined8 *)(param_1 + 0x70) = uVar9;
  if (iVar3 != -1) {
    puVar7 = *(undefined8 **)(lVar1 + -0x18);
  }
  *(undefined8 **)(param_1 + 0x68) = puVar7;
  return;
}

