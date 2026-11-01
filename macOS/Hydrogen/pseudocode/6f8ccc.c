
ulong thunk_FUN_006f8d48(undefined8 param_1)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  ulong uVar5;
  undefined8 uVar6;
  char *pcVar7;
  long lVar8;
  ulong uVar9;
  undefined8 uVar10;
  long lVar11;
  uint uVar12;
  undefined1 *puVar13;
  float *pfVar14;
  undefined1 *puVar15;
  char *pcVar16;
  long lVar17;
  ulong uVar18;
  char cVar19;
  ulong uVar20;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  uint uVar21;
  ulong unaff_x26;
  ulong unaff_x27;
  ulong uVar22;
  undefined *unaff_x28;
  long unaff_x29;
  double dVar23;
  undefined1 auVar24 [12];
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined1 uStack0000000000000028;
  undefined1 uStack0000000000000048;
  undefined8 uStack0000000000000070;
  undefined1 *in_stack_00000078;
  undefined4 auStack_3c0 [2];
  long lStack_3b8;
  ulong uStack_3b0;
  char *pcStack_3a8;
  undefined8 uStack_3a0;
  uint uStack_398;
  ulong uStack_190;
  int iStack_188;
  undefined4 uStack_184;
  undefined *puStack_180;
  ulong uStack_178;
  ulong uStack_170;
  ulong uStack_168;
  ulong uStack_160;
  ulong uStack_158;
  ulong uStack_150;
  char *pcStack_148;
  long lStack_140;
  undefined8 uStack_138;
  undefined1 **ppuStack_130;
  undefined *puStack_128;
  ulong uStack_120;
  long lStack_118;
  long lStack_110;
  int iStack_108;
  uint uStack_104;
  ulong uStack_100;
  char *pcStack_f8;
  undefined8 uStack_f0;
  undefined8 uStack_e8;
  float fStack_e0;
  undefined4 uStack_dc;
  long lStack_b8;
  undefined1 *puStack_60;
  undefined *puStack_58;
  int iStack_50;
  int iStack_4c;
  char *pcStack_48;
  undefined8 uStack_40;
  undefined8 uStack_38;
  ulong uStack_30;
  ulong uStack_28;
  long lStack_20;
  undefined1 auStack_6 [6];
  
  _memset(param_1,0xff);
  func_0x006e7378(&uStack0000000000000070,&uStack0000000000000048);
  while (*uStack0000000000000020 != '\0') {
    unaff_x24 = func_0x006fa5c8(&uStack0000000000000028,unaff_x20,&uStack0000000000000020,
                                (long)&uStack0000000000000018 + 4,&uStack0000000000000018);
    uVar12 = uStack0000000000000018._4_4_;
    uVar21 = (uint)uStack0000000000000018;
    unaff_x23 = (ulong)(uint)uStack0000000000000018;
    unaff_x21 = (ulong)uStack0000000000000018._4_4_;
    if (0 < (int)(uint)uStack0000000000000018) {
      iVar4 = (uint)uStack0000000000000018 + 1;
      do {
        if (in_stack_00000078 <= uStack0000000000000070) {
          func_0x006e7288(&uStack0000000000000070,1);
        }
        puVar15 = uStack0000000000000070 + 1;
        *uStack0000000000000070 = 0;
        iVar4 = iVar4 + -1;
        uStack0000000000000070 = puVar15;
      } while (1 < iVar4);
    }
    unaff_x20 = unaff_x20 + (int)(uVar12 + uVar21);
    unaff_x27 = (ulong)((int)unaff_x27 + 1);
    if ((uint)unaff_x24 < 9) {
                    /* WARNING: Could not recover jumptable at 0x006f89cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      uVar5 = (*(code *)(&UNK_006f8928 + (ulong)(byte)unaff_x28[unaff_x24 & 0xffffffff] * 4))();
      return uVar5;
    }
  }
  func_0x006e79b0(&uStack0000000000000070);
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
    return 1;
  }
  uVar6 = ___stack_chk_fail();
  uStack_30 = unaff_x27;
  uStack_28 = unaff_x21;
  lStack_20 = unaff_x20;
  pcStack_48 = (char *)func_0x006e67c8(uVar6,1,0);
  uStack_38 = 0x100000001;
  uStack_40 = uVar6;
  if (*pcStack_48 == '\0') {
    iVar4 = 0;
  }
  else {
    iVar4 = 0;
    do {
      iVar3 = func_0x006fa5c8(&uStack_40,(long)iVar4,&pcStack_48,&iStack_4c,&iStack_50);
      if (0xfffffffd < iVar3 - 6U) {
        func_0x006e63b0(uVar6,1,"variable-length format");
code_r0x006f8ed8:
        uVar6 = func_0x006e63b0(uVar6,1,"format result too large");
        puStack_58 = &DAT_006f8eec;
        lStack_b8 = *(long *)PTR____stack_chk_guard_009b01e8;
        puStack_60 = auStack_6 + -10;
        pcVar7 = (char *)func_0x006e67c8(uVar6,1,0);
        pcStack_f8 = pcVar7;
        lVar8 = func_0x006e67c8(uVar6,2,&uStack_100);
        iVar4 = func_0x006e6c08(uVar6,3,1);
        iVar4 = ((int)uStack_100 + 1U & iVar4 >> 0x1f) + iVar4;
        if (iVar4 < 2) {
          iVar4 = 1;
        }
        uVar5 = (ulong)(iVar4 - 1);
        uVar22 = unaff_x25;
        if (uStack_100 < uVar5) goto code_r0x006f941c;
        uStack_e8 = 0x100000001;
        uStack_f0 = uVar6;
        if (*pcVar7 != '\0') {
          lStack_110 = lVar8 + -1;
          lStack_118 = lVar8 + 8;
          pcVar7 = "too many results";
          unaff_x28 = &UNK_008c836b;
          uVar9 = unaff_x23;
          uVar22 = 0;
          goto code_r0x006f8fd0;
        }
        unaff_x24 = 0;
        goto code_r0x006f939c;
      }
      if (0x40000000 - (iStack_4c + iStack_50) < iVar4) goto code_r0x006f8ed8;
      iVar4 = iStack_4c + iStack_50 + iVar4;
    } while (*pcStack_48 != '\0');
  }
  func_0x006e3870(uVar6,iVar4);
  return 1;
code_r0x006f93e0:
  uStack_120 = unaff_x26;
  func_0x006e644c(uVar6,"%d-byte integer does not fit into Lua Integer");
code_r0x006f93f4:
  func_0x006e63b0(uVar6,2,"data string too short");
  unaff_x23 = uVar9;
code_r0x006f9408:
  func_0x006e63b0(uVar6,2,"unfinished string for format \'z\'");
code_r0x006f941c:
  func_0x006e63b0(uVar6,3,"initial position out of string");
  goto code_r0x006f9430;
code_r0x006f8fd0:
  do {
    unaff_x24 = (ulong)(int)uVar5;
    unaff_x23 = func_0x006fa5c8(&uStack_f0,unaff_x24,&pcStack_f8,&uStack_104,&iStack_108);
    uVar21 = uStack_104;
    unaff_x26 = (ulong)uStack_104;
    unaff_x27 = (ulong)(int)uStack_104;
    if (uStack_100 - unaff_x24 < unaff_x27 + (long)iStack_108) goto code_r0x006f93f4;
    uVar5 = (long)iStack_108 + (long)(int)uVar5;
    func_0x006e6978(uVar6,2,"too many results");
    unaff_x24 = (ulong)((int)uVar22 + 1);
    iVar4 = (int)uVar5;
    unaff_x25 = uVar22;
    uVar9 = unaff_x23;
    switch(unaff_x23 & 0xffffffff) {
    case 0:
      if ((int)uVar21 < 1) {
        uVar18 = 0;
code_r0x006f9214:
        uVar22 = 1L << ((ulong)(uVar21 * 8 - 1) & 0x3f);
        uVar18 = (uVar18 ^ uVar22) - uVar22;
      }
      else {
        uVar12 = uVar21;
        if (7 < (int)uVar21) {
          uVar12 = 8;
        }
        uVar20 = (ulong)uVar12;
        uVar18 = 0;
        if ((int)uStack_e8 == 0) {
          uVar20 = uVar20 + 1;
          iVar4 = uVar21 - uVar12;
          do {
            uVar18 = (ulong)*(byte *)(lVar8 + uVar5 + (long)iVar4) | uVar18 << 8;
            uVar20 = uVar20 - 1;
            iVar4 = iVar4 + 1;
          } while (1 < uVar20);
        }
        else {
          do {
            uVar18 = (ulong)*(byte *)(lStack_110 + uVar5 + uVar20) | uVar18 << 8;
            bVar2 = uVar20 != 0;
            uVar20 = uVar20 - 1;
          } while (bVar2 && uVar20 != 0);
        }
        if ((int)uVar21 < 8) goto code_r0x006f9214;
        iVar4 = uVar21 - 8;
        if (iVar4 != 0) {
          cVar19 = '\0';
          if ((long)uVar18 < 0) {
            cVar19 = -1;
          }
          if ((int)uStack_e8 == 0) {
            iVar4 = uVar21 - 9;
            do {
              if (cVar19 != *(char *)(lVar8 + uVar5 + (long)iVar4)) goto code_r0x006f93e0;
              iVar4 = iVar4 + -1;
            } while (iVar4 != -1);
          }
          else {
            pcVar16 = (char *)(lStack_118 + uVar5);
            do {
              if (cVar19 != *pcVar16) goto code_r0x006f93e0;
              iVar4 = iVar4 + -1;
              pcVar16 = pcVar16 + 1;
            } while (iVar4 != 0);
          }
        }
      }
      dVar23 = (double)(long)uVar18;
      goto code_r0x006f8fb8;
    case 1:
      if ((int)uVar21 < 1) {
        uVar18 = 0;
      }
      else {
        uVar12 = uVar21;
        if (7 < (int)uVar21) {
          uVar12 = 8;
        }
        uVar20 = (ulong)uVar12;
        uVar18 = 0;
        if ((int)uStack_e8 == 0) {
          uVar20 = uVar20 + 1;
          iVar4 = uVar21 - uVar12;
          do {
            uVar18 = (ulong)*(byte *)(lVar8 + uVar5 + (long)iVar4) | uVar18 << 8;
            uVar20 = uVar20 - 1;
            iVar4 = iVar4 + 1;
          } while (1 < uVar20);
        }
        else {
          do {
            uVar18 = (ulong)*(byte *)(lStack_110 + uVar5 + uVar20) | uVar18 << 8;
            bVar2 = uVar20 != 0;
            uVar20 = uVar20 - 1;
          } while (bVar2 && uVar20 != 0);
        }
        if (8 < (int)uVar21) {
          if ((int)uStack_e8 == 0) {
            uVar20 = unaff_x26;
            do {
              if (*(char *)(lVar8 + uVar5 + (long)((int)uVar20 + -9)) != '\0')
              goto code_r0x006f93e0;
              uVar20 = uVar20 - 1;
            } while (uVar20 != 8);
          }
          else {
            lVar11 = unaff_x26 - 8;
            pcVar16 = (char *)(lStack_118 + uVar5);
            do {
              if (*pcVar16 != '\0') goto code_r0x006f93e0;
              lVar11 = lVar11 + -1;
              pcVar16 = pcVar16 + 1;
            } while (lVar11 != 0);
          }
        }
      }
      dVar23 = (double)uVar18;
      goto code_r0x006f8fb8;
    case 2:
      if ((int)uStack_e8 == 1) {
        if (uVar21 != 0) {
          puVar15 = (undefined1 *)(lVar8 + iVar4);
          pfVar14 = &fStack_e0;
          uVar22 = unaff_x26;
          do {
            *(undefined1 *)pfVar14 = *puVar15;
            uVar12 = (int)uVar22 - 1;
            uVar22 = (ulong)uVar12;
            puVar15 = puVar15 + 1;
            pfVar14 = (float *)((long)pfVar14 + 1);
          } while (uVar12 != 0);
          goto code_r0x006f91b8;
        }
      }
      else if (uVar21 != 0) {
        puVar15 = (undefined1 *)((long)&fStack_e0 + unaff_x27);
        puVar13 = (undefined1 *)(lVar8 + iVar4);
        uVar22 = unaff_x26;
        do {
          puVar15 = puVar15 + -1;
          *puVar15 = *puVar13;
          uVar12 = (int)uVar22 - 1;
          uVar22 = (ulong)uVar12;
          puVar13 = puVar13 + 1;
        } while (uVar12 != 0);
code_r0x006f91b8:
        if ((uVar21 != 8) && (uVar21 == 4)) {
          dVar23 = (double)fStack_e0;
          goto code_r0x006f8fb8;
        }
      }
      dVar23 = (double)CONCAT44(uStack_dc,fStack_e0);
code_r0x006f8fb8:
      func_0x006e3850(dVar23,uVar6);
      break;
    case 3:
      func_0x006e38d8(uVar6,lVar8 + iVar4,unaff_x27);
      break;
    case 4:
      lVar11 = lVar8 + uVar5;
      if ((int)uVar21 < 1) {
        uVar9 = 0;
      }
      else {
        uVar12 = uVar21;
        if (7 < (int)uVar21) {
          uVar12 = 8;
        }
        uVar18 = (ulong)uVar12;
        uVar9 = 0;
        if ((int)uStack_e8 == 0) {
          uVar18 = uVar18 + 1;
          iVar3 = uVar21 - uVar12;
          do {
            uVar9 = (ulong)*(byte *)(lVar11 + iVar3) | uVar9 << 8;
            uVar18 = uVar18 - 1;
            iVar3 = iVar3 + 1;
          } while (1 < uVar18);
        }
        else {
          do {
            uVar9 = (ulong)*(byte *)(lStack_110 + uVar5 + uVar18) | uVar9 << 8;
            bVar2 = uVar18 != 0;
            uVar18 = uVar18 - 1;
          } while (bVar2 && uVar18 != 0);
        }
        if (8 < (int)uVar21) {
          if ((int)uStack_e8 == 0) {
            uVar18 = unaff_x26;
            do {
              if (*(char *)(lVar11 + ((int)uVar18 + -9)) != '\0') goto code_r0x006f93e0;
              uVar18 = uVar18 - 1;
            } while (uVar18 != 8);
          }
          else {
            lVar17 = unaff_x26 - 8;
            pcVar16 = (char *)(lStack_118 + uVar5);
            do {
              if (*pcVar16 != '\0') goto code_r0x006f93e0;
              lVar17 = lVar17 + -1;
              pcVar16 = pcVar16 + 1;
            } while (lVar17 != 0);
          }
        }
        if (uStack_100 - (uVar5 + unaff_x27) < uVar9) goto code_r0x006f93f4;
      }
      func_0x006e38d8(uVar6,lVar11 + unaff_x27,uVar9);
      uVar5 = (ulong)(uint)(iVar4 + (int)uVar9);
      unaff_x23 = uVar9;
      break;
    case 5:
      uVar22 = (ulong)iVar4;
      unaff_x27 = lVar8 + uVar22;
      uVar9 = _strlen(unaff_x27);
      if (uVar9 + uVar22 < uStack_100) {
        func_0x006e38d8(uVar6,unaff_x27,uVar9);
        uVar5 = (ulong)(iVar4 + (int)uVar9 + 1);
        unaff_x23 = uVar9;
        unaff_x25 = uVar22;
        break;
      }
      goto code_r0x006f9408;
    case 6:
    case 7:
    case 8:
      unaff_x24 = uVar22;
    }
    uVar21 = (int)uVar5 + uVar21;
    uVar5 = (ulong)uVar21;
    uVar9 = unaff_x23;
    uVar22 = unaff_x24;
  } while (*pcStack_f8 != '\0');
  iVar4 = uVar21 + 1;
code_r0x006f939c:
  func_0x006e3870(uVar6,iVar4);
  uVar22 = unaff_x25;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_b8) {
    return (ulong)((int)unaff_x24 + 1);
  }
code_r0x006f9430:
  auVar24 = ___stack_chk_fail();
  uVar10 = auVar24._0_8_;
  puStack_128 = &DAT_006f9434;
  puStack_180 = unaff_x28;
  uStack_178 = uVar5;
  uStack_170 = unaff_x26;
  uStack_168 = uVar22;
  uStack_160 = unaff_x24;
  uStack_158 = unaff_x23;
  uStack_150 = unaff_x27;
  pcStack_148 = pcVar7;
  lStack_140 = lVar8;
  uStack_138 = uVar6;
  ppuStack_130 = &puStack_60;
  lVar8 = func_0x006e67c8(uVar10,1,&iStack_188);
  pcVar7 = (char *)func_0x006e67c8(uVar10,2,&uStack_190);
  iVar4 = func_0x006e6c08(uVar10,3,1);
  uVar21 = (iStack_188 + 1U & iVar4 >> 0x1f) + iVar4;
  iVar4 = (int)lVar8;
  if ((int)uVar21 < 1) {
    uVar21 = 1;
  }
  else if ((int)(iStack_188 + 1U) < (int)uVar21) goto code_r0x006f968c;
  if (auVar24._8_4_ == 0) {
    uVar5 = uStack_190;
code_r0x006f9584:
    uVar22 = (lVar8 + (ulong)uVar21) - 1;
    lStack_3b8 = lVar8;
    uStack_3a0 = uVar10;
    if (*pcVar7 == '^') {
      uStack_190 = uVar5 - 1;
      auStack_3c0[0] = 200;
      uStack_3b0 = lVar8 + CONCAT44(uStack_184,iStack_188);
      pcStack_3a8 = pcVar7 + uVar5;
      uStack_398 = 0;
      lVar8 = func_0x006f9748(auStack_3c0,uVar22,pcVar7 + 1);
      if (lVar8 != 0) {
joined_r0x006f96c0:
        if (auVar24._8_4_ != 0) {
          func_0x006e3870(uVar10,((int)uVar22 - iVar4) + 1);
          func_0x006e3870(uVar10,(int)lVar8 - iVar4);
          uVar21 = uStack_398;
          func_0x006e6978(uStack_3a0,uStack_398,"too many captures");
          if (0 < (int)uVar21) {
            uVar12 = 0;
            do {
              func_0x006fa2fc(auStack_3c0,uVar12,0,0);
              uVar12 = uVar12 + 1;
            } while (uVar21 != uVar12);
          }
          return (ulong)(uVar21 + 2);
        }
        uVar5 = (ulong)uStack_398;
        uVar21 = uStack_398;
        if (uStack_398 < 2) {
          uVar21 = 1;
        }
        func_0x006e6978(uStack_3a0,(ulong)uVar21,"too many captures");
        if ((int)uVar21 < 1) {
          return uVar5;
        }
        uVar12 = 0;
        do {
          func_0x006fa2fc(auStack_3c0,uVar12,uVar22,lVar8);
          uVar12 = uVar12 + 1;
        } while (uVar21 != uVar12);
        return (ulong)uVar21;
      }
    }
    else {
      auStack_3c0[0] = 200;
      uStack_3b0 = lVar8 + CONCAT44(uStack_184,iStack_188);
      pcStack_3a8 = pcVar7 + uVar5;
      do {
        uStack_398 = 0;
        lVar8 = func_0x006f9748(auStack_3c0,uVar22,pcVar7);
        if (lVar8 != 0) goto joined_r0x006f96c0;
        bVar2 = uVar22 < uStack_3b0;
        uVar22 = uVar22 + 1;
      } while (bVar2);
    }
  }
  else {
    iVar3 = func_0x006e2c48(uVar10,4);
    uVar5 = uStack_190;
    if (iVar3 == 0) {
      uVar22 = 0;
      do {
        lVar11 = _strpbrk(pcVar7 + uVar22,"^$*+?.([%-");
        if (lVar11 != 0) goto code_r0x006f9584;
        lVar11 = _strlen(pcVar7 + uVar22);
        uVar22 = uVar22 + lVar11 + 1;
      } while (uVar22 <= uVar5);
    }
    lVar8 = lVar8 + (ulong)uVar21 + -1;
    if (uVar5 == 0) {
code_r0x006f9720:
      iVar4 = (int)lVar8 - iVar4;
      func_0x006e3870(uVar10,iVar4 + 1);
      func_0x006e3870(uVar10,iVar4 + (int)uStack_190);
      return 2;
    }
    uVar22 = (CONCAT44(uStack_184,iStack_188) - (ulong)uVar21) + 1;
    if (uVar5 <= uVar22) {
      lVar11 = uVar22 - (uVar5 - 1);
      if (lVar11 != 0) {
        cVar19 = *pcVar7;
        lVar17 = lVar8;
        do {
          lVar8 = _memchr(lVar17,(long)cVar19,lVar11);
          if (lVar8 == 0) break;
          lVar1 = lVar8 + 1;
          iVar3 = _memcmp(lVar1,pcVar7 + 1,uVar5 - 1);
          if (iVar3 == 0) goto code_r0x006f9720;
          lVar11 = (lVar11 + lVar17) - lVar1;
          lVar17 = lVar1;
        } while (lVar11 != 0);
      }
    }
  }
code_r0x006f968c:
  func_0x006e383c(uVar10);
  return 1;
}

