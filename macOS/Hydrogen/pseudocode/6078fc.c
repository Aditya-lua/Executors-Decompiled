
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_006078fc(long param_1)

{
  undefined8 *puVar1;
  ulong uVar2;
  bool bVar3;
  int iVar4;
  undefined8 *puVar5;
  long lVar6;
  long lVar7;
  ulong uVar8;
  ulong uVar9;
  ulong uVar10;
  long lVar11;
  ulong uVar12;
  ulong uVar13;
  ulong uVar14;
  long unaff_x19;
  ulong unaff_x20;
  long lVar15;
  ulong uVar16;
  ulong uVar17;
  undefined8 uVar18;
  undefined8 uVar19;
  undefined8 uVar20;
  undefined8 uVar21;
  undefined8 uVar22;
  undefined8 uVar23;
  undefined8 uVar24;
  
  lVar6 = *(long *)(param_1 + 0x20);
  lVar15 = lVar6 + -8;
  uVar9 = *(ulong *)(param_1 + 0x18);
  do {
    uVar10 = uVar9;
    if (uVar10 == 0) break;
    uVar9 = uVar10 - 1;
  } while (*(long *)(lVar15 + uVar10 * 8) == 0);
  uVar16 = uVar10 & 0xffffffff;
  uVar17 = unaff_x20 >> 6;
  uVar9 = uVar16;
  if (uVar17 <= uVar16) {
    uVar9 = uVar17;
  }
  if (uVar9 == 0) goto LAB_006079d0;
  if (uVar17 < uVar16) {
    uVar13 = uVar16 - uVar9;
    if (uVar13 < 8) {
      uVar8 = 0;
      uVar12 = uVar9;
    }
    else {
      uVar8 = uVar13 & 0xfffffffffffffff8;
      uVar12 = uVar9 + uVar8;
      uVar14 = uVar10 & 0xffffffff;
      uVar2 = uVar17;
      if (uVar14 <= uVar17) {
        uVar2 = uVar14;
      }
      uVar14 = uVar14 - uVar2 & 0xfffffffffffffff8;
      puVar5 = (undefined8 *)(lVar6 + 0x20);
      do {
        puVar1 = puVar5 + uVar2;
        uVar18 = puVar1[-4];
        uVar20 = puVar1[-1];
        uVar19 = puVar1[-2];
        uVar22 = puVar1[1];
        uVar21 = *puVar1;
        uVar24 = puVar1[3];
        uVar23 = puVar1[2];
        puVar5[-3] = puVar1[-3];
        puVar5[-4] = uVar18;
        puVar5[-1] = uVar20;
        puVar5[-2] = uVar19;
        puVar5[1] = uVar22;
        *puVar5 = uVar21;
        puVar5[3] = uVar24;
        puVar5[2] = uVar23;
        uVar14 = uVar14 - 8;
        puVar5 = puVar5 + 8;
      } while (uVar14 != 0);
      if (uVar13 == uVar8) goto LAB_006079c0;
    }
    uVar10 = uVar10 & 0xffffffff;
    uVar13 = uVar17;
    if (uVar10 <= uVar17) {
      uVar13 = uVar10;
    }
    lVar11 = (uVar8 + uVar13) - uVar10;
    puVar5 = (undefined8 *)(lVar6 + uVar8 * 8);
    do {
      *puVar5 = *(undefined8 *)(lVar6 + uVar12 * 8);
      uVar8 = uVar8 + 1;
      uVar12 = uVar8 + uVar9;
      bVar3 = lVar11 != -1;
      lVar11 = lVar11 + 1;
      puVar5 = puVar5 + 1;
    } while (bVar3);
  }
LAB_006079c0:
  _bzero(lVar6 + uVar16 * 8 + uVar9 * -8);
LAB_006079d0:
  lVar6 = uVar16 - uVar17;
  if (((uVar17 <= uVar16 && lVar6 != 0) && ((unaff_x20 & 0x3f) != 0)) && (lVar6 != 0)) {
    uVar9 = 0;
    do {
      uVar10 = *(ulong *)(lVar15 + lVar6 * 8);
      uVar16 = uVar10 >> (unaff_x20 & 0x3f) | uVar9;
      uVar9 = uVar10 << ((ulong)(0x40 - ((uint)unaff_x20 & 0x3f)) & 0x3f);
      *(ulong *)(lVar15 + lVar6 * 8) = uVar16;
      lVar6 = lVar6 + -1;
    } while (lVar6 != 0);
  }
  if (*(int *)(unaff_x19 + 0x28) == 1) {
    lVar6 = *(long *)(unaff_x19 + 0x18);
    do {
      if (lVar6 == 0) goto code_r0x00607a58;
      lVar7 = lVar6 + -1;
      lVar11 = lVar6 * 8;
      lVar6 = lVar7;
    } while (*(long *)(lVar15 + lVar11) == 0);
    if ((int)lVar7 == -1) {
code_r0x00607a58:
      if (((bRam0000000000a3c150 & 1) == 0) && (iVar4 = ___cxa_guard_acquire(0xa3c150), iVar4 != 0))
      {
        DataMemoryBarrier(2,3);
        if ((bRam0000000000a3c148 & 1) == 0) {
          puRam0000000000a2ab70 = &DAT_005f6230;
          puRam0000000000a2ab78 = &DAT_005f627c;
          puRam0000000000a2aa98 = &DAT_005f4e6c;
          puRam0000000000a2aaa0 = &DAT_005f4ed4;
          puRam0000000000a2aaa8 = &DAT_005f50a8;
          puRam0000000000a2ab28 = &DAT_005f5e0c;
          puRam0000000000a2ab30 = &DAT_005f5e38;
          puRam0000000000a2ab38 = &DAT_005f5eec;
          puRam0000000000a2aae0 = &DAT_005f57fc;
          puRam0000000000a2aae8 = &DAT_005f5844;
          puRam0000000000a2aaf0 = &DAT_005f5984;
          puRam0000000000a2ab80 = &DAT_005f63c0;
          puRam0000000000a2aab8 = &DAT_005f6838;
          puRam0000000000a2ab48 = &DAT_005f9574;
          puRam0000000000a2ab00 = &DAT_005f850c;
          puRam0000000000a2ab90 = &DAT_005fa300;
          bRam0000000000a3c148 = 1;
          DataMemoryBarrier(2,3);
        }
        puRam0000000000a3c168 = &UNK_009f5d60;
        uRam0000000000a3c180 = _UNK_008baa78;
        uRam0000000000a3c178 = _UNK_008baa70;
        puVar5 = (undefined8 *)func_0x006115d0(0x10);
        uRam0000000000a3c190 = 0;
        puRam0000000000a3c188 = puVar5;
        *puVar5 = 0;
        puVar5[1] = 0;
        ___cxa_atexit(&SUB_00087574,0xa3c168,0);
        ___cxa_guard_release(0xa3c150);
      }
      func_0x005ffccc();
      return;
    }
  }
  return;
}

