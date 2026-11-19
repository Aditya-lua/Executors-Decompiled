/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008704f0
 */

undefined8 * FUN_008704f0(long *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  undefined8 *puVar3;
  undefined4 uVar4;
  void *pvVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined8 *puVar8;
  long lVar9;
  undefined8 uVar10;
  ulong uVar11;
  long lVar12;
  undefined8 *puVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined8 uVar16;
  undefined8 uVar17;
  
  lVar12 = param_1[1] - *param_1;
  uVar7 = (lVar12 >> 4) * -0x5555555555555555 + 1;
  if (uVar7 < 0x555555555555556) {
    lVar9 = param_1[2] - *param_1 >> 4;
    uVar11 = lVar9 * 0x5555555555555556;
    if (uVar11 <= uVar7) {
      uVar11 = uVar7;
    }
    if (0x2aaaaaaaaaaaaa9 < (ulong)(lVar9 * -0x5555555555555555)) {
      uVar11 = 0x555555555555555;
    }
    if (uVar11 < 0x555555555555556) {
      pvVar5 = operator_new(uVar11 * 0x30);
      uVar15 = param_2[4];
      uVar14 = param_2[3];
      param_2[3] = 0;
      param_2[4] = 0;
      puVar1 = (undefined8 *)((long)pvVar5 + lVar12);
      uVar10 = param_2[5];
      param_2[5] = 0;
      puVar13 = (undefined8 *)*param_1;
      puVar3 = (undefined8 *)param_1[1];
      uVar4 = *(undefined4 *)(param_2 + 2);
      uVar17 = param_2[1];
      uVar16 = *param_2;
      puVar1[5] = uVar10;
      *(undefined4 *)(puVar1 + 2) = uVar4;
      puVar1[1] = uVar17;
      *puVar1 = uVar16;
      puVar2 = (undefined8 *)((long)puVar1 + ((long)puVar13 - (long)puVar3));
      puVar1[4] = uVar15;
      puVar1[3] = uVar14;
      if ((long)puVar13 - (long)puVar3 != 0) {
        puVar6 = puVar13;
        puVar8 = puVar2;
        do {
          uVar14 = puVar6[1];
          uVar10 = *puVar6;
          *(undefined4 *)(puVar8 + 2) = *(undefined4 *)(puVar6 + 2);
          puVar8[1] = uVar14;
          *puVar8 = uVar10;
          uVar14 = puVar6[4];
          uVar10 = puVar6[3];
          puVar8[5] = puVar6[5];
          puVar8[4] = uVar14;
          puVar8[3] = uVar10;
          puVar8 = puVar8 + 6;
          puVar6[4] = 0;
          puVar6[5] = 0;
          puVar6[3] = 0;
          puVar6 = puVar6 + 6;
        } while (puVar6 != puVar3);
        do {
          if ((*(byte *)(puVar13 + 3) & 1) != 0) {
            operator_delete((void *)puVar13[5],puVar13[3] & 0xfffffffffffffffe);
          }
          puVar13 = puVar13 + 6;
        } while (puVar13 != puVar3);
        puVar13 = (undefined8 *)*param_1;
      }
      lVar12 = param_1[2];
      *param_1 = (long)puVar2;
      param_1[1] = (long)(puVar1 + 6);
      param_1[2] = (long)((long)pvVar5 + uVar11 * 0x30);
      if (puVar13 != (undefined8 *)0x0) {
        operator_delete(puVar13,lVar12 - (long)puVar13);
      }
      return puVar1 + 6;
    }
  }
  else {
    FUN_0087066c();
  }
                    /* WARNING: Subroutine does not return */
  FUN_007fe1b8();
}

