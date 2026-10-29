/* 7ff70c7c8d40 FUN_7ff70c7c8d40 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_7ff70c7c8d40(longlong param_1,undefined8 *param_2)

{
  int *piVar1;
  uint uVar2;
  int iVar3;
  longlong lVar4;
  longlong lVar5;
  longlong lVar6;
  code *pcVar7;
  int iVar8;
  longlong lVar9;
  longlong lVar10;
  uint uVar11;
  longlong lVar12;
  longlong lVar13;
  undefined *puVar14;
  uint uVar15;
  longlong lVar17;
  undefined8 *puVar18;
  undefined1 auStack_88 [32];
  undefined8 *puStack_68;
  longlong lStack_60;
  longlong lStack_58;
  longlong lStack_50;
  ulonglong uStack_48;
  ulonglong uVar16;
  
  uStack_48 = _DAT_7ff70cbebd80 ^ (ulonglong)auStack_88;
  lVar4 = param_2[1];
  puStack_68 = param_2;
  lStack_50 = param_1;
  if (((lVar4 != 0) && (lVar17 = *(longlong *)(lVar4 + 0x2b0), lVar17 != 0)) &&
     (iVar8 = *(int *)(lVar17 + 0xc0), 0 < iVar8)) {
    uVar11 = 0;
    lStack_60 = lVar17;
    do {
      lVar10 = *(longlong *)(*(longlong *)(lVar17 + 0xd0) + (ulonglong)(uVar11 >> 5) * 8);
      lVar9 = (ulonglong)(uVar11 & 0x1f) * 0x68;
      lVar13 = *(longlong *)(lVar4 + 0x2b0);
      if (((*(int *)(lVar10 + 0x50 + lVar9) <= *(int *)(lVar13 + 0xa4)) &&
          (puVar18 = (undefined8 *)(lVar10 + lVar9), (undefined8 *)puVar18[0xb] == puStack_68)) &&
         ((*(byte *)((longlong)puVar18 + 0x4f) & 4) == 0)) {
        if ((_DAT_7ff70cc1a3c0 != 0) && ((*(byte *)(_DAT_7ff70cc1a3c0 + 0x27b5) & 1) != 0)) {
          puVar14 = &UNK_7ff70cb8adf6;
          if (*(int *)(puStack_68 + 4) != 0) {
            puVar14 = *(undefined **)puStack_68[5];
          }
          FUN_7ff70c800cf0(&UNK_7ff70cb91e39,(double)*(float *)((longlong)puVar18 + 0x14),puVar14);
        }
        iVar8 = *(int *)(puVar18 + 6);
        if ((longlong)iVar8 != 0) {
          lVar17 = puVar18[7];
          lVar10 = 0;
          do {
            uVar15 = *(uint *)(lVar17 + 0x28 + lVar10);
            if (uVar15 != 0xffffffff) {
              uVar15 = uVar15 & 0xfffff;
              uVar16 = (ulonglong)uVar15;
              lVar9 = *(longlong *)(lVar4 + 0x2b0);
              lVar5 = *(longlong *)(lVar9 + 0x68);
              lVar6 = *(longlong *)(lVar9 + 0x78);
              uVar2 = *(uint *)(lVar6 + uVar16 * 4);
              lVar12 = (longlong)((ulonglong)uVar2 << 0x2c) >> 0x2c;
              *(uint *)(lVar6 + uVar16 * 4) = uVar2 & 0xbfffffff;
              *(uint *)(lVar6 + uVar16 * 4) =
                   uVar2 + 0x100000 & 0x3ff00000 | uVar2 & 0x80000000 |
                   *(uint *)(lVar9 + 0x90) & 0xfffff;
              iVar3 = *(int *)(lVar4 + 8);
              *(uint *)(lVar9 + 0x90) = uVar15;
              *(int *)(lVar9 + 0x9c) = *(int *)(lVar9 + 0x9c) + 1;
              *(int *)(lVar9 + 0xa0) =
                   *(int *)(lVar9 + 0xa0) +
                   ((uint)*(ushort *)(lVar5 + 6 + lVar12 * 8) + iVar3) *
                   ((uint)*(ushort *)(lVar5 + 4 + lVar12 * 8) + iVar3);
              *(undefined4 *)(lVar5 + 4 + lVar12 * 8) = 0;
            }
            lVar10 = lVar10 + 0x2c;
          } while ((longlong)iVar8 * 0x2c - lVar10 != 0);
        }
        iVar8 = *(int *)(puStack_68 + 4);
        lVar17 = puVar18[0xc];
        lStack_58 = lVar13;
        if ((longlong)iVar8 != 0) {
          lVar10 = puStack_68[5];
          lVar13 = 0;
          do {
            lVar9 = *(longlong *)(*(longlong *)(lVar10 + lVar13) + 0x80);
            if (lVar9 == 0) {
              lVar9 = *(longlong *)(lVar4 + 0x2b8);
              pcVar7 = *(code **)(lVar9 + 0x38);
            }
            else {
              pcVar7 = *(code **)(lVar9 + 0x38);
            }
            if (pcVar7 != (code *)0x0) {
              (*pcVar7)(lVar4,*(longlong *)(lVar10 + lVar13),puVar18,lVar17);
            }
            lVar17 = lVar17 + *(longlong *)(lVar9 + 0x48);
            lVar13 = lVar13 + 8;
          } while ((longlong)iVar8 * 8 != lVar13);
          lVar17 = puVar18[0xc];
        }
        lVar10 = lStack_58;
        if (lVar17 != 0) {
          FUN_7ff70c802510(lVar17);
          puVar18[0xc] = 0;
        }
        FUN_7ff70c805e60(lVar10 + 0xd8,*(undefined4 *)((longlong)puVar18 + 0x54),0);
        piVar1 = (int *)(lVar10 + 0xe8);
        *piVar1 = *piVar1 + 1;
        *(undefined4 *)(puVar18 + 2) = 0;
        if (puVar18[7] != 0) {
          puVar18[6] = 0;
          FUN_7ff70c802510();
          puVar18[7] = 0;
        }
        if (puVar18[1] != 0) {
          *puVar18 = 0;
          FUN_7ff70c802510();
          puVar18[1] = 0;
        }
        if (puVar18[5] != 0) {
          puVar18[4] = 0;
          FUN_7ff70c802510();
          puVar18[5] = 0;
        }
        *(undefined4 *)(puVar18 + 8) = 0xffffffff;
        *(undefined8 *)((longlong)puVar18 + 0x44) = 0;
        *(uint *)((longlong)puVar18 + 0x4c) =
             *(uint *)((longlong)puVar18 + 0x4c) & 0xf8000000 | 0x4000000;
        *puStack_68 = 0;
        iVar8 = *(int *)(lStack_60 + 0xc0);
        lVar17 = lStack_60;
      }
      uVar11 = uVar11 + 1;
    } while ((int)uVar11 < iVar8);
  }
  lVar4 = lStack_50;
  *(undefined4 *)(puStack_68 + 6) = 0;
  *(undefined1 *)((longlong)puStack_68 + 0x34) = 0;
  *puStack_68 = 0;
  iVar8 = *(int *)(puStack_68 + 4);
  if ((longlong)iVar8 != 0) {
    lVar17 = puStack_68[5];
    lVar10 = 0;
    do {
      lVar13 = *(longlong *)(*(longlong *)(lVar17 + lVar10) + 0x80);
      if (((lVar13 != 0) || (lVar13 = *(longlong *)(lVar4 + 0x2b8), lVar13 != 0)) &&
         (*(code **)(lVar13 + 0x20) != (code *)0x0)) {
        (**(code **)(lVar13 + 0x20))(lVar4);
      }
      lVar10 = lVar10 + 8;
    } while ((longlong)iVar8 * 8 != lVar10);
  }
  if (_DAT_7ff70cbebd80 == (uStack_48 ^ (ulonglong)auStack_88)) {
    return;
  }
  FUN_7ff70caa97e0(uStack_48 ^ (ulonglong)auStack_88);
  pcVar7 = (code *)swi(3);
  (*pcVar7)();
  return;
}


