
undefined8 FUN_0045e50c(undefined8 *param_1,char *param_2)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  long lVar4;
  uint uVar5;
  uint uVar6;
  uint uVar7;
  undefined8 uVar8;
  byte *pbVar9;
  byte *pbVar10;
  ulong uVar11;
  byte *pbVar12;
  byte *pbVar13;
  uint uVar14;
  ulong uVar15;
  ulong uVar16;
  ulong uVar17;
  ulong uVar18;
  ulong uVar19;
  ulong uVar20;
  ulong uVar21;
  byte bVar22;
  
  if (*param_2 == '\x01') {
    pbVar9 = &UNK_00892c6f;
    pbVar10 = (byte *)0x15;
  }
  else {
    pbVar9 = &UNK_00892c4b;
    pbVar10 = (byte *)0x24;
  }
  uVar5 = *(uint *)(param_1 + 2);
  if ((uVar5 & 0x18000000) != 0) {
    if ((uVar5 >> 0x1c & 1) == 0) {
      if (pbVar10 < (byte *)0x20) {
        if (pbVar10 == (byte *)0x0) {
          uVar11 = 0;
        }
        else {
          if ((byte *)0x7 < pbVar10) {
            pbVar12 = (byte *)((ulong)pbVar10 & 0x18);
            uVar8 = *(undefined8 *)pbVar9;
            uVar11 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
            uVar15 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
            uVar16 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x20)) & 1);
            uVar17 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x28)) & 1);
            uVar18 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
            uVar19 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
            uVar20 = (ulong)(-(-0x41 < (char)uVar8) & 1);
            uVar21 = (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
            if (pbVar12 != (byte *)0x8) {
              uVar8 = *(undefined8 *)(pbVar9 + 8);
              bVar22 = -(-0x41 < (char)((ulong)uVar8 >> 0x28));
              uVar11 = uVar11 + (-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
              uVar15 = uVar15 + (-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
              uVar16 = uVar16 + ((ulong)((uint6)CONCAT14(bVar22,(uint)CONCAT12(bVar22,(ushort)(byte)
                                                  -(-0x41 < (char)((ulong)uVar8 >> 0x20)))) &
                                        0xffff0000ffff) & 0xffffff01);
              uVar17 = uVar17 + ((ulong)bVar22 & 0xffffff01);
              uVar18 = uVar18 + (-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
              uVar19 = uVar19 + (-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
              uVar20 = uVar20 + (-(-0x41 < (char)uVar8) & 1);
              uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
              if (pbVar12 != (byte *)0x10) {
                uVar8 = *(undefined8 *)(pbVar9 + 0x10);
                bVar22 = -(-0x41 < (char)((ulong)uVar8 >> 0x28));
                uVar11 = uVar11 + (-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1);
                uVar15 = uVar15 + (-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1);
                uVar16 = uVar16 + ((ulong)((uint6)CONCAT14(bVar22,(uint)CONCAT12(bVar22,(ushort)(
                                                  byte)-(-0x41 < (char)((ulong)uVar8 >> 0x20)))) &
                                          0xffff0000ffff) & 0xffffff01);
                uVar17 = uVar17 + ((ulong)bVar22 & 0xffffff01);
                uVar18 = uVar18 + (-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1);
                uVar19 = uVar19 + (-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1);
                uVar20 = uVar20 + (-(-0x41 < (char)uVar8) & 1);
                uVar21 = uVar21 + (-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1);
              }
            }
            uVar11 = uVar20 + uVar16 + uVar18 + uVar11 + uVar21 + uVar17 + uVar19 + uVar15;
            goto code_r0x00468ca4;
          }
          uVar11 = 0;
          pbVar12 = (byte *)0x0;
          do {
            if (-0x41 < (char)pbVar9[(long)pbVar12]) {
              uVar11 = uVar11 + 1;
            }
            pbVar12 = pbVar12 + 1;
code_r0x00468ca4:
          } while (pbVar10 != pbVar12);
        }
      }
      else {
        uVar11 = func_0x0046bd58(pbVar9,pbVar10);
      }
    }
    else {
      uVar11 = (ulong)*(ushort *)((long)param_1 + 0x16);
      if (uVar11 == 0) {
        pbVar10 = (byte *)0x0;
        uVar15 = 0;
      }
      else {
        pbVar12 = pbVar9 + (long)pbVar10;
        pbVar10 = (byte *)0x0;
        uVar15 = uVar11;
        pbVar13 = pbVar9;
        do {
          if (pbVar13 == pbVar12) break;
          bVar22 = *pbVar13;
          pbVar3 = pbVar13 + 3;
          if (0xef < bVar22) {
            pbVar3 = pbVar13 + 4;
          }
          pbVar2 = pbVar13 + 2;
          if (0xdf < bVar22) {
            pbVar2 = pbVar3;
          }
          pbVar3 = pbVar13 + 1;
          if (((int)(char)bVar22 & 0x80000000U) != 0) {
            pbVar3 = pbVar2;
          }
          pbVar10 = pbVar3 + ((long)pbVar10 - (long)pbVar13);
          uVar15 = uVar15 - 1;
          pbVar13 = pbVar3;
        } while (uVar15 != 0);
      }
      uVar11 = uVar11 - uVar15;
    }
    if (uVar11 < *(ushort *)((long)param_1 + 0x14)) {
      uVar6 = (uint)*(ushort *)((long)param_1 + 0x14) - (int)uVar11;
      uVar14 = uVar5 >> 0x1d & 3;
      uVar7 = uVar6 >> 1 & 0x7fff;
      if (uVar14 != 2) {
        uVar7 = 0;
      }
      uVar1 = 0;
      if (uVar14 != 0) {
        uVar1 = uVar6;
      }
      if (uVar14 < 2) {
        uVar7 = uVar1;
      }
      uVar14 = 0;
      uVar8 = *param_1;
      lVar4 = param_1[1];
      do {
        if ((uVar7 & 0xffff) <= (uVar14 & 0xffff)) {
          uVar11 = (**(code **)(lVar4 + 0x18))(uVar8,pbVar9,pbVar10);
          if ((uVar11 & 1) != 0) {
            return 1;
          }
          uVar14 = 0;
          do {
            if ((uVar6 - uVar7 & 0xffff) <= (uVar14 & 0xffff)) {
              return 0;
            }
            uVar14 = uVar14 + 1;
            uVar11 = (**(code **)(lVar4 + 0x20))(uVar8,uVar5 & 0x1fffff);
          } while ((uVar11 & 1) == 0);
          return 1;
        }
        uVar14 = uVar14 + 1;
        uVar11 = (**(code **)(lVar4 + 0x20))(uVar8,uVar5 & 0x1fffff);
      } while ((uVar11 & 1) == 0);
      return 1;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar8 = (**(code **)(param_1[1] + 0x18))(*param_1,pbVar9,pbVar10);
  return uVar8;
}

