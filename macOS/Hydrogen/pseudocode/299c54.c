
void FUN_00299c54(ulong param_1,undefined8 param_2,undefined8 param_3,ulong param_4,long param_5,
                 ulong *param_6,code *param_7)

{
  ulong *puVar1;
  undefined4 uVar2;
  undefined1 uVar3;
  bool bVar4;
  code *pcVar5;
  ulong *puVar6;
  ulong *puVar7;
  ulong in_x9;
  ulong uVar8;
  ulong uVar9;
  undefined8 *puVar10;
  ulong uVar11;
  undefined8 *puVar12;
  ulong uVar13;
  long lVar14;
  long lVar15;
  long unaff_x19;
  ulong *puVar16;
  long unaff_x24;
  long unaff_x25;
  ulong uVar17;
  ulong unaff_x26;
  ulong uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  undefined8 uVar25;
  undefined1 auVar26 [16];
  undefined1 auVar27 [16];
  long in_stack_00000018;
  undefined8 uStack_d0;
  ulong uStack_c8;
  long lStack_b8;
  
  if (param_1 != in_x9) {
    if (((uint)param_1 >> 3 & 1) == 0) {
      uVar18 = unaff_x25 + in_x9;
    }
    else {
      uVar17 = param_1 & 0xfffffffffffffff8;
      uVar18 = unaff_x25 + uVar17;
      lVar15 = in_x9 - uVar17;
      if (0xf < unaff_x26) {
        unaff_x26 = 0x10;
      }
      lVar14 = in_x9 + unaff_x26;
      do {
        *(undefined8 *)(unaff_x19 + lVar14) = *(undefined8 *)(unaff_x24 + lVar14);
        lVar14 = lVar14 + 8;
        lVar15 = lVar15 + 8;
      } while (lVar15 != 0);
      if (param_1 == uVar17) goto LAB_00299cb8;
    }
    do {
      *(undefined1 *)(unaff_x19 + uVar18) = *(undefined1 *)(unaff_x24 + uVar18);
      bVar4 = uVar18 < 0xf;
      uVar18 = uVar18 + 1;
    } while (bVar4);
  }
LAB_00299cb8:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == in_stack_00000018) {
    return;
  }
  auVar26 = ___stack_chk_fail();
  puVar7 = auVar26._8_8_;
  lVar15 = auVar26._0_8_;
  if ((param_5 == 0) || (param_6 == (ulong *)0x0)) {
    func_0x0079d898();
  }
  else {
    if (param_4 == 0) {
      return;
    }
    if ((lVar15 != 0) && (puVar7 != (ulong *)0x0)) {
      if (param_4 < 0x10) {
        puVar7 = param_6;
      }
      else {
        uVar18 = 0;
        puVar6 = param_6;
        uVar17 = param_4;
        puVar16 = puVar7;
        do {
          puVar1 = (ulong *)((long)puVar7 + uVar18);
          *puVar1 = *puVar6 ^ *(ulong *)(lVar15 + uVar18);
          puVar1[1] = puVar6[1] ^ ((ulong *)(lVar15 + uVar18))[1];
          (*param_7)(puVar1,puVar1,param_5);
          uVar17 = uVar17 - 0x10;
          uVar18 = uVar18 + 0x10;
          puVar6 = puVar16;
          puVar16 = puVar16 + 2;
        } while (0xf < uVar17);
        puVar6 = (ulong *)((long)puVar7 + uVar18 + -0x10);
        if (param_4 == uVar18) goto code_r0x00299e60;
        auVar26._8_8_ = (long)puVar7 + uVar18;
        auVar26._0_8_ = lVar15 + uVar18;
        puVar7 = puVar6;
        param_4 = uVar17;
      }
      puVar6 = auVar26._8_8_;
      uVar18 = 0;
      uVar17 = param_4;
      if (param_4 < 0x10) {
        uVar17 = 0xf;
      }
      do {
        uVar8 = uVar18;
        *(byte *)((long)puVar6 + uVar8) =
             *(byte *)((long)puVar7 + uVar8) ^ *(byte *)(auVar26._0_8_ + uVar8);
        uVar18 = uVar8 + 1;
      } while (param_4 != uVar18);
      if (uVar8 < 0xf) {
        uVar8 = (uVar17 - param_4) + 1;
        if ((uVar8 < 8) || ((ulong)((long)puVar6 - (long)puVar7) < 0x40)) {
          uVar9 = param_4;
        }
        else {
          if (uVar8 < 0x40) {
            uVar11 = 0;
          }
          else {
            uVar11 = uVar8 & 0xffffffffffffffc0;
            puVar10 = (undefined8 *)((long)puVar6 + param_4 + 0x20);
            puVar12 = (undefined8 *)((long)puVar7 + param_4 + 0x20);
            uVar9 = uVar11;
            do {
              uVar19 = puVar12[-4];
              uVar21 = puVar12[-1];
              uVar20 = puVar12[-2];
              uVar23 = puVar12[1];
              uVar22 = *puVar12;
              uVar25 = puVar12[3];
              uVar24 = puVar12[2];
              puVar10[-3] = puVar12[-3];
              puVar10[-4] = uVar19;
              puVar10[-1] = uVar21;
              puVar10[-2] = uVar20;
              puVar10[1] = uVar23;
              *puVar10 = uVar22;
              puVar10[3] = uVar25;
              puVar10[2] = uVar24;
              uVar9 = uVar9 - 0x40;
              puVar10 = puVar10 + 8;
              puVar12 = puVar12 + 8;
            } while (uVar9 != 0);
            if (uVar8 == uVar11) goto code_r0x00299e50;
            if ((uVar8 & 0x38) == 0) {
              uVar9 = param_4 + uVar11;
              goto code_r0x00299e34;
            }
          }
          uVar13 = uVar8 & 0xfffffffffffffff8;
          uVar9 = param_4 + uVar13;
          lVar15 = uVar11 - uVar13;
          puVar10 = (undefined8 *)((long)puVar7 + uVar11 + param_4);
          puVar12 = (undefined8 *)((long)puVar6 + uVar11 + param_4);
          do {
            *puVar12 = *puVar10;
            lVar15 = lVar15 + 8;
            puVar10 = puVar10 + 1;
            puVar12 = puVar12 + 1;
          } while (lVar15 != 0);
          if (uVar8 == uVar13) goto code_r0x00299e50;
        }
code_r0x00299e34:
        do {
          *(undefined1 *)((long)puVar6 + uVar9) = *(undefined1 *)((long)puVar7 + uVar9);
          uVar9 = uVar9 + 1;
        } while ((uVar17 - param_4) + uVar18 + 1 != uVar9);
      }
code_r0x00299e50:
      (*param_7)(puVar6,puVar6,param_5);
code_r0x00299e60:
      uVar18 = *puVar6;
      param_6[1] = puVar6[1];
      *param_6 = uVar18;
      return;
    }
  }
  auVar27 = func_0x0079d8c0();
  auVar27._8_8_ = auVar27._8_8_;
  auVar27._0_8_ = auVar27._0_8_;
  lStack_b8 = *(long *)PTR____stack_chk_guard_009b01e8;
  if ((param_5 == 0) || (param_6 == (ulong *)0x0)) {
    func_0x0079d820();
    pcVar5 = param_7;
code_r0x0029a1e0:
    func_0x0079d848();
code_r0x0029a1e4:
    func_0x0079d870();
    goto LAB_0029a1e8;
  }
  pcVar5 = param_7;
  if (param_4 == 0) goto LAB_0029a120;
  if ((auVar27._0_8_ == (undefined1 *)0x0) || (auVar27._8_8_ == (undefined1 *)0x0))
  goto code_r0x0029a1e0;
  if ((auVar27._0_8_ < auVar27._8_8_) && (auVar27._8_8_ < auVar27._0_8_ + param_4))
  goto code_r0x0029a1e4;
  if ((auVar27._0_8_ < auVar27._8_8_) ||
     ((undefined1 *)((long)&MACH_HEADER.reserved + 3) < auVar27._0_8_ &&
      auVar27._8_8_ <= auVar27._0_8_ + -0x20)) {
    if (param_4 < 0x10) {
      param_6[1] = param_6[1];
      *param_6 = *param_6;
      puVar7 = param_6;
    }
    else {
      puVar6 = param_6;
      do {
        puVar16 = auVar27._8_8_;
        puVar7 = auVar27._0_8_;
        (*param_7)(puVar7,puVar16,param_5);
        *puVar16 = *puVar6 ^ *puVar16;
        param_4 = param_4 - 0x10;
        puVar16[1] = puVar6[1] ^ puVar16[1];
        auVar27._8_8_ = puVar16 + 2;
        auVar27._0_8_ = puVar7 + 2;
        puVar6 = puVar7;
      } while (0xf < param_4);
      uVar18 = *puVar7;
      param_6[1] = puVar7[1];
      *param_6 = uVar18;
    }
    if (param_4 != 0) goto LAB_0029a074;
  }
  else {
    puVar7 = (ulong *)0x0;
    if (0xf < param_4) {
      do {
        puVar16 = auVar27._8_8_;
        puVar6 = auVar27._0_8_;
        (*param_7)(puVar6,&uStack_d0,param_5);
        uVar18 = *puVar6;
        *puVar16 = *param_6 ^ uStack_d0;
        *param_6 = uVar18;
        puVar7 = (ulong *)puVar6[1];
        puVar16[1] = param_6[1] ^ uStack_c8;
        param_6[1] = (ulong)puVar7;
        param_4 = param_4 - 0x10;
        auVar27._8_8_ = puVar16 + 2;
        auVar27._0_8_ = puVar6 + 2;
      } while (0xf < param_4);
      if (param_4 == 0) goto LAB_0029a120;
    }
LAB_0029a074:
    lVar15 = auVar27._0_8_;
    (*param_7)(puVar7,lVar15,&uStack_d0,param_5);
    uVar18 = param_4;
    if (param_4 < 0x10) {
      uVar18 = 0xf;
    }
    uVar17 = 0xffffffffffffffff;
    do {
      uVar3 = *(undefined1 *)(lVar15 + uVar17 + 1);
      *(byte *)(auVar27._8_8_ + uVar17 + 1) =
           *(byte *)((long)param_6 + uVar17 + 1) ^ *(byte *)((long)&uStack_d0 + uVar17 + 1);
      *(undefined1 *)((long)param_6 + uVar17 + 1) = uVar3;
      uVar17 = uVar17 + 1;
    } while (uVar17 - param_4 != -1);
    if (uVar17 < 0xf) {
      uVar8 = (uVar18 - param_4) + 1;
      if ((uVar8 < 8) || ((ulong)((long)param_6 - lVar15) < 0x40)) {
        uVar9 = param_4;
      }
      else {
        if (uVar8 < 0x40) {
          uVar11 = 0;
        }
        else {
          uVar11 = uVar8 & 0xffffffffffffffc0;
          puVar10 = (undefined8 *)((long)param_6 + param_4 + 0x20);
          puVar12 = (undefined8 *)(lVar15 + param_4 + 0x20);
          uVar9 = uVar11;
          do {
            uVar19 = puVar12[-4];
            uVar21 = puVar12[-1];
            uVar20 = puVar12[-2];
            uVar23 = puVar12[1];
            uVar22 = *puVar12;
            uVar25 = puVar12[3];
            uVar24 = puVar12[2];
            puVar10[-3] = puVar12[-3];
            puVar10[-4] = uVar19;
            puVar10[-1] = uVar21;
            puVar10[-2] = uVar20;
            puVar10[1] = uVar23;
            *puVar10 = uVar22;
            puVar10[3] = uVar25;
            puVar10[2] = uVar24;
            uVar9 = uVar9 - 0x40;
            puVar10 = puVar10 + 8;
            puVar12 = puVar12 + 8;
          } while (uVar9 != 0);
          if (uVar8 == uVar11) goto LAB_0029a120;
          if ((uVar8 & 0x38) == 0) {
            uVar9 = param_4 + uVar11;
            goto LAB_0029a104;
          }
        }
        uVar13 = uVar8 & 0xfffffffffffffff8;
        uVar9 = param_4 + uVar13;
        lVar14 = uVar11 - uVar13;
        puVar10 = (undefined8 *)(lVar15 + param_4 + uVar11);
        puVar12 = (undefined8 *)((long)param_6 + param_4 + uVar11);
        do {
          *puVar12 = *puVar10;
          lVar14 = lVar14 + 8;
          puVar10 = puVar10 + 1;
          puVar12 = puVar12 + 1;
        } while (lVar14 != 0);
        if (uVar8 == uVar13) goto LAB_0029a120;
      }
LAB_0029a104:
      do {
        *(undefined1 *)((long)param_6 + uVar9) = *(undefined1 *)(lVar15 + uVar9);
        uVar9 = uVar9 + 1;
      } while ((uVar18 - param_4) + uVar17 + 2 != uVar9);
    }
  }
LAB_0029a120:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == lStack_b8) {
    return;
  }
LAB_0029a1e8:
  ___stack_chk_fail();
  uVar2 = *(undefined4 *)pcVar5;
  func_0x0029a230();
  *(undefined4 *)pcVar5 = uVar2;
  return;
}

