/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_180e3d024(undefined8 *param_1,uint param_2,byte *param_3,ulonglong param_4,
                  undefined1 *param_5)

{
  char cVar1;
  byte bVar2;
  char cVar3;
  int iVar4;
  undefined4 uVar5;
  ulonglong uVar6;
  char *pcVar7;
  ulonglong uVar8;
  uint uVar9;
  uint uVar10;
  undefined1 *puVar11;
  byte *pbVar12;
  ulonglong uVar13;
  longlong lVar14;
  undefined8 uVar15;
  longlong lVar16;
  int iVar17;
  longlong lVar18;
  ulonglong uVar19;
  undefined1 auStack_108 [32];
  undefined1 *puStack_e8;
  undefined4 uStack_e0;
  undefined8 uStack_d8;
  undefined8 uStack_d0;
  undefined2 auStack_c8 [2];
  undefined4 uStack_c4;
  uint auStack_c0 [2];
  byte *pbStack_b8;
  undefined1 *puStack_b0;
  undefined8 uStack_a8;
  undefined4 uStack_a0;
  int iStack_9c;
  byte *pbStack_98;
  longlong lStack_90;
  undefined8 uStack_88;
  undefined1 *puStack_80;
  byte *pbStack_78;
  undefined8 uStack_70;
  longlong lStack_68;
  undefined8 uStack_60;
  undefined1 auStack_58 [8];
  byte bStack_50;
  byte bStack_4f;
  undefined1 auStack_48 [8];
  ulonglong uStack_40;
  
  uStack_60 = 0xfffffffffffffffe;
  uStack_40 = _DAT_1810c1700 ^ (ulonglong)auStack_108;
  puStack_b0 = param_5;
  lVar18 = (longlong)(int)param_2 >> 6;
  uVar6 = (ulonglong)(param_2 & 0x3f);
  uStack_70 = *(undefined8 *)(*(longlong *)(lVar18 * 8 + 0x1810d49f0) + 0x28 + uVar6 * 0x48);
  pbStack_b8 = param_3 + (param_4 & 0xffffffff);
  pbStack_98 = param_3;
  lStack_90 = lVar18;
  uStack_a0 = GetConsoleOutputCP();
  uVar13 = 0;
  if (puStack_b0[0x28] == '\0') {
    FUN_180e23dd0(puStack_b0);
  }
  iStack_9c = *(int *)(*(longlong *)(puStack_b0 + 0x18) + 0xc);
  *param_1 = 0;
  *(undefined4 *)(param_1 + 1) = 0;
  uVar8 = uVar13;
  lVar14 = lVar18;
  if (pbStack_98 < param_3 + (param_4 & 0xffffffff)) {
    do {
      lStack_68 = lVar14;
      auStack_c8[0] = CONCAT11(auStack_c8[0]._1_1_,*param_3);
      uStack_c4 = 0;
      cVar3 = '\x01';
      if (iStack_9c == 0xfde9) {
        pcVar7 = (char *)(uVar6 * 0x48 + 0x3e + *(longlong *)(lStack_68 * 8 + 0x1810d49f0));
        uVar8 = uVar13;
        uVar19 = uVar13;
        do {
          uVar9 = (uint)uVar8;
          if (*pcVar7 == '\0') break;
          uVar9 = uVar9 + 1;
          uVar8 = (ulonglong)uVar9;
          uVar19 = uVar19 + 1;
          pcVar7 = pcVar7 + 1;
        } while ((longlong)uVar19 < 5);
        if ((longlong)uVar19 < 1) {
          cVar1 = *(char *)((ulonglong)*param_3 + 0x1810c1ce0);
          iVar4 = cVar1 + 1;
          lVar18 = (longlong)pbStack_b8 - (longlong)param_3;
          if (lVar18 < iVar4) {
            uVar8 = uVar13;
            if (0 < lVar18) {
              do {
                *(byte *)(uVar8 + uVar6 * 0x48 + 0x3e + *(longlong *)(lStack_90 * 8 + 0x1810d49f0))
                     = param_3[uVar8];
                uVar9 = (int)uVar13 + 1;
                uVar13 = (ulonglong)uVar9;
                uVar8 = uVar8 + 1;
              } while ((int)uVar9 < lVar18);
            }
            *(int *)((longlong)param_1 + 4) = *(int *)((longlong)param_1 + 4) + (int)lVar18;
            break;
          }
          uStack_a8 = 0;
          cVar3 = (iVar4 == 4) + '\x01';
          puStack_e8 = puStack_b0;
          pbStack_78 = param_3;
          lVar18 = FUN_180e414ac(&uStack_c4,&pbStack_78,cVar3,&uStack_a8);
          if (lVar18 == -1) break;
          pbVar12 = param_3 + cVar1;
          lVar18 = lStack_90;
        }
        else {
          iVar17 = *(char *)((ulonglong)
                             *(byte *)(*(longlong *)(lVar18 * 8 + 0x1810d49f0) + 0x3e + uVar6 * 0x48
                                      ) + 0x1810c1ce0) + 1;
          iVar4 = iVar17 - uVar9;
          uStack_a8 = CONCAT44(uStack_a8._4_4_,iVar4);
          lVar14 = (longlong)pbStack_b8 - (longlong)param_3;
          lVar16 = (longlong)iVar4;
          if (lVar14 < lVar16) {
            if (0 < lVar14) {
              uVar8 = uVar19;
              do {
                *(byte *)(uVar8 + uVar6 * 0x48 + 0x3e + *(longlong *)(lVar18 * 8 + 0x1810d49f0)) =
                     param_3[uVar8 - uVar19];
                uVar9 = (int)uVar13 + 1;
                uVar13 = (ulonglong)uVar9;
                uVar8 = uVar8 + 1;
              } while ((int)uVar9 < lVar14);
            }
            *(int *)((longlong)param_1 + 4) = *(int *)((longlong)param_1 + 4) + (int)lVar14;
            break;
          }
          puVar11 = (undefined1 *)(uVar6 * 0x48 + 0x3e + *(longlong *)(lStack_68 * 8 + 0x1810d49f0))
          ;
          uVar8 = uVar13;
          do {
            auStack_58[uVar8] = *puVar11;
            uVar8 = uVar8 + 1;
            puVar11 = puVar11 + 1;
          } while ((longlong)uVar8 < (longlong)uVar19);
          uVar8 = uVar13;
          if (0 < lVar16) {
            FUN_180f29110(auStack_58 + uVar19,param_3,lVar16);
          }
          do {
            *(undefined1 *)(uVar8 + uVar6 * 0x48 + 0x3e + *(longlong *)(lVar18 * 8 + 0x1810d49f0)) =
                 0;
            uVar8 = uVar8 + 1;
          } while ((longlong)uVar8 < (longlong)uVar19);
          uStack_88 = 0;
          puStack_80 = auStack_58;
          cVar3 = (iVar17 == 4) + '\x01';
          puStack_e8 = puStack_b0;
          lVar14 = FUN_180e414ac(&uStack_c4,&puStack_80,cVar3,&uStack_88);
          if (lVar14 == -1) break;
          pbVar12 = param_3 + ((int)uStack_a8 + -1);
        }
      }
      else {
        lVar14 = *(longlong *)(lVar18 * 8 + 0x1810d49f0);
        bVar2 = *(byte *)(lVar14 + 0x3d + uVar6 * 0x48);
        if ((bVar2 & 4) == 0) {
          if (*(short *)(**(longlong **)(puStack_b0 + 0x18) + (ulonglong)*param_3 * 2) < 0) {
            pbVar12 = param_3 + 1;
            if (pbVar12 < pbStack_b8) {
              iVar4 = FUN_180e40fac(&uStack_c4,param_3,2,puStack_b0);
              if (iVar4 != -1) goto LAB_180e3d32c;
            }
            else {
              *(byte *)(lVar14 + 0x3e + uVar6 * 0x48) = *param_3;
              pbVar12 = (byte *)(*(longlong *)(lVar18 * 8 + 0x1810d49f0) + 0x3d + uVar6 * 0x48);
              *pbVar12 = *pbVar12 | 4;
              *(int *)((longlong)param_1 + 4) = (int)uVar8 + 1;
            }
            break;
          }
          uVar15 = 1;
          pbVar12 = param_3;
        }
        else {
          bStack_50 = *(byte *)(lVar14 + 0x3e + uVar6 * 0x48);
          bStack_4f = *param_3;
          *(byte *)(lVar14 + 0x3d + uVar6 * 0x48) = bVar2 & 0xfb;
          uVar15 = 2;
          pbVar12 = &bStack_50;
        }
        iVar4 = FUN_180e40fac(&uStack_c4,pbVar12,uVar15,puStack_b0);
        pbVar12 = param_3;
        if (iVar4 == -1) break;
      }
LAB_180e3d32c:
      param_3 = pbVar12 + 1;
      uStack_d0 = 0;
      uStack_d8 = 0;
      uStack_e0 = 5;
      puStack_e8 = auStack_48;
      uVar9 = FUN_180e3fd50(uStack_a0,0,&uStack_c4,cVar3);
      uVar15 = uStack_70;
      if (uVar9 == 0) break;
      auStack_c0[0] = 0;
      puStack_e8 = (undefined1 *)0x0;
      iVar4 = WriteFile(uStack_70,auStack_48,uVar9,auStack_c0);
      if (iVar4 == 0) {
LAB_180e3d485:
        uVar5 = GetLastError();
        *(undefined4 *)param_1 = uVar5;
        break;
      }
      uVar10 = (*(int *)(param_1 + 1) - (int)pbStack_98) + (int)param_3;
      *(uint *)((longlong)param_1 + 4) = uVar10;
      if (auStack_c0[0] < uVar9) break;
      if ((char)auStack_c8[0] == '\n') {
        auStack_c8[0] = 0xd;
        puStack_e8 = (undefined1 *)0x0;
        iVar4 = WriteFile(uVar15,auStack_c8,1,auStack_c0);
        if (iVar4 == 0) goto LAB_180e3d485;
        if (auStack_c0[0] == 0) break;
        *(int *)(param_1 + 1) = *(int *)(param_1 + 1) + 1;
        *(int *)((longlong)param_1 + 4) = *(int *)((longlong)param_1 + 4) + 1;
        uVar10 = *(uint *)((longlong)param_1 + 4);
      }
      uVar8 = (ulonglong)uVar10;
      lVar14 = lStack_68;
    } while (param_3 < pbStack_b8);
  }
  FUN_180e155e0(uStack_40 ^ (ulonglong)auStack_108);
  return;
}


