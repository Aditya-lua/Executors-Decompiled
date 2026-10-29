/* 7ff70c94bc30 FUN_7ff70c94bc30 */

/* WARNING: Control flow encountered bad instruction data */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8
FUN_7ff70c94bc30(int *param_1,longlong param_2,uint param_3,uint param_4,undefined8 param_5,
                undefined8 param_6,byte param_7)

{
  ulonglong uVar1;
  code *pcVar2;
  code *pcVar3;
  uint uVar4;
  int iVar5;
  int iVar6;
  int iVar7;
  ulonglong uVar8;
  longlong lVar9;
  undefined8 uVar10;
  char *pcVar11;
  undefined8 uVar12;
  undefined2 uVar13;
  ushort uVar14;
  ushort uVar15;
  longlong lVar16;
  int *piVar17;
  longlong lVar18;
  undefined1 *puVar19;
  undefined1 *puVar20;
  undefined4 uVar21;
  ulonglong uVar22;
  undefined4 *puVar23;
  uint uVar24;
  undefined4 *puVar25;
  longlong *plVar26;
  bool bVar27;
  byte abStack_1f4 [19];
  byte abStack_1e1 [25];
  undefined1 auStack_1c8 [56];
  undefined4 *puStack_190;
  int *piStack_180;
  undefined4 uStack_178;
  undefined4 uStack_174;
  int iStack_170;
  undefined4 uStack_16c;
  uint uStack_15c;
  longlong lStack_158;
  longlong lStack_150;
  longlong lStack_148;
  longlong lStack_140;
  longlong lStack_138;
  undefined4 uStack_12c;
  undefined8 uStack_128;
  undefined8 uStack_120;
  ulonglong uStack_f0;
  undefined4 uStack_e8;
  undefined4 uStack_e4;
  int iStack_e0;
  undefined4 uStack_dc;
  
  if (param_1 == (int *)0x0) {
    return 1;
  }
  if (*param_1 != 0xbab1e) {
    return 1;
  }
  if (*(char *)((longlong)param_1 + 0x1b3) != '\0') {
    return 8;
  }
  if ((int)param_4 < 0) {
    return 10;
  }
  piStack_180 = param_1;
  lVar9 = *(longlong *)(param_1 + 2);
  uVar22 = 0;
  puVar23 = (undefined4 *)0x0;
  if (lVar9 != 0) {
    puVar23 = (undefined4 *)0x0;
    do {
      uVar8 = FUN_7ff70c94bb80(lVar9,&lStack_158);
      if (((uVar8 & 0x10001) != 0) && (lStack_158 != -1)) {
        iVar6 = (int)puVar23;
        puVar23 = (undefined4 *)(ulonglong)(iVar6 + 1);
        if ((((uVar8 & 0x20002) != 0) &&
            (((lStack_150 != -1 &&
              (puVar23 = (undefined4 *)(ulonglong)(iVar6 + 2), (uVar8 & 0x40004) != 0)) &&
             (lStack_148 != -1)))) &&
           ((puVar23 = (undefined4 *)(ulonglong)(iVar6 + 3), (uVar8 & 0x80008) != 0 &&
            (lStack_140 != -1)))) {
          puVar23 = (undefined4 *)
                    (ulonglong)(iVar6 + ((lStack_138 == -1 || (uVar8 & 0x100010) == 0) ^ 5));
        }
      }
      lVar9 = *(longlong *)(lVar9 + 0x10);
    } while (lVar9 != 0);
  }
  piVar17 = piStack_180;
  if ((char)piStack_180[0x6d] == '\0') {
    if (*(longlong *)(piStack_180 + 0x34) != 0) {
      FUN_7ff70c958630(&uStack_e8);
      uStack_128 = 0;
      uStack_120 = 0;
      lVar9 = FUN_7ff70c992fc0(&uStack_128,*(undefined8 *)(piVar17 + 0x34));
      *(longlong *)(piVar17 + 0x34) = lVar9;
      uVar22 = 0;
      if ((*(longlong *)(lVar9 + 0x20) < CONCAT44(uStack_e4,uStack_e8)) ||
         ((*(longlong *)(lVar9 + 0x20) <= CONCAT44(uStack_e4,uStack_e8) &&
          (*(int *)(lVar9 + 0x28) <= iStack_e0)))) goto LAB_7ff70c94bde9;
      uStack_128 = *(undefined8 *)(lVar9 + 0x20);
      uStack_120 = *(undefined8 *)(lVar9 + 0x28);
      uStack_178 = uStack_e8;
      uStack_174 = uStack_e4;
      iStack_170 = iStack_e0;
      uStack_16c = uStack_dc;
      uVar4 = FUN_7ff70c958730(&uStack_128,&uStack_178);
      if (uVar4 < param_4) {
        param_4 = uVar4;
      }
    }
    uVar22 = (ulonglong)param_4;
  }
LAB_7ff70c94bde9:
  uVar4 = param_7 + param_3 + (int)puVar23;
  if (uVar4 < 0xb) {
    puStack_190 = &uStack_e8;
  }
  else {
    puStack_190 = (undefined4 *)(*_DAT_7ff70cbebad0)((ulonglong)uVar4 << 4);
    if (puStack_190 == (undefined4 *)0x0) {
      return 3;
    }
  }
  uStack_f0 = (ulonglong)param_3;
  uStack_15c = uVar4;
  uStack_12c = (int)uVar22;
  uVar8 = 0;
  puVar20 = auStack_1c8;
  if (((int)puVar23 != 0) && (lVar9 = *(longlong *)(piVar17 + 2), puVar20 = auStack_1c8, lVar9 != 0)
     ) {
    uVar8 = 0;
    plVar26 = &lStack_158;
    puVar20 = auStack_1c8;
    puVar25 = puVar23;
    do {
      *(undefined8 *)(puVar20 + -8) = 0x7ff70c94be8b;
      uVar4 = FUN_7ff70c94bb80(lVar9,plVar26);
      puVar23 = puVar25;
      if ((uVar4 & 0x10001) != 0) {
        uVar22 = (ulonglong)uVar4;
        if (*(longlong *)(puVar20 + 0x70) != -1) {
          iVar6 = (int)uVar8;
          lVar18 = uVar8 * 0x10;
          uVar13 = (undefined2)(uVar4 & 1);
          if ((uVar4 & 1) != 0) {
            uVar13 = 0x300;
          }
          lVar16 = *(longlong *)(puVar20 + 0x38);
          *(longlong *)(lVar16 + lVar18) = *(longlong *)(puVar20 + 0x70);
          uVar24 = -(uVar4 & 1) & 0x29;
          *(undefined2 *)(lVar16 + 8 + lVar18) = uVar13;
          if ((uVar4 & 0x10000) != 0) {
            uVar12 = *(undefined8 *)(puVar20 + 0x70);
            *(undefined4 *)(puVar20 + 0x50) = 4;
            *(undefined1 **)(puVar20 + 0x20) = puVar20 + 0x50;
            *(undefined4 **)(puVar20 + -8) = puVar25;
            *(undefined8 *)(puVar20 + -0x10) = 0x7ff70c94bf03;
            uVar10 = func_0x7ff70d96aa3f(uVar12,0xffff,0x1008,puVar20 + 0xa0);
            puVar19 = puVar20 + -8;
            if (((int)uVar10 == 0) && (puVar19 = puVar20 + -8, *(int *)(puVar20 + 0x98) == 1)) {
              puVar19 = puVar20 + -0x10;
              *(undefined8 *)(puVar20 + -0x10) = uVar10;
              *(undefined8 *)(puVar20 + -0x18) = 0x7ff70c94bf22;
              func_0x7ff70d732265(uVar12,0,0,0);
            }
            uVar24 = uVar24 | 0x32;
            *(byte *)(lVar18 + *(longlong *)(puVar19 + 0x38) + 8) =
                 *(byte *)(lVar18 + *(longlong *)(puVar19 + 0x38) + 8) | 0x10;
            plVar26 = (longlong *)(puVar19 + 0x70);
            puVar20 = puVar19;
          }
          piVar17 = *(int **)(puVar20 + 0x48);
          uVar12 = *(undefined8 *)(piVar17 + 0x6a);
          *(undefined8 *)(puVar20 + -8) = 0x7ff70c94bf4d;
          iVar5 = (*_DAT_7ff70cb96068)(*(undefined8 *)(puVar20 + 0x70),uVar12,uVar24);
          if (iVar5 != 0) goto LAB_7ff70c94c474;
          uVar24 = iVar6 + 1;
          if (((uVar4 & 0x20002) != 0) && (*(longlong *)(puVar20 + 0x78) != -1)) {
            lVar18 = (ulonglong)uVar24 * 0x10;
            uVar15 = (ushort)uVar4;
            uVar14 = uVar15 & 2;
            if ((uVar4 & 2) != 0) {
              uVar14 = 0x300;
            }
            lVar16 = *(longlong *)(puVar20 + 0x38);
            *(longlong *)(lVar16 + lVar18) = *(longlong *)(puVar20 + 0x78);
            uVar24 = (int)(uVar4 << 0x1e) >> 0x1f & 0x29;
            *(ushort *)(lVar16 + 8 + lVar18) = uVar14;
            if ((uVar4 & 0x20000) != 0) {
              uVar12 = *(undefined8 *)(puVar20 + 0x78);
              *(undefined4 *)(puVar20 + 0x50) = 4;
              *(undefined1 **)(puVar20 + 0x20) = puVar20 + 0x50;
              iVar5 = 0x1008;
              *(undefined8 *)(puVar20 + -8) = 0x7ff70c94bfda;
              func_0x7ff70d6b683d(uVar12,0xffff,0x1008,puVar20 + 0xa0);
              if ((iVar5 == 0) && (*(int *)(puVar20 + 0xa0) == 1)) {
                *(undefined **)(puVar20 + -8) = &UNK_7ff70c94bff9;
                func_0x7ff70d669ebc(uVar12,0,0,0);
                    /* WARNING: Bad instruction - Truncating control flow here */
                halt_baddata();
              }
              uVar24 = uVar24 | 0x32;
              *(byte *)(lVar18 + *(longlong *)(puVar20 + 0x38) + 8) =
                   *(byte *)(lVar18 + *(longlong *)(puVar20 + 0x38) + 8) | 0x10;
              plVar26 = (longlong *)(puVar20 + 0x70);
            }
            piVar17 = *(int **)(puVar20 + 0x48);
            uVar12 = *(undefined8 *)(piVar17 + 0x6a);
            *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c025;
            iVar5 = (*_DAT_7ff70cb96068)(*(undefined8 *)(puVar20 + 0x78),uVar12,uVar24);
            if (iVar5 != 0) goto LAB_7ff70c94c474;
            uVar24 = iVar6 + 2;
            if (((uVar4 & 0x40004) != 0) && (*(longlong *)(puVar20 + 0x80) != -1)) {
              lVar18 = (ulonglong)uVar24 * 0x10;
              uVar14 = uVar15 & 4;
              if ((uVar4 & 4) != 0) {
                uVar14 = 0x300;
              }
              lVar16 = *(longlong *)(puVar20 + 0x38);
              *(longlong *)(lVar16 + lVar18) = *(longlong *)(puVar20 + 0x80);
              uVar24 = (int)(uVar4 << 0x1d) >> 0x1f & 0x29;
              *(ushort *)(lVar16 + 8 + lVar18) = uVar14;
              if ((uVar4 & 0x40000) != 0) {
                uVar12 = *(undefined8 *)(puVar20 + 0x80);
                *(undefined4 *)(puVar20 + 0x50) = 4;
                *(undefined1 **)(puVar20 + 0x20) = puVar20 + 0x50;
                *(undefined8 *)(puVar20 + -8) = uVar12;
                *(undefined8 *)(puVar20 + -0x10) = 0x7ff70c94c0b9;
                iVar5 = func_0x7ff70d8fa94f(uVar12,0xffff,0x1008,puVar20 + 0xa0);
                if ((iVar5 == 0) && (*(int *)(puVar20 + 0x98) == 1)) {
                  *(undefined **)(puVar20 + -0x10) = &UNK_7ff70c94c0d7;
                  func_0x7ff70d814045(uVar12,0,0,0);
                    /* WARNING: Bad instruction - Truncating control flow here */
                  halt_baddata();
                }
                uVar24 = uVar24 | 0x32;
                *(byte *)(lVar18 + *(longlong *)(puVar20 + 0x30) + 8) =
                     *(byte *)(lVar18 + *(longlong *)(puVar20 + 0x30) + 8) | 0x10;
                plVar26 = (longlong *)(puVar20 + 0x68);
                puVar20 = puVar20 + -8;
              }
              piVar17 = *(int **)(puVar20 + 0x48);
              uVar12 = *(undefined8 *)(piVar17 + 0x6a);
              *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c106;
              iVar5 = (*_DAT_7ff70cb96068)(*(undefined8 *)(puVar20 + 0x80),uVar12,uVar24);
              if (iVar5 != 0) goto LAB_7ff70c94c474;
              uVar24 = iVar6 + 3;
              if (((uVar4 & 0x80008) != 0) && (*(longlong *)(puVar20 + 0x88) != -1)) {
                lVar18 = (ulonglong)uVar24 * 0x10;
                uVar14 = uVar15 & 8;
                if ((uVar4 & 8) != 0) {
                  uVar14 = 0x300;
                }
                lVar16 = *(longlong *)(puVar20 + 0x38);
                *(longlong *)(lVar16 + lVar18) = *(longlong *)(puVar20 + 0x88);
                uVar24 = (int)(uVar4 << 0x1c) >> 0x1f & 0x29;
                *(ushort *)(lVar16 + 8 + lVar18) = uVar14;
                if ((uVar4 & 0x80000) != 0) {
                  uVar12 = *(undefined8 *)(puVar20 + 0x88);
                  *(undefined4 *)(puVar20 + 0x50) = 4;
                  *(undefined1 **)(puVar20 + 0x20) = puVar20 + 0x50;
                  *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c199;
                  pcVar11 = (char *)func_0x7ff70d83f423(uVar12,0xffff,0x1008,puVar20 + 0xa0);
                  *(undefined4 *)(uVar22 - 0x7ce48a40) = 0xa024bc;
                  *pcVar11 = *pcVar11 + (char)pcVar11;
                  *(int *)(uVar22 + 0x11) = *(int *)(uVar22 + 0x11) + (int)puVar25;
                  uVar13 = 0;
                  *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c1b8;
                  func_0x7ff70da8b560(uVar12,0,0,0);
                  puVar23 = puVar25 + 1;
                  out(*puVar25,uVar13);
                  uVar24 = uVar24 | 0x32;
                  *(byte *)(lVar18 + *(longlong *)(puVar20 + 0x38) + 8) =
                       *(byte *)(lVar18 + *(longlong *)(puVar20 + 0x38) + 8) | 0x10;
                  plVar26 = (longlong *)(puVar20 + 0x70);
                }
                piVar17 = *(int **)(puVar20 + 0x48);
                uVar12 = *(undefined8 *)(piVar17 + 0x6a);
                *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c1e7;
                iVar5 = (*_DAT_7ff70cb96068)(*(undefined8 *)(puVar20 + 0x88),uVar12,uVar24);
                if (iVar5 != 0) goto LAB_7ff70c94c474;
                uVar24 = iVar6 + 4;
                if (((uVar4 & 0x100010) != 0) && (*(longlong *)(puVar20 + 0x90) != -1)) {
                  lVar18 = (ulonglong)uVar24 * 0x10;
                  uVar15 = uVar15 & 0x10;
                  if ((uVar4 & 0x10) != 0) {
                    uVar15 = 0x300;
                  }
                  lVar16 = *(longlong *)(puVar20 + 0x38);
                  *(longlong *)(lVar16 + lVar18) = *(longlong *)(puVar20 + 0x90);
                  uVar24 = (int)(uVar4 << 0x1b) >> 0x1f & 0x29;
                  *(ushort *)(lVar16 + 8 + lVar18) = uVar15;
                  if ((uVar4 & 0x100000) != 0) {
                    uVar12 = *(undefined8 *)(puVar20 + 0x90);
                    *(undefined4 *)(puVar20 + 0x50) = 4;
                    *(undefined1 **)(puVar20 + 0x20) = puVar20 + 0x50;
                    *(undefined4 **)(puVar20 + -8) = puVar23;
                    *(undefined8 *)(puVar20 + -0x10) = 0x7ff70c94c27b;
                    iVar5 = func_0x7ff70d5c4028(uVar12,0xffff,0x1008,puVar20 + 0xa0);
                    if ((iVar5 == 0) && (*(int *)(puVar20 + 0x98) == 1)) {
                      *(undefined **)(puVar20 + -0x10) = &UNK_7ff70c94c299;
                      func_0x7ff70d9c0f94(uVar12,0,0,0);
                    /* WARNING: Bad instruction - Truncating control flow here */
                      halt_baddata();
                    }
                    uVar24 = uVar24 | 0x32;
                    *(byte *)(lVar18 + *(longlong *)(puVar20 + 0x30) + 8) =
                         *(byte *)(lVar18 + *(longlong *)(puVar20 + 0x30) + 8) | 0x10;
                    plVar26 = (longlong *)(puVar20 + 0x68);
                    puVar20 = puVar20 + -8;
                  }
                  piVar17 = *(int **)(puVar20 + 0x48);
                  uVar12 = *(undefined8 *)(piVar17 + 0x6a);
                  *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c2c8;
                  iVar5 = (*_DAT_7ff70cb96068)(*(undefined8 *)(puVar20 + 0x90),uVar12,uVar24);
                  if (iVar5 == 0) {
                    uVar8 = (ulonglong)(iVar6 + 5);
                    goto LAB_7ff70c94be73;
                  }
                  goto LAB_7ff70c94c474;
                }
              }
            }
          }
          uVar8 = (ulonglong)uVar24;
        }
      }
LAB_7ff70c94be73:
      lVar9 = *(longlong *)(lVar9 + 0x10);
      puVar25 = puVar23;
    } while (lVar9 != 0);
  }
  uVar4 = (uint)uVar8;
  uVar1 = *(ulonglong *)(puVar20 + 0xd8);
  if ((int)uVar1 != 0) {
    lVar9 = 0;
    do {
      uVar15 = *(ushort *)(param_2 + 8 + lVar9);
      uVar4 = uVar15 & 1;
      if ((uVar15 & 1) != 0) {
        uVar4 = 0x29;
      }
      uVar4 = uVar4 + (uVar15 & 2) * 2;
      uVar22 = (ulonglong)uVar4;
      if ((uVar15 & 4) != 0) {
        uVar12 = *(undefined8 *)(param_2 + lVar9);
        *(undefined4 *)(puVar20 + 0x50) = 4;
        *(undefined1 **)(puVar20 + 0x20) = puVar20 + 0x50;
        *(undefined **)(puVar20 + -8) = &UNK_7ff70c94c35c;
        func_0x7ff70d5e2d95(uVar12,0xffff,0x1008,puVar20 + 0xa0);
                    /* WARNING: Bad instruction - Truncating control flow here */
        halt_baddata();
      }
      uVar12 = *(undefined8 *)(piVar17 + 0x6a);
      uVar10 = *(undefined8 *)(param_2 + lVar9);
      *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c399;
      iVar6 = (*_DAT_7ff70cb96068)(uVar10,uVar12,uVar4);
      if (iVar6 != 0) {
LAB_7ff70c94c474:
        if (10 < *(uint *)(puVar20 + 0x6c)) {
          *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c48f;
          (*_DAT_7ff70cbebad8)(*(undefined8 *)(puVar20 + 0x38));
          return 4;
        }
        return 4;
      }
      lVar16 = uVar8 * 0x10;
      lVar18 = *(longlong *)(puVar20 + 0x38);
      *(undefined8 *)(lVar18 + lVar16) = *(undefined8 *)(param_2 + lVar9);
      *(undefined2 *)(lVar18 + 8 + lVar16) = 0;
      uVar14 = -(*(ushort *)(param_2 + 8 + lVar9) & 1) & 0x300;
      *(ushort *)(lVar18 + 8 + lVar16) = uVar14;
      uVar15 = *(ushort *)(param_2 + 8 + lVar9);
      if ((uVar15 & 2) != 0) {
        uVar14 = uVar14 | 0x400;
        *(ushort *)(lVar18 + lVar16 + 8) = uVar14;
        uVar15 = *(ushort *)(param_2 + 8 + lVar9);
      }
      if ((uVar15 & 4) != 0) {
        *(ushort *)(lVar18 + lVar16 + 8) = uVar14 | 0x10;
      }
      uVar4 = (int)uVar8 + 1;
      uVar8 = (ulonglong)uVar4;
      lVar9 = lVar9 + 0x10;
    } while ((uVar1 & 0xffffffff) << 4 != lVar9);
  }
  puVar25 = *(undefined4 **)(puVar20 + 0x1f0);
  if (puVar20[0x200] == '\0') {
    uVar22 = 0;
    uVar21 = 0;
    if (uVar4 == 0) goto LAB_7ff70c94c7f3;
  }
  uVar21 = *(undefined4 *)(puVar20 + 0x9c);
  uVar8 = *(ulonglong *)(puVar20 + 0xd8);
  if (uVar4 == 0) {
LAB_7ff70c94c499:
    *(undefined4 *)(puVar20 + 0x20) = 0;
    *(undefined4 *)(puVar20 + 0x40) = 0;
    *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c4c0;
    uVar12 = func_0x7ff70d9da4a2(1,piVar17 + 0x6a,0,uVar21);
    *(int *)(puVar20 + 0x34) = (int)CONCAT71((int7)((ulonglong)uVar12 >> 8),1);
  }
  else {
    *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c45c;
    iVar6 = FUN_7ff70c995b40(*(undefined8 *)(puVar20 + 0x38),uVar4,0);
    *(int *)(puVar20 + 0x40) = iVar6;
    if (iVar6 < 0) {
      return 0xc;
    }
    if (iVar6 == 0) goto LAB_7ff70c94c499;
    *(undefined4 *)(puVar20 + 0x34) = 0;
  }
  if ((int)uVar8 != 0) {
    puVar20[0x47] = *(longlong *)(puVar20 + 0x1f0) != 0 & puVar20[0x34];
    *(ulonglong *)(puVar20 + 0xd8) = (uVar8 & 0xffffffff) << 4;
    lVar9 = 0;
    uVar22 = (ulonglong)puVar23 & 0xffffffff;
    do {
      uVar15 = *(ushort *)(*(longlong *)(puVar20 + 0x38) + 10 + uVar22 * 0x10);
      uVar12 = *(undefined8 *)(param_2 + lVar9);
      *(undefined4 *)(puVar20 + 0xa0) = 0;
      uVar14 = 0;
      *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c54f;
      iVar6 = (*_DAT_7ff70cb96060)(uVar12,0,puVar20 + 0xa0);
      if (iVar6 == 0) {
        uVar24 = *(uint *)(puVar20 + 0xa0);
        bVar27 = (uVar24 & 0x29) != 0;
        uVar14 = bVar27 + 4;
        if ((uVar24 & 0x32) == 0) {
          uVar14 = (ushort)bVar27;
        }
        uVar14 = (ushort)(uVar24 >> 1) & 2 | uVar14;
        *(uint *)(puVar20 + 0x40) =
             *(int *)(puVar20 + 0x40) + (uint)(byte)(uVar24 != 0 & puVar20[0x47]);
      }
      uVar10 = *(undefined8 *)(*(longlong *)(puVar20 + 0x48) + 0x1a8);
      *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c59a;
      (*_DAT_7ff70cb96068)(uVar12,uVar10,0);
      if (puVar20[0x34] == '\0') {
        uVar14 = uVar14 | uVar15 >> 9 & 2 | uVar15 >> 2 & 4 | (ushort)((uVar15 & 0x300) != 0);
      }
      *(ushort *)(param_2 + 10 + lVar9) = uVar14;
      lVar9 = lVar9 + 0x10;
      uVar22 = (ulonglong)((int)uVar22 + 1);
    } while (*(longlong *)(puVar20 + 0xd8) != lVar9);
  }
  pcVar3 = _DAT_7ff70cb96068;
  pcVar2 = _DAT_7ff70cb96060;
  uVar21 = (undefined4)uVar22;
  if ((int)puVar23 == 0) {
    piVar17 = *(int **)(puVar20 + 0x48);
  }
  else {
    piVar17 = *(int **)(puVar20 + 0x48);
    lVar9 = *(longlong *)(piVar17 + 2);
    if (lVar9 != 0) {
      puVar20[0x34] = *(longlong *)(puVar20 + 0x1f0) != 0 & puVar20[0x34];
      puVar19 = puVar20 + 0xa0;
      do {
        *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c64a;
        uVar8 = FUN_7ff70c94bb80(lVar9,puVar20 + 0x70);
        if ((uVar8 & 0x10001) != 0) {
          uVar22 = uVar8 & 0xffffffff;
          *(undefined4 *)(puVar20 + 0xa0) = 0;
          *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c66b;
          iVar6 = (*pcVar2)(*(undefined8 *)(puVar20 + 0x70),0,puVar19);
          if (iVar6 == 0) {
            *(uint *)(puVar20 + 0x40) =
                 *(int *)(puVar20 + 0x40) +
                 (uint)(byte)(*(int *)(puVar20 + 0xa0) != 0 & puVar20[0x34]);
          }
          uVar12 = *(undefined8 *)(piVar17 + 0x6a);
          *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c696;
          (*pcVar3)(*(undefined8 *)(puVar20 + 0x70),uVar12,0);
          if ((uVar8 & 0x20002) != 0) {
            *(undefined4 *)(puVar20 + 0xa0) = 0;
            *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c6b6;
            iVar6 = (*pcVar2)(*(undefined8 *)(puVar20 + 0x78),0,puVar19);
            if (iVar6 == 0) {
              *(uint *)(puVar20 + 0x40) =
                   *(int *)(puVar20 + 0x40) +
                   (uint)(byte)(*(int *)(puVar20 + 0xa0) != 0 & puVar20[0x34]);
            }
            uVar12 = *(undefined8 *)(piVar17 + 0x6a);
            *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c6e1;
            (*pcVar3)(*(undefined8 *)(puVar20 + 0x78),uVar12,0);
            if ((uVar8 & 0x40004) != 0) {
              *(undefined4 *)(puVar20 + 0xa0) = 0;
              *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c708;
              iVar6 = (*pcVar2)(*(undefined8 *)(puVar20 + 0x80),0,puVar19);
              if (iVar6 == 0) {
                *(uint *)(puVar20 + 0x40) =
                     *(int *)(puVar20 + 0x40) +
                     (uint)(byte)(*(int *)(puVar20 + 0xa0) != 0 & puVar20[0x34]);
              }
              uVar12 = *(undefined8 *)(piVar17 + 0x6a);
              *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c736;
              (*pcVar3)(*(undefined8 *)(puVar20 + 0x80),uVar12,0);
              if ((uVar8 & 0x80008) != 0) {
                *(undefined4 *)(puVar20 + 0xa0) = 0;
                *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c75d;
                iVar6 = (*pcVar2)(*(undefined8 *)(puVar20 + 0x88),0,puVar19);
                if (iVar6 == 0) {
                  *(uint *)(puVar20 + 0x40) =
                       *(int *)(puVar20 + 0x40) +
                       (uint)(byte)(*(int *)(puVar20 + 0xa0) != 0 & puVar20[0x34]);
                }
                uVar12 = *(undefined8 *)(piVar17 + 0x6a);
                *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c78b;
                (*pcVar3)(*(undefined8 *)(puVar20 + 0x88),uVar12,0);
                if ((uVar8 & 0x100010) != 0) {
                  *(undefined4 *)(puVar20 + 0xa0) = 0;
                  *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c7b2;
                  iVar6 = (*pcVar2)(*(undefined8 *)(puVar20 + 0x90),0,puVar19);
                  if (iVar6 == 0) {
                    *(uint *)(puVar20 + 0x40) =
                         *(int *)(puVar20 + 0x40) +
                         (uint)(byte)(*(int *)(puVar20 + 0xa0) != 0 & puVar20[0x34]);
                  }
                  uVar12 = *(undefined8 *)(piVar17 + 0x6a);
                  *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c62f;
                  (*pcVar3)(*(undefined8 *)(puVar20 + 0x90),uVar12,0);
                }
              }
            }
          }
        }
        uVar21 = (undefined4)uVar22;
        lVar9 = *(longlong *)(lVar9 + 0x10);
      } while (lVar9 != 0);
    }
  }
  uVar12 = *(undefined8 *)(piVar17 + 0x6a);
  *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c7ee;
  func_0x7ff70d6f7c53(uVar12);
  puVar25 = (undefined4 *)0x40246c8b;
LAB_7ff70c94c7f3:
  iVar6 = *(int *)(puVar20 + 0x9c);
  if (10 < *(uint *)(puVar20 + 0x6c)) {
    *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c80c;
    (*_DAT_7ff70cbebad8)(*(undefined8 *)(puVar20 + 0x38));
  }
  if (puVar25 != (undefined4 *)0x0) {
    *puVar25 = uVar21;
  }
  if (((puVar20[0x200] == '\0') && (uVar4 == 0)) && (puVar20[0x1f8] != '\0')) {
    *(undefined4 *)(puVar20 + 0x50) = 0;
    *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c843;
    iVar7 = FUN_7ff70c94edd0(piVar17,puVar20 + 0x50);
    iVar5 = *(int *)(puVar20 + 0x50);
    if (iVar5 != 0 && iVar7 == 0) {
      iVar7 = iVar6;
      if (iVar5 < iVar6) {
        iVar7 = iVar5;
      }
      if (iVar5 < 0) {
        iVar7 = iVar6;
      }
      *(undefined8 *)(puVar20 + -8) = 0x7ff70c94c869;
      FUN_7ff70c995980(iVar7);
    }
  }
  return 0;
}


