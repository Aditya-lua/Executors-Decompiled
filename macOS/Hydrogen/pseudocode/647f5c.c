
undefined8 * FUN_00647f5c(void)

{
  uint uVar1;
  uint uVar2;
  long lVar3;
  long lVar4;
  long extraout_x1;
  ulong uVar5;
  ulong uVar6;
  undefined8 *extraout_x8;
  uint uVar7;
  long lVar8;
  undefined1 uStack0000000000000030;
  
  func_0x00087574(&uStack0000000000000030);
  __Unwind_Resume();
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
  lVar3 = *(long *)(extraout_x1 + 0x18);
  do {
    uVar5 = 0;
    if (lVar3 == 0) goto code_r0x005fdfa8;
    lVar8 = lVar3 + -1;
    lVar4 = lVar3 * 8;
    lVar3 = lVar8;
  } while (*(long *)(*(long *)(extraout_x1 + 0x20) + -8 + lVar4) == 0);
  uVar7 = (int)lVar8 + 1;
  uVar5 = (ulong)uVar7;
  if (uVar7 < 9) {
code_r0x005fdfa8:
    uVar5 = (ulong)*(uint *)(&UNK_008babcc + uVar5 * 4);
  }
  else if (uVar5 < 0x11) {
    uVar5 = 0x10;
  }
  else if (uVar5 < 0x21) {
    uVar5 = 0x20;
  }
  else if (uVar5 < 0x41) {
    uVar5 = 0x40;
  }
  else {
    uVar7 = 0;
    uVar6 = 0x40;
    do {
      uVar2 = uVar7 + (uint)uVar6 >> 1;
      uVar1 = uVar2;
      if (uVar5 - 1 >> ((ulong)uVar2 & 0x3f) != 0) {
        uVar1 = (uint)uVar6;
        uVar7 = uVar2;
      }
      uVar6 = (ulong)uVar1;
    } while (1 < uVar1 - uVar7);
    uVar5 = 1L << (uVar6 & 0x3f);
  }
  extraout_x8[2] = 0x1fffffffffffffff;
  extraout_x8[3] = uVar5;
  func_0x006108a0(uVar5);
  if (uVar5 == 0) {
    lVar3 = 0;
    extraout_x8[4] = 0;
    *(undefined4 *)(extraout_x8 + 5) = *(undefined4 *)(extraout_x1 + 0x28);
    lVar4 = *(long *)(extraout_x1 + 0x20);
    if (lVar4 == 0) {
      return extraout_x8;
    }
  }
  else {
    lVar3 = func_0x006115d0(uVar5 << 3);
    extraout_x8[4] = lVar3;
    *(undefined4 *)(extraout_x8 + 5) = *(undefined4 *)(extraout_x1 + 0x28);
    lVar4 = *(long *)(extraout_x1 + 0x20);
    if (lVar3 == lVar4) {
      return extraout_x8;
    }
  }
  _memcpy(lVar3,lVar4,extraout_x8[3] << 3);
  return extraout_x8;
}

