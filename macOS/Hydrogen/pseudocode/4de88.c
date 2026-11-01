
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

void FUN_0004de88(void)

{
  char *pcVar1;
  char *pcVar2;
  long *plVar3;
  ulong uVar4;
  byte bVar5;
  undefined1 uVar6;
  undefined8 *puVar7;
  ulong uVar8;
  code *pcVar9;
  bool bVar10;
  char cVar11;
  int iVar12;
  long extraout_x1;
  long extraout_x1_00;
  int extraout_w8;
  ulong uVar13;
  char *pcVar14;
  char *extraout_x9;
  long extraout_x10;
  char *pcVar15;
  char *extraout_x11;
  char *pcVar16;
  ulong uVar17;
  char *pcVar18;
  undefined8 *unaff_x21;
  char *pcVar19;
  int unaff_w22;
  long lVar20;
  undefined8 unaff_x27;
  long unaff_x29;
  undefined8 uVar21;
  undefined1 auVar22 [16];
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
  int iStack00000000000000b4;
  undefined8 uStack00000000000000b8;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000e0;
  undefined1 in_stack_000000f0 [16];
  
  __ZNKSt3__14__fs10filesystem4path16__root_directoryEv();
  if (extraout_x1 != 0) {
    func_0x006e644c();
    goto code_r0x0004e7c0;
  }
  if (unaff_w22 != 0) {
    uStack0000000000000080 = (char *)0x0;
    in_stack_00000088 = 0;
    _uStack0000000000000090 = 0;
    uVar13 = unaff_x21[1];
    puVar7 = (undefined8 *)*unaff_x21;
    if (-1 < (char)*(byte *)((long)unaff_x21 + 0x17)) {
      uVar13 = (ulong)*(byte *)((long)unaff_x21 + 0x17);
      puVar7 = unaff_x21;
    }
    func_0x00017184(&uStack0000000000000080,puVar7,(long)puVar7 + uVar13);
    auVar22 = __ZNKSt3__14__fs10filesystem4path11__extensionEv(&uStack0000000000000080);
    uVar13 = auVar22._8_8_;
    if (0x7ffffffffffffff7 < uVar13) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar13 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar22[8];
      lVar20 = unaff_x29 + -0xa0;
      if (uVar13 != 0) goto code_r0x0004df30;
    }
    else {
      uVar4 = (uVar13 & 0xfffffffffffffff8) + 8;
      if ((uVar13 | 7) != 0x17) {
        uVar4 = uVar13 | 7;
      }
      lVar20 = __Znwm(uVar4 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar13;
      *(ulong *)(unaff_x29 + -0x90) = uVar4 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar20;
code_r0x0004df30:
      _memmove(lVar20,auVar22._0_8_,uVar13);
    }
    *(undefined1 *)(lVar20 + uVar13) = 0;
    uStack0000000000000060._0_3_ = (undefined3)*(undefined4 *)(unaff_x29 + -0x90);
    uStack0000000000000060._0_7_ =
         CONCAT43(in_stack_000000e0._3_4_,(undefined3)uStack0000000000000060);
    uStack00000000000000a0 = *(char **)(unaff_x29 + -0xa0);
    in_stack_000000a8 = *(ulong *)(unaff_x29 + -0x98);
    uStack00000000000000b0 =
         CONCAT13((char)in_stack_000000e0._3_4_,(undefined3)uStack0000000000000060);
    iStack00000000000000b4 =
         CONCAT13(*(undefined1 *)(unaff_x29 + -0x89),(int3)((uint)in_stack_000000e0._3_4_ >> 8));
    if (_uStack0000000000000090 < 0) {
      __ZdlPv(uStack0000000000000080);
    }
    uVar13 = (ulong)(uint)(int)(char)iStack00000000000000b4._3_1_;
    pcVar19 = uStack00000000000000a0;
    pcVar14 = uStack00000000000000a0 + in_stack_000000a8;
    if (-1 < (char)iStack00000000000000b4._3_1_) {
      pcVar19 = (char *)&uStack00000000000000a0;
      pcVar14 = (char *)((long)&uStack00000000000000a0 + (ulong)iStack00000000000000b4._3_1_);
    }
    if (pcVar19 != pcVar14) {
      do {
        cVar11 = ___tolower((long)*pcVar19);
        pcVar18 = pcVar19 + 1;
        *pcVar19 = cVar11;
        pcVar19 = pcVar18;
      } while (pcVar18 != pcVar14);
      uVar13 = (ulong)iStack00000000000000b4._3_1_;
    }
    uVar8 = in_stack_000000a8;
    pcVar19 = uStack00000000000000a0;
    uVar17 = uVar13 & 0xff;
    uVar4 = in_stack_000000a8;
    if (-1 < (char)uVar13) {
      uVar4 = uVar17;
    }
    if (((uint)uVar13 >> 7 & 1) == 0) {
      if ((uint)uVar17 == 0) {
        lVar20 = 0;
        do {
          uVar13 = *(ulong *)(lVar20 + 0xa27df0);
          if (-1 < (char)*(byte *)(lVar20 + 0xa27dff)) {
            uVar13 = (ulong)*(byte *)(lVar20 + 0xa27dff);
          }
          if (uVar4 == uVar13) goto code_r0x0004e058;
          lVar20 = lVar20 + 0x18;
        } while (lVar20 != 0xaf8);
      }
      else {
        pcVar14 = (char *)0xa27de8;
        do {
          bVar5 = pcVar14[0x17];
          uVar13 = *(ulong *)(pcVar14 + 8);
          if (-1 < (char)bVar5) {
            uVar13 = (ulong)bVar5;
          }
          if (uVar4 == uVar13) {
            pcVar18 = *(char **)pcVar14;
            if (-1 < (char)bVar5) {
              pcVar18 = pcVar14;
            }
            pcVar15 = (char *)&uStack00000000000000a0;
            uVar13 = uVar17;
            while (*pcVar15 == *pcVar18) {
              pcVar15 = pcVar15 + 1;
              pcVar18 = pcVar18 + 1;
              uVar13 = uVar13 - 1;
              if (uVar13 == 0) goto code_r0x0004e058;
            }
          }
          pcVar14 = pcVar14 + 0x18;
        } while (pcVar14 != (char *)0xa288e0);
      }
    }
    else {
      lVar20 = 0;
      do {
        bVar5 = *(byte *)(lVar20 + 0xa27dff);
        uVar13 = *(ulong *)(lVar20 + 0xa27df0);
        if (-1 < (char)bVar5) {
          uVar13 = (ulong)bVar5;
        }
        if (uVar4 == uVar13) {
          plVar3 = (long *)*(long *)(lVar20 + 0xa27de8);
          if (-1 < (char)bVar5) {
            plVar3 = (long *)(lVar20 + 0xa27de8);
          }
          iVar12 = _memcmp(pcVar19,plVar3,uVar8);
          if (iVar12 == 0) goto code_r0x0004e058;
        }
        lVar20 = lVar20 + 0x18;
      } while (lVar20 != 0xaf8);
    }
    if ((uint)uVar17 >> 7 != 0) {
      __ZdlPv(pcVar19);
    }
  }
  pcVar19 = pcRam0000000000a33930;
  if (cRam0000000000a33947 < '\0') {
    func_0x00017634(unaff_x29 + -0xa0,pcRam0000000000a33930,uRam0000000000a33938);
  }
  else {
    *(ulong *)(unaff_x29 + -0x98) = uRam0000000000a33938;
    *(char **)(unaff_x29 + -0xa0) = pcVar19;
    *(ulong *)(unaff_x29 + -0x90) = CONCAT17(cRam0000000000a33947,uRam0000000000a33940);
  }
  func_0x0001754c(unaff_x29 + -0xa0,&uStack00000000000000b8);
  FUN_0004e9ac(&uStack00000000000000a0,unaff_x29 + -0xa0);
  if (iStack00000000000000b4 < 0) {
    func_0x00017634(&uStack0000000000000080,uStack00000000000000a0,in_stack_000000a8);
  }
  else {
    in_stack_00000088 = in_stack_000000a8;
    uStack0000000000000080 = uStack00000000000000a0;
    _uStack0000000000000090 = CONCAT44(iStack00000000000000b4,uStack00000000000000b0);
  }
  uStack0000000000000060 = 0;
  in_stack_00000068 = 0;
  in_stack_00000070 = 0;
  while ((__ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
                    (unaff_x29 + -0xa0,&uStack0000000000000080,0),
         *(char *)(unaff_x29 + -0xa0) == -1 || *(char *)(unaff_x29 + -0xa0) == '\0' &&
         (__ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080),
         extraout_x1_00 != 0))) {
    auVar22 = __ZNKSt3__14__fs10filesystem4path10__filenameEv(&uStack0000000000000080);
    uVar13 = auVar22._8_8_;
    if (0x7ffffffffffffff7 < uVar13) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar13 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar22[8];
      lVar20 = unaff_x29 + -0xa0;
      if (uVar13 != 0) goto code_r0x0004e29c;
    }
    else {
      uVar4 = (uVar13 & 0xfffffffffffffff8) + 8;
      if ((uVar13 | 7) != 0x17) {
        uVar4 = uVar13 | 7;
      }
      lVar20 = __Znwm(uVar4 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar13;
      *(ulong *)(unaff_x29 + -0x90) = uVar4 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar20;
code_r0x0004e29c:
      _memmove(lVar20,auVar22._0_8_,uVar13);
    }
    *(undefined1 *)(lVar20 + uVar13) = 0;
    uStack0000000000000030._0_7_ =
         CONCAT43(*(undefined4 *)(unaff_x29 + -0x8d),(int3)*(undefined4 *)(unaff_x29 + -0x90));
    pcVar19 = uStack0000000000000030;
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined4 *)(unaff_x29 + -0x70) = (undefined4)uStack0000000000000030;
    *(undefined4 *)(unaff_x29 + -0x6d) = *(undefined4 *)(unaff_x29 + -0x8d);
    *(undefined1 *)(unaff_x29 + -0x69) = *(undefined1 *)(unaff_x29 + -0x89);
    uStack0000000000000030 = pcVar19;
    func_0x0001754c(unaff_x29 + -0x80,&uStack0000000000000060);
    if (in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
    }
    in_stack_00000068 = *(undefined8 *)(unaff_x29 + -0x78);
    uStack0000000000000060 = *(undefined8 *)(unaff_x29 + -0x80);
    in_stack_00000070 = *(long *)(unaff_x29 + -0x70);
    *(undefined1 *)(unaff_x29 + -0x69) = 0;
    *(undefined1 *)(unaff_x29 + -0x80) = 0;
    auVar22 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080);
    uVar13 = auVar22._8_8_;
    if (0x7ffffffffffffff7 < uVar13) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar13 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar22[8];
      lVar20 = unaff_x29 + -0xa0;
      if (uVar13 != 0) goto code_r0x0004e39c;
    }
    else {
      uVar4 = (uVar13 & 0xfffffffffffffff8) + 8;
      if ((uVar13 | 7) != 0x17) {
        uVar4 = uVar13 | 7;
      }
      lVar20 = __Znwm(uVar4 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar13;
      *(ulong *)(unaff_x29 + -0x90) = uVar4 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar20;
code_r0x0004e39c:
      _memmove(lVar20,auVar22._0_8_,uVar13);
    }
    *(undefined1 *)(lVar20 + uVar13) = 0;
    pcVar19 = *(char **)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0x98);
    in_stack_000000f0._7_8_ = *(undefined8 *)(unaff_x29 + -0x91);
    uVar6 = *(undefined1 *)(unaff_x29 + -0x89);
    if (_uStack0000000000000090 < 0) {
      __ZdlPv(uStack0000000000000080);
    }
    *(undefined8 *)((ulong)&uStack0000000000000080 | 8) = *(undefined8 *)(unaff_x29 + -0x80);
    *(undefined8 *)((long)((ulong)&uStack0000000000000080 | 8) + 7) = in_stack_000000f0._7_8_;
    _uStack0000000000000090 = CONCAT17(uVar6,uStack0000000000000090);
    uStack0000000000000080 = pcVar19;
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
      uVar21 = *in_stack_00000008;
      *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000008[1];
      *(undefined8 *)(unaff_x29 + -0x80) = uVar21;
      *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000008[2];
    }
    while( true ) {
      bVar5 = *(byte *)(unaff_x29 + -0x69);
      uVar13 = (ulong)bVar5;
      if ((bVar5 < 2) || (*(char *)(unaff_x29 + -0x81 + uVar13) != '/')) break;
      *(char *)(unaff_x29 + -0x69) = (char)(uVar13 - 1);
      *(undefined1 *)(unaff_x29 + -0x80 + (uVar13 - 1)) = 0;
    }
    uStack0000000000000030 = (char *)0x0;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar4 = *(ulong *)(unaff_x29 + -0x78);
    lVar20 = *(long *)(unaff_x29 + -0x80);
    if (-1 < (char)bVar5) {
      uVar4 = uVar13;
      lVar20 = unaff_x29 + -0x80;
    }
    func_0x00017184(&uStack0000000000000030,lVar20,lVar20 + uVar4);
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
    iVar12 = (int)(char)in_stack_00000020._7_1_;
    uVar13 = in_stack_00000018;
    pcVar19 = uStack0000000000000010;
    if (-1 < iVar12) {
      uVar13 = (ulong)in_stack_00000020._7_1_;
      pcVar19 = (char *)&uStack0000000000000010;
    }
    uVar4 = in_stack_00000038;
    pcVar14 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar4 = in_stack_00000040 >> 0x38;
      pcVar14 = (char *)&uStack0000000000000030;
    }
    if (uVar4 <= uVar13) {
      uVar13 = uVar4;
    }
    pcVar18 = pcVar19 + uVar13;
    lVar20 = 0;
    if (uVar4 == 0) goto code_r0x0004e748;
    pcVar15 = pcVar18;
    if (uVar13 != 0) {
      pcVar16 = pcVar19;
      do {
        if (*pcVar16 == *pcVar14) {
          uVar13 = 1;
          do {
            if (uVar4 == uVar13) {
              pcVar15 = pcVar16;
              break;
            }
            pcVar2 = pcVar16 + uVar13;
            if (pcVar2 == pcVar18) goto LAB_0004e638;
            pcVar1 = pcVar14 + uVar13;
            uVar13 = uVar13 + 1;
          } while (*pcVar2 == *pcVar1);
        }
        pcVar16 = pcVar16 + 1;
      } while (pcVar16 != pcVar18);
    }
LAB_0004e638:
    bVar10 = (uVar4 == 0 || pcVar15 != pcVar18) && pcVar15 == pcVar19;
    while( true ) {
      if (iVar12 < 0) {
        __ZdlPv();
      }
      if (!bVar10) break;
      if ((long)in_stack_00000040 < 0) {
        __ZdlPv(uStack0000000000000030);
      }
      if (in_stack_00000070 < 0) {
        __ZdlPv(uStack0000000000000060);
        if (_uStack0000000000000090 < 0) goto LAB_0004e704;
LAB_0004e67c:
        if (-1 < iStack00000000000000b4) goto code_r0x0004e684;
LAB_0004e714:
        __ZdlPv(uStack00000000000000a0);
        if (in_stack_000000c8._7_1_ < '\0') goto LAB_0004e724;
code_r0x0004e68c:
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
          return;
        }
      }
      else {
        if (-1 < _uStack0000000000000090) goto LAB_0004e67c;
LAB_0004e704:
        __ZdlPv(uStack0000000000000080);
        if (iStack00000000000000b4 < 0) goto LAB_0004e714;
code_r0x0004e684:
        if (-1 < in_stack_000000c8._7_1_) goto code_r0x0004e68c;
LAB_0004e724:
        __ZdlPv(uStack00000000000000b8);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
          return;
        }
      }
      ___stack_chk_fail();
      pcVar19 = extraout_x9;
      lVar20 = extraout_x10;
      pcVar18 = extraout_x11;
      iVar12 = extraout_w8;
code_r0x0004e748:
      bVar10 = lVar20 == 0 && pcVar18 == pcVar19;
    }
    func_0x006e644c(unaff_x27,"Access outside workspace is not allowed");
  }
  else {
    func_0x006e644c(unaff_x27,"Failed to resolve path component");
  }
code_r0x0004e7c0:
                    /* WARNING: Does not return */
  pcVar9 = (code *)SoftwareBreakpoint(1,0x4e7c4);
  (*pcVar9)();
code_r0x0004e058:
  func_0x006e644c();
  goto code_r0x0004e7c0;
}

