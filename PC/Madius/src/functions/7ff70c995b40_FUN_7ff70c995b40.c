/* 7ff70c995b40 FUN_7ff70c995b40 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Removing unreachable block (ram,0x7ff70c995d32) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

uint * FUN_7ff70c995b40(longlong param_1,uint param_2,ulonglong param_3)

{
  byte *pbVar1;
  ushort uVar2;
  ushort uVar3;
  uint uVar4;
  int iVar5;
  ushort uVar6;
  longlong lVar7;
  ulonglong uVar8;
  int *piVar9;
  uint *puVar10;
  uint uVar11;
  ulonglong *puVar12;
  uint uVar13;
  ulonglong uVar14;
  uint *puVar15;
  uint *puVar16;
  uint *puVar17;
  longlong lVar18;
  longlong lVar19;
  uint uVar20;
  bool bVar21;
  ulonglong uStack_690;
  undefined1 auStack_688 [32];
  undefined8 uStack_668;
  undefined1 auStack_660 [8];
  uint auStack_658 [2];
  longlong alStack_650 [64];
  uint auStack_450 [2];
  longlong alStack_448 [64];
  uint auStack_248 [2];
  longlong alStack_240 [64];
  
  puVar12 = (ulonglong *)auStack_688;
  if (param_2 != 0 && param_1 != 0) {
    lVar19 = (longlong)(ulonglong)param_2 << 4;
    lVar7 = 0;
    do {
      if (*(longlong *)(param_1 + lVar7) != -1) {
        piVar9 = (int *)0x0;
        uVar11 = 0;
        uVar13 = 0;
        uVar8 = 0;
        do {
          lVar18 = (longlong)piVar9 * 0x10;
          *(undefined2 *)(param_1 + 10 + lVar18) = 0;
          lVar7 = *(longlong *)(param_1 + lVar18);
          if ((lVar7 != -1) && (uVar3 = *(ushort *)(lVar18 + param_1 + 8), (uVar3 & 0x710) != 0)) {
            if ((uVar3 & 0x300) != 0) {
              bVar21 = true;
              if (uVar11 != 0) {
                uVar14 = 0;
                do {
                  if (alStack_240[uVar14] == lVar7) {
                    bVar21 = uVar11 == (uint)uVar14;
                    break;
                  }
                  uVar14 = uVar14 + 1;
                } while (uVar11 != uVar14);
              }
              if (!(bool)(bVar21 ^ 1) && uVar11 < 0x40) {
                alStack_240[uVar11] = lVar7;
                uVar11 = uVar11 + 1;
              }
            }
            if ((uVar3 & 0x10) != 0) {
              bVar21 = true;
              if (uVar13 != 0) {
                uVar14 = 0;
                do {
                  if (alStack_448[uVar14] == lVar7) {
                    bVar21 = uVar13 == (uint)uVar14;
                    break;
                  }
                  uVar14 = uVar14 + 1;
                } while (uVar13 != uVar14);
              }
              if (!(bool)(bVar21 ^ 1) && uVar13 < 0x40) {
                alStack_448[uVar13] = lVar7;
                uVar13 = uVar13 + 1;
              }
            }
            if ((uVar3 & 0x600) != 0) {
              bVar21 = true;
              uVar4 = (uint)uVar8;
              if (uVar4 != 0) {
                uVar14 = 0;
                do {
                  if (alStack_650[uVar14] == lVar7) {
                    bVar21 = uVar4 == (uint)uVar14;
                    break;
                  }
                  uVar14 = uVar14 + 1;
                } while (uVar8 != uVar14);
              }
              if (!(bool)(bVar21 ^ 1U | 0x3f < uVar4)) {
                alStack_650[uVar8] = lVar7;
                uVar8 = (ulonglong)(uVar4 + 1);
              }
            }
          }
          piVar9 = (int *)((longlong)piVar9 + 1);
        } while (piVar9 != (int *)(ulonglong)param_2);
        uVar20 = (uint)uVar8;
        uVar4 = uVar11 | uVar13 | uVar20;
        auStack_658[0] = uVar20;
        auStack_450[0] = uVar13;
        auStack_248[0] = uVar11;
        if (uVar4 == 0) {
          puVar16 = (uint *)0x0;
          if (param_3 != 0) {
            if (-1 < (longlong)param_3) {
              uStack_690 = 0x7ff70c995d29;
              (*_DAT_7ff70cb95960)();
              return (uint *)0x0;
            }
            piVar9 = (int *)0x2726;
            puVar12 = &uStack_690;
            uStack_690 = (ulonglong)uVar4;
            func_0x7ff70d87ff1a();
            puVar16 = (uint *)0xffffffff;
            goto LAB_7ff70c995e93;
          }
        }
        else {
          uStack_690 = 0x7ff70c995d59;
          uStack_668 = FUN_7ff70c9e37c0(auStack_660,param_3);
          puVar15 = (uint *)0x0;
          puVar16 = auStack_658;
          if (uVar20 == 0) {
            puVar16 = puVar15;
          }
          puVar17 = auStack_450;
          if (uVar13 == 0) {
            puVar17 = puVar15;
          }
          puVar10 = auStack_248;
          if (uVar11 == 0) {
            puVar10 = puVar15;
          }
          piVar9 = (int *)0x0;
          uStack_690 = 0x7ff70c995d8f;
          uVar11 = func_0x7ff70d5b588e(0,puVar10,puVar17,puVar16);
          if (0 < (int)uVar11) {
            lVar7 = 0;
            do {
              *(undefined2 *)(param_1 + 10 + lVar7) = 0;
              if (*(longlong *)(param_1 + lVar7) != -1) {
                uStack_690 = 0x7ff70c995df4;
                iVar5 = FUN_7ff70cb12a20(*(longlong *)(param_1 + lVar7),auStack_248);
                if (iVar5 != 0) {
                  uVar3 = *(ushort *)(param_1 + 8 + lVar7);
                  if ((uVar3 & 0x100) != 0) {
                    pbVar1 = (byte *)(param_1 + 0xb + lVar7);
                    *pbVar1 = *pbVar1 | 1;
                  }
                  if ((uVar3 & 0x300) != 0) {
                    pbVar1 = (byte *)(param_1 + 0xb + lVar7);
                    *pbVar1 = *pbVar1 | 3;
                  }
                }
                uStack_690 = 0x7ff70c995e24;
                iVar5 = FUN_7ff70cb12a20(*(undefined8 *)(param_1 + lVar7),auStack_450);
                if ((iVar5 != 0) && ((*(byte *)(param_1 + 8 + lVar7) & 0x10) != 0)) {
                  pbVar1 = (byte *)(param_1 + 10 + lVar7);
                  *pbVar1 = *pbVar1 | 0x10;
                }
                uStack_690 = 0x7ff70c995e42;
                iVar5 = FUN_7ff70cb12a20(*(undefined8 *)(param_1 + lVar7),auStack_658);
                if (iVar5 == 0) {
                  uVar3 = *(ushort *)(param_1 + 10 + lVar7);
                }
                else {
                  uVar2 = *(ushort *)(param_1 + 8 + lVar7);
                  uVar6 = uVar2 & 0x200 | *(ushort *)(param_1 + 10 + lVar7);
                  uVar3 = 1;
                  if ((uVar2 & 0x400) == 0) {
                    uVar3 = uVar6;
                  }
                  if ((uVar2 & 0x600) != 0) {
                    *(ushort *)(param_1 + 10 + lVar7) = uVar2 & 0x400 | uVar6;
                  }
                }
                puVar15 = (uint *)(ulonglong)(((int)puVar15 + 1) - (uint)(uVar3 == 0));
              }
              lVar7 = lVar7 + 0x10;
            } while (lVar19 != lVar7);
            return puVar15;
          }
          puVar16 = (uint *)(ulonglong)uVar11;
        }
        if ((int)puVar16 != -1) {
          return puVar16;
        }
LAB_7ff70c995e93:
        *(undefined8 *)((longlong)puVar12 + -8) = 0x7ff70c995e98;
        iVar5 = func_0x7ff70d774fc7();
        *piVar9 = *piVar9 << 0x1f;
        return (uint *)(ulonglong)
                       (uint)-(int)CONCAT71((int7)((ulonglong)puVar16 >> 8),iVar5 != 0x2714);
      }
      lVar7 = lVar7 + 0x10;
    } while (lVar19 != lVar7);
  }
  if (param_3 != 0) {
    if ((longlong)param_3 < 0) {
      uStack_690 = 0x7ff70c995d41;
      func_0x7ff70d9a04cb(0x2726);
      in(0xbf);
                    /* WARNING: Bad instruction - Truncating control flow here */
      halt_baddata();
    }
    uVar8 = 0xfffffffe;
    if (param_3 < 0xfffffffe) {
      uVar8 = param_3;
    }
    uStack_690 = 0x7ff70c995ba3;
    (*_DAT_7ff70cb95960)(uVar8);
  }
  return (uint *)0x0;
}


