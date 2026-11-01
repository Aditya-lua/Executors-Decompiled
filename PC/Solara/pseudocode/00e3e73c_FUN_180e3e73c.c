/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

int FUN_180e3e73c(uint param_1,short *param_2,ulonglong param_3)

{
  short *psVar1;
  byte *pbVar2;
  char cVar3;
  char cVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  undefined4 *puVar8;
  ulonglong uVar9;
  short *psVar10;
  undefined8 uVar11;
  short *psVar12;
  short sVar13;
  ulonglong uVar14;
  longlong lVar15;
  uint uVar16;
  short *psVar17;
  uint auStackX_20 [2];
  undefined4 auStack_68 [2];
  undefined8 uStack_60;
  ulonglong uStack_58;
  ulonglong uStack_50;
  short *psStack_48;
  
  if (param_1 == 0xfffffffe) {
    puVar8 = (undefined4 *)FUN_180e1dafc();
    *puVar8 = 0;
    puVar8 = (undefined4 *)FUN_180e1db20();
    *puVar8 = 9;
    return -1;
  }
  psVar10 = (short *)0x0;
  iVar7 = 0;
  if ((-1 < (int)param_1) && (param_1 < _DAT_1810d4df0)) {
    uVar9 = (ulonglong)(param_1 & 0x3f);
    uStack_50 = 1;
    uStack_58 = (ulonglong)(longlong)(int)param_1 >> 6;
    lVar15 = *(longlong *)(uStack_58 * 8 + 0x1810d49f0);
    if ((*(byte *)(lVar15 + 0x38 + uVar9 * 0x48) & 1) != 0) {
      uVar16 = (uint)param_3;
      if (uVar16 < 0x80000000) {
        if ((uVar16 == 0) || ((*(byte *)(lVar15 + 0x38 + uVar9 * 0x48) & 2) != 0)) {
          return 0;
        }
        if (param_2 != (short *)0x0) {
          uStack_60 = *(undefined8 *)(lVar15 + 0x28 + uVar9 * 0x48);
          cVar3 = *(char *)(lVar15 + 0x39 + uVar9 * 0x48);
          if (cVar3 == '\x01') {
            if ((~(byte)param_3 & 1) == 0) goto LAB_180e3e836;
            uVar14 = param_3 >> 1 & 0x7fffffff;
            if ((uint)uVar14 < 4) {
              uVar14 = 4;
            }
            psVar10 = (short *)FUN_180e3fc60(uVar14);
            FUN_180e3b330(0);
            FUN_180e3b330(0);
            if (psVar10 != (short *)0x0) {
              uVar11 = FUN_180e3ee10(param_1,0,1);
              *(undefined8 *)(*(longlong *)(uStack_58 * 8 + 0x1810d49f0) + 0x30 + uVar9 * 0x48) =
                   uVar11;
              psStack_48 = psVar10;
              goto LAB_180e3e8d8;
            }
            puVar8 = (undefined4 *)FUN_180e1db20();
            *puVar8 = 0xc;
            puVar8 = (undefined4 *)FUN_180e1dafc();
            *puVar8 = 8;
          }
          else if ((cVar3 == '\x02') && ((~(byte)param_3 & 1) == 0)) {
LAB_180e3e836:
            puVar8 = (undefined4 *)FUN_180e1dafc();
            *puVar8 = 0;
            puVar8 = (undefined4 *)FUN_180e1db20();
            *puVar8 = 0x16;
            FUN_180e2c4e4();
          }
          else {
            uVar14 = param_3 & 0xffffffff;
            psStack_48 = param_2;
LAB_180e3e8d8:
            lVar15 = *(longlong *)(uStack_58 * 8 + 0x1810d49f0);
            psVar17 = psStack_48;
            if ((((*(byte *)(lVar15 + 0x38 + uVar9 * 0x48) & 0x48) != 0) &&
                (cVar4 = *(char *)(lVar15 + 0x3a + uVar9 * 0x48), cVar4 != '\n')) &&
               (iVar6 = (int)uVar14, iVar6 != 0)) {
              *(char *)psStack_48 = cVar4;
              uVar14 = (ulonglong)(iVar6 - 1U);
              psVar17 = (short *)((longlong)psStack_48 + 1);
              iVar7 = 1;
              *(undefined1 *)(*(longlong *)(uStack_58 * 8 + 0x1810d49f0) + 0x3a + uVar9 * 0x48) = 10
              ;
              if (((cVar3 != '\0') &&
                  (cVar4 = *(char *)(*(longlong *)(uStack_58 * 8 + 0x1810d49f0) + 0x3b +
                                    uVar9 * 0x48), cVar4 != '\n')) && (iVar6 - 1U != 0)) {
                *(char *)psVar17 = cVar4;
                psVar17 = psStack_48 + 1;
                uVar14 = (ulonglong)(iVar6 - 2U);
                *(undefined1 *)(*(longlong *)(uStack_58 * 8 + 0x1810d49f0) + 0x3b + uVar9 * 0x48) =
                     10;
                iVar7 = 2;
                if (((cVar3 == '\x01') &&
                    (cVar4 = *(char *)(*(longlong *)(uStack_58 * 8 + 0x1810d49f0) + 0x3c +
                                      uVar9 * 0x48), cVar4 != '\n')) && (iVar7 = 2, iVar6 - 2U != 0)
                   ) {
                  *(char *)psVar17 = cVar4;
                  iVar7 = 3;
                  psVar17 = (short *)((longlong)psStack_48 + 3);
                  uVar14 = (ulonglong)(iVar6 - 3);
                  *(undefined1 *)(*(longlong *)(uStack_58 * 8 + 0x1810d49f0) + 0x3c + uVar9 * 0x48)
                       = 10;
                }
              }
            }
            auStack_68[0] = 0;
            iVar6 = FUN_180e4d64c(param_1);
            if (((iVar6 == 0) ||
                (-1 < *(char *)(*(longlong *)(uStack_58 * 8 + 0x1810d49f0) + 0x38 + uVar9 * 0x48)))
               || (iVar6 = GetConsoleMode(uStack_60,auStack_68), iVar6 == 0)) {
              uStack_50 = uStack_50 & 0xffffffffffffff00;
LAB_180e3ea0e:
              auStackX_20[0] = 0;
              iVar6 = ReadFile(uStack_60,psVar17,uVar14,auStackX_20,0);
              if ((iVar6 != 0) && (uVar5 = auStackX_20[0], auStackX_20[0] <= uVar16)) {
LAB_180e3ea50:
                iVar7 = iVar7 + uVar5;
                if (*(char *)(*(longlong *)(uStack_58 * 8 + 0x1810d49f0) + 0x38 + uVar9 * 0x48) <
                    '\0') {
                  if (cVar3 == '\x02') {
                    if ((char)uStack_50 == '\0') {
                      iVar7 = FUN_180e3e0f0(param_1,psStack_48);
                    }
                    else {
                      psVar1 = (short *)((longlong)psStack_48 +
                                        ((longlong)iVar7 & 0xfffffffffffffffeU));
                      psVar17 = psStack_48;
                      for (psVar12 = psStack_48; psVar12 < psVar1;
                          psVar12 = (short *)((longlong)psVar12 + lVar15)) {
                        sVar13 = *psVar12;
                        if (sVar13 == 0x1a) {
                          pbVar2 = (byte *)(*(longlong *)(uStack_58 * 8 + 0x1810d49f0) + 0x38 +
                                           uVar9 * 0x48);
                          *pbVar2 = *pbVar2 | 2;
                          break;
                        }
                        if (((sVar13 == 0xd) && (psVar12 + 1 < psVar1)) && (psVar12[1] == 10)) {
                          sVar13 = 10;
                          lVar15 = 4;
                        }
                        else {
                          lVar15 = 2;
                        }
                        *psVar17 = sVar13;
                        psVar17 = psVar17 + 1;
                      }
                      iVar7 = (int)((longlong)psVar17 - (longlong)psStack_48 >> 1) * 2;
                    }
                  }
                  else {
                    iVar7 = FUN_180e3e2ec(param_1,psVar17,(longlong)iVar7,param_2,
                                          (param_3 & 0xffffffff) >> 1);
                  }
                }
                goto LAB_180e3e9ee;
              }
              iVar7 = GetLastError();
              if (iVar7 != 5) {
                if (iVar7 == 0x6d) {
                  iVar7 = 0;
                  goto LAB_180e3e9ee;
                }
                goto LAB_180e3e9e4;
              }
              puVar8 = (undefined4 *)FUN_180e1db20();
              *puVar8 = 9;
              puVar8 = (undefined4 *)FUN_180e1dafc();
              *puVar8 = 5;
            }
            else {
              if (cVar3 != '\x02') goto LAB_180e3ea0e;
              auStackX_20[0] = 0;
              iVar6 = ReadConsoleW(uStack_60,psVar17,uVar14 >> 1,auStackX_20,0);
              if (iVar6 != 0) {
                uVar5 = auStackX_20[0] * 2;
                goto LAB_180e3ea50;
              }
              iVar7 = GetLastError();
LAB_180e3e9e4:
              FUN_180e1dab0(iVar7);
            }
          }
          iVar7 = -1;
LAB_180e3e9ee:
          FUN_180e3b330(psVar10);
          return iVar7;
        }
      }
      puVar8 = (undefined4 *)FUN_180e1dafc();
      *puVar8 = 0;
      puVar8 = (undefined4 *)FUN_180e1db20();
      *puVar8 = 0x16;
      goto LAB_180e3eb7b;
    }
  }
  puVar8 = (undefined4 *)FUN_180e1dafc();
  *puVar8 = 0;
  puVar8 = (undefined4 *)FUN_180e1db20();
  *puVar8 = 9;
LAB_180e3eb7b:
  FUN_180e2c4e4();
  return -1;
}


