
/* WARNING: Removing unreachable block (ram,0x0004e4bc) */
/* WARNING: Removing unreachable block (ram,0x0004e4c8) */
/* WARNING: Removing unreachable block (ram,0x0004e4dc) */
/* WARNING: Removing unreachable block (ram,0x0004e6d4) */
/* WARNING: Removing unreachable block (ram,0x0004e6e4) */

void FUN_0004e4a8(long param_1)

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
  ulong in_x9;
  char *extraout_x9;
  char *pcVar9;
  long extraout_x10;
  long lVar10;
  char *extraout_x11;
  char *pcVar11;
  char *pcVar12;
  char *pcVar13;
  ulong uVar14;
  undefined8 *unaff_x23;
  undefined8 *unaff_x26;
  long unaff_x29;
  undefined8 in_stack_00000000;
  undefined8 uStack0000000000000010;
  ulong in_stack_00000018;
  undefined8 in_stack_00000020;
  char cStack0000000000000030;
  ulong uStack0000000000000038;
  ulong uStack0000000000000040;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000070;
  undefined8 in_stack_00000080;
  undefined8 in_stack_00000090;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c8;
  
  do {
    *(char *)(unaff_x29 + -0x69) = (char)(in_x9 - 1);
    *(undefined1 *)(unaff_x29 + -0x80 + (in_x9 - 1)) = 0;
    bVar4 = *(byte *)(unaff_x29 + -0x69);
    in_x9 = (ulong)bVar4;
    if (bVar4 < 2) break;
  } while (*(char *)(param_1 + in_x9) == '/');
  _cStack0000000000000030 = (char *)0x0;
  uStack0000000000000038 = 0;
  uStack0000000000000040 = 0;
  uVar14 = *(ulong *)(unaff_x29 + -0x78);
  lVar10 = *(long *)(unaff_x29 + -0x80);
  if (-1 < (char)bVar4) {
    uVar14 = in_x9;
    lVar10 = unaff_x29 + -0x80;
  }
  func_0x00017184(&cStack0000000000000030,lVar10,lVar10 + uVar14);
  if (*(char *)((long)unaff_x23 + 0x17) < '\0') {
    __ZdlPv(*unaff_x23);
  }
  unaff_x23[1] = uStack0000000000000038;
  *unaff_x23 = _cStack0000000000000030;
  unaff_x23[2] = uStack0000000000000040;
  if (cRam0000000000a33947 < '\0') {
    func_0x00017634(&cStack0000000000000030,*unaff_x26,unaff_x26[1]);
  }
  else {
    uStack0000000000000038 = unaff_x26[1];
    _cStack0000000000000030 = (char *)*unaff_x26;
    uStack0000000000000040 = unaff_x26[2];
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
  uVar14 = in_stack_00000018;
  pcVar9 = uStack0000000000000010;
  if (-1 < iVar8) {
    uVar14 = (ulong)in_stack_00000020._7_1_;
    pcVar9 = (char *)&uStack0000000000000010;
  }
  uVar3 = uStack0000000000000038;
  pcVar5 = _cStack0000000000000030;
  if (-1 < (long)uStack0000000000000040) {
    uVar3 = uStack0000000000000040 >> 0x38;
    pcVar5 = &cStack0000000000000030;
  }
  if (uVar3 <= uVar14) {
    uVar14 = uVar3;
  }
  pcVar11 = pcVar9 + uVar14;
  lVar10 = 0;
  if (uVar3 == 0) goto code_r0x0004e748;
  pcVar12 = pcVar11;
  if (uVar14 != 0) {
    pcVar13 = pcVar9;
    do {
      if (*pcVar13 == *pcVar5) {
        uVar14 = 1;
        do {
          if (uVar3 == uVar14) {
            pcVar12 = pcVar13;
            break;
          }
          pcVar2 = pcVar13 + uVar14;
          if (pcVar2 == pcVar11) goto LAB_0004e638;
          pcVar1 = pcVar5 + uVar14;
          uVar14 = uVar14 + 1;
        } while (*pcVar2 == *pcVar1);
      }
      pcVar13 = pcVar13 + 1;
    } while (pcVar13 != pcVar11);
  }
LAB_0004e638:
  bVar7 = (uVar3 == 0 || pcVar12 != pcVar11) && pcVar12 == pcVar9;
  do {
    if (iVar8 < 0) {
      __ZdlPv();
    }
    if (!bVar7) {
      func_0x006e644c(in_stack_00000000,"Access outside workspace is not allowed");
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x4e7c4);
      (*pcVar6)();
    }
    if ((long)uStack0000000000000040 < 0) {
      __ZdlPv(_cStack0000000000000030);
    }
    if (in_stack_00000070._7_1_ < '\0') {
      __ZdlPv(in_stack_00000060);
      if (in_stack_00000090._7_1_ < '\0') goto LAB_0004e704;
LAB_0004e67c:
      if (-1 < in_stack_000000b0._7_1_) goto code_r0x0004e684;
LAB_0004e714:
      __ZdlPv(in_stack_000000a0);
      if (in_stack_000000c8._7_1_ < '\0') goto LAB_0004e724;
code_r0x0004e68c:
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
        return;
      }
    }
    else {
      if (-1 < in_stack_00000090._7_1_) goto LAB_0004e67c;
LAB_0004e704:
      __ZdlPv(in_stack_00000080);
      if (in_stack_000000b0._7_1_ < '\0') goto LAB_0004e714;
code_r0x0004e684:
      if (-1 < in_stack_000000c8._7_1_) goto code_r0x0004e68c;
LAB_0004e724:
      __ZdlPv(in_stack_000000b8);
      if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x68)) {
        return;
      }
    }
    ___stack_chk_fail();
    pcVar9 = extraout_x9;
    lVar10 = extraout_x10;
    pcVar11 = extraout_x11;
    iVar8 = extraout_w8;
code_r0x0004e748:
    bVar7 = lVar10 == 0 && pcVar11 == pcVar9;
  } while( true );
}

