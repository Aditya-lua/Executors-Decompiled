
/* WARNING: Removing unreachable block (ram,0x00468bec) */
/* WARNING: Removing unreachable block (ram,0x00468c40) */
/* WARNING: Removing unreachable block (ram,0x00468b98) */
/* WARNING: Removing unreachable block (ram,0x00468af8) */
/* WARNING: Removing unreachable block (ram,0x00468b6c) */

undefined8 thunk_FUN_004526b0(undefined8 param_1,byte *param_2)

{
  uint uVar1;
  byte *pbVar2;
  byte *pbVar3;
  uint uVar4;
  byte bVar5;
  uint uVar6;
  uint uVar7;
  ulong uVar8;
  undefined8 uVar9;
  ulong uVar10;
  long lVar11;
  byte *pbVar12;
  undefined8 *unaff_x19;
  byte *pbVar13;
  uint uVar14;
  
  pbVar13 = (byte *)0xf;
  uVar4 = *(uint *)(unaff_x19 + 2);
  if ((uVar4 & 0x18000000) != 0) {
    if ((uVar4 >> 0x1c & 1) == 0) {
      uVar9 = *(undefined8 *)param_2;
      uVar8 = (ulong)(-(-0x41 < (char)uVar9) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x20)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x10)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x30)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 8)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x28)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x18)) & 1) +
              (ulong)(-(-0x41 < (char)((ulong)uVar9 >> 0x38)) & 1);
      for (lVar11 = 8; lVar11 != 0xf; lVar11 = lVar11 + 1) {
        if (-0x41 < (char)param_2[lVar11]) {
          uVar8 = uVar8 + 1;
        }
      }
    }
    else {
      uVar8 = (ulong)*(ushort *)((long)unaff_x19 + 0x16);
      if (uVar8 == 0) {
        pbVar13 = (byte *)0x0;
        uVar10 = 0;
      }
      else {
        pbVar13 = (byte *)0x0;
        uVar10 = uVar8;
        pbVar12 = param_2;
        do {
          if (pbVar12 == param_2 + 0xf) break;
          bVar5 = *pbVar12;
          pbVar3 = pbVar12 + 3;
          if (0xef < bVar5) {
            pbVar3 = pbVar12 + 4;
          }
          pbVar2 = pbVar12 + 2;
          if (0xdf < bVar5) {
            pbVar2 = pbVar3;
          }
          pbVar3 = pbVar12 + 1;
          if (((int)(char)bVar5 & 0x80000000U) != 0) {
            pbVar3 = pbVar2;
          }
          pbVar13 = pbVar3 + ((long)pbVar13 - (long)pbVar12);
          uVar10 = uVar10 - 1;
          pbVar12 = pbVar3;
        } while (uVar10 != 0);
      }
      uVar8 = uVar8 - uVar10;
    }
    if (uVar8 < *(ushort *)((long)unaff_x19 + 0x14)) {
      uVar6 = (uint)*(ushort *)((long)unaff_x19 + 0x14) - (int)uVar8;
      uVar14 = uVar4 >> 0x1d & 3;
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
      uVar9 = *unaff_x19;
      lVar11 = unaff_x19[1];
      do {
        if ((uVar7 & 0xffff) <= (uVar14 & 0xffff)) {
          uVar8 = (**(code **)(lVar11 + 0x18))(uVar9,param_2,pbVar13);
          if ((uVar8 & 1) != 0) {
            return 1;
          }
          uVar14 = 0;
          do {
            if ((uVar6 - uVar7 & 0xffff) <= (uVar14 & 0xffff)) {
              return 0;
            }
            uVar14 = uVar14 + 1;
            uVar8 = (**(code **)(lVar11 + 0x20))(uVar9,uVar4 & 0x1fffff);
          } while ((uVar8 & 1) == 0);
          return 1;
        }
        uVar14 = uVar14 + 1;
        uVar8 = (**(code **)(lVar11 + 0x20))(uVar9,uVar4 & 0x1fffff);
      } while ((uVar8 & 1) == 0);
      return 1;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar9 = (**(code **)(unaff_x19[1] + 0x18))(*unaff_x19,param_2,pbVar13);
  return uVar9;
}

