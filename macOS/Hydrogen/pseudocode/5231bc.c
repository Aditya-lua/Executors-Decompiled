
void FUN_005231bc(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined8 *param_4)

{
  undefined8 *puVar1;
  undefined8 *puVar2;
  long lVar3;
  undefined8 uVar4;
  bool bVar5;
  long lVar6;
  code *pcVar7;
  int iVar8;
  undefined8 uVar9;
  long *plVar10;
  ulong uVar11;
  long *plVar12;
  long lVar13;
  undefined8 unaff_x19;
  long lVar14;
  long lVar15;
  ulong uVar16;
  long unaff_x25;
  long lVar17;
  undefined8 uVar18;
  undefined8 *puVar19;
  long lVar20;
  long lVar21;
  long unaff_x29;
  undefined1 auVar22 [16];
  undefined1 uStack0000000000000060;
  long lStack_a8;
  long lStack_a0;
  long lStack_98;
  long lStack_90;
  undefined8 uStack_88;
  undefined8 uStack_80;
  long lStack_78;
  undefined8 uStack_70;
  undefined8 uStack_68;
  
  if (*(long *)(unaff_x29 + -0x70) != 0) {
    param_3 = 1;
    func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0x68));
    func_0x00521800(&uStack0000000000000060);
    unaff_x19 = __Unwind_Resume();
    if (unaff_x25 != 0) {
      param_3 = 8;
      func_0x00187bd4();
      func_0x00521800(&uStack0000000000000060);
      unaff_x19 = __Unwind_Resume(unaff_x19);
      if (*(long *)(unaff_x29 + -0xe0) != 0) {
        param_3 = 8;
        func_0x00187bd4(*(undefined8 *)(unaff_x29 + -0xd8),*(long *)(unaff_x29 + -0xe0) << 4);
        func_0x00521800(&uStack0000000000000060);
        uVar9 = __Unwind_Resume(unaff_x19);
        func_0x00521800(&uStack0000000000000060);
        uVar9 = __Unwind_Resume(uVar9);
        func_0x00521800(&uStack0000000000000060);
        uVar9 = __Unwind_Resume(uVar9);
        func_0x00521800(&uStack0000000000000060);
        unaff_x19 = __Unwind_Resume(uVar9);
      }
    }
  }
  func_0x00521800(&uStack0000000000000060);
  auVar22 = __Unwind_Resume(unaff_x19);
  lVar13 = auVar22._8_8_;
  plVar10 = auVar22._0_8_;
  lStack_a8 = 0;
  lStack_a0 = 8;
  lStack_98 = 0;
  puVar19 = *(undefined8 **)(lVar13 + 8);
  lVar3 = *(long *)(lVar13 + 0x10);
  if (lVar3 != 0) {
    lVar20 = 0;
    uVar16 = 0;
    uVar9 = *param_4;
    lVar21 = param_4[1];
    plVar12 = puVar19 + 1;
    lVar15 = lVar3 << 4;
    do {
      if ((*plVar12 == lVar21) && (iVar8 = _memcmp(plVar12[-1],uVar9,lVar21), iVar8 == 0)) {
        uVar11 = *(ulong *)(lVar13 + 0x28);
        if (uVar16 < uVar11) {
          bVar5 = false;
          lVar21 = *(long *)(lVar13 + 0x20);
          plVar12 = (long *)(lVar21 - lVar20);
          if (lVar3 == 0) goto LAB_00523620;
          goto LAB_00523414;
        }
        func_0x007a2570(uVar16,uVar11,&UNK_009e9b68);
        goto code_r0x00523694;
      }
      plVar12 = plVar12 + 2;
      lVar20 = lVar20 + -0x18;
      uVar16 = uVar16 + 1;
      lVar15 = lVar15 + -0x10;
    } while (lVar15 != 0);
  }
  func_0x005236f8(&lStack_78,param_3,param_4);
  uStack_88 = uStack_70;
  lStack_90 = lStack_78;
  uStack_80 = uStack_68;
  lVar21 = *(long *)(lVar13 + 0x20);
  uVar11 = *(ulong *)(lVar13 + 0x28);
  plVar12 = &lStack_90;
  bVar5 = true;
  if (lVar3 != 0) {
LAB_00523414:
    puVar1 = puVar19 + lVar3 * 2;
    lVar15 = lVar21 + uVar11 * 0x18;
    lVar13 = plVar12[2];
    uVar9 = *param_4;
    lVar3 = param_4[1];
    if (lVar13 == 0) {
      do {
        if (lVar21 == lVar15) goto LAB_00523674;
        lVar13 = puVar19[1];
        if (((lVar3 != lVar13) || (iVar8 = _memcmp(uVar9,*puVar19,lVar3), iVar8 != 0)) &&
           (*(long *)(lVar21 + 0x10) != 0)) {
          plVar12 = (long *)(*(long *)(lVar21 + 8) + 8);
          lVar20 = *(long *)(lVar21 + 0x10) << 4;
          do {
            if ((*plVar12 == lVar3) &&
               (iVar8 = _memcmp(plVar12[-1],uVar9,lVar3), lVar17 = lStack_98, iVar8 == 0)) {
              uVar18 = *puVar19;
              if (lStack_98 == lStack_a8) {
                func_0x0050c0c0(&lStack_a8,&UNK_009ea558);
              }
              puVar2 = (undefined8 *)(lStack_a0 + lVar17 * 0x10);
              *puVar2 = uVar18;
              puVar2[1] = lVar13;
              lStack_98 = lVar17 + 1;
              break;
            }
            plVar12 = plVar12 + 2;
            lVar20 = lVar20 + -0x10;
          } while (lVar20 != 0);
        }
        puVar19 = puVar19 + 2;
        lVar21 = lVar21 + 0x18;
      } while (puVar19 != puVar1);
    }
    else {
      lVar20 = plVar12[1];
      do {
        if (lVar21 == lVar15) {
LAB_00523674:
          func_0x007a23bc(&UNK_009e9bf8);
code_r0x00523694:
                    /* WARNING: Does not return */
          pcVar7 = (code *)SoftwareBreakpoint(1,0x523698);
          (*pcVar7)();
        }
        uVar18 = *puVar19;
        lVar17 = puVar19[1];
        if ((lVar3 != lVar17) || (iVar8 = _memcmp(uVar9,uVar18,lVar3), iVar8 != 0)) {
          lVar14 = lVar13 << 4;
          plVar12 = (long *)(lVar20 + 8);
          do {
            if ((*plVar12 == lVar17) &&
               (iVar8 = _memcmp(plVar12[-1],uVar18,lVar17), lVar6 = lStack_98, iVar8 == 0)) {
              if (lStack_98 == lStack_a8) {
                func_0x0050c0c0(&lStack_a8,&UNK_009ea540);
              }
              puVar2 = (undefined8 *)(lStack_a0 + lVar6 * 0x10);
              *puVar2 = uVar18;
              puVar2[1] = lVar17;
              lStack_98 = lVar6 + 1;
              break;
            }
            plVar12 = plVar12 + 2;
            lVar14 = lVar14 + -0x10;
          } while (lVar14 != 0);
          if (*(long *)(lVar21 + 0x10) != 0) {
            plVar12 = (long *)(*(long *)(lVar21 + 8) + 8);
            lVar17 = *(long *)(lVar21 + 0x10) << 4;
            do {
              if ((*plVar12 == lVar3) &&
                 (iVar8 = _memcmp(plVar12[-1],uVar9,lVar3), lVar14 = lStack_98, iVar8 == 0)) {
                uVar18 = *puVar19;
                uVar4 = puVar19[1];
                if (lStack_98 == lStack_a8) {
                  func_0x0050c0c0(&lStack_a8,&UNK_009ea558);
                }
                puVar2 = (undefined8 *)(lStack_a0 + lVar14 * 0x10);
                *puVar2 = uVar18;
                puVar2[1] = uVar4;
                lStack_98 = lVar14 + 1;
                break;
              }
              plVar12 = plVar12 + 2;
              lVar17 = lVar17 + -0x10;
            } while (lVar17 != 0);
          }
        }
        puVar19 = puVar19 + 2;
        lVar21 = lVar21 + 0x18;
      } while (puVar19 != puVar1);
    }
  }
LAB_00523620:
  plVar10[1] = lStack_a0;
  *plVar10 = lStack_a8;
  plVar10[2] = lStack_98;
  if ((bVar5) && (lStack_90 != 0)) {
    func_0x00187bd4(uStack_88,lStack_90 << 4,8);
  }
  return;
}

