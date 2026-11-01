
/* WARNING: Possible PIC construction at 0x005217f4: Changing call to branch */
/* WARNING: Possible PIC construction at 0x00521828: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x005217f8) */

void FUN_0052165c(undefined8 *param_1,undefined8 *param_2,undefined8 param_3,long param_4)

{
  undefined8 ****ppppuVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  long *plVar5;
  long lVar6;
  undefined8 uVar7;
  long *plVar8;
  undefined8 *puVar9;
  long lVar10;
  long lVar11;
  undefined8 ****ppppuVar12;
  undefined *puVar13;
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  undefined8 in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined *in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined1 uStack000000000000003f;
  undefined8 ***pppuStack0000000000000090;
  long *plStack_30;
  undefined8 uStack_28;
  long lStack_20;
  undefined8 *puStack_18;
  undefined8 ****ppppuStack_10;
  undefined *puStack_8;
  
  ppppuVar1 = &pppuStack0000000000000090;
  plVar8 = *(long **)*param_2;
  lVar6 = ((long *)*param_2)[1];
  lVar10 = plVar8[1];
  lVar2 = plVar8[2];
  if (lVar2 != 0) {
    plVar5 = (long *)(lVar10 + 8);
    lVar11 = lVar2 << 4;
    do {
      if ((*plVar5 == param_4) && (iVar4 = _memcmp(plVar5[-1],param_3,param_4), iVar4 == 0)) {
        *param_1 = 0x8000000000000000;
        return;
      }
      plVar5 = plVar5 + 2;
      lVar11 = lVar11 + -0x10;
    } while (lVar11 != 0);
  }
  if (lVar2 == *plVar8) {
    func_0x0050c0c0(plVar8,&UNK_009e8e68);
    lVar10 = plVar8[1];
  }
  puVar9 = (undefined8 *)(lVar10 + lVar2 * 0x10);
  *puVar9 = param_3;
  puVar9[1] = param_4;
  plVar8[2] = lVar2 + 1;
  lVar10 = *(long *)(lVar6 + 0x90);
  if (lVar10 != 0) {
    plVar8 = *(long **)(lVar6 + 0x88);
    lVar10 = lVar10 * 600;
    do {
      if ((plVar8[0x44] == param_4) && (iVar4 = _memcmp(plVar8[0x43],param_3,param_4), iVar4 == 0))
      {
        uStack0000000000000008 = 0;
        in_stack_00000010 = 1;
        in_stack_00000030 = 0xe0000020;
        uStack0000000000000020 = &uStack0000000000000008;
        in_stack_00000018 = 0;
        in_stack_00000028 = &UNK_009ea418;
        iVar4 = func_0x0050f9f0(plVar8,&uStack0000000000000020);
        if (iVar4 != 0) {
          func_0x007a2810(&UNK_008a7790,0x37,&uStack000000000000003f,&UNK_009ea478,&UNK_009ea448);
                    /* WARNING: Does not return */
          pcVar3 = (code *)SoftwareBreakpoint(1,0x5217c4);
          (*pcVar3)();
        }
        param_1[1] = in_stack_00000010;
        *param_1 = uStack0000000000000008;
        param_1[2] = in_stack_00000018;
        return;
      }
      plVar8 = plVar8 + 0x4b;
      lVar10 = lVar10 + -600;
    } while (lVar10 != 0);
  }
  func_0x007a23d8(&UNK_008a791f,99,&UNK_009ea4c8);
  if (uStack0000000000000008 == 0) {
    plVar5 = (long *)__Unwind_Resume();
    puStack_8 = &DAT_00521800;
    ppppuVar12 = &ppppuStack_10;
    plStack_30 = plVar8;
    uStack_28 = param_3;
    lStack_20 = param_4;
    puStack_18 = param_1;
    ppppuStack_10 = ppppuVar1;
    if (*plVar5 == 0) {
      lVar10 = plVar5[4];
      lVar6 = plVar5[5];
      if (lVar6 != 0) {
        puVar9 = (undefined8 *)(lVar10 + 8);
        do {
          if (puVar9[-1] != 0) {
            func_0x00187bd4(*puVar9,puVar9[-1] << 4,8);
          }
          puVar9 = puVar9 + 3;
          lVar6 = lVar6 + -1;
        } while (lVar6 != 0);
      }
      if (plVar5[3] == 0) {
        return;
      }
      lVar6 = plVar5[3] * 0x18;
      uVar7 = 8;
      ppppuVar12 = ppppuStack_10;
      puVar13 = puStack_8;
    }
    else {
      lVar10 = plVar5[1];
      lVar6 = *plVar5 << 4;
      uVar7 = 8;
      register0x00000008 = (BADSPACEBASE *)&plStack_30;
      puVar13 = &UNK_0052182c;
    }
  }
  else {
    uVar7 = 1;
    lVar10 = in_stack_00000010;
    lVar6 = uStack0000000000000008;
    ppppuVar12 = ppppuVar1;
    puVar13 = &UNK_005217f8;
  }
  *(undefined8 *****)((long)register0x00000008 + -0x10) = ppppuVar12;
  *(undefined **)((long)register0x00000008 + -8) = puVar13;
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar10,lVar6,uVar7);
  return;
}

