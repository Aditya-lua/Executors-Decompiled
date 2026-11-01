
undefined1  [16] FUN_00060c44(undefined8 param_1,undefined8 param_2,long *param_3)

{
  ulong uVar1;
  ulong uVar2;
  ulong uVar3;
  undefined8 *puVar4;
  int iVar5;
  long *plVar6;
  long *plVar7;
  undefined8 uVar8;
  int in_w8;
  long *plVar9;
  undefined8 unaff_x19;
  long *plVar10;
  long *plVar11;
  long lVar12;
  undefined1 auVar13 [16];
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000060;
  long in_stack_00000070;
  
  if (in_w8 < 0) {
    __ZdlPv(in_stack_00000048);
  }
  if (in_stack_00000070 < 0) {
    __ZdlPv(in_stack_00000060);
    unaff_x19 = __Unwind_Resume();
  }
  auVar13 = __Unwind_Resume(unaff_x19);
  auVar13._8_8_ = auVar13._8_8_;
  plVar6 = auVar13._0_8_;
  plVar10 = plVar6 + 1;
  plVar9 = (long *)*plVar10;
  if (plVar9 == (long *)0x0) {
    plVar11 = plVar10;
  }
  else {
    puVar4 = (undefined8 *)*auVar13._8_8_;
    uVar1 = auVar13._8_8_[1];
    if (-1 < (char)*(byte *)((long)auVar13._8_8_ + 0x17)) {
      puVar4 = auVar13._8_8_;
      uVar1 = (ulong)*(byte *)((long)auVar13._8_8_ + 0x17);
    }
    do {
      while( true ) {
        plVar10 = plVar9;
        uVar2 = plVar10[5];
        plVar9 = (long *)plVar10[4];
        if (-1 < (char)*(byte *)((long)plVar10 + 0x37)) {
          uVar2 = (ulong)*(byte *)((long)plVar10 + 0x37);
          plVar9 = plVar10 + 4;
        }
        uVar3 = uVar2;
        if (uVar1 <= uVar2) {
          uVar3 = uVar1;
        }
        iVar5 = _memcmp(puVar4,plVar9,uVar3);
        if (iVar5 != 0) break;
        if (uVar2 <= uVar1) goto code_r0x00060d24;
code_r0x00060ccc:
        plVar9 = (long *)*plVar10;
        plVar11 = plVar10;
        if ((long *)*plVar10 == (long *)0x0) goto code_r0x00060d5c;
      }
      if (iVar5 < 0) goto code_r0x00060ccc;
code_r0x00060d24:
      iVar5 = _memcmp(plVar9,puVar4,uVar3);
      if (iVar5 == 0) {
        if (uVar1 <= uVar2) goto code_r0x00060dc4;
      }
      else if (-1 < iVar5) {
code_r0x00060dc4:
        uVar8 = 0;
        goto code_r0x00060dc8;
      }
      plVar9 = (long *)plVar10[1];
    } while ((long *)plVar10[1] != (long *)0x0);
    plVar11 = plVar10 + 1;
  }
code_r0x00060d5c:
  plVar7 = (long *)__Znwm(0x38);
  lVar12 = *param_3;
  plVar7[5] = param_3[1];
  plVar7[4] = lVar12;
  plVar7[6] = param_3[2];
  *param_3 = 0;
  param_3[1] = 0;
  param_3[2] = 0;
  *plVar7 = 0;
  plVar7[1] = 0;
  plVar7[2] = (long)plVar10;
  *plVar11 = (long)plVar7;
  plVar9 = plVar7;
  if (*(long *)*plVar6 != 0) {
    *plVar6 = *(long *)*plVar6;
    plVar9 = (long *)*plVar11;
  }
  func_0x0003767c(plVar6[1],plVar9);
  plVar6[2] = plVar6[2] + 1;
  uVar8 = 1;
  plVar10 = plVar7;
code_r0x00060dc8:
  auVar13._8_8_ = uVar8;
  auVar13._0_8_ = plVar10;
  return auVar13;
}

