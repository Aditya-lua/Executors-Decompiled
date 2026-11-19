/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00898a44
 */

undefined8 * FUN_00898a44(long *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  void *pvVar4;
  void *pvVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined8 uVar8;
  undefined8 *puVar9;
  long lVar10;
  ulong uVar11;
  undefined8 *puVar12;
  long lVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  
  lVar13 = param_1[1] - *param_1;
  uVar7 = (lVar13 >> 3) * 0x6db6db6db6db6db7 + 1;
  if (uVar7 < 0x492492492492493) {
    lVar10 = param_1[2] - *param_1 >> 3;
    uVar11 = lVar10 * -0x2492492492492492;
    if (uVar11 <= uVar7) {
      uVar11 = uVar7;
    }
    if (0x249249249249248 < (ulong)(lVar10 * 0x6db6db6db6db6db7)) {
      uVar11 = 0x492492492492492;
    }
    if (uVar11 < 0x492492492492493) {
      pvVar4 = operator_new(uVar11 * 0x38);
      uVar19 = param_2[3];
      uVar18 = param_2[2];
      uVar15 = param_2[5];
      uVar14 = param_2[4];
      puVar1 = (undefined8 *)((long)pvVar4 + lVar13);
      param_2[4] = 0;
      param_2[5] = 0;
      uVar8 = param_2[6];
      param_2[6] = 0;
      uVar17 = param_2[1];
      uVar16 = *param_2;
      puVar12 = (undefined8 *)*param_1;
      puVar3 = (undefined8 *)param_1[1];
      puVar1[6] = uVar8;
      puVar1[1] = uVar17;
      *puVar1 = uVar16;
      puVar1[3] = uVar19;
      puVar1[2] = uVar18;
      puVar1[5] = uVar15;
      puVar1[4] = uVar14;
      puVar2 = (undefined8 *)((long)puVar1 + ((long)puVar12 - (long)puVar3));
      if ((long)puVar12 - (long)puVar3 != 0) {
        puVar6 = puVar12;
        puVar9 = puVar2;
        do {
          uVar16 = puVar6[1];
          uVar15 = *puVar6;
          uVar14 = puVar6[3];
          uVar8 = puVar6[2];
          puVar9[5] = 0;
          puVar9[6] = 0;
          puVar9[1] = uVar16;
          *puVar9 = uVar15;
          puVar9[3] = uVar14;
          puVar9[2] = uVar8;
          uVar8 = puVar6[4];
          puVar9[5] = puVar6[5];
          puVar9[4] = uVar8;
          puVar9[6] = puVar6[6];
          puVar9 = puVar9 + 7;
          puVar6[4] = 0;
          puVar6[5] = 0;
          puVar6[6] = 0;
          puVar6 = puVar6 + 7;
        } while (puVar6 != puVar3);
        do {
          pvVar5 = (void *)puVar12[4];
          if (pvVar5 != (void *)0x0) {
            puVar12[5] = pvVar5;
            operator_delete(pvVar5,puVar12[6] - (long)pvVar5);
          }
          puVar12 = puVar12 + 7;
        } while (puVar12 != puVar3);
        puVar12 = (undefined8 *)*param_1;
      }
      lVar13 = param_1[2];
      *param_1 = (long)puVar2;
      param_1[1] = (long)(puVar1 + 7);
      param_1[2] = (long)((long)pvVar4 + uVar11 * 0x38);
      if (puVar12 != (undefined8 *)0x0) {
        operator_delete(puVar12,lVar13 - (long)puVar12);
      }
      return puVar1 + 7;
    }
  }
  else {
    FUN_00898bcc();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

