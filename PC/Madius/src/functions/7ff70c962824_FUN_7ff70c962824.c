/* 7ff70c962824 FUN_7ff70c962824 */

void FUN_7ff70c962824(undefined8 *param_1,longlong param_2)

{
  code *pcVar1;
  char cVar2;
  longlong *plVar3;
  undefined8 *puVar4;
  longlong *plVar5;
  int iVar6;
  longlong lVar7;
  ulonglong uVar8;
  int iVar9;
  longlong *plVar10;
  longlong lVar11;
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
  lVar11 = 0;
  while( true ) {
    puVar4 = param_1;
    if (0xf < (ulonglong)param_1[3]) {
      puVar4 = (undefined8 *)*param_1;
    }
    cVar2 = FUN_7ff70caa0c60((longlong)puVar4 + lVar11,param_1[2] + (longlong)puVar4,&lStack_b8,
                             param_2,in_stack_ffffffffffffff38 & 0xffffffff00000000,
                             (longlong)puVar4 + lVar11);
    if (cVar2 == '\0') break;
    plVar5 = plStack_a8;
    if (plStack_a0 == plStack_a8) {
      plVar5 = alStack_60;
    }
    plVar3 = plStack_a8;
    if (plStack_a0 == plStack_a8) {
      plVar3 = alStack_60;
    }
    plVar10 = plStack_a8 + 2;
    if (plStack_a0 == plStack_a8) {
      plVar10 = (longlong *)auStack_50;
    }
    lVar7 = plVar5[1] - *plVar3;
    lVar11 = (*plVar3 - lStack_b8) + lVar11;
    if ((char)*plVar10 == '\0') {
      lVar7 = 0;
    }
    uVar8 = lVar7 + lVar11;
    if (uVar8 < (ulonglong)param_1[2]) {
      puVar4 = param_1;
      if (0xf < (ulonglong)param_1[3]) {
        puVar4 = (undefined8 *)*param_1;
      }
      iVar6 = 1;
      do {
        iVar9 = -(uint)(*(char *)((longlong)puVar4 + uVar8) == '>');
        if (*(char *)((longlong)puVar4 + uVar8) == '<') {
          iVar9 = 1;
        }
        uVar8 = uVar8 + 1;
      } while ((uVar8 < (ulonglong)param_1[2]) && (iVar6 = iVar6 + iVar9, iVar6 != 0));
    }
    in_stack_ffffffffffffff38 = *(ulonglong *)(param_2 + 0x30);
    FUN_7ff70ca3cde0(param_1,lVar11,uVar8 - lVar11,*(undefined8 *)(param_2 + 0x28),
                     in_stack_ffffffffffffff38);
    lVar11 = lVar11 + *(longlong *)(param_2 + 0x30);
  }
  if (plStack_a8 != (longlong *)0x0) {
    uVar8 = lStack_98 - (longlong)plStack_a8;
    plVar5 = plStack_a8;
    if (0xfff < uVar8) {
      plVar5 = (longlong *)plStack_a8[-1];
      if (0x1f < (ulonglong)((longlong)plStack_a8 + (-8 - (longlong)plVar5))) {
                    /* WARNING: Does not return */
        pcVar1 = (code *)invalidInstructionException();
        (*pcVar1)();
      }
      uVar8 = uVar8 + 0x27;
    }
    thunk_FUN_7ff70ca90250(plVar5,uVar8);
  }
  return;
}


