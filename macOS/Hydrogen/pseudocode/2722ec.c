
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_002722ec(long *param_1,byte *param_2)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  byte bVar4;
  byte bVar5;
  uint uVar6;
  code *pcVar7;
  long lVar8;
  undefined8 uVar9;
  byte *pbVar10;
  long lVar11;
  undefined8 *puVar12;
  ulong uVar13;
  uint uVar14;
  long *extraout_x8;
  undefined8 *extraout_x8_00;
  uint uVar15;
  long unaff_x20;
  long unaff_x22;
  undefined1 uVar16;
  uint uVar17;
  uint uVar18;
  uint uVar19;
  undefined1 auVar20 [16];
  undefined8 uStack0000000000000008;
  long in_stack_00000010;
  long lStack0000000000000018;
  long lStack_c8;
  long lStack_c0;
  long lStack_b8;
  long lStack_48;
  long lStack_40;
  long lStack_38;
  
  if (unaff_x22 == 0) {
    in_stack_00000010 = 1;
    lVar8 = in_stack_00000010;
  }
  else {
    lVar8 = func_0x00187bd0();
    if (lVar8 == 0) {
      uVar9 = func_0x007a1f00(1);
      if (uStack0000000000000008 != 0) {
        func_0x00187bd4(in_stack_00000010,uStack0000000000000008,1);
      }
      pbVar10 = (byte *)__Unwind_Resume(uVar9);
      lVar8 = func_0x00187bd0(0x40,1);
      if (lVar8 != 0) {
        lStack_48 = 0x40;
        lStack_38 = 0;
        lStack_40 = lVar8;
        do {
          lVar8 = lStack_38;
          bVar5 = *pbVar10;
          if (lStack_38 == lStack_48) {
            func_0x0079cf14(&lStack_48,lStack_38,1,1,1);
          }
          bVar4 = bVar5 >> 4 | 0x30;
          if (0x9f < bVar5) {
            bVar4 = (bVar5 >> 4) + 0x57;
          }
          *(byte *)(lStack_40 + lStack_38) = bVar4;
          lStack_38 = lVar8 + 1;
          if (lStack_38 == lStack_48) {
            func_0x0079cf14(&lStack_48,lStack_38,1,1,1);
          }
          bVar4 = bVar5 & 0xf | 0x30;
          if (9 < (bVar5 & 0xf)) {
            bVar4 = (bVar5 & 0xf) + 0x57;
          }
          *(byte *)(lStack_40 + lStack_38) = bVar4;
          lStack_38 = lVar8 + 2;
          pbVar10 = pbVar10 + 1;
        } while (lStack_38 != 0x40);
        extraout_x8[1] = lStack_40;
        *extraout_x8 = lStack_48;
        extraout_x8[2] = 0x40;
        return;
      }
      uVar9 = func_0x007a1f00(1,0x40,&UNK_009cc598);
      if (lStack_48 != 0) {
        func_0x00187bd4(lStack_40,lStack_48,1);
      }
      auVar20 = __Unwind_Resume(uVar9);
      uVar13 = auVar20._8_8_;
      pbVar10 = auVar20._0_8_;
      lVar8 = (uVar13 >> 1) + 1;
      if (lVar8 < 0) {
        uVar9 = 0;
      }
      else {
        uVar9 = 1;
        lVar11 = func_0x00187bd0(lVar8,1);
        if (lVar11 != 0) {
          lStack_b8 = 0;
          lStack_c8 = lVar8;
          lStack_c0 = lVar11;
          if (uVar13 != 0) {
            uVar17 = 0;
            uVar18 = 0;
            pbVar3 = pbVar10 + uVar13;
            do {
              lVar8 = lStack_b8;
              uVar15 = (uint)(char)*pbVar10;
              uVar14 = (uint)*pbVar10;
              if (-1 < (int)uVar15) {
                uVar15 = uVar14 - 0x30;
                pbVar10 = pbVar10 + 1;
                if (uVar15 < 10 || (uVar14 & 0x1fffdf) - 0x41 < 6) goto code_r0x002726f0;
code_r0x00272830:
                puVar12 = (undefined8 *)func_0x00187bd0(0x12,1);
                if (puVar12 != (undefined8 *)0x0) {
                  *(undefined2 *)(puVar12 + 2) = 0x676e;
                  uVar9 = _UNK_0082ce78;
                  puVar12[1] = _UNK_0082ce80;
                  *puVar12 = uVar9;
                  extraout_x8_00[2] = puVar12;
                  extraout_x8_00[3] = 0x12;
                  uVar9 = _UNK_0082cc80;
                  extraout_x8_00[1] = _UNK_0082cc88;
                  *extraout_x8_00 = uVar9;
                  if (lStack_c8 == 0) {
                    return;
                  }
                  func_0x00187bd4(lStack_c0,lStack_c8,1);
                  return;
                }
                goto code_r0x00272910;
              }
              pbVar2 = pbVar10 + 1;
              uVar19 = *pbVar2 & 0x3f;
              if (uVar14 < 0xe0) {
                pbVar10 = pbVar10 + 2;
                uVar6 = (uVar14 & 0x1f) << 6;
                uVar14 = uVar19 | uVar6;
                uVar15 = uVar14 - 0x30;
                if (uVar15 < 10 || (*pbVar2 & 0x1f | uVar6) - 0x41 < 6) goto code_r0x002726f0;
                goto code_r0x00272830;
              }
              pbVar2 = pbVar10 + 2;
              uVar19 = uVar19 << 6;
              uVar6 = *pbVar2 & 0x3f | uVar19;
              if (uVar14 < 0xf0) {
                pbVar10 = pbVar10 + 3;
                uVar1 = (uVar15 & 0x1f) << 0xc;
                uVar14 = uVar6 | uVar1;
                uVar15 = uVar14 - 0x30;
                if (uVar15 < 10 || (*pbVar2 & 0x1f | uVar19 | uVar1) - 0x41 < 6)
                goto code_r0x002726f0;
                goto code_r0x00272830;
              }
              pbVar2 = pbVar10 + 3;
              pbVar10 = pbVar10 + 4;
              uVar6 = uVar6 << 6;
              uVar19 = (uVar15 & 7) << 0x12;
              uVar14 = *pbVar2 & 0x3f | uVar6 | uVar19;
              uVar15 = uVar14 - 0x30;
              if (9 < uVar15 && 5 < (*pbVar2 & 0x1f | uVar6 | uVar19) - 0x41) goto code_r0x00272830;
code_r0x002726f0:
              uVar19 = (uVar14 - 0x41 & 0xffffffdf) + 10;
              if (uVar14 < 0x3a) {
                uVar19 = uVar15;
              }
              if (0xf < uVar19) {
code_r0x002728e8:
                func_0x007a23bc(&UNK_009cc5c8);
                goto code_r0x00272924;
              }
              if ((uVar18 & 1) == 0) {
                uVar17 = uVar19 << 4;
                uVar16 = (undefined1)uVar17;
                if (pbVar10 != pbVar3) {
                  uVar15 = (uint)(char)*pbVar10;
                  uVar14 = (uint)*pbVar10;
                  pbVar2 = pbVar10 + 1;
                  if ((int)uVar15 < 0) {
                    if (uVar14 < 0xe0) {
                      uVar14 = pbVar10[1] & 0x3f | (uVar14 & 0x1f) << 6;
                      pbVar2 = pbVar10 + 2;
                    }
                    else {
                      uVar19 = pbVar10[2] & 0x3f | (pbVar10[1] & 0x3f) << 6;
                      if (uVar14 < 0xf0) {
                        uVar14 = uVar19 | (uVar15 & 0x1f) << 0xc;
                        pbVar2 = pbVar10 + 3;
                      }
                      else {
                        uVar14 = pbVar10[3] & 0x3f | uVar19 << 6 | (uVar15 & 7) << 0x12;
                        pbVar2 = pbVar10 + 4;
                      }
                    }
                  }
                  pbVar10 = pbVar2;
                  if ((9 < uVar14 - 0x30) && (5 < (uVar14 & 0x1fffdf) - 0x41))
                  goto code_r0x00272830;
                  uVar19 = (uVar14 - 0x41 & 0xffffffdf) + 10;
                  if (uVar14 < 0x3a) {
                    uVar19 = uVar14 - 0x30;
                  }
                  if (0xf < uVar19) goto code_r0x002728e8;
                  uVar18 = uVar18 | 1;
                  goto code_r0x002727ec;
                }
code_r0x00272888:
                lVar8 = lStack_b8;
                if (lStack_b8 == lStack_c8) {
                  func_0x00458a18(&lStack_c8,&UNK_009cc5f8);
                }
                *(undefined1 *)(lStack_c0 + lVar8) = uVar16;
                lStack_b8 = lVar8 + 1;
                break;
              }
code_r0x002727ec:
              if (lStack_b8 == lStack_c8) {
                func_0x00458a18(&lStack_c8,&UNK_009cc5e0);
              }
              uVar17 = uVar17 | uVar19;
              uVar16 = (undefined1)uVar17;
              *(undefined1 *)(lStack_c0 + lVar8) = uVar16;
              lStack_b8 = lVar8 + 1;
              if (uVar18 == 0xffffffff) goto code_r0x00272888;
              uVar18 = uVar18 + 1;
            } while (pbVar10 != pbVar3);
          }
          extraout_x8_00[2] = lStack_c0;
          extraout_x8_00[1] = lStack_c8;
          extraout_x8_00[3] = lStack_b8;
          *extraout_x8_00 = 0;
          return;
        }
      }
      func_0x007a1f00(uVar9,lVar8,&UNK_009cc5b0);
code_r0x00272910:
      func_0x007a1f00(1,0x12,&UNK_009cc568);
code_r0x00272924:
                    /* WARNING: Does not return */
      pcVar7 = (code *)SoftwareBreakpoint(1,0x272928);
      (*pcVar7)();
    }
  }
  lStack0000000000000018 = 0;
  uStack0000000000000008 = unaff_x22;
  if (unaff_x20 != 0) {
    lStack0000000000000018 = 0;
    do {
      bVar5 = *param_2;
      if (lStack0000000000000018 == uStack0000000000000008) {
        func_0x0079cf14(&uStack0000000000000008,lStack0000000000000018,1,1,1);
      }
      bVar4 = bVar5 >> 4 | 0x30;
      if (0x9f < bVar5) {
        bVar4 = (bVar5 >> 4) + 0x57;
      }
      *(byte *)(lVar8 + lStack0000000000000018) = bVar4;
      lVar11 = lStack0000000000000018 + 1;
      if (lVar11 == uStack0000000000000008) {
        func_0x0079cf14(&uStack0000000000000008,lVar11,1,1,1);
      }
      bVar4 = bVar5 & 0xf | 0x30;
      if (9 < (bVar5 & 0xf)) {
        bVar4 = (bVar5 & 0xf) + 0x57;
      }
      *(byte *)(lVar8 + lVar11) = bVar4;
      lStack0000000000000018 = lStack0000000000000018 + 2;
      unaff_x20 = unaff_x20 + -1;
      param_2 = param_2 + 1;
    } while (unaff_x20 != 0);
  }
  param_1[1] = lVar8;
  *param_1 = uStack0000000000000008;
  param_1[2] = lStack0000000000000018;
  return;
}

