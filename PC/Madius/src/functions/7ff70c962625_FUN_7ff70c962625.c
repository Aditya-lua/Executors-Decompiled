/* 7ff70c962625 FUN_7ff70c962625 */

void FUN_7ff70c962625(undefined8 *param_1,undefined8 param_2,undefined8 *param_3)

{
  code *pcVar1;
  longlong *plVar2;
  char cVar3;
  longlong *plVar4;
  undefined8 *puVar5;
  longlong *plVar6;
  ulonglong uVar7;
  longlong lVar8;
  longlong lVar9;
  ulonglong in_stack_ffffffffffffff38;
  longlong lStack_b8;
  undefined1 uStack_b0;
  longlong *plStack_a8;
  longlong *plStack_a0;
  longlong lStack_98;
  undefined1 uStack_90;
  undefined7 uStack_8f;
  undefined1 uStack_88;
  undefined8 uStack_87;
  undefined8 uStack_78;
  undefined8 uStack_70;
  undefined1 uStack_68;
  longlong alStack_60 [2];
  undefined1 auStack_50 [8];
  undefined8 uStack_48;
  
  uStack_48 = 0xfffffffffffffffe;
  lStack_b8 = 0;
  uStack_b0 = 0;
  uStack_78 = 0;
  uStack_70 = 0;
  uStack_68 = 0;
  alStack_60[0] = 0;
  alStack_60[1] = 0;
  auStack_50[0] = 0;
  plStack_a8 = (longlong *)0x0;
  plStack_a0 = (longlong *)0x0;
  lStack_98 = 0;
  uStack_90 = 0;
  uStack_8f = 0;
  uStack_88 = 0;
  uStack_87 = 0;
  lVar9 = 0;
  while( true ) {
    puVar5 = param_1;
    if (0xf < (ulonglong)param_1[3]) {
      puVar5 = (undefined8 *)*param_1;
    }
    cVar3 = FUN_7ff70caa0c60((longlong)puVar5 + lVar9,param_1[2] + (longlong)puVar5,&lStack_b8,
                             param_2,in_stack_ffffffffffffff38 & 0xffffffff00000000,
                             (longlong)puVar5 + lVar9);
    if (cVar3 == '\0') break;
    plVar6 = plStack_a8 + 2;
    plVar4 = plStack_a8;
    if (plStack_a0 == plStack_a8) {
      plVar6 = (longlong *)auStack_50;
      plVar4 = alStack_60;
    }
    plVar2 = plStack_a8;
    if (plStack_a0 == plStack_a8) {
      plVar2 = alStack_60;
    }
    lVar8 = plVar2[1] - *plVar4;
    if ((char)*plVar6 == '\0') {
      lVar8 = 0;
    }
    in_stack_ffffffffffffff38 = param_3[1];
    FUN_7ff70ca3cde0(param_1,(*plVar4 + lVar9) - lStack_b8,lVar8,*param_3,in_stack_ffffffffffffff38)
    ;
    plVar4 = plStack_a8;
    if (plStack_a0 == plStack_a8) {
      plVar4 = alStack_60;
    }
    lVar9 = ((lVar9 + *plVar4) - lStack_b8) + param_3[1];
  }
  if (plStack_a8 != (longlong *)0x0) {
    uVar7 = lStack_98 - (longlong)plStack_a8;
    plVar4 = plStack_a8;
    if (0xfff < uVar7) {
      plVar4 = (longlong *)plStack_a8[-1];
      if (0x1f < (ulonglong)((longlong)plStack_a8 + (-8 - (longlong)plVar4))) {
                    /* WARNING: Does not return */
        pcVar1 = (code *)invalidInstructionException();
        (*pcVar1)();
      }
      uVar7 = uVar7 + 0x27;
    }
    thunk_FUN_7ff70ca90250(plVar4,uVar7);
  }
  return;
}


