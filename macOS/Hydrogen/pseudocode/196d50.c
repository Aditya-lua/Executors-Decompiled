
undefined8 FUN_00196d50(undefined8 param_1,long param_2,long *param_3)

{
  undefined8 *puVar1;
  undefined2 uVar2;
  short sVar3;
  undefined2 uVar4;
  long lVar5;
  ulong uVar6;
  long lVar7;
  undefined8 *puVar8;
  long *plVar9;
  long lVar10;
  long *plVar11;
  undefined8 uStack_58;
  long lStack_50;
  undefined8 uStack_48;
  
  uStack_48 = 0xe0000020;
  uStack_58 = param_1;
  lStack_50 = param_2;
  if (param_3[4] == 0) {
    lVar5 = param_3[3];
    if (lVar5 == 0) goto code_r0x00468634;
    puVar8 = (undefined8 *)param_3[2];
    puVar1 = puVar8 + lVar5 * 2;
    plVar9 = (long *)(*param_3 + 8);
    do {
      if ((*plVar9 != 0) &&
         (uVar6 = (**(code **)(lStack_50 + 0x18))(uStack_58,plVar9[-1]), (uVar6 & 1) != 0)) {
        return 1;
      }
      uVar6 = (*(code *)puVar8[1])(*puVar8,&uStack_58);
      if ((uVar6 & 1) != 0) {
        return 1;
      }
      plVar9 = plVar9 + 2;
      puVar8 = puVar8 + 2;
    } while (puVar8 != puVar1);
  }
  else {
    lVar5 = param_3[5];
    if (lVar5 == 0) {
code_r0x00468634:
      uVar6 = 0;
      if (param_3[1] == 0) {
        return 0;
      }
      goto code_r0x00468644;
    }
    lVar7 = param_3[2];
    plVar9 = (long *)(*param_3 + 8);
    lVar10 = lVar5 * 0x30;
    plVar11 = (long *)(param_3[4] + 0x18);
    do {
      if ((*plVar9 != 0) &&
         (uVar6 = (**(code **)(lStack_50 + 0x18))(uStack_58,plVar9[-1]), (uVar6 & 1) != 0)) {
        return 1;
      }
      if ((short)plVar11[-1] == 0) {
        uVar2 = *(undefined2 *)((long)plVar11 + -6);
        sVar3 = (short)plVar11[-3];
joined_r0x00468564:
        if (sVar3 != 2) goto code_r0x00468540;
code_r0x00468568:
        uVar4 = 0;
      }
      else {
        if ((short)plVar11[-1] != 1) {
          uVar2 = 0;
          sVar3 = (short)plVar11[-3];
          goto joined_r0x00468564;
        }
        uVar2 = *(undefined2 *)(lVar7 + *plVar11 * 0x10 + 8);
        sVar3 = (short)plVar11[-3];
        if (sVar3 == 2) goto code_r0x00468568;
code_r0x00468540:
        if (sVar3 == 1) {
          uVar4 = *(undefined2 *)(lVar7 + plVar11[-2] * 0x10 + 8);
        }
        else {
          uVar4 = *(undefined2 *)((long)plVar11 + -0x16);
        }
      }
      puVar8 = (undefined8 *)(lVar7 + plVar11[1] * 0x10);
      uStack_48 = CONCAT26(uVar4,CONCAT24(uVar2,(int)plVar11[2]));
      uVar6 = (*(code *)puVar8[1])(*puVar8,&uStack_58);
      if ((uVar6 & 1) != 0) {
        return 1;
      }
      plVar9 = plVar9 + 2;
      plVar11 = plVar11 + 6;
      lVar10 = lVar10 + -0x30;
    } while (lVar10 != 0);
  }
  uVar6 = (lVar5 - 1U & 0xfffffffffffffff) + 1;
  if ((ulong)param_3[1] <= uVar6) {
    return 0;
  }
code_r0x00468644:
  puVar8 = (undefined8 *)(*param_3 + uVar6 * 0x10);
  uVar6 = (**(code **)(lStack_50 + 0x18))(uStack_58,*puVar8,puVar8[1]);
  if ((uVar6 & 1) == 0) {
    return 0;
  }
  return 1;
}

