/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0089dad8
 */

void FUN_0089dad8(undefined8 *param_1,ulong param_2)

{
  undefined8 *puVar1;
  void *pvVar2;
  undefined8 *puVar3;
  undefined8 *puVar4;
  long lVar5;
  long lVar6;
  undefined8 uVar7;
  ulong uVar8;
  ulong uVar9;
  void *pvVar10;
  undefined8 *puVar11;
  ulong uVar12;
  size_t __n;
  undefined8 uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  undefined1 auVar16 [16];
  
  lVar5 = param_1[2];
  pvVar10 = (void *)*param_1;
  if ((ulong)((lVar5 - (long)pvVar10 >> 3) * -0x3333333333333333) < param_2) {
    if (0x666666666666666 < param_2) {
      auVar16 = FUN_0089f5b8();
      puVar4 = auVar16._8_8_;
      puVar3 = auVar16._0_8_;
      puVar1 = (undefined8 *)puVar3[1];
      if (puVar1 < (undefined8 *)puVar3[2]) {
        uVar15 = puVar4[1];
        uVar14 = *puVar4;
        uVar13 = puVar4[3];
        uVar7 = puVar4[2];
        puVar11 = puVar1 + 5;
        puVar1[4] = puVar4[4];
        puVar1[1] = uVar15;
        *puVar1 = uVar14;
        puVar1[3] = uVar13;
        puVar1[2] = uVar7;
LAB_0089dc98:
        puVar3[1] = puVar11;
        return;
      }
      pvVar10 = (void *)*puVar3;
      __n = (long)puVar1 - (long)pvVar10;
      uVar8 = ((long)__n >> 3) * -0x3333333333333333 + 1;
      if (uVar8 < 0x666666666666667) {
        uVar12 = (long)puVar3[2] - (long)pvVar10;
        lVar5 = (long)uVar12 >> 3;
        uVar9 = lVar5 * -0x6666666666666666;
        if (uVar9 <= uVar8) {
          uVar9 = uVar8;
        }
        if (0x333333333333332 < (ulong)(lVar5 * -0x3333333333333333)) {
          uVar9 = 0x666666666666666;
        }
        if (uVar9 < 0x666666666666667) {
          pvVar2 = operator_new(uVar9 * 0x28);
          uVar13 = *puVar4;
          uVar15 = puVar4[3];
          uVar14 = puVar4[2];
          puVar1 = (undefined8 *)((long)pvVar2 + __n);
          uVar7 = puVar4[4];
          puVar11 = puVar1 + 5;
          puVar1[1] = puVar4[1];
          *puVar1 = uVar13;
          puVar1[3] = uVar15;
          puVar1[2] = uVar14;
          puVar1[4] = uVar7;
          memcpy(pvVar2,pvVar10,__n);
          *puVar3 = pvVar2;
          puVar3[1] = puVar11;
          puVar3[2] = (void *)((long)pvVar2 + uVar9 * 0x28);
          if (pvVar10 != (void *)0x0) {
            operator_delete(pvVar10,uVar12);
          }
          goto LAB_0089dc98;
        }
      }
      else {
        FUN_0089f5b8();
      }
                    /* WARNING: Subroutine does not return */
      FUN_007fe1b8();
    }
    lVar6 = param_1[1];
    pvVar2 = operator_new(param_2 * 0x28);
    memcpy(pvVar2,pvVar10,lVar6 - (long)pvVar10);
    *param_1 = pvVar2;
    param_1[1] = (long)pvVar2 + (lVar6 - (long)pvVar10);
    param_1[2] = (void *)((long)pvVar2 + param_2 * 0x28);
    if (pvVar10 != (void *)0x0) {
      operator_delete(pvVar10,lVar5 - (long)pvVar10);
      return;
    }
  }
  return;
}

