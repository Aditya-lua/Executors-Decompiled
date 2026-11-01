
void FUN_004deaec(undefined8 param_1)

{
  undefined8 *puVar1;
  long lVar2;
  code *pcVar3;
  int iVar4;
  undefined8 uVar5;
  long *plVar6;
  long *plVar7;
  undefined8 *puVar8;
  long lVar9;
  ulong uVar10;
  ulong uVar11;
  ulong uVar12;
  long lVar13;
  undefined8 *puVar14;
  undefined8 *puVar15;
  long lVar16;
  long lVar17;
  undefined1 auVar18 [16];
  undefined1 uStack0000000000000030;
  undefined8 uStack_140;
  undefined8 uStack_138;
  undefined8 uStack_130;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined8 *puStack_108;
  undefined *puStack_100;
  undefined8 uStack_f8;
  long *plStack_90;
  long lStack_88;
  long lStack_80;
  long lStack_78;
  long lStack_70;
  long lStack_68;
  long lStack_60;
  long lStack_58;
  long lStack_50;
  long lStack_48;
  long lStack_40;
  long lStack_38;
  
  func_0x00187bd4();
  uVar5 = __Unwind_Resume(param_1);
  func_0x004de050(&uStack0000000000000030);
  __Unwind_Resume(uVar5);
  auVar18 = func_0x007a2668();
  lVar9 = auVar18._8_8_;
  plVar6 = auVar18._0_8_;
  plVar7 = (long *)func_0x00187bd0(0x40,8);
  if (plVar7 != (long *)0x0) {
    func_0x004de4c4(&lStack_70,*(undefined8 *)(lVar9 + 0x30));
    plVar7[1] = lStack_68;
    *plVar7 = lStack_70;
    plVar7[3] = lStack_58;
    plVar7[2] = lStack_60;
    plVar7[5] = lStack_48;
    plVar7[4] = lStack_50;
    plVar7[7] = lStack_38;
    plVar7[6] = lStack_40;
    plStack_90 = plVar7;
    func_0x0045cd08(&lStack_88,lVar9);
    func_0x004cdf58(&lStack_70,lVar9 + 0x18,&UNK_009e7ec0);
    plVar6[1] = lStack_80;
    *plVar6 = lStack_88;
    plVar6[2] = lStack_78;
    plVar6[4] = lStack_68;
    plVar6[3] = lStack_70;
    plVar6[5] = lStack_60;
    plVar6[6] = (long)plVar7;
    return;
  }
  uVar5 = func_0x007a1f18(8,0x40);
  if (lStack_88 != 0) {
    func_0x00187bd4(lStack_80,lStack_88,1);
  }
  func_0x004de050(&plStack_90);
  auVar18 = __Unwind_Resume(uVar5);
  plVar6 = auVar18._8_8_;
  puVar8 = auVar18._0_8_;
  puVar15 = (undefined8 *)*plVar6;
  puVar1 = (undefined8 *)plVar6[1];
  if (puVar15 == puVar1) goto LAB_004ded3c;
  lVar9 = *(long *)(plVar6[2] + 0x90);
  if (lVar9 == 0) {
    uVar10 = (long)puVar1 + (-0x10 - (long)puVar15);
    if (0x2f < uVar10) {
      uVar10 = (uVar10 >> 4) + 1;
      uVar11 = uVar10 & 0x1ffffffffffffffc;
      puVar15 = puVar15 + uVar11 * 2;
      uVar12 = uVar11;
      do {
        uVar12 = uVar12 - 4;
      } while (uVar12 != 0);
      if (uVar10 == uVar11) goto code_r0x004ded38;
    }
    do {
      puVar15 = puVar15 + 2;
    } while (puVar15 != puVar1);
  }
  else {
    lVar16 = *(long *)(plVar6[2] + 0x88);
    puVar14 = puVar15;
    do {
      puVar15 = puVar14 + 2;
      uVar5 = *puVar14;
      lVar2 = puVar14[1];
      lVar13 = lVar16;
      lVar17 = lVar9 * 600;
      do {
        if ((*(long *)(lVar13 + 0x220) == lVar2) &&
           (iVar4 = _memcmp(*(undefined8 *)(lVar13 + 0x218),uVar5,lVar2), iVar4 == 0)) {
          *plVar6 = (long)puVar15;
          if ((*(long *)(lVar13 + 0x228) == 0) && (*(int *)(lVar13 + 0x248) == 0x110000)) {
            func_0x0050d570(&uStack_140,lVar13);
          }
          else {
            uStack_120 = 0;
            uStack_118 = 1;
            uStack_f8 = 0xe0000020;
            puStack_108 = &uStack_120;
            uStack_110 = 0;
            puStack_100 = &UNK_009e7f30;
            iVar4 = func_0x0050f9f0(lVar13,&puStack_108);
            if (iVar4 != 0) {
              func_0x007a2810(&UNK_008a34d0,0x37,&uStack_140,&UNK_009e7f78,&UNK_009e7f60);
                    /* WARNING: Does not return */
              pcVar3 = (code *)SoftwareBreakpoint(1,0x4dede8);
              (*pcVar3)();
            }
            uStack_138 = uStack_118;
            uStack_140 = uStack_120;
            uStack_130 = uStack_110;
          }
          puVar8[1] = uStack_138;
          *puVar8 = uStack_140;
          puVar8[2] = uStack_130;
          return;
        }
        lVar13 = lVar13 + 600;
        lVar17 = lVar17 + -600;
      } while (lVar17 != 0);
      puVar14 = puVar15;
    } while (puVar15 != puVar1);
  }
code_r0x004ded38:
  *plVar6 = (long)puVar15;
LAB_004ded3c:
  *puVar8 = 0x8000000000000000;
  return;
}

