
/* WARNING: Possible PIC construction at 0x00450d3c: Changing call to branch */
/* WARNING: Removing unreachable block (ram,0x00450d40) */

undefined8 FUN_00450cb8(byte *param_1,undefined8 *param_2)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  undefined8 uVar7;
  byte *pbVar8;
  ulong uVar9;
  byte *pbVar10;
  byte *pbVar11;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  byte *pbVar12;
  undefined8 unaff_x21;
  undefined8 unaff_x22;
  undefined8 unaff_x23;
  undefined8 unaff_x24;
  undefined8 unaff_x25;
  uint uVar13;
  undefined8 unaff_x26;
  long unaff_x29;
  long lVar14;
  undefined8 unaff_x30;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  byte bVar22;
  undefined1 uStack0000000000000008;
  byte *in_stack_00000010;
  byte *in_stack_00000018;
  undefined8 uStack0000000000000020;
  undefined8 in_stack_00000028;
  undefined8 *in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 uStack0000000000000050;
  undefined *in_stack_00000058;
  undefined1 uStack0000000000000080;
  
  lVar14 = (long)register0x00000008 + 0x70;
  uVar9 = (ulong)*param_1;
  if (uVar9 < 10) {
    register0x00000008 = (BADSPACEBASE *)&uStack0000000000000080;
    pbVar8 = *(byte **)(&UNK_009de540 + uVar9 * 8);
    pbVar12 = *(byte **)(&UNK_0088f8b8 + uVar9 * 8);
    lVar14 = unaff_x29;
  }
  else {
    in_stack_00000058 =
         &
         __ZN4core3fmt3num3imp51__LT_impl_u20_core__fmt__Display_u20_for_u20_u8_GT_3fmt17hfd8690bfb522e88cE
    ;
    uStack0000000000000020 = &UNK_009dcea0;
    in_stack_00000028 = 1;
    in_stack_00000038 = 1;
    in_stack_00000040 = 0;
    in_stack_00000030 = &uStack0000000000000050;
    uStack0000000000000050 = param_1;
    func_0x00459f08(&uStack0000000000000008,&uStack0000000000000020);
    unaff_x30 = 0x450d40;
    pbVar8 = in_stack_00000010;
    pbVar12 = in_stack_00000018;
    unaff_x19 = param_2;
  }
  *(undefined8 *)((long)register0x00000008 + -0x50) = unaff_x26;
  *(undefined8 *)((long)register0x00000008 + -0x48) = unaff_x25;
  *(undefined8 *)((long)register0x00000008 + -0x40) = unaff_x24;
  *(undefined8 *)((long)register0x00000008 + -0x38) = unaff_x23;
  *(undefined8 *)((long)register0x00000008 + -0x30) = unaff_x22;
  *(undefined8 *)((long)register0x00000008 + -0x28) = unaff_x21;
  *(undefined8 *)((long)register0x00000008 + -0x20) = unaff_x20;
  *(undefined8 **)((long)register0x00000008 + -0x18) = unaff_x19;
  *(long *)((long)register0x00000008 + -0x10) = lVar14;
  *(undefined8 *)((long)register0x00000008 + -8) = unaff_x30;
  uVar4 = *(uint *)(param_2 + 2);
  if ((uVar4 & 0x18000000) != 0) {
    if ((uVar4 >> 0x1c & 1) == 0) {
      if (pbVar12 < (byte *)0x20) {
        if (pbVar12 == (byte *)0x0) {
          uVar9 = 0;
        }
        else {
          if ((byte *)0x7 < pbVar12) {
            pbVar10 = (byte *)((ulong)pbVar12 & 0x18);
            uVar7 = *(undefined8 *)pbVar8;
            uVar9 = (ulong)(-(-0x41 < (char)((ulong)uVar7 >> 0x30)) & 1);
            uVar15 = (ulong)(-(-0x41 < (char)((ulong)uVar7 >> 0x38)) & 1);
            uVar16 = (ulong)(-(-0x41 < (char)((ulong)uVar7 >> 0x20)) & 1);
            uVar17 = (ulong)(-(-0x41 < (char)((ulong)uVar7 >> 0x28)) & 1);
            uVar18 = (ulong)(-(-0x41 < (char)((ulong)uVar7 >> 0x10)) & 1);
            uVar19 = (ulong)(-(-0x41 < (char)((ulong)uVar7 >> 0x18)) & 1);
            uVar20 = (ulong)(-(-0x41 < (char)uVar7) & 1);
            uVar21 = (ulong)(-(-0x41 < (char)((ulong)uVar7 >> 8)) & 1);
            if (pbVar10 != (byte *)0x8) {
              uVar7 = *(undefined8 *)(pbVar8 + 8);
              bVar22 = -(-0x41 < (char)((ulong)uVar7 >> 0x28));
              uVar9 = uVar9 + (-(-0x41 < (char)((ulong)uVar7 >> 0x30)) & 1);
              uVar15 = uVar15 + (-(-0x41 < (char)((ulong)uVar7 >> 0x38)) & 1);
              uVar16 = uVar16 + ((ulong)((uint6)CONCAT14(bVar22,(uint)CONCAT12(bVar22,(ushort)(byte)
                                                  -(-0x41 < (char)((ulong)uVar7 >> 0x20)))) &
                                        0xffff0000ffff) & 0xffffff01);
              uVar17 = uVar17 + ((ulong)bVar22 & 0xffffff01);
              uVar18 = uVar18 + (-(-0x41 < (char)((ulong)uVar7 >> 0x10)) & 1);
              uVar19 = uVar19 + (-(-0x41 < (char)((ulong)uVar7 >> 0x18)) & 1);
              uVar20 = uVar20 + (-(-0x41 < (char)uVar7) & 1);
              uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar7 >> 8)) & 1);
              if (pbVar10 != (byte *)0x10) {
                uVar7 = *(undefined8 *)(pbVar8 + 0x10);
                bVar22 = -(-0x41 < (char)((ulong)uVar7 >> 0x28));
                uVar9 = uVar9 + (-(-0x41 < (char)((ulong)uVar7 >> 0x30)) & 1);
                uVar15 = uVar15 + (-(-0x41 < (char)((ulong)uVar7 >> 0x38)) & 1);
                uVar16 = uVar16 + ((ulong)((uint6)CONCAT14(bVar22,(uint)CONCAT12(bVar22,(ushort)(
                                                  byte)-(-0x41 < (char)((ulong)uVar7 >> 0x20)))) &
                                          0xffff0000ffff) & 0xffffff01);
                uVar17 = uVar17 + ((ulong)bVar22 & 0xffffff01);
                uVar18 = uVar18 + (-(-0x41 < (char)((ulong)uVar7 >> 0x10)) & 1);
                uVar19 = uVar19 + (-(-0x41 < (char)((ulong)uVar7 >> 0x18)) & 1);
                uVar20 = uVar20 + (-(-0x41 < (char)uVar7) & 1);
                uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar7 >> 8)) & 1);
              }
            }
            uVar9 = uVar20 + uVar16 + uVar18 + uVar9 + uVar21 + uVar17 + uVar19 + uVar15;
            goto code_r0x00468ca4;
          }
          uVar9 = 0;
          pbVar10 = (byte *)0x0;
          do {
            if (-0x41 < (char)pbVar8[(long)pbVar10]) {
              uVar9 = uVar9 + 1;
            }
            pbVar10 = pbVar10 + 1;
code_r0x00468ca4:
          } while (pbVar12 != pbVar10);
        }
      }
      else {
        uVar9 = func_0x0046bd58(pbVar8,pbVar12);
      }
    }
    else {
      uVar9 = (ulong)*(ushort *)((long)param_2 + 0x16);
      if (uVar9 == 0) {
        pbVar12 = (byte *)0x0;
        uVar15 = 0;
      }
      else {
        pbVar10 = pbVar8 + (long)pbVar12;
        pbVar12 = (byte *)0x0;
        uVar15 = uVar9;
        pbVar11 = pbVar8;
        do {
          if (pbVar11 == pbVar10) break;
          bVar22 = *pbVar11;
          pbVar3 = pbVar11 + 3;
          if (0xef < bVar22) {
            pbVar3 = pbVar11 + 4;
          }
          pbVar2 = pbVar11 + 2;
          if (0xdf < bVar22) {
            pbVar2 = pbVar3;
          }
          pbVar3 = pbVar11 + 1;
          if (((int)(char)bVar22 & 0x80000000U) != 0) {
            pbVar3 = pbVar2;
          }
          pbVar12 = pbVar3 + ((long)pbVar12 - (long)pbVar11);
          uVar15 = uVar15 - 1;
          pbVar11 = pbVar3;
        } while (uVar15 != 0);
      }
      uVar9 = uVar9 - uVar15;
    }
    if (uVar9 < *(ushort *)((long)param_2 + 0x14)) {
      uVar5 = (uint)*(ushort *)((long)param_2 + 0x14) - (int)uVar9;
      uVar13 = uVar4 >> 0x1d & 3;
      uVar6 = uVar5 >> 1 & 0x7fff;
      if (uVar13 != 2) {
        uVar6 = 0;
      }
      uVar1 = 0;
      if (uVar13 != 0) {
        uVar1 = uVar5;
      }
      if (uVar13 < 2) {
        uVar6 = uVar1;
      }
      uVar13 = 0;
      uVar7 = *param_2;
      lVar14 = param_2[1];
      do {
        if ((uVar6 & 0xffff) <= (uVar13 & 0xffff)) {
          uVar9 = (**(code **)(lVar14 + 0x18))(uVar7,pbVar8,pbVar12);
          if ((uVar9 & 1) != 0) {
            return 1;
          }
          uVar13 = 0;
          do {
            if ((uVar5 - uVar6 & 0xffff) <= (uVar13 & 0xffff)) {
              return 0;
            }
            uVar13 = uVar13 + 1;
            uVar9 = (**(code **)(lVar14 + 0x20))(uVar7,uVar4 & 0x1fffff);
          } while ((uVar9 & 1) == 0);
          return 1;
        }
        uVar13 = uVar13 + 1;
        uVar9 = (**(code **)(lVar14 + 0x20))(uVar7,uVar4 & 0x1fffff);
      } while ((uVar9 & 1) == 0);
      return 1;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar7 = (**(code **)(param_2[1] + 0x18))(*param_2,pbVar8,pbVar12);
  return uVar7;
}

