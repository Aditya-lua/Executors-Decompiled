
/* WARNING: Removing unreachable block (ram,0x0004e41c) */
/* WARNING: Removing unreachable block (ram,0x0004e464) */
/* WARNING: Removing unreachable block (ram,0x0004e4bc) */
/* WARNING: Removing unreachable block (ram,0x0004e4c8) */
/* WARNING: Removing unreachable block (ram,0x0004e4dc) */
/* WARNING: Removing unreachable block (ram,0x0004e6d4) */
/* WARNING: Removing unreachable block (ram,0x0004e6e4) */

void FUN_0004e3f4(void)

{
  char *pcVar1;
  char *pcVar2;
  ulong uVar3;
  byte bVar4;
  char *pcVar5;
  code *pcVar6;
  bool bVar7;
  int extraout_w8;
  int iVar8;
  char *extraout_x9;
  char *pcVar9;
  ulong uVar10;
  long extraout_x10;
  long lVar11;
  char *extraout_x11;
  char *pcVar12;
  char *pcVar13;
  char *pcVar14;
  undefined8 *unaff_x23;
  undefined8 *unaff_x26;
  long unaff_x29;
  undefined8 uVar15;
  undefined8 in_stack_00000000;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000038;
  ulong in_stack_00000040;
  int in_stack_00000050;
  undefined8 uStack0000000000000060;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000090;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c8;
  
  __ZNSt3__14__fs10filesystem18__weakly_canonicalERKNS1_4pathEPNS_10error_codeE();
  if (in_stack_00000050 == 0) {
    *(undefined8 *)(unaff_x29 + -0x78) = *(undefined8 *)(unaff_x29 + -0x98);
    *(undefined8 *)(unaff_x29 + -0x80) = *(undefined8 *)(unaff_x29 + -0xa0);
    *(undefined8 *)(unaff_x29 + -0x70) = *(undefined8 *)(unaff_x29 + -0x90);
    func_0x0001754c(unaff_x29 + -0x80,&uStack0000000000000060);
    func_0x0004e9b0();
    if (*(char *)((long)unaff_x23 + 0x17) < '\0') {
      func_0x00017634(unaff_x29 + -0x80,*unaff_x23,unaff_x23[1]);
    }
    else {
      uVar15 = *unaff_x23;
      *(undefined8 *)(unaff_x29 + -0x78) = unaff_x23[1];
      *(undefined8 *)(unaff_x29 + -0x80) = uVar15;
      *(undefined8 *)(unaff_x29 + -0x70) = unaff_x23[2];
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
    lVar11 = *(long *)(unaff_x29 + -0x80);
    if (-1 < (char)bVar4) {
      uVar3 = uVar10;
      lVar11 = unaff_x29 + -0x80;
    }
    func_0x00017184(&uStack0000000000000030,lVar11,lVar11 + uVar3);
    if (*(char *)((long)unaff_x23 + 0x17) < '\0') {
      __ZdlPv(*unaff_x23);
    }
    unaff_x23[1] = in_stack_00000038;
    *unaff_x23 = uStack0000000000000030;
    unaff_x23[2] = in_stack_00000040;
    if (cRam0000000000a33947 < '\0') {
      func_0x00017634(&uStack0000000000000030,*unaff_x26,unaff_x26[1]);
    }
    else {
      in_stack_00000038 = unaff_x26[1];
      uStack0000000000000030 = (char *)*unaff_x26;
      in_stack_00000040 = unaff_x26[2];
    }
    if (*(char *)((long)unaff_x23 + 0x17) < '\0') {
      func_0x00017634(&uStack0000000000000010,*unaff_x23,unaff_x23[1]);
    }
    else {
      in_stack_00000018 = unaff_x23[1];
      uStack0000000000000010 = (char *)*unaff_x23;
      in_stack_00000020 = unaff_x23[2];
    }
    iVar8 = (int)(char)in_stack_00000020._7_1_;
    uVar10 = in_stack_00000018;
    pcVar9 = uStack0000000000000010;
    if (-1 < iVar8) {
      uVar10 = (ulong)in_stack_00000020._7_1_;
      pcVar9 = (char *)&uStack0000000000000010;
    }
    uVar3 = in_stack_00000038;
    pcVar5 = uStack0000000000000030;
    if (-1 < (long)in_stack_00000040) {
      uVar3 = in_stack_00000040 >> 0x38;
      pcVar5 = (char *)&uStack0000000000000030;
    }
    if (uVar3 <= uVar10) {
      uVar10 = uVar3;
    }
    pcVar12 = pcVar9 + uVar10;
    lVar11 = 0;
    if (uVar3 == 0) goto code_r0x0004e748;
    pcVar13 = pcVar12;
    if (uVar10 != 0) {
      pcVar14 = pcVar9;
      do {
        if (*pcVar14 == *pcVar5) {
          uVar10 = 1;
          do {
            if (uVar3 == uVar10) {
              pcVar13 = pcVar14;
              break;
            }
            pcVar2 = pcVar14 + uVar10;
            if (pcVar2 == pcVar12) goto code_r0x0004e638;
            pcVar1 = pcVar5 + uVar10;
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
      if (in_stack_00000070._7_1_ < '\0') {
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
        __ZdlPv(in_stack_00000080);
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
      pcVar9 = extraout_x9;
      lVar11 = extraout_x10;
      pcVar12 = extraout_x11;
      iVar8 = extraout_w8;
code_r0x0004e748:
      bVar7 = lVar11 == 0 && pcVar12 == pcVar9;
    }
    func_0x006e644c(in_stack_00000000,"Access outside workspace is not allowed");
  }
  else {
    func_0x006e644c(in_stack_00000000,"Failed to resolve path component");
  }
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x4e7c4);
  (*pcVar6)();
}

