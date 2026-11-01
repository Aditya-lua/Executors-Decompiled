
undefined8 FUN_00189724(undefined8 param_1)

{
  undefined8 *puVar1;
  long *plVar2;
  undefined2 uVar3;
  short sVar4;
  undefined2 uVar5;
  long lVar6;
  ulong uVar7;
  long unaff_x21;
  long lVar8;
  undefined8 *puVar9;
  long unaff_x22;
  long *plVar10;
  long lVar11;
  long unaff_x24;
  long *plVar12;
  undefined1 auVar13 [16];
  long in_stack_00000000;
  undefined8 uStack_58;
  undefined *puStack_50;
  undefined8 uStack_48;
  
  while (unaff_x22 = unaff_x22 + -1, unaff_x22 != 0) {
    func_0x0019fb28(unaff_x21);
    unaff_x21 = unaff_x21 + 8;
  }
  if (in_stack_00000000 != 0) {
    func_0x00187bd4();
    __Unwind_Resume(param_1);
    param_1 = func_0x007a2668();
    if (unaff_x24 != 0) {
      func_0x00187bd4(0,unaff_x24 << 3,8);
    }
    func_0x001897bc();
  }
  __Unwind_Resume(param_1);
  auVar13 = func_0x007a2668();
  plVar2 = auVar13._8_8_;
  uStack_58 = auVar13._0_8_;
  puStack_50 = &UNK_009c0370;
  uStack_48 = 0xe0000020;
  if (plVar2[4] == 0) {
    lVar6 = plVar2[3];
    if (lVar6 == 0) goto code_r0x00468634;
    puVar9 = (undefined8 *)plVar2[2];
    puVar1 = puVar9 + lVar6 * 2;
    plVar10 = (long *)(*plVar2 + 8);
    do {
      if ((*plVar10 != 0) &&
         (uVar7 = (**(code **)(puStack_50 + 0x18))(uStack_58,plVar10[-1]), (uVar7 & 1) != 0)) {
        return 1;
      }
      uVar7 = (*(code *)puVar9[1])(*puVar9,&uStack_58);
      if ((uVar7 & 1) != 0) {
        return 1;
      }
      plVar10 = plVar10 + 2;
      puVar9 = puVar9 + 2;
    } while (puVar9 != puVar1);
  }
  else {
    lVar6 = plVar2[5];
    if (lVar6 == 0) {
code_r0x00468634:
      uVar7 = 0;
      if (plVar2[1] == 0) {
        return 0;
      }
      goto code_r0x00468644;
    }
    lVar8 = plVar2[2];
    plVar10 = (long *)(*plVar2 + 8);
    lVar11 = lVar6 * 0x30;
    plVar12 = (long *)(plVar2[4] + 0x18);
    do {
      if ((*plVar10 != 0) &&
         (uVar7 = (**(code **)(puStack_50 + 0x18))(uStack_58,plVar10[-1]), (uVar7 & 1) != 0)) {
        return 1;
      }
      if ((short)plVar12[-1] == 0) {
        uVar3 = *(undefined2 *)((long)plVar12 + -6);
        sVar4 = (short)plVar12[-3];
joined_r0x00468564:
        if (sVar4 != 2) goto code_r0x00468540;
code_r0x00468568:
        uVar5 = 0;
      }
      else {
        if ((short)plVar12[-1] != 1) {
          uVar3 = 0;
          sVar4 = (short)plVar12[-3];
          goto joined_r0x00468564;
        }
        uVar3 = *(undefined2 *)(lVar8 + *plVar12 * 0x10 + 8);
        sVar4 = (short)plVar12[-3];
        if (sVar4 == 2) goto code_r0x00468568;
code_r0x00468540:
        if (sVar4 == 1) {
          uVar5 = *(undefined2 *)(lVar8 + plVar12[-2] * 0x10 + 8);
        }
        else {
          uVar5 = *(undefined2 *)((long)plVar12 + -0x16);
        }
      }
      puVar9 = (undefined8 *)(lVar8 + plVar12[1] * 0x10);
      uStack_48 = CONCAT26(uVar5,CONCAT24(uVar3,(int)plVar12[2]));
      uVar7 = (*(code *)puVar9[1])(*puVar9,&uStack_58);
      if ((uVar7 & 1) != 0) {
        return 1;
      }
      plVar10 = plVar10 + 2;
      plVar12 = plVar12 + 6;
      lVar11 = lVar11 + -0x30;
    } while (lVar11 != 0);
  }
  uVar7 = (lVar6 - 1U & 0xfffffffffffffff) + 1;
  if ((ulong)plVar2[1] <= uVar7) {
    return 0;
  }
code_r0x00468644:
  puVar9 = (undefined8 *)(*plVar2 + uVar7 * 0x10);
  uVar7 = (**(code **)(puStack_50 + 0x18))(uStack_58,*puVar9,puVar9[1]);
  if ((uVar7 & 1) == 0) {
    return 0;
  }
  return 1;
}

