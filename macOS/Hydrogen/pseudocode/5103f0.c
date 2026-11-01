
long FUN_005103f0(long param_1,long param_2,undefined8 *param_3)

{
  undefined4 *puVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  int iVar4;
  ulong uVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long *plVar9;
  undefined8 uVar10;
  long lVar11;
  long lVar12;
  undefined8 *puVar13;
  long lVar14;
  undefined4 *puVar15;
  undefined8 *puVar16;
  long lVar17;
  long lVar18;
  
  if (param_1 != 0) {
    uVar10 = *param_3;
    lVar7 = param_3[1];
    plVar9 = (long *)(*(long *)(param_2 + 0x20) + 0x10);
    param_1 = param_1 << 5;
    do {
      if ((((int)plVar9[-2] == 1) && (*plVar9 == lVar7)) &&
         (iVar4 = _memcmp(plVar9[-1],uVar10,lVar7), iVar4 == 0)) {
        uVar5 = plVar9[1];
        if (uVar5 < *(ulong *)(param_2 + 0x10)) {
          return *(long *)(param_2 + 8) + uVar5 * 600;
        }
        lVar6 = func_0x007a2570(uVar5,*(ulong *)(param_2 + 0x10),&UNK_009e93b8);
        plVar9 = (long *)(lVar6 + 0x18);
        uVar5 = *(ulong *)(lVar6 + 0x10);
        lVar7 = lVar6;
        if ((ulong)(*plVar9 - *(long *)(lVar6 + 0x28)) < uVar5) {
          lVar7 = func_0x007a5594(lVar6 + 0x18,*(long *)(lVar6 + 0x28),uVar5,8,0x20);
          uVar5 = *(ulong *)(lVar6 + 0x10);
        }
        if (uVar5 != 0) {
          lVar17 = 0;
          lVar18 = *(long *)(lVar6 + 8);
          lVar8 = lVar18 + uVar5 * 600;
          do {
            if (*(int *)(lVar18 + 0x28) == 1) {
              uVar10 = *(undefined8 *)(lVar18 + 0x30);
              lVar11 = *(long *)(lVar6 + 0x28);
              if (lVar11 == *(long *)(lVar6 + 0x18)) {
                lVar7 = func_0x0050c2ec(plVar9,&UNK_009e93d0);
              }
              puVar15 = (undefined4 *)(*(long *)(lVar6 + 0x20) + lVar11 * 0x20);
              *puVar15 = 2;
              *(undefined8 *)(puVar15 + 2) = uVar10;
              *(long *)(puVar15 + 6) = lVar17;
              *(long *)(lVar6 + 0x28) = lVar11 + 1;
            }
            else {
              iVar4 = *(int *)(lVar18 + 0x248);
              if (iVar4 != 0x110000) {
                lVar11 = *(long *)(lVar6 + 0x28);
                if (lVar11 == *(long *)(lVar6 + 0x18)) {
                  lVar7 = func_0x0050c2ec(plVar9,&UNK_009e93e8);
                }
                puVar15 = (undefined4 *)(*(long *)(lVar6 + 0x20) + lVar11 * 0x20);
                *puVar15 = 0;
                puVar15[1] = iVar4;
                *(long *)(puVar15 + 6) = lVar17;
                *(long *)(lVar6 + 0x28) = lVar11 + 1;
              }
              lVar11 = *(long *)(lVar18 + 0x228);
              if (lVar11 != 0) {
                uVar10 = *(undefined8 *)(lVar18 + 0x230);
                lVar14 = *(long *)(lVar6 + 0x28);
                if (lVar14 == *(long *)(lVar6 + 0x18)) {
                  lVar7 = func_0x0050c2ec(plVar9,&UNK_009e9400);
                }
                puVar15 = (undefined4 *)(*(long *)(lVar6 + 0x20) + lVar14 * 0x20);
                *puVar15 = 1;
                *(long *)(puVar15 + 2) = lVar11;
                *(undefined8 *)(puVar15 + 4) = uVar10;
                *(long *)(puVar15 + 6) = lVar17;
                *(long *)(lVar6 + 0x28) = lVar14 + 1;
              }
              if (*(long *)(lVar18 + 0x150) != 0) {
                lVar11 = *(long *)(lVar6 + 0x28);
                lVar14 = lVar11 << 5;
                lVar12 = *(long *)(lVar18 + 0x150) << 3;
                puVar15 = *(undefined4 **)(lVar18 + 0x148);
                do {
                  uVar3 = *puVar15;
                  if (lVar11 == *plVar9) {
                    lVar7 = func_0x0050c2ec(plVar9,&UNK_009e9418);
                  }
                  puVar1 = (undefined4 *)(*(long *)(lVar6 + 0x20) + lVar14);
                  *puVar1 = 0;
                  puVar1[1] = uVar3;
                  *(long *)(puVar1 + 6) = lVar17;
                  lVar11 = lVar11 + 1;
                  *(long *)(lVar6 + 0x28) = lVar11;
                  lVar14 = lVar14 + 0x20;
                  lVar12 = lVar12 + -8;
                  puVar15 = puVar15 + 2;
                } while (lVar12 != 0);
              }
              if (*(long *)(lVar18 + 0x138) != 0) {
                puVar16 = *(undefined8 **)(lVar18 + 0x130);
                puVar13 = puVar16 + *(long *)(lVar18 + 0x138) * 3;
                lVar11 = *(long *)(lVar6 + 0x28);
                lVar14 = lVar11 << 5;
                do {
                  uVar10 = *puVar16;
                  uVar2 = puVar16[1];
                  if (lVar11 == *plVar9) {
                    lVar7 = func_0x0050c2ec(plVar9,&UNK_009e9430);
                  }
                  puVar15 = (undefined4 *)(*(long *)(lVar6 + 0x20) + lVar14);
                  *puVar15 = 1;
                  *(undefined8 *)(puVar15 + 2) = uVar10;
                  *(undefined8 *)(puVar15 + 4) = uVar2;
                  *(long *)(puVar15 + 6) = lVar17;
                  lVar11 = lVar11 + 1;
                  *(long *)(lVar6 + 0x28) = lVar11;
                  lVar14 = lVar14 + 0x20;
                  puVar16 = puVar16 + 3;
                } while (puVar16 != puVar13);
              }
            }
            lVar18 = lVar18 + 600;
            lVar17 = lVar17 + 1;
          } while (lVar18 != lVar8);
        }
        return lVar7;
      }
      plVar9 = plVar9 + 4;
      param_1 = param_1 + -0x20;
    } while (param_1 != 0);
  }
  return 0;
}

