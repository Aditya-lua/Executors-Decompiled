/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ca8f8
 */

long FUN_008ca8f8(long *param_1,long param_2,uint param_3)

{
  undefined1 *puVar1;
  int iVar2;
  uint uVar3;
  byte bVar4;
  long lVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  undefined8 uVar9;
  long *plVar10;
  long lVar11;
  
  plVar10 = (long *)param_1[1];
  if (plVar10 == (long *)0x0) {
    lVar5 = *(long *)(*(long *)(*param_1 + 8) + (ulong)param_3 * 8);
  }
  else {
    if (param_1[3] != 0) {
      uVar8 = param_1[5] - 1U & (ulong)param_3;
      lVar5 = *(long *)(param_1[4] + uVar8 * 8);
      while (lVar5 != 0) {
        if (*(uint *)(lVar5 + 0x98) == param_3) {
          return lVar5;
        }
        uVar8 = uVar8 + 1 & param_1[5] - 1U;
        lVar5 = *(long *)(param_1[4] + uVar8 * 8);
      }
    }
    lVar11 = param_1[2];
    lVar5 = FUN_008b4cdc(param_2);
    lVar6 = *(long *)(param_2 + 0x60);
    uVar9 = *(undefined8 *)(lVar11 + 0x70);
    *(uint *)(lVar5 + 0x98) = param_3;
    iVar2 = *(int *)(lVar6 + 0x5588);
    *(undefined8 *)(lVar5 + 0x70) = uVar9;
    if (iVar2 != 0) {
      *(int *)(lVar6 + 0x5588) = iVar2 + 1;
    }
    lVar6 = plVar10[0xe];
    *(int *)(lVar5 + 0xcc) = iVar2;
    lVar7 = *plVar10;
    uVar3 = *(uint *)(lVar6 + (ulong)param_3 * 4);
    *(undefined8 *)(lVar5 + 0x68) = *(undefined8 *)(lVar11 + 0x68);
    puVar1 = (undefined1 *)(lVar7 + (ulong)uVar3);
    *(undefined1 *)(lVar5 + 5) = *puVar1;
    *(undefined1 *)(lVar5 + 7) = puVar1[1];
    *(undefined1 *)(lVar5 + 6) = puVar1[2];
    bVar4 = *(byte *)((long)plVar10 + 0x39);
    *(undefined1 *)(lVar5 + 3) = puVar1[3];
    if (3 < bVar4) {
      *(undefined1 *)(lVar5 + 4) = puVar1[4];
    }
    lVar6 = plVar10[4];
    *(undefined **)(lVar5 + 0x30) = &DAT_00364cc0;
    *(undefined **)(lVar5 + 0x18) = &DAT_00364cc0;
    *(undefined4 *)(lVar5 + 0xb8) = 1;
    *(long **)(lVar5 + 0xe8) = plVar10;
    *(int *)(plVar10 + 4) = (int)lVar6 + 1;
  }
  return lVar5;
}

