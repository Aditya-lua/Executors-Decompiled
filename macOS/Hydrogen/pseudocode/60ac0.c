
/* WARNING: Type propagation algorithm not settling */

long * FUN_00060ac0(long param_1,long *param_2,undefined8 param_3,long *param_4)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  int iVar5;
  long *plVar6;
  long *plVar7;
  undefined8 *puVar8;
  long *plVar9;
  long unaff_x19;
  undefined8 uVar10;
  long *plVar11;
  long *plVar12;
  long unaff_x29;
  long lVar13;
  undefined1 auVar14 [16];
  undefined8 in_stack_00000000;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000018;
  undefined8 in_stack_00000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000048;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000070;
  
  if (param_1 != 0) {
    uVar10 = *(undefined8 *)(unaff_x19 + 8);
    func_0x00060210(&uStack0000000000000018,&uStack0000000000000048,1);
    func_0x00060210(&uStack0000000000000030,1);
    param_2 = (long *)func_0x00060f04(uVar10,&uStack0000000000000018);
    if (in_stack_00000010._7_1_ < '\0') {
      param_2 = (long *)__ZdlPv(in_stack_00000000);
    }
    param_4 = (long *)register0x00000008;
    if (in_stack_00000028._7_1_ < '\0') {
      param_2 = (long *)__ZdlPv(uStack0000000000000018);
      param_4 = (long *)register0x00000008;
    }
  }
  if (in_stack_00000040._7_1_ < '\0') {
    param_2 = (long *)__ZdlPv(uStack0000000000000030);
  }
  if (in_stack_00000058._7_1_ < '\0') {
    param_2 = (long *)__ZdlPv(uStack0000000000000048);
  }
  if (in_stack_00000070._7_1_ < '\0') {
    param_2 = (long *)__ZdlPv(in_stack_00000060);
  }
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return param_2;
  }
  uVar10 = ___stack_chk_fail();
  if (in_stack_00000010._7_1_ < '\0') {
    __ZdlPv(in_stack_00000000);
  }
  if (in_stack_00000028._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000018);
  }
  if (in_stack_00000040._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000030);
  }
  if (in_stack_00000058._7_1_ < '\0') {
    __ZdlPv(uStack0000000000000048);
  }
  if (in_stack_00000070._7_1_ < '\0') {
    __ZdlPv(in_stack_00000060);
    uVar10 = __Unwind_Resume(uVar10);
  }
  auVar14 = __Unwind_Resume(uVar10);
  puVar8 = auVar14._8_8_;
  plVar6 = auVar14._0_8_;
  plVar11 = plVar6 + 1;
  plVar9 = (long *)*plVar11;
  if (plVar9 == (long *)0x0) {
    plVar12 = plVar11;
  }
  else {
    puVar4 = (undefined8 *)*puVar8;
    uVar1 = puVar8[1];
    if (-1 < (char)*(byte *)((long)puVar8 + 0x17)) {
      puVar4 = puVar8;
      uVar1 = (ulong)*(byte *)((long)puVar8 + 0x17);
    }
    do {
      while( true ) {
        plVar11 = plVar9;
        uVar2 = plVar11[5];
        plVar9 = (long *)plVar11[4];
        if (-1 < (char)*(byte *)((long)plVar11 + 0x37)) {
          uVar2 = (ulong)*(byte *)((long)plVar11 + 0x37);
          plVar9 = plVar11 + 4;
        }
        uVar3 = uVar2;
        if (uVar1 <= uVar2) {
          uVar3 = uVar1;
        }
        iVar5 = _memcmp(puVar4,plVar9,uVar3);
        if (iVar5 != 0) break;
        if (uVar2 <= uVar1) goto code_r0x00060d24;
code_r0x00060ccc:
        plVar9 = (long *)*plVar11;
        plVar12 = plVar11;
        if ((long *)*plVar11 == (long *)0x0) goto code_r0x00060d5c;
      }
      if (iVar5 < 0) goto code_r0x00060ccc;
code_r0x00060d24:
      iVar5 = _memcmp(plVar9,puVar4,uVar3);
      if (iVar5 == 0) {
        if (uVar1 <= uVar2) {
          return plVar11;
        }
      }
      else if (-1 < iVar5) {
        return plVar11;
      }
      plVar9 = (long *)plVar11[1];
    } while ((long *)plVar11[1] != (long *)0x0);
    plVar12 = plVar11 + 1;
  }
code_r0x00060d5c:
  plVar7 = (long *)__Znwm(0x38);
  lVar13 = *param_4;
  plVar7[5] = param_4[1];
  plVar7[4] = lVar13;
  plVar7[6] = param_4[2];
  *param_4 = 0;
  param_4[1] = 0;
  param_4[2] = 0;
  *plVar7 = 0;
  plVar7[1] = 0;
  plVar7[2] = (long)plVar11;
  *plVar12 = (long)plVar7;
  plVar9 = plVar7;
  if (*(long *)*plVar6 != 0) {
    *plVar6 = *(long *)*plVar6;
    plVar9 = (long *)*plVar12;
  }
  func_0x0003767c(plVar6[1],plVar9);
  plVar6[2] = plVar6[2] + 1;
  return plVar7;
}

