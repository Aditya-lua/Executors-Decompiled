
/* WARNING: Removing unreachable block (ram,0x0006d76c) */
/* WARNING: Removing unreachable block (ram,0x0006d7dc) */
/* WARNING: Type propagation algorithm not settling */

long * FUN_0006d6dc(void)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  char cVar4;
  undefined8 *puVar5;
  int iVar6;
  long *plVar7;
  undefined8 uVar8;
  long *plVar9;
  undefined8 *puVar10;
  long *plVar11;
  long unaff_x21;
  long unaff_x22;
  long *plVar12;
  long unaff_x29;
  long lVar13;
  undefined1 auVar14 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000058;
  
  _memmove();
  *(undefined1 *)(unaff_x22 + unaff_x21) = 0;
  plVar7 = (long *)func_0x00060f04();
  if (in_stack_00000010._7_1_ < '\0') {
    plVar7 = (long *)__ZdlPv(in_stack_00000000);
  }
  if (in_stack_00000028._7_1_ < '\0') {
    plVar7 = (long *)__ZdlPv(in_stack_00000018);
  }
  if (in_stack_00000040._7_1_ < '\0') {
    plVar7 = (long *)__ZdlPv(in_stack_00000030);
  }
  if (in_stack_00000058._7_1_ < '\0') {
    plVar7 = (long *)__ZdlPv(in_stack_00000048);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return plVar7;
  }
  uVar8 = ___stack_chk_fail();
  if (in_stack_00000028._7_1_ < '\0') {
    __ZdlPv(in_stack_00000018);
  }
  if (in_stack_00000040._7_1_ < '\0') {
    __ZdlPv(in_stack_00000030);
  }
  if (in_stack_00000058._7_1_ < '\0') {
    __ZdlPv(in_stack_00000048);
    uVar8 = __Unwind_Resume(uVar8);
  }
  auVar14 = __Unwind_Resume(uVar8);
  puVar10 = auVar14._8_8_;
  plVar9 = auVar14._0_8_;
  plVar7 = plVar9 + 1;
  plVar11 = (long *)*plVar7;
  if (plVar11 == (long *)0x0) {
    plVar11 = (long *)__Znwm(0x38);
    cVar4 = *(char *)((long)register0x00000008 + 0x17);
    plVar12 = plVar7;
  }
  else {
    puVar5 = (undefined8 *)*puVar10;
    uVar1 = puVar10[1];
    if (-1 < (char)*(byte *)((long)puVar10 + 0x17)) {
      puVar5 = puVar10;
      uVar1 = (ulong)*(byte *)((long)puVar10 + 0x17);
    }
    do {
      while( true ) {
        plVar7 = plVar11;
        uVar2 = plVar7[5];
        plVar11 = (long *)plVar7[4];
        if (-1 < (char)*(byte *)((long)plVar7 + 0x37)) {
          uVar2 = (ulong)*(byte *)((long)plVar7 + 0x37);
          plVar11 = plVar7 + 4;
        }
        uVar3 = uVar2;
        if (uVar1 <= uVar2) {
          uVar3 = uVar1;
        }
        iVar6 = _memcmp(puVar5,plVar11,uVar3);
        if (iVar6 != 0) break;
        if (uVar2 <= uVar1) goto LAB_0006d954;
LAB_0006d8fc:
        plVar11 = (long *)*plVar7;
        plVar12 = plVar7;
        if ((long *)*plVar7 == (long *)0x0) goto LAB_0006d984;
      }
      if (iVar6 < 0) goto LAB_0006d8fc;
LAB_0006d954:
      iVar6 = _memcmp(plVar11,puVar5,uVar3);
      if (iVar6 == 0) {
        if (uVar1 <= uVar2) {
          return plVar7;
        }
      }
      else if (-1 < iVar6) {
        return plVar7;
      }
      plVar11 = (long *)plVar7[1];
    } while ((long *)plVar7[1] != (long *)0x0);
    plVar12 = plVar7 + 1;
LAB_0006d984:
    plVar11 = (long *)__Znwm(0x38);
    cVar4 = *(char *)((long)register0x00000008 + 0x17);
  }
  if (cVar4 < '\0') {
    func_0x00017634(plVar11 + 4,*(long *)register0x00000008,*(long *)((long)register0x00000008 + 8))
    ;
  }
  else {
    lVar13 = *(long *)register0x00000008;
    plVar11[5] = *(long *)((long)register0x00000008 + 8);
    plVar11[4] = lVar13;
    plVar11[6] = *(long *)((long)register0x00000008 + 0x10);
  }
  *plVar11 = 0;
  plVar11[1] = 0;
  plVar11[2] = (long)plVar7;
  *plVar12 = (long)plVar11;
  plVar7 = plVar11;
  if (*(long *)*plVar9 != 0) {
    *plVar9 = *(long *)*plVar9;
    plVar7 = (long *)*plVar12;
  }
  func_0x0003767c(plVar9[1],plVar7);
  plVar9[2] = plVar9[2] + 1;
  return plVar11;
}

