
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

void FUN_0004deb4(long param_1)

{
  char *pcVar1;
  char *pcVar2;
  long *plVar3;
  ulong uVar4;
  byte bVar5;
  undefined1 uVar6;
  ulong uVar7;
  code *pcVar8;
  char in_NG;
  bool bVar9;
  char in_OV;
  char cVar10;
  int iVar11;
  long extraout_x1;
  int extraout_w8;
  ulong uVar12;
  char *pcVar13;
  long in_x9;
  char *extraout_x9;
  long in_x10;
  long extraout_x10;
  char *pcVar14;
  char *extraout_x11;
  char *pcVar15;
  ulong uVar16;
  char *pcVar17;
  long unaff_x21;
  char *pcVar18;
  long lVar19;
  long unaff_x25;
  undefined8 unaff_x27;
  long unaff_x29;
  undefined8 uVar20;
  undefined1 auVar21 [16];
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
  undefined8 uStack00000000000000a0;
  ulong in_stack_000000a8;
  undefined4 uStack00000000000000b0;
  undefined3 uStack00000000000000b4;
  byte bStack00000000000000b7;
  undefined8 uStack00000000000000b8;
  undefined8 in_stack_000000c8;
  
  if (in_NG == in_OV) {
    in_x10 = param_1;
    in_x9 = unaff_x21;
  }
  func_0x00017184(&uStack0000000000000080,in_x9,in_x9 + in_x10);
  auVar21 = __ZNKSt3__14__fs10filesystem4path11__extensionEv(&uStack0000000000000080);
  uVar12 = auVar21._8_8_;
  if (0x7ffffffffffffff7 < uVar12) {
    func_0x0001748c(unaff_x29 + -0xa0);
    goto code_r0x0004e7c0;
  }
  if (uVar12 < 0x17) {
    *(char *)(unaff_x29 + -0x89) = auVar21[8];
    lVar19 = unaff_x29 + -0xa0;
    if (uVar12 != 0) goto LAB_0004df30;
  }
  else {
    uVar4 = (uVar12 & 0xfffffffffffffff8) + 8;
    if ((uVar12 | 7) != 0x17) {
      uVar4 = uVar12 | 7;
    }
    lVar19 = __Znwm(uVar4 + 1);
    *(ulong *)(unaff_x29 + -0x98) = uVar12;
    *(ulong *)(unaff_x29 + -0x90) = uVar4 + 1 | 0x8000000000000000;
    *(long *)(unaff_x29 + -0xa0) = lVar19;
LAB_0004df30:
    _memmove(lVar19,auVar21._0_8_,uVar12);
  }
  *(undefined1 *)(lVar19 + uVar12) = 0;
  uStack0000000000000060._0_7_ =
       CONCAT43(*(undefined4 *)(unaff_x25 + 0x43),(int3)*(undefined4 *)(unaff_x29 + -0x90));
  uVar20 = uStack0000000000000060;
  uVar6 = *(undefined1 *)(unaff_x29 + -0x89);
  uStack00000000000000a0 = *(char **)(unaff_x29 + -0xa0);
  in_stack_000000a8 = *(ulong *)(unaff_x29 + -0x98);
  uStack00000000000000b0 = (undefined4)uStack0000000000000060;
  *(undefined4 *)(unaff_x25 + 0x13) = *(undefined4 *)(unaff_x25 + 0x43);
  _uStack00000000000000b4 = CONCAT13(uVar6,uStack00000000000000b4);
  uStack0000000000000060 = uVar20;
  if (_uStack0000000000000090 < 0) {
    __ZdlPv(uStack0000000000000080);
  }
  uVar12 = (ulong)(uint)(int)(char)bStack00000000000000b7;
  pcVar18 = uStack00000000000000a0;
  pcVar13 = uStack00000000000000a0 + in_stack_000000a8;
  if (-1 < (char)bStack00000000000000b7) {
    pcVar18 = (char *)&uStack00000000000000a0;
    pcVar13 = (char *)((long)&uStack00000000000000a0 + (ulong)bStack00000000000000b7);
  }
  if (pcVar18 != pcVar13) {
    do {
      cVar10 = ___tolower((long)*pcVar18);
      pcVar17 = pcVar18 + 1;
      *pcVar18 = cVar10;
      pcVar18 = pcVar17;
    } while (pcVar17 != pcVar13);
    uVar12 = (ulong)bStack00000000000000b7;
  }
  uVar7 = in_stack_000000a8;
  pcVar18 = uStack00000000000000a0;
  uVar16 = uVar12 & 0xff;
  uVar4 = in_stack_000000a8;
  if (-1 < (char)uVar12) {
    uVar4 = uVar16;
  }
  if (((uint)uVar12 >> 7 & 1) == 0) {
    if ((uint)uVar16 == 0) {
      lVar19 = 0;
      do {
        uVar12 = *(ulong *)(lVar19 + 0xa27df0);
        if (-1 < (char)*(byte *)(lVar19 + 0xa27dff)) {
          uVar12 = (ulong)*(byte *)(lVar19 + 0xa27dff);
        }
        if (uVar4 == uVar12) goto code_r0x0004e058;
        lVar19 = lVar19 + 0x18;
      } while (lVar19 != 0xaf8);
    }
    else {
      pcVar13 = (char *)0xa27de8;
      do {
        bVar5 = pcVar13[0x17];
        uVar12 = *(ulong *)(pcVar13 + 8);
        if (-1 < (char)bVar5) {
          uVar12 = (ulong)bVar5;
        }
        if (uVar4 == uVar12) {
          pcVar17 = *(char **)pcVar13;
          if (-1 < (char)bVar5) {
            pcVar17 = pcVar13;
          }
          pcVar14 = (char *)&uStack00000000000000a0;
          uVar12 = uVar16;
          while (*pcVar14 == *pcVar17) {
            pcVar14 = pcVar14 + 1;
            pcVar17 = pcVar17 + 1;
            uVar12 = uVar12 - 1;
            if (uVar12 == 0) goto code_r0x0004e058;
          }
        }
        pcVar13 = pcVar13 + 0x18;
      } while (pcVar13 != (char *)0xa288e0);
    }
  }
  else {
    lVar19 = 0;
    do {
      bVar5 = *(byte *)(lVar19 + 0xa27dff);
      uVar12 = *(ulong *)(lVar19 + 0xa27df0);
      if (-1 < (char)bVar5) {
        uVar12 = (ulong)bVar5;
      }
      if (uVar4 == uVar12) {
        plVar3 = (long *)*(long *)(lVar19 + 0xa27de8);
        if (-1 < (char)bVar5) {
          plVar3 = (long *)(lVar19 + 0xa27de8);
        }
        iVar11 = _memcmp(pcVar18,plVar3,uVar7);
        if (iVar11 == 0) goto code_r0x0004e058;
      }
      lVar19 = lVar19 + 0x18;
    } while (lVar19 != 0xaf8);
  }
  if ((uint)uVar16 >> 7 != 0) {
    __ZdlPv(pcVar18);
  }
  pcVar18 = pcRam0000000000a33930;
  if (cRam0000000000a33947 < '\0') {
    func_0x00017634(unaff_x29 + -0xa0,pcRam0000000000a33930,uRam0000000000a33938);
  }
  else {
    *(ulong *)(unaff_x29 + -0x98) = uRam0000000000a33938;
    *(char **)(unaff_x29 + -0xa0) = pcVar18;
    *(ulong *)(unaff_x29 + -0x90) = CONCAT17(cRam0000000000a33947,uRam0000000000a33940);
  }
  func_0x0001754c(unaff_x29 + -0xa0,&uStack00000000000000b8);
  func_0x0004e9b0(&uStack00000000000000a0,unaff_x29 + -0xa0);
  if (_uStack00000000000000b4 < 0) {
    func_0x00017634(&uStack0000000000000080,uStack00000000000000a0,in_stack_000000a8);
  }
  else {
    in_stack_00000088 = in_stack_000000a8;
    uStack0000000000000080 = uStack00000000000000a0;
    _uStack0000000000000090 = CONCAT44(_uStack00000000000000b4,uStack00000000000000b0);
  }
  uStack0000000000000060 = 0;
  in_stack_00000068 = 0;
  in_stack_00000070 = 0;
  while ((__ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
                    (unaff_x29 + -0xa0,&uStack0000000000000080,0),
         *(char *)(unaff_x29 + -0xa0) == -1 || *(char *)(unaff_x29 + -0xa0) == '\0' &&
         (__ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080),
         extraout_x1 != 0))) {
    auVar21 = __ZNKSt3__14__fs10filesystem4path10__filenameEv(&uStack0000000000000080);
    uVar12 = auVar21._8_8_;
    if (0x7ffffffffffffff7 < uVar12) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar12 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar21[8];
      lVar19 = unaff_x29 + -0xa0;
      if (uVar12 != 0) goto code_r0x0004e29c;
    }
    else {
      uVar4 = (uVar12 & 0xfffffffffffffff8) + 8;
      if ((uVar12 | 7) != 0x17) {
        uVar4 = uVar12 | 7;
      }
      lVar19 = __Znwm(uVar4 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar12;
      *(ulong *)(unaff_x29 + -0x90) = uVar4 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar19;
code_r0x0004e29c:
      _memmove(lVar19,auVar21._0_8_,uVar12);
    }
    *(undefined1 *)(lVar19 + uVar12) = 0;
    uStack0000000000000030._0_7_ =
         CONCAT43(*(undefined4 *)(unaff_x29 + -0x8d),(int3)*(undefined4 *)(unaff_x29 + -0x90));
    pcVar18 = uStack0000000000000030;
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined4 *)(unaff_x29 + -0x70) = (undefined4)uStack0000000000000030;
    *(undefined4 *)(unaff_x29 + -0x6d) = *(undefined4 *)(unaff_x29 + -0x8d);
    *(undefined1 *)(unaff_x29 + -0x69) = *(undefined1 *)(unaff_x29 + -0x89);
    uStack0000000000000030 = pcVar18;
    func_0x0001754c(unaff_x29 + -0x80,&uStack0000000000000060);
    if (in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
    }
    in_stack_00000068 = *(undefined8 *)(unaff_x29 + -0x78);
    uStack0000000000000060 = *(undefined8 *)(unaff_x29 + -0x80);
    in_stack_00000070 = *(long *)(unaff_x29 + -0x70);
    *(undefined1 *)(unaff_x29 + -0x69) = 0;
    *(undefined1 *)(unaff_x29 + -0x80) = 0;
    auVar21 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080);
    uVar12 = auVar21._8_8_;
    if (0x7ffffffffffffff7 < uVar12) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar12 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar21[8];
      lVar19 = unaff_x29 + -0xa0;
      if (uVar12 != 0) goto code_r0x0004e39c;
    }
    else {
      uVar4 = (uVar12 & 0xfffffffffffffff8) + 8;
      if ((uVar12 | 7) != 0x17) {
        uVar4 = uVar12 | 7;
      }
      lVar19 = __Znwm(uVar4 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar12;
      *(ulong *)(unaff_x29 + -0x90) = uVar4 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar19;
code_r0x0004e39c:
      _memmove(lVar19,auVar21._0_8_,uVar12);
    }
    *(undefined1 *)(lVar19 + uVar12) = 0;
    pcVar18 = *(char **)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined8 *)(unaff_x25 + 0x57) = *(undefined8 *)(unaff_x29 + -0x91);
    uVar6 = *(undefined1 *)(unaff_x29 + -0x89);
    if (_uStack0000000000000090 < 0) {
      __ZdlPv(uStack0000000000000080);
    }
    *(undefined8 *)((ulong)&uStack0000000000000080 | 8) = *(undefined8 *)(unaff_x29 + -0x80);
    *(undefined8 *)((long)((ulong)&uStack0000000000000080 | 8) + 7) =
         *(undefined8 *)(unaff_x25 + 0x57);
    _uStack0000000000000090 = CONCAT17(uVar6,uStack0000000000000090);
    uStack0000000000000080 = pcVar18;
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
      uVar20 = *in_stack_00000008;
      *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000008[1];
      *(undefined8 *)(unaff_x29 + -0x80) = uVar20;
      *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000008[2];
    }
    while( true ) {
      bVar5 = *(byte *)(unaff_x29 + -0x69);
      uVar12 = (ulong)bVar5;
      if ((bVar5 < 2) || (*(char *)(unaff_x29 + -0x81 + uVar12) != '/')) break;
      *(char *)(unaff_x29 + -0x69) = (char)(uVar12 - 1);
      *(undefined1 *)(unaff_x29 + -0x80 + (uVar12 - 1)) = 0;
    }
    uStack0000000000000030 = (char *)0x0;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar4 = *(ulong *)(unaff_x29 + -0x78);
    lVar19 = *(long *)(unaff_x29 + -0x80);
    if (-1 < (char)bVar5) {
      uVar4 = uVar12;
      lVar19 = unaff_x29 + -0x80;
    }
    func_0x00017184(&uStack0000000000000030,lVar19,lVar19 + uVar4);
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
    iVar11 = (int)(char)in_stack_00000020._7_1_;
    uVar12 = in_stack_00000018;
    pcVar18 = uStack0000000000000010;
    if (-1 < iVar11) {
      uVar12 = (ulong)in_stack_00000020._7_1_;
      pcVar18 = (char *)&uStack0000000000000010;
    }
    uVar4 = in_stack_00000038;
    pcVar13 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar4 = in_stack_00000040 >> 0x38;
      pcVar13 = (char *)&uStack0000000000000030;
    }
    if (uVar4 <= uVar12) {
      uVar12 = uVar4;
    }
    pcVar17 = pcVar18 + uVar12;
    lVar19 = 0;
    if (uVar4 == 0) goto code_r0x0004e748;
    pcVar14 = pcVar17;
    if (uVar12 != 0) {
      pcVar15 = pcVar18;
      do {
        if (*pcVar15 == *pcVar13) {
          uVar12 = 1;
          do {
            if (uVar4 == uVar12) {
              pcVar14 = pcVar15;
              break;
            }
            pcVar2 = pcVar15 + uVar12;
            if (pcVar2 == pcVar17) goto code_r0x0004e638;
            pcVar1 = pcVar13 + uVar12;
            uVar12 = uVar12 + 1;
          } while (*pcVar2 == *pcVar1);
        }
        pcVar15 = pcVar15 + 1;
      } while (pcVar15 != pcVar17);
    }
code_r0x0004e638:
    bVar9 = (uVar4 == 0 || pcVar14 != pcVar17) && pcVar14 == pcVar18;
    while( true ) {
      if (iVar11 < 0) {
        __ZdlPv();
      }
      if (!bVar9) break;
      if ((long)in_stack_00000040 < 0) {
        __ZdlPv(uStack0000000000000030);
      }
      if (in_stack_00000070 < 0) {
        __ZdlPv(uStack0000000000000060);
        if (_uStack0000000000000090 < 0) goto code_r0x0004e704;
code_r0x0004e67c:
        if (-1 < _uStack00000000000000b4) goto code_r0x0004e684;
code_r0x0004e714:
        __ZdlPv(uStack00000000000000a0);
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
        if (_uStack00000000000000b4 < 0) goto code_r0x0004e714;
code_r0x0004e684:
        if (-1 < in_stack_000000c8._7_1_) goto code_r0x0004e68c;
code_r0x0004e724:
        __ZdlPv(uStack00000000000000b8);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
          return;
        }
      }
      ___stack_chk_fail();
      pcVar18 = extraout_x9;
      lVar19 = extraout_x10;
      pcVar17 = extraout_x11;
      iVar11 = extraout_w8;
code_r0x0004e748:
      bVar9 = lVar19 == 0 && pcVar17 == pcVar18;
    }
    func_0x006e644c(unaff_x27,"Access outside workspace is not allowed");
  }
  else {
    func_0x006e644c(unaff_x27,"Failed to resolve path component");
  }
code_r0x0004e7c0:
                    /* WARNING: Does not return */
  pcVar8 = (code *)SoftwareBreakpoint(1,0x4e7c4);
  (*pcVar8)();
code_r0x0004e058:
  func_0x006e644c();
  goto code_r0x0004e7c0;
}

