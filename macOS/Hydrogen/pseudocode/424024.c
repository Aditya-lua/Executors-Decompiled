
/* WARNING: Possible PIC construction at 0x00424274: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00424278) */
/* WARNING: Removing unreachable block (ram,0x00424284) */
/* WARNING: Removing unreachable block (ram,0x00424290) */

char * FUN_00424024(long param_1)

{
  char *pcVar1;
  byte bVar2;
  byte bVar3;
  ulong uVar4;
  ulong uVar5;
  long *plVar6;
  char *pcVar7;
  long *plVar8;
  long lVar9;
  char *pcVar10;
  long lVar11;
  ulong uVar12;
  long lVar13;
  long lVar14;
  undefined1 uVar15;
  char *pcVar16;
  undefined1 uVar17;
  ulong unaff_x19;
  char *unaff_x20;
  uint unaff_w21;
  ulong uVar18;
  undefined1 auVar19 [16];
  undefined1 uStack0000000000000010;
  ulong uStack0000000000000011;
  undefined7 uStack0000000000000019;
  undefined1 uStack0000000000000020;
  undefined7 uStack0000000000000021;
  undefined1 uStack0000000000000028;
  undefined7 uStack0000000000000029;
  undefined7 uStack0000000000000031;
  byte bStack0000000000000038;
  char cStack0000000000000039;
  byte bStack000000000000003a;
  long lStack0000000000000040;
  char cStack0000000000000048;
  undefined8 in_stack_00000050;
  undefined7 uStack0000000000000058;
  undefined1 uStack000000000000005f;
  undefined7 in_stack_00000060;
  undefined1 auStack_68 [24];
  undefined1 auStack_50 [16];
  long *plStack_40;
  long *plStack_38;
  undefined1 *puStack_30;
  undefined8 uStack_28;
  char *pcStack_20;
  undefined8 uStack_18;
  
  uStack0000000000000019 = (undefined7)_cStack0000000000000048;
  uStack0000000000000020 = (undefined1)((ulong)_cStack0000000000000048 >> 0x38);
  uStack0000000000000011 = lStack0000000000000040;
  bStack000000000000003a = *(byte *)(param_1 + 0x3a);
  uVar18 = (ulong)bStack000000000000003a;
  bVar3 = *(byte *)(param_1 + 0x38);
  cStack0000000000000039 = *(char *)(param_1 + 0x39);
  uStack0000000000000010 = (undefined1)unaff_w21;
  uStack0000000000000029 = uStack0000000000000058;
  uStack0000000000000021 = (undefined7)in_stack_00000050;
  uStack0000000000000028 = (undefined1)((ulong)in_stack_00000050 >> 0x38);
  uStack0000000000000031 = in_stack_00000060;
  pcVar7 = unaff_x20;
  bStack0000000000000038 = bVar3;
  if ((bVar3 == 2) && (unaff_x19 != 0)) {
    uVar12 = unaff_x19;
    if (unaff_w21 < 3) {
      pcVar10 = unaff_x20 + unaff_x19;
      do {
        uVar12 = 0;
        while (pcVar7 = unaff_x20, unaff_x20[uVar12] != '/') {
          uVar12 = uVar12 + 1;
          if (unaff_x19 == uVar12) goto LAB_00424110;
        }
        if (uVar12 != 0) break;
        unaff_x20 = unaff_x20 + 1;
        unaff_x19 = unaff_x19 - 1;
        pcVar7 = pcVar10;
      } while (unaff_x19 != 0);
    }
    else {
      do {
        uVar5 = 0;
        do {
          if (unaff_x20[uVar5] == '/') {
            lVar13 = 1;
            lVar14 = 0;
            if (uVar5 != 0) goto LAB_004240dc;
            goto LAB_004240f0;
          }
          uVar5 = uVar5 + 1;
        } while (uVar12 != uVar5);
        lVar13 = 0;
        uVar5 = uVar12;
        if (uVar12 == 0) {
          lVar14 = 0;
        }
        else {
LAB_004240dc:
          unaff_x19 = uVar12;
          pcVar7 = unaff_x20;
          if ((uVar5 != 1) || (lVar14 = 1, *unaff_x20 != '.')) goto LAB_00424110;
        }
LAB_004240f0:
        uVar5 = lVar14 + lVar13;
        uVar4 = uVar12 - uVar5;
        if (uVar12 < uVar5) goto LAB_004242d4;
        unaff_x20 = unaff_x20 + uVar5;
        uVar12 = uVar4;
      } while (uVar4 != 0);
      unaff_x19 = 0;
      pcVar7 = unaff_x20;
    }
  }
LAB_00424110:
  unaff_x20 = pcVar7;
  if (cStack0000000000000039 == '\x02') {
    bVar2 = bStack000000000000003a;
    if (unaff_w21 < 5) {
      bVar2 = 1;
    }
    lVar14 = 0;
    if (CONCAT71(in_stack_00000060,uStack000000000000005f) != 0) {
      lVar14 = CONCAT71(in_stack_00000060,uStack000000000000005f) + 1;
    }
    if (bVar3 < 2) {
      lVar13 = CONCAT71(uStack0000000000000021,uStack0000000000000020);
      lVar14 = lVar13 + lVar14;
      if ((bVar2 & 1) != 0) goto LAB_004241cc;
code_r0x00424158:
      if (unaff_w21 == 6 || bVar3 != 0) {
        lVar9 = 0;
        if (unaff_x19 == 0) goto LAB_004241cc;
      }
      else {
        if (unaff_x19 < 2) goto code_r0x004242e4;
        lVar9 = 2;
        if (unaff_x19 == 2) goto LAB_004241cc;
      }
      pcVar7 = unaff_x20 + lVar9;
      pcVar10 = pcVar7 + 1;
      if ((pcVar10 == unaff_x20 + unaff_x19) || (*pcVar7 != '.')) {
        if (*pcVar7 != '.' || pcVar10 != unaff_x20 + unaff_x19) goto LAB_004241cc;
      }
      else if (*pcVar10 != '/') goto LAB_004241cc;
      lVar9 = 1;
      if (bVar3 != 0) goto code_r0x004241d4;
      do {
        uVar12 = unaff_x19;
        if ((int)unaff_w21 < 3) {
          if (unaff_w21 == 0) {
code_r0x00424250:
            lVar11 = lVar13 + 4;
          }
          else {
            lVar11 = lVar14 + 8;
            if (unaff_w21 != 1) {
              lVar11 = 6;
            }
          }
        }
        else if ((int)unaff_w21 < 5) {
          lVar11 = lVar14 + 2;
          if (unaff_w21 == 3) goto code_r0x00424250;
        }
        else {
          if (unaff_w21 == 6) goto code_r0x004241d4;
          lVar11 = 2;
        }
        while( true ) {
          if (uVar12 <= lVar9 + uVar18 + lVar11) {
            return unaff_x20;
          }
          FUN_004242f4(&lStack0000000000000040);
          if (cStack0000000000000048 != '\n') {
            return unaff_x20;
          }
          unaff_x19 = uVar12 - lStack0000000000000040;
          if (uVar12 < (ulong)lStack0000000000000040) {
            uVar5 = func_0x007a28b0(unaff_x19,uVar12,&UNK_009da990);
            goto LAB_004242d4;
          }
          if ((bVar2 & 1) == 0) goto code_r0x00424158;
LAB_004241cc:
          lVar9 = 0;
          if (bVar3 == 0) break;
code_r0x004241d4:
          lVar11 = 0;
          uVar12 = unaff_x19;
        }
      } while( true );
    }
    if (unaff_x19 != 0) {
      plVar6 = &lStack0000000000000040;
      plVar8 = (long *)register0x00000008;
      goto LAB_004242f8;
    }
  }
  return unaff_x20;
LAB_004242d4:
  func_0x007a28a4(uVar5,uVar12,&UNK_009da978);
  unaff_x19 = uVar12;
code_r0x004242e4:
  auVar19 = func_0x007a28a4(2,unaff_x19,&UNK_009da930);
  plVar6 = auVar19._0_8_;
  plVar8 = auVar19._8_8_;
LAB_004242f8:
  pcStack_20 = unaff_x20;
  uStack_18 = unaff_x19;
  pcVar7 = (char *)func_0x00423e58(plVar8);
  pcVar10 = (char *)plVar8[1];
  if (pcVar10 < pcVar7) {
    auVar19 = func_0x007a28a4(pcVar7,pcVar10,&UNK_009da948);
  }
  else {
    pcVar1 = pcVar7 + *plVar8;
    lVar14 = -1;
    lVar13 = *plVar8;
    pcVar16 = pcVar7;
    do {
      lVar9 = lVar13;
      if (pcVar10 == pcVar16) {
        lVar14 = 0;
        goto joined_r0x00424384;
      }
      pcVar16 = pcVar16 + 1;
      lVar14 = lVar14 + 1;
      lVar13 = lVar9 + -1;
    } while (pcVar10[lVar9 + -1] != '/');
    pcVar7 = pcVar10 + -lVar14;
    auVar19._8_8_ = pcVar10;
    auVar19._0_8_ = pcVar7;
    if (pcVar7 <= pcVar10) {
      pcVar1 = pcVar10 + lVar9;
      lVar14 = 1;
joined_r0x00424384:
      lVar13 = (long)pcVar10 - (long)pcVar7;
      if (lVar13 == 0) {
        uVar15 = 10;
      }
      else if (lVar13 == 2) {
        uVar15 = 8;
        if (pcVar1[1] != '.' || *pcVar1 != '.') {
          uVar15 = 9;
        }
      }
      else if (lVar13 == 1) {
        uVar17 = 7;
        if (2 < *(byte *)(plVar8 + 2)) {
          uVar17 = 10;
        }
        uVar15 = 9;
        if (*pcVar1 == '.') {
          uVar15 = uVar17;
        }
      }
      else {
        uVar15 = 9;
      }
      *plVar6 = lVar13 + lVar14;
      *(undefined1 *)(plVar6 + 1) = uVar15;
      plVar6[2] = (long)pcVar1;
      plVar6[3] = lVar13;
      return pcVar7;
    }
  }
  auVar19 = func_0x007a28a4(auVar19._0_8_,auVar19._8_8_,&UNK_009da960);
  uStack_28 = 0x42441c;
  plStack_40 = plVar8;
  plStack_38 = plVar6;
  puStack_30 = auStack_68 + 0x58;
  func_0x00469960(auStack_68,auVar19._8_8_,&UNK_0088848c,4);
  auStack_50 = func_0x00423fe0(auVar19._0_8_);
  func_0x004656a8(auStack_68,auStack_50,&UNK_009da9a8);
  pcVar7 = (char *)func_0x004658b0();
  return pcVar7;
}

