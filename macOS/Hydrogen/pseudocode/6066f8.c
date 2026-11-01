
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_006066f8(void)

{
  uint uVar1;
  uint uVar2;
  undefined8 uVar3;
  int iVar4;
  undefined8 uVar5;
  undefined8 *puVar6;
  ulong uVar7;
  undefined8 *extraout_x8;
  ulong uVar8;
  uint uVar9;
  long lVar10;
  long lVar11;
  long lVar12;
  undefined1 auVar13 [16];
  undefined1 uStack0000000000000010;
  undefined1 auStack_50 [8];
  undefined8 uStack_48;
  undefined8 uStack_40;
  undefined8 *puStack_38;
  
  __Unwind_Resume();
  uVar5 = func_0x0001753c();
  func_0x005fde38(&uStack0000000000000010);
  auVar13 = __Unwind_Resume(uVar5);
  lVar10 = auVar13._8_8_;
  lVar11 = auVar13._0_8_;
  if (lVar11 != lVar10) {
    if (*(ulong *)(lVar11 + 0x18) < *(ulong *)(lVar10 + 0x18)) {
      func_0x00610e10(auStack_50,*(undefined8 *)(lVar10 + 0x20),*(ulong *)(lVar10 + 0x18));
      if (*(long *)(lVar11 + 0x18) != 0) {
        uVar8 = 0;
        lVar10 = *(long *)(lVar11 + 0x20);
        do {
          lVar12 = uVar8 * 8;
          *(ulong *)((long)puStack_38 + lVar12) =
               *(ulong *)((long)puStack_38 + lVar12) ^ *(ulong *)(lVar10 + lVar12);
          uVar8 = uVar8 + 1;
        } while (uVar8 < *(ulong *)(lVar11 + 0x18));
      }
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
      *extraout_x8 = &UNK_009f5d60;
      uVar3 = _UNK_008baa78;
      uVar5 = _UNK_008baa70;
      extraout_x8[3] = _UNK_008baa78;
      extraout_x8[2] = uVar5;
      puVar6 = (undefined8 *)func_0x006115d0(0x10);
      *(undefined4 *)(extraout_x8 + 5) = 0;
      *puVar6 = 0;
      puVar6[1] = 0;
      extraout_x8[3] = uStack_40;
      extraout_x8[2] = uStack_48;
      uStack_40 = uVar3;
      uStack_48 = uVar5;
      extraout_x8[4] = puStack_38;
      puVar6[1] = 0;
      *puVar6 = 0;
      puStack_38 = puVar6;
      puVar6 = (undefined8 *)func_0x00611644();
    }
    else {
      func_0x00610e10(auStack_50,*(undefined8 *)(lVar11 + 0x20));
      if (*(long *)(lVar10 + 0x18) != 0) {
        uVar8 = 0;
        lVar11 = *(long *)(lVar10 + 0x20);
        do {
          lVar12 = uVar8 * 8;
          *(ulong *)((long)puStack_38 + lVar12) =
               *(ulong *)((long)puStack_38 + lVar12) ^ *(ulong *)(lVar11 + lVar12);
          uVar8 = uVar8 + 1;
        } while (uVar8 < *(ulong *)(lVar10 + 0x18));
      }
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
      *extraout_x8 = &UNK_009f5d60;
      uVar3 = _UNK_008baa78;
      uVar5 = _UNK_008baa70;
      extraout_x8[3] = _UNK_008baa78;
      extraout_x8[2] = uVar5;
      puVar6 = (undefined8 *)func_0x006115d0(0x10);
      *(undefined4 *)(extraout_x8 + 5) = 0;
      *puVar6 = 0;
      puVar6[1] = 0;
      extraout_x8[3] = uStack_40;
      extraout_x8[2] = uStack_48;
      uStack_40 = uVar3;
      uStack_48 = uVar5;
      extraout_x8[4] = puStack_38;
      puVar6[1] = 0;
      *puVar6 = 0;
      puStack_38 = puVar6;
      puVar6 = (undefined8 *)func_0x00611644();
    }
    return puVar6;
  }
  if (((bRam0000000000a3c150 & 1) == 0) && (iVar4 = ___cxa_guard_acquire(0xa3c150), iVar4 != 0)) {
    func_0x005fe1e8(0xa3c168,0);
    ___cxa_atexit(&SUB_00087574,0xa3c168,0);
    ___cxa_guard_release(0xa3c150);
  }
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
  *extraout_x8 = &UNK_009f5d60;
  lVar11 = lRam0000000000a3c180;
  do {
    uVar8 = 0;
    if (lVar11 == 0) goto code_r0x005fdfa8;
    lVar12 = lVar11 + -1;
    lVar10 = lVar11 * 8;
    lVar11 = lVar12;
  } while (*(long *)(lRam0000000000a3c188 + -8 + lVar10) == 0);
  uVar9 = (int)lVar12 + 1;
  uVar8 = (ulong)uVar9;
  if (uVar9 < 9) {
code_r0x005fdfa8:
    uVar8 = (ulong)*(uint *)(&UNK_008babcc + uVar8 * 4);
  }
  else if (uVar8 < 0x11) {
    uVar8 = 0x10;
  }
  else if (uVar8 < 0x21) {
    uVar8 = 0x20;
  }
  else if (uVar8 < 0x41) {
    uVar8 = 0x40;
  }
  else {
    uVar9 = 0;
    uVar7 = 0x40;
    do {
      uVar2 = uVar9 + (uint)uVar7 >> 1;
      uVar1 = uVar2;
      if (uVar8 - 1 >> ((ulong)uVar2 & 0x3f) != 0) {
        uVar1 = (uint)uVar7;
        uVar9 = uVar2;
      }
      uVar7 = (ulong)uVar1;
    } while (1 < uVar1 - uVar9);
    uVar8 = 1L << (uVar7 & 0x3f);
  }
  extraout_x8[2] = 0x1fffffffffffffff;
  extraout_x8[3] = uVar8;
  func_0x006108a0(uVar8);
  if (uVar8 == 0) {
    lVar11 = 0;
    extraout_x8[4] = 0;
    *(undefined4 *)(extraout_x8 + 5) = uRam0000000000a3c190;
    if (lRam0000000000a3c188 == 0) {
      return extraout_x8;
    }
  }
  else {
    lVar11 = func_0x006115d0(uVar8 << 3);
    extraout_x8[4] = lVar11;
    *(undefined4 *)(extraout_x8 + 5) = uRam0000000000a3c190;
    if (lVar11 == lRam0000000000a3c188) {
      return extraout_x8;
    }
  }
  _memcpy(lVar11,lRam0000000000a3c188,extraout_x8[3] << 3);
  return extraout_x8;
}

