/* 7ff70c7f71e0 FUN_7ff70c7f71e0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7f71e0(undefined8 *param_1)

{
  longlong *plVar1;
  uint uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  longlong lVar7;
  longlong lVar8;
  longlong lVar9;
  code *pcVar10;
  int iVar11;
  longlong lVar12;
  longlong lVar13;
  undefined *puVar14;
  uint uVar15;
  longlong *plVar17;
  uint uVar18;
  undefined8 *puVar19;
  longlong lVar20;
  ulonglong uVar16;
  
  lVar4 = param_1[1];
  if (((lVar4 != 0) && (lVar5 = *(longlong *)(lVar4 + 0x2b0), lVar5 != 0)) &&
     (iVar11 = *(int *)(lVar5 + 0xc0), 0 < iVar11)) {
    uVar18 = 0;
    do {
      lVar20 = *(longlong *)(*(longlong *)(lVar5 + 0xd0) + (ulonglong)(uVar18 >> 5) * 8);
      lVar12 = (ulonglong)(uVar18 & 0x1f) * 0x68;
      lVar6 = *(longlong *)(lVar4 + 0x2b0);
      if (((*(int *)(lVar20 + 0x50 + lVar12) <= *(int *)(lVar6 + 0xa4)) &&
          (puVar19 = (undefined8 *)(lVar20 + lVar12), (undefined8 *)puVar19[0xb] == param_1)) &&
         ((*(byte *)((longlong)puVar19 + 0x4f) & 4) == 0)) {
        if ((_DAT_7ff70cc1a3c0 != 0) && ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5) & 1) != 0)) {
          puVar14 = &UNK_7ff70cb8adf6;
          if (*(int *)(param_1 + 4) != 0) {
            puVar14 = *(undefined **)param_1[5];
          }
          FUN_7ff70c800cf0(&UNK_7ff70cb91e39,(double)*(float *)((longlong)puVar19 + 0x14),puVar14);
        }
        iVar11 = *(int *)(puVar19 + 6);
        if ((longlong)iVar11 != 0) {
          lVar20 = puVar19[7];
          lVar12 = 0;
          do {
            uVar15 = *(uint *)(lVar20 + 0x28 + lVar12);
            if (uVar15 != 0xffffffff) {
              uVar15 = uVar15 & 0xfffff;
              uVar16 = (ulonglong)uVar15;
              lVar7 = *(longlong *)(lVar4 + 0x2b0);
              lVar8 = *(longlong *)(lVar7 + 0x68);
              lVar9 = *(longlong *)(lVar7 + 0x78);
              uVar2 = *(uint *)(lVar9 + uVar16 * 4);
              lVar13 = (longlong)((ulonglong)uVar2 << 0x2c) >> 0x2c;
              *(uint *)(lVar9 + uVar16 * 4) = uVar2 & 0xbfffffff;
              *(uint *)(lVar9 + uVar16 * 4) =
                   uVar2 + 0x100000 & 0x3ff00000 | uVar2 & 0x80000000 |
                   *(uint *)(lVar7 + 0x90) & 0xfffff;
              iVar3 = *(int *)(lVar4 + 8);
              *(uint *)(lVar7 + 0x90) = uVar15;
              *(int *)(lVar7 + 0x9c) = *(int *)(lVar7 + 0x9c) + 1;
              *(int *)(lVar7 + 0xa0) =
                   *(int *)(lVar7 + 0xa0) +
                   ((uint)*(ushort *)(lVar8 + 6 + lVar13 * 8) + iVar3) *
                   ((uint)*(ushort *)(lVar8 + 4 + lVar13 * 8) + iVar3);
              *(undefined4 *)(lVar8 + 4 + lVar13 * 8) = 0;
            }
            lVar12 = lVar12 + 0x2c;
          } while ((longlong)iVar11 * 0x2c - lVar12 != 0);
        }
        lVar20 = puVar19[0xc];
        if ((longlong)*(int *)(param_1 + 4) != 0) {
          plVar17 = (longlong *)param_1[5];
          plVar1 = plVar17 + *(int *)(param_1 + 4);
          do {
            lVar12 = *(longlong *)(*plVar17 + 0x80);
            if (lVar12 == 0) {
              lVar12 = *(longlong *)(lVar4 + 0x2b8);
              pcVar10 = *(code **)(lVar12 + 0x38);
            }
            else {
              pcVar10 = *(code **)(lVar12 + 0x38);
            }
            if (pcVar10 != (code *)0x0) {
              (*pcVar10)(lVar4,*plVar17,puVar19,lVar20);
            }
            lVar20 = lVar20 + *(longlong *)(lVar12 + 0x48);
            plVar17 = plVar17 + 1;
          } while (plVar17 != plVar1);
          lVar20 = puVar19[0xc];
        }
        if (lVar20 != 0) {
          FUN_7ff70c802510(lVar20);
          puVar19[0xc] = 0;
        }
        FUN_7ff70c805e60(lVar6 + 0xd8,*(undefined4 *)((longlong)puVar19 + 0x54),0);
        *(int *)(lVar6 + 0xe8) = *(int *)(lVar6 + 0xe8) + 1;
        *(undefined4 *)(puVar19 + 2) = 0;
        if (puVar19[7] != 0) {
          puVar19[6] = 0;
          FUN_7ff70c802510();
          puVar19[7] = 0;
        }
        if (puVar19[1] != 0) {
          *puVar19 = 0;
          FUN_7ff70c802510();
          puVar19[1] = 0;
        }
        if (puVar19[5] != 0) {
          puVar19[4] = 0;
          FUN_7ff70c802510();
          puVar19[5] = 0;
        }
        *(undefined4 *)(puVar19 + 8) = 0xffffffff;
        *(undefined8 *)((longlong)puVar19 + 0x44) = 0;
        *(uint *)((longlong)puVar19 + 0x4c) =
             *(uint *)((longlong)puVar19 + 0x4c) & 0xf8000000 | 0x4000000;
        *param_1 = 0;
        iVar11 = *(int *)(lVar5 + 0xc0);
      }
      uVar18 = uVar18 + 1;
    } while ((int)uVar18 < iVar11);
  }
  *(undefined4 *)(param_1 + 6) = 0;
  *(undefined1 *)((longlong)param_1 + 0x34) = 0;
  *param_1 = 0;
  if (param_1[8] != 0) {
    FUN_7ff70c802510();
  }
  if (param_1[5] != 0) {
    FUN_7ff70c802510();
  }
  return;
}


