
/* WARNING: Possible PIC construction at 0x000609fc: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00060a00) */
/* WARNING: Removing unreachable block (ram,0x00060a44) */
/* WARNING: Removing unreachable block (ram,0x00060a68) */
/* WARNING: Removing unreachable block (ram,0x00060a98) */
/* WARNING: Removing unreachable block (ram,0x00060a8c) */
/* WARNING: Removing unreachable block (ram,0x00060a90) */
/* WARNING: Removing unreachable block (ram,0x00060aa0) */
/* WARNING: Removing unreachable block (ram,0x00060aac) */
/* WARNING: Removing unreachable block (ram,0x00060abc) */
/* WARNING: Removing unreachable block (ram,0x00060ac4) */
/* WARNING: Removing unreachable block (ram,0x00060b5c) */
/* WARNING: Removing unreachable block (ram,0x00060b00) */
/* WARNING: Removing unreachable block (ram,0x00060b6c) */
/* WARNING: Removing unreachable block (ram,0x00060b08) */
/* WARNING: Removing unreachable block (ram,0x00060b7c) */
/* WARNING: Removing unreachable block (ram,0x00060b10) */
/* WARNING: Removing unreachable block (ram,0x00060b8c) */
/* WARNING: Removing unreachable block (ram,0x00060b9c) */

long * FUN_0006093c(long *param_1,long *param_2,long *param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  code *pcVar5;
  int iVar6;
  undefined8 *puVar7;
  undefined8 uVar8;
  long *plVar9;
  long *plVar10;
  long *plVar11;
  long *plVar12;
  long *plVar13;
  long *plVar14;
  long unaff_x29;
  long lVar15;
  undefined1 auVar16 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  long in_stack_00000058;
  long lStack0000000000000060;
  long *in_stack_00000068;
  undefined7 uStack0000000000000070;
  
  *(undefined8 *)(unaff_x29 + -0x48) = *(undefined8 *)PTR____stack_chk_guard_009b01e8;
  plVar13 = (long *)((long)param_3 - (long)param_2);
  if ((long *)0x7ffffffffffffff7 < plVar13) {
    func_0x0001748c(&lStack0000000000000060);
                    /* WARNING: Does not return */
    pcVar5 = (code *)SoftwareBreakpoint(1,0x60bac);
    (*pcVar5)();
  }
  plVar11 = param_3;
  if ((long *)((long)&MACH_HEADER.sizeofcmds + 2) < plVar13) {
    uVar1 = ((ulong)plVar13 & 0xfffffffffffffff8) + 8;
    if (((ulong)plVar13 | 7) != 0x17) {
      uVar1 = (ulong)plVar13 | 7;
    }
    puVar7 = (undefined8 *)__Znwm(uVar1 + 1);
    _uStack0000000000000070 = uVar1 + 1 | 0x8000000000000000;
    in_stack_00000068 = plVar13;
    lStack0000000000000060 = (long)puVar7;
  }
  else {
    _uStack0000000000000070 = CONCAT17((char)plVar13,uStack0000000000000070);
    puVar7 = &lStack0000000000000060;
  }
  if (param_2 != param_3) {
    plVar11 = plVar13;
    _memcpy(puVar7,param_2);
    puVar7 = (undefined8 *)((long)puVar7 + (long)plVar13);
  }
  *(undefined1 *)puVar7 = 0;
  plVar13 = (long *)func_0x0005fed4(*param_1,&lStack0000000000000060);
  param_1 = (long *)*param_1;
  if (param_1 + 1 == plVar13) {
    auVar16._8_8_ = &lStack0000000000000060;
    auVar16._0_8_ = param_1;
    plVar11 = &lStack0000000000000060;
  }
  else {
    if ((long)_uStack0000000000000070 < 0) {
      param_1 = (long *)__ZdlPv(lStack0000000000000060);
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
      return param_1;
    }
    uVar8 = ___stack_chk_fail();
    if (in_stack_00000010 < 0) {
      __ZdlPv(in_stack_00000000);
    }
    if (in_stack_00000028 < 0) {
      __ZdlPv(in_stack_00000018);
    }
    if (in_stack_00000040 < 0) {
      __ZdlPv(in_stack_00000030);
    }
    if (in_stack_00000058 < 0) {
      __ZdlPv(in_stack_00000048);
    }
    if ((long)_uStack0000000000000070 < 0) {
      __ZdlPv(lStack0000000000000060);
      uVar8 = __Unwind_Resume(uVar8);
    }
    auVar16 = __Unwind_Resume(uVar8);
  }
  puVar7 = auVar16._8_8_;
  plVar9 = auVar16._0_8_;
  plVar12 = plVar9 + 1;
  plVar13 = (long *)*plVar12;
  if (plVar13 == (long *)0x0) {
    plVar14 = plVar12;
  }
  else {
    puVar4 = (undefined8 *)*puVar7;
    uVar1 = puVar7[1];
    if (-1 < (char)*(byte *)((long)puVar7 + 0x17)) {
      puVar4 = puVar7;
      uVar1 = (ulong)*(byte *)((long)puVar7 + 0x17);
    }
    do {
      while( true ) {
        plVar12 = plVar13;
        uVar2 = plVar12[5];
        plVar13 = (long *)plVar12[4];
        if (-1 < (char)*(byte *)((long)plVar12 + 0x37)) {
          uVar2 = (ulong)*(byte *)((long)plVar12 + 0x37);
          plVar13 = plVar12 + 4;
        }
        uVar3 = uVar2;
        if (uVar1 <= uVar2) {
          uVar3 = uVar1;
        }
        iVar6 = _memcmp(puVar4,plVar13,uVar3);
        if (iVar6 == 0) break;
        if (-1 < iVar6) goto LAB_00060d24;
LAB_00060ccc:
        plVar13 = (long *)*plVar12;
        plVar14 = plVar12;
        if ((long *)*plVar12 == (long *)0x0) goto LAB_00060d5c;
      }
      if (uVar1 < uVar2) goto LAB_00060ccc;
LAB_00060d24:
      iVar6 = _memcmp(plVar13,puVar4,uVar3);
      if (iVar6 == 0) {
        if (uVar1 <= uVar2) {
          return plVar12;
        }
      }
      else if (-1 < iVar6) {
        return plVar12;
      }
      plVar13 = (long *)plVar12[1];
    } while ((long *)plVar12[1] != (long *)0x0);
    plVar14 = plVar12 + 1;
  }
LAB_00060d5c:
  plVar10 = (long *)__Znwm(0x38);
  lVar15 = *plVar11;
  plVar10[5] = plVar11[1];
  plVar10[4] = lVar15;
  plVar10[6] = plVar11[2];
  *plVar11 = 0;
  plVar11[1] = 0;
  plVar11[2] = 0;
  *plVar10 = 0;
  plVar10[1] = 0;
  plVar10[2] = (long)plVar12;
  *plVar14 = (long)plVar10;
  plVar13 = plVar10;
  if (*(long *)*plVar9 != 0) {
    *plVar9 = *(long *)*plVar9;
    plVar13 = (long *)*plVar14;
  }
  func_0x0003767c(plVar9[1],plVar13);
  plVar9[2] = plVar9[2] + 1;
  return plVar10;
}

