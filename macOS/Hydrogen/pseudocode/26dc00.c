
void FUN_0026dc00(undefined8 *param_1,ulong param_2,undefined8 *param_3,ulong param_4,ulong param_5)

{
  long lVar1;
  undefined8 *puVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  int iVar6;
  uint uVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  long lVar11;
  undefined8 uVar12;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  
  if ((param_5 != 0) && (uVar5 = param_2 - param_5, param_5 <= param_2 && uVar5 != 0)) {
    uVar3 = uVar5;
    if (param_5 <= uVar5) {
      uVar3 = param_5;
    }
    if (uVar3 <= param_4) {
      puVar9 = param_1 + param_5 * 10;
      puVar8 = puVar9;
      if (param_5 <= uVar5) {
        puVar8 = param_1;
      }
      _memcpy(param_3,puVar8,uVar3 * 0x50);
      puVar8 = param_3 + uVar3 * 10;
      if (uVar5 < param_5) {
        lVar11 = param_2 * 0x50;
        do {
          lVar11 = lVar11 + -0x50;
          puVar10 = (undefined8 *)((long)param_1 + lVar11);
          uVar3 = puVar8[-8];
          uVar4 = puVar9[-8];
          uVar5 = uVar3;
          if (uVar4 <= uVar3) {
            uVar5 = uVar4;
          }
          iVar6 = _memcmp(puVar8[-9],puVar9[-9],uVar5);
          lVar1 = uVar3 - uVar4;
          if (iVar6 != 0) {
            lVar1 = (long)iVar6;
          }
          puVar2 = puVar8 + -10;
          if (lVar1 < 0) {
            puVar2 = puVar9 + -10;
          }
          uVar12 = *puVar2;
          puVar10[1] = puVar2[1];
          *puVar10 = uVar12;
          uVar12 = puVar2[6];
          uVar14 = puVar2[9];
          uVar13 = puVar2[8];
          uVar18 = puVar2[3];
          uVar17 = puVar2[2];
          uVar16 = puVar2[5];
          uVar15 = puVar2[4];
          puVar10[7] = puVar2[7];
          puVar10[6] = uVar12;
          puVar10[9] = uVar14;
          puVar10[8] = uVar13;
          puVar10[3] = uVar18;
          puVar10[2] = uVar17;
          puVar10[5] = uVar16;
          puVar10[4] = uVar15;
          uVar7 = (uint)((ulong)lVar1 >> 0x3f);
          puVar9 = puVar9 + -10 + (ulong)(uVar7 ^ 1) * 10;
          puVar8 = puVar8 + -10 + (ulong)uVar7 * 10;
        } while (puVar9 != param_1 && puVar8 != param_3);
        param_1 = puVar9;
      }
      else if (uVar3 != 0) {
        puVar10 = param_1 + param_2 * 10;
        do {
          uVar3 = puVar9[2];
          uVar4 = param_3[2];
          uVar5 = uVar3;
          if (uVar4 <= uVar3) {
            uVar5 = uVar4;
          }
          iVar6 = _memcmp(puVar9[1],param_3[1],uVar5);
          lVar11 = uVar3 - uVar4;
          if (iVar6 != 0) {
            lVar11 = (long)iVar6;
          }
          puVar2 = param_3;
          if (lVar11 < 0) {
            puVar2 = puVar9;
          }
          uVar12 = *puVar2;
          param_1[1] = puVar2[1];
          *param_1 = uVar12;
          uVar12 = puVar2[6];
          uVar14 = puVar2[9];
          uVar13 = puVar2[8];
          uVar18 = puVar2[3];
          uVar17 = puVar2[2];
          uVar16 = puVar2[5];
          uVar15 = puVar2[4];
          param_1[7] = puVar2[7];
          param_1[6] = uVar12;
          param_1[9] = uVar14;
          param_1[8] = uVar13;
          param_1[3] = uVar18;
          param_1[2] = uVar17;
          param_1[5] = uVar16;
          param_1[4] = uVar15;
          uVar7 = (uint)((ulong)lVar11 >> 0x3f);
          param_3 = param_3 + (ulong)(uVar7 ^ 1) * 10;
          puVar9 = puVar9 + (ulong)uVar7 * 10;
          param_1 = param_1 + 10;
        } while (param_3 != puVar8 && puVar9 != puVar10);
      }
                    /* WARNING: Could not recover jumptable at 0x007b382c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (*(code *)PTR__memcpy_00a250b8)(param_1,param_3,(long)puVar8 - (long)param_3);
      return;
    }
  }
  return;
}

