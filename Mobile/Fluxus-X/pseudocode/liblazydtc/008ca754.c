/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ca754
 */

long FUN_008ca754(long *param_1,long param_2,uint param_3)

{
  undefined1 *puVar1;
  long *plVar2;
  long lVar3;
  int iVar4;
  uint uVar5;
  byte bVar6;
  void *__s;
  long lVar7;
  long lVar8;
  long lVar9;
  undefined8 uVar10;
  ulong uVar11;
  ulong uVar12;
  ulong uVar13;
  
  uVar11 = (ulong)param_3;
  if (param_1[1] == 0) {
    lVar7 = *(long *)(*(long *)(*param_1 + 8) + uVar11 * 8);
  }
  else {
    if (param_1[3] == 0) {
      uVar12 = 2;
      do {
        uVar13 = uVar12;
        uVar12 = uVar13 << 1;
      } while (uVar13 < (ulong)((long)*(int *)(param_1[2] + 0x9c) << 1));
      param_1[3] = param_2;
      if (uVar13 >> 0x3d != 0) {
                    /* WARNING: Subroutine does not return */
        FUN_008b75fc(param_2);
      }
      __s = (void *)FUN_008b7610(param_2,uVar13 << 3,0);
      param_1[4] = (long)__s;
      param_1[5] = uVar13;
      if (uVar13 != 0) {
        memset(__s,0,uVar13 << 3);
      }
    }
    else {
      __s = (void *)param_1[4];
      uVar13 = param_1[5];
    }
    uVar12 = uVar13 - 1 & uVar11;
    lVar7 = *(long *)((long)__s + uVar12 * 8);
    while (lVar7 != 0) {
      if (*(uint *)(lVar7 + 0x98) == param_3) {
        return lVar7;
      }
      uVar12 = uVar12 + 1 & uVar13 - 1;
      lVar7 = *(long *)((long)__s + uVar12 * 8);
    }
    plVar2 = (long *)param_1[1];
    lVar3 = param_1[2];
    lVar7 = FUN_008b4cdc(param_2);
    lVar8 = *(long *)(param_2 + 0x60);
    uVar10 = *(undefined8 *)(lVar3 + 0x70);
    *(uint *)(lVar7 + 0x98) = param_3;
    iVar4 = *(int *)(lVar8 + 0x5588);
    *(undefined8 *)(lVar7 + 0x70) = uVar10;
    if (iVar4 != 0) {
      *(int *)(lVar8 + 0x5588) = iVar4 + 1;
    }
    lVar8 = plVar2[0xe];
    *(int *)(lVar7 + 0xcc) = iVar4;
    lVar9 = *plVar2;
    uVar5 = *(uint *)(lVar8 + uVar11 * 4);
    *(undefined8 *)(lVar7 + 0x68) = *(undefined8 *)(lVar3 + 0x68);
    puVar1 = (undefined1 *)(lVar9 + (ulong)uVar5);
    *(undefined1 *)(lVar7 + 5) = *puVar1;
    *(undefined1 *)(lVar7 + 7) = puVar1[1];
    *(undefined1 *)(lVar7 + 6) = puVar1[2];
    bVar6 = *(byte *)((long)plVar2 + 0x39);
    *(undefined1 *)(lVar7 + 3) = puVar1[3];
    if (3 < bVar6) {
      *(undefined1 *)(lVar7 + 4) = puVar1[4];
    }
    lVar3 = plVar2[4];
    *(undefined **)(lVar7 + 0x30) = &DAT_00364cc0;
    *(undefined **)(lVar7 + 0x18) = &DAT_00364cc0;
    *(undefined4 *)(lVar7 + 0xb8) = 1;
    *(long **)(lVar7 + 0xe8) = plVar2;
    *(int *)(plVar2 + 4) = (int)lVar3 + 1;
    *(long *)((long)__s + uVar12 * 8) = lVar7;
  }
  return lVar7;
}

