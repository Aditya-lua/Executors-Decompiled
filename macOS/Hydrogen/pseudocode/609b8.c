
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

long * FUN_000609b8(undefined8 param_1,undefined8 param_2,long *param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  bool in_ZR;
  int iVar5;
  long *plVar6;
  long *plVar7;
  undefined8 uVar8;
  long *plVar9;
  undefined8 *puVar10;
  long *unaff_x19;
  long *plVar11;
  long *unaff_x22;
  undefined1 *unaff_x23;
  long *plVar12;
  long unaff_x29;
  long lVar13;
  undefined1 auVar14 [16];
  undefined8 in_stack_00000000;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  long in_stack_00000040;
  undefined8 in_stack_00000048;
  long in_stack_00000058;
  long lStack0000000000000060;
  undefined8 in_stack_00000070;
  
  if (!in_ZR) {
    param_3 = unaff_x22;
    _memcpy();
    unaff_x23 = unaff_x23 + (long)unaff_x22;
  }
  *unaff_x23 = 0;
  plVar6 = (long *)func_0x0005fed4(*unaff_x19,&lStack0000000000000060);
  plVar7 = (long *)*unaff_x19;
  if (plVar7 + 1 == plVar6) {
    auVar14._8_8_ = &lStack0000000000000060;
    auVar14._0_8_ = plVar7;
    param_3 = &lStack0000000000000060;
  }
  else {
    if (in_stack_00000070._7_1_ < '\0') {
      plVar7 = (long *)__ZdlPv(lStack0000000000000060);
    }
    if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
      return plVar7;
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
    if (in_stack_00000070._7_1_ < '\0') {
      __ZdlPv(lStack0000000000000060);
      uVar8 = __Unwind_Resume(uVar8);
    }
    auVar14 = __Unwind_Resume(uVar8);
  }
  puVar10 = auVar14._8_8_;
  plVar7 = auVar14._0_8_;
  plVar11 = plVar7 + 1;
  plVar6 = (long *)*plVar11;
  if (plVar6 == (long *)0x0) {
    plVar12 = plVar11;
  }
  else {
    puVar4 = (undefined8 *)*puVar10;
    uVar1 = puVar10[1];
    if (-1 < (char)*(byte *)((long)puVar10 + 0x17)) {
      puVar4 = puVar10;
      uVar1 = (ulong)*(byte *)((long)puVar10 + 0x17);
    }
    do {
      while( true ) {
        plVar11 = plVar6;
        uVar2 = plVar11[5];
        plVar6 = (long *)plVar11[4];
        if (-1 < (char)*(byte *)((long)plVar11 + 0x37)) {
          uVar2 = (ulong)*(byte *)((long)plVar11 + 0x37);
          plVar6 = plVar11 + 4;
        }
        uVar3 = uVar2;
        if (uVar1 <= uVar2) {
          uVar3 = uVar1;
        }
        iVar5 = _memcmp(puVar4,plVar6,uVar3);
        if (iVar5 == 0) break;
        if (-1 < iVar5) goto code_r0x00060d24;
code_r0x00060ccc:
        plVar6 = (long *)*plVar11;
        plVar12 = plVar11;
        if ((long *)*plVar11 == (long *)0x0) goto code_r0x00060d5c;
      }
      if (uVar1 < uVar2) goto code_r0x00060ccc;
code_r0x00060d24:
      iVar5 = _memcmp(plVar6,puVar4,uVar3);
      if (iVar5 == 0) {
        if (uVar1 <= uVar2) {
          return plVar11;
        }
      }
      else if (-1 < iVar5) {
        return plVar11;
      }
      plVar6 = (long *)plVar11[1];
    } while ((long *)plVar11[1] != (long *)0x0);
    plVar12 = plVar11 + 1;
  }
code_r0x00060d5c:
  plVar9 = (long *)__Znwm(0x38);
  lVar13 = *param_3;
  plVar9[5] = param_3[1];
  plVar9[4] = lVar13;
  plVar9[6] = param_3[2];
  *param_3 = 0;
  param_3[1] = 0;
  param_3[2] = 0;
  *plVar9 = 0;
  plVar9[1] = 0;
  plVar9[2] = (long)plVar11;
  *plVar12 = (long)plVar9;
  plVar6 = plVar9;
  if (*(long *)*plVar7 != 0) {
    *plVar7 = *(long *)*plVar7;
    plVar6 = (long *)*plVar12;
  }
  func_0x0003767c(plVar7[1],plVar6);
  plVar7[2] = plVar7[2] + 1;
  return plVar9;
}

