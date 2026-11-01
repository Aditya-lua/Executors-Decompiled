
void FUN_0060ce58(long *param_1,long param_2,undefined8 param_3,long param_4,uint param_5)

{
  uint uVar1;
  char cVar2;
  bool bVar3;
  int iVar4;
  undefined8 uVar5;
  long *plVar6;
  undefined **ppuVar7;
  ulong uVar8;
  undefined8 *puVar9;
  long *plVar10;
  long extraout_x1;
  long extraout_x1_00;
  long extraout_x1_01;
  int iVar11;
  undefined8 *puVar12;
  char *pcVar13;
  undefined8 *puVar14;
  ulong uVar15;
  long lVar16;
  long lVar17;
  ulong uVar18;
  ulong uVar19;
  long lVar20;
  undefined8 *puVar21;
  undefined8 *puVar22;
  long *plVar23;
  undefined8 *puVar24;
  uint *puVar25;
  int *piVar26;
  undefined *apuStack_108 [2];
  ulong uStack_f8;
  ulong uStack_f0;
  long lStack_e8;
  undefined *apuStack_d8 [2];
  ulong uStack_c8;
  ulong uStack_c0;
  long lStack_b8;
  undefined8 uStack_a8;
  undefined8 uStack_a0;
  long lStack_98;
  ulong uStack_90;
  ulong uStack_88;
  undefined8 *puStack_80;
  undefined8 *puStack_78;
  
  plVar10 = (long *)(**(code **)(*param_1 + 0xb8))();
  uVar18 = (ulong)param_5;
  func_0x00620e84(&puStack_80,uVar18);
  lStack_98 = 0;
  uStack_90 = 0;
  uStack_88 = 0;
  func_0x00620f4c(&lStack_98,uVar18);
  if ((param_4 != 0) && (param_5 != 0)) {
    uVar19 = 0;
    lVar17 = extraout_x1;
    do {
      uVar5 = (**(code **)(*plVar10 + 0x30))(plVar10,lVar17);
      func_0x0064afc4(apuStack_108,param_4,uVar5,0);
      uVar15 = uStack_90;
      if (uStack_90 < uStack_88) {
        func_0x005fe0b4(uStack_90,apuStack_108);
        func_0x005fe0b4(uVar15 + 0x30,apuStack_d8);
        *(undefined8 *)(uVar15 + 0x68) = uStack_a0;
        *(undefined8 *)(uVar15 + 0x60) = uStack_a8;
        uStack_90 = uVar15 + 0x70;
      }
      else {
        uStack_90 = func_0x0064add4(&lStack_98,apuStack_108);
      }
      apuStack_d8[0] = &UNK_009f5d60;
      uVar15 = uStack_c8;
      if (uStack_c0 <= uStack_c8) {
        uVar15 = uStack_c0;
      }
      if (lStack_b8 != 0) {
        if (uVar15 != 0) {
          do {
            *(undefined8 *)(lStack_b8 + -8 + uVar15 * 8) = 0;
            uVar15 = uVar15 - 1;
          } while (uVar15 != 0);
        }
        func_0x00611644();
      }
      apuStack_108[0] = &UNK_009f5d60;
      uVar15 = uStack_f8;
      if (uStack_f0 <= uStack_f8) {
        uVar15 = uStack_f0;
      }
      if (lStack_e8 != 0) {
        if (uVar15 != 0) {
          do {
            *(undefined8 *)(lStack_e8 + -8 + uVar15 * 8) = 0;
            uVar15 = uVar15 - 1;
          } while (uVar15 != 0);
        }
        func_0x00611644();
      }
      func_0x006210f8(lStack_98 + uVar19 * 0x70);
      puVar12 = puStack_80;
      iVar11 = *(int *)(lStack_98 + uVar19 * 0x70 + 0x60);
      uVar5 = (**(code **)(*plVar10 + 0x18))(plVar10);
      plVar6 = puVar12 + uVar19 * 3;
      plVar23 = puVar12 + uVar19 * 3 + 1;
      puVar12 = (undefined8 *)*plVar23;
      uVar15 = 1L << ((ulong)(iVar11 - 1) & 0x3f);
      lVar16 = *plVar6;
      lVar17 = (long)puVar12 - lVar16 >> 4;
      bVar3 = (ulong)(lVar17 * -0x5555555555555555) <= uVar15;
      lVar17 = uVar15 + lVar17 * 0x5555555555555555;
      if (bVar3 && lVar17 != 0) {
        func_0x0064b0bc(plVar6,lVar17,uVar5);
        lVar17 = extraout_x1_00;
      }
      else if (!bVar3) {
        puVar21 = (undefined8 *)(lVar16 + uVar15 * 0x30);
        while (puVar12 != puVar21) {
          puVar12 = puVar12 + -6;
          (**(code **)*puVar12)(puVar12);
          lVar17 = extraout_x1_01;
        }
        *plVar23 = (long)puVar21;
      }
      param_4 = param_4 + 0x30;
      uVar19 = uVar19 + 1;
    } while (uVar19 != uVar18);
  }
  func_0x005fe0b4(apuStack_108,param_3);
  if (param_5 != 0) {
    iVar11 = 0;
    do {
      uVar19 = 0;
      bVar3 = false;
      do {
        while( true ) {
          if ((*(char *)(lStack_98 + uVar19 * 0x70 + 0x6f) == '\0') &&
             (iVar11 == *(int *)(lStack_98 + uVar19 * 0x70 + 100))) {
            lVar17 = lStack_98 + uVar19 * 0x70;
            uVar1 = *(uint *)(lVar17 + 0x68);
            lVar20 = puStack_80[uVar19 * 3];
            lVar16 = *plVar10;
            if (*(char *)(lVar17 + 0x6d) == '\0') {
              ppuVar7 = apuStack_108;
            }
            else {
              ppuVar7 = (undefined **)(**(code **)(lVar16 + 0x28))(plVar10,apuStack_108);
              lVar16 = *plVar10;
            }
            (**(code **)(lVar16 + 0x48))(plVar10,lVar20 + (ulong)(uVar1 >> 1) * 0x30,ppuVar7);
            lVar17 = lStack_98;
            lVar16 = lStack_98 + uVar19 * 0x70;
            iVar4 = func_0x005fe094(lVar16);
            pcVar13 = (char *)(lVar17 + uVar19 * 0x70 + 0x6e);
            if (*pcVar13 == '\0') {
              uVar15 = (ulong)*(uint *)(lVar17 + uVar19 * 0x70 + 0x60);
            }
            else {
              uVar15 = 0;
            }
            *pcVar13 = '\0';
            uVar8 = func_0x005ffe3c(lVar16,uVar15);
            if ((uVar8 & 1) == 0) {
              lVar20 = 0;
              uVar1 = (uint)uVar15;
              if ((uint)uVar15 <= (uint)(iVar4 * 0x40)) {
                uVar1 = iVar4 * 0x40;
              }
              do {
                if ((uVar15 - uVar1) + lVar20 == 0) {
                  *(undefined1 *)(lVar17 + uVar19 * 0x70 + 0x6f) = 1;
                  if (!bVar3) goto code_r0x0062095c;
                  goto code_r0x00620b0c;
                }
                iVar4 = func_0x005ffe3c(lVar16,uVar15 + lVar20 + 1);
                lVar20 = lVar20 + 1;
              } while (iVar4 == 0);
              uVar15 = uVar15 + lVar20;
            }
            func_0x006078e0(lVar16,uVar15);
            lVar20 = lVar17 + uVar19 * 0x70;
            puVar25 = (uint *)(lVar20 + 0x60);
            *(int *)(lVar20 + 100) = *(int *)(lVar20 + 100) + (int)uVar15;
            iVar4 = func_0x00609cf4(lVar16,1L << ((ulong)*puVar25 & 0x3f));
            lVar20 = lVar17 + uVar19 * 0x70;
            piVar26 = (int *)(lVar20 + 0x68);
            *piVar26 = iVar4;
            if ((*(char *)(lVar20 + 0x6c) == '\0') ||
               (iVar4 = func_0x005ffe3c(lVar16,*puVar25), iVar4 == 0)) {
              *(undefined1 *)(lVar17 + uVar19 * 0x70 + 0x6d) = 0;
            }
            else {
              lVar17 = lVar17 + uVar19 * 0x70;
              *(undefined1 *)(lVar17 + 0x6d) = 1;
              *piVar26 = (1 << (ulong)(*puVar25 & 0x1f)) - *piVar26;
              func_0x00603158(lVar16,lVar17 + 0x30);
            }
          }
          if (!bVar3) break;
code_r0x00620b0c:
          uVar19 = uVar19 + 1;
          bVar3 = true;
          if (uVar19 == uVar18) goto code_r0x00620b3c;
        }
code_r0x0062095c:
        cVar2 = *(char *)(lStack_98 + uVar19 * 0x70 + 0x6f);
        bVar3 = cVar2 == '\0';
        uVar19 = uVar19 + 1;
      } while (uVar19 != uVar18);
      if (cVar2 != '\0') goto code_r0x00620b6c;
code_r0x00620b3c:
      uVar5 = (**(code **)(*plVar10 + 0x38))(plVar10,apuStack_108);
      func_0x005ffccc(apuStack_108,uVar5);
      iVar11 = iVar11 + 1;
    } while( true );
  }
code_r0x00620cbc:
  apuStack_108[0] = &UNK_009f5d60;
  if (uStack_f0 <= uStack_f8) {
    uStack_f8 = uStack_f0;
  }
  if (lStack_e8 != 0) {
    if (uStack_f8 != 0) {
      do {
        *(undefined8 *)(lStack_e8 + -8 + uStack_f8 * 8) = 0;
        uStack_f8 = uStack_f8 - 1;
      } while (uStack_f8 != 0);
    }
    func_0x00611644();
  }
  if (lStack_98 != 0) {
    func_0x0064b344(&lStack_98);
    __ZdlPv(lStack_98);
  }
  puVar12 = puStack_80;
  if (puStack_80 != (undefined8 *)0x0) {
    if (puStack_78 != puStack_80) {
      puVar21 = puStack_78;
      do {
        puVar22 = puVar21 + -3;
        puVar24 = (undefined8 *)*puVar22;
        if (puVar24 != (undefined8 *)0x0) {
          puVar14 = (undefined8 *)puVar21[-2];
          puVar9 = puVar24;
          if (puVar14 != puVar24) {
            do {
              puVar14 = puVar14 + -6;
              (**(code **)*puVar14)(puVar14);
            } while (puVar14 != puVar24);
            puVar9 = (undefined8 *)*puVar22;
          }
          puVar21[-2] = puVar24;
          __ZdlPv(puVar9);
        }
        puVar21 = puVar22;
      } while (puVar22 != puVar12);
    }
    puStack_78 = puVar12;
    __ZdlPv(puStack_80);
  }
  return;
code_r0x00620b6c:
  if (param_5 != 0) {
    uVar19 = 0;
    do {
      func_0x005ffccc(param_2,puStack_80[uVar19 * 3 + 1] + -0x30);
      lVar17 = puStack_80[uVar19 * 3];
      uVar15 = ((puStack_80 + uVar19 * 3)[1] - lVar17 >> 4) * -0x5555555555555555;
      if (1 < uVar15) {
        iVar11 = (int)uVar15;
        if (2 < iVar11) {
          uVar15 = (ulong)(iVar11 - 2);
          lVar17 = uVar15 + 1;
          lVar16 = uVar15 * 0x30;
          do {
            (**(code **)(*plVar10 + 0x48))
                      (plVar10,puStack_80[uVar19 * 3] + lVar16,
                       puStack_80[uVar19 * 3] + lVar16 + 0x30);
            (**(code **)(*plVar10 + 0x48))(plVar10,param_2,puStack_80[uVar19 * 3] + lVar16);
            lVar17 = lVar17 + -1;
            lVar16 = lVar16 + -0x30;
          } while (1 < lVar17);
          lVar17 = puStack_80[uVar19 * 3];
        }
        (**(code **)(*plVar10 + 0x48))(plVar10,lVar17,lVar17 + 0x30);
        uVar5 = (**(code **)(*plVar10 + 0x38))(plVar10,param_2);
        uVar5 = (**(code **)(*plVar10 + 0x20))(plVar10,uVar5,puStack_80[uVar19 * 3]);
        func_0x005ffccc(param_2,uVar5);
      }
      param_2 = param_2 + 0x30;
      uVar19 = uVar19 + 1;
    } while (uVar19 != uVar18);
  }
  goto code_r0x00620cbc;
}

