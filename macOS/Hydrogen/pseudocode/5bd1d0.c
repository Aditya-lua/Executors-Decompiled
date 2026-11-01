
undefined8 FUN_005bd1d0(undefined8 param_1,undefined8 param_2,undefined8 param_3)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  byte *pbVar4;
  long lVar5;
  uint uVar6;
  uint uVar7;
  uint uVar8;
  undefined8 uVar9;
  undefined8 uVar10;
  undefined8 *puVar11;
  ulong uVar12;
  byte *pbVar13;
  ulong uVar14;
  byte *pbVar15;
  byte *pbVar16;
  undefined8 *unaff_x20;
  undefined8 unaff_x21;
  uint uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  ulong uVar22;
  ulong uVar23;
  byte bVar24;
  undefined1 auVar25 [16];
  int in_stack_00000000;
  undefined8 in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined1 uStack0000000000000018;
  int aiStack_c0 [2];
  ulong uStack_b8;
  undefined8 uStack_b0;
  ulong uStack_a8;
  undefined8 uStack_a0;
  long lStack_98;
  int aiStack_60 [2];
  ulong uStack_58;
  undefined8 uStack_50;
  ulong uStack_48;
  undefined8 uStack_40;
  long lStack_38;
  
  uVar9 = func_0x0079a108(param_1,8,param_3,&uStack0000000000000018);
  if (in_stack_00000000 != 1) {
    *unaff_x20 = unaff_x21;
    unaff_x20[1] = in_stack_00000008;
    return uVar9;
  }
  auVar25 = func_0x007a1f00(in_stack_00000008,in_stack_00000010);
  uVar9 = auVar25._8_8_;
  auVar25._0_8_ = auVar25._0_8_;
  uVar12 = *auVar25._0_8_;
  uVar14 = uVar12 * 2;
  if (uVar14 < 5) {
    uVar14 = 4;
  }
  if (uVar12 >> 0x3b == 0 && uVar14 * 0x10 < 0x7ffffffffffffffd) {
    uStack_40 = 0;
    if (uVar12 != 0) {
      uStack_48 = auVar25._0_8_[1];
      lStack_38 = uVar12 << 4;
      uStack_40 = 4;
    }
    uVar10 = func_0x0079a108(aiStack_60,4,uVar14 * 0x10,&uStack_48);
    if (aiStack_60[0] != 1) {
      *auVar25._0_8_ = uVar14;
      auVar25._0_8_[1] = uStack_58;
      return uVar10;
    }
  }
  else {
    func_0x007a1f00(0,uVar9,uVar9);
  }
  auVar25 = func_0x007a1f00(uStack_58,uStack_50,uVar9);
  uVar9 = auVar25._8_8_;
  auVar25._0_8_ = auVar25._0_8_;
  uVar12 = *auVar25._0_8_;
  uVar14 = uVar12 * 2;
  if (uVar14 < 5) {
    uVar14 = 4;
  }
  auVar25._8_8_ = 0;
  auVar25._0_8_ = uVar14;
  if (SUB168(auVar25 * ZEXT816(0x18),8) == 0) {
    uVar18 = 0;
    uVar10 = uVar9;
    if (0x7ffffffffffffff8 < uVar14 * 0x18) goto __ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E;
    uStack_a0 = 0;
    if (uVar12 != 0) {
      uStack_a8 = auVar25._0_8_[1];
      lStack_98 = uVar12 * 0x18;
      uStack_a0 = 8;
    }
    uVar10 = func_0x0079a108(aiStack_c0,8,uVar14 * 0x18,&uStack_a8);
    if (aiStack_c0[0] != 1) {
      *auVar25._0_8_ = uVar14;
      auVar25._0_8_[1] = uStack_b8;
      return uVar10;
    }
  }
  else {
    func_0x007a1f00(0,uVar9,uVar9);
  }
  uVar18 = uStack_b8;
  uVar10 = uStack_b0;
__ZN4core3fmt9Formatter3pad17h7d4ba6a805624737E:
  auVar25 = func_0x007a1f00(uVar18,uVar10,uVar9);
  puVar11 = auVar25._8_8_;
  pbVar4 = *(byte **)(auVar25._0_8_ + 8);
  pbVar16 = *(byte **)(auVar25._0_8_ + 0x10);
  uVar6 = *(uint *)(puVar11 + 2);
  if ((uVar6 & 0x18000000) != 0) {
    if ((uVar6 >> 0x1c & 1) == 0) {
      if (pbVar16 < (byte *)0x20) {
        if (pbVar16 == (byte *)0x0) {
          uVar14 = 0;
        }
        else {
          if ((byte *)0x7 < pbVar16) {
            pbVar13 = (byte *)((ulong)pbVar16 & 0x18);
            uVar9 = *(undefined8 *)pbVar4;
            uVar14 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x30)) & 1);
            uVar12 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x38)) & 1);
            uVar18 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x20)) & 1);
            uVar19 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x28)) & 1);
            uVar20 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x10)) & 1);
            uVar21 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x18)) & 1);
            uVar22 = (ulong)(-(-0x41 < (char)uVar9) & 1);
            uVar23 = (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 8)) & 1);
            if (pbVar13 != (byte *)0x8) {
              uVar9 = *(undefined8 *)(pbVar4 + 8);
              bVar24 = -(-0x41 < (char)((ulong)uVar9 >> 0x28));
              uVar14 = uVar14 + (-(-0x41 < (char)((ulong)uVar9 >> 0x30)) & 1);
              uVar12 = uVar12 + (-(-0x41 < (char)((ulong)uVar9 >> 0x38)) & 1);
              uVar18 = uVar18 + ((ulong)((uint6)CONCAT14(bVar24,(uint)CONCAT12(bVar24,(ushort)(byte)
                                                  -(-0x41 < (char)((ulong)uVar9 >> 0x20)))) &
                                        0xffff0000ffff) & 0xffffff01);
              uVar19 = uVar19 + ((ulong)bVar24 & 0xffffff01);
              uVar20 = uVar20 + (-(-0x41 < (char)((ulong)uVar9 >> 0x10)) & 1);
              uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar9 >> 0x18)) & 1);
              uVar22 = uVar22 + (-(-0x41 < (char)uVar9) & 1);
              uVar23 = uVar23 + (-(-0x41 < (char)((ulong)uVar9 >> 8)) & 1);
              if (pbVar13 != (byte *)0x10) {
                uVar9 = *(undefined8 *)(pbVar4 + 0x10);
                bVar24 = -(-0x41 < (char)((ulong)uVar9 >> 0x28));
                uVar14 = uVar14 + (-(-0x41 < (char)((ulong)uVar9 >> 0x30)) & 1);
                uVar12 = uVar12 + (-(-0x41 < (char)((ulong)uVar9 >> 0x38)) & 1);
                uVar18 = uVar18 + ((ulong)((uint6)CONCAT14(bVar24,(uint)CONCAT12(bVar24,(ushort)(
                                                  byte)-(-0x41 < (char)((ulong)uVar9 >> 0x20)))) &
                                          0xffff0000ffff) & 0xffffff01);
                uVar19 = uVar19 + ((ulong)bVar24 & 0xffffff01);
                uVar20 = uVar20 + (-(-0x41 < (char)((ulong)uVar9 >> 0x10)) & 1);
                uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar9 >> 0x18)) & 1);
                uVar22 = uVar22 + (-(-0x41 < (char)uVar9) & 1);
                uVar23 = uVar23 + (-(-0x41 < (char)((ulong)uVar9 >> 8)) & 1);
              }
            }
            uVar14 = uVar22 + uVar18 + uVar20 + uVar14 + uVar23 + uVar19 + uVar21 + uVar12;
            goto code_r0x00468ca4;
          }
          uVar14 = 0;
          pbVar13 = (byte *)0x0;
          do {
            if (-0x41 < (char)pbVar4[(long)pbVar13]) {
              uVar14 = uVar14 + 1;
            }
            pbVar13 = pbVar13 + 1;
code_r0x00468ca4:
          } while (pbVar16 != pbVar13);
        }
      }
      else {
        uVar14 = func_0x0046bd58(pbVar4,pbVar16);
      }
    }
    else {
      uVar14 = (ulong)*(ushort *)((long)puVar11 + 0x16);
      if (uVar14 == 0) {
        pbVar16 = (byte *)0x0;
        uVar12 = 0;
      }
      else {
        pbVar13 = pbVar4 + (long)pbVar16;
        pbVar16 = (byte *)0x0;
        uVar12 = uVar14;
        pbVar15 = pbVar4;
        do {
          if (pbVar15 == pbVar13) break;
          bVar24 = *pbVar15;
          pbVar3 = pbVar15 + 3;
          if (0xef < bVar24) {
            pbVar3 = pbVar15 + 4;
          }
          pbVar2 = pbVar15 + 2;
          if (0xdf < bVar24) {
            pbVar2 = pbVar3;
          }
          pbVar3 = pbVar15 + 1;
          if (((int)(char)bVar24 & 0x80000000U) != 0) {
            pbVar3 = pbVar2;
          }
          pbVar16 = pbVar3 + ((long)pbVar16 - (long)pbVar15);
          uVar12 = uVar12 - 1;
          pbVar15 = pbVar3;
        } while (uVar12 != 0);
      }
      uVar14 = uVar14 - uVar12;
    }
    if (uVar14 < *(ushort *)((long)puVar11 + 0x14)) {
      uVar7 = (uint)*(ushort *)((long)puVar11 + 0x14) - (int)uVar14;
      uVar17 = uVar6 >> 0x1d & 3;
      uVar8 = uVar7 >> 1 & 0x7fff;
      if (uVar17 != 2) {
        uVar8 = 0;
      }
      uVar1 = 0;
      if (uVar17 != 0) {
        uVar1 = uVar7;
      }
      if (uVar17 < 2) {
        uVar8 = uVar1;
      }
      uVar17 = 0;
      uVar9 = *puVar11;
      lVar5 = puVar11[1];
      do {
        if ((uVar8 & 0xffff) <= (uVar17 & 0xffff)) {
          uVar14 = (**(code **)(lVar5 + 0x18))(uVar9,pbVar4,pbVar16);
          if ((uVar14 & 1) != 0) {
            return 1;
          }
          uVar17 = 0;
          do {
            if ((uVar7 - uVar8 & 0xffff) <= (uVar17 & 0xffff)) {
              return 0;
            }
            uVar17 = uVar17 + 1;
            uVar14 = (**(code **)(lVar5 + 0x20))(uVar9,uVar6 & 0x1fffff);
          } while ((uVar14 & 1) == 0);
          return 1;
        }
        uVar17 = uVar17 + 1;
        uVar14 = (**(code **)(lVar5 + 0x20))(uVar9,uVar6 & 0x1fffff);
      } while ((uVar14 & 1) == 0);
      return 1;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar9 = (**(code **)(puVar11[1] + 0x18))(*puVar11,pbVar4,pbVar16);
  return uVar9;
}

