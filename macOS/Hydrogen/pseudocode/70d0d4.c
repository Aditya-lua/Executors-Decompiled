
void FUN_0070d0d4(undefined4 *param_1,undefined8 param_2,undefined8 param_3,uint param_4)

{
  undefined4 uVar1;
  char cVar2;
  byte bVar3;
  long lVar4;
  long *plVar5;
  undefined4 *extraout_x8;
  undefined4 *puVar6;
  ulong uVar7;
  ulong uVar8;
  ulong uVar9;
  undefined8 uVar10;
  uint uVar11;
  int iVar12;
  undefined8 *puVar13;
  undefined8 *puVar14;
  ulong uVar15;
  long *unaff_x19;
  undefined4 *puVar16;
  undefined4 *unaff_x21;
  undefined4 *puVar17;
  undefined4 *puVar18;
  undefined4 *unaff_x23;
  long lVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  
  if (unaff_x23 < param_1) {
    puVar17 = unaff_x23 + 1;
    *unaff_x23 = *unaff_x21;
    goto LAB_0070d1f0;
  }
  puVar16 = (undefined4 *)*unaff_x19;
  lVar19 = (long)unaff_x23 - (long)puVar16 >> 2;
  uVar7 = lVar19 + 1;
  if (uVar7 >> 0x3e != 0) {
    func_0x00017f90();
LAB_0070d214:
    auVar26 = func_0x00017514();
    plVar5 = auVar26._0_8_;
    uVar11 = (int)plVar5[2] + 1;
    uVar8 = (ulong)uVar11;
    *(uint *)(plVar5 + 2) = uVar11;
    lVar19 = *plVar5;
    uVar7 = plVar5[1];
    if (uVar8 < uVar7) {
      do {
        bVar3 = *(byte *)(lVar19 + uVar8);
        iVar12 = (int)uVar8;
        if (9 < (int)(char)bVar3 - 0x30U) {
          if (bVar3 < 0x5f) {
            if (bVar3 != 0x2e) {
              if (bVar3 == 0x45) goto LAB_0070d310;
              break;
            }
          }
          else if (bVar3 != 0x5f) {
            if (bVar3 == 0x65) {
LAB_0070d310:
              uVar8 = (ulong)(iVar12 + 1U);
              *(uint *)(plVar5 + 2) = iVar12 + 1U;
              if ((uVar8 < uVar7) &&
                 ((*(char *)(lVar19 + uVar8) == '+' || (*(char *)(lVar19 + uVar8) == '-')))) {
                uVar8 = (ulong)(iVar12 + 2U);
                *(uint *)(plVar5 + 2) = iVar12 + 2U;
              }
            }
            break;
          }
        }
        uVar8 = (ulong)(iVar12 + 1U);
        *(uint *)(plVar5 + 2) = iVar12 + 1U;
      } while (uVar8 < uVar7);
    }
    uVar11 = (uint)uVar8;
    if (uVar8 < uVar7) {
      do {
        uVar11 = (uint)uVar8;
        cVar2 = *(char *)(lVar19 + uVar8);
        if (((0x19 < ((int)cVar2 | 0x20U) - 0x61) && (9 < (int)cVar2 - 0x30U)) && (cVar2 != '_'))
        break;
        uVar11 = uVar11 + 1;
        uVar8 = (ulong)uVar11;
        *(uint *)(plVar5 + 2) = uVar11;
      } while (uVar8 < uVar7);
    }
    uVar1 = *(undefined4 *)((long)plVar5 + 0x14);
    lVar4 = plVar5[3];
    uVar10 = *auVar26._8_8_;
    *extraout_x8 = 0x118;
    *(undefined8 *)(extraout_x8 + 1) = uVar10;
    *(ulong *)(extraout_x8 + 3) = CONCAT44(uVar11 - (int)lVar4,uVar1);
    extraout_x8[5] = uVar11 - param_4;
    *(ulong *)(extraout_x8 + 6) = lVar19 + (ulong)param_4;
    return;
  }
  uVar8 = (long)param_1 - (long)puVar16 >> 1;
  if (uVar8 <= uVar7) {
    uVar8 = uVar7;
  }
  if (0x7ffffffffffffffb < (ulong)((long)param_1 - (long)puVar16)) {
    uVar8 = 0x3fffffffffffffff;
  }
  if (uVar8 == 0) {
    lVar4 = 0;
  }
  else {
    if (uVar8 >> 0x3e != 0) goto LAB_0070d214;
    lVar4 = __Znwm(uVar8 << 2);
  }
  puVar6 = (undefined4 *)(lVar4 + lVar19 * 4);
  puVar17 = puVar6 + 1;
  *puVar6 = *unaff_x21;
  if ((long)unaff_x23 - (long)puVar16 != 0) {
    uVar7 = ((long)unaff_x23 - (long)puVar16) - 4;
    puVar18 = unaff_x23;
    if ((0x3b < uVar7) &&
       (0x3f < (ulong)((long)unaff_x23 + (-((long)unaff_x23 - (long)puVar16) - lVar4)))) {
      uVar7 = (uVar7 >> 2) + 1;
      uVar9 = uVar7 & 0x7ffffffffffffff0;
      puVar18 = unaff_x23 + -uVar9;
      puVar6 = puVar6 + -uVar9;
      puVar13 = (undefined8 *)(unaff_x23 + -8);
      puVar14 = (undefined8 *)(lVar4 + lVar19 * 4 + -0x20);
      uVar15 = uVar9;
      do {
        uVar21 = *puVar13;
        uVar20 = puVar13[3];
        uVar10 = puVar13[2];
        uVar25 = puVar13[-3];
        uVar24 = puVar13[-4];
        uVar23 = puVar13[-1];
        uVar22 = puVar13[-2];
        puVar14[1] = puVar13[1];
        *puVar14 = uVar21;
        puVar14[3] = uVar20;
        puVar14[2] = uVar10;
        puVar14[-3] = uVar25;
        puVar14[-4] = uVar24;
        puVar14[-1] = uVar23;
        puVar14[-2] = uVar22;
        puVar13 = puVar13 + -8;
        puVar14 = puVar14 + -8;
        uVar15 = uVar15 - 0x10;
      } while (uVar15 != 0);
      if (uVar7 == uVar9) goto LAB_0070d1dc;
    }
    do {
      puVar18 = puVar18 + -1;
      puVar6 = puVar6 + -1;
      *puVar6 = *puVar18;
    } while (puVar18 != puVar16);
  }
LAB_0070d1dc:
  *unaff_x19 = (long)puVar6;
  unaff_x19[1] = (long)puVar17;
  unaff_x19[2] = lVar4 + uVar8 * 4;
  if (puVar16 != (undefined4 *)0x0) {
    __ZdlPv(puVar16);
  }
LAB_0070d1f0:
  unaff_x19[1] = (long)puVar17;
  return;
}

