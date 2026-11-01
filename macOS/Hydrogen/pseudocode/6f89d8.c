
ulong FUN_006f89d8(void)

{
  long lVar1;
  bool bVar2;
  int iVar3;
  int iVar4;
  undefined8 uVar5;
  char *pcVar6;
  ulong uVar7;
  undefined8 uVar8;
  long lVar9;
  uint uVar10;
  ulong uVar11;
  long lVar12;
  float *pfVar13;
  char *pcVar14;
  undefined1 *puVar15;
  undefined1 *puVar16;
  ulong uVar17;
  undefined1 *puVar18;
  char cVar19;
  ulong uVar20;
  long unaff_x20;
  ulong unaff_x21;
  ulong unaff_x22;
  long lVar21;
  ulong unaff_x23;
  ulong unaff_x24;
  ulong unaff_x25;
  uint uVar22;
  undefined1 *unaff_x26;
  ulong unaff_x27;
  ulong uVar23;
  undefined *unaff_x28;
  long unaff_x29;
  double dVar24;
  undefined1 auVar25 [12];
  long in_stack_00000008;
  long in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  undefined1 uStack0000000000000028;
  int in_stack_00000030;
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
  undefined1 *puStack_170;
  ulong uStack_168;
  ulong uStack_160;
  ulong uStack_158;
  ulong uStack_150;
  char *pcStack_148;
  long lStack_140;
  undefined8 uStack_138;
  undefined1 **ppuStack_130;
  undefined *puStack_128;
  undefined1 *puStack_120;
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
  
  dVar24 = (double)func_0x006e6a4c();
  uVar11 = (ulong)dVar24;
  iVar4 = (int)unaff_x21;
  if ((iVar4 < 8) &&
     (lVar12 = 1L << ((ulong)(iVar4 * 8 - 1) & 0x3f),
     -uVar11 != lVar12 && (long)uVar11 <= -lVar12 || lVar12 <= (long)uVar11)) {
    func_0x006e63b0();
    func_0x006e63b0();
    func_0x006e63b0();
  }
  else {
    uVar10 = iVar4 - 1;
    uVar22 = uVar10;
    if (in_stack_00000030 != 0) {
      uVar22 = 0;
    }
    *(char *)(unaff_x25 + (long)(int)uVar22) = (char)uVar11;
    if (1 < iVar4) {
      lVar12 = unaff_x21 - 1;
      if (in_stack_00000030 == 0) {
        puVar15 = (undefined1 *)(in_stack_00000010 + (ulong)uVar10);
        uVar23 = uVar11;
        do {
          *puVar15 = (char)(uVar23 >> 8);
          lVar12 = lVar12 + -1;
          puVar15 = puVar15 + -1;
          uVar23 = uVar23 >> 8;
        } while (lVar12 != 0);
      }
      else {
        puVar15 = unaff_x26;
        uVar23 = uVar11;
        do {
          *puVar15 = (char)(uVar23 >> 8);
          lVar12 = lVar12 + -1;
          puVar15 = puVar15 + 1;
          uVar23 = uVar23 >> 8;
        } while (lVar12 != 0);
      }
      if ((8 < iVar4) && ((long)uVar11 < 0)) {
        if (in_stack_00000030 == 0) {
          in_stack_00000008 = (unaff_x25 - (iVar4 - 9)) + (ulong)uVar10 + -8;
        }
        _memset(in_stack_00000008,0xff,iVar4 + -8);
      }
    }
    func_0x006e7378(&uStack0000000000000070,&uStack0000000000000048);
    unaff_x22 = unaff_x27;
    while (*uStack0000000000000020 != '\0') {
      unaff_x24 = func_0x006fa5c8(&uStack0000000000000028,unaff_x20,&uStack0000000000000020,
                                  (long)&uStack0000000000000018 + 4,&uStack0000000000000018);
      uVar10 = uStack0000000000000018._4_4_;
      uVar22 = (uint)uStack0000000000000018;
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
      unaff_x20 = unaff_x20 + (int)(uVar10 + uVar22);
      unaff_x22 = (ulong)((int)unaff_x22 + 1);
      if ((uint)unaff_x24 < 9) {
                    /* WARNING: Could not recover jumptable at 0x006f89cc. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        uVar11 = (*(code *)(&UNK_006f8928 + (ulong)(byte)unaff_x28[unaff_x24 & 0xffffffff] * 4))();
        return uVar11;
      }
    }
    func_0x006e79b0(&uStack0000000000000070);
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x60)) {
      return 1;
    }
  }
  uVar5 = ___stack_chk_fail();
  uStack_30 = unaff_x22;
  uStack_28 = unaff_x21;
  lStack_20 = unaff_x20;
  pcStack_48 = (char *)func_0x006e67c8(uVar5,1,0);
  uStack_38 = 0x100000001;
  uStack_40 = uVar5;
  if (*pcStack_48 == '\0') {
    iVar4 = 0;
  }
  else {
    iVar4 = 0;
    do {
      iVar3 = func_0x006fa5c8(&uStack_40,(long)iVar4,&pcStack_48,&iStack_4c,&iStack_50);
      if (0xfffffffd < iVar3 - 6U) {
        func_0x006e63b0(uVar5,1,"variable-length format");
code_r0x006f8ed8:
        uVar5 = func_0x006e63b0(uVar5,1,"format result too large");
        puStack_58 = &DAT_006f8eec;
        lStack_b8 = *(long *)PTR____stack_chk_guard_009b01e8;
        puStack_60 = auStack_6 + -10;
        pcVar6 = (char *)func_0x006e67c8(uVar5,1,0);
        pcStack_f8 = pcVar6;
        lVar12 = func_0x006e67c8(uVar5,2,&uStack_100);
        iVar4 = func_0x006e6c08(uVar5,3,1);
        iVar4 = ((int)uStack_100 + 1U & iVar4 >> 0x1f) + iVar4;
        if (iVar4 < 2) {
          iVar4 = 1;
        }
        uVar11 = (ulong)(iVar4 - 1);
        uVar23 = unaff_x25;
        if (uStack_100 < uVar11) goto LAB_006f941c;
        uStack_e8 = 0x100000001;
        uStack_f0 = uVar5;
        if (*pcVar6 != '\0') {
          lStack_110 = lVar12 + -1;
          lStack_118 = lVar12 + 8;
          pcVar6 = "too many results";
          unaff_x28 = &UNK_008c836b;
          uVar7 = unaff_x23;
          uVar23 = 0;
          goto LAB_006f8fd0;
        }
        unaff_x24 = 0;
        goto code_r0x006f939c;
      }
      if (0x40000000 - (iStack_4c + iStack_50) < iVar4) goto code_r0x006f8ed8;
      iVar4 = iStack_4c + iStack_50 + iVar4;
    } while (*pcStack_48 != '\0');
  }
  func_0x006e3870(uVar5,iVar4);
  return 1;
code_r0x006f93e0:
  puStack_120 = unaff_x26;
  func_0x006e644c(uVar5,"%d-byte integer does not fit into Lua Integer");
code_r0x006f93f4:
  func_0x006e63b0(uVar5,2,"data string too short");
  unaff_x23 = uVar7;
code_r0x006f9408:
  func_0x006e63b0(uVar5,2,"unfinished string for format \'z\'");
LAB_006f941c:
  func_0x006e63b0(uVar5,3,"initial position out of string");
  goto code_r0x006f9430;
LAB_006f8fd0:
  do {
    unaff_x24 = (ulong)(int)uVar11;
    unaff_x23 = func_0x006fa5c8(&uStack_f0,unaff_x24,&pcStack_f8,&uStack_104,&iStack_108);
    uVar22 = uStack_104;
    unaff_x26 = (undefined1 *)(ulong)uStack_104;
    unaff_x22 = (ulong)(int)uStack_104;
    if (uStack_100 - unaff_x24 < unaff_x22 + (long)iStack_108) goto code_r0x006f93f4;
    uVar11 = (long)iStack_108 + (long)(int)uVar11;
    func_0x006e6978(uVar5,2,"too many results");
    unaff_x24 = (ulong)((int)uVar23 + 1);
    iVar4 = (int)uVar11;
    unaff_x25 = uVar23;
    uVar7 = unaff_x23;
    switch(unaff_x23 & 0xffffffff) {
    case 0:
      if ((int)uVar22 < 1) {
        uVar17 = 0;
code_r0x006f9214:
        uVar23 = 1L << ((ulong)(uVar22 * 8 - 1) & 0x3f);
        uVar17 = (uVar17 ^ uVar23) - uVar23;
      }
      else {
        uVar10 = uVar22;
        if (7 < (int)uVar22) {
          uVar10 = 8;
        }
        uVar20 = (ulong)uVar10;
        uVar17 = 0;
        if ((int)uStack_e8 == 0) {
          uVar20 = uVar20 + 1;
          iVar4 = uVar22 - uVar10;
          do {
            uVar17 = (ulong)*(byte *)(lVar12 + uVar11 + (long)iVar4) | uVar17 << 8;
            uVar20 = uVar20 - 1;
            iVar4 = iVar4 + 1;
          } while (1 < uVar20);
        }
        else {
          do {
            uVar17 = (ulong)*(byte *)(lStack_110 + uVar11 + uVar20) | uVar17 << 8;
            bVar2 = uVar20 != 0;
            uVar20 = uVar20 - 1;
          } while (bVar2 && uVar20 != 0);
        }
        if ((int)uVar22 < 8) goto code_r0x006f9214;
        iVar4 = uVar22 - 8;
        if (iVar4 != 0) {
          cVar19 = '\0';
          if ((long)uVar17 < 0) {
            cVar19 = -1;
          }
          if ((int)uStack_e8 == 0) {
            iVar4 = uVar22 - 9;
            do {
              if (cVar19 != *(char *)(lVar12 + uVar11 + (long)iVar4)) goto code_r0x006f93e0;
              iVar4 = iVar4 + -1;
            } while (iVar4 != -1);
          }
          else {
            pcVar14 = (char *)(lStack_118 + uVar11);
            do {
              if (cVar19 != *pcVar14) goto code_r0x006f93e0;
              iVar4 = iVar4 + -1;
              pcVar14 = pcVar14 + 1;
            } while (iVar4 != 0);
          }
        }
      }
      dVar24 = (double)(long)uVar17;
      goto code_r0x006f8fb8;
    case 1:
      if ((int)uVar22 < 1) {
        uVar17 = 0;
      }
      else {
        uVar10 = uVar22;
        if (7 < (int)uVar22) {
          uVar10 = 8;
        }
        uVar20 = (ulong)uVar10;
        uVar17 = 0;
        if ((int)uStack_e8 == 0) {
          uVar20 = uVar20 + 1;
          iVar4 = uVar22 - uVar10;
          do {
            uVar17 = (ulong)*(byte *)(lVar12 + uVar11 + (long)iVar4) | uVar17 << 8;
            uVar20 = uVar20 - 1;
            iVar4 = iVar4 + 1;
          } while (1 < uVar20);
        }
        else {
          do {
            uVar17 = (ulong)*(byte *)(lStack_110 + uVar11 + uVar20) | uVar17 << 8;
            bVar2 = uVar20 != 0;
            uVar20 = uVar20 - 1;
          } while (bVar2 && uVar20 != 0);
        }
        if (8 < (int)uVar22) {
          if ((int)uStack_e8 == 0) {
            puVar15 = unaff_x26;
            do {
              if (*(char *)(lVar12 + uVar11 + (long)((int)puVar15 + -9)) != '\0')
              goto code_r0x006f93e0;
              puVar15 = puVar15 + -1;
            } while ((dword *)puVar15 != &MACH_HEADER.cpusubtype);
          }
          else {
            puVar15 = unaff_x26 + -8;
            pcVar14 = (char *)(lStack_118 + uVar11);
            do {
              if (*pcVar14 != '\0') goto code_r0x006f93e0;
              puVar15 = puVar15 + -1;
              pcVar14 = pcVar14 + 1;
            } while (puVar15 != (undefined1 *)0x0);
          }
        }
      }
      dVar24 = (double)uVar17;
      goto code_r0x006f8fb8;
    case 2:
      if ((int)uStack_e8 == 1) {
        if (uVar22 != 0) {
          puVar15 = (undefined1 *)(lVar12 + iVar4);
          pfVar13 = &fStack_e0;
          puVar16 = unaff_x26;
          do {
            *(undefined1 *)pfVar13 = *puVar15;
            uVar10 = (int)puVar16 - 1;
            puVar16 = (undefined1 *)(ulong)uVar10;
            puVar15 = puVar15 + 1;
            pfVar13 = (float *)((long)pfVar13 + 1);
          } while (uVar10 != 0);
          goto code_r0x006f91b8;
        }
      }
      else if (uVar22 != 0) {
        puVar15 = (undefined1 *)((long)&fStack_e0 + unaff_x22);
        puVar16 = (undefined1 *)(lVar12 + iVar4);
        puVar18 = unaff_x26;
        do {
          puVar15 = puVar15 + -1;
          *puVar15 = *puVar16;
          uVar10 = (int)puVar18 - 1;
          puVar18 = (undefined1 *)(ulong)uVar10;
          puVar16 = puVar16 + 1;
        } while (uVar10 != 0);
code_r0x006f91b8:
        if ((uVar22 != 8) && (uVar22 == 4)) {
          dVar24 = (double)fStack_e0;
          goto code_r0x006f8fb8;
        }
      }
      dVar24 = (double)CONCAT44(uStack_dc,fStack_e0);
code_r0x006f8fb8:
      func_0x006e3850(dVar24,uVar5);
      break;
    case 3:
      func_0x006e38d8(uVar5,lVar12 + iVar4,unaff_x22);
      break;
    case 4:
      lVar9 = lVar12 + uVar11;
      if ((int)uVar22 < 1) {
        uVar7 = 0;
      }
      else {
        uVar10 = uVar22;
        if (7 < (int)uVar22) {
          uVar10 = 8;
        }
        uVar17 = (ulong)uVar10;
        uVar7 = 0;
        if ((int)uStack_e8 == 0) {
          uVar17 = uVar17 + 1;
          iVar3 = uVar22 - uVar10;
          do {
            uVar7 = (ulong)*(byte *)(lVar9 + iVar3) | uVar7 << 8;
            uVar17 = uVar17 - 1;
            iVar3 = iVar3 + 1;
          } while (1 < uVar17);
        }
        else {
          do {
            uVar7 = (ulong)*(byte *)(lStack_110 + uVar11 + uVar17) | uVar7 << 8;
            bVar2 = uVar17 != 0;
            uVar17 = uVar17 - 1;
          } while (bVar2 && uVar17 != 0);
        }
        if (8 < (int)uVar22) {
          if ((int)uStack_e8 == 0) {
            puVar15 = unaff_x26;
            do {
              if (*(char *)(lVar9 + ((int)puVar15 + -9)) != '\0') goto code_r0x006f93e0;
              puVar15 = puVar15 + -1;
            } while ((dword *)puVar15 != &MACH_HEADER.cpusubtype);
          }
          else {
            puVar15 = unaff_x26 + -8;
            pcVar14 = (char *)(lStack_118 + uVar11);
            do {
              if (*pcVar14 != '\0') goto code_r0x006f93e0;
              puVar15 = puVar15 + -1;
              pcVar14 = pcVar14 + 1;
            } while (puVar15 != (undefined1 *)0x0);
          }
        }
        if (uStack_100 - (uVar11 + unaff_x22) < uVar7) goto code_r0x006f93f4;
      }
      func_0x006e38d8(uVar5,lVar9 + unaff_x22,uVar7);
      uVar11 = (ulong)(uint)(iVar4 + (int)uVar7);
      unaff_x23 = uVar7;
      break;
    case 5:
      uVar23 = (ulong)iVar4;
      unaff_x22 = lVar12 + uVar23;
      uVar7 = _strlen(unaff_x22);
      if (uVar7 + uVar23 < uStack_100) {
        func_0x006e38d8(uVar5,unaff_x22,uVar7);
        uVar11 = (ulong)(iVar4 + (int)uVar7 + 1);
        unaff_x23 = uVar7;
        unaff_x25 = uVar23;
        break;
      }
      goto code_r0x006f9408;
    case 6:
    case 7:
    case 8:
      unaff_x24 = uVar23;
    }
    uVar22 = (int)uVar11 + uVar22;
    uVar11 = (ulong)uVar22;
    uVar7 = unaff_x23;
    uVar23 = unaff_x24;
  } while (*pcStack_f8 != '\0');
  iVar4 = uVar22 + 1;
code_r0x006f939c:
  func_0x006e3870(uVar5,iVar4);
  uVar23 = unaff_x25;
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_b8) {
    return (ulong)((int)unaff_x24 + 1);
  }
code_r0x006f9430:
  auVar25 = ___stack_chk_fail();
  uVar8 = auVar25._0_8_;
  puStack_128 = &DAT_006f9434;
  puStack_180 = unaff_x28;
  uStack_178 = uVar11;
  puStack_170 = unaff_x26;
  uStack_168 = uVar23;
  uStack_160 = unaff_x24;
  uStack_158 = unaff_x23;
  uStack_150 = unaff_x22;
  pcStack_148 = pcVar6;
  lStack_140 = lVar12;
  uStack_138 = uVar5;
  ppuStack_130 = &puStack_60;
  lVar12 = func_0x006e67c8(uVar8,1,&iStack_188);
  pcVar6 = (char *)func_0x006e67c8(uVar8,2,&uStack_190);
  iVar4 = func_0x006e6c08(uVar8,3,1);
  uVar22 = (iStack_188 + 1U & iVar4 >> 0x1f) + iVar4;
  iVar4 = (int)lVar12;
  if ((int)uVar22 < 1) {
    uVar22 = 1;
  }
  else if ((int)(iStack_188 + 1U) < (int)uVar22) goto LAB_006f968c;
  if (auVar25._8_4_ == 0) {
    uVar11 = uStack_190;
code_r0x006f9584:
    uVar23 = (lVar12 + (ulong)uVar22) - 1;
    lStack_3b8 = lVar12;
    uStack_3a0 = uVar8;
    if (*pcVar6 == '^') {
      uStack_190 = uVar11 - 1;
      auStack_3c0[0] = 200;
      uStack_3b0 = lVar12 + CONCAT44(uStack_184,iStack_188);
      pcStack_3a8 = pcVar6 + uVar11;
      uStack_398 = 0;
      lVar12 = func_0x006f9748(auStack_3c0,uVar23,pcVar6 + 1);
      if (lVar12 != 0) {
joined_r0x006f96c0:
        if (auVar25._8_4_ != 0) {
          func_0x006e3870(uVar8,((int)uVar23 - iVar4) + 1);
          func_0x006e3870(uVar8,(int)lVar12 - iVar4);
          uVar22 = uStack_398;
          func_0x006e6978(uStack_3a0,uStack_398,"too many captures");
          if (0 < (int)uVar22) {
            uVar10 = 0;
            do {
              func_0x006fa2fc(auStack_3c0,uVar10,0,0);
              uVar10 = uVar10 + 1;
            } while (uVar22 != uVar10);
          }
          return (ulong)(uVar22 + 2);
        }
        uVar11 = (ulong)uStack_398;
        uVar22 = uStack_398;
        if (uStack_398 < 2) {
          uVar22 = 1;
        }
        func_0x006e6978(uStack_3a0,(ulong)uVar22,"too many captures");
        if ((int)uVar22 < 1) {
          return uVar11;
        }
        uVar10 = 0;
        do {
          func_0x006fa2fc(auStack_3c0,uVar10,uVar23,lVar12);
          uVar10 = uVar10 + 1;
        } while (uVar22 != uVar10);
        return (ulong)uVar22;
      }
    }
    else {
      auStack_3c0[0] = 200;
      uStack_3b0 = lVar12 + CONCAT44(uStack_184,iStack_188);
      pcStack_3a8 = pcVar6 + uVar11;
      do {
        uStack_398 = 0;
        lVar12 = func_0x006f9748(auStack_3c0,uVar23,pcVar6);
        if (lVar12 != 0) goto joined_r0x006f96c0;
        bVar2 = uVar23 < uStack_3b0;
        uVar23 = uVar23 + 1;
      } while (bVar2);
    }
  }
  else {
    iVar3 = func_0x006e2c48(uVar8,4);
    uVar11 = uStack_190;
    if (iVar3 == 0) {
      uVar23 = 0;
      do {
        lVar9 = _strpbrk(pcVar6 + uVar23,"^$*+?.([%-");
        if (lVar9 != 0) goto code_r0x006f9584;
        lVar9 = _strlen(pcVar6 + uVar23);
        uVar23 = uVar23 + lVar9 + 1;
      } while (uVar23 <= uVar11);
    }
    lVar12 = lVar12 + (ulong)uVar22 + -1;
    if (uVar11 == 0) {
code_r0x006f9720:
      iVar4 = (int)lVar12 - iVar4;
      func_0x006e3870(uVar8,iVar4 + 1);
      func_0x006e3870(uVar8,iVar4 + (int)uStack_190);
      return 2;
    }
    uVar23 = (CONCAT44(uStack_184,iStack_188) - (ulong)uVar22) + 1;
    if (uVar11 <= uVar23) {
      lVar9 = uVar23 - (uVar11 - 1);
      if (lVar9 != 0) {
        cVar19 = *pcVar6;
        lVar21 = lVar12;
        do {
          lVar12 = _memchr(lVar21,(long)cVar19,lVar9);
          if (lVar12 == 0) break;
          lVar1 = lVar12 + 1;
          iVar3 = _memcmp(lVar1,pcVar6 + 1,uVar11 - 1);
          if (iVar3 == 0) goto code_r0x006f9720;
          lVar9 = (lVar9 + lVar21) - lVar1;
          lVar21 = lVar1;
        } while (lVar9 != 0);
      }
    }
  }
LAB_006f968c:
  func_0x006e383c(uVar8);
  return 1;
}

