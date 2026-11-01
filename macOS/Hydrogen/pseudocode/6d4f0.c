
/* WARNING: Removing unreachable block (ram,0x0006d76c) */
/* WARNING: Removing unreachable block (ram,0x0006d7dc) */
/* WARNING: Type propagation algorithm not settling */

long * FUN_0006d4f0(void)

{
  ulong uVar1;
  ulong uVar2;
  char cVar3;
  undefined8 *puVar4;
  code *pcVar5;
  int iVar6;
  undefined1 *puVar7;
  long *plVar8;
  undefined8 uVar9;
  long *plVar10;
  undefined8 *puVar11;
  ulong uVar12;
  long *plVar13;
  char *pcVar14;
  long unaff_x21;
  long unaff_x22;
  long *plVar15;
  ulong unaff_x25;
  long unaff_x29;
  long lVar16;
  undefined1 auVar17 [16];
  undefined1 *in_stack_00000000;
  ulong in_stack_00000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  ulong in_stack_00000020;
  undefined7 uStack0000000000000028;
  byte bStack000000000000002f;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000058;
  
  *(char *)(unaff_x29 + -0x59) = (char)unaff_x21;
  if (unaff_x21 != 0) {
    _memmove();
  }
  *(undefined1 *)(unaff_x22 + unaff_x21) = 0;
  if ((char)bStack000000000000002f < '\0') {
    pcVar14 = (char *)CONCAT71(uStack0000000000000018._1_7_,(char)uStack0000000000000018);
    if (((in_stack_00000020 < 2) || (*pcVar14 != '\"')) || (pcVar14[in_stack_00000020 - 1] != '\"'))
    {
      func_0x00017634();
      goto LAB_0006d6e8;
    }
    pcVar14 = pcVar14 + 1;
    uVar1 = in_stack_00000020 - 1;
    if (in_stack_00000020 - 2 <= in_stack_00000020 - 1) {
      uVar1 = in_stack_00000020 - 2;
    }
  }
  else {
    uVar12 = (ulong)bStack000000000000002f;
    if (((bStack000000000000002f < 2) || ((char)uStack0000000000000018 != '\"')) ||
       (*(char *)((long)&uStack0000000000000010 + uVar12 + 7) != '\"')) {
      in_stack_00000000 =
           (undefined1 *)CONCAT71(uStack0000000000000018._1_7_,(char)uStack0000000000000018);
      in_stack_00000008 = in_stack_00000020;
      uStack0000000000000010 = CONCAT17(bStack000000000000002f,uStack0000000000000028);
      goto LAB_0006d6e8;
    }
    pcVar14 = (char *)((ulong)&uStack0000000000000018 | 1);
    uVar1 = uVar12 - 1;
    if (uVar12 - 2 <= uVar12 - 1) {
      uVar1 = uVar12 - 2;
    }
  }
  if (unaff_x25 < uVar1) {
    func_0x0001748c();
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x6d7ac);
    (*pcVar5)();
  }
  if (uVar1 < 0x17) {
    uStack0000000000000010 = CONCAT17((char)uVar1,(undefined7)uStack0000000000000010);
    puVar7 = (undefined1 *)register0x00000008;
    if (uVar1 != 0) goto LAB_0006d6d4;
  }
  else {
    uVar12 = (uVar1 & 0xfffffffffffffff8) + 8;
    if ((uVar1 | 7) != 0x17) {
      uVar12 = uVar1 | 7;
    }
    puVar7 = (undefined1 *)__Znwm(uVar12 + 1);
    uStack0000000000000010 = uVar12 + 1 | 0x8000000000000000;
    in_stack_00000000 = puVar7;
    in_stack_00000008 = uVar1;
LAB_0006d6d4:
    _memmove(puVar7,pcVar14,uVar1);
  }
  puVar7[uVar1] = 0;
LAB_0006d6e8:
  plVar8 = (long *)func_0x00060f04();
  if ((long)uStack0000000000000010 < 0) {
    plVar8 = (long *)__ZdlPv(in_stack_00000000);
  }
  if ((char)bStack000000000000002f < '\0') {
    plVar8 = (long *)__ZdlPv(CONCAT71(uStack0000000000000018._1_7_,(char)uStack0000000000000018));
  }
  if (in_stack_00000040._7_1_ < '\0') {
    plVar8 = (long *)__ZdlPv(in_stack_00000030);
  }
  if (in_stack_00000058._7_1_ < '\0') {
    plVar8 = (long *)__ZdlPv(in_stack_00000048);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return plVar8;
  }
  uVar9 = ___stack_chk_fail();
  if ((char)bStack000000000000002f < '\0') {
    __ZdlPv(CONCAT71(uStack0000000000000018._1_7_,(char)uStack0000000000000018));
  }
  if (in_stack_00000040._7_1_ < '\0') {
    __ZdlPv(in_stack_00000030);
  }
  if (in_stack_00000058._7_1_ < '\0') {
    __ZdlPv(in_stack_00000048);
    uVar9 = __Unwind_Resume(uVar9);
  }
  auVar17 = __Unwind_Resume(uVar9);
  puVar11 = auVar17._8_8_;
  plVar10 = auVar17._0_8_;
  plVar8 = plVar10 + 1;
  plVar13 = (long *)*plVar8;
  if (plVar13 == (long *)0x0) {
    plVar13 = (long *)__Znwm(0x38);
    cVar3 = *(char *)((long)register0x00000008 + 0x17);
    plVar15 = plVar8;
  }
  else {
    puVar4 = (undefined8 *)*puVar11;
    uVar12 = puVar11[1];
    if (-1 < (char)*(byte *)((long)puVar11 + 0x17)) {
      puVar4 = puVar11;
      uVar12 = (ulong)*(byte *)((long)puVar11 + 0x17);
    }
    do {
      while( true ) {
        plVar8 = plVar13;
        uVar1 = plVar8[5];
        plVar13 = (long *)plVar8[4];
        if (-1 < (char)*(byte *)((long)plVar8 + 0x37)) {
          uVar1 = (ulong)*(byte *)((long)plVar8 + 0x37);
          plVar13 = plVar8 + 4;
        }
        uVar2 = uVar1;
        if (uVar12 <= uVar1) {
          uVar2 = uVar12;
        }
        iVar6 = _memcmp(puVar4,plVar13,uVar2);
        if (iVar6 != 0) break;
        if (uVar1 <= uVar12) goto code_r0x0006d954;
code_r0x0006d8fc:
        plVar13 = (long *)*plVar8;
        plVar15 = plVar8;
        if ((long *)*plVar8 == (long *)0x0) goto code_r0x0006d984;
      }
      if (iVar6 < 0) goto code_r0x0006d8fc;
code_r0x0006d954:
      iVar6 = _memcmp(plVar13,puVar4,uVar2);
      if (iVar6 == 0) {
        if (uVar12 <= uVar1) {
          return plVar8;
        }
      }
      else if (-1 < iVar6) {
        return plVar8;
      }
      plVar13 = (long *)plVar8[1];
    } while ((long *)plVar8[1] != (long *)0x0);
    plVar15 = plVar8 + 1;
code_r0x0006d984:
    plVar13 = (long *)__Znwm(0x38);
    cVar3 = *(char *)((long)register0x00000008 + 0x17);
  }
  if (cVar3 < '\0') {
    func_0x00017634(plVar13 + 4,*(long *)register0x00000008,*(long *)((long)register0x00000008 + 8))
    ;
  }
  else {
    lVar16 = *(long *)register0x00000008;
    plVar13[5] = *(long *)((long)register0x00000008 + 8);
    plVar13[4] = lVar16;
    plVar13[6] = *(long *)((long)register0x00000008 + 0x10);
  }
  *plVar13 = 0;
  plVar13[1] = 0;
  plVar13[2] = (long)plVar8;
  *plVar15 = (long)plVar13;
  plVar8 = plVar13;
  if (*(long *)*plVar10 != 0) {
    *plVar10 = *(long *)*plVar10;
    plVar8 = (long *)*plVar15;
  }
  func_0x0003767c(plVar10[1],plVar8);
  plVar10[2] = plVar10[2] + 1;
  return plVar13;
}

