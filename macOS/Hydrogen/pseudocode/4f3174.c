
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004f3174(void)

{
  undefined8 *puVar1;
  ushort uVar2;
  code *pcVar3;
  bool in_ZR;
  int iVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined *puVar8;
  long lVar9;
  long *extraout_x8;
  long *extraout_x8_00;
  ulong uVar10;
  long *plVar11;
  long lVar12;
  long unaff_x22;
  undefined8 uVar13;
  undefined8 uVar14;
  long lVar15;
  long lVar16;
  long unaff_x25;
  long lVar17;
  long *unaff_x28;
  undefined8 uVar18;
  undefined1 auVar19 [16];
  undefined8 uStack0000000000000038;
  undefined *in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  
  uVar18 = _UNK_008a36d8;
  uVar6 = _UNK_008a36d0;
  if (!in_ZR) {
    lVar9 = *(long *)(*(long *)(unaff_x22 + 0x10) + 0xd8);
    if (lVar9 != 0) {
      uVar13 = *(undefined8 *)(unaff_x25 + 0x218);
      lVar12 = *(long *)(unaff_x25 + 0x220);
      lVar16 = *(long *)(*(long *)(unaff_x22 + 0x10) + 0xd0);
      lVar9 = lVar16 + lVar9 * 0x60;
      if (lVar12 < 0) {
        do {
          if (*(long *)(lVar16 + 0x10) != 0) {
            plVar11 = (long *)(*(long *)(lVar16 + 8) + 8);
            lVar15 = *(long *)(lVar16 + 0x10) << 4;
            do {
              if ((*plVar11 == lVar12) && (iVar4 = _memcmp(plVar11[-1],uVar13,lVar12), iVar4 == 0))
              {
                uVar7 = *(undefined8 *)(lVar16 + 0x50);
                func_0x00517864();
                puVar5 = (undefined8 *)func_0x00187bd0(0x20,8);
                if (puVar5 == (undefined8 *)0x0) goto LAB_004f3390;
                uVar14 = 0;
                puVar5[1] = 1;
                *puVar5 = 1;
                puVar5[2] = uVar13;
                puVar5[3] = lVar12;
                in_stack_00000040 = &UNK_009e99f0;
                in_stack_00000050 = _UNK_008a36d8;
                in_stack_00000048 = _UNK_008a36d0;
                uStack0000000000000038 = puVar5;
                goto LAB_004f3268;
              }
              plVar11 = plVar11 + 2;
              lVar15 = lVar15 + -0x10;
            } while (lVar15 != 0);
          }
          lVar16 = lVar16 + 0x60;
        } while (lVar16 != lVar9);
      }
      else {
        uVar14 = 1;
        do {
          lVar15 = lVar16 + 0x60;
          if (*(long *)(lVar16 + 0x10) != 0) {
            unaff_x28 = (long *)(*(long *)(lVar16 + 8) + 8);
            lVar17 = *(long *)(lVar16 + 0x10) << 4;
            do {
              if ((*unaff_x28 == lVar12) &&
                 (iVar4 = _memcmp(unaff_x28[-1],uVar13,lVar12), iVar4 == 0)) {
                uVar7 = *(undefined8 *)(lVar16 + 0x50);
                func_0x00517864();
                puVar5 = (undefined8 *)func_0x00187bd0(0x20,8);
                if (puVar5 == (undefined8 *)0x0) {
LAB_004f3390:
                  uVar6 = func_0x007a1f18(8,0x20);
                  if (uStack0000000000000038 != (undefined8 *)0x0) {
                    uVar7 = 8;
                    func_0x00187bd4(in_stack_00000040,(long)uStack0000000000000038 << 3);
                    uVar6 = __Unwind_Resume(uVar6);
                    lVar9 = *unaff_x28;
                    *unaff_x28 = lVar9 + -1;
                    LORelease();
                    if (lVar9 == 1) {
                      DataMemoryBarrier(2,1);
                      func_0x00525414(&uStack0000000000000038);
                    }
                  }
                  __Unwind_Resume(uVar6);
                  auVar19 = func_0x007a2668();
                  puVar5 = auVar19._8_8_;
                  lVar9 = *auVar19._0_8_;
                  uVar2 = *(ushort *)(lVar9 + 0x16a);
                  uVar10 = (ulong)uVar2;
                  if (uVar2 < 0xb) {
                    *(ushort *)(lVar9 + 0x16a) = uVar2 + 1;
                    lVar16 = lVar9 + uVar10 * 0x18;
                    uVar6 = *puVar5;
                    *(undefined8 *)(lVar16 + 0x10) = puVar5[1];
                    *(undefined8 *)(lVar16 + 8) = uVar6;
                    *(undefined8 *)(lVar16 + 0x18) = puVar5[2];
                    *(undefined8 *)(lVar9 + uVar10 * 8 + 0x110) = uVar7;
                    lVar16 = auVar19._0_8_[1];
                    *extraout_x8 = lVar9;
                    extraout_x8[1] = lVar16;
                    extraout_x8[2] = uVar10;
                    return;
                  }
                  puVar8 = &UNK_009e8358;
                  auVar19 = func_0x007a247c(&UNK_008a3b7e,0x20);
                  puVar5 = auVar19._8_8_;
                  lVar9 = *auVar19._0_8_;
                  uVar2 = *(ushort *)(lVar9 + 0x1c2);
                  uVar10 = (ulong)uVar2;
                  if (10 < uVar2) {
                    func_0x007a247c(&UNK_008a3b7e,0x20,&UNK_009e8358);
                    /* WARNING: Does not return */
                    pcVar3 = (code *)SoftwareBreakpoint(1,0x4f34d4);
                    (*pcVar3)();
                  }
                  *(ushort *)(lVar9 + 0x1c2) = uVar2 + 1;
                  puVar1 = (undefined8 *)(lVar9 + uVar10 * 0x20);
                  uVar6 = *puVar5;
                  uVar13 = puVar5[3];
                  uVar18 = puVar5[2];
                  puVar1[1] = puVar5[1];
                  *puVar1 = uVar6;
                  puVar1[3] = uVar13;
                  puVar1[2] = uVar18;
                  *(undefined **)(lVar9 + uVar10 * 8 + 0x168) = puVar8;
                  lVar16 = auVar19._0_8_[1];
                  *extraout_x8_00 = lVar9;
                  extraout_x8_00[1] = lVar16;
                  extraout_x8_00[2] = uVar10;
                  return;
                }
                puVar5[1] = 1;
                *puVar5 = 1;
                puVar5[2] = uVar13;
                puVar5[3] = lVar12;
                in_stack_00000040 = &UNK_009e99f0;
                in_stack_00000050 = uVar18;
                in_stack_00000048 = uVar6;
                lVar16 = 1;
                uStack0000000000000038 = puVar5;
                if (lVar12 != 0) {
                  lVar16 = func_0x00187bd0(lVar12,1);
                  if (lVar16 == 0) {
LAB_004f3268:
                    func_0x007a1f00(uVar14,lVar12,&UNK_009e80a0);
                    /* WARNING: Does not return */
                    pcVar3 = (code *)SoftwareBreakpoint(1,0x4f3280);
                    (*pcVar3)();
                  }
                }
                _memcpy(lVar16,uVar13,lVar12);
                in_stack_00000058 = lVar12;
                in_stack_00000060 = lVar16;
                in_stack_00000068 = lVar12;
                func_0x00517aa4();
                break;
              }
              unaff_x28 = unaff_x28 + 2;
              lVar17 = lVar17 + -0x10;
            } while (lVar17 != 0);
          }
          lVar16 = lVar15;
        } while (lVar15 != lVar9);
      }
    }
  }
  return;
}

