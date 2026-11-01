
/* WARNING: Removing unreachable block (ram,0x00468b98) */
/* WARNING: Removing unreachable block (ram,0x00468af8) */
/* WARNING: Removing unreachable block (ram,0x00468c40) */
/* WARNING: Removing unreachable block (ram,0x00468b6c) */

undefined8 thunk_FUN_0044ec88(undefined8 param_1,byte *param_2)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  uint uVar4;
  uint uVar5;
  uint uVar6;
  ulong uVar7;
  undefined8 uVar8;
  ulong uVar9;
  long lVar10;
  byte *pbVar11;
  undefined8 *unaff_x19;
  byte *pbVar12;
  uint uVar13;
  byte bVar14;
  undefined8 uVar15;
  
  pbVar12 = (byte *)0x14;
  uVar4 = *(uint *)(unaff_x19 + 2);
  if ((uVar4 & 0x18000000) != 0) {
    if ((uVar4 >> 0x1c & 1) == 0) {
      uVar8 = *(undefined8 *)param_2;
      uVar15 = *(undefined8 *)(param_2 + 8);
      bVar14 = -(-0x41 < (char)((ulong)uVar15 >> 0x28));
      uVar7 = (ulong)(-(-0x41 < (char)uVar8) & 1) + (ulong)(-(-0x41 < (char)uVar15) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x20)) & 1) +
              ((ulong)((uint6)CONCAT14(bVar14,(uint)CONCAT12(bVar14,(ushort)(byte)-(-0x41 < (char)((
                                                  ulong)uVar15 >> 0x20)))) & 0xffff0000ffff) &
              0xffffff01) +
              (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x10)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar15 >> 0x10)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x30)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar15 >> 0x30)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 8)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar15 >> 8)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x28)) & 1) + ((ulong)bVar14 & 0xffffff01) +
              (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x18)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar15 >> 0x18)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar8 >> 0x38)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar15 >> 0x38)) & 1);
      for (lVar10 = 0x10; lVar10 != 0x14; lVar10 = lVar10 + 1) {
        if (-0x41 < (char)param_2[lVar10]) {
          uVar7 = uVar7 + 1;
        }
      }
    }
    else {
      uVar7 = (ulong)*(ushort *)((long)unaff_x19 + 0x16);
      if (uVar7 == 0) {
        pbVar12 = (byte *)0x0;
        uVar9 = 0;
      }
      else {
        pbVar12 = (byte *)0x0;
        uVar9 = uVar7;
        pbVar11 = param_2;
        do {
          if (pbVar11 == param_2 + 0x14) break;
          bVar14 = *pbVar11;
          pbVar3 = pbVar11 + 3;
          if (0xef < bVar14) {
            pbVar3 = pbVar11 + 4;
          }
          pbVar2 = pbVar11 + 2;
          if (0xdf < bVar14) {
            pbVar2 = pbVar3;
          }
          pbVar3 = pbVar11 + 1;
          if (((int)(char)bVar14 & 0x80000000U) != 0) {
            pbVar3 = pbVar2;
          }
          pbVar12 = pbVar3 + ((long)pbVar12 - (long)pbVar11);
          uVar9 = uVar9 - 1;
          pbVar11 = pbVar3;
        } while (uVar9 != 0);
      }
      uVar7 = uVar7 - uVar9;
    }
    if (uVar7 < *(ushort *)((long)unaff_x19 + 0x14)) {
      uVar5 = (uint)*(ushort *)((long)unaff_x19 + 0x14) - (int)uVar7;
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
      uVar8 = *unaff_x19;
      lVar10 = unaff_x19[1];
      do {
        if ((uVar6 & 0xffff) <= (uVar13 & 0xffff)) {
          uVar7 = (**(code **)(lVar10 + 0x18))(uVar8,param_2,pbVar12);
          if ((uVar7 & 1) != 0) {
            return 1;
          }
          uVar13 = 0;
          do {
            if ((uVar5 - uVar6 & 0xffff) <= (uVar13 & 0xffff)) {
              return 0;
            }
            uVar13 = uVar13 + 1;
            uVar7 = (**(code **)(lVar10 + 0x20))(uVar8,uVar4 & 0x1fffff);
          } while ((uVar7 & 1) == 0);
          return 1;
        }
        uVar13 = uVar13 + 1;
        uVar7 = (**(code **)(lVar10 + 0x20))(uVar8,uVar4 & 0x1fffff);
      } while ((uVar7 & 1) == 0);
      return 1;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar8 = (**(code **)(unaff_x19[1] + 0x18))(*unaff_x19,param_2,pbVar12);
  return uVar8;
}

