
/* WARNING: Removing unreachable block (ram,0x0004e41c) */
/* WARNING: Removing unreachable block (ram,0x0004e2e8) */
/* WARNING: Removing unreachable block (ram,0x0004e1a4) */
/* WARNING: Removing unreachable block (ram,0x0004e32c) */
/* WARNING: Removing unreachable block (ram,0x0004e464) */
/* WARNING: Removing unreachable block (ram,0x0004e4bc) */
/* WARNING: Removing unreachable block (ram,0x0004e4c8) */
/* WARNING: Removing unreachable block (ram,0x0004e4dc) */
/* WARNING: Removing unreachable block (ram,0x0004e6d4) */
/* WARNING: Removing unreachable block (ram,0x0004e6e4) */

void FUN_0004e008(char *param_1)

{
  char *pcVar1;
  char *pcVar2;
  ulong uVar3;
  byte bVar4;
  undefined1 uVar5;
  code *pcVar6;
  bool bVar7;
  long extraout_x1;
  int extraout_w8;
  int iVar8;
  char *in_x9;
  char *extraout_x9;
  char *pcVar9;
  ulong uVar10;
  long extraout_x10;
  char *pcVar11;
  char *extraout_x11;
  char *pcVar12;
  char *pcVar13;
  char *pcVar14;
  long unaff_x19;
  ulong unaff_x20;
  undefined8 uVar15;
  long lVar16;
  long unaff_x25;
  undefined8 unaff_x27;
  long unaff_x29;
  undefined1 auVar17 [16];
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
  undefined8 in_stack_00000088;
  undefined7 uStack0000000000000090;
  undefined8 uStack00000000000000a0;
  undefined8 in_stack_000000a8;
  undefined7 uStack00000000000000b0;
  char cStack00000000000000b7;
  undefined8 uStack00000000000000b8;
  undefined8 in_stack_000000c8;
  
  do {
    bVar4 = param_1[0x17];
    uVar10 = *(ulong *)(param_1 + 8);
    if (-1 < (char)bVar4) {
      uVar10 = (ulong)bVar4;
    }
    if (unaff_x20 == uVar10) {
      pcVar9 = *(char **)param_1;
      if (-1 < (char)bVar4) {
        pcVar9 = param_1;
      }
      pcVar11 = (char *)&uStack00000000000000a0;
      lVar16 = unaff_x19;
      while (*pcVar11 == *pcVar9) {
        pcVar11 = pcVar11 + 1;
        pcVar9 = pcVar9 + 1;
        lVar16 = lVar16 + -1;
        if (lVar16 == 0) {
          func_0x006e644c();
          goto LAB_0004e7c0;
        }
      }
    }
    param_1 = param_1 + 0x18;
  } while (param_1 != in_x9);
  if (((uint)unaff_x19 >> 7 & 1) != 0) {
    __ZdlPv();
  }
  pcVar9 = pcRam0000000000a33930;
  if (cRam0000000000a33947 < '\0') {
    func_0x00017634(unaff_x29 + -0xa0,pcRam0000000000a33930,uRam0000000000a33938);
  }
  else {
    *(ulong *)(unaff_x29 + -0x98) = uRam0000000000a33938;
    *(char **)(unaff_x29 + -0xa0) = pcVar9;
    *(ulong *)(unaff_x29 + -0x90) = CONCAT17(cRam0000000000a33947,uRam0000000000a33940);
  }
  func_0x0001754c(unaff_x29 + -0xa0,&uStack00000000000000b8);
  func_0x0004e9b0(&uStack00000000000000a0,unaff_x29 + -0xa0);
  if (cStack00000000000000b7 < '\0') {
    func_0x00017634(&uStack0000000000000080,uStack00000000000000a0,in_stack_000000a8);
  }
  else {
    in_stack_00000088 = in_stack_000000a8;
    uStack0000000000000080 = uStack00000000000000a0;
    _uStack0000000000000090 = CONCAT17(cStack00000000000000b7,uStack00000000000000b0);
  }
  uStack0000000000000060 = 0;
  in_stack_00000068 = 0;
  in_stack_00000070 = 0;
  while ((__ZNSt3__14__fs10filesystem8__statusERKNS1_4pathEPNS_10error_codeE
                    (unaff_x29 + -0xa0,&uStack0000000000000080,0),
         *(char *)(unaff_x29 + -0xa0) == -1 || *(char *)(unaff_x29 + -0xa0) == '\0' &&
         (__ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080),
         extraout_x1 != 0))) {
    auVar17 = __ZNKSt3__14__fs10filesystem4path10__filenameEv(&uStack0000000000000080);
    uVar10 = auVar17._8_8_;
    if (0x7ffffffffffffff7 < uVar10) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto LAB_0004e7c0;
    }
    if (uVar10 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar17[8];
      lVar16 = unaff_x29 + -0xa0;
      if (uVar10 != 0) goto code_r0x0004e29c;
    }
    else {
      uVar3 = (uVar10 & 0xfffffffffffffff8) + 8;
      if ((uVar10 | 7) != 0x17) {
        uVar3 = uVar10 | 7;
      }
      lVar16 = __Znwm(uVar3 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar10;
      *(ulong *)(unaff_x29 + -0x90) = uVar3 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar16;
code_r0x0004e29c:
      _memmove(lVar16,auVar17._0_8_,uVar10);
    }
    *(undefined1 *)(lVar16 + uVar10) = 0;
    uStack0000000000000030._0_7_ =
         CONCAT43(*(undefined4 *)(unaff_x29 + -0x8d),(int3)*(undefined4 *)(unaff_x29 + -0x90));
    pcVar9 = uStack0000000000000030;
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined4 *)(unaff_x29 + -0x70) = (undefined4)uStack0000000000000030;
    *(undefined4 *)(unaff_x29 + -0x6d) = *(undefined4 *)(unaff_x29 + -0x8d);
    *(undefined1 *)(unaff_x29 + -0x69) = *(undefined1 *)(unaff_x29 + -0x89);
    uStack0000000000000030 = pcVar9;
    func_0x0001754c(unaff_x29 + -0x80,&uStack0000000000000060);
    if (in_stack_00000070 < 0) {
      __ZdlPv(uStack0000000000000060);
    }
    in_stack_00000068 = *(undefined8 *)(unaff_x29 + -0x78);
    uStack0000000000000060 = *(undefined8 *)(unaff_x29 + -0x80);
    in_stack_00000070 = *(long *)(unaff_x29 + -0x70);
    *(undefined1 *)(unaff_x29 + -0x69) = 0;
    *(undefined1 *)(unaff_x29 + -0x80) = 0;
    auVar17 = __ZNKSt3__14__fs10filesystem4path13__parent_pathEv(&uStack0000000000000080);
    uVar10 = auVar17._8_8_;
    if (0x7ffffffffffffff7 < uVar10) {
      func_0x0001748c(unaff_x29 + -0xa0);
      goto LAB_0004e7c0;
    }
    if (uVar10 < 0x17) {
      *(char *)(unaff_x29 + -0x89) = auVar17[8];
      lVar16 = unaff_x29 + -0xa0;
      if (uVar10 != 0) goto code_r0x0004e39c;
    }
    else {
      uVar3 = (uVar10 & 0xfffffffffffffff8) + 8;
      if ((uVar10 | 7) != 0x17) {
        uVar3 = uVar10 | 7;
      }
      lVar16 = __Znwm(uVar3 + 1);
      *(ulong *)(unaff_x29 + -0x98) = uVar10;
      *(ulong *)(unaff_x29 + -0x90) = uVar3 + 1 | 0x8000000000000000;
      *(long *)(unaff_x29 + -0xa0) = lVar16;
code_r0x0004e39c:
      _memmove(lVar16,auVar17._0_8_,uVar10);
    }
    *(undefined1 *)(lVar16 + uVar10) = 0;
    uVar15 = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined8 *)(unaff_x25 + 0x57) = *(undefined8 *)(unaff_x29 + -0x91);
    uVar5 = *(undefined1 *)(unaff_x29 + -0x89);
    if (_uStack0000000000000090 < 0) {
      __ZdlPv(uStack0000000000000080);
    }
    *(undefined8 *)((ulong)&uStack0000000000000080 | 8) = *(undefined8 *)(unaff_x29 + -0x80);
    *(undefined8 *)((long)((ulong)&uStack0000000000000080 | 8) + 7) =
         *(undefined8 *)(unaff_x25 + 0x57);
    _uStack0000000000000090 = CONCAT17(uVar5,uStack0000000000000090);
    uStack0000000000000080 = uVar15;
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
      uVar15 = *in_stack_00000008;
      *(undefined8 *)(unaff_x29 + -0x78) = in_stack_00000008[1];
      *(undefined8 *)(unaff_x29 + -0x80) = uVar15;
      *(undefined8 *)(unaff_x29 + -0x70) = in_stack_00000008[2];
    }
    while( true ) {
      bVar4 = *(byte *)(unaff_x29 + -0x69);
      uVar10 = (ulong)bVar4;
      if ((bVar4 < 2) || (*(char *)(unaff_x29 + -0x81 + uVar10) != '/')) break;
      *(char *)(unaff_x29 + -0x69) = (char)(uVar10 - 1);
      *(undefined1 *)(unaff_x29 + -0x80 + (uVar10 - 1)) = 0;
    }
    uStack0000000000000030 = (char *)0x0;
    in_stack_00000038 = 0;
    in_stack_00000040 = 0;
    uVar3 = *(ulong *)(unaff_x29 + -0x78);
    lVar16 = *(long *)(unaff_x29 + -0x80);
    if (-1 < (char)bVar4) {
      uVar3 = uVar10;
      lVar16 = unaff_x29 + -0x80;
    }
    func_0x00017184(&uStack0000000000000030,lVar16,lVar16 + uVar3);
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
    iVar8 = (int)(char)in_stack_00000020._7_1_;
    uVar10 = in_stack_00000018;
    pcVar9 = uStack0000000000000010;
    if (-1 < iVar8) {
      uVar10 = (ulong)in_stack_00000020._7_1_;
      pcVar9 = (char *)&uStack0000000000000010;
    }
    uVar3 = in_stack_00000038;
    pcVar11 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar3 = in_stack_00000040 >> 0x38;
      pcVar11 = (char *)&uStack0000000000000030;
    }
    if (uVar3 <= uVar10) {
      uVar10 = uVar3;
    }
    pcVar12 = pcVar9 + uVar10;
    lVar16 = 0;
    if (uVar3 == 0) goto code_r0x0004e748;
    pcVar13 = pcVar12;
    if (uVar10 != 0) {
      pcVar14 = pcVar9;
      do {
        if (*pcVar14 == *pcVar11) {
          uVar10 = 1;
          do {
            if (uVar3 == uVar10) {
              pcVar13 = pcVar14;
              break;
            }
            pcVar2 = pcVar14 + uVar10;
            if (pcVar2 == pcVar12) goto code_r0x0004e638;
            pcVar1 = pcVar11 + uVar10;
            uVar10 = uVar10 + 1;
          } while (*pcVar2 == *pcVar1);
        }
        pcVar14 = pcVar14 + 1;
      } while (pcVar14 != pcVar12);
    }
code_r0x0004e638:
    bVar7 = (uVar3 == 0 || pcVar13 != pcVar12) && pcVar13 == pcVar9;
    while( true ) {
      if (iVar8 < 0) {
        __ZdlPv();
      }
      if (!bVar7) break;
      if ((long)in_stack_00000040 < 0) {
        __ZdlPv(uStack0000000000000030);
      }
      if (in_stack_00000070 < 0) {
        __ZdlPv(uStack0000000000000060);
        if (_uStack0000000000000090 < 0) goto code_r0x0004e704;
code_r0x0004e67c:
        if (-1 < cStack00000000000000b7) goto code_r0x0004e684;
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
        if (cStack00000000000000b7 < '\0') goto code_r0x0004e714;
code_r0x0004e684:
        if (-1 < in_stack_000000c8._7_1_) goto code_r0x0004e68c;
code_r0x0004e724:
        __ZdlPv(uStack00000000000000b8);
        if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
          return;
        }
      }
      ___stack_chk_fail();
      pcVar9 = extraout_x9;
      lVar16 = extraout_x10;
      pcVar12 = extraout_x11;
      iVar8 = extraout_w8;
code_r0x0004e748:
      bVar7 = lVar16 == 0 && pcVar12 == pcVar9;
    }
    func_0x006e644c(unaff_x27,"Access outside workspace is not allowed");
  }
  else {
    func_0x006e644c(unaff_x27,"Failed to resolve path component");
  }
LAB_0004e7c0:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x4e7c4);
  (*pcVar6)();
}

