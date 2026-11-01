
/* WARNING: Removing unreachable block (ram,0x00468bec) */
/* WARNING: Removing unreachable block (ram,0x00468c40) */
/* WARNING: Removing unreachable block (ram,0x00468aec) */
/* WARNING: Removing unreachable block (ram,0x00468af0) */
/* WARNING: Removing unreachable block (ram,0x00468ba0) */
/* WARNING: Removing unreachable block (ram,0x00468c90) */
/* WARNING: Removing unreachable block (ram,0x00468af8) */
/* WARNING: Removing unreachable block (ram,0x00468cac) */
/* WARNING: Removing unreachable block (ram,0x00468cb4) */
/* WARNING: Removing unreachable block (ram,0x00468ca4) */
/* WARNING: Removing unreachable block (ram,0x00468b98) */

undefined8 FUN_005314b0(long param_1,undefined8 param_2,undefined8 *param_3)

{
  byte *pbVar1;
  uint uVar2;
  byte *pbVar3;
  byte *pbVar4;
  long lVar5;
  uint uVar6;
  byte bVar7;
  uint uVar8;
  uint uVar9;
  ulong uVar10;
  undefined8 uVar11;
  byte *pbVar12;
  ulong uVar13;
  byte *pbVar14;
  uint uVar15;
  
  pbVar1 = (byte *)(param_1 + 0xe02);
  pbVar12 = (byte *)0x4c;
  uVar6 = *(uint *)(param_3 + 2);
  if ((uVar6 & 0x18000000) != 0) {
    if ((uVar6 >> 0x1c & 1) == 0) {
      uVar10 = func_0x0046bd58(pbVar1,0x4c);
    }
    else {
      uVar10 = (ulong)*(ushort *)((long)param_3 + 0x16);
      if (uVar10 == 0) {
        pbVar12 = (byte *)0x0;
        uVar13 = 0;
      }
      else {
        pbVar12 = (byte *)0x0;
        uVar13 = uVar10;
        pbVar14 = pbVar1;
        do {
          if (pbVar14 == (byte *)(param_1 + 0xe4e)) break;
          bVar7 = *pbVar14;
          pbVar4 = pbVar14 + 3;
          if (0xef < bVar7) {
            pbVar4 = pbVar14 + 4;
          }
          pbVar3 = pbVar14 + 2;
          if (0xdf < bVar7) {
            pbVar3 = pbVar4;
          }
          pbVar4 = pbVar14 + 1;
          if (((int)(char)bVar7 & 0x80000000U) != 0) {
            pbVar4 = pbVar3;
          }
          pbVar12 = pbVar4 + ((long)pbVar12 - (long)pbVar14);
          uVar13 = uVar13 - 1;
          pbVar14 = pbVar4;
        } while (uVar13 != 0);
      }
      uVar10 = uVar10 - uVar13;
    }
    if (uVar10 < *(ushort *)((long)param_3 + 0x14)) {
      uVar8 = (uint)*(ushort *)((long)param_3 + 0x14) - (int)uVar10;
      uVar15 = uVar6 >> 0x1d & 3;
      uVar9 = uVar8 >> 1 & 0x7fff;
      if (uVar15 != 2) {
        uVar9 = 0;
      }
      uVar2 = 0;
      if (uVar15 != 0) {
        uVar2 = uVar8;
      }
      if (uVar15 < 2) {
        uVar9 = uVar2;
      }
      uVar15 = 0;
      uVar11 = *param_3;
      lVar5 = param_3[1];
      do {
        if ((uVar9 & 0xffff) <= (uVar15 & 0xffff)) {
          uVar10 = (**(code **)(lVar5 + 0x18))(uVar11,pbVar1,pbVar12);
          if ((uVar10 & 1) != 0) {
            return 1;
          }
          uVar15 = 0;
          do {
            if ((uVar8 - uVar9 & 0xffff) <= (uVar15 & 0xffff)) {
              return 0;
            }
            uVar15 = uVar15 + 1;
            uVar10 = (**(code **)(lVar5 + 0x20))(uVar11,uVar6 & 0x1fffff);
          } while ((uVar10 & 1) == 0);
          return 1;
        }
        uVar15 = uVar15 + 1;
        uVar10 = (**(code **)(lVar5 + 0x20))(uVar11,uVar6 & 0x1fffff);
      } while ((uVar10 & 1) == 0);
      return 1;
    }
  }
                    /* WARNING: Could not recover jumptable at 0x00468d48. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  uVar11 = (**(code **)(param_3[1] + 0x18))(*param_3,pbVar1,pbVar12);
  return uVar11;
}

