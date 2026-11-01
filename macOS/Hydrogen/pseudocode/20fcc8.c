
/* WARNING: Possible PIC construction at 0x0020fdf0: Changing call to branch */

void FUN_0020fcc8(void)

{
  ulong *puVar1;
  undefined1 uVar2;
  undefined2 uVar3;
  undefined2 uVar4;
  ulong uVar5;
  code *pcVar6;
  undefined8 uVar7;
  long lVar8;
  ulong uVar9;
  long lVar10;
  long lVar11;
  ulong uVar12;
  long *unaff_x19;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong unaff_x24;
  undefined2 uVar17;
  undefined8 uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  undefined1 auVar22 [16];
  undefined8 uStack_188;
  ulong uStack_150;
  undefined1 uStack_144;
  ulong uStack_140;
  ulong uStack_138;
  ulong uStack_130;
  undefined8 uStack_120;
  undefined8 uStack_118;
  undefined8 uStack_110;
  undefined4 uStack_108;
  undefined4 uStack_104;
  undefined4 uStack_100;
  ulong uStack_fc;
  undefined4 uStack_dc;
  undefined4 uStack_d8;
  undefined4 uStack_d4;
  undefined4 uStack_d0;
  undefined4 uStack_94;
  undefined4 uStack_90;
  undefined4 uStack_8c;
  undefined4 uStack_84;
  ulong uStack_80;
  ulong uStack_78;
  ulong uStack_70;
  
  uVar7 = func_0x007a2668();
  if (*unaff_x19 == 0) {
    func_0x00187bd4();
    __Unwind_Resume(uVar7);
    auVar22 = func_0x007a2668();
    auVar22._8_8_ = auVar22._8_8_;
    auVar22._0_8_ = auVar22._0_8_;
    uVar7 = 0;
    uVar12 = auVar22._8_8_[2];
    uVar5 = uVar12 * 0x70;
    auVar22._8_8_ = 0;
    auVar22._0_8_ = uVar12;
    if ((SUB168(auVar22 * ZEXT816(0x70),8) != 0) || (0x7ffffffffffffff8 < uVar5)) {
LAB_00210204:
      func_0x007a1f00(uVar7,uVar5,&UNK_009c64c0);
code_r0x00210218:
                    /* WARNING: Does not return */
      pcVar6 = (code *)SoftwareBreakpoint(1,0x21021c);
      (*pcVar6)();
    }
    lVar8 = auVar22._8_8_[1];
    if (uVar5 == 0) {
      uStack_138 = 0;
      uStack_130 = 8;
    }
    else {
      uVar7 = 8;
      uStack_130 = func_0x00187bd0(uVar5,8);
      if (uStack_130 == 0) goto LAB_00210204;
      uStack_138 = uVar12;
      if (uVar12 != 0) {
        uVar15 = 0;
        uVar16 = 0;
        uStack_188 = 1;
        do {
          if (uVar5 == uVar15) break;
          if (*(long *)(lVar8 + uVar15) == -0x8000000000000000) {
            lVar11 = lVar8 + uVar15;
            uVar19 = *(ulong *)(lVar11 + 0x18);
            uVar14 = uVar19;
            if ((long)uVar19 < 0) {
              uStack_188 = 0;
              goto LAB_002101ec;
            }
            uVar13 = (ulong)*(ushort *)(lVar11 + 0x20);
            uVar17 = *(undefined2 *)(lVar11 + 0x22);
            uVar7 = *(undefined8 *)(lVar11 + 0x10);
            if (uVar19 == 0) {
              uVar9 = 1;
            }
            else {
              uVar9 = func_0x00187bd0(uVar19,1);
              if (uVar9 == 0) goto LAB_002101ec;
            }
            _memcpy(uVar9,uVar7,uVar19);
            uVar14 = 0x8000000000000000;
            uVar20 = uVar19;
          }
          else {
            lVar11 = lVar8 + uVar15;
            uVar14 = *(ulong *)(lVar11 + 0x10);
            if ((long)uVar14 < 0) {
              uStack_188 = 0;
LAB_002101ec:
              func_0x007a1f00(uStack_188,uVar14,&UNK_009c24c0);
              goto code_r0x00210218;
            }
            uVar2 = *(undefined1 *)(lVar11 + 0x34);
            uVar3 = *(undefined2 *)(lVar11 + 0x30);
            uVar4 = *(undefined2 *)(lVar11 + 0x32);
            uVar7 = *(undefined8 *)(lVar11 + 8);
            if (uVar14 == 0) {
              uVar19 = 1;
            }
            else {
              uVar19 = func_0x00187bd0(uVar14,1);
              if (uVar19 == 0) goto LAB_002101ec;
            }
            _memcpy(uVar19,uVar7,uVar14);
            uVar7 = 0;
            uVar21 = *(ulong *)(lVar8 + uVar15 + 0x28);
            uVar9 = uVar21 * 8;
            if ((uVar21 >> 0x3d != 0) || (0x7ffffffffffffffe < uVar9)) {
LAB_002101c8:
              func_0x007a1f00(uVar7,uVar9,&UNK_009c24c0);
              goto code_r0x00210218;
            }
            uVar18 = *(undefined8 *)(lVar8 + uVar15 + 0x20);
            if (uVar9 == 0) {
              uVar20 = 0;
              uVar13 = 2;
            }
            else {
              uVar13 = func_0x00187bd0(uVar9,2);
              uVar7 = 2;
              if (uVar13 == 0) goto LAB_002101c8;
              uVar20 = uVar21;
            }
            _memcpy(uVar13,uVar18,uVar9);
            uStack_84 = CONCAT31(uStack_84._1_3_,uVar2);
            uStack_94 = (undefined4)(uVar13 >> 0x20);
            uStack_90 = (undefined4)uVar21;
            uStack_8c = (undefined4)(uVar21 >> 0x20);
            lVar11 = lVar8 + uVar15;
            uStack_144 = *(undefined1 *)(lVar11 + 0x68);
            if (*(long *)(lVar11 + 0x50) == -0x8000000000000000) {
              uStack_150 = *(ulong *)(lVar11 + 0x58);
              uStack_140 = 0x8000000000000000;
              unaff_x24 = *(ulong *)(lVar11 + 0x60);
            }
            else {
              func_0x0045cd08(&uStack_80);
              uStack_140 = uStack_80;
              uStack_150 = uStack_78;
              unaff_x24 = uStack_70;
            }
            func_0x001a310c(&uStack_80,lVar8 + uVar15 + 0x38,&UNK_009c6958);
            uVar17 = (undefined2)(uVar13 >> 0x10);
            uStack_118 = CONCAT26(uVar4,CONCAT24(uVar3,uStack_8c));
            uStack_120 = CONCAT44(uStack_90,uStack_94);
            uStack_d4 = (undefined4)uStack_78;
            uStack_d0 = (undefined4)(uStack_78 >> 0x20);
            uStack_dc = (undefined4)uStack_80;
            uStack_d8 = (undefined4)(uStack_80 >> 0x20);
            uStack_fc = uStack_70;
            uStack_110 = CONCAT44(uStack_dc,uStack_84);
            uStack_108 = uStack_d8;
            uStack_104 = uStack_d4;
            uVar9 = uVar14;
            uStack_100 = uStack_d0;
          }
          puVar1 = (ulong *)(uStack_130 + uVar15);
          *(undefined8 *)((long)puVar1 + 0x2c) = uStack_118;
          *(undefined8 *)((long)puVar1 + 0x24) = uStack_120;
          uVar16 = uVar16 + 1;
          *puVar1 = uVar14;
          puVar1[1] = uVar19;
          puVar1[2] = uVar9;
          puVar1[3] = uVar20;
          *(short *)(puVar1 + 4) = (short)uVar13;
          *(undefined2 *)((long)puVar1 + 0x22) = uVar17;
          *(ulong *)((long)puVar1 + 0x3c) = CONCAT44(uStack_104,uStack_108);
          *(undefined8 *)((long)puVar1 + 0x34) = uStack_110;
          puVar1[9] = uStack_fc;
          puVar1[8] = CONCAT44(uStack_100,uStack_104);
          puVar1[10] = uStack_140;
          puVar1[0xb] = uStack_150;
          puVar1[0xc] = unaff_x24;
          uVar15 = uVar15 + 0x70;
          *(undefined1 *)(puVar1 + 0xd) = uStack_144;
        } while (uVar12 != uVar16);
      }
    }
    auVar22._0_8_[1] = uStack_130;
    *auVar22._0_8_ = uStack_138;
    auVar22._0_8_[2] = uVar12;
    lVar11 = uVar12 + 1;
    lVar10 = lVar8;
    while (lVar11 = lVar11 + -1, lVar11 != 0) {
      func_0x0016af10(lVar10);
      lVar10 = lVar10 + 0x70;
    }
    if (*auVar22._8_8_ == 0) {
      return;
    }
    lVar11 = *auVar22._8_8_ * 0x70;
    uVar7 = 8;
  }
  else {
    lVar8 = unaff_x19[1];
    lVar11 = *unaff_x19 << 2;
    uVar7 = 2;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar8,lVar11,uVar7);
  return;
}

