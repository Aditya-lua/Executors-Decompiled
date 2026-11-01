
/* WARNING: Removing unreachable block (ram,0x0004e41c) */
/* WARNING: Removing unreachable block (ram,0x0004e2e8) */
/* WARNING: Removing unreachable block (ram,0x0004e06c) */
/* WARNING: Removing unreachable block (ram,0x0004e088) */
/* WARNING: Removing unreachable block (ram,0x0004e1a4) */
/* WARNING: Removing unreachable block (ram,0x0004e32c) */
/* WARNING: Removing unreachable block (ram,0x0004e464) */
/* WARNING: Removing unreachable block (ram,0x0004e4bc) */
/* WARNING: Removing unreachable block (ram,0x0004e4c8) */
/* WARNING: Removing unreachable block (ram,0x0004e4dc) */
/* WARNING: Removing unreachable block (ram,0x0004e6d4) */
/* WARNING: Removing unreachable block (ram,0x0004e6e4) */

void FUN_0004df58(undefined8 param_1,undefined8 param_2,ulong param_3)

{
  char *pcVar1;
  char *pcVar2;
  long *plVar3;
  ulong uVar4;
  byte bVar5;
  byte bVar6;
  undefined1 uVar7;
  undefined4 uVar8;
  ulong uVar9;
  code *pcVar10;
  bool bVar11;
  char cVar12;
  int iVar13;
  long extraout_x1;
  int extraout_w8;
  ulong uVar14;
  char *pcVar15;
  char *extraout_x9;
  char *pcVar16;
  long extraout_x10;
  char *extraout_x11;
  char *pcVar17;
  char *pcVar18;
  ulong uVar19;
  char *pcVar20;
  char *unaff_x21;
  long lVar21;
  long unaff_x25;
  undefined8 unaff_x27;
  long unaff_x29;
  undefined8 uVar22;
  undefined1 auVar23 [16];
  undefined8 *in_stack_00000008;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  undefined4 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000068;
  long in_stack_00000070;
  undefined8 uStack0000000000000080;
  ulong in_stack_00000088;
  undefined7 uStack0000000000000090;
  ulong uStack00000000000000a8;
  undefined8 in_stack_000000b0;
  undefined8 uStack00000000000000b8;
  undefined8 in_stack_000000c8;
  
  bVar6 = *(byte *)(unaff_x29 + -0x89);
  uStack00000000000000a8 = param_3;
  uVar8 = (undefined4)uStack0000000000000060;
  *(undefined4 *)(unaff_x25 + 0x13) = uStack0000000000000060._3_4_;
  in_stack_000000b0._4_4_ = CONCAT13(bVar6,in_stack_000000b0._4_3_);
  if (_uStack0000000000000090 < 0) {
    __ZdlPv(uStack0000000000000080);
  }
  uVar14 = (ulong)(uint)(int)(char)bVar6;
  pcVar15 = unaff_x21;
  pcVar16 = unaff_x21 + uStack00000000000000a8;
  if (-1 < (char)bVar6) {
    pcVar15 = (char *)((long)register0x00000008 + 0xa0);
    pcVar16 = (char *)((long)register0x00000008 + 0xa0) + bVar6;
  }
  if (pcVar15 != pcVar16) {
    do {
      cVar12 = ___tolower((long)*pcVar15);
      pcVar20 = pcVar15 + 1;
      *pcVar15 = cVar12;
      pcVar15 = pcVar20;
    } while (pcVar20 != pcVar16);
    uVar14 = (ulong)bVar6;
  }
  uVar9 = uStack00000000000000a8;
  uVar19 = uVar14 & 0xff;
  uVar4 = uStack00000000000000a8;
  if (-1 < (char)uVar14) {
    uVar4 = uVar19;
  }
  if (((uint)uVar14 >> 7 & 1) == 0) {
    if ((uint)uVar19 == 0) {
      lVar21 = 0;
      do {
        uVar14 = *(ulong *)(lVar21 + 0xa27df0);
        if (-1 < (char)*(byte *)(lVar21 + 0xa27dff)) {
          uVar14 = (ulong)*(byte *)(lVar21 + 0xa27dff);
        }
        if (uVar4 == uVar14) goto code_r0x0004e058;
        lVar21 = lVar21 + 0x18;
      } while (lVar21 != 0xaf8);
    }
    else {
      pcVar15 = (char *)0xa27de8;
      do {
        bVar5 = pcVar15[0x17];
        uVar14 = *(ulong *)(pcVar15 + 8);
        if (-1 < (char)bVar5) {
          uVar14 = (ulong)bVar5;
        }
        if (uVar4 == uVar14) {
          pcVar16 = *(char **)pcVar15;
          if (-1 < (char)bVar5) {
            pcVar16 = pcVar15;
          }
          pcVar20 = (char *)((long)register0x00000008 + 0xa0);
          uVar14 = uVar19;
          while (*pcVar20 == *pcVar16) {
            pcVar20 = pcVar20 + 1;
            pcVar16 = pcVar16 + 1;
            uVar14 = uVar14 - 1;
            if (uVar14 == 0) goto code_r0x0004e058;
          }
        }
        pcVar15 = pcVar15 + 0x18;
      } while (pcVar15 != (char *)0xa288e0);
    }
  }
  else {
    lVar21 = 0;
    do {
      bVar5 = *(byte *)(lVar21 + 0xa27dff);
      uVar14 = *(ulong *)(lVar21 + 0xa27df0);
      if (-1 < (char)bVar5) {
        uVar14 = (ulong)bVar5;
      }
      if (uVar4 == uVar14) {
        plVar3 = (long *)*(long *)(lVar21 + 0xa27de8);
        if (-1 < (char)bVar5) {
          plVar3 = (long *)(lVar21 + 0xa27de8);
        }
        iVar13 = _memcmp(unaff_x21,plVar3,uVar9);
        if (iVar13 == 0) goto code_r0x0004e058;
      }
      lVar21 = lVar21 + 0x18;
    } while (lVar21 != 0xaf8);
  }
  if ((uint)uVar19 >> 7 != 0) {
    __ZdlPv(unaff_x21);
  }
  pcVar15 = pcRam0000000000a33930;
  if (cRam0000000000a33947 < '\0') {
    func_0x00017634(unaff_x29 + -0xa0,pcRam0000000000a33930,uRam0000000000a33938);
  }
  else {
    *(ulong *)(unaff_x29 + -0x98) = uRam0000000000a33938;
    *(char **)(unaff_x29 + -0xa0) = pcVar15;
    *(ulong *)(unaff_x29 + -0x90) = CONCAT17(cRam0000000000a33947,uRam0000000000a33940);
  }
  func_0x0001754c(unaff_x29 + -0xa0,&uStack00000000000000b8);
  func_0x0004e9b0((long)register0x00000008 + 0xa0,unaff_x29 + -0xa0);
  if ((char)bVar6 < '\0') {
    func_0x00017634(&uStack0000000000000080,unaff_x21,uStack00000000000000a8);
  }
  else {
    in_stack_00000088 = uStack00000000000000a8;
    _uStack0000000000000090 = CONCAT44(in_stack_000000b0._4_4_,uVar8);
    uStack0000000000000080 = unaff_x21;
  }
  uStack0000000000000060 = 0;
  in_stack_00000068 = 0;
  in_stack_00000070 = 0;
  while ((__ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
                    (unaff_x29 + -0xa0,&uStack0000000000000080,0),
         *(char *)(unaff_x29 + -0xa0) == -1 || *(char *)(unaff_x29 + -0xa0) == '\0' &&
         (__ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080),
         extraout_x1 != 0))) {
    auVar23 = __ZNKSt3__14__fs10filesystem4path10__filenameEv(&uStack0000000000000080);
    uVar14 = auVar23._8_8_;
    if (0x7ffffffffffffff7 < uVar14) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar14 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar23[8];
      lVar21 = unaff_x29 + -0xa0;
      if (uVar14 != 0) goto code_r0x0004e29c;
    }
    else {
      uVar4 = (uVar14 & 0xfffffffffffffff8) + 8;
      if ((uVar14 | 7) != 0x17) {
        uVar4 = uVar14 | 7;
      }
      lVar21 = __Znwm(uVar4 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar14;
      *(ulong *)(unaff_x29 + -0x90) = uVar4 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar21;
code_r0x0004e29c:
      _memmove(lVar21,auVar23._0_8_,uVar14);
    }
    *(undefined1 *)(lVar21 + uVar14) = 0;
    uStack0000000000000030._0_7_ =
         CONCAT43(*(undefined4 *)(unaff_x29 + -0x8d),(int3)*(undefined4 *)(unaff_x29 + -0x90));
    pcVar15 = uStack0000000000000030;
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined4 *)(unaff_x29 + -0x70) = (undefined4)uStack0000000000000030;
    *(undefined4 *)(unaff_x29 + -0x6d) = *(undefined4 *)(unaff_x29 + -0x8d);
    *(undefined1 *)(unaff_x29 + -0x69) = *(undefined1 *)(unaff_x29 + -0x89);
    uStack0000000000000030 = pcVar15;
    func_0x0001754c(unaff_x29 + -0x80,&uStack0000000000000060);
    if (in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
    }
    in_stack_00000068 = *(undefined8 *)(unaff_x29 + -0x78);
    uStack0000000000000060 = *(undefined8 *)(unaff_x29 + -0x80);
    in_stack_00000070 = *(long *)(unaff_x29 + -0x70);
    *(undefined1 *)(unaff_x29 + -0x69) = 0;
    *(undefined1 *)(unaff_x29 + -0x80) = 0;
    auVar23 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080);
    uVar14 = auVar23._8_8_;
    if (0x7ffffffffffffff7 < uVar14) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar14 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar23[8];
      lVar21 = unaff_x29 + -0xa0;
      if (uVar14 != 0) goto code_r0x0004e39c;
    }
    else {
      uVar4 = (uVar14 & 0xfffffffffffffff8) + 8;
      if ((uVar14 | 7) != 0x17) {
        uVar4 = uVar14 | 7;
      }
      lVar21 = __Znwm(uVar4 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar14;
      *(ulong *)(unaff_x29 + -0x90) = uVar4 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar21;
code_r0x0004e39c:
      _memmove(lVar21,auVar23._0_8_,uVar14);
    }
    *(undefined1 *)(lVar21 + uVar14) = 0;
    pcVar15 = *(char **)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined8 *)(unaff_x25 + 0x57) = *(undefined8 *)(unaff_x29 + -0x91);
    uVar7 = *(undefined1 *)(unaff_x29 + -0x89);
    if (_uStack0000000000000090 < 0) {
      __ZdlPv(uStack0000000000000080);
    }
    *(undefined8 *)((ulong)&uStack0000000000000080 | 8) = *(undefined8 *)(unaff_x29 + -0x80);
    *(undefined8 *)((long)((ulong)&uStack0000000000000080 | 8) + 7) =
         *(undefined8 *)(unaff_x25 + 0x57);
    _uStack0000000000000090 = CONCAT17(uVar7,uStack0000000000000090);
    uStack0000000000000080 = pcVar15;
  }
  uStack0000000000000050 = 0;
  in_stack_00000058 = __ZNSt3__115system_categoryEv();
  __ZNSt3__14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0xa0,&uStack0000000000000080,&uStack0000000000000050);
  if (uStack0000000000000050 == 0) {
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0x90);
    func_0x0001754c(unaff_x29 + -0x80,&uStack0000000000000060);
    func_0x0004e9b0(in_stack_00000008,unaff_x29 + -0x80);
    if (*(char *)((long)in_stack_00000008 + 0x17) < '\0') {
      func_0x00017634(unaff_x29 + -0x80,*in_stack_00000008,in_stack_00000008[1]);
    }
    else {
      uVar22 = *in_stack_00000008;
      *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000008[1];
      *(undefined8 *)(unaff_x29 + -0x80) = uVar22;
      *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000008[2];
    }
    while( true ) {
      bVar5 = *(byte *)(unaff_x29 + -0x69);
      uVar14 = (ulong)bVar5;
      if ((bVar5 < 2) || (*(char *)(unaff_x29 + -0x81 + uVar14) != '/')) break;
      *(char *)(unaff_x29 + -0x69) = (char)(uVar14 - 1);
      *(undefined1 *)(unaff_x29 + -0x80 + (uVar14 - 1)) = 0;
    }
    uStack0000000000000030 = (char *)0x0;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar4 = *(ulong *)(unaff_x29 + -0x78);
    lVar21 = *(long *)(unaff_x29 + -0x80);
    if (-1 < (char)bVar5) {
      uVar4 = uVar14;
      lVar21 = unaff_x29 + -0x80;
    }
    func_0x00017184(&uStack0000000000000030,lVar21,lVar21 + uVar4);
    if (*(char *)((long)in_stack_00000008 + 0x17) < '\0') {
      __ZdlPv(*in_stack_00000008);
    }
    in_stack_00000008[1] = in_stack_00000038;
    *in_stack_00000008 = uStack0000000000000030;
    in_stack_00000008[2] = in_stack_00000040;
    if (cRam0000000000a33947 < '\0') {
      func_0x00017634(&uStack0000000000000030,pcRam0000000000a33930,uRam0000000000a33938);
    }
    else {
      in_stack_00000038 = uRam0000000000a33938;
      uStack0000000000000030 = pcRam0000000000a33930;
      in_stack_00000040 = CONCAT17(cRam0000000000a33947,uRam0000000000a33940);
    }
    if (*(char *)((long)in_stack_00000008 + 0x17) < '\0') {
      func_0x00017634(&uStack0000000000000010,*in_stack_00000008,in_stack_00000008[1]);
    }
    else {
      in_stack_00000018 = in_stack_00000008[1];
      uStack0000000000000010 = (char *)*in_stack_00000008;
      in_stack_00000020 = in_stack_00000008[2];
    }
    iVar13 = (int)(char)in_stack_00000020._7_1_;
    uVar14 = in_stack_00000018;
    pcVar15 = uStack0000000000000010;
    if (-1 < iVar13) {
      uVar14 = (ulong)in_stack_00000020._7_1_;
      pcVar15 = (char *)&uStack0000000000000010;
    }
    uVar4 = in_stack_00000038;
    pcVar16 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar4 = in_stack_00000040 >> 0x38;
      pcVar16 = (char *)&uStack0000000000000030;
    }
    if (uVar4 <= uVar14) {
      uVar14 = uVar4;
    }
    pcVar20 = pcVar15 + uVar14;
    lVar21 = 0;
    if (uVar4 == 0) goto code_r0x0004e748;
    pcVar17 = pcVar20;
    if (uVar14 != 0) {
      pcVar18 = pcVar15;
      do {
        if (*pcVar18 == *pcVar16) {
          uVar14 = 1;
          do {
            if (uVar4 == uVar14) {
              pcVar17 = pcVar18;
              break;
            }
            pcVar2 = pcVar18 + uVar14;
            if (pcVar2 == pcVar20) goto code_r0x0004e638;
            pcVar1 = pcVar16 + uVar14;
            uVar14 = uVar14 + 1;
          } while (*pcVar2 == *pcVar1);
        }
        pcVar18 = pcVar18 + 1;
      } while (pcVar18 != pcVar20);
    }
code_r0x0004e638:
    bVar11 = (uVar4 == 0 || pcVar17 != pcVar20) && pcVar17 == pcVar15;
    while( true ) {
      if (iVar13 < 0) {
        __ZdlPv();
      }
      if (!bVar11) break;
      if ((long)in_stack_00000040 < 0) {
        __ZdlPv(uStack0000000000000030);
      }
      if (in_stack_00000070 < 0) {
        __ZdlPv(uStack0000000000000060);
        if (_uStack0000000000000090 < 0) goto code_r0x0004e704;
code_r0x0004e67c:
        if (-1 < (char)bVar6) goto code_r0x0004e684;
code_r0x0004e714:
        __ZdlPv(unaff_x21);
        if (in_stack_000000c8._7_1_ < '\0') goto code_r0x0004e724;
code_r0x0004e68c:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
          return;
        }
      }
      else {
        if (-1 < _uStack0000000000000090) goto code_r0x0004e67c;
code_r0x0004e704:
        __ZdlPv(uStack0000000000000080);
        if ((char)bVar6 < '\0') goto code_r0x0004e714;
code_r0x0004e684:
        if (-1 < in_stack_000000c8._7_1_) goto code_r0x0004e68c;
code_r0x0004e724:
        __ZdlPv(uStack00000000000000b8);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
          return;
        }
      }
      ___stack_chk_fail();
      pcVar15 = extraout_x9;
      lVar21 = extraout_x10;
      pcVar20 = extraout_x11;
      iVar13 = extraout_w8;
code_r0x0004e748:
      bVar11 = lVar21 == 0 && pcVar20 == pcVar15;
    }
    func_0x006e644c(unaff_x27,"Access outside workspace is not allowed");
  }
  else {
    func_0x006e644c(unaff_x27,"Failed to resolve path component");
  }
code_r0x0004e7c0:
                    /* WARNING: Does not return */
  pcVar10 = (code *)SoftwareBreakpoint(1,0x4e7c4);
  (*pcVar10)();
code_r0x0004e058:
  func_0x006e644c();
  goto code_r0x0004e7c0;
}

