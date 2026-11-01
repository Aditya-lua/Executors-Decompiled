
/* WARNING: Removing unreachable block (ram,0x0004e41c) */
/* WARNING: Removing unreachable block (ram,0x0004e2e8) */
/* WARNING: Removing unreachable block (ram,0x0004e464) */
/* WARNING: Removing unreachable block (ram,0x0004e4bc) */
/* WARNING: Removing unreachable block (ram,0x0004e4c8) */
/* WARNING: Removing unreachable block (ram,0x0004e4dc) */
/* WARNING: Removing unreachable block (ram,0x0004e6d4) */
/* WARNING: Removing unreachable block (ram,0x0004e6e4) */
/* WARNING: Removing unreachable block (ram,0x0004e32c) */

void FUN_0004e35c(void)

{
  char *pcVar1;
  char *pcVar2;
  ulong uVar3;
  undefined4 uVar4;
  undefined1 uVar5;
  byte bVar6;
  char cVar7;
  char *pcVar8;
  code *pcVar9;
  bool bVar10;
  long extraout_x1;
  int extraout_w8;
  int iVar11;
  char *extraout_x9;
  char *pcVar12;
  ulong uVar13;
  long extraout_x10;
  char *extraout_x11;
  char *pcVar14;
  char *pcVar15;
  char *pcVar16;
  undefined8 *unaff_x19;
  undefined4 *unaff_x20;
  undefined8 unaff_x21;
  undefined8 uVar17;
  undefined8 unaff_x22;
  long lVar18;
  long lVar19;
  long unaff_x25;
  undefined8 *unaff_x26;
  undefined8 *unaff_x27;
  undefined4 *unaff_x28;
  long unaff_x29;
  undefined1 auVar20 [16];
  undefined8 in_stack_00000000;
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
  undefined8 in_stack_00000090;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c8;
  
  auVar20._8_8_ = unaff_x21;
  auVar20._0_8_ = unaff_x22;
code_r0x0004e35c:
  *(char *)(unaff_x29 + -0x89) = auVar20[8];
  lVar19 = unaff_x29 + -0xa0;
  lVar18 = 0;
  if (auVar20._8_8_ != 0) goto LAB_0004e39c;
  while( true ) {
    *(undefined1 *)(lVar19 + lVar18) = 0;
    uVar17 = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x80) = *unaff_x27;
    *(undefined8 *)(unaff_x25 + 0x57) = *(undefined8 *)((long)unaff_x27 + 7);
    cVar7 = *(char *)(unaff_x29 + -0x89);
    if (in_stack_00000090._7_1_ < '\0') {
      __ZdlPv(uStack0000000000000080);
    }
    *unaff_x19 = *(undefined8 *)(unaff_x29 + -0x80);
    *(undefined8 *)((long)unaff_x19 + 7) = *(undefined8 *)(unaff_x25 + 0x57);
    uStack0000000000000080 = uVar17;
    in_stack_00000090._7_1_ = cVar7;
    __ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
              (unaff_x29 + -0xa0,&uStack0000000000000080,0);
    if ((*(char *)(unaff_x29 + -0xa0) != -1 && *(char *)(unaff_x29 + -0xa0) != '\0') ||
       (__ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080),
       extraout_x1 == 0)) break;
    auVar20 = __ZNKSt3__14__fs10filesystem4path10__filenameEv(&uStack0000000000000080);
    uVar13 = auVar20._8_8_;
    if (0x7ffffffffffffff7 < uVar13) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar13 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar20[8];
      lVar18 = unaff_x29 + -0xa0;
      if (uVar13 != 0) goto code_r0x0004e29c;
    }
    else {
      uVar3 = (uVar13 & 0xfffffffffffffff8) + 8;
      if ((uVar13 | 7) != 0x17) {
        uVar3 = uVar13 | 7;
      }
      lVar18 = __Znwm(uVar3 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar13;
      *(ulong *)(unaff_x29 + -0x90) = uVar3 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar18;
code_r0x0004e29c:
      _memmove(lVar18,auVar20._0_8_,uVar13);
    }
    *(undefined1 *)(lVar18 + uVar13) = 0;
    uVar4 = *(undefined4 *)((long)unaff_x20 + 3);
    uStack0000000000000030._0_7_ = CONCAT43(uVar4,(int3)*unaff_x20);
    pcVar12 = uStack0000000000000030;
    uVar5 = *(undefined1 *)(unaff_x29 + -0x89);
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0x98);
    *unaff_x28 = (undefined4)uStack0000000000000030;
    *(undefined4 *)((long)unaff_x28 + 3) = uVar4;
    *(undefined1 *)(unaff_x29 + -0x69) = uVar5;
    uStack0000000000000030 = pcVar12;
    func_0x0001754c(unaff_x29 + -0x80,&uStack0000000000000060);
    if (in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
    }
    in_stack_00000068 = *(undefined8 *)(unaff_x29 + -0x78);
    uStack0000000000000060 = *(undefined8 *)(unaff_x29 + -0x80);
    in_stack_00000070 = *(long *)(unaff_x29 + -0x70);
    *(undefined1 *)(unaff_x29 + -0x69) = 0;
    *(undefined1 *)(unaff_x29 + -0x80) = 0;
    auVar20 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080);
    uVar13 = auVar20._8_8_;
    if (0x7ffffffffffffff7 < uVar13) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto code_r0x0004e7c0;
    }
    if (uVar13 < 0x17) goto code_r0x0004e35c;
    uVar3 = (uVar13 & 0xfffffffffffffff8) + 8;
    if ((uVar13 | 7) != 0x17) {
      uVar3 = uVar13 | 7;
    }
    lVar19 = __Znwm(uVar3 + 1);
    *(ulong *)(unaff_x29 + -0x98) = uVar13;
    *(ulong *)(unaff_x29 + -0x90) = uVar3 + 1 | 0x8000000000000000;
    *(long *)(unaff_x29 + -0xa0) = lVar19;
LAB_0004e39c:
    lVar18 = auVar20._8_8_;
    _memmove(lVar19,auVar20._0_8_,lVar18);
  }
  uStack0000000000000050 = 0;
  in_stack_00000058 = __ZNSt3__115system_categoryEv();
  __ZNSt3__14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE
            (unaff_x29 + -0xa0,&uStack0000000000000080,&uStack0000000000000050);
  if (uStack0000000000000050 != 0) {
    func_0x006e644c(in_stack_00000000,"Failed to resolve path component");
    goto code_r0x0004e7c0;
  }
  *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0x98);
  *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xa0);
  *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0x90);
  func_0x0001754c(unaff_x29 + -0x80,&uStack0000000000000060);
  func_0x0004e9b0(in_stack_00000008,unaff_x29 + -0x80);
  if (*(char *)((long)in_stack_00000008 + 0x17) < '\0') {
    func_0x00017634(unaff_x29 + -0x80,*in_stack_00000008,in_stack_00000008[1]);
  }
  else {
    uVar17 = *in_stack_00000008;
    *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000008[1];
    *(undefined8 *)(unaff_x29 + -0x80) = uVar17;
    *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000008[2];
  }
  while( true ) {
    bVar6 = *(byte *)(unaff_x29 + -0x69);
    uVar13 = (ulong)bVar6;
    if ((bVar6 < 2) || (*(char *)(unaff_x29 + -0x81 + uVar13) != '/')) break;
    *(char *)(unaff_x29 + -0x69) = (char)(uVar13 - 1);
    *(undefined1 *)(unaff_x29 + -0x80 + (uVar13 - 1)) = 0;
  }
  uStack0000000000000030 = (char *)0x0;
  in_stack_00000038 = 0;
  in_stack_00000040 = 0;
  uVar3 = *(ulong *)(unaff_x29 + -0x78);
  lVar18 = *(long *)(unaff_x29 + -0x80);
  if (-1 < (char)bVar6) {
    uVar3 = uVar13;
    lVar18 = unaff_x29 + -0x80;
  }
  func_0x00017184(&uStack0000000000000030,lVar18,lVar18 + uVar3);
  if (*(char *)((long)in_stack_00000008 + 0x17) < '\0') {
    __ZdlPv(*in_stack_00000008);
  }
  in_stack_00000008[1] = in_stack_00000038;
  *in_stack_00000008 = uStack0000000000000030;
  in_stack_00000008[2] = in_stack_00000040;
  if (cRam0000000000a33947 < '\0') {
    func_0x00017634(&uStack0000000000000030,*unaff_x26,unaff_x26[1]);
  }
  else {
    in_stack_00000038 = unaff_x26[1];
    uStack0000000000000030 = (char *)*unaff_x26;
    in_stack_00000040 = unaff_x26[2];
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
  uVar13 = in_stack_00000018;
  pcVar12 = uStack0000000000000010;
  if (-1 < iVar11) {
    uVar13 = (ulong)in_stack_00000020._7_1_;
    pcVar12 = (char *)&uStack0000000000000010;
  }
  uVar3 = in_stack_00000038;
  pcVar8 = uStack0000000000000030;
  if (-1 < (long)in_stack_00000040) {
    uVar3 = in_stack_00000040 >> 0x38;
    pcVar8 = (char *)&uStack0000000000000030;
  }
  if (uVar3 <= uVar13) {
    uVar13 = uVar3;
  }
  pcVar14 = pcVar12 + uVar13;
  lVar18 = 0;
  if (uVar3 == 0) goto code_r0x0004e748;
  pcVar15 = pcVar14;
  if (uVar13 != 0) {
    pcVar16 = pcVar12;
    do {
      if (*pcVar16 == *pcVar8) {
        uVar13 = 1;
        do {
          if (uVar3 == uVar13) {
            pcVar15 = pcVar16;
            break;
          }
          pcVar2 = pcVar16 + uVar13;
          if (pcVar2 == pcVar14) goto code_r0x0004e638;
          pcVar1 = pcVar8 + uVar13;
          uVar13 = uVar13 + 1;
        } while (*pcVar2 == *pcVar1);
      }
      pcVar16 = pcVar16 + 1;
    } while (pcVar16 != pcVar14);
  }
code_r0x0004e638:
  bVar10 = (uVar3 == 0 || pcVar15 != pcVar14) && pcVar15 == pcVar12;
  while( true ) {
    if (iVar11 < 0) {
      __ZdlPv();
    }
    if (!bVar10) break;
    if ((long)in_stack_00000040 < 0) {
      __ZdlPv(uStack0000000000000030);
    }
    if (in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
      if (in_stack_00000090._7_1_ < '\0') goto code_r0x0004e704;
code_r0x0004e67c:
      if (-1 < in_stack_000000b0._7_1_) goto code_r0x0004e684;
code_r0x0004e714:
      __ZdlPv(in_stack_000000a0);
      if (in_stack_000000c8._7_1_ < '\0') goto code_r0x0004e724;
code_r0x0004e68c:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
        return;
      }
    }
    else {
      if (-1 < in_stack_00000090._7_1_) goto code_r0x0004e67c;
code_r0x0004e704:
      __ZdlPv(uStack0000000000000080);
      if (in_stack_000000b0._7_1_ < '\0') goto code_r0x0004e714;
code_r0x0004e684:
      if (-1 < in_stack_000000c8._7_1_) goto code_r0x0004e68c;
code_r0x0004e724:
      __ZdlPv(in_stack_000000b8);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
        return;
      }
    }
    ___stack_chk_fail();
    pcVar12 = extraout_x9;
    lVar18 = extraout_x10;
    pcVar14 = extraout_x11;
    iVar11 = extraout_w8;
code_r0x0004e748:
    bVar10 = lVar18 == 0 && pcVar14 == pcVar12;
  }
  func_0x006e644c(in_stack_00000000,"Access outside workspace is not allowed");
code_r0x0004e7c0:
                    /* WARNING: Does not return */
  pcVar9 = (code *)SoftwareBreakpoint(1,0x4e7c4);
  (*pcVar9)();
}

