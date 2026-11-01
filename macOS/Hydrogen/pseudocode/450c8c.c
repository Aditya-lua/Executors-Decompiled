
undefined8 FUN_00450c8c(undefined8 *param_1,byte *param_2,byte *param_3)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  long lVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  undefined8 uVar8;
  ulong uVar9;
  byte *pbVar10;
  byte *pbVar11;
  uint uVar12;
  ulong uVar13;
  ulong uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  byte bVar20;
  
  uVar5 = *(uint *)(param_1 + 2);
  if ((uVar5 & 0x18000000) != 0) {
    if ((uVar5 >> 0x1c & 1) == 0) {
      if (param_3 < (byte *)0x20) {
        if (param_3 == (byte *)0x0) {
          uVar9 = 0;
        }
        else {
          if ((byte *)0x7 < param_3) {
            pbVar10 = (byte *)((ulong)param_3 & 0x18);
            uVar8 = *(undefined8 *)param_2;
            uVar9 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
            uVar13 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
            uVar14 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x20)) & 1);
            uVar15 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x28)) & 1);
            uVar16 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
            uVar17 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
            uVar18 = (ulong)(-(-0x41 < (char)uVar8) & 1);
            uVar19 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
            if (pbVar10 != (byte *)0x8) {
              uVar8 = *(undefined8 *)(param_2 + 8);
              bVar20 = -(-0x41 < (char)((ulong)uVar8 >> 0x28));
              uVar9 = uVar9 + (-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
              uVar13 = uVar13 + (-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
              uVar14 = uVar14 + ((ulong)((uint6)CONCAT14(bVar20,(uint)CONCAT12(bVar20,(ushort)(byte)
                                                  -(-0x41 < (char)((ulong)uVar8 >> 0x20)))) &
                                        0xffff0000ffff) & 0xffffff01);
              uVar15 = uVar15 + ((ulong)bVar20 & 0xffffff01);
              uVar16 = uVar16 + (-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
              uVar17 = uVar17 + (-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
              uVar18 = uVar18 + (-(-0x41 < (char)uVar8) & 1);
              uVar19 = uVar19 + (-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
              if (pbVar10 != (byte *)0x10) {
                uVar8 = *(undefined8 *)(param_2 + 0x10);
                bVar20 = -(-0x41 < (char)((ulong)uVar8 >> 0x28));
                uVar9 = uVar9 + (-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
                uVar13 = uVar13 + (-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
                uVar14 = uVar14 + ((ulong)((uint6)CONCAT14(bVar20,(uint)CONCAT12(bVar20,(ushort)(
                                                  byte)-(-0x41 < (char)((ulong)uVar8 >> 0x20)))) &
                                          0xffff0000ffff) & 0xffffff01);
                uVar15 = uVar15 + ((ulong)bVar20 & 0xffffff01);
                uVar16 = uVar16 + (-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
                uVar17 = uVar17 + (-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
                uVar18 = uVar18 + (-(-0x41 < (char)uVar8) & 1);
                uVar19 = uVar19 + (-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
              }
            }
            uVar9 = uVar18 + uVar14 + uVar16 + uVar9 + uVar19 + uVar15 + uVar17 + uVar13;
            goto code_r0x00468ca4;
          }
          uVar9 = 0;
          pbVar10 = (byte *)0x0;
          do {
            if (-0x41 < (char)param_2[(long)pbVar10]) {
              uVar9 = uVar9 + 1;
            }
            pbVar10 = pbVar10 + 1;
code_r0x00468ca4:
          } while (param_3 != pbVar10);
        }
      }
      else {
        uVar9 = func_0x0046bd58(param_2,param_3);
      }
    }
    else {
      uVar9 = (ulong)*(ushort *)((long)param_1 + 0x16);
      if (uVar9 == 0) {
        param_3 = (byte *)0x0;
        uVar13 = 0;
      }
      else {
        pbVar10 = param_2 + (long)param_3;
        param_3 = (byte *)0x0;
        uVar13 = uVar9;
        pbVar11 = param_2;
        do {
          if (pbVar11 == pbVar10) break;
          bVar20 = *pbVar11;
          pbVar3 = pbVar11 + 3;
          if (0xef < bVar20) {
            pbVar3 = pbVar11 + 4;
          }
          pbVar2 = pbVar11 + 2;
          if (0xdf < bVar20) {
            pbVar2 = pbVar3;
          }
          pbVar3 = pbVar11 + 1;
          if (((int)(char)bVar20 & 0x80000000U) != 0) {
            pbVar3 = pbVar2;
          }
          param_3 = pbVar3 + ((long)param_3 - (long)pbVar11);
          uVar13 = uVar13 - 1;
          pbVar11 = pbVar3;
        } while (uVar13 != 0);
      }
      uVar9 = uVar9 - uVar13;
    }
    if (uVar9 < *(ushort *)((long)param_1 + 0x14)) {
      uVar6 = (uint)*(ushort *)((long)param_1 + 0x14) - (int)uVar9;
      uVar12 = uVar5 >> 0x1d & 3;
      uVar7 = uVar6 >> 1 & 0x7fff;
      if (uVar12 != 2) {
        uVar7 = 0;
      }
      uVar1 = 0;
      if (uVar12 != 0) {
        uVar1 = uVar6;
      }
      if (uVar12 < 2) {
        uVar7 = uVar1;
      }
      uVar12 = 0;
      uVar8 = *param_1;
      lVar4 = param_1[1];
      do {
        if ((uVar7 & 0xffff) <= (uVar12 & 0xffff)) {
          uVar9 = (**(code **)(lVar4 + 0x18))(uVar8,param_2,param_3);
          if ((uVar9 & 1) != 0) {
            return 1;
          }
          uVar12 = 0;
          do {
            if ((uVar6 - uVar7 & 0xffff) <= (uVar12 & 0xffff)) {
              return 0;
            }
            uVar12 = uVar12 + 1;
            uVar9 = (**(code **)(lVar4 + 0x20))(uVar8,uVar5 & 0x1fffff);
          } while ((uVar9 & 1) == 0);
          return 1;
        }
        uVar12 = uVar12 + 1;
        uVar9 = (**(code **)(lVar4 + 0x20))(uVar8,uVar5 & 0x1fffff);
      } while ((uVar9 & 1) == 0);
      return 1;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar8 = (**(code **)(param_1[1] + 0x18))(*param_1,param_2,param_3);
  return uVar8;
}

