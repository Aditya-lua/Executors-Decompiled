
void FUN_004e634c(void)

{
  code *pcVar1;
  int iVar2;
  undefined8 uVar3;
  long *plVar4;
  long *extraout_x8;
  long *extraout_x8_00;
  long *extraout_x8_01;
  long *plVar5;
  long lVar6;
  undefined8 *puVar7;
  long unaff_x20;
  long *unaff_x21;
  long lVar8;
  long lVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  long unaff_x23;
  ulong uVar13;
  undefined8 uVar14;
  undefined8 *unaff_x26;
  undefined8 *unaff_x27;
  undefined8 *puVar15;
  long unaff_x28;
  undefined1 auVar16 [16];
  undefined8 *puStack0000000000000008;
  long in_stack_00000018;
  long *in_stack_00000020;
  undefined8 uStack0000000000000028;
  undefined8 *in_stack_00000030;
  long in_stack_00000038;
  undefined8 uStack_130;
  long lStack_128;
  long *plStack_120;
  long lStack_118;
  long lStack_a8;
  long *plStack_a0;
  long lStack_98;
  long lStack_90;
  long lStack_88;
  long lStack_80;
  undefined8 uStack_78;
  long lStack_70;
  undefined *puStack_68;
  long lStack_58;
  long *plStack_50;
  long lStack_48;
  long lStack_40;
  long lStack_38;
  long lStack_30;
  
  do {
    puVar15 = unaff_x27 + 2;
    *unaff_x21 = (long)puVar15;
    iVar2 = func_0x005175a8();
    if ((iVar2 != 0) && (*(long *)(unaff_x28 + 0x90) != 0)) {
      uVar3 = *unaff_x27;
      lVar9 = unaff_x27[1];
      puVar7 = (undefined8 *)(*(long *)(unaff_x28 + 0x88) + 0x218);
      lVar10 = *(long *)(unaff_x28 + 0x90) * 600;
      do {
        if ((puVar7[1] == lVar9) && (iVar2 = _memcmp(*puVar7,uVar3,lVar9), iVar2 == 0)) {
          if ((*(byte *)(puVar7 + 7) >> 2 & 1) == 0) {
            puStack0000000000000008 = (undefined8 *)func_0x00187bd0(0x40,8);
            if (puStack0000000000000008 == (undefined8 *)0x0) {
              uVar3 = func_0x007a1f00(8,0x40);
              if (uStack0000000000000028 != 0) {
                in_stack_00000018 = 8;
                func_0x00187bd4(in_stack_00000030,uStack0000000000000028 << 4);
              }
              auVar16 = __Unwind_Resume(uVar3);
              lVar11 = auVar16._8_8_;
              lVar6 = auVar16._0_8_;
              do {
                lVar12 = lVar6;
                lVar6 = lVar12 + 600;
                if (lVar12 == lVar11) {
                  *extraout_x8 = 0;
                  extraout_x8[1] = 8;
                  extraout_x8[2] = 0;
                  return;
                }
              } while ((*(long *)(lVar12 + 0x228) == 0) && (*(int *)(lVar12 + 0x248) == 0x110000));
              lStack_40 = lVar9;
              lStack_38 = unaff_x23 + 0x780;
              lStack_30 = lVar10;
              plVar4 = (long *)func_0x00187bd0(0x20,8);
              if (plVar4 != (long *)0x0) {
                *plVar4 = lVar12;
                lStack_58 = 4;
                lVar9 = 1;
                plStack_50 = plVar4;
                while( true ) {
                  lVar10 = lVar6;
                  if (lVar10 == lVar11) break;
                  lVar6 = lVar10 + 600;
                  if ((*(long *)(lVar10 + 0x228) != 0) || (*(int *)(lVar10 + 0x248) != 0x110000)) {
                    if (lVar9 == lStack_58) {
                      lStack_48 = lVar9;
                      func_0x007a5594(&lStack_58,lVar9,1,8,8);
                      plVar4 = plStack_50;
                    }
                    plVar4[lVar9] = lVar10;
                    lVar9 = lVar9 + 1;
                  }
                }
                extraout_x8[1] = (long)plStack_50;
                *extraout_x8 = lStack_58;
                extraout_x8[2] = lVar9;
                return;
              }
              lVar10 = in_stack_00000018;
              uVar3 = func_0x007a1f00(8,0x20);
              if (lStack_58 != 0) {
                lVar10 = 8;
                func_0x00187bd4(plStack_50,lStack_58 << 3);
              }
              auVar16 = __Unwind_Resume(uVar3);
              puStack_68 = &DAT_004e671c;
              lVar12 = auVar16._0_8_;
              do {
                lVar8 = lVar12;
                if (lVar8 == auVar16._8_8_) {
                  *extraout_x8_00 = 0;
                  extraout_x8_00[1] = 8;
                  extraout_x8_00[2] = 0;
                  return;
                }
                lVar12 = lVar8 + 600;
              } while ((*(long *)(lVar8 + 0x228) != 0) || (*(int *)(lVar8 + 0x248) != 0x110000));
              lStack_90 = lVar6;
              lStack_88 = in_stack_00000018;
              lStack_80 = lVar11;
              uStack_78 = uVar3;
              lStack_70 = (long)register0x00000008 + -0x10;
              plVar4 = (long *)func_0x00187bd0(0x20,8);
              if (plVar4 != (long *)0x0) {
                *plVar4 = lVar8;
                lStack_a8 = 4;
                lStack_98 = 1;
                plStack_a0 = plVar4;
                lVar9 = lStack_98;
                while (lVar10 = lVar12, lVar10 != auVar16._8_8_) {
                  lVar12 = lVar10 + 600;
                  if ((*(long *)(lVar10 + 0x228) == 0) && (*(int *)(lVar10 + 0x248) == 0x110000)) {
                    if (lVar9 == lStack_a8) {
                      lStack_98 = lVar9;
                      func_0x007a5594(&lStack_a8,lVar9,1,8,8);
                      plVar4 = plStack_a0;
                    }
                    plVar4[lVar9] = lVar10;
                    lVar9 = lVar9 + 1;
                  }
                }
                extraout_x8_00[1] = (long)plStack_a0;
                *extraout_x8_00 = lStack_a8;
                extraout_x8_00[2] = lVar9;
                return;
              }
              uVar3 = func_0x007a1f00(8,0x20,lVar10);
              if (lStack_a8 != 0) {
                lVar10 = 8;
                func_0x00187bd4(plStack_a0,lStack_a8 << 3,8);
              }
              auVar16 = __Unwind_Resume(uVar3);
              lVar6 = auVar16._0_8_;
              do {
                lVar11 = lVar6;
                if (lVar11 == auVar16._8_8_) {
                  *extraout_x8_01 = 0;
                  extraout_x8_01[1] = 8;
                  extraout_x8_01[2] = 0;
                  return;
                }
                lVar6 = lVar11 + 0x48;
              } while ((*(byte *)(lVar11 + 0x40) & 1) != 0);
              lVar12 = *(long *)(lVar11 + 0x38);
              if (lVar12 < 0) {
                uVar14 = 0;
code_r0x004e6a5c:
                func_0x007a1f00(uVar14,lVar12,&UNK_009e7fe0);
                lVar10 = lVar9;
code_r0x004e6a70:
                lVar12 = lVar10;
                uStack_130 = 0;
code_r0x004e6a7c:
                func_0x007a1f00(uStack_130,lVar12,&UNK_009e7fe0);
code_r0x004e6a90:
                    /* WARNING: Does not return */
                pcVar1 = (code *)SoftwareBreakpoint(1,0x4e6a94);
                (*pcVar1)();
              }
              if (lVar12 == 0) {
                lVar11 = 1;
                plVar4 = (long *)func_0x00187bd0(0x60,8);
              }
              else {
                uVar3 = *(undefined8 *)(lVar11 + 0x30);
                uVar14 = 1;
                lVar11 = func_0x00187bd0(lVar12,1);
                lVar9 = lVar10;
                if (lVar11 == 0) goto code_r0x004e6a5c;
                _memcpy(lVar11,uVar3,lVar12);
                plVar4 = (long *)func_0x00187bd0(0x60,8);
              }
              if (plVar4 == (long *)0x0) {
                func_0x007a1f00(8,0x60,lVar10);
                goto code_r0x004e6a90;
              }
              *plVar4 = lVar12;
              plVar4[1] = lVar11;
              plVar4[2] = lVar12;
              uStack_130 = 1;
              lStack_128 = 4;
              lVar9 = 1;
              plStack_120 = plVar4;
              do {
                do {
                  lVar11 = lVar6;
                  if (lVar11 == auVar16._8_8_) {
                    extraout_x8_01[1] = (long)plStack_120;
                    *extraout_x8_01 = lStack_128;
                    extraout_x8_01[2] = lVar9;
                    return;
                  }
                  lVar6 = lVar11 + 0x48;
                } while ((*(byte *)(lVar11 + 0x40) & 1) != 0);
                lVar12 = *(long *)(lVar11 + 0x38);
                lStack_118 = lVar9;
                if (lVar12 < 0) goto code_r0x004e6a70;
                if (lVar12 == 0) {
                  lVar10 = 1;
                }
                else {
                  uVar3 = *(undefined8 *)(lVar11 + 0x30);
                  lVar10 = func_0x00187bd0(lVar12,1);
                  if (lVar10 == 0) goto code_r0x004e6a7c;
                  _memcpy(lVar10,uVar3,lVar12);
                }
                if (lVar9 == lStack_128) {
                  func_0x007a5594(&lStack_128,lVar9,1,8,0x18);
                  plVar4 = plStack_120;
                }
                plVar5 = plVar4 + lVar9 * 3;
                *plVar5 = lVar12;
                plVar5[1] = lVar10;
                plVar5[2] = lVar12;
                lVar9 = lVar9 + 1;
              } while( true );
            }
            *puStack0000000000000008 = uVar3;
            puStack0000000000000008[1] = lVar9;
            uStack0000000000000028 = 4;
            in_stack_00000038 = 1;
            in_stack_00000030 = puStack0000000000000008;
            if (puVar15 != unaff_x26) goto LAB_004e6414;
            goto code_r0x004e6538;
          }
          break;
        }
        puVar7 = puVar7 + 0x4b;
        lVar10 = lVar10 + -600;
      } while (lVar10 != 0);
    }
    unaff_x27 = puVar15;
    if (puVar15 == unaff_x26) {
      *in_stack_00000020 = 0;
      in_stack_00000020[1] = 8;
      in_stack_00000020[2] = 0;
      return;
    }
  } while( true );
LAB_004e6414:
  lVar9 = in_stack_00000038;
  lVar10 = *(long *)(unaff_x20 + 0x50);
  if (lVar10 == 0) {
code_r0x004e6538:
    in_stack_00000020[1] = (long)in_stack_00000030;
    *in_stack_00000020 = uStack0000000000000028;
    in_stack_00000020[2] = in_stack_00000038;
    return;
  }
  lVar6 = *(long *)(unaff_x20 + 0x48);
  puVar7 = puVar15;
code_r0x004e6438:
  uVar13 = 0;
  puVar15 = puVar7 + 2;
  uVar3 = *puVar7;
  lVar12 = puVar7[1];
  lVar11 = 0x61;
  plVar4 = (long *)(lVar6 + 8);
  lVar8 = lVar10 << 4;
  do {
    if ((*plVar4 == lVar12) && (iVar2 = _memcmp(plVar4[-1],uVar3,lVar12), iVar2 == 0)) {
      if (*(ulong *)(unaff_x20 + 0x68) <= uVar13) {
        func_0x007a2570(uVar13,*(ulong *)(unaff_x20 + 0x68),&UNK_009e9b68);
                    /* WARNING: Does not return */
        pcVar1 = (code *)SoftwareBreakpoint(1,0x4e6594);
        (*pcVar1)();
      }
      if ((*(char *)(*(long *)(unaff_x20 + 0x60) + lVar11) != '\0') &&
         (*(long *)(unaff_x28 + 0x90) != 0)) {
        puVar7 = (undefined8 *)(*(long *)(unaff_x28 + 0x88) + 0x218);
        lVar11 = *(long *)(unaff_x28 + 0x90) * 600;
        goto LAB_004e64c0;
      }
      break;
    }
    plVar4 = plVar4 + 2;
    lVar11 = lVar11 + 0x68;
    uVar13 = uVar13 + 1;
    lVar8 = lVar8 + -0x10;
  } while (lVar8 != 0);
  goto LAB_004e6430;
  while( true ) {
    puVar7 = puVar7 + 0x4b;
    lVar11 = lVar11 + -600;
    if (lVar11 == 0) break;
LAB_004e64c0:
    if ((puVar7[1] == lVar12) && (iVar2 = _memcmp(*puVar7,uVar3,lVar12), iVar2 == 0)) {
      if ((*(byte *)(puVar7 + 7) >> 2 & 1) == 0) {
        if (lVar9 == uStack0000000000000028) {
          func_0x007a5594(&uStack0000000000000028,lVar9,1,8,0x10);
          puStack0000000000000008 = in_stack_00000030;
        }
        puStack0000000000000008[lVar9 * 2] = uVar3;
        (puStack0000000000000008 + lVar9 * 2)[1] = lVar12;
        in_stack_00000038 = lVar9 + 1;
        if (puVar15 == unaff_x26) goto code_r0x004e6538;
        goto LAB_004e6414;
      }
      break;
    }
  }
LAB_004e6430:
  puVar7 = puVar15;
  if (puVar15 == unaff_x26) goto code_r0x004e6538;
  goto code_r0x004e6438;
}

