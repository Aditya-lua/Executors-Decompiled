
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_004f302c(undefined *param_1)

{
  ushort uVar1;
  code *pcVar2;
  int iVar3;
  undefined8 *puVar4;
  undefined8 *puVar5;
  undefined8 uVar6;
  undefined8 uVar7;
  undefined *puVar8;
  long lVar9;
  long *extraout_x8;
  long *extraout_x8_00;
  ulong uVar10;
  undefined8 *unaff_x19;
  long *plVar11;
  long lVar12;
  long unaff_x22;
  undefined8 uVar13;
  long unaff_x23;
  undefined8 uVar14;
  long lVar15;
  long lVar16;
  undefined8 *unaff_x25;
  long *unaff_x26;
  long lVar17;
  long *unaff_x28;
  undefined1 auVar18 [16];
  long in_stack_00000008;
  undefined8 *in_stack_00000010;
  undefined8 in_stack_00000020;
  undefined8 uStack0000000000000038;
  undefined *in_stack_00000040;
  undefined8 *puStack0000000000000048;
  undefined8 in_stack_00000050;
  long in_stack_00000058;
  long in_stack_00000060;
  long in_stack_00000068;
  
code_r0x004f302c:
  *(long **)(param_1 + (long)in_stack_00000010 * 8) = unaff_x26;
  in_stack_00000010 = (undefined8 *)((long)in_stack_00000010 + 1);
  puStack0000000000000048 = in_stack_00000010;
LAB_004f3040:
  puVar5 = unaff_x25;
  puVar8 = in_stack_00000040;
  puVar4 = uStack0000000000000038;
  unaff_x25 = puVar5 + 2;
  if (unaff_x25 != unaff_x19) {
    lVar9 = *(long *)(*(long *)(unaff_x22 + 0x10) + 0x90);
    if (lVar9 != 0) {
      unaff_x28 = *(long **)(*(long *)(unaff_x22 + 0x10) + 0x88);
      lVar9 = lVar9 * 600;
      uVar6 = *unaff_x25;
      lVar16 = puVar5[3];
      do {
        if ((unaff_x28[0x44] == lVar16) &&
           (iVar3 = _memcmp(unaff_x28[0x43],uVar6,lVar16), iVar3 == 0)) {
          if (unaff_x28[0x12] != 0) {
            unaff_x26 = unaff_x28 + 0x43;
            plVar11 = (long *)(unaff_x28[0x11] + 8);
            lVar9 = unaff_x28[0x12] << 4;
            goto LAB_004f30c0;
          }
          break;
        }
        unaff_x28 = unaff_x28 + 0x4b;
        lVar9 = lVar9 + -600;
      } while (lVar9 != 0);
    }
    goto LAB_004f3040;
  }
  for (lVar9 = 0; (long)in_stack_00000010 * 8 != lVar9; lVar9 = lVar9 + 8) {
    func_0x005172cc();
  }
  if (puVar4 != (undefined8 *)0x0) {
    func_0x00187bd4(puVar8,(long)puVar4 << 3,8);
  }
  func_0x005176dc();
  uVar6 = _UNK_008a36d8;
  puVar4 = _UNK_008a36d0;
  if (in_stack_00000020._4_1_ != '\0') {
    lVar9 = *(long *)(*(long *)(unaff_x22 + 0x10) + 0xd8);
    if (lVar9 != 0) {
      uVar13 = *(undefined8 *)(in_stack_00000008 + 0x218);
      lVar12 = *(long *)(in_stack_00000008 + 0x220);
      lVar16 = *(long *)(*(long *)(unaff_x22 + 0x10) + 0xd0);
      lVar9 = lVar16 + lVar9 * 0x60;
      if (lVar12 < 0) {
        do {
          if (*(long *)(lVar16 + 0x10) != 0) {
            plVar11 = (long *)(*(long *)(lVar16 + 8) + 8);
            lVar15 = *(long *)(lVar16 + 0x10) << 4;
            do {
              if ((*plVar11 == lVar12) && (iVar3 = _memcmp(plVar11[-1],uVar13,lVar12), iVar3 == 0))
              {
                uVar7 = *(undefined8 *)(lVar16 + 0x50);
                func_0x00517864();
                puVar4 = (undefined8 *)func_0x00187bd0(0x20,8);
                if (puVar4 != (undefined8 *)0x0) {
                  uVar14 = 0;
                  puVar4[1] = 1;
                  *puVar4 = 1;
                  puVar4[2] = uVar13;
                  puVar4[3] = lVar12;
                  in_stack_00000040 = &UNK_009e99f0;
                  in_stack_00000050 = _UNK_008a36d8;
                  puStack0000000000000048 = _UNK_008a36d0;
                  uStack0000000000000038 = puVar4;
code_r0x004f3268:
                  func_0x007a1f00(uVar14,lVar12,&UNK_009e80a0);
                    /* WARNING: Does not return */
                  pcVar2 = (code *)SoftwareBreakpoint(1,0x4f3280);
                  (*pcVar2)();
                }
code_r0x004f3390:
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
                auVar18 = func_0x007a2668();
                puVar4 = auVar18._8_8_;
                lVar9 = *auVar18._0_8_;
                uVar1 = *(ushort *)(lVar9 + 0x16a);
                uVar10 = (ulong)uVar1;
                if (uVar1 < 0xb) {
                  *(ushort *)(lVar9 + 0x16a) = uVar1 + 1;
                  lVar16 = lVar9 + uVar10 * 0x18;
                  uVar6 = *puVar4;
                  *(undefined8 *)(lVar16 + 0x10) = puVar4[1];
                  *(undefined8 *)(lVar16 + 8) = uVar6;
                  *(undefined8 *)(lVar16 + 0x18) = puVar4[2];
                  *(undefined8 *)(lVar9 + uVar10 * 8 + 0x110) = uVar7;
                  lVar16 = auVar18._0_8_[1];
                  *extraout_x8 = lVar9;
                  extraout_x8[1] = lVar16;
                  extraout_x8[2] = uVar10;
                  return;
                }
                puVar8 = &UNK_009e8358;
                auVar18 = func_0x007a247c(&UNK_008a3b7e,0x20);
                puVar4 = auVar18._8_8_;
                lVar9 = *auVar18._0_8_;
                uVar1 = *(ushort *)(lVar9 + 0x1c2);
                uVar10 = (ulong)uVar1;
                if (10 < uVar1) {
                  func_0x007a247c(&UNK_008a3b7e,0x20,&UNK_009e8358);
                    /* WARNING: Does not return */
                  pcVar2 = (code *)SoftwareBreakpoint(1,0x4f34d4);
                  (*pcVar2)();
                }
                *(ushort *)(lVar9 + 0x1c2) = uVar1 + 1;
                puVar5 = (undefined8 *)(lVar9 + uVar10 * 0x20);
                uVar6 = *puVar4;
                uVar7 = puVar4[3];
                uVar13 = puVar4[2];
                puVar5[1] = puVar4[1];
                *puVar5 = uVar6;
                puVar5[3] = uVar7;
                puVar5[2] = uVar13;
                *(undefined **)(lVar9 + uVar10 * 8 + 0x168) = puVar8;
                lVar16 = auVar18._0_8_[1];
                *extraout_x8_00 = lVar9;
                extraout_x8_00[1] = lVar16;
                extraout_x8_00[2] = uVar10;
                return;
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
                 (iVar3 = _memcmp(unaff_x28[-1],uVar13,lVar12), iVar3 == 0)) {
                uVar7 = *(undefined8 *)(lVar16 + 0x50);
                func_0x00517864();
                puVar5 = (undefined8 *)func_0x00187bd0(0x20,8);
                if (puVar5 == (undefined8 *)0x0) goto code_r0x004f3390;
                puVar5[1] = 1;
                *puVar5 = 1;
                puVar5[2] = uVar13;
                puVar5[3] = lVar12;
                in_stack_00000040 = &UNK_009e99f0;
                in_stack_00000050 = uVar6;
                puStack0000000000000048 = puVar4;
                lVar16 = 1;
                uStack0000000000000038 = puVar5;
                if (lVar12 != 0) {
                  lVar16 = func_0x00187bd0(lVar12,1);
                  if (lVar16 == 0) goto code_r0x004f3268;
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
  while( true ) {
    plVar11 = plVar11 + 2;
    lVar9 = lVar9 + -0x10;
    if (lVar9 == 0) break;
LAB_004f30c0:
    if ((*plVar11 == unaff_x23) && (iVar3 = _memcmp(plVar11[-1]), iVar3 == 0)) {
      if (in_stack_00000010 == uStack0000000000000038) {
        func_0x0050c238(&uStack0000000000000038,&UNK_009e82e8);
      }
      param_1 = in_stack_00000040;
      goto code_r0x004f302c;
    }
  }
  goto LAB_004f3040;
}

