
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00272580(void)

{
  uint uVar1;
  byte *pbVar2;
  long lVar3;
  byte *pbVar4;
  uint uVar5;
  code *pcVar6;
  long lVar7;
  undefined8 *puVar8;
  ulong uVar9;
  uint uVar10;
  undefined8 *extraout_x8;
  uint uVar11;
  byte *pbVar12;
  undefined1 uVar13;
  uint uVar14;
  undefined8 uVar15;
  uint uVar16;
  uint uVar17;
  undefined1 auVar18 [16];
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  long lStack_78;
  long lStack_70;
  long lStack_68;
  
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008,1);
  }
  auVar18 = __Unwind_Resume();
  uVar9 = auVar18._8_8_;
  pbVar12 = auVar18._0_8_;
  lVar3 = (uVar9 >> 1) + 1;
  if (lVar3 < 0) {
    uVar15 = 0;
  }
  else {
    uVar15 = 1;
    lVar7 = func_0x00187bd0(lVar3,1);
    if (lVar7 != 0) {
      lStack_68 = 0;
      lStack_78 = lVar3;
      lStack_70 = lVar7;
      if (uVar9 != 0) {
        uVar14 = 0;
        uVar16 = 0;
        pbVar4 = pbVar12 + uVar9;
        do {
          lVar3 = lStack_68;
          uVar11 = (uint)(char)*pbVar12;
          uVar10 = (uint)*pbVar12;
          if (-1 < (int)uVar11) {
            uVar11 = uVar10 - 0x30;
            pbVar12 = pbVar12 + 1;
            if (uVar11 < 10 || (uVar10 & 0x1fffdf) - 0x41 < 6) goto code_r0x002726f0;
code_r0x00272830:
            puVar8 = (undefined8 *)func_0x00187bd0(0x12,1);
            if (puVar8 != (undefined8 *)0x0) {
              *(undefined2 *)(puVar8 + 2) = 0x676e;
              uVar15 = _UNK_0082ce78;
              puVar8[1] = _UNK_0082ce80;
              *puVar8 = uVar15;
              extraout_x8[2] = puVar8;
              extraout_x8[3] = 0x12;
              uVar15 = _UNK_0082cc80;
              extraout_x8[1] = _UNK_0082cc88;
              *extraout_x8 = uVar15;
              if (lStack_78 == 0) {
                return;
              }
              func_0x00187bd4(lStack_70,lStack_78,1);
              return;
            }
            goto code_r0x00272910;
          }
          pbVar2 = pbVar12 + 1;
          uVar17 = *pbVar2 & 0x3f;
          if (uVar10 < 0xe0) {
            pbVar12 = pbVar12 + 2;
            uVar5 = (uVar10 & 0x1f) << 6;
            uVar10 = uVar17 | uVar5;
            uVar11 = uVar10 - 0x30;
            if (uVar11 < 10 || (*pbVar2 & 0x1f | uVar5) - 0x41 < 6) goto code_r0x002726f0;
            goto code_r0x00272830;
          }
          pbVar2 = pbVar12 + 2;
          uVar17 = uVar17 << 6;
          uVar5 = *pbVar2 & 0x3f | uVar17;
          if (uVar10 < 0xf0) {
            pbVar12 = pbVar12 + 3;
            uVar1 = (uVar11 & 0x1f) << 0xc;
            uVar10 = uVar5 | uVar1;
            uVar11 = uVar10 - 0x30;
            if (uVar11 < 10 || (*pbVar2 & 0x1f | uVar17 | uVar1) - 0x41 < 6) goto code_r0x002726f0;
            goto code_r0x00272830;
          }
          pbVar2 = pbVar12 + 3;
          pbVar12 = pbVar12 + 4;
          uVar5 = uVar5 << 6;
          uVar17 = (uVar11 & 7) << 0x12;
          uVar10 = *pbVar2 & 0x3f | uVar5 | uVar17;
          uVar11 = uVar10 - 0x30;
          if (9 < uVar11 && 5 < (*pbVar2 & 0x1f | uVar5 | uVar17) - 0x41) goto code_r0x00272830;
code_r0x002726f0:
          uVar17 = (uVar10 - 0x41 & 0xffffffdf) + 10;
          if (uVar10 < 0x3a) {
            uVar17 = uVar11;
          }
          if (0xf < uVar17) {
code_r0x002728e8:
            func_0x007a23bc(&UNK_009cc5c8);
            goto code_r0x00272924;
          }
          if ((uVar16 & 1) == 0) {
            uVar14 = uVar17 << 4;
            uVar13 = (undefined1)uVar14;
            if (pbVar12 != pbVar4) {
              uVar11 = (uint)(char)*pbVar12;
              uVar10 = (uint)*pbVar12;
              pbVar2 = pbVar12 + 1;
              if ((int)uVar11 < 0) {
                if (uVar10 < 0xe0) {
                  uVar10 = pbVar12[1] & 0x3f | (uVar10 & 0x1f) << 6;
                  pbVar2 = pbVar12 + 2;
                }
                else {
                  uVar17 = pbVar12[2] & 0x3f | (pbVar12[1] & 0x3f) << 6;
                  if (uVar10 < 0xf0) {
                    uVar10 = uVar17 | (uVar11 & 0x1f) << 0xc;
                    pbVar2 = pbVar12 + 3;
                  }
                  else {
                    uVar10 = pbVar12[3] & 0x3f | uVar17 << 6 | (uVar11 & 7) << 0x12;
                    pbVar2 = pbVar12 + 4;
                  }
                }
              }
              pbVar12 = pbVar2;
              if ((9 < uVar10 - 0x30) && (5 < (uVar10 & 0x1fffdf) - 0x41)) goto code_r0x00272830;
              uVar17 = (uVar10 - 0x41 & 0xffffffdf) + 10;
              if (uVar10 < 0x3a) {
                uVar17 = uVar10 - 0x30;
              }
              if (0xf < uVar17) goto code_r0x002728e8;
              uVar16 = uVar16 | 1;
              goto code_r0x002727ec;
            }
code_r0x00272888:
            lVar3 = lStack_68;
            if (lStack_68 == lStack_78) {
              func_0x00458a18(&lStack_78,&UNK_009cc5f8);
            }
            *(undefined1 *)(lStack_70 + lVar3) = uVar13;
            lStack_68 = lVar3 + 1;
            break;
          }
code_r0x002727ec:
          if (lStack_68 == lStack_78) {
            func_0x00458a18(&lStack_78,&UNK_009cc5e0);
          }
          uVar14 = uVar14 | uVar17;
          uVar13 = (undefined1)uVar14;
          *(undefined1 *)(lStack_70 + lVar3) = uVar13;
          lStack_68 = lVar3 + 1;
          if (uVar16 == 0xffffffff) goto code_r0x00272888;
          uVar16 = uVar16 + 1;
        } while (pbVar12 != pbVar4);
      }
      extraout_x8[2] = lStack_70;
      extraout_x8[1] = lStack_78;
      extraout_x8[3] = lStack_68;
      *extraout_x8 = 0;
      return;
    }
  }
  func_0x007a1f00(uVar15,lVar3,&UNK_009cc5b0);
code_r0x00272910:
  func_0x007a1f00(1,0x12,&UNK_009cc568);
code_r0x00272924:
                    /* WARNING: Does not return */
  pcVar6 = (code *)SoftwareBreakpoint(1,0x272928);
  (*pcVar6)();
}

