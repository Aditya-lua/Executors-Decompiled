
void FUN_003f97d0(undefined8 *param_1,long param_2)

{
  long lVar1;
  ulong uVar2;
  long lVar3;
  undefined8 uVar4;
  ulong uVar5;
  ulong uVar6;
  int iVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  long lVar10;
  undefined8 *puVar11;
  undefined8 uVar12;
  long lVar13;
  
  lVar10 = 0;
  puVar8 = param_1 + 3;
  puVar11 = param_1;
  do {
    puVar9 = puVar8;
    uVar4 = puVar11[3];
    uVar5 = puVar11[4];
    uVar6 = puVar11[1];
    uVar2 = uVar5;
    if (uVar6 <= uVar5) {
      uVar2 = uVar6;
    }
    iVar7 = _memcmp(uVar4,*puVar11,uVar2);
    lVar1 = uVar5 - uVar6;
    if (iVar7 != 0) {
      lVar1 = (long)iVar7;
    }
    if (lVar1 < 0) {
      uVar12 = puVar11[5];
      lVar1 = lVar10;
      do {
        lVar13 = lVar1;
        puVar8 = (undefined8 *)((long)param_1 + lVar13);
        puVar8[4] = puVar8[1];
        puVar8[3] = *puVar8;
        puVar8[5] = puVar8[2];
        if (lVar13 == 0) {
          puVar8 = param_1;
          goto LAB_003f97f8;
        }
        uVar6 = puVar8[-2];
        uVar2 = uVar5;
        if (uVar6 <= uVar5) {
          uVar2 = uVar6;
        }
        iVar7 = _memcmp(uVar4,puVar8[-3],uVar2);
        lVar3 = uVar5 - uVar6;
        if (iVar7 != 0) {
          lVar3 = (long)iVar7;
        }
        lVar1 = lVar13 + -0x18;
      } while (lVar3 < 0);
      puVar8 = (undefined8 *)((long)param_1 + lVar13);
LAB_003f97f8:
      *puVar8 = uVar4;
      puVar8[1] = uVar5;
      puVar8[2] = uVar12;
    }
    puVar8 = puVar9 + 3;
    lVar10 = lVar10 + 0x18;
    puVar11 = puVar9;
    if (puVar8 == param_1 + param_2 * 3) {
      return;
    }
  } while( true );
}

