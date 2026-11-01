
void FUN_006891a4(undefined8 param_1,undefined8 param_2,undefined8 *param_3)

{
  long lVar1;
  long lVar2;
  long *plVar3;
  long lVar4;
  ulong uVar5;
  long *plVar6;
  long lVar7;
  ulong *puVar8;
  long lVar9;
  undefined8 *puVar10;
  long lVar11;
  undefined8 *puVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  ulong *puVar16;
  ulong uVar17;
  ulong uVar18;
  undefined8 uVar19;
  undefined1 auVar20 [16];
  
  __ZdlPv();
  auVar20 = __Unwind_Resume();
  uVar5 = auVar20._8_8_;
  lVar4 = auVar20._0_8_;
  uVar17 = *(ulong *)(lVar4 + 0x20);
  uVar18 = *(ulong *)(lVar4 + 0x28);
  lVar1 = *(long *)(lVar4 + 8);
  lVar9 = *(long *)(lVar4 + 0x10);
  plVar6 = (long *)(lVar1 + (uVar17 >> 9) * 8);
  if (uVar5 <= uVar18) {
    if (lVar9 == lVar1) {
      puVar10 = (undefined8 *)0x0;
    }
    else {
      puVar10 = (undefined8 *)(*plVar6 + (uVar17 & 0x1ff) * 8);
    }
    if (uVar5 == 0) {
      uVar5 = uVar17 + uVar18;
    }
    else {
      puVar14 = (undefined8 *)*plVar6;
      do {
        puVar15 = puVar10 + 1;
        *puVar10 = *param_3;
        puVar10 = puVar15;
        if ((long)puVar15 - (long)puVar14 == 0x1000) {
          plVar6 = plVar6 + 1;
          puVar14 = (undefined8 *)*plVar6;
          puVar10 = puVar14;
        }
        uVar5 = uVar5 - 1;
      } while (uVar5 != 0);
      uVar17 = *(ulong *)(lVar4 + 0x20);
      uVar18 = *(ulong *)(lVar4 + 0x28);
      uVar5 = uVar17 + uVar18;
    }
    plVar3 = (long *)(lVar1 + (uVar5 >> 9) * 8);
    if (lVar9 - lVar1 == 0) {
      puVar14 = (undefined8 *)0x0;
      if (puVar10 == (undefined8 *)0x0) {
        return;
      }
    }
    else {
      puVar14 = (undefined8 *)(*plVar3 + (uVar5 & 0x1ff) * 8);
      if (puVar10 == puVar14) {
        return;
      }
    }
    lVar7 = (((long)puVar14 - *plVar3 >> 3) + ((long)plVar3 - (long)plVar6) * 0x40) -
            ((long)puVar10 - *plVar6 >> 3);
    if (0 < lVar7) {
      lVar11 = 0;
      if (lVar9 != lVar1) {
        lVar11 = (lVar9 - lVar1) * 0x40 + -1;
      }
      lVar7 = uVar18 - lVar7;
      *(long *)(lVar4 + 0x28) = lVar7;
      uVar5 = lVar11 - (uVar17 + lVar7);
      while (0x3ff < uVar5) {
        __ZdlPv(*(undefined8 *)(lVar9 + -8));
        lVar9 = *(long *)(lVar4 + 0x10) + -8;
        *(long *)(lVar4 + 0x10) = lVar9;
        lVar1 = 0;
        if (lVar9 != *(long *)(lVar4 + 8)) {
          lVar1 = (lVar9 - *(long *)(lVar4 + 8)) * 0x40 + -1;
        }
        uVar5 = lVar1 - (*(long *)(lVar4 + 0x28) + *(long *)(lVar4 + 0x20));
      }
    }
    return;
  }
  if (lVar9 == lVar1) {
    puVar10 = (undefined8 *)0x0;
  }
  else {
    puVar10 = (undefined8 *)(*plVar6 + (uVar17 & 0x1ff) * 8);
  }
  if (uVar18 != 0) {
    puVar14 = (undefined8 *)*plVar6;
    do {
      puVar15 = puVar10 + 1;
      *puVar10 = *param_3;
      if ((long)puVar15 - (long)puVar14 == 0x1000) {
        plVar6 = plVar6 + 1;
        puVar15 = (undefined8 *)*plVar6;
        puVar14 = puVar15;
      }
      uVar18 = uVar18 - 1;
      puVar10 = puVar15;
    } while (uVar18 != 0);
    uVar5 = uVar5 - *(long *)(lVar4 + 0x28);
  }
  lVar9 = *(long *)(lVar4 + 8);
  lVar7 = *(long *)(lVar4 + 0x10);
  lVar1 = 0;
  if (lVar7 != lVar9) {
    lVar1 = (lVar7 - lVar9) * 0x40 + -1;
  }
  lVar11 = *(long *)(lVar4 + 0x28);
  uVar17 = lVar11 + *(long *)(lVar4 + 0x20);
  lVar2 = uVar5 - (lVar1 - uVar17);
  if (lVar1 - uVar17 <= uVar5 && lVar2 != 0) {
    func_0x00689710(lVar4,lVar2);
    lVar11 = *(long *)(lVar4 + 0x28);
    lVar9 = *(long *)(lVar4 + 8);
    lVar7 = *(long *)(lVar4 + 0x10);
    uVar17 = *(long *)(lVar4 + 0x20) + lVar11;
  }
  puVar8 = (ulong *)(lVar9 + (uVar17 >> 9) * 8);
  if (lVar7 == lVar9) {
    puVar10 = (undefined8 *)0x0;
  }
  else {
    puVar10 = (undefined8 *)(*puVar8 + (uVar17 & 0x1ff) * 8);
  }
  if (uVar5 != 0) {
    uVar5 = uVar5 + ((long)((long)puVar10 - *puVar8) >> 3);
    if ((long)uVar5 < 1) {
      uVar17 = 0x1ff - uVar5;
      uVar5 = (ulong)~(uint)uVar17;
      lVar1 = (uVar17 >> 9) * -8;
    }
    else {
      lVar1 = (uVar5 >> 9) * 8;
    }
    puVar16 = (ulong *)((long)puVar8 + lVar1);
    puVar14 = (undefined8 *)(*puVar16 + (uVar5 & 0x1ff) * 8);
    if (puVar10 != puVar14) {
      do {
        puVar15 = puVar14;
        if (puVar8 != puVar16) {
          puVar15 = (undefined8 *)(*puVar8 + 0x1000);
        }
        if (puVar10 == puVar15) {
          *(long *)(lVar4 + 0x28) = lVar11;
        }
        else {
          uVar5 = (long)puVar15 + (-8 - (long)puVar10);
          puVar12 = puVar10;
          if ((uVar5 < 0x68) ||
             ((puVar10 < param_3 + 1 &&
              (param_3 < (undefined8 *)((long)puVar10 + (uVar5 & 0xfffffffffffffff8) + 8))))) {
code_r0x006896b0:
            do {
              puVar13 = puVar12 + 1;
              *puVar12 = *param_3;
              puVar12 = puVar13;
            } while (puVar13 != puVar15);
          }
          else {
            uVar5 = (uVar5 >> 3) + 1;
            uVar18 = uVar5 & 0x3ffffffffffffff8;
            uVar19 = *param_3;
            uVar17 = uVar18;
            puVar12 = puVar10 + 4;
            do {
              puVar12[-3] = uVar19;
              puVar12[-4] = uVar19;
              puVar12[-1] = uVar19;
              puVar12[-2] = uVar19;
              puVar12[1] = uVar19;
              *puVar12 = uVar19;
              puVar12[3] = uVar19;
              puVar12[2] = uVar19;
              uVar17 = uVar17 - 8;
              puVar12 = puVar12 + 8;
            } while (uVar17 != 0);
            puVar12 = puVar10 + uVar18;
            if (uVar5 != uVar18) goto code_r0x006896b0;
          }
          lVar11 = *(long *)(lVar4 + 0x28) + ((long)puVar15 - (long)puVar10 >> 3);
          *(long *)(lVar4 + 0x28) = lVar11;
        }
        if (puVar8 == puVar16) {
          return;
        }
        puVar8 = puVar8 + 1;
        puVar10 = (undefined8 *)*puVar8;
      } while (puVar10 != puVar14);
    }
  }
  return;
}

