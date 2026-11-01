
/* WARNING: Possible PIC construction at 0x0006d3d0: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x0006d3d4) */
/* WARNING: Removing unreachable block (ram,0x0006d444) */
/* WARNING: Removing unreachable block (ram,0x0006d438) */
/* WARNING: Removing unreachable block (ram,0x0006d43c) */
/* WARNING: Removing unreachable block (ram,0x0006d44c) */
/* WARNING: Removing unreachable block (ram,0x0006d458) */
/* WARNING: Removing unreachable block (ram,0x0006d474) */
/* WARNING: Removing unreachable block (ram,0x0006d468) */
/* WARNING: Removing unreachable block (ram,0x0006d46c) */
/* WARNING: Removing unreachable block (ram,0x0006d47c) */
/* WARNING: Removing unreachable block (ram,0x0006d488) */
/* WARNING: Removing unreachable block (ram,0x0006d4fc) */
/* WARNING: Removing unreachable block (ram,0x0006d504) */
/* WARNING: Removing unreachable block (ram,0x0006d514) */
/* WARNING: Removing unreachable block (ram,0x0006d520) */
/* WARNING: Removing unreachable block (ram,0x0006d574) */
/* WARNING: Removing unreachable block (ram,0x0006d530) */
/* WARNING: Removing unreachable block (ram,0x0006d540) */
/* WARNING: Removing unreachable block (ram,0x0006d490) */
/* WARNING: Removing unreachable block (ram,0x0006d498) */
/* WARNING: Removing unreachable block (ram,0x0006d4a4) */
/* WARNING: Removing unreachable block (ram,0x0006d4b0) */
/* WARNING: Removing unreachable block (ram,0x0006d558) */
/* WARNING: Removing unreachable block (ram,0x0006d570) */
/* WARNING: Removing unreachable block (ram,0x0006d4c8) */
/* WARNING: Removing unreachable block (ram,0x0006d4dc) */
/* WARNING: Removing unreachable block (ram,0x0006d54c) */
/* WARNING: Removing unreachable block (ram,0x0006d4e8) */
/* WARNING: Removing unreachable block (ram,0x0006d5fc) */
/* WARNING: Removing unreachable block (ram,0x0006d60c) */
/* WARNING: Removing unreachable block (ram,0x0006d4f0) */
/* WARNING: Removing unreachable block (ram,0x0006d62c) */
/* WARNING: Removing unreachable block (ram,0x0006d4f8) */
/* WARNING: Removing unreachable block (ram,0x0006d63c) */
/* WARNING: Removing unreachable block (ram,0x0006d584) */
/* WARNING: Removing unreachable block (ram,0x0006d590) */
/* WARNING: Removing unreachable block (ram,0x0006d59c) */
/* WARNING: Removing unreachable block (ram,0x0006d5e8) */
/* WARNING: Removing unreachable block (ram,0x0006d5b0) */
/* WARNING: Removing unreachable block (ram,0x0006d5c4) */
/* WARNING: Removing unreachable block (ram,0x0006d648) */
/* WARNING: Removing unreachable block (ram,0x0006d654) */
/* WARNING: Removing unreachable block (ram,0x0006d660) */
/* WARNING: Removing unreachable block (ram,0x0006d698) */
/* WARNING: Removing unreachable block (ram,0x0006d670) */
/* WARNING: Removing unreachable block (ram,0x0006d680) */
/* WARNING: Removing unreachable block (ram,0x0006d5d0) */
/* WARNING: Removing unreachable block (ram,0x0006d6a4) */
/* WARNING: Removing unreachable block (ram,0x0006d6b4) */
/* WARNING: Removing unreachable block (ram,0x0006d5d8) */
/* WARNING: Removing unreachable block (ram,0x0006d6d4) */
/* WARNING: Removing unreachable block (ram,0x0006d5e4) */
/* WARNING: Removing unreachable block (ram,0x0006d6e4) */
/* WARNING: Removing unreachable block (ram,0x0006d6e8) */
/* WARNING: Removing unreachable block (ram,0x0006d75c) */
/* WARNING: Removing unreachable block (ram,0x0006d700) */
/* WARNING: Removing unreachable block (ram,0x0006d76c) */
/* WARNING: Removing unreachable block (ram,0x0006d708) */
/* WARNING: Removing unreachable block (ram,0x0006d77c) */
/* WARNING: Removing unreachable block (ram,0x0006d710) */
/* WARNING: Removing unreachable block (ram,0x0006d78c) */
/* WARNING: Removing unreachable block (ram,0x0006d79c) */
/* WARNING: Removing unreachable block (ram,0x0006d68c) */
/* WARNING: Removing unreachable block (ram,0x0006d7a8) */
/* WARNING: Removing unreachable block (ram,0x0006d7dc) */

long * FUN_0006d34c(undefined8 param_1,undefined8 param_2,long *param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  char cVar4;
  undefined8 *puVar5;
  int iVar6;
  long *plVar7;
  long *plVar8;
  undefined8 uVar9;
  long *plVar10;
  undefined8 *puVar11;
  long *unaff_x19;
  long unaff_x20;
  long unaff_x21;
  long *unaff_x22;
  long *plVar12;
  undefined1 *unaff_x23;
  long unaff_x29;
  long lVar13;
  undefined1 auVar14 [16];
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000040;
  long lStack0000000000000048;
  undefined8 in_stack_00000058;
  
  if (unaff_x21 != unaff_x20) {
    param_3 = unaff_x22;
    _memcpy();
    unaff_x23 = unaff_x23 + (long)unaff_x22;
  }
  *unaff_x23 = 0;
  plVar7 = (long *)func_0x0005fed4(*unaff_x19,&lStack0000000000000048);
  plVar8 = (long *)*unaff_x19;
  if (plVar8 + 1 == plVar7) {
    auVar14._8_8_ = &lStack0000000000000048;
    auVar14._0_8_ = plVar8;
    param_3 = &lStack0000000000000048;
  }
  else {
    if (in_stack_00000058._7_1_ < '\0') {
      plVar8 = (long *)__ZdlPv(lStack0000000000000048);
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
      return plVar8;
    }
    uVar9 = ___stack_chk_fail();
    if (in_stack_00000028 < 0) {
      __ZdlPv(in_stack_00000018);
    }
    if (in_stack_00000040 < 0) {
      __ZdlPv(in_stack_00000030);
    }
    if (in_stack_00000058._7_1_ < '\0') {
      __ZdlPv(lStack0000000000000048);
      uVar9 = __Unwind_Resume(uVar9);
    }
    auVar14 = __Unwind_Resume(uVar9);
  }
  puVar11 = auVar14._8_8_;
  plVar10 = auVar14._0_8_;
  plVar7 = plVar10 + 1;
  plVar8 = (long *)*plVar7;
  if (plVar8 == (long *)0x0) {
    plVar8 = (long *)__Znwm(0x38);
    cVar4 = *(char *)((long)param_3 + 0x17);
    plVar12 = plVar7;
  }
  else {
    puVar5 = (undefined8 *)*puVar11;
    uVar1 = puVar11[1];
    if (-1 < (char)*(byte *)((long)puVar11 + 0x17)) {
      puVar5 = puVar11;
      uVar1 = (ulong)*(byte *)((long)puVar11 + 0x17);
    }
    do {
      while( true ) {
        plVar7 = plVar8;
        uVar2 = plVar7[5];
        plVar8 = (long *)plVar7[4];
        if (-1 < (char)*(byte *)((long)plVar7 + 0x37)) {
          uVar2 = (ulong)*(byte *)((long)plVar7 + 0x37);
          plVar8 = plVar7 + 4;
        }
        uVar3 = uVar2;
        if (uVar1 <= uVar2) {
          uVar3 = uVar1;
        }
        iVar6 = _memcmp(puVar5,plVar8,uVar3);
        if (iVar6 == 0) break;
        if (-1 < iVar6) goto code_r0x0006d954;
code_r0x0006d8fc:
        plVar8 = (long *)*plVar7;
        plVar12 = plVar7;
        if ((long *)*plVar7 == (long *)0x0) goto code_r0x0006d984;
      }
      if (uVar1 < uVar2) goto code_r0x0006d8fc;
code_r0x0006d954:
      iVar6 = _memcmp(plVar8,puVar5,uVar3);
      if (iVar6 == 0) {
        if (uVar1 <= uVar2) {
          return plVar7;
        }
      }
      else if (-1 < iVar6) {
        return plVar7;
      }
      plVar8 = (long *)plVar7[1];
    } while ((long *)plVar7[1] != (long *)0x0);
    plVar12 = plVar7 + 1;
code_r0x0006d984:
    plVar8 = (long *)__Znwm(0x38);
    cVar4 = *(char *)((long)param_3 + 0x17);
  }
  if (cVar4 < '\0') {
    func_0x00017634(plVar8 + 4,*param_3,param_3[1]);
  }
  else {
    lVar13 = *param_3;
    plVar8[5] = param_3[1];
    plVar8[4] = lVar13;
    plVar8[6] = param_3[2];
  }
  *plVar8 = 0;
  plVar8[1] = 0;
  plVar8[2] = (long)plVar7;
  *plVar12 = (long)plVar8;
  plVar7 = plVar8;
  if (*(long *)*plVar10 != 0) {
    *plVar10 = *(long *)*plVar10;
    plVar7 = (long *)*plVar12;
  }
  func_0x0003767c(plVar10[1],plVar7);
  plVar10[2] = plVar10[2] + 1;
  return plVar8;
}

