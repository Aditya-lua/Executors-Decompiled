/* 7ff70c96a460 FUN_7ff70c96a460 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined4 * FUN_7ff70c96a460(longlong *param_1,undefined4 *param_2,char param_3)

{
  short *psVar1;
  code *pcVar2;
  bool bVar3;
  byte bVar4;
  char cVar5;
  int iVar6;
  longlong lVar7;
  longlong lVar8;
  ulonglong uVar9;
  char *pcVar10;
  char *pcVar11;
  longlong lVar12;
  char *pcVar13;
  ulonglong uVar14;
  ulonglong uVar15;
  ulonglong uVar16;
  char *pcVar17;
  undefined4 *puVar18;
  char *pcVar19;
  short *psVar20;
  short *psVar21;
  char *pcVar22;
  char *pcVar23;
  undefined4 uVar24;
  undefined4 uVar25;
  undefined4 uVar26;
  undefined4 uVar27;
  undefined8 uStack_b0;
  undefined8 uStack_a8;
  short *psStack_a0;
  short *psStack_98;
  char *pcStack_90;
  char cStack_81;
  undefined4 *puStack_80;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined4 *puStack_68;
  undefined4 uStack_60;
  undefined4 uStack_5c;
  undefined8 uStack_58;
  char *pcStack_50;
  undefined8 uStack_48;
  
  pcVar2 = _DAT_7ff70cb96668;
  uStack_48 = 0xfffffffffffffffe;
  uStack_78 = 0;
  uStack_70 = (undefined4 *)0x0;
  puStack_68 = (undefined4 *)0x0;
  lVar7 = *param_1;
  pcVar22 = (char *)param_1[1];
  pcVar10 = pcVar22 + lVar7;
  pcVar13 = (char *)param_1[2];
  bVar4 = *(byte *)(param_1 + 3);
  cStack_81 = param_3;
  puStack_80 = param_2;
  if (pcVar13 == pcVar10 || (bVar4 & 1) != 0) {
LAB_7ff70c96a4bd:
    if ((bVar4 & 1) == 0) {
      *puStack_80 = (undefined4)uStack_78;
      puStack_80[1] = uStack_78._4_4_;
      puStack_80[2] = (undefined4)uStack_70;
      puStack_80[3] = uStack_70._4_4_;
      *(undefined4 **)(puStack_80 + 4) = puStack_68;
      *(undefined1 *)(puStack_80 + 6) = 0;
      puVar18 = puStack_80;
    }
    else {
LAB_7ff70c96a4c9:
      puVar18 = puStack_80;
      *(undefined1 *)(puStack_80 + 6) = 1;
      if (uStack_78 != 0) {
        uVar16 = (longlong)puStack_68 - uStack_78;
        lVar7 = uStack_78;
        if (0xfff < uVar16) {
          lVar7 = *(longlong *)(uStack_78 + -8);
          if (0x1f < (ulonglong)((uStack_78 + -8) - lVar7)) {
                    /* WARNING: Does not return */
            pcVar2 = (code *)invalidInstructionException();
            (*pcVar2)();
          }
          uVar16 = uVar16 + 0x27;
        }
        thunk_FUN_7ff70ca90250(lVar7,uVar16);
      }
    }
    return puVar18;
  }
LAB_7ff70c96a4f0:
  pcVar17 = pcVar13 + -lVar7;
  if (pcVar22 <= pcVar17) {
    iVar6 = (*pcVar2)(0);
    if (iVar6 != 0) goto LAB_7ff70c96a58d;
    uVar16 = 0;
    goto LAB_7ff70c96a6a8;
  }
  iVar6 = (*pcVar2)();
  if (iVar6 != 0) {
LAB_7ff70c96a58d:
    pcVar10 = (char *)0x0;
    while (iVar6 = (*pcVar2)(), iVar6 != 0) {
      uStack_b0 = &UNK_7ff70cb83e3d;
      uStack_a8 = (short *)CONCAT44(uStack_a8._4_4_,0x11f);
      if (pcVar13 != pcVar22 + lVar7) {
        param_1[2] = (longlong)(pcVar13 + 1);
      }
      FUN_7ff70c962038(pcVar13 != pcVar22 + lVar7,1,&UNK_7ff70cb80e23,&UNK_7ff70cb8f638,&uStack_b0,0
                      );
      pcVar10 = pcVar10 + 1;
      lVar7 = *param_1;
      pcVar22 = (char *)param_1[1];
      pcVar13 = (char *)param_1[2];
    }
    uStack_58 = (short *)(pcVar17 + lVar7);
    uStack_60 = 6;
    pcStack_50 = pcVar10;
    if (uStack_70 == puStack_68) {
      FUN_7ff70c96bff0();
      goto LAB_7ff70c96a67d;
    }
    goto LAB_7ff70c96a62c;
  }
  cVar5 = *pcVar13;
  if (cVar5 == '/') {
    if (pcVar17 + 1 < pcVar22) {
      if (pcVar13[1] == '/') {
        do {
          if ((pcVar17 < pcVar22) && (*pcVar13 == '\n')) break;
          pcVar13 = pcVar13 + 1;
          param_1[2] = (longlong)pcVar13;
          pcVar17 = pcVar17 + 1;
        } while (pcVar13 != pcVar10);
        goto LAB_7ff70c96a67d;
      }
      cVar5 = *pcVar13;
      if (cVar5 != '/') goto LAB_7ff70c96a7cc;
    }
    if ((pcVar17 + 1 < pcVar22) && (pcVar13[1] == '*')) {
      if ((pcVar13 + (1 - lVar7) < pcVar22) && ((*pcVar13 == '*' && (pcVar13[1] == '/')))) {
        bVar3 = false;
        pcVar17 = pcVar13;
      }
      else {
        pcVar17 = pcVar13 + 1;
        param_1[2] = (longlong)pcVar17;
        bVar3 = true;
        if (pcVar17 != pcVar10) {
          pcVar11 = pcVar13 + 2 + -lVar7;
          pcVar13 = pcVar13 + 2;
          do {
            pcVar17 = pcVar13;
            if ((((pcVar11 + -1 < pcVar22) && (pcVar11 < pcVar22)) && (pcVar17[-1] == '*')) &&
               (*pcVar17 == '/')) {
              pcVar17 = pcVar17 + -1;
              bVar3 = false;
              break;
            }
            param_1[2] = (longlong)pcVar17;
            pcVar11 = pcVar11 + 1;
            pcVar13 = pcVar17 + 1;
          } while (pcVar17 != pcVar10);
        }
      }
      if ((pcVar17 + -lVar7 < pcVar22) && (*pcVar17 == '*')) {
        if (bVar3) goto LAB_7ff70c96a4c9;
        pcVar13 = pcVar17 + 1;
        param_1[2] = (longlong)pcVar13;
        if ((pcVar13 + -lVar7 < pcVar22) && (*pcVar13 == '/')) {
          if (pcVar13 != pcVar10) {
            param_1[2] = (longlong)(pcVar17 + 2);
            goto LAB_7ff70c96a67d;
          }
          goto LAB_7ff70c96a4c9;
        }
      }
      *(undefined1 *)(param_1 + 3) = 1;
      goto LAB_7ff70c96a4c9;
    }
    cVar5 = *pcVar13;
  }
LAB_7ff70c96a7cc:
  pcVar11 = pcVar17 + 1;
  if ((((cVar5 == 'f') && (pcVar11 < pcVar22)) && (pcVar13[1] == 'a')) &&
     (((pcVar17 + 2 < pcVar22 && (pcVar13[2] == 'l')) &&
      ((pcVar17 + 3 < pcVar22 && ((pcVar13[3] == 's' && (pcVar17 + 4 < pcVar22)))))))) {
    pcVar19 = (char *)0x5;
    psVar20 = (short *)&UNK_7ff70cb867d1;
    if (pcVar13[4] != 'e') goto LAB_7ff70c96a81d;
LAB_7ff70c96a87a:
    iVar6 = 0;
    cVar5 = '\0';
    if (pcVar17 + (longlong)pcVar19 < pcVar22) {
      cVar5 = pcVar13[(longlong)pcVar19];
      iVar6 = (int)cVar5;
      if (iVar6 - 0x30U < 10) goto LAB_7ff70c96aa00;
    }
    psStack_98 = psVar20;
    pcStack_90 = pcVar19;
    iVar6 = (*_DAT_7ff70cb96660)(iVar6);
    if (((iVar6 == 0) && (cVar5 != '$')) && (cVar5 != '_')) {
      pcVar22 = pcVar13 + 1;
      if (pcVar22 == pcVar10) {
        param_1[2] = (longlong)pcVar22;
        if (pcStack_90 != (char *)0x1) goto LAB_7ff70c96a4c9;
      }
      else {
        if (pcStack_90 != (char *)0x1) {
          pcVar22 = pcVar13 + 2;
          pcVar17 = pcStack_90 + -2;
          if (pcVar22 == pcVar10) {
LAB_7ff70c96b1bc:
            param_1[2] = (longlong)pcVar22;
            if (pcVar17 == (char *)0x0) goto LAB_7ff70c96b1cc;
            goto LAB_7ff70c96a4c9;
          }
          if (pcVar17 != (char *)0x0) {
            pcVar22 = pcVar13 + 3;
            pcVar17 = pcStack_90 + -3;
            if (pcVar22 == pcVar10) goto LAB_7ff70c96b1bc;
            if (pcVar17 != (char *)0x0) {
              pcVar22 = pcVar13 + 4;
              pcVar17 = pcStack_90 + -4;
              if (pcVar22 == pcVar10) goto LAB_7ff70c96b1bc;
              if (pcVar17 != (char *)0x0) {
                pcVar22 = pcVar13 + 5;
                pcVar17 = pcStack_90 + -5;
                if (pcVar22 == pcVar10) goto LAB_7ff70c96b1bc;
                if (pcVar17 != (char *)0x0) {
                  pcVar22 = pcVar13 + 6;
                  pcVar17 = pcStack_90 + -6;
                  if (pcVar22 == pcVar10) goto LAB_7ff70c96b1bc;
                  if ((pcVar17 != (char *)0x0) && (pcVar22 = pcVar13 + 7, pcVar22 == pcVar10)) {
                    param_1[2] = (longlong)pcVar22;
                    if (pcStack_90 == (char *)0x7) goto LAB_7ff70c96b1cc;
                    goto LAB_7ff70c96a4c9;
                  }
                }
              }
            }
          }
        }
        param_1[2] = (longlong)pcVar22;
      }
LAB_7ff70c96b1cc:
      uStack_60 = 4;
      uStack_58 = psStack_98;
      pcStack_50 = pcStack_90;
      if (uStack_70 != puStack_68) goto LAB_7ff70c96a62c;
      FUN_7ff70c96bff0();
      goto LAB_7ff70c96a67d;
    }
  }
  else {
LAB_7ff70c96a81d:
    cVar5 = *pcVar13;
    if (cVar5 == 't') {
      if ((((pcVar11 < pcVar22) && (pcVar13[1] == 'r')) && (pcVar17 + 2 < pcVar22)) &&
         ((pcVar13[2] == 'u' && (pcVar17 + 3 < pcVar22)))) {
        pcVar19 = (char *)0x4;
        psVar20 = (short *)&UNK_7ff70cb861b6;
        if (pcVar13[3] == 'e') goto LAB_7ff70c96a87a;
      }
      cVar5 = *pcVar13;
    }
    if (((((cVar5 == 'n') && (pcVar11 < pcVar22)) &&
         ((pcVar13[1] == 'u' &&
          ((((pcVar17 + 2 < pcVar22 && (pcVar13[2] == 'l')) && (pcVar17 + 3 < pcVar22)) &&
           ((pcVar13[3] == 'l' && (pcVar17 + 4 < pcVar22)))))))) &&
        ((pcVar13[4] == 'p' && ((pcVar17 + 5 < pcVar22 && (pcVar13[5] == 't')))))) &&
       (pcVar17 + 6 < pcVar22)) {
      pcVar19 = (char *)0x7;
      psVar20 = (short *)&UNK_7ff70cb83219;
      if (pcVar13[6] == 'r') goto LAB_7ff70c96a87a;
    }
  }
LAB_7ff70c96aa00:
  cVar5 = *pcVar13;
  if (cVar5 == 'u') {
    uVar16 = 1;
    if ((pcVar17 + 1 < pcVar22) && (uVar16 = 2, pcVar13[1] != '8')) {
      cVar5 = *pcVar13;
      uVar16 = 1;
      if (cVar5 != 'u') goto LAB_7ff70c96aa39;
    }
  }
  else {
LAB_7ff70c96aa39:
    uVar16 = 1;
    if (cVar5 != 'U') {
      uVar16 = (ulonglong)(*pcVar13 == 'L');
    }
  }
LAB_7ff70c96a6a8:
  if (pcVar22 <= pcVar17 + uVar16) {
LAB_7ff70c96aa80:
    if ((pcVar22 <= pcVar17) ||
       ((9 < (int)*pcVar13 - 0x30U &&
        (((*pcVar13 != '.' || (pcVar22 <= pcVar17 + 1)) || (9 < (int)pcVar13[1] - 0x30U)))))) {
      lVar8 = 0;
LAB_7ff70c96aafd:
      psVar20 = *(short **)(&UNK_7ff70cb518f8 + lVar8);
      pcVar11 = *(char **)(&UNK_7ff70cb51900 + lVar8);
      if (pcVar11 != (char *)0x0) {
        pcVar19 = (char *)0x0;
        do {
          if (pcVar17 + (longlong)pcVar19 < pcVar22) {
            if (pcVar13[(longlong)pcVar19] != *(char *)((longlong)psVar20 + (longlong)pcVar19))
            goto LAB_7ff70c96ab49;
          }
          else if (*(char *)((longlong)psVar20 + (longlong)pcVar19) != '\0') goto LAB_7ff70c96ab49;
          pcVar19 = pcVar19 + 1;
          if (pcVar11 == pcVar19) break;
        } while( true );
      }
      pcVar17 = pcVar10 + ~(ulonglong)pcVar13;
      if (pcVar11 < pcVar10 + ~(ulonglong)pcVar13) {
        pcVar17 = pcVar11;
      }
      pcVar19 = pcVar17 + 1;
      pcVar23 = pcVar11;
      if ((char *)0x4 < pcVar19) {
        uVar16 = (ulonglong)((uint)pcVar19 & 3);
        if (((ulonglong)pcVar19 & 3) == 0) {
          uVar16 = 4;
        }
        lVar8 = 0;
        do {
          lVar8 = lVar8 + -4;
        } while (~(ulonglong)pcVar17 + uVar16 != lVar8);
        param_1[2] = (longlong)pcVar13 - lVar8;
        pcVar13 = pcVar13 + ((longlong)pcVar19 - uVar16);
        pcVar23 = pcVar11 + -((longlong)pcVar19 - uVar16);
      }
      goto LAB_7ff70c96ac30;
    }
    FUN_7ff70c96ba00(param_1,&uStack_60);
    if (uStack_60._1_1_ != '\x01') {
      uStack_58 = (short *)(pcVar17 + *param_1);
      pcStack_50 = (char *)(param_1[2] - (longlong)uStack_58);
      uStack_60 = 2;
      if (uStack_70 != puStack_68) goto LAB_7ff70c96a62c;
      FUN_7ff70c96bff0();
      goto LAB_7ff70c96a67d;
    }
    goto LAB_7ff70c96a4c9;
  }
  if (pcVar13[uVar16] == '\'') {
    if (uVar16 != 0) {
      param_1[2] = (longlong)(pcVar13 + 1);
      lVar7 = uVar16 - 1;
      if (pcVar13 + 1 != pcVar10) {
        if (lVar7 == 0) goto LAB_7ff70c96a709;
        param_1[2] = (longlong)(pcVar13 + 2);
        lVar7 = uVar16 - 2;
        if (pcVar13 + 2 != pcVar10) {
          if (lVar7 == 0) goto LAB_7ff70c96a709;
          param_1[2] = (longlong)(pcVar13 + 3);
          lVar7 = uVar16 - 3;
        }
      }
      if (lVar7 != 0) goto LAB_7ff70c96a4c9;
    }
LAB_7ff70c96a709:
    FUN_7ff70c96b410(param_1,&uStack_60);
    if (uStack_60._1_1_ != '\x01') {
      uStack_58 = (short *)(pcVar17 + *param_1);
      pcStack_50 = (char *)(param_1[2] - (longlong)uStack_58);
      uStack_60 = 3;
      if (uStack_70 != puStack_68) goto LAB_7ff70c96a62c;
      FUN_7ff70c96bff0();
      goto LAB_7ff70c96a67d;
    }
    goto LAB_7ff70c96a4c9;
  }
  if ((pcVar13[uVar16] != '\"') &&
     (((pcVar13[uVar16] != 'R' || (pcVar22 <= pcVar17 + uVar16 + 1)) ||
      (pcVar13[uVar16 + 1] != '\"')))) goto LAB_7ff70c96aa80;
  if (uVar16 == 0) {
    if (pcVar13 + -lVar7 < pcVar22) goto LAB_7ff70c96ad22;
LAB_7ff70c96ad36:
    FUN_7ff70c96b830(param_1,&uStack_60);
  }
  else {
    pcVar11 = pcVar13 + 1;
    param_1[2] = (longlong)pcVar11;
    lVar8 = uVar16 - 1;
    if (pcVar11 == pcVar10) {
LAB_7ff70c96a7ab:
      if (lVar8 != 0) goto LAB_7ff70c96a4c9;
    }
    else if (lVar8 != 0) {
      pcVar11 = pcVar13 + 2;
      param_1[2] = (longlong)pcVar11;
      lVar8 = uVar16 - 2;
      if (pcVar11 != pcVar10) {
        if (lVar8 == 0) goto LAB_7ff70c96a7b4;
        pcVar11 = pcVar13 + 3;
        param_1[2] = (longlong)pcVar11;
        lVar8 = uVar16 - 3;
      }
      goto LAB_7ff70c96a7ab;
    }
LAB_7ff70c96a7b4:
    pcVar13 = pcVar11;
    if (pcVar22 <= pcVar11 + -lVar7) goto LAB_7ff70c96ad36;
LAB_7ff70c96ad22:
    if (*pcVar13 != 'R') goto LAB_7ff70c96ad36;
    FUN_7ff70c96b5b0(param_1,&uStack_60);
  }
  if (uStack_60._1_1_ == '\x01') goto LAB_7ff70c96a4c9;
  uStack_58 = (short *)(pcVar17 + *param_1);
  pcStack_50 = (char *)(param_1[2] - (longlong)uStack_58);
  uStack_60 = 3;
  if (uStack_70 != puStack_68) goto LAB_7ff70c96a62c;
  FUN_7ff70c96bff0();
  goto LAB_7ff70c96a67d;
LAB_7ff70c96ab49:
  lVar8 = lVar8 + 0x10;
  if (lVar8 == 0x360) goto code_r0x7ff70c96ab56;
  goto LAB_7ff70c96aafd;
code_r0x7ff70c96ab56:
  FUN_7ff70c96bd30(param_1,&uStack_60);
  psVar21 = uStack_58;
  psVar20 = (short *)*param_1;
  pcStack_90 = (char *)param_1[1];
  pcVar10 = (char *)param_1[2];
  if (((((char)pcStack_50 == '\0') ||
       ((cVar5 = '\0', pcVar10 + ((longlong)uStack_58 - (longlong)psVar20) < pcStack_90 &&
        (cVar5 = pcVar10[(longlong)uStack_58], (int)cVar5 - 0x30U < 10)))) ||
      (iVar6 = (*_DAT_7ff70cb96660)(), iVar6 != 0)) || ((cVar5 == '$' || (cVar5 == '_')))) {
    pcVar22 = pcVar10 + -(longlong)psVar20;
    if (pcVar22 < pcStack_90) {
      cVar5 = *pcVar10;
    }
    else {
      cVar5 = '\0';
    }
    iVar6 = (*_DAT_7ff70cb96660)((int)cVar5);
    if (((iVar6 == 0) && (cVar5 != '_')) && (cVar5 != '$')) {
      uStack_b0 = (undefined *)CONCAT44(uStack_b0._4_4_,7);
      psStack_a0 = (short *)0x1;
      uStack_a8 = psVar20;
      if (uStack_70 == puStack_68) {
        FUN_7ff70c96bff0(&uStack_78);
      }
      else {
        *(undefined8 *)(uStack_70 + 4) = 1;
        uStack_a8._0_4_ = SUB84(psVar20,0);
        uStack_a8._4_4_ = (undefined4)((ulonglong)psVar20 >> 0x20);
        *uStack_70 = 7;
        uStack_70[1] = uStack_b0._4_4_;
        uStack_70[2] = (undefined4)uStack_a8;
        uStack_70[3] = uStack_a8._4_4_;
        uStack_70 = uStack_70 + 6;
      }
      if (param_1[2] == *param_1 + param_1[1]) goto LAB_7ff70c96a4c9;
      param_1[2] = param_1[2] + 1;
      goto LAB_7ff70c96a67d;
    }
    pcVar13 = (char *)((longlong)psVar20 + (longlong)pcStack_90);
    pcVar17 = pcVar10;
    psStack_98 = psVar20;
    if ((pcVar10 != pcVar13) && ((*(byte *)(param_1 + 3) & 1) == 0)) {
      pcVar11 = pcStack_90;
      pcVar19 = pcVar10;
      pcVar23 = pcVar10;
      do {
        iVar6 = 0;
        cVar5 = '\0';
        if (pcVar23 + -(longlong)psVar20 < pcVar11) {
          cVar5 = *pcVar19;
          iVar6 = (int)cVar5;
          if (9 < iVar6 - 0x30U) goto LAB_7ff70c96af30;
        }
        else {
LAB_7ff70c96af30:
          iVar6 = (*_DAT_7ff70cb96660)(iVar6);
          pcVar11 = pcStack_90;
          if (((iVar6 == 0) && (cVar5 != '_')) && (pcVar17 = pcVar23, cVar5 != '$')) break;
        }
        pcVar19 = pcVar19 + 1;
        param_1[2] = (longlong)pcVar19;
        pcVar23 = pcVar23 + 1;
        pcVar17 = pcVar13;
      } while (pcVar19 != pcVar13);
    }
    lVar7 = _DAT_7ff70cc1ada8;
    uVar16 = 0xcbf29ce484222325;
    psVar20 = (short *)(pcVar17 + -(longlong)pcVar10);
    if (psVar20 != (short *)0x0) {
      uVar9 = (ulonglong)((uint)psVar20 & 3);
      if (psVar20 < (short *)0x4) {
        uVar14 = 0;
      }
      else {
        pcVar13 = pcVar22 + (longlong)psStack_98;
        uVar14 = 0;
        do {
          uVar16 = ((ulonglong)(byte)pcVar13[uVar14 + 3] ^
                   ((ulonglong)(byte)pcVar13[uVar14 + 2] ^
                   ((ulonglong)(byte)pcVar13[uVar14 + 1] ^
                   ((byte)pcVar13[uVar14] ^ uVar16) * 0x100000001b3) * 0x100000001b3) *
                   0x100000001b3) * 0x100000001b3;
          uVar14 = uVar14 + 4;
        } while (((ulonglong)psVar20 & 0xfffffffffffffffc) != uVar14);
        if (uVar9 == 0) goto LAB_7ff70c96b097;
      }
      uVar15 = 0;
      do {
        uVar16 = ((byte)pcVar10[uVar15 + uVar14] ^ uVar16) * 0x100000001b3;
        uVar15 = uVar15 + 1;
      } while (uVar9 != uVar15);
    }
LAB_7ff70c96b097:
    psVar21 = (short *)((longlong)psStack_98 + (longlong)pcVar22);
    lVar12 = (uVar16 & _DAT_7ff70cc1add0) * 0x10;
    lVar8 = *(longlong *)(_DAT_7ff70cc1adb8 + 8 + lVar12);
    if (lVar8 == _DAT_7ff70cc1ada8) {
LAB_7ff70c96b10a:
      lVar8 = 0;
    }
    else {
      lVar12 = *(longlong *)(_DAT_7ff70cc1adb8 + lVar12);
      if (psVar20 != (short *)0x0) {
        psVar1 = *(short **)(lVar8 + 0x18);
        while( true ) {
          if ((psVar20 == psVar1) &&
             (iVar6 = FUN_7ff70cb12b50(psVar21,*(undefined8 *)(lVar8 + 0x10)), iVar6 == 0))
          goto LAB_7ff70c96b10c;
          if (lVar8 == lVar12) break;
          lVar8 = *(longlong *)(lVar8 + 8);
          psVar1 = *(short **)(lVar8 + 0x18);
        }
        goto LAB_7ff70c96b10a;
      }
      for (; *(longlong *)(lVar8 + 0x18) != 0; lVar8 = *(longlong *)(lVar8 + 8)) {
        if (lVar8 == lVar12) goto LAB_7ff70c96b10a;
      }
    }
LAB_7ff70c96b10c:
    iVar6 = (uint)(lVar8 == lVar7) * 5;
    if (lVar8 == 0) {
      iVar6 = 5;
    }
    uStack_b0 = (undefined *)CONCAT44(uStack_b0._4_4_,iVar6);
    uStack_a8 = psVar21;
    psStack_a0 = psVar20;
    if (uStack_70 == puStack_68) {
      FUN_7ff70c96bff0();
      goto LAB_7ff70c96a67d;
    }
  }
  else {
    pcVar22 = (char *)((longlong)psVar20 + (longlong)pcStack_90);
    if (pcVar10 != pcVar22) {
      psVar20 = (short *)(pcVar22 + ~(ulonglong)pcVar10);
      if (psVar21 <= pcVar22 + ~(ulonglong)pcVar10) {
        psVar20 = psVar21;
      }
      pcVar13 = (char *)((longlong)psVar20 + 1);
      if ((char *)0x4 < pcVar13) {
        uVar16 = (ulonglong)((uint)pcVar13 & 3);
        if (((ulonglong)pcVar13 & 3) == 0) {
          uVar16 = 4;
        }
        psVar21 = (short *)((longlong)psVar21 - ((longlong)pcVar13 - uVar16));
        lVar7 = 0;
        do {
          lVar7 = lVar7 + -4;
        } while (~(ulonglong)psVar20 + uVar16 != lVar7);
        param_1[2] = (longlong)pcVar10 - lVar7;
        pcVar10 = pcVar10 + ((longlong)pcVar13 - uVar16);
      }
      do {
        if (psVar21 == (short *)0x0) goto LAB_7ff70c96b281;
        pcVar10 = pcVar10 + 1;
        param_1[2] = (longlong)pcVar10;
        psVar21 = (short *)((longlong)psVar21 + -1);
      } while (pcVar10 != pcVar22);
    }
    if (psVar21 != (short *)0x0) goto LAB_7ff70c96a4c9;
LAB_7ff70c96b281:
    uStack_a8 = (short *)CONCAT44(uStack_5c,uStack_60);
    psStack_a0 = uStack_58;
    uStack_b0 = (undefined *)CONCAT44(uStack_b0._4_4_,1);
    if (uStack_70 == puStack_68) {
      FUN_7ff70c96bff0();
      goto LAB_7ff70c96a67d;
    }
  }
  *(short **)(uStack_70 + 4) = psStack_a0;
  uVar24 = (undefined4)uStack_b0;
  uVar25 = uStack_b0._4_4_;
  uVar26 = (undefined4)uStack_a8;
  uVar27 = uStack_a8._4_4_;
  goto LAB_7ff70c96a638;
  while( true ) {
    pcVar13 = pcVar13 + 1;
    param_1[2] = (longlong)pcVar13;
    pcVar23 = pcVar23 + -1;
    if (pcVar13 == pcVar10) break;
LAB_7ff70c96ac30:
    if (pcVar23 == (char *)0x0) goto LAB_7ff70c96ac4d;
  }
  if (pcVar23 != (char *)0x0) goto LAB_7ff70c96a4c9;
LAB_7ff70c96ac4d:
  if (pcVar11 == (char *)0x2) {
    if ((((*psVar20 == 0x3a3c) && (pcVar13 + -lVar7 < pcVar22)) && (*pcVar13 == ':')) &&
       ((pcVar22 <= pcVar13 + -lVar7 + 1 || ((byte)(pcVar13[1] | 4U) != 0x3e)))) {
      FUN_7ff70c96bca0(param_1,1);
      uStack_60 = 1;
      uStack_58 = (short *)&UNK_7ff70cb8af2b;
      pcStack_50 = (char *)0x1;
      if (uStack_70 == puStack_68) {
        FUN_7ff70c96bff0();
        goto LAB_7ff70c96a67d;
      }
    }
    else {
      if ((cStack_81 == '\0') || (*psVar20 != 0x3e3e)) goto LAB_7ff70c96acea;
      uStack_60 = 1;
      uStack_58 = (short *)&UNK_7ff70cb8ae8b;
      pcStack_50 = (char *)0x1;
      if (uStack_70 == puStack_68) {
        FUN_7ff70c96bff0();
      }
      else {
        *(undefined8 *)(uStack_70 + 4) = 1;
        *uStack_70 = 1;
        uStack_70[1] = uStack_5c;
        uStack_70[2] = 0xcb8ae8b;
        uStack_70[3] = 0x7ff7;
        uStack_70 = uStack_70 + 6;
      }
      uStack_60 = 1;
      uStack_58 = (short *)&UNK_7ff70cb8ae8b;
      pcStack_50 = (char *)0x1;
      if (uStack_70 == puStack_68) {
        FUN_7ff70c96bff0();
        goto LAB_7ff70c96a67d;
      }
    }
  }
  else {
LAB_7ff70c96acea:
    uStack_60 = 1;
    uStack_58 = psVar20;
    pcStack_50 = pcVar11;
    if (uStack_70 == puStack_68) {
      FUN_7ff70c96bff0();
      goto LAB_7ff70c96a67d;
    }
  }
LAB_7ff70c96a62c:
  *(char **)(uStack_70 + 4) = pcStack_50;
  uVar24 = uStack_60;
  uVar25 = uStack_5c;
  uVar26 = (undefined4)uStack_58;
  uVar27 = uStack_58._4_4_;
LAB_7ff70c96a638:
  *uStack_70 = uVar24;
  uStack_70[1] = uVar25;
  uStack_70[2] = uVar26;
  uStack_70[3] = uVar27;
  uStack_70 = uStack_70 + 6;
LAB_7ff70c96a67d:
  lVar7 = *param_1;
  pcVar22 = (char *)param_1[1];
  pcVar10 = pcVar22 + lVar7;
  pcVar13 = (char *)param_1[2];
  bVar4 = *(byte *)(param_1 + 3);
  if ((pcVar13 == pcVar10) || ((bVar4 & 1) != 0)) goto LAB_7ff70c96a4bd;
  goto LAB_7ff70c96a4f0;
}


